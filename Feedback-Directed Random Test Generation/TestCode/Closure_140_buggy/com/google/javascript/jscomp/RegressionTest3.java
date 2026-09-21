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
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.rhino.Node node23 = compiler1.jsRoot;
        com.google.javascript.rhino.Node node24 = compiler1.jsRoot;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getPropertyMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNull(variableMap5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = compiler1.getScopeCreator();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler14.toSource(node24);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler14.getCodingConvention();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler14.getOptions();
        compiler1.initOptions(compilerOptions27);
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scopeCreator11);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNotNull(errorManager29);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        boolean boolean4 = codeBuilder0.endsWith("hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder0.append("hi!");
        boolean boolean8 = codeBuilder6.endsWith("");
        boolean boolean10 = codeBuilder6.endsWith("hi!");
        java.lang.String str11 = codeBuilder6.toString();
        boolean boolean13 = codeBuilder6.endsWith("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(codeBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!" + "'", str11, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        java.lang.String[] strArray21 = compiler1.toSourceArray();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler1.getPassConfig();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler24.getSourceMap();
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler29.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = compiler29.getScopeCreator();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        compiler29.externsRoot = node37;
        compiler24.jsRoot = node37;
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = compiler41.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler41.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph45 = compiler41.getModuleGraph();
        com.google.javascript.rhino.Node node47 = compiler41.parseTestCode("");
        compiler24.externAndJsRoot = node47;
        java.lang.String str49 = compiler1.toSource(node47);
        com.google.javascript.jscomp.JSError[] jSErrorArray50 = compiler1.getWarnings();
        com.google.javascript.jscomp.Result result51 = compiler1.getResult();
        com.google.javascript.rhino.Node node53 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState54 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNull(scopeCreator31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(scopeCreator43);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(jSModuleGraph45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(jSErrorArray50);
        org.junit.Assert.assertArrayEquals(jSErrorArray50, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        com.google.javascript.rhino.Node node6 = compiler0.parseSyntheticCode("hi!", "hi!");
        compiler0.addToDebugLog("hi!");
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        boolean boolean4 = codeBuilder0.endsWith("hi!");
        codeBuilder0.reset();
        java.lang.String str6 = codeBuilder0.toString();
        boolean boolean8 = codeBuilder0.endsWith("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        java.lang.String str9 = codeBuilder0.toString();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        boolean boolean5 = compiler1.isNormalized();
        java.lang.String str8 = compiler1.getSourceLine("hi!", 0);
        java.lang.String str9 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.TypeValidator typeValidator10 = compiler1.getTypeValidator();
        com.google.javascript.rhino.Node node11 = compiler1.getRoot();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(typeValidator10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler1.parseTestCode("");
        java.lang.String str7 = compiler1.toSource();
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler1.getModuleGraph();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jSModuleGraph9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        boolean boolean2 = compiler1.isNormalized();
        com.google.javascript.rhino.Node node5 = compiler1.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler1.getReverseAbstractInterpreter();
        boolean boolean7 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getWarnings();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.options;
        com.google.javascript.rhino.Node node17 = compiler13.parseTestCode("");
        java.lang.String str18 = compiler10.toSource(node17);
        java.lang.String str19 = compiler10.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray21 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler23.options;
        com.google.javascript.jscomp.Result result29 = compiler10.compile(jSSourceFileArray20, jSModuleArray21, compilerOptions28);
        java.lang.String[] strArray30 = compiler10.toSourceArray();
        com.google.javascript.jscomp.PassConfig passConfig31 = compiler10.getPassConfig();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = null;
        compiler10.tracker = performanceTracker32;
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler35.options;
        com.google.javascript.rhino.Node node39 = compiler35.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput41 = compiler35.getInput("");
        int int42 = compiler35.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray43 = compiler35.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig44 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer46 = compiler35.newTracer("hi!");
        compiler10.stopTracer(tracer46, "hi!hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler10.options;
        compiler1.options = compilerOptions49;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray20, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray21);
        org.junit.Assert.assertArrayEquals(jSModuleArray21, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(passConfig31);
        org.junit.Assert.assertNull(compilerOptions37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(compilerInput41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray43);
        org.junit.Assert.assertArrayEquals(jSErrorArray43, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig44);
        org.junit.Assert.assertNotNull(tracer46);
        org.junit.Assert.assertNotNull(compilerOptions49);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.addToDebugLog("hi!hi!");
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(variableMap3);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        compiler1.startPass("hi!hi!");
        compiler1.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Tracer tracer13 = compiler1.newTracer("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        compiler1.initOptions(compilerOptions14);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = compiler1.getNodeForCodeInsertion(jSModule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(tracer13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        boolean boolean2 = compiler1.isNormalized();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        java.lang.String str15 = compiler4.toSource(node14);
        java.lang.String str16 = compiler1.toSource(node14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler1.createPassConfigInternal();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jSTypeRegistry17);
        org.junit.Assert.assertNotNull(passConfig18);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        com.google.javascript.rhino.Node node13 = compiler1.parseSyntheticCode("", "hi!hi!");
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler15.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        compiler15.options = compilerOptions18;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler20.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable23 = compiler20.acquireSymbolTable();
        compiler15.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        compiler27.reportCodeChange();
        com.google.javascript.jscomp.Scope scope29 = compiler27.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler27.getState();
        com.google.javascript.rhino.Node node31 = intermediateState30.externsRoot;
        com.google.javascript.rhino.Node node32 = intermediateState30.externsRoot;
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler34.getOptions();
        com.google.javascript.jscomp.Scope scope36 = compiler34.getTopScope();
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        compiler38.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.options;
        com.google.javascript.rhino.Node node42 = compiler38.parseTestCode("");
        compiler34.jsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = null;
        compiler34.tracker = performanceTracker44;
        java.io.PrintStream printStream46 = null;
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler(printStream46);
        compiler47.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler47.options;
        com.google.javascript.rhino.Node node51 = compiler47.parseTestCode("");
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        compiler53.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler53.options;
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("");
        java.lang.String str58 = compiler47.toSource(node57);
        com.google.javascript.jscomp.CodingConvention codingConvention59 = compiler47.getCodingConvention();
        com.google.javascript.rhino.Node node60 = compiler47.externAndJsRoot;
        com.google.javascript.rhino.Node node62 = compiler47.parseTestCode("hi!");
        java.lang.String str63 = compiler34.toSource(node62);
        intermediateState30.externsRoot = node62;
        compiler1.externAndJsRoot = node62;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(symbolTable23);
        org.junit.Assert.assertNull(scopeCreator26);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNull(compilerOptions40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(compilerOptions49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(compilerOptions55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(codingConvention59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("");
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        java.lang.String str27 = compiler16.toSource(node26);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler16.getCodingConvention();
        compiler16.addToDebugLog("hi!");
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler32.getOptions();
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler35.options;
        com.google.javascript.rhino.Node node39 = compiler35.parseTestCode("");
        java.lang.String str40 = compiler32.toSource(node39);
        java.lang.String str41 = compiler32.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray43 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        compiler45.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler45.options;
        com.google.javascript.rhino.Node node49 = compiler45.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler45.options;
        com.google.javascript.jscomp.Result result51 = compiler32.compile(jSSourceFileArray42, jSModuleArray43, compilerOptions50);
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = compiler32.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler32.getOptions();
        compiler16.options = compilerOptions53;
        compiler1.options = compilerOptions53;
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler1.getPropertyMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray57 = compiler1.getMessages();
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNull(compilerOptions37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray42, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray43);
        org.junit.Assert.assertArrayEquals(jSModuleArray43, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNull(scopeCreator52);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNull(variableMap56);
        org.junit.Assert.assertNotNull(jSErrorArray57);
        org.junit.Assert.assertArrayEquals(jSErrorArray57, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        java.lang.String str8 = compiler0.getSourceLine("", (int) (short) -1);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler10.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler16.getOptions();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        java.lang.String str24 = compiler16.toSource(node23);
        java.lang.String str25 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.rhino.Node node33 = compiler29.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler29.options;
        com.google.javascript.jscomp.Result result35 = compiler16.compile(jSSourceFileArray26, jSModuleArray27, compilerOptions34);
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler37.getOptions();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.options;
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("");
        java.lang.String str45 = compiler37.toSource(node44);
        java.lang.String str46 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler50.options;
        com.google.javascript.jscomp.Result result56 = compiler37.compile(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        compiler16.options = compilerOptions55;
        compiler10.options = compilerOptions55;
        compiler0.options = compilerOptions55;
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Region region63 = compiler0.getSourceRegion("", 0);
        java.io.PrintStream printStream64 = null;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler(printStream64);
        compiler65.setUnnormalized();
        com.google.javascript.jscomp.Scope scope67 = compiler65.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler65.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler65.getPropertyMap();
        java.io.PrintStream printStream70 = null;
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler(printStream70);
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler71.getOptions();
        java.io.PrintStream printStream73 = null;
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler(printStream73);
        compiler74.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler74.options;
        com.google.javascript.rhino.Node node78 = compiler74.parseTestCode("");
        java.lang.String str79 = compiler71.toSource(node78);
        com.google.javascript.rhino.Node node80 = null;
        compiler71.externAndJsRoot = node80;
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler71.getOptions();
        compiler65.initOptions(compilerOptions82);
        compiler0.initOptions(compilerOptions82);
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray27);
        org.junit.Assert.assertArrayEquals(jSModuleArray27, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(result35);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray47, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertArrayEquals(jSModuleArray48, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(result56);
        org.junit.Assert.assertNotNull(passConfig60);
        org.junit.Assert.assertNull(region63);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNull(compilerOptions68);
        org.junit.Assert.assertNull(variableMap69);
        org.junit.Assert.assertNull(compilerOptions72);
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(compilerOptions82);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler12.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler12.getState();
        com.google.javascript.rhino.Node node21 = compiler12.parseTestCode("hi!");
        boolean boolean22 = compiler12.isNormalized();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler12.getSourceMap();
        com.google.javascript.rhino.Node node26 = compiler12.parseSyntheticCode("hi!hi!", "");
        compiler1.prepareAst(node26);
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler29.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention32;
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(codingConvention32);
        org.junit.Assert.assertNull(sourceMap34);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler7.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler7.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler7.getState();
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.options;
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler13.getSourceMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = compiler18.getScopeCreator();
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        compiler18.externsRoot = node26;
        compiler13.jsRoot = node26;
        intermediateState11.externsRoot = node26;
        com.google.javascript.rhino.Node node30 = intermediateState11.externsRoot;
        java.lang.String str31 = compiler1.toSource(node30);
        boolean boolean32 = compiler1.hasErrors();
        com.google.javascript.rhino.Node node33 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap34 = compiler1.getFunctionalInformationMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator9);
        org.junit.Assert.assertNull(functionInformationMap10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scopeCreator20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(functionInformationMap34);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler13.defaultCodingConvention;
        com.google.javascript.jscomp.TypeValidator typeValidator15 = compiler13.getTypeValidator();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler13.getErrors();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(typeValidator15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        com.google.javascript.rhino.Node node14 = compiler1.externAndJsRoot;
        com.google.javascript.rhino.Node node16 = compiler1.parseTestCode("hi!");
        compiler1.addToDebugLog("hi!hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = codeBuilder19.append("");
        codeBuilder19.reset();
        int int23 = codeBuilder19.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = codeBuilder19.append("hi!");
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler28.getOptions();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        java.lang.String str36 = compiler28.toSource(node35);
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler28.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray38 = compiler28.getErrors();
        compiler28.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState40 = compiler28.getState();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        compiler42.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler42.options;
        com.google.javascript.jscomp.SourceMap sourceMap45 = compiler42.getSourceMap();
        com.google.javascript.rhino.Node node47 = compiler42.parseTestCode("");
        intermediateState40.externsRoot = node47;
        compiler1.toSource(codeBuilder19, (int) '#', node47);
        java.lang.String str52 = compiler1.getSourceLine("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(codeBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(codeBuilder25);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNotNull(jSErrorArray38);
        org.junit.Assert.assertArrayEquals(jSErrorArray38, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState40);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(sourceMap45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler5.getPassConfig();
        compiler1.setPassConfig(passConfig7);
        com.google.javascript.rhino.Node node9 = compiler1.jsRoot;
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.setUnnormalized();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler11.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention14;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = compiler1.parse(jSSourceFile16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNotNull(passConfig7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(codingConvention14);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        compiler1.initCompilerOptionsIfTesting();
        boolean boolean12 = compiler1.isInliningForbidden();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.getOptions();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.options;
        com.google.javascript.rhino.Node node21 = compiler17.parseTestCode("");
        java.lang.String str22 = compiler14.toSource(node21);
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler14.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler14.getErrors();
        compiler14.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler14.getState();
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        compiler28.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.options;
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler28.getSourceMap();
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("");
        intermediateState26.externsRoot = node33;
        compiler1.prepareAst(node33);
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler1.getPassConfig();
        compiler1.setNormalized();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap38 = null;
        compiler1.setCssRenamingMap(cssRenamingMap38);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNotNull(jSErrorArray24);
        org.junit.Assert.assertArrayEquals(jSErrorArray24, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(passConfig36);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler1.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler1.getFunctionalInformationMap();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler7.getScopeCreator();
        com.google.javascript.rhino.Node node10 = compiler7.jsRoot;
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph15 = compiler12.getModuleGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler12.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler1.setErrorManager(errorManager17);
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler1.tracker;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(functionInformationMap5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(jSModuleGraph15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertArrayEquals(jSErrorArray21, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(performanceTracker22);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        com.google.javascript.rhino.Node node10 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler12.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = compiler12.getScopeCreator();
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable16 = compiler12.acquireSymbolTable();
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable16);
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler19.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler19.getScopeCreator();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        compiler19.externsRoot = node27;
        compiler1.prepareAst(node27);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray31 = compiler1.getMessages();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler33.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = compiler33.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap36 = compiler33.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope37 = compiler33.getTopScope();
        boolean boolean38 = compiler33.precheck();
        com.google.javascript.jscomp.SymbolTable symbolTable39 = compiler33.acquireSymbolTable();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        java.lang.String str49 = compiler41.toSource(node48);
        java.io.PrintStream printStream50 = null;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler(printStream50);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler51.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = compiler51.getScopeCreator();
        com.google.javascript.jscomp.SymbolTable symbolTable54 = compiler51.acquireSymbolTable();
        compiler41.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable54);
        compiler33.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable54);
        com.google.javascript.jscomp.PassConfig passConfig57 = compiler33.getPassConfig();
        com.google.javascript.rhino.Node node58 = compiler33.jsRoot;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker59 = null;
        compiler33.tracker = performanceTracker59;
        com.google.javascript.rhino.Node node62 = compiler33.parseTestCode("hi!");
        com.google.javascript.rhino.Node node65 = compiler33.parseSyntheticCode("hi!", "hi!");
        java.io.PrintStream printStream66 = null;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(printStream66);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler67.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator69 = compiler67.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap70 = compiler67.getFunctionalInformationMap();
        boolean boolean71 = compiler67.isNormalized();
        com.google.javascript.rhino.Node node74 = compiler67.parseSyntheticCode("", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        boolean boolean75 = compiler1.areNodesEqualForInlining(node65, node74);
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNull(scopeCreator14);
        org.junit.Assert.assertNotNull(symbolTable16);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNotNull(jSErrorArray31);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNull(scopeCreator35);
        org.junit.Assert.assertNull(functionInformationMap36);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(symbolTable39);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNull(scopeCreator53);
        org.junit.Assert.assertNotNull(symbolTable54);
        org.junit.Assert.assertNotNull(passConfig57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(compilerOptions68);
        org.junit.Assert.assertNull(scopeCreator69);
        org.junit.Assert.assertNull(functionInformationMap70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler7.getSourceMap();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler12.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = compiler12.getScopeCreator();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("");
        compiler12.externsRoot = node20;
        compiler7.jsRoot = node20;
        java.lang.String str23 = compiler1.toSource(node20);
        compiler1.startPass("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNull(scopeCreator14);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        compiler1.initCompilerOptionsIfTesting();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler9.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = compiler9.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap12 = compiler9.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope13 = compiler9.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        compiler9.options = compilerOptions14;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler16.defaultCodingConvention;
        boolean boolean19 = compiler16.precheck();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler20.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable23 = compiler20.acquireSymbolTable();
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler9.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler1.setUnnormalized();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(scopeCreator11);
        org.junit.Assert.assertNull(functionInformationMap12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(symbolTable23);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler5.getPassConfig();
        compiler1.setPassConfig(passConfig7);
        compiler1.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNotNull(passConfig7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node7 = compiler1.parseTestCode("hi!hi!");
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler12.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention14;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap16 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler1.tracker;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(functionInformationMap16);
        org.junit.Assert.assertNull(performanceTracker17);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
        com.google.javascript.rhino.Node node12 = compiler1.externAndJsRoot;
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.getOptions();
        com.google.javascript.jscomp.Scope scope16 = compiler14.getTopScope();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        compiler14.jsRoot = node22;
        compiler14.initCompilerOptionsIfTesting();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler26.options;
        com.google.javascript.rhino.Node node30 = compiler26.parseTestCode("");
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler32.options;
        com.google.javascript.rhino.Node node36 = compiler32.parseTestCode("");
        java.lang.String str37 = compiler26.toSource(node36);
        com.google.javascript.jscomp.CodingConvention codingConvention38 = compiler26.getCodingConvention();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder39 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder41 = codeBuilder39.append("");
        java.lang.String str42 = codeBuilder39.toString();
        codeBuilder39.reset();
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler46.getOptions();
        java.io.PrintStream printStream48 = null;
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler(printStream48);
        compiler49.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.options;
        com.google.javascript.rhino.Node node53 = compiler49.parseTestCode("");
        java.lang.String str54 = compiler46.toSource(node53);
        com.google.javascript.rhino.Node node55 = null;
        compiler46.externAndJsRoot = node55;
        java.io.PrintStream printStream57 = null;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler(printStream57);
        compiler58.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = compiler58.options;
        com.google.javascript.jscomp.SourceMap sourceMap61 = compiler58.getSourceMap();
        java.io.PrintStream printStream62 = null;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler(printStream62);
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = compiler63.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator65 = compiler63.getScopeCreator();
        java.io.PrintStream printStream66 = null;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(printStream66);
        compiler67.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions69 = compiler67.options;
        com.google.javascript.rhino.Node node71 = compiler67.parseTestCode("");
        compiler63.externsRoot = node71;
        compiler58.jsRoot = node71;
        compiler46.jsRoot = node71;
        compiler26.toSource(codeBuilder39, (int) (byte) 100, node71);
        java.io.PrintStream printStream77 = null;
        com.google.javascript.jscomp.Compiler compiler78 = new com.google.javascript.jscomp.Compiler(printStream77);
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler78.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator80 = compiler78.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = compiler78.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph82 = compiler78.getModuleGraph();
        com.google.javascript.rhino.Node node84 = compiler78.parseTestCode("");
        compiler14.toSource(codeBuilder39, (int) (short) 10, node84);
        java.lang.String str86 = compiler1.toSource(node84);
        com.google.javascript.jscomp.VariableMap variableMap87 = compiler1.getPropertyMap();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap88 = null;
        compiler1.setCssRenamingMap(cssRenamingMap88);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(compilerOptions28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(codingConvention38);
        org.junit.Assert.assertNotNull(codeBuilder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNull(compilerOptions51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(compilerOptions60);
        org.junit.Assert.assertNull(sourceMap61);
        org.junit.Assert.assertNull(compilerOptions64);
        org.junit.Assert.assertNull(scopeCreator65);
        org.junit.Assert.assertNull(compilerOptions69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNull(compilerOptions79);
        org.junit.Assert.assertNull(scopeCreator80);
        org.junit.Assert.assertNull(compilerOptions81);
        org.junit.Assert.assertNull(jSModuleGraph82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNull(variableMap87);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        compiler0.setNormalized();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap9 = compiler6.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler6.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler6.options;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler12.getState();
        compiler6.setState(intermediateState15);
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph21 = compiler18.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig24 = compiler22.getPassConfig();
        compiler18.setPassConfig(passConfig24);
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        compiler27.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.options;
        com.google.javascript.rhino.Node node31 = compiler27.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler27.getVariableMap();
        compiler27.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler27.getOptions();
        compiler18.options = compilerOptions34;
        compiler6.options = compilerOptions34;
        com.google.javascript.jscomp.SymbolTable symbolTable37 = compiler6.acquireSymbolTable();
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable37);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker40 = null;
        compiler0.tracker = performanceTracker40;
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(functionInformationMap9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNull(jSModuleGraph21);
        org.junit.Assert.assertNotNull(passConfig24);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(symbolTable37);
        org.junit.Assert.assertNull(performanceTracker39);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler1.tracker;
        com.google.javascript.jscomp.Tracer tracer25 = compiler1.newTracer("");
        java.lang.String[] strArray26 = compiler1.toSourceArray();
        com.google.javascript.jscomp.Tracer tracer28 = compiler1.newTracer("");
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.options;
        com.google.javascript.rhino.Node node38 = compiler34.parseTestCode("");
        compiler30.externsRoot = node38;
        compiler1.prepareAst(node38);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(tracer25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(tracer28);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(compilerOptions36);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("");
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        java.lang.String str27 = compiler16.toSource(node26);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler16.getCodingConvention();
        compiler16.addToDebugLog("hi!");
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler32.getOptions();
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler35.options;
        com.google.javascript.rhino.Node node39 = compiler35.parseTestCode("");
        java.lang.String str40 = compiler32.toSource(node39);
        java.lang.String str41 = compiler32.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray43 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        compiler45.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler45.options;
        com.google.javascript.rhino.Node node49 = compiler45.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler45.options;
        com.google.javascript.jscomp.Result result51 = compiler32.compile(jSSourceFileArray42, jSModuleArray43, compilerOptions50);
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = compiler32.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler32.getOptions();
        compiler16.options = compilerOptions53;
        compiler1.options = compilerOptions53;
        com.google.javascript.rhino.Node node56 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler1.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler1.getOptions();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker59 = null;
        compiler1.tracker = performanceTracker59;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNull(compilerOptions37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray42, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray43);
        org.junit.Assert.assertArrayEquals(jSModuleArray43, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNull(scopeCreator52);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(compilerOptions57);
        org.junit.Assert.assertNotNull(compilerOptions58);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getMessages();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = compiler18.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler18.getOptions();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler23.options;
        compiler18.options = compilerOptions28;
        compiler15.initOptions(compilerOptions28);
        compiler15.resetUniqueNameId();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler33.getOptions();
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        compiler36.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler36.options;
        com.google.javascript.rhino.Node node40 = compiler36.parseTestCode("");
        java.lang.String str41 = compiler33.toSource(node40);
        java.lang.String str42 = compiler33.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        compiler46.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler46.options;
        com.google.javascript.rhino.Node node50 = compiler46.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler46.options;
        com.google.javascript.jscomp.Result result52 = compiler33.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions51);
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = compiler33.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler33.getOptions();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange55 = compiler33.recentChange;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState56 = compiler33.getState();
        compiler15.setState(intermediateState56);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scopeCreator20);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray43);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray43, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray44);
        org.junit.Assert.assertArrayEquals(jSModuleArray44, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(result52);
        org.junit.Assert.assertNull(scopeCreator53);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNotNull(recentChange55);
        org.junit.Assert.assertNotNull(intermediateState56);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler14.getErrors();
        boolean boolean16 = compiler14.precheck();
        java.lang.String str17 = compiler14.getAstDotGraph();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertArrayEquals(jSErrorArray15, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler1.options;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap14 = compiler1.getFunctionalInformationMap();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        boolean boolean17 = compiler16.isNormalized();
        com.google.javascript.rhino.Node node20 = compiler16.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter21 = compiler16.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler16.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler25.getOptions();
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        compiler28.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.options;
        com.google.javascript.rhino.Node node32 = compiler28.parseTestCode("");
        java.lang.String str33 = compiler25.toSource(node32);
        java.lang.String str34 = compiler25.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray36 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        compiler38.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.options;
        com.google.javascript.rhino.Node node42 = compiler38.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler38.options;
        com.google.javascript.jscomp.Result result44 = compiler25.compile(jSSourceFileArray35, jSModuleArray36, compilerOptions43);
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        compiler46.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler46.options;
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler46.getSourceMap();
        java.io.PrintStream printStream50 = null;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler(printStream50);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler51.getOptions();
        java.io.PrintStream printStream53 = null;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler(printStream53);
        compiler54.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler54.options;
        com.google.javascript.rhino.Node node58 = compiler54.parseTestCode("");
        java.lang.String str59 = compiler51.toSource(node58);
        com.google.javascript.jscomp.ScopeCreator scopeCreator60 = compiler51.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler51.getOptions();
        compiler46.options = compilerOptions61;
        compiler16.init(jSSourceFileArray23, jSModuleArray36, compilerOptions61);
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        compiler64.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig66 = compiler64.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention67 = compiler64.defaultCodingConvention;
        java.io.PrintStream printStream68 = null;
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler(printStream68);
        com.google.javascript.jscomp.CompilerOptions compilerOptions70 = compiler69.getOptions();
        java.io.PrintStream printStream71 = null;
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler(printStream71);
        compiler72.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = compiler72.options;
        com.google.javascript.rhino.Node node76 = compiler72.parseTestCode("");
        java.lang.String str77 = compiler69.toSource(node76);
        java.lang.String str78 = compiler69.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray79 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray80 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream81 = null;
        com.google.javascript.jscomp.Compiler compiler82 = new com.google.javascript.jscomp.Compiler(printStream81);
        compiler82.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = compiler82.options;
        com.google.javascript.rhino.Node node86 = compiler82.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions87 = compiler82.options;
        com.google.javascript.jscomp.Result result88 = compiler69.compile(jSSourceFileArray79, jSModuleArray80, compilerOptions87);
        com.google.javascript.jscomp.JSModule[] jSModuleArray89 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream90 = null;
        com.google.javascript.jscomp.Compiler compiler91 = new com.google.javascript.jscomp.Compiler(printStream90);
        compiler91.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions93 = compiler91.options;
        com.google.javascript.rhino.Node node95 = compiler91.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions96 = compiler91.options;
        compiler64.init(jSSourceFileArray79, jSModuleArray89, compilerOptions96);
        com.google.javascript.jscomp.CompilerOptions compilerOptions98 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray23, jSModuleArray89, compilerOptions98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNull(functionInformationMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter21);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray23, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray35);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray35, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray36);
        org.junit.Assert.assertArrayEquals(jSModuleArray36, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(compilerOptions43);
        org.junit.Assert.assertNotNull(result44);
        org.junit.Assert.assertNull(compilerOptions48);
        org.junit.Assert.assertNull(sourceMap49);
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNull(compilerOptions56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(scopeCreator60);
        org.junit.Assert.assertNotNull(compilerOptions61);
        org.junit.Assert.assertNotNull(passConfig66);
        org.junit.Assert.assertNotNull(codingConvention67);
        org.junit.Assert.assertNull(compilerOptions70);
        org.junit.Assert.assertNull(compilerOptions74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray79);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray79, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray80);
        org.junit.Assert.assertArrayEquals(jSModuleArray80, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions84);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(compilerOptions87);
        org.junit.Assert.assertNotNull(result88);
        org.junit.Assert.assertNotNull(jSModuleArray89);
        org.junit.Assert.assertArrayEquals(jSModuleArray89, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions93);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(compilerOptions96);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        java.lang.String[] strArray21 = compiler1.toSourceArray();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler1.getPassConfig();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler24.getSourceMap();
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler29.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = compiler29.getScopeCreator();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        compiler29.externsRoot = node37;
        compiler24.jsRoot = node37;
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = compiler41.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler41.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph45 = compiler41.getModuleGraph();
        com.google.javascript.rhino.Node node47 = compiler41.parseTestCode("");
        compiler24.externAndJsRoot = node47;
        java.lang.String str49 = compiler1.toSource(node47);
        com.google.javascript.jscomp.JSError[] jSErrorArray50 = compiler1.getWarnings();
        com.google.javascript.jscomp.Result result51 = compiler1.getResult();
        com.google.javascript.rhino.Node node53 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap54 = compiler1.getPropertyMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNull(scopeCreator31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(scopeCreator43);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(jSModuleGraph45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(jSErrorArray50);
        org.junit.Assert.assertArrayEquals(jSErrorArray50, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(variableMap54);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        java.lang.String str15 = compiler4.toSource(node14);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler4.getCodingConvention();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler4.getOptions();
        compiler1.initOptions(compilerOptions17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = compiler1.parseSyntheticCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(compilerOptions17);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler12.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention14;
        com.google.javascript.rhino.Node node16 = compiler1.externsRoot;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler1.tracker = performanceTracker17;
        compiler1.disableThreads();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        java.lang.String str8 = compiler0.getSourceLine("", (int) (short) -1);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler10.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler16.getOptions();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        java.lang.String str24 = compiler16.toSource(node23);
        java.lang.String str25 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.rhino.Node node33 = compiler29.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler29.options;
        com.google.javascript.jscomp.Result result35 = compiler16.compile(jSSourceFileArray26, jSModuleArray27, compilerOptions34);
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler37.getOptions();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.options;
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("");
        java.lang.String str45 = compiler37.toSource(node44);
        java.lang.String str46 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler50.options;
        com.google.javascript.jscomp.Result result56 = compiler37.compile(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        compiler16.options = compilerOptions55;
        compiler10.options = compilerOptions55;
        compiler0.options = compilerOptions55;
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Region region63 = compiler0.getSourceRegion("", 0);
        java.io.PrintStream printStream64 = null;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler(printStream64);
        compiler65.setUnnormalized();
        com.google.javascript.jscomp.Scope scope67 = compiler65.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler65.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler65.getPropertyMap();
        java.io.PrintStream printStream70 = null;
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler(printStream70);
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler71.getOptions();
        java.io.PrintStream printStream73 = null;
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler(printStream73);
        compiler74.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler74.options;
        com.google.javascript.rhino.Node node78 = compiler74.parseTestCode("");
        java.lang.String str79 = compiler71.toSource(node78);
        com.google.javascript.rhino.Node node80 = null;
        compiler71.externAndJsRoot = node80;
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler71.getOptions();
        compiler65.initOptions(compilerOptions82);
        compiler0.initOptions(compilerOptions82);
        com.google.javascript.jscomp.ScopeCreator scopeCreator85 = compiler0.getScopeCreator();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap86 = null;
        compiler0.setCssRenamingMap(cssRenamingMap86);
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray27);
        org.junit.Assert.assertArrayEquals(jSModuleArray27, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(result35);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray47, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertArrayEquals(jSModuleArray48, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(result56);
        org.junit.Assert.assertNotNull(passConfig60);
        org.junit.Assert.assertNull(region63);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNull(compilerOptions68);
        org.junit.Assert.assertNull(variableMap69);
        org.junit.Assert.assertNull(compilerOptions72);
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(compilerOptions82);
        org.junit.Assert.assertNull(scopeCreator85);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.parsing.Config config7 = compiler1.getParserConfig();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = null;
        compiler1.setCssRenamingMap(cssRenamingMap8);
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(config7);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        boolean boolean5 = compiler1.isNormalized();
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.acquireSymbolTable();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(symbolTable7);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getPropertyMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.options;
        com.google.javascript.rhino.Node node12 = compiler8.parseTestCode("");
        compiler0.externAndJsRoot = node12;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region16 = compiler0.getSourceRegion("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(jSModuleGraph5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler15.createPassConfigInternal();
        boolean boolean17 = compiler15.precheck();
        com.google.javascript.jscomp.SymbolTable symbolTable18 = compiler15.acquireSymbolTable();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph23 = compiler20.getModuleGraph();
        com.google.javascript.jscomp.Scope scope24 = compiler20.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler20.getErrorManager();
        compiler20.setUnnormalized();
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler28.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = compiler28.getScopeCreator();
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler32.options;
        com.google.javascript.rhino.Node node36 = compiler32.parseTestCode("");
        compiler28.externsRoot = node36;
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        compiler39.setUnnormalized();
        com.google.javascript.jscomp.Scope scope41 = compiler39.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler39.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap43 = compiler39.getFunctionalInformationMap();
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler45.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator47 = compiler45.getScopeCreator();
        com.google.javascript.rhino.Node node48 = compiler45.jsRoot;
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph53 = compiler50.getModuleGraph();
        com.google.javascript.jscomp.Scope scope54 = compiler50.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler50.getErrorManager();
        compiler45.setErrorManager(errorManager55);
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler(errorManager55);
        compiler39.setErrorManager(errorManager55);
        compiler28.setErrorManager(errorManager55);
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler(errorManager55);
        compiler20.setErrorManager(errorManager55);
        compiler15.setErrorManager(errorManager55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = compiler15.getSourceLine("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(passConfig16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(symbolTable18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNull(jSModuleGraph23);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(scopeCreator30);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNotNull(recentChange42);
        org.junit.Assert.assertNull(functionInformationMap43);
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNull(scopeCreator47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNull(jSModuleGraph53);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNotNull(errorManager55);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler1.toSourceArray(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(jSModuleGraph8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler1.getOptions();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(compilerOptions5);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        compiler1.jsRoot = node14;
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        compiler18.jsRoot = node26;
        compiler1.externAndJsRoot = node26;
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap33 = compiler30.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope34 = compiler30.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        compiler30.options = compilerOptions35;
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler38.getOptions();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        compiler41.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.options;
        com.google.javascript.rhino.Node node45 = compiler41.parseTestCode("");
        java.lang.String str46 = compiler38.toSource(node45);
        java.lang.String str47 = compiler38.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray48 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray49 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream50 = null;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler(printStream50);
        compiler51.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.options;
        com.google.javascript.rhino.Node node55 = compiler51.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler51.options;
        com.google.javascript.jscomp.Result result57 = compiler38.compile(jSSourceFileArray48, jSModuleArray49, compilerOptions56);
        compiler30.options = compilerOptions56;
        compiler1.options = compilerOptions56;
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler61.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator63 = compiler61.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap64 = compiler61.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState65 = compiler61.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = compiler61.options;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        compiler67.reportCodeChange();
        com.google.javascript.jscomp.Scope scope69 = compiler67.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState70 = compiler67.getState();
        compiler61.setState(intermediateState70);
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        compiler72.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention74 = compiler72.defaultCodingConvention;
        compiler61.defaultCodingConvention = codingConvention74;
        com.google.javascript.jscomp.ErrorManager errorManager76 = compiler61.getErrorManager();
        compiler1.setErrorManager(errorManager76);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Result result79 = compiler1.getResult();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(functionInformationMap33);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNull(compilerOptions43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray48);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray48, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray49);
        org.junit.Assert.assertArrayEquals(jSModuleArray49, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNotNull(result57);
        org.junit.Assert.assertNull(compilerOptions62);
        org.junit.Assert.assertNull(scopeCreator63);
        org.junit.Assert.assertNull(functionInformationMap64);
        org.junit.Assert.assertNotNull(intermediateState65);
        org.junit.Assert.assertNull(compilerOptions66);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNotNull(intermediateState70);
        org.junit.Assert.assertNotNull(codingConvention74);
        org.junit.Assert.assertNotNull(errorManager76);
        org.junit.Assert.assertNotNull(result79);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        compiler1.jsRoot = node14;
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = compiler18.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler18.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph22 = compiler18.getModuleGraph();
        com.google.javascript.rhino.Node node24 = compiler18.parseTestCode("");
        compiler1.externAndJsRoot = node24;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = compiler1.parseSyntheticCode("hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scopeCreator20);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNull(jSModuleGraph22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        java.lang.String str8 = compiler0.getSourceLine("", (int) (short) -1);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler10.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler16.getOptions();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        java.lang.String str24 = compiler16.toSource(node23);
        java.lang.String str25 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.rhino.Node node33 = compiler29.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler29.options;
        com.google.javascript.jscomp.Result result35 = compiler16.compile(jSSourceFileArray26, jSModuleArray27, compilerOptions34);
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler37.getOptions();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.options;
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("");
        java.lang.String str45 = compiler37.toSource(node44);
        java.lang.String str46 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler50.options;
        com.google.javascript.jscomp.Result result56 = compiler37.compile(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        compiler16.options = compilerOptions55;
        compiler10.options = compilerOptions55;
        compiler0.options = compilerOptions55;
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Region region63 = compiler0.getSourceRegion("", 0);
        java.io.PrintStream printStream64 = null;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler(printStream64);
        compiler65.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler65.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph68 = compiler65.getModuleGraph();
        com.google.javascript.jscomp.Scope scope69 = compiler65.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager70 = compiler65.getErrorManager();
        compiler0.setErrorManager(errorManager70);
        boolean boolean72 = compiler0.isTypeCheckingEnabled();
        boolean boolean73 = compiler0.isNormalized();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap74 = compiler0.getCssRenamingMap();
        com.google.javascript.rhino.Node node75 = compiler0.externsRoot;
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray27);
        org.junit.Assert.assertArrayEquals(jSModuleArray27, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(result35);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray47, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertArrayEquals(jSModuleArray48, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(result56);
        org.junit.Assert.assertNotNull(passConfig60);
        org.junit.Assert.assertNull(region63);
        org.junit.Assert.assertNull(compilerOptions67);
        org.junit.Assert.assertNull(jSModuleGraph68);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNotNull(errorManager70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(cssRenamingMap74);
        org.junit.Assert.assertNull(node75);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter6 = compiler0.getDefaultErrorReporter();
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
        org.junit.Assert.assertNotNull(errorReporter6);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        int int2 = codeBuilder0.getLineIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = codeBuilder0.append("hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder4.append("hi!");
        java.lang.String str7 = codeBuilder6.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(codeBuilder4);
        org.junit.Assert.assertNotNull(codeBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        compiler1.jsRoot = node14;
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        compiler18.jsRoot = node26;
        compiler1.externAndJsRoot = node26;
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap33 = compiler30.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope34 = compiler30.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        compiler30.options = compilerOptions35;
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler38.getOptions();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        compiler41.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.options;
        com.google.javascript.rhino.Node node45 = compiler41.parseTestCode("");
        java.lang.String str46 = compiler38.toSource(node45);
        java.lang.String str47 = compiler38.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray48 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray49 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream50 = null;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler(printStream50);
        compiler51.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.options;
        com.google.javascript.rhino.Node node55 = compiler51.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler51.options;
        com.google.javascript.jscomp.Result result57 = compiler38.compile(jSSourceFileArray48, jSModuleArray49, compilerOptions56);
        compiler30.options = compilerOptions56;
        compiler1.options = compilerOptions56;
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        compiler61.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.options;
        com.google.javascript.rhino.Node node65 = compiler61.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput67 = compiler61.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState68 = compiler61.getState();
        com.google.javascript.rhino.Node node70 = compiler61.parseTestCode("hi!");
        java.io.PrintStream printStream71 = null;
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler(printStream71);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler72.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator74 = compiler72.getScopeCreator();
        compiler72.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable76 = compiler72.acquireSymbolTable();
        compiler61.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable76);
        java.io.PrintStream printStream78 = null;
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler(printStream78);
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = compiler79.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = compiler79.getScopeCreator();
        java.io.PrintStream printStream82 = null;
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler(printStream82);
        compiler83.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler83.options;
        com.google.javascript.rhino.Node node87 = compiler83.parseTestCode("");
        compiler79.externsRoot = node87;
        compiler61.prepareAst(node87);
        java.lang.String str90 = compiler1.toSource(node87);
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph91 = compiler1.computeCFG();
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.parsing.Config config94 = compiler1.getParserConfig();
        compiler1.recordFunctionInformation();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(functionInformationMap33);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNull(compilerOptions43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray48);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray48, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray49);
        org.junit.Assert.assertArrayEquals(jSModuleArray49, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNotNull(result57);
        org.junit.Assert.assertNull(compilerOptions63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(compilerInput67);
        org.junit.Assert.assertNotNull(intermediateState68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(compilerOptions73);
        org.junit.Assert.assertNull(scopeCreator74);
        org.junit.Assert.assertNotNull(symbolTable76);
        org.junit.Assert.assertNull(compilerOptions80);
        org.junit.Assert.assertNull(scopeCreator81);
        org.junit.Assert.assertNull(compilerOptions85);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraph91);
        org.junit.Assert.assertNotNull(config94);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.TypeValidator typeValidator4 = compiler1.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler1.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler1.getState();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler1.getTypeRegistry();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(typeValidator4);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(jSTypeRegistry8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler14.toSource(node24);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler14.getCodingConvention();
        compiler14.addToDebugLog("hi!");
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        java.lang.String str38 = compiler30.toSource(node37);
        java.lang.String str39 = compiler30.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler43.options;
        com.google.javascript.jscomp.Result result49 = compiler30.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions48);
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = compiler30.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler30.getOptions();
        compiler14.options = compilerOptions51;
        com.google.javascript.jscomp.JSError[] jSErrorArray53 = compiler14.getWarnings();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange54 = compiler14.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange54);
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter56 = compiler1.getDefaultErrorReporter();
        java.io.PrintStream printStream57 = null;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler(printStream57);
        compiler58.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = compiler58.options;
        com.google.javascript.rhino.Node node62 = compiler58.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput64 = compiler58.getInput("");
        com.google.javascript.rhino.Node node65 = compiler58.externsRoot;
        compiler58.startPass("hi!hi!");
        compiler58.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Tracer tracer70 = compiler58.newTracer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler1.stopTracer(tracer70, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(compilerOptions48);
        org.junit.Assert.assertNotNull(result49);
        org.junit.Assert.assertNull(scopeCreator50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(jSErrorArray53);
        org.junit.Assert.assertArrayEquals(jSErrorArray53, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange54);
        org.junit.Assert.assertNotNull(errorReporter56);
        org.junit.Assert.assertNull(compilerOptions60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(compilerInput64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(tracer70);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = null;
        compiler1.defaultCodingConvention = codingConvention7;
        com.google.javascript.jscomp.Region region11 = compiler1.getSourceRegion("hi!", (int) (byte) 10);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder12 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int13 = codeBuilder12.getLineIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder15 = codeBuilder12.append("hi!");
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput24 = compiler18.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler18.getState();
        com.google.javascript.rhino.Node node27 = compiler18.parseTestCode("hi!");
        compiler1.toSource(codeBuilder15, (int) (byte) 10, node27);
        compiler1.setNormalized();
        com.google.javascript.jscomp.VariableMap variableMap30 = compiler1.getVariableMap();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(codeBuilder15);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(compilerInput24);
        org.junit.Assert.assertNotNull(intermediateState25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(variableMap30);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        compiler1.options = compilerOptions6;
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler9.getOptions();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        java.lang.String str17 = compiler9.toSource(node16);
        java.lang.String str18 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler22.options;
        com.google.javascript.jscomp.Result result28 = compiler9.compile(jSSourceFileArray19, jSModuleArray20, compilerOptions27);
        compiler1.options = compilerOptions27;
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.parsing.Config config31 = compiler1.getParserConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = compiler1.getSourceLine("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray19, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray20);
        org.junit.Assert.assertArrayEquals(jSModuleArray20, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNotNull(result28);
        org.junit.Assert.assertNotNull(config31);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        boolean boolean2 = compiler1.isNormalized();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        java.lang.String str15 = compiler4.toSource(node14);
        java.lang.String str16 = compiler1.toSource(node14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler1.getPropertyMap();
        java.lang.String str19 = compiler1.getAstDotGraph();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jSTypeRegistry17);
        org.junit.Assert.assertNull(variableMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        com.google.javascript.rhino.Node node5 = compiler1.jsRoot;
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        java.lang.String str15 = compiler7.toSource(node14);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler7.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler7.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler18.getState();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler23.getOptions();
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        compiler26.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler26.options;
        com.google.javascript.rhino.Node node30 = compiler26.parseTestCode("");
        java.lang.String str31 = compiler23.toSource(node30);
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler23.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray33 = compiler23.getErrors();
        compiler23.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState35 = compiler23.getState();
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        compiler37.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.options;
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler37.getSourceMap();
        com.google.javascript.rhino.Node node42 = compiler37.parseTestCode("");
        intermediateState35.externsRoot = node42;
        intermediateState21.externsRoot = node42;
        compiler7.setState(intermediateState21);
        compiler1.setState(intermediateState21);
        com.google.javascript.rhino.Node node48 = compiler1.parseTestCode("hi!hi!");
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNull(compilerOptions28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(codingConvention32);
        org.junit.Assert.assertNotNull(jSErrorArray33);
        org.junit.Assert.assertArrayEquals(jSErrorArray33, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState35);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        java.lang.String str3 = codeBuilder0.toString();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler1.getTypeValidator();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler1.getPassConfig();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler9.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = compiler9.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap12 = compiler9.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler9.getState();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler15.options;
        com.google.javascript.rhino.Node node19 = compiler15.parseTestCode("");
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.options;
        com.google.javascript.rhino.Node node25 = compiler21.parseTestCode("");
        java.lang.String str26 = compiler15.toSource(node25);
        intermediateState13.externsRoot = node25;
        com.google.javascript.rhino.Node node28 = intermediateState13.externsRoot;
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.Scope scope32 = compiler30.getTopScope();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.options;
        com.google.javascript.rhino.Node node38 = compiler34.parseTestCode("");
        compiler30.jsRoot = node38;
        intermediateState13.externsRoot = node38;
        compiler1.setState(intermediateState13);
        com.google.javascript.jscomp.PassConfig passConfig42 = compiler1.getPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(typeValidator6);
        org.junit.Assert.assertNotNull(passConfig7);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(scopeCreator11);
        org.junit.Assert.assertNull(functionInformationMap12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(compilerOptions23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(compilerOptions36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(passConfig42);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph6 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter7 = compiler1.getDefaultErrorReporter();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(jSModuleGraph6);
        org.junit.Assert.assertNotNull(errorReporter7);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("");
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        java.lang.String str27 = compiler16.toSource(node26);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler16.getCodingConvention();
        compiler16.addToDebugLog("hi!");
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler32.getOptions();
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler35.options;
        com.google.javascript.rhino.Node node39 = compiler35.parseTestCode("");
        java.lang.String str40 = compiler32.toSource(node39);
        java.lang.String str41 = compiler32.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray43 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        compiler45.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler45.options;
        com.google.javascript.rhino.Node node49 = compiler45.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler45.options;
        com.google.javascript.jscomp.Result result51 = compiler32.compile(jSSourceFileArray42, jSModuleArray43, compilerOptions50);
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = compiler32.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler32.getOptions();
        compiler16.options = compilerOptions53;
        compiler1.options = compilerOptions53;
        com.google.javascript.jscomp.CompilerInput compilerInput57 = compiler1.getInput("hi!hi!");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange58 = compiler1.recentChange;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNull(compilerOptions37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray42, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray43);
        org.junit.Assert.assertArrayEquals(jSModuleArray43, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNull(scopeCreator52);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNull(compilerInput57);
        org.junit.Assert.assertNotNull(recentChange58);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler1.getVariableMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler1.getState();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler15.tracker;
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.options;
        com.google.javascript.rhino.Node node25 = compiler21.parseTestCode("");
        java.lang.String str26 = compiler18.toSource(node25);
        java.lang.String str27 = compiler18.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray29 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler31.options;
        com.google.javascript.jscomp.Result result37 = compiler18.compile(jSSourceFileArray28, jSModuleArray29, compilerOptions36);
        java.lang.String[] strArray38 = compiler18.toSourceArray();
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler18.getPassConfig();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        compiler41.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.options;
        com.google.javascript.jscomp.SourceMap sourceMap44 = compiler41.getSourceMap();
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler46.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = compiler46.getScopeCreator();
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("");
        compiler46.externsRoot = node54;
        compiler41.jsRoot = node54;
        java.io.PrintStream printStream57 = null;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler(printStream57);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler58.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator60 = compiler58.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler58.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph62 = compiler58.getModuleGraph();
        com.google.javascript.rhino.Node node64 = compiler58.parseTestCode("");
        compiler41.externAndJsRoot = node64;
        java.lang.String str66 = compiler18.toSource(node64);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        compiler67.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig69 = compiler67.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention70 = compiler67.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig71 = compiler67.getPassConfig();
        java.io.PrintStream printStream72 = null;
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler(printStream72);
        compiler73.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions75 = compiler73.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph76 = compiler73.getModuleGraph();
        com.google.javascript.jscomp.Scope scope77 = compiler73.getTopScope();
        java.io.PrintStream printStream78 = null;
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler(printStream78);
        compiler79.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = compiler79.options;
        com.google.javascript.jscomp.SourceMap sourceMap82 = compiler79.getSourceMap();
        java.io.PrintStream printStream83 = null;
        com.google.javascript.jscomp.Compiler compiler84 = new com.google.javascript.jscomp.Compiler(printStream83);
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler84.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator86 = compiler84.getScopeCreator();
        java.io.PrintStream printStream87 = null;
        com.google.javascript.jscomp.Compiler compiler88 = new com.google.javascript.jscomp.Compiler(printStream87);
        compiler88.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions90 = compiler88.options;
        com.google.javascript.rhino.Node node92 = compiler88.parseTestCode("");
        compiler84.externsRoot = node92;
        compiler79.jsRoot = node92;
        java.lang.String str95 = compiler73.toSource(node92);
        compiler67.externsRoot = node92;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = compiler15.areNodesEqualForInlining(node64, node92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(variableMap12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(compilerOptions23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray28, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray29);
        org.junit.Assert.assertArrayEquals(jSModuleArray29, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNotNull(result37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNull(compilerOptions43);
        org.junit.Assert.assertNull(sourceMap44);
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNull(scopeCreator48);
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(compilerOptions59);
        org.junit.Assert.assertNull(scopeCreator60);
        org.junit.Assert.assertNull(compilerOptions61);
        org.junit.Assert.assertNull(jSModuleGraph62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(passConfig69);
        org.junit.Assert.assertNotNull(codingConvention70);
        org.junit.Assert.assertNotNull(passConfig71);
        org.junit.Assert.assertNull(compilerOptions75);
        org.junit.Assert.assertNull(jSModuleGraph76);
        org.junit.Assert.assertNull(scope77);
        org.junit.Assert.assertNull(compilerOptions81);
        org.junit.Assert.assertNull(sourceMap82);
        org.junit.Assert.assertNull(compilerOptions85);
        org.junit.Assert.assertNull(scopeCreator86);
        org.junit.Assert.assertNull(compilerOptions90);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node4 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getVariableMap();
        compiler1.disableThreads();
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler1.toSource(jSModule7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(variableMap5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler1.defaultCodingConvention;
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        int int22 = compiler1.getWarningCount();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler24.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler24.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler24.options;
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler31.getOptions();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.options;
        com.google.javascript.rhino.Node node38 = compiler34.parseTestCode("");
        java.lang.String str39 = compiler31.toSource(node38);
        java.lang.String str40 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler44.options;
        com.google.javascript.jscomp.Result result50 = compiler31.compile(jSSourceFileArray41, jSModuleArray42, compilerOptions49);
        com.google.javascript.jscomp.ScopeCreator scopeCreator51 = compiler31.getScopeCreator();
        boolean boolean52 = compiler31.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker53 = compiler31.tracker;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange54 = compiler31.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange54);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange54);
        compiler1.initCompilerOptionsIfTesting();
        boolean boolean58 = compiler1.precheck();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNull(compilerOptions36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray42);
        org.junit.Assert.assertArrayEquals(jSModuleArray42, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(result50);
        org.junit.Assert.assertNull(scopeCreator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(performanceTracker53);
        org.junit.Assert.assertNotNull(recentChange54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        compiler0.setUnnormalized();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler4.getOptions();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler4.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler4.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler4.createPassConfigInternal();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler4.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention17;
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNull(compilerOptions5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertNotNull(passConfig19);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.externsRoot = node9;
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap16 = compiler12.getFunctionalInformationMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = compiler18.getScopeCreator();
        com.google.javascript.rhino.Node node21 = compiler18.jsRoot;
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph26 = compiler23.getModuleGraph();
        com.google.javascript.jscomp.Scope scope27 = compiler23.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler23.getErrorManager();
        compiler18.setErrorManager(errorManager28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(errorManager28);
        compiler12.setErrorManager(errorManager28);
        compiler1.setErrorManager(errorManager28);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(errorManager28);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNull(functionInformationMap16);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scopeCreator20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNull(jSModuleGraph26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(errorManager28);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        compiler1.setUnnormalized();
        boolean boolean8 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.rhino.Node node8 = compiler0.parseSyntheticCode("hi!hi!", "");
        com.google.javascript.rhino.Node node9 = compiler0.externsRoot;
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        compiler0.setUnnormalized();
        java.lang.Class<?> wildcardClass4 = compiler0.getClass();
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        java.lang.String str8 = compiler0.getSourceLine("", (int) (short) -1);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler10.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler16.getOptions();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        java.lang.String str24 = compiler16.toSource(node23);
        java.lang.String str25 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.rhino.Node node33 = compiler29.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler29.options;
        com.google.javascript.jscomp.Result result35 = compiler16.compile(jSSourceFileArray26, jSModuleArray27, compilerOptions34);
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler37.getOptions();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.options;
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("");
        java.lang.String str45 = compiler37.toSource(node44);
        java.lang.String str46 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler50.options;
        com.google.javascript.jscomp.Result result56 = compiler37.compile(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        compiler16.options = compilerOptions55;
        compiler10.options = compilerOptions55;
        compiler0.options = compilerOptions55;
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler0.createPassConfigInternal();
        java.io.PrintStream printStream61 = null;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler(printStream61);
        compiler62.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = compiler62.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph65 = compiler62.getModuleGraph();
        com.google.javascript.jscomp.Scope scope66 = compiler62.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager67 = compiler62.getErrorManager();
        compiler0.setErrorManager(errorManager67);
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler(errorManager67);
        java.io.PrintStream printStream70 = null;
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler(printStream70);
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler71.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator73 = compiler71.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap74 = compiler71.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState75 = compiler71.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler71.options;
        com.google.javascript.jscomp.Compiler compiler77 = new com.google.javascript.jscomp.Compiler();
        compiler77.reportCodeChange();
        com.google.javascript.jscomp.Scope scope79 = compiler77.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState80 = compiler77.getState();
        compiler71.setState(intermediateState80);
        com.google.javascript.jscomp.Compiler compiler82 = new com.google.javascript.jscomp.Compiler();
        compiler82.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention84 = compiler82.defaultCodingConvention;
        compiler71.defaultCodingConvention = codingConvention84;
        compiler69.defaultCodingConvention = codingConvention84;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Tracer tracer88 = compiler69.newTracer("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray27);
        org.junit.Assert.assertArrayEquals(jSModuleArray27, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(result35);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray47, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertArrayEquals(jSModuleArray48, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(result56);
        org.junit.Assert.assertNotNull(passConfig60);
        org.junit.Assert.assertNull(compilerOptions64);
        org.junit.Assert.assertNull(jSModuleGraph65);
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertNotNull(errorManager67);
        org.junit.Assert.assertNull(compilerOptions72);
        org.junit.Assert.assertNull(scopeCreator73);
        org.junit.Assert.assertNull(functionInformationMap74);
        org.junit.Assert.assertNotNull(intermediateState75);
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNull(scope79);
        org.junit.Assert.assertNotNull(intermediateState80);
        org.junit.Assert.assertNotNull(codingConvention84);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler4.tracker;
        boolean boolean6 = compiler4.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler4.getUniqueNameIdSupplier();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.setUnnormalized();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange12 = compiler9.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap13 = compiler9.getFunctionalInformationMap();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler15.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = compiler15.getScopeCreator();
        com.google.javascript.rhino.Node node18 = compiler15.jsRoot;
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph23 = compiler20.getModuleGraph();
        com.google.javascript.jscomp.Scope scope24 = compiler20.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler20.getErrorManager();
        compiler15.setErrorManager(errorManager25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(errorManager25);
        compiler9.setErrorManager(errorManager25);
        compiler4.setErrorManager(errorManager25);
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput37 = compiler31.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler31.getState();
        com.google.javascript.rhino.Node node40 = compiler31.parseTestCode("hi!");
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler42.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator44 = compiler42.getScopeCreator();
        compiler42.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable46 = compiler42.acquireSymbolTable();
        compiler31.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable46);
        java.io.PrintStream printStream48 = null;
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler(printStream48);
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler49.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator51 = compiler49.getScopeCreator();
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        compiler53.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler53.options;
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("");
        compiler49.externsRoot = node57;
        compiler31.prepareAst(node57);
        compiler4.externAndJsRoot = node57;
        java.lang.String str61 = compiler0.toSource(node57);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(recentChange12);
        org.junit.Assert.assertNull(functionInformationMap13);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNull(scopeCreator17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNull(jSModuleGraph23);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(compilerInput37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(compilerOptions43);
        org.junit.Assert.assertNull(scopeCreator44);
        org.junit.Assert.assertNotNull(symbolTable46);
        org.junit.Assert.assertNull(compilerOptions50);
        org.junit.Assert.assertNull(scopeCreator51);
        org.junit.Assert.assertNull(compilerOptions55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Result result8 = compiler1.getResult();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = compiler1.getUniqueNameIdSupplier();
        boolean boolean10 = compiler1.isIdeMode();
        com.google.javascript.rhino.Node node11 = compiler1.externAndJsRoot;
        boolean boolean12 = compiler1.precheck();
        java.lang.Exception exception14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.throwInternalError("hi!hi!", exception14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?hi!hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.defaultCodingConvention;
        boolean boolean14 = compiler1.precheck();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler1.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler1.getFunctionalInformationMap();
        com.google.javascript.rhino.Node node8 = compiler1.parseSyntheticCode("hi!", "hi!");
        compiler1.startPass("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(functionInformationMap5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        boolean boolean3 = codeBuilder0.endsWith("hi!");
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        java.lang.String str6 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        compiler1.resetUniqueNameId();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler1.getState();
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = null;
        compiler14.options = compilerOptions17;
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput26 = compiler20.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler20.getState();
        com.google.javascript.rhino.Node node29 = compiler20.parseTestCode("hi!");
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler31.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = compiler31.getScopeCreator();
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable35 = compiler31.acquireSymbolTable();
        compiler20.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable35);
        com.google.javascript.rhino.Node node38 = compiler20.parseTestCode("hi!hi!");
        compiler14.jsRoot = node38;
        intermediateState12.externsRoot = node38;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(compilerInput26);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNull(scopeCreator33);
        org.junit.Assert.assertNotNull(symbolTable35);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler7.getInput("");
        int int14 = compiler7.getWarningCount();
        boolean boolean15 = compiler7.hasErrors();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler16.tracker;
        boolean boolean18 = compiler16.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier19 = compiler16.getUniqueNameIdSupplier();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler21.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap25 = compiler21.getFunctionalInformationMap();
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler27.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = compiler27.getScopeCreator();
        com.google.javascript.rhino.Node node30 = compiler27.jsRoot;
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler32.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph35 = compiler32.getModuleGraph();
        com.google.javascript.jscomp.Scope scope36 = compiler32.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler32.getErrorManager();
        compiler27.setErrorManager(errorManager37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(errorManager37);
        compiler21.setErrorManager(errorManager37);
        compiler16.setErrorManager(errorManager37);
        compiler7.setErrorManager(errorManager37);
        compiler1.setErrorManager(errorManager37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = compiler1.hasHaltingErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(compilerInput13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSupplier19);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNull(functionInformationMap25);
        org.junit.Assert.assertNull(compilerOptions28);
        org.junit.Assert.assertNull(scopeCreator29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNull(jSModuleGraph35);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNotNull(errorManager37);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler1.getModuleGraph();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.rhino.Node node13 = compiler10.jsRoot;
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler15.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph18 = compiler15.getModuleGraph();
        com.google.javascript.jscomp.Scope scope19 = compiler15.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler15.getErrorManager();
        compiler10.setErrorManager(errorManager20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(errorManager20);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(errorManager20);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(errorManager20);
        com.google.javascript.rhino.Node node26 = compiler24.parseTestCode("");
        compiler1.externsRoot = node26;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(jSModuleGraph8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNull(jSModuleGraph18);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
        com.google.javascript.jscomp.Tracer tracer11 = compiler1.newTracer("");
        com.google.javascript.jscomp.Region region14 = compiler1.getSourceRegion("hi!", (int) (byte) 10);
        com.google.javascript.rhino.Node node15 = compiler1.externsRoot;
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = compiler17.getScopeCreator();
        com.google.javascript.rhino.Node node20 = compiler17.jsRoot;
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph25 = compiler22.getModuleGraph();
        com.google.javascript.jscomp.Scope scope26 = compiler22.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler22.getErrorManager();
        compiler17.setErrorManager(errorManager27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(errorManager27);
        com.google.javascript.jscomp.Result result30 = compiler29.getResult();
        com.google.javascript.rhino.Node node31 = compiler29.getRoot();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        compiler39.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = compiler39.options;
        com.google.javascript.rhino.Node node43 = compiler39.parseTestCode("");
        java.lang.String str44 = compiler33.toSource(node43);
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler33.getCodingConvention();
        compiler33.addToDebugLog("hi!");
        java.io.PrintStream printStream48 = null;
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler(printStream48);
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler49.getOptions();
        java.io.PrintStream printStream51 = null;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(printStream51);
        compiler52.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler52.options;
        com.google.javascript.rhino.Node node56 = compiler52.parseTestCode("");
        java.lang.String str57 = compiler49.toSource(node56);
        java.lang.String str58 = compiler49.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray59 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray60 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream61 = null;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler(printStream61);
        compiler62.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = compiler62.options;
        com.google.javascript.rhino.Node node66 = compiler62.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler62.options;
        com.google.javascript.jscomp.Result result68 = compiler49.compile(jSSourceFileArray59, jSModuleArray60, compilerOptions67);
        com.google.javascript.jscomp.ScopeCreator scopeCreator69 = compiler49.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions70 = compiler49.getOptions();
        compiler33.options = compilerOptions70;
        com.google.javascript.jscomp.JSError[] jSErrorArray72 = compiler33.getWarnings();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange73 = compiler33.recentChange;
        compiler29.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange73);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange73);
        com.google.javascript.jscomp.Compiler compiler76 = new com.google.javascript.jscomp.Compiler();
        compiler76.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention78 = compiler76.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable79 = compiler76.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager80 = compiler76.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = compiler76.getOptions();
        com.google.javascript.rhino.Node node82 = compiler76.externsRoot;
        compiler76.reportCodeChange();
        com.google.javascript.jscomp.Tracer tracer85 = compiler76.newTracer("hi!hi!");
        compiler1.stopTracer(tracer85, "");
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(tracer11);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(scopeCreator19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNull(jSModuleGraph25);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(result30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(compilerOptions41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertNull(compilerOptions50);
        org.junit.Assert.assertNull(compilerOptions54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray59);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray59, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray60);
        org.junit.Assert.assertArrayEquals(jSModuleArray60, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(result68);
        org.junit.Assert.assertNull(scopeCreator69);
        org.junit.Assert.assertNotNull(compilerOptions70);
        org.junit.Assert.assertNotNull(jSErrorArray72);
        org.junit.Assert.assertArrayEquals(jSErrorArray72, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange73);
        org.junit.Assert.assertNotNull(codingConvention78);
        org.junit.Assert.assertNotNull(symbolTable79);
        org.junit.Assert.assertNotNull(errorManager80);
        org.junit.Assert.assertNotNull(compilerOptions81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(tracer85);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler1.getState();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler5.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler5.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap8 = compiler5.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler5.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler5.options;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler11.getState();
        compiler5.setState(intermediateState14);
        com.google.javascript.rhino.Node node17 = compiler5.parseTestCode("hi!");
        compiler5.addToDebugLog("");
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.options;
        com.google.javascript.rhino.Node node25 = compiler21.parseTestCode("");
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        compiler27.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.options;
        com.google.javascript.rhino.Node node31 = compiler27.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        com.google.javascript.jscomp.CodingConvention codingConvention33 = compiler21.getCodingConvention();
        com.google.javascript.rhino.Node node34 = compiler21.externAndJsRoot;
        com.google.javascript.rhino.Node node36 = compiler21.parseTestCode("hi!");
        java.lang.String str37 = compiler5.toSource(node36);
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler39.getOptions();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        compiler42.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler42.options;
        com.google.javascript.rhino.Node node46 = compiler42.parseTestCode("");
        java.lang.String str47 = compiler39.toSource(node46);
        java.lang.String str48 = compiler39.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray49 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray50 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream51 = null;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(printStream51);
        compiler52.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler52.options;
        com.google.javascript.rhino.Node node56 = compiler52.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler52.options;
        com.google.javascript.jscomp.Result result58 = compiler39.compile(jSSourceFileArray49, jSModuleArray50, compilerOptions57);
        com.google.javascript.jscomp.ScopeCreator scopeCreator59 = compiler39.getScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = null;
        compiler39.tracker = performanceTracker60;
        com.google.javascript.rhino.Node node63 = compiler39.parseSyntheticCode("hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = compiler1.areNodesEqualForInlining(node36, node63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(functionInformationMap8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(compilerOptions23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(codingConvention33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(compilerOptions40);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray49);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray49, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray50);
        org.junit.Assert.assertArrayEquals(jSModuleArray50, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(compilerOptions57);
        org.junit.Assert.assertNotNull(result58);
        org.junit.Assert.assertNull(scopeCreator59);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler12.getSourceMap();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = compiler17.getScopeCreator();
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.options;
        com.google.javascript.rhino.Node node25 = compiler21.parseTestCode("");
        compiler17.externsRoot = node25;
        compiler12.jsRoot = node25;
        java.lang.String str28 = compiler6.toSource(node25);
        compiler0.externsRoot = node25;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler0.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(scopeCreator19);
        org.junit.Assert.assertNull(compilerOptions23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = compiler17.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap20 = compiler17.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope21 = compiler17.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = null;
        compiler17.options = compilerOptions22;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler24.defaultCodingConvention;
        boolean boolean27 = compiler24.precheck();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        compiler28.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler28.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable31 = compiler28.acquireSymbolTable();
        compiler24.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable31);
        compiler17.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable31);
        compiler6.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable31);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable31);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(scopeCreator19);
        org.junit.Assert.assertNull(functionInformationMap20);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNotNull(symbolTable31);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        java.lang.String str7 = compiler0.getSourceLine("hi!", (-1));
        boolean boolean8 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        com.google.javascript.rhino.Node node10 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler12.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = compiler12.getScopeCreator();
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable16 = compiler12.acquireSymbolTable();
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable16);
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler19.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler19.getScopeCreator();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        compiler19.externsRoot = node27;
        compiler1.prepareAst(node27);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph31 = compiler1.getModuleGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNull(scopeCreator14);
        org.junit.Assert.assertNotNull(symbolTable16);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNull(jSModuleGraph31);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        int int2 = codeBuilder0.getLength();
        boolean boolean4 = codeBuilder0.endsWith("hi!");
        boolean boolean6 = codeBuilder0.endsWith("hi!");
        boolean boolean8 = codeBuilder0.endsWith("hi!hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = codeBuilder0.append("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(codeBuilder10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler1.getOptions();
        boolean boolean11 = compiler1.precheck();
        boolean boolean12 = compiler1.isInliningForbidden();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler1.tracker;
        com.google.javascript.jscomp.Tracer tracer25 = compiler1.newTracer("");
        compiler1.disableThreads();
        compiler1.optimize();
        boolean boolean28 = compiler1.precheck();
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        java.lang.String str38 = compiler30.toSource(node37);
        java.lang.String str39 = compiler30.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler43.options;
        com.google.javascript.jscomp.Result result49 = compiler30.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions48);
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = compiler30.getScopeCreator();
        int int51 = compiler30.getWarningCount();
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        compiler53.setUnnormalized();
        com.google.javascript.jscomp.Scope scope55 = compiler53.getTopScope();
        com.google.javascript.jscomp.Scope scope56 = compiler53.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap57 = compiler53.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler53.options;
        java.io.PrintStream printStream59 = null;
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler(printStream59);
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler60.getOptions();
        java.io.PrintStream printStream62 = null;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler(printStream62);
        compiler63.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = compiler63.options;
        com.google.javascript.rhino.Node node67 = compiler63.parseTestCode("");
        java.lang.String str68 = compiler60.toSource(node67);
        java.lang.String str69 = compiler60.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray70 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray71 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream72 = null;
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler(printStream72);
        compiler73.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions75 = compiler73.options;
        com.google.javascript.rhino.Node node77 = compiler73.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = compiler73.options;
        com.google.javascript.jscomp.Result result79 = compiler60.compile(jSSourceFileArray70, jSModuleArray71, compilerOptions78);
        com.google.javascript.jscomp.ScopeCreator scopeCreator80 = compiler60.getScopeCreator();
        boolean boolean81 = compiler60.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker82 = compiler60.tracker;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange83 = compiler60.recentChange;
        compiler53.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange83);
        compiler30.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange83);
        com.google.javascript.jscomp.SymbolTable symbolTable86 = compiler30.acquireSymbolTable();
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable86);
        com.google.javascript.jscomp.TypeValidator typeValidator88 = compiler1.getTypeValidator();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(tracer25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(compilerOptions48);
        org.junit.Assert.assertNotNull(result49);
        org.junit.Assert.assertNull(scopeCreator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(scope55);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(sourceMap57);
        org.junit.Assert.assertNull(compilerOptions58);
        org.junit.Assert.assertNull(compilerOptions61);
        org.junit.Assert.assertNull(compilerOptions65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray70);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray70, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray71);
        org.junit.Assert.assertArrayEquals(jSModuleArray71, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(compilerOptions78);
        org.junit.Assert.assertNotNull(result79);
        org.junit.Assert.assertNull(scopeCreator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(performanceTracker82);
        org.junit.Assert.assertNotNull(recentChange83);
        org.junit.Assert.assertNotNull(symbolTable86);
        org.junit.Assert.assertNotNull(typeValidator88);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addIncrementalSourceAst(jsAst10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(jSTypeRegistry9);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node4 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getVariableMap();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler7.getScopeCreator();
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable11 = compiler7.acquireSymbolTable();
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable11);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = compiler1.getUniqueNameIdSupplier();
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator9);
        org.junit.Assert.assertNotNull(symbolTable11);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = compiler1.getScopeCreator();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler1.tracker = performanceTracker13;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = compiler1.toSourceArray(jSModule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scopeCreator11);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler1.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler1.getFunctionalInformationMap();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler7.getScopeCreator();
        com.google.javascript.rhino.Node node10 = compiler7.jsRoot;
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph15 = compiler12.getModuleGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler12.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler1.setErrorManager(errorManager17);
        com.google.javascript.rhino.Node node21 = compiler1.externsRoot;
        com.google.common.base.Supplier<java.lang.String> strSupplier22 = compiler1.getUniqueNameIdSupplier();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(functionInformationMap5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(jSModuleGraph15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(strSupplier22);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        boolean boolean6 = compiler1.precheck();
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.acquireSymbolTable();
        com.google.javascript.rhino.Node node10 = compiler1.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(symbolTable7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(performanceTracker11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler1.createPassConfigInternal();
        boolean boolean12 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler1.getWarnings();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSErrorArray13);
        org.junit.Assert.assertArrayEquals(jSErrorArray13, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler1.tracker;
        compiler1.addToDebugLog("hi!");
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = compiler14.getScopeCreator();
        com.google.javascript.rhino.Node node17 = compiler14.jsRoot;
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph22 = compiler19.getModuleGraph();
        com.google.javascript.jscomp.Scope scope23 = compiler19.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler19.getErrorManager();
        compiler14.setErrorManager(errorManager24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager24);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(errorManager24);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(errorManager24);
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler28.createPassConfigInternal();
        compiler1.setPassConfig(passConfig29);
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(scopeCreator16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNull(jSModuleGraph22);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(passConfig29);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("");
        codeBuilder0.reset();
        int int4 = codeBuilder0.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder0.append("hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = codeBuilder0.append("hi!");
        int int9 = codeBuilder0.getColumnIndex();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codeBuilder6);
        org.junit.Assert.assertNotNull(codeBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler10.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph14 = compiler10.getModuleGraph();
        com.google.javascript.rhino.Node node16 = compiler10.parseTestCode("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = codeBuilder17.append("");
        codeBuilder17.reset();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput29 = compiler23.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler23.getState();
        com.google.javascript.rhino.Node node32 = compiler23.parseTestCode("hi!");
        compiler10.toSource(codeBuilder17, (int) '4', node32);
        intermediateState8.externsRoot = node32;
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        compiler36.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler36.options;
        com.google.javascript.rhino.Node node40 = compiler36.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput42 = compiler36.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler36.getState();
        com.google.javascript.rhino.Node node45 = compiler36.parseTestCode("hi!");
        boolean boolean46 = compiler36.isNormalized();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder49 = codeBuilder47.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder51 = codeBuilder47.append("hi!");
        java.io.PrintStream printStream53 = null;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler(printStream53);
        compiler54.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler54.options;
        com.google.javascript.rhino.Node node58 = compiler54.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput60 = compiler54.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState61 = compiler54.getState();
        com.google.javascript.rhino.Node node63 = compiler54.parseTestCode("hi!");
        compiler36.toSource(codeBuilder47, (int) (byte) 10, node63);
        intermediateState8.externsRoot = node63;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNull(jSModuleGraph14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(codeBuilder19);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(compilerInput29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(compilerInput42);
        org.junit.Assert.assertNotNull(intermediateState43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(codeBuilder49);
        org.junit.Assert.assertNotNull(codeBuilder51);
        org.junit.Assert.assertNull(compilerOptions56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(compilerInput60);
        org.junit.Assert.assertNotNull(intermediateState61);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler1.tracker;
        com.google.javascript.jscomp.Tracer tracer25 = compiler1.newTracer("");
        compiler1.disableThreads();
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler28.getOptions();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        java.lang.String str36 = compiler28.toSource(node35);
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler28.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray38 = compiler28.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler28.getSourceMap();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        compiler41.setUnnormalized();
        com.google.javascript.jscomp.Scope scope43 = compiler41.getTopScope();
        com.google.javascript.jscomp.CodingConvention codingConvention44 = compiler41.defaultCodingConvention;
        compiler28.defaultCodingConvention = codingConvention44;
        com.google.javascript.rhino.Node node48 = compiler28.parseSyntheticCode("", "");
        compiler1.externAndJsRoot = node48;
        compiler1.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(tracer25);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNotNull(jSErrorArray38);
        org.junit.Assert.assertArrayEquals(jSErrorArray38, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(sourceMap39);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(codingConvention44);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler1.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        boolean boolean9 = compiler1.isTypeCheckingEnabled();
        boolean boolean10 = compiler1.hasErrors();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        compiler1.resetUniqueNameId();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler1.getUniqueNameIdSupplier();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Result result14 = compiler13.getResult();
        compiler13.setNormalized();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler13.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = compiler13.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler0.acquireSymbolTable();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap9 = compiler6.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler6.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler6.options;
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler13.getOptions();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("");
        java.lang.String str21 = compiler13.toSource(node20);
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler23.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = compiler23.getScopeCreator();
        com.google.javascript.jscomp.SymbolTable symbolTable26 = compiler23.acquireSymbolTable();
        compiler13.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable26);
        compiler6.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable26);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable26);
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(symbolTable4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(functionInformationMap9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNull(scopeCreator25);
        org.junit.Assert.assertNotNull(symbolTable26);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getWarnings();
        com.google.javascript.rhino.Node node9 = compiler1.externsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        java.lang.Class<?> wildcardClass11 = compiler1.getClass();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler6.options;
        compiler1.options = compilerOptions11;
        boolean boolean13 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler0.acquireSymbolTable();
        boolean boolean5 = compiler0.isNormalized();
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(symbolTable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler1.tracker;
        com.google.javascript.jscomp.Tracer tracer25 = compiler1.newTracer("");
        com.google.javascript.jscomp.TypeValidator typeValidator26 = compiler1.getTypeValidator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler1.options;
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.rhino.Node node33 = compiler29.parseTestCode("");
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler35.options;
        com.google.javascript.rhino.Node node39 = compiler35.parseTestCode("");
        java.lang.String str40 = compiler29.toSource(node39);
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler29.getCodingConvention();
        com.google.javascript.rhino.Node node42 = compiler29.externAndJsRoot;
        com.google.javascript.rhino.Node node44 = compiler29.parseTestCode("hi!");
        com.google.javascript.rhino.Node node45 = compiler29.getRoot();
        com.google.javascript.jscomp.Tracer tracer47 = compiler29.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        compiler1.stopTracer(tracer47, "");
        com.google.javascript.rhino.Node node52 = compiler1.parseSyntheticCode("", "");
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(tracer25);
        org.junit.Assert.assertNotNull(typeValidator26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(compilerOptions37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(codingConvention41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(tracer47);
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        com.google.javascript.rhino.Node node13 = compiler1.parseSyntheticCode("", "hi!hi!");
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        compiler15.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler15.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        compiler15.options = compilerOptions18;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler20.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable23 = compiler20.acquireSymbolTable();
        compiler15.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        java.lang.String str26 = compiler1.getAstDotGraph();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(symbolTable23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        compiler1.options = compilerOptions6;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler1.getOptions();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = compiler1.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler1.getState();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(intermediateState10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Region region13 = compiler1.getSourceRegion("hi!hi!", (int) (byte) -1);
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        boolean boolean6 = compiler1.precheck();
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.acquireSymbolTable();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler9.getOptions();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        java.lang.String str17 = compiler9.toSource(node16);
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler19.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler19.getScopeCreator();
        com.google.javascript.jscomp.SymbolTable symbolTable22 = compiler19.acquireSymbolTable();
        compiler9.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable22);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable22);
        com.google.javascript.jscomp.PassConfig passConfig25 = compiler1.getPassConfig();
        com.google.javascript.rhino.Node node26 = compiler1.jsRoot;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = null;
        compiler1.tracker = performanceTracker27;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = compiler1.parse(jSSourceFile29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(symbolTable7);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNotNull(symbolTable22);
        org.junit.Assert.assertNotNull(passConfig25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        compiler1.jsRoot = node14;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler1.getPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = compiler1.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(passConfig17);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        compiler1.startPass("hi!hi!");
        compiler1.initCompilerOptionsIfTesting();
        compiler1.disableThreads();
        boolean boolean13 = compiler1.isInliningForbidden();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler1.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler1.getFunctionalInformationMap();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler7.getScopeCreator();
        com.google.javascript.rhino.Node node10 = compiler7.jsRoot;
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph15 = compiler12.getModuleGraph();
        com.google.javascript.jscomp.Scope scope16 = compiler12.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager17);
        compiler1.setErrorManager(errorManager17);
        com.google.javascript.rhino.Node node21 = compiler1.externsRoot;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CssRenamingMap cssRenamingMap22 = compiler1.getCssRenamingMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(functionInformationMap5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(jSModuleGraph15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        compiler1.disableThreads();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        compiler1.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.TypeValidator typeValidator8 = compiler1.getTypeValidator();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNotNull(typeValidator8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!");
        boolean boolean13 = compiler1.isNormalized();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler1.getErrors();
        java.lang.String str15 = compiler1.toSource();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(tracer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertArrayEquals(jSErrorArray14, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.options;
        com.google.javascript.rhino.Node node13 = compiler9.parseTestCode("");
        java.lang.String str14 = compiler6.toSource(node13);
        java.lang.String str15 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler19.options;
        com.google.javascript.jscomp.Result result25 = compiler6.compile(jSSourceFileArray16, jSModuleArray17, compilerOptions24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        compiler26.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler26.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention29 = compiler26.defaultCodingConvention;
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler31.getOptions();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.options;
        com.google.javascript.rhino.Node node38 = compiler34.parseTestCode("");
        java.lang.String str39 = compiler31.toSource(node38);
        java.lang.String str40 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler44.options;
        com.google.javascript.jscomp.Result result50 = compiler31.compile(jSSourceFileArray41, jSModuleArray42, compilerOptions49);
        com.google.javascript.jscomp.JSModule[] jSModuleArray51 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        compiler53.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler53.options;
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler53.options;
        compiler26.init(jSSourceFileArray41, jSModuleArray51, compilerOptions58);
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler61.getOptions();
        java.io.PrintStream printStream63 = null;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler(printStream63);
        compiler64.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = compiler64.options;
        com.google.javascript.rhino.Node node68 = compiler64.parseTestCode("");
        java.lang.String str69 = compiler61.toSource(node68);
        java.lang.String str70 = compiler61.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray71 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray72 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream73 = null;
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler(printStream73);
        compiler74.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler74.options;
        com.google.javascript.rhino.Node node78 = compiler74.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler74.options;
        com.google.javascript.jscomp.Result result80 = compiler61.compile(jSSourceFileArray71, jSModuleArray72, compilerOptions79);
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = compiler61.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler61.getOptions();
        compiler1.init(jSSourceFileArray16, jSSourceFileArray41, compilerOptions82);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray16, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray17);
        org.junit.Assert.assertArrayEquals(jSModuleArray17, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(compilerOptions24);
        org.junit.Assert.assertNotNull(result25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNotNull(codingConvention29);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNull(compilerOptions36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray42);
        org.junit.Assert.assertArrayEquals(jSModuleArray42, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(result50);
        org.junit.Assert.assertNotNull(jSModuleArray51);
        org.junit.Assert.assertArrayEquals(jSModuleArray51, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(compilerOptions58);
        org.junit.Assert.assertNull(compilerOptions62);
        org.junit.Assert.assertNull(compilerOptions66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray71);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray71, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray72);
        org.junit.Assert.assertArrayEquals(jSModuleArray72, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNotNull(result80);
        org.junit.Assert.assertNull(scopeCreator81);
        org.junit.Assert.assertNotNull(compilerOptions82);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler12.getState();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler17.toSource(node24);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler17.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray27 = compiler17.getErrors();
        compiler17.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler17.getState();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler31.getSourceMap();
        com.google.javascript.rhino.Node node36 = compiler31.parseTestCode("");
        intermediateState29.externsRoot = node36;
        intermediateState15.externsRoot = node36;
        compiler1.setState(intermediateState15);
        boolean boolean40 = compiler1.precheck();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler42.getOptions();
        com.google.javascript.jscomp.Scope scope44 = compiler42.getTopScope();
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        compiler46.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler46.options;
        com.google.javascript.rhino.Node node50 = compiler46.parseTestCode("");
        compiler42.jsRoot = node50;
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler42.options;
        java.io.PrintStream printStream53 = null;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler(printStream53);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler54.getOptions();
        java.io.PrintStream printStream56 = null;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler(printStream56);
        compiler57.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler57.options;
        com.google.javascript.rhino.Node node61 = compiler57.parseTestCode("");
        java.lang.String str62 = compiler54.toSource(node61);
        com.google.javascript.jscomp.CodingConvention codingConvention63 = compiler54.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray64 = compiler54.getErrors();
        compiler54.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState66 = compiler54.getState();
        compiler42.setState(intermediateState66);
        java.io.PrintStream printStream68 = null;
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler(printStream68);
        compiler69.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = compiler69.options;
        com.google.javascript.rhino.Node node73 = compiler69.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput75 = compiler69.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState76 = compiler69.getState();
        com.google.javascript.rhino.Node node78 = compiler69.parseTestCode("hi!");
        intermediateState66.externsRoot = node78;
        java.io.PrintStream printStream80 = null;
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler(printStream80);
        java.io.PrintStream printStream82 = null;
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler(printStream82);
        compiler83.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler83.options;
        com.google.javascript.rhino.Node node87 = compiler83.parseTestCode("");
        compiler81.externsRoot = node87;
        intermediateState66.externsRoot = node87;
        compiler1.prepareAst(node87);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(jSErrorArray27);
        org.junit.Assert.assertArrayEquals(jSErrorArray27, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(compilerOptions43);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNull(compilerOptions48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNull(compilerOptions55);
        org.junit.Assert.assertNull(compilerOptions59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(codingConvention63);
        org.junit.Assert.assertNotNull(jSErrorArray64);
        org.junit.Assert.assertArrayEquals(jSErrorArray64, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState66);
        org.junit.Assert.assertNull(compilerOptions71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(compilerInput75);
        org.junit.Assert.assertNotNull(intermediateState76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(compilerOptions85);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        com.google.javascript.rhino.Node node9 = compiler1.externsRoot;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler1.getOptions();
        java.lang.String str11 = compiler1.toSource();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.rhino.Node node15 = compiler12.parseTestCode("hi!hi!");
        java.lang.String str16 = compiler1.toSource(node15);
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler1.getPassConfig();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler19.getOptions();
        com.google.javascript.jscomp.Scope scope21 = compiler19.getTopScope();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        compiler19.jsRoot = node27;
        compiler19.initCompilerOptionsIfTesting();
        int int30 = compiler19.getWarningCount();
        com.google.javascript.jscomp.CodingConvention codingConvention31 = compiler19.getCodingConvention();
        compiler1.defaultCodingConvention = codingConvention31;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(codingConvention31);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler1.defaultCodingConvention;
        compiler1.setUnnormalized();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(codingConvention5);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        compiler1.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler1.getOptions();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler10.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler16.getOptions();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        java.lang.String str24 = compiler16.toSource(node23);
        java.lang.String str25 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        compiler29.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.options;
        com.google.javascript.rhino.Node node33 = compiler29.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler29.options;
        com.google.javascript.jscomp.Result result35 = compiler16.compile(jSSourceFileArray26, jSModuleArray27, compilerOptions34);
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler37.getOptions();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.options;
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("");
        java.lang.String str45 = compiler37.toSource(node44);
        java.lang.String str46 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        compiler50.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.options;
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler50.options;
        com.google.javascript.jscomp.Result result56 = compiler37.compile(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        compiler16.options = compilerOptions55;
        compiler10.options = compilerOptions55;
        java.io.PrintStream printStream59 = null;
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler(printStream59);
        compiler60.setUnnormalized();
        com.google.javascript.jscomp.Scope scope62 = compiler60.getTopScope();
        com.google.javascript.jscomp.Scope scope63 = compiler60.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap64 = compiler60.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = compiler60.options;
        java.io.PrintStream printStream66 = null;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(printStream66);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler67.getOptions();
        java.io.PrintStream printStream69 = null;
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler(printStream69);
        compiler70.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.options;
        com.google.javascript.rhino.Node node74 = compiler70.parseTestCode("");
        java.lang.String str75 = compiler67.toSource(node74);
        java.lang.String str76 = compiler67.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray77 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray78 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream79 = null;
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler(printStream79);
        compiler80.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler80.options;
        com.google.javascript.rhino.Node node84 = compiler80.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler80.options;
        com.google.javascript.jscomp.Result result86 = compiler67.compile(jSSourceFileArray77, jSModuleArray78, compilerOptions85);
        com.google.javascript.jscomp.ScopeCreator scopeCreator87 = compiler67.getScopeCreator();
        boolean boolean88 = compiler67.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker89 = compiler67.tracker;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange90 = compiler67.recentChange;
        compiler60.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange90);
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange90);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange90);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph94 = compiler1.getModuleGraph();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNull(compilerOptions17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray27);
        org.junit.Assert.assertArrayEquals(jSModuleArray27, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(result35);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray47, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertArrayEquals(jSModuleArray48, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(result56);
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertNull(scope63);
        org.junit.Assert.assertNull(sourceMap64);
        org.junit.Assert.assertNull(compilerOptions65);
        org.junit.Assert.assertNull(compilerOptions68);
        org.junit.Assert.assertNull(compilerOptions72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray77);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray77, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray78);
        org.junit.Assert.assertArrayEquals(jSModuleArray78, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(compilerOptions85);
        org.junit.Assert.assertNotNull(result86);
        org.junit.Assert.assertNull(scopeCreator87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(performanceTracker89);
        org.junit.Assert.assertNotNull(recentChange90);
        org.junit.Assert.assertNull(jSModuleGraph94);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler1.getOptions();
        boolean boolean9 = compiler1.hasErrors();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap10 = null;
        compiler1.setCssRenamingMap(cssRenamingMap10);
        com.google.javascript.rhino.Node node12 = compiler1.externsRoot;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        com.google.javascript.rhino.Node node14 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager15);
        com.google.javascript.jscomp.TypeValidator typeValidator17 = compiler16.getTypeValidator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap18 = compiler16.getFunctionalInformationMap();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(typeValidator17);
        org.junit.Assert.assertNull(functionInformationMap18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler1.getOptions();
        boolean boolean9 = compiler1.hasErrors();
        java.lang.String str10 = compiler1.toSource();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.JSError jSError12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!");
        boolean boolean13 = compiler1.isNormalized();
        java.lang.String str16 = compiler1.getSourceLine("", (int) '4');
        com.google.javascript.jscomp.Scope scope17 = compiler1.getTopScope();
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler1.getMessages();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(tracer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertArrayEquals(jSErrorArray18, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler13.defaultCodingConvention;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = compiler13.getTypeRegistry();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler17.toSource(node24);
        java.lang.String str26 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray27 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray28 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler30.options;
        com.google.javascript.jscomp.Result result36 = compiler17.compile(jSSourceFileArray27, jSModuleArray28, compilerOptions35);
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = compiler17.getScopeCreator();
        int int38 = compiler17.getWarningCount();
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler17.createPassConfigInternal();
        compiler13.setPassConfig(passConfig39);
        com.google.javascript.rhino.Node node41 = compiler13.jsRoot;
        java.lang.Exception exception43 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler13.throwInternalError("hi!hi!", exception43);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?hi!hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(jSTypeRegistry15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray27);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray27, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray28);
        org.junit.Assert.assertArrayEquals(jSModuleArray28, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(compilerOptions35);
        org.junit.Assert.assertNotNull(result36);
        org.junit.Assert.assertNull(scopeCreator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        int int2 = codeBuilder0.getLength();
        boolean boolean4 = codeBuilder0.endsWith("hi!");
        boolean boolean6 = codeBuilder0.endsWith("hi!hi!");
        int int7 = codeBuilder0.getLineIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = compiler1.getScopeCreator();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler1.tracker = performanceTracker13;
        com.google.javascript.rhino.Node node15 = compiler1.externsRoot;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scopeCreator11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!");
        boolean boolean13 = compiler1.isNormalized();
        java.io.PrintStream printStream14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler15.getOptions();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        java.lang.String str23 = compiler15.toSource(node22);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = compiler15.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray25 = compiler15.getErrors();
        com.google.javascript.jscomp.parsing.Config config26 = compiler15.getParserConfig();
        com.google.javascript.rhino.Node node27 = compiler15.jsRoot;
        compiler15.setUnnormalized();
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = compiler15.getScopeCreator();
        com.google.javascript.jscomp.PassConfig passConfig30 = compiler15.getPassConfig();
        compiler1.setPassConfig(passConfig30);
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(tracer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(codingConvention24);
        org.junit.Assert.assertNotNull(jSErrorArray25);
        org.junit.Assert.assertArrayEquals(jSErrorArray25, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(config26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(scopeCreator29);
        org.junit.Assert.assertNotNull(passConfig30);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addIncrementalSourceAst(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModuleGraph8);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        compiler1.options = compilerOptions4;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initInputsByNameMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(compilerOptions6);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("");
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        java.lang.String str17 = compiler6.toSource(node16);
        compiler0.externsRoot = node16;
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput26 = compiler20.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler20.getState();
        com.google.javascript.rhino.Node node29 = compiler20.parseTestCode("hi!");
        boolean boolean30 = compiler20.isNormalized();
        java.io.PrintStream printStream31 = null;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler(printStream31);
        compiler32.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler32.options;
        com.google.javascript.rhino.Node node36 = compiler32.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput38 = compiler32.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler32.getState();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        java.lang.String str49 = compiler41.toSource(node48);
        intermediateState39.externsRoot = node48;
        java.io.PrintStream printStream51 = null;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(printStream51);
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler52.getOptions();
        java.io.PrintStream printStream54 = null;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler(printStream54);
        compiler55.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler55.options;
        com.google.javascript.rhino.Node node59 = compiler55.parseTestCode("");
        java.lang.String str60 = compiler52.toSource(node59);
        intermediateState39.externsRoot = node59;
        compiler20.externsRoot = node59;
        compiler0.externsRoot = node59;
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(compilerInput26);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(compilerInput38);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(compilerOptions53);
        org.junit.Assert.assertNull(compilerOptions57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler1.tracker = performanceTracker22;
        com.google.javascript.jscomp.Tracer tracer25 = compiler1.newTracer("hi!hi!");
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNotNull(tracer25);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.getOptions();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler11.options;
        com.google.javascript.rhino.Node node15 = compiler11.parseTestCode("");
        java.lang.String str16 = compiler8.toSource(node15);
        java.lang.String str17 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.options;
        com.google.javascript.rhino.Node node25 = compiler21.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler21.options;
        com.google.javascript.jscomp.Result result27 = compiler8.compile(jSSourceFileArray18, jSModuleArray19, compilerOptions26);
        compiler1.options = compilerOptions26;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap29 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler1.options;
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler33.getVariableMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier39 = compiler33.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler33.getCodingConvention();
        compiler1.defaultCodingConvention = codingConvention40;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState42 = compiler1.getState();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray18, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray19);
        org.junit.Assert.assertArrayEquals(jSModuleArray19, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(result27);
        org.junit.Assert.assertNull(cssRenamingMap29);
        org.junit.Assert.assertNull(scopeCreator30);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNotNull(strSupplier39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNotNull(intermediateState42);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        com.google.javascript.rhino.Node node10 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler12.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler12.getState();
        com.google.javascript.rhino.Node node21 = compiler12.parseTestCode("hi!");
        boolean boolean22 = compiler12.isNormalized();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder23 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = codeBuilder23.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = codeBuilder23.append("hi!");
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput36 = compiler30.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler30.getState();
        com.google.javascript.rhino.Node node39 = compiler30.parseTestCode("hi!");
        compiler12.toSource(codeBuilder23, (int) (byte) 10, node39);
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput49 = compiler43.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState50 = compiler43.getState();
        com.google.javascript.rhino.Node node52 = compiler43.parseTestCode("hi!");
        boolean boolean53 = compiler43.isNormalized();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder54 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder56 = codeBuilder54.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder58 = codeBuilder54.append("hi!");
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        compiler61.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.options;
        com.google.javascript.rhino.Node node65 = compiler61.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput67 = compiler61.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState68 = compiler61.getState();
        com.google.javascript.rhino.Node node70 = compiler61.parseTestCode("hi!");
        compiler43.toSource(codeBuilder54, (int) (byte) 10, node70);
        compiler1.toSource(codeBuilder23, 1, node70);
        java.io.PrintStream printStream73 = null;
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler(printStream73);
        compiler74.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler74.options;
        com.google.javascript.rhino.Node node78 = compiler74.parseTestCode("");
        java.io.PrintStream printStream79 = null;
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler(printStream79);
        compiler80.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler80.options;
        com.google.javascript.rhino.Node node84 = compiler80.parseTestCode("");
        java.lang.String str85 = compiler74.toSource(node84);
        com.google.javascript.jscomp.CodingConvention codingConvention86 = compiler74.getCodingConvention();
        com.google.javascript.rhino.Node node87 = compiler74.externAndJsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager88 = compiler74.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention89 = compiler74.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention89;
        java.lang.String str91 = compiler1.toSource();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(codeBuilder25);
        org.junit.Assert.assertNotNull(codeBuilder27);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(compilerInput36);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(compilerInput49);
        org.junit.Assert.assertNotNull(intermediateState50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(codeBuilder56);
        org.junit.Assert.assertNotNull(codeBuilder58);
        org.junit.Assert.assertNull(compilerOptions63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(compilerInput67);
        org.junit.Assert.assertNotNull(intermediateState68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(compilerOptions82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(codingConvention86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(errorManager88);
        org.junit.Assert.assertNotNull(codingConvention89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler1.getTypeValidator();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        compiler8.options = compilerOptions11;
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph17 = compiler14.getModuleGraph();
        com.google.javascript.jscomp.Scope scope18 = compiler14.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler14.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = compiler14.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler14.getOptions();
        compiler8.options = compilerOptions21;
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph27 = compiler24.getModuleGraph();
        com.google.javascript.jscomp.Scope scope28 = compiler24.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler24.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig30 = compiler24.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler24.getState();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler33.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = compiler33.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap36 = compiler33.getFunctionalInformationMap();
        compiler33.resetUniqueNameId();
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler39.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator41 = compiler39.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap42 = compiler39.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler39.getState();
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        compiler45.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler45.options;
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler45.getSourceMap();
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler50.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = compiler50.getScopeCreator();
        java.io.PrintStream printStream53 = null;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler(printStream53);
        compiler54.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler54.options;
        com.google.javascript.rhino.Node node58 = compiler54.parseTestCode("");
        compiler50.externsRoot = node58;
        compiler45.jsRoot = node58;
        intermediateState43.externsRoot = node58;
        com.google.javascript.rhino.Node node62 = intermediateState43.externsRoot;
        java.lang.String str63 = compiler33.toSource(node62);
        compiler24.prepareAst(node62);
        compiler8.jsRoot = node62;
        java.io.PrintStream printStream66 = null;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(printStream66);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler67.getOptions();
        java.io.PrintStream printStream69 = null;
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler(printStream69);
        compiler70.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.options;
        com.google.javascript.rhino.Node node74 = compiler70.parseTestCode("");
        java.lang.String str75 = compiler67.toSource(node74);
        com.google.javascript.rhino.Node node76 = null;
        compiler67.externAndJsRoot = node76;
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = compiler67.getOptions();
        compiler8.initOptions(compilerOptions78);
        compiler1.initOptions(compilerOptions78);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(typeValidator6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNull(jSModuleGraph17);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNull(scopeCreator20);
        org.junit.Assert.assertNotNull(compilerOptions21);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(jSModuleGraph27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(passConfig30);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNull(scopeCreator35);
        org.junit.Assert.assertNull(functionInformationMap36);
        org.junit.Assert.assertNull(compilerOptions40);
        org.junit.Assert.assertNull(scopeCreator41);
        org.junit.Assert.assertNull(functionInformationMap42);
        org.junit.Assert.assertNotNull(intermediateState43);
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNull(sourceMap48);
        org.junit.Assert.assertNull(compilerOptions51);
        org.junit.Assert.assertNull(scopeCreator52);
        org.junit.Assert.assertNull(compilerOptions56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(compilerOptions68);
        org.junit.Assert.assertNull(compilerOptions72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(compilerOptions78);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        boolean boolean9 = compiler1.isInliningForbidden();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!hi!", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "hi!hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!hi!", "hi!", "hi!hi!", "hi!hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.stripCode((java.util.Set<java.lang.String>) strSet15, (java.util.Set<java.lang.String>) strSet22, (java.util.Set<java.lang.String>) strSet26, (java.util.Set<java.lang.String>) strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!hi!", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "hi!hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!hi!", "hi!", "hi!hi!", "hi!hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        compiler1.addToDebugLog("");
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNull(scopeCreator7);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler1.getState();
        boolean boolean4 = compiler1.precheck();
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler1.createPassConfigInternal();
        com.google.javascript.rhino.Node node8 = compiler1.parseSyntheticCode("hi!hi!", "");
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getPropertyMap();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        compiler7.options = compilerOptions10;
        com.google.javascript.rhino.Node node12 = compiler7.externAndJsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler7.getState();
        compiler1.setState(intermediateState13);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(intermediateState13);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler12.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention14;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler1.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler1.getMessages();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertArrayEquals(jSErrorArray18, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler5.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler5.getScopeCreator();
        com.google.javascript.rhino.Node node8 = compiler5.jsRoot;
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph13 = compiler10.getModuleGraph();
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        compiler5.setErrorManager(errorManager15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager15);
        compiler0.setErrorManager(errorManager15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler0.options;
        com.google.javascript.rhino.Node node20 = compiler0.externsRoot;
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNull(jSModuleGraph13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler5.getPassConfig();
        compiler1.setPassConfig(passConfig7);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap13 = compiler10.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        compiler10.options = compilerOptions15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler17.defaultCodingConvention;
        boolean boolean20 = compiler17.precheck();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        compiler21.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable24 = compiler21.acquireSymbolTable();
        compiler17.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable24);
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable24);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable24);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange28 = compiler1.recentChange;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNotNull(passConfig7);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNull(functionInformationMap13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNotNull(symbolTable24);
        org.junit.Assert.assertNotNull(recentChange28);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler6.options;
        compiler1.options = compilerOptions11;
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = compiler1.getUniqueNameIdSupplier();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getPropertyMap();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        java.lang.String str15 = compiler7.toSource(node14);
        com.google.javascript.rhino.Node node16 = null;
        compiler7.externAndJsRoot = node16;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler7.getOptions();
        compiler1.initOptions(compilerOptions18);
        compiler1.addToDebugLog("hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(compilerOptions18);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        java.lang.String str7 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler1.getErrors();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        compiler10.options = compilerOptions13;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph19 = compiler16.getModuleGraph();
        com.google.javascript.jscomp.Scope scope20 = compiler16.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler16.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = compiler16.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler16.getOptions();
        compiler10.options = compilerOptions23;
        compiler1.initOptions(compilerOptions23);
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(jSModuleGraph19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNull(scopeCreator22);
        org.junit.Assert.assertNotNull(compilerOptions23);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node8 = compiler1.externsRoot;
        boolean boolean9 = compiler1.isTypeCheckingEnabled();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler1.getErrors();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertArrayEquals(jSErrorArray12, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler1.getOptions();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler12.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = compiler12.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler12.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler12.getModuleGraph();
        com.google.javascript.rhino.Node node18 = compiler12.parseTestCode("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = codeBuilder19.append("");
        codeBuilder19.reset();
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        compiler25.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.options;
        com.google.javascript.rhino.Node node29 = compiler25.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput31 = compiler25.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler25.getState();
        com.google.javascript.rhino.Node node34 = compiler25.parseTestCode("hi!");
        compiler12.toSource(codeBuilder19, (int) '4', node34);
        compiler1.jsRoot = node34;
        java.lang.String str39 = compiler1.getSourceLine("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", (int) (byte) 0);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNull(scopeCreator14);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(codeBuilder21);
        org.junit.Assert.assertNull(compilerOptions27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(compilerInput31);
        org.junit.Assert.assertNotNull(intermediateState32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler1.getVariableMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler1.getErrors();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(scopeCreator10);
        org.junit.Assert.assertNull(variableMap11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertArrayEquals(jSErrorArray12, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler1.defaultCodingConvention;
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        int int22 = compiler1.getWarningCount();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler24.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler24.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler24.options;
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler31.getOptions();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.options;
        com.google.javascript.rhino.Node node38 = compiler34.parseTestCode("");
        java.lang.String str39 = compiler31.toSource(node38);
        java.lang.String str40 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler44.options;
        com.google.javascript.jscomp.Result result50 = compiler31.compile(jSSourceFileArray41, jSModuleArray42, compilerOptions49);
        com.google.javascript.jscomp.ScopeCreator scopeCreator51 = compiler31.getScopeCreator();
        boolean boolean52 = compiler31.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker53 = compiler31.tracker;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange54 = compiler31.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange54);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange54);
        compiler1.initInputsByNameMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNull(compilerOptions36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray42);
        org.junit.Assert.assertArrayEquals(jSModuleArray42, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(result50);
        org.junit.Assert.assertNull(scopeCreator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(performanceTracker53);
        org.junit.Assert.assertNotNull(recentChange54);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler1.getMessages();
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler1.getWarnings();
        boolean boolean18 = compiler1.hasErrors();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler1.getState();
        com.google.javascript.rhino.Node node10 = compiler1.parseTestCode("hi!");
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler12.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler12.getState();
        com.google.javascript.rhino.Node node21 = compiler12.parseTestCode("hi!");
        boolean boolean22 = compiler12.isNormalized();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder23 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = codeBuilder23.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = codeBuilder23.append("hi!");
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput36 = compiler30.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler30.getState();
        com.google.javascript.rhino.Node node39 = compiler30.parseTestCode("hi!");
        compiler12.toSource(codeBuilder23, (int) (byte) 10, node39);
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput49 = compiler43.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState50 = compiler43.getState();
        com.google.javascript.rhino.Node node52 = compiler43.parseTestCode("hi!");
        boolean boolean53 = compiler43.isNormalized();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder54 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder56 = codeBuilder54.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder58 = codeBuilder54.append("hi!");
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        compiler61.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.options;
        com.google.javascript.rhino.Node node65 = compiler61.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput67 = compiler61.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState68 = compiler61.getState();
        com.google.javascript.rhino.Node node70 = compiler61.parseTestCode("hi!");
        compiler43.toSource(codeBuilder54, (int) (byte) 10, node70);
        compiler1.toSource(codeBuilder23, 1, node70);
        java.io.PrintStream printStream73 = null;
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler(printStream73);
        compiler74.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler74.options;
        com.google.javascript.rhino.Node node78 = compiler74.parseTestCode("");
        java.io.PrintStream printStream79 = null;
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler(printStream79);
        compiler80.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler80.options;
        com.google.javascript.rhino.Node node84 = compiler80.parseTestCode("");
        java.lang.String str85 = compiler74.toSource(node84);
        com.google.javascript.jscomp.CodingConvention codingConvention86 = compiler74.getCodingConvention();
        com.google.javascript.rhino.Node node87 = compiler74.externAndJsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager88 = compiler74.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention89 = compiler74.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention89;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(codeBuilder25);
        org.junit.Assert.assertNotNull(codeBuilder27);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(compilerInput36);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(compilerInput49);
        org.junit.Assert.assertNotNull(intermediateState50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(codeBuilder56);
        org.junit.Assert.assertNotNull(codeBuilder58);
        org.junit.Assert.assertNull(compilerOptions63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(compilerInput67);
        org.junit.Assert.assertNotNull(intermediateState68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(compilerOptions82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(codingConvention86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(errorManager88);
        org.junit.Assert.assertNotNull(codingConvention89);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        compiler1.jsRoot = node14;
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        compiler18.jsRoot = node26;
        compiler1.externAndJsRoot = node26;
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap33 = compiler30.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope34 = compiler30.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        compiler30.options = compilerOptions35;
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler38.getOptions();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        compiler41.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.options;
        com.google.javascript.rhino.Node node45 = compiler41.parseTestCode("");
        java.lang.String str46 = compiler38.toSource(node45);
        java.lang.String str47 = compiler38.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray48 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray49 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream50 = null;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler(printStream50);
        compiler51.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.options;
        com.google.javascript.rhino.Node node55 = compiler51.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler51.options;
        com.google.javascript.jscomp.Result result57 = compiler38.compile(jSSourceFileArray48, jSModuleArray49, compilerOptions56);
        compiler30.options = compilerOptions56;
        compiler1.options = compilerOptions56;
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        compiler61.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.options;
        com.google.javascript.rhino.Node node65 = compiler61.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput67 = compiler61.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState68 = compiler61.getState();
        com.google.javascript.rhino.Node node70 = compiler61.parseTestCode("hi!");
        java.io.PrintStream printStream71 = null;
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler(printStream71);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler72.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator74 = compiler72.getScopeCreator();
        compiler72.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable76 = compiler72.acquireSymbolTable();
        compiler61.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable76);
        java.io.PrintStream printStream78 = null;
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler(printStream78);
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = compiler79.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = compiler79.getScopeCreator();
        java.io.PrintStream printStream82 = null;
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler(printStream82);
        compiler83.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler83.options;
        com.google.javascript.rhino.Node node87 = compiler83.parseTestCode("");
        compiler79.externsRoot = node87;
        compiler61.prepareAst(node87);
        java.lang.String str90 = compiler1.toSource(node87);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker91 = null;
        compiler1.tracker = performanceTracker91;
        com.google.javascript.jscomp.CompilerOptions compilerOptions93 = compiler1.options;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(functionInformationMap33);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNull(compilerOptions43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray48);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray48, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray49);
        org.junit.Assert.assertArrayEquals(jSModuleArray49, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNotNull(result57);
        org.junit.Assert.assertNull(compilerOptions63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(compilerInput67);
        org.junit.Assert.assertNotNull(intermediateState68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(compilerOptions73);
        org.junit.Assert.assertNull(scopeCreator74);
        org.junit.Assert.assertNotNull(symbolTable76);
        org.junit.Assert.assertNull(compilerOptions80);
        org.junit.Assert.assertNull(scopeCreator81);
        org.junit.Assert.assertNull(compilerOptions85);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(compilerOptions93);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        compiler5.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.options;
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("");
        compiler1.jsRoot = node9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler1.tracker = performanceTracker11;
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.defaultCodingConvention;
        boolean boolean14 = compiler1.isNormalized();
        com.google.javascript.jscomp.JSError jSError15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compiler0.setCssRenamingMap(cssRenamingMap7);
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        java.lang.String str7 = compiler0.getSourceLine("hi!", (-1));
        compiler0.addToDebugLog("");
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler1.getPassConfig();
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler1.getTypeValidator();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNotNull(typeValidator6);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        com.google.javascript.rhino.Node node14 = compiler1.externAndJsRoot;
        com.google.javascript.rhino.Node node16 = compiler1.parseTestCode("hi!");
        com.google.javascript.rhino.Node node17 = compiler1.getRoot();
        com.google.javascript.jscomp.Tracer tracer19 = compiler1.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap20 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler1.getErrors();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(tracer19);
        org.junit.Assert.assertNull(cssRenamingMap20);
        org.junit.Assert.assertNotNull(jSErrorArray21);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        compiler1.initCompilerOptionsIfTesting();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler9.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = compiler9.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap12 = compiler9.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope13 = compiler9.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        compiler9.options = compilerOptions14;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler16.defaultCodingConvention;
        boolean boolean19 = compiler16.precheck();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler20.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable23 = compiler20.acquireSymbolTable();
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler9.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable23);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler1.tracker;
        com.google.javascript.jscomp.CompilerPass compilerPass28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.process(compilerPass28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(scopeCreator11);
        org.junit.Assert.assertNull(functionInformationMap12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(symbolTable23);
        org.junit.Assert.assertNull(performanceTracker27);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        compiler1.addToDebugLog("hi!");
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler17.toSource(node24);
        java.lang.String str26 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray27 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray28 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler30.options;
        com.google.javascript.jscomp.Result result36 = compiler17.compile(jSSourceFileArray27, jSModuleArray28, compilerOptions35);
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = compiler17.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler17.getOptions();
        compiler1.options = compilerOptions38;
        com.google.javascript.jscomp.JSError[] jSErrorArray40 = compiler1.getWarnings();
        boolean boolean41 = compiler1.hasErrors();
        com.google.javascript.jscomp.CompilerInput compilerInput43 = compiler1.getInput("hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray27);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray27, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray28);
        org.junit.Assert.assertArrayEquals(jSModuleArray28, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(compilerOptions35);
        org.junit.Assert.assertNotNull(result36);
        org.junit.Assert.assertNull(scopeCreator37);
        org.junit.Assert.assertNotNull(compilerOptions38);
        org.junit.Assert.assertNotNull(jSErrorArray40);
        org.junit.Assert.assertArrayEquals(jSErrorArray40, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(compilerInput43);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node4 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compiler1.setCssRenamingMap(cssRenamingMap7);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph13 = compiler10.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        compiler14.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler14.getPassConfig();
        compiler10.setPassConfig(passConfig16);
        compiler10.reportCodeChange();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler20.getOptions();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        compiler20.externAndJsRoot = node27;
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap33 = compiler30.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope34 = compiler30.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = null;
        compiler30.options = compilerOptions35;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        compiler37.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention39 = compiler37.defaultCodingConvention;
        boolean boolean40 = compiler37.precheck();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        compiler41.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention43 = compiler41.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable44 = compiler41.acquireSymbolTable();
        compiler37.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable44);
        compiler30.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable44);
        compiler20.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable44);
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable44);
        com.google.javascript.rhino.Node node51 = compiler10.parseSyntheticCode("", "hi!hi!");
        compiler10.addToDebugLog("");
        java.io.PrintStream printStream54 = null;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler(printStream54);
        compiler55.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler55.options;
        com.google.javascript.rhino.Node node59 = compiler55.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler55.getVariableMap();
        compiler55.initCompilerOptionsIfTesting();
        java.io.PrintStream printStream62 = null;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler(printStream62);
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = compiler63.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator65 = compiler63.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap66 = compiler63.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope67 = compiler63.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = null;
        compiler63.options = compilerOptions68;
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        compiler70.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention72 = compiler70.defaultCodingConvention;
        boolean boolean73 = compiler70.precheck();
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler();
        compiler74.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention76 = compiler74.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable77 = compiler74.acquireSymbolTable();
        compiler70.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable77);
        compiler63.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable77);
        compiler55.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable77);
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable77);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable77);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNotNull(passConfig6);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNull(jSModuleGraph13);
        org.junit.Assert.assertNotNull(passConfig16);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(functionInformationMap33);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(codingConvention43);
        org.junit.Assert.assertNotNull(symbolTable44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(compilerOptions57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(variableMap60);
        org.junit.Assert.assertNull(compilerOptions64);
        org.junit.Assert.assertNull(scopeCreator65);
        org.junit.Assert.assertNull(functionInformationMap66);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNotNull(codingConvention72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(codingConvention76);
        org.junit.Assert.assertNotNull(symbolTable77);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler12.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention14;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager16);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(errorManager16);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = compiler0.getScopeCreator();
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(scopeCreator6);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Result result14 = compiler13.getResult();
        com.google.javascript.rhino.Node node15 = compiler13.getRoot();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        compiler17.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.options;
        com.google.javascript.rhino.Node node21 = compiler17.parseTestCode("");
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        java.lang.String str28 = compiler17.toSource(node27);
        com.google.javascript.jscomp.CodingConvention codingConvention29 = compiler17.getCodingConvention();
        compiler17.addToDebugLog("hi!");
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler33.getOptions();
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        compiler36.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler36.options;
        com.google.javascript.rhino.Node node40 = compiler36.parseTestCode("");
        java.lang.String str41 = compiler33.toSource(node40);
        java.lang.String str42 = compiler33.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        compiler46.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler46.options;
        com.google.javascript.rhino.Node node50 = compiler46.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler46.options;
        com.google.javascript.jscomp.Result result52 = compiler33.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions51);
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = compiler33.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler33.getOptions();
        compiler17.options = compilerOptions54;
        com.google.javascript.jscomp.JSError[] jSErrorArray56 = compiler17.getWarnings();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange57 = compiler17.recentChange;
        compiler13.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange57);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile59 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray60 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream61 = null;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler(printStream61);
        compiler62.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = compiler62.options;
        com.google.javascript.rhino.Node node66 = compiler62.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput68 = compiler62.getInput("");
        int int69 = compiler62.getWarningCount();
        java.lang.String str70 = compiler62.toSource();
        java.io.PrintStream printStream71 = null;
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler(printStream71);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler72.getOptions();
        java.io.PrintStream printStream74 = null;
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler(printStream74);
        compiler75.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions77 = compiler75.options;
        com.google.javascript.rhino.Node node79 = compiler75.parseTestCode("");
        java.lang.String str80 = compiler72.toSource(node79);
        java.lang.String str81 = compiler72.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray82 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray83 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream84 = null;
        com.google.javascript.jscomp.Compiler compiler85 = new com.google.javascript.jscomp.Compiler(printStream84);
        compiler85.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions87 = compiler85.options;
        com.google.javascript.rhino.Node node89 = compiler85.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions90 = compiler85.options;
        com.google.javascript.jscomp.Result result91 = compiler72.compile(jSSourceFileArray82, jSModuleArray83, compilerOptions90);
        compiler62.initOptions(compilerOptions90);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result93 = compiler13.compile(jSSourceFile59, jSModuleArray60, compilerOptions90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(codingConvention29);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray43);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray43, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray44);
        org.junit.Assert.assertArrayEquals(jSModuleArray44, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(result52);
        org.junit.Assert.assertNull(scopeCreator53);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNotNull(jSErrorArray56);
        org.junit.Assert.assertArrayEquals(jSErrorArray56, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange57);
        org.junit.Assert.assertNotNull(jSModuleArray60);
        org.junit.Assert.assertArrayEquals(jSModuleArray60, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(compilerInput68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(compilerOptions73);
        org.junit.Assert.assertNull(compilerOptions77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray82);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray82, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray83);
        org.junit.Assert.assertArrayEquals(jSModuleArray83, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions87);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(compilerOptions90);
        org.junit.Assert.assertNotNull(result91);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.TypeValidator typeValidator4 = compiler1.getTypeValidator();
        compiler1.setNormalized();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler1.createPassConfigInternal();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(typeValidator4);
        org.junit.Assert.assertNotNull(passConfig6);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler5.getOptions();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.options;
        com.google.javascript.rhino.Node node12 = compiler8.parseTestCode("");
        java.lang.String str13 = compiler5.toSource(node12);
        java.lang.String str14 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler18.options;
        com.google.javascript.jscomp.Result result24 = compiler5.compile(jSSourceFileArray15, jSModuleArray16, compilerOptions23);
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        compiler27.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.options;
        com.google.javascript.rhino.Node node31 = compiler27.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler27.options;
        compiler0.init(jSSourceFileArray15, jSModuleArray25, compilerOptions32);
        compiler0.setNormalized();
        com.google.javascript.jscomp.JSError[] jSErrorArray35 = compiler0.getWarnings();
        boolean boolean36 = compiler0.isNormalized();
        com.google.javascript.rhino.Node node38 = compiler0.parseSyntheticCode("hi!");
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray15, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertArrayEquals(jSModuleArray16, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(compilerOptions23);
        org.junit.Assert.assertNotNull(result24);
        org.junit.Assert.assertNotNull(jSModuleArray25);
        org.junit.Assert.assertArrayEquals(jSModuleArray25, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(jSErrorArray35);
        org.junit.Assert.assertArrayEquals(jSErrorArray35, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Result result14 = compiler13.getResult();
        compiler13.setNormalized();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = compiler13.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(result14);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = codeBuilder5.append("");
        codeBuilder5.reset();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler11.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = compiler11.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler11.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph15 = compiler11.getModuleGraph();
        com.google.javascript.rhino.Node node17 = compiler11.parseTestCode("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder20 = codeBuilder18.append("");
        codeBuilder18.reset();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.rhino.Node node28 = compiler24.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput30 = compiler24.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler24.getState();
        com.google.javascript.rhino.Node node33 = compiler24.parseTestCode("hi!");
        compiler11.toSource(codeBuilder18, (int) '4', node33);
        compiler0.toSource(codeBuilder5, (int) (short) 10, node33);
        com.google.javascript.jscomp.JSError[] jSErrorArray36 = compiler0.getWarnings();
        boolean boolean37 = compiler0.isNormalized();
        java.io.PrintStream printStream38 = null;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(printStream38);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler39.getOptions();
        com.google.javascript.jscomp.Scope scope41 = compiler39.getTopScope();
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        compiler39.jsRoot = node47;
        compiler39.initCompilerOptionsIfTesting();
        boolean boolean50 = compiler39.isInliningForbidden();
        java.io.PrintStream printStream51 = null;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(printStream51);
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler52.getOptions();
        java.io.PrintStream printStream54 = null;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler(printStream54);
        compiler55.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler55.options;
        com.google.javascript.rhino.Node node59 = compiler55.parseTestCode("");
        java.lang.String str60 = compiler52.toSource(node59);
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler52.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray62 = compiler52.getErrors();
        compiler52.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState64 = compiler52.getState();
        java.io.PrintStream printStream65 = null;
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler(printStream65);
        compiler66.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler66.options;
        com.google.javascript.jscomp.SourceMap sourceMap69 = compiler66.getSourceMap();
        com.google.javascript.rhino.Node node71 = compiler66.parseTestCode("");
        intermediateState64.externsRoot = node71;
        compiler39.prepareAst(node71);
        java.io.PrintStream printStream74 = null;
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler(printStream74);
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler75.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator77 = compiler75.getScopeCreator();
        com.google.javascript.rhino.Node node78 = compiler75.jsRoot;
        java.io.PrintStream printStream79 = null;
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler(printStream79);
        compiler80.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler80.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph83 = compiler80.getModuleGraph();
        com.google.javascript.jscomp.Scope scope84 = compiler80.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager85 = compiler80.getErrorManager();
        compiler75.setErrorManager(errorManager85);
        com.google.javascript.jscomp.Compiler compiler87 = new com.google.javascript.jscomp.Compiler(errorManager85);
        com.google.javascript.jscomp.Compiler compiler88 = new com.google.javascript.jscomp.Compiler(errorManager85);
        com.google.javascript.jscomp.Compiler compiler89 = new com.google.javascript.jscomp.Compiler(errorManager85);
        com.google.javascript.rhino.Node node91 = compiler89.parseTestCode("");
        boolean boolean92 = compiler0.areNodesEqualForInlining(node71, node91);
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(codeBuilder7);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNull(scopeCreator13);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(jSModuleGraph15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(codeBuilder20);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(compilerInput30);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSErrorArray36);
        org.junit.Assert.assertArrayEquals(jSErrorArray36, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(compilerOptions40);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(compilerOptions53);
        org.junit.Assert.assertNull(compilerOptions57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNotNull(jSErrorArray62);
        org.junit.Assert.assertArrayEquals(jSErrorArray62, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState64);
        org.junit.Assert.assertNull(compilerOptions68);
        org.junit.Assert.assertNull(sourceMap69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNull(scopeCreator77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNull(compilerOptions82);
        org.junit.Assert.assertNull(jSModuleGraph83);
        org.junit.Assert.assertNull(scope84);
        org.junit.Assert.assertNotNull(errorManager85);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler13.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler17.getPassConfig();
        compiler13.setPassConfig(passConfig19);
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler22.getVariableMap();
        compiler22.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler22.getOptions();
        compiler13.options = compilerOptions29;
        compiler1.options = compilerOptions29;
        com.google.javascript.jscomp.SymbolTable symbolTable32 = compiler1.acquireSymbolTable();
        compiler1.setNormalized();
        java.lang.String str34 = compiler1.getAstDotGraph();
        compiler1.initCompilerOptionsIfTesting();
        compiler1.setNormalized();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray37 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNotNull(passConfig19);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(symbolTable32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler5.getOptions();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.options;
        com.google.javascript.rhino.Node node12 = compiler8.parseTestCode("");
        java.lang.String str13 = compiler5.toSource(node12);
        java.lang.String str14 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler18.options;
        com.google.javascript.jscomp.Result result24 = compiler5.compile(jSSourceFileArray15, jSModuleArray16, compilerOptions23);
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        compiler27.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.options;
        com.google.javascript.rhino.Node node31 = compiler27.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler27.options;
        compiler0.init(jSSourceFileArray15, jSModuleArray25, compilerOptions32);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler0.getPassConfig();
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        compiler37.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.options;
        com.google.javascript.rhino.Node node41 = compiler37.parseTestCode("");
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        java.lang.String str48 = compiler37.toSource(node47);
        com.google.javascript.jscomp.CodingConvention codingConvention49 = compiler37.getCodingConvention();
        com.google.javascript.rhino.Node node50 = compiler37.externAndJsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler37.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(errorManager51);
        compiler0.setErrorManager(errorManager51);
        java.io.PrintStream printStream54 = null;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler(printStream54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler55.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator57 = compiler55.getScopeCreator();
        com.google.javascript.rhino.Node node58 = compiler55.jsRoot;
        java.io.PrintStream printStream59 = null;
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler(printStream59);
        compiler60.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler60.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph63 = compiler60.getModuleGraph();
        com.google.javascript.jscomp.Scope scope64 = compiler60.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler60.getErrorManager();
        compiler55.setErrorManager(errorManager65);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(errorManager65);
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler(errorManager65);
        compiler0.setErrorManager(errorManager65);
        com.google.javascript.jscomp.parsing.Config config70 = compiler0.getParserConfig();
        com.google.javascript.jscomp.parsing.Config config71 = compiler0.getParserConfig();
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray15, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertArrayEquals(jSModuleArray16, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(compilerOptions23);
        org.junit.Assert.assertNotNull(result24);
        org.junit.Assert.assertNotNull(jSModuleArray25);
        org.junit.Assert.assertArrayEquals(jSModuleArray25, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(codingConvention49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNull(compilerOptions56);
        org.junit.Assert.assertNull(scopeCreator57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(compilerOptions62);
        org.junit.Assert.assertNull(jSModuleGraph63);
        org.junit.Assert.assertNull(scope64);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(config70);
        org.junit.Assert.assertNotNull(config71);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        boolean boolean5 = compiler1.isNormalized();
        java.lang.String str8 = compiler1.getSourceLine("hi!", 0);
        compiler1.reportCodeChange();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler13.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler17.getPassConfig();
        compiler13.setPassConfig(passConfig19);
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler22.getVariableMap();
        compiler22.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler22.getOptions();
        compiler13.options = compilerOptions29;
        compiler1.options = compilerOptions29;
        com.google.javascript.rhino.Node node32 = compiler1.externsRoot;
        compiler1.disableThreads();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNotNull(passConfig19);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler5.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler5.getScopeCreator();
        com.google.javascript.rhino.Node node8 = compiler5.jsRoot;
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph13 = compiler10.getModuleGraph();
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        compiler5.setErrorManager(errorManager15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager15);
        compiler0.setErrorManager(errorManager15);
        compiler0.setUnnormalized();
        int int20 = compiler0.getErrorCount();
        com.google.javascript.rhino.Node node21 = compiler0.externsRoot;
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNull(jSModuleGraph13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        boolean boolean3 = codeBuilder0.endsWith("hi!");
        codeBuilder0.reset();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder0.append("hi!hi!");
        int int7 = codeBuilder6.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(codeBuilder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getErrors();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap11 = compiler1.getFunctionalInformationMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertArrayEquals(jSErrorArray10, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(functionInformationMap11);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        compiler1.resetUniqueNameId();
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler7.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler7.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler7.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler7.getState();
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.options;
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler13.getSourceMap();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = compiler18.getScopeCreator();
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        compiler18.externsRoot = node26;
        compiler13.jsRoot = node26;
        intermediateState11.externsRoot = node26;
        com.google.javascript.rhino.Node node30 = intermediateState11.externsRoot;
        java.lang.String str31 = compiler1.toSource(node30);
        boolean boolean32 = compiler1.hasErrors();
        com.google.javascript.rhino.Node node33 = compiler1.externAndJsRoot;
        com.google.javascript.rhino.Node node34 = compiler1.externsRoot;
        java.lang.Exception exception36 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.throwInternalError("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", exception36);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?digraph AST {?  node [color=lightblue2, style=filled];?  node0 [label=\"SCRIPT\"];?  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];?}?");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator9);
        org.junit.Assert.assertNull(functionInformationMap10);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scopeCreator20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        boolean boolean3 = codeBuilder0.endsWith("hi!");
        codeBuilder0.reset();
        java.lang.String str5 = codeBuilder0.toString();
        codeBuilder0.reset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        compiler0.setUnnormalized();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler6.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler6.getState();
        boolean boolean14 = compiler6.isTypeCheckingEnabled();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler6.getSourceMap();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler17.toSource(node24);
        java.lang.String str26 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray27 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray28 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler30.options;
        com.google.javascript.jscomp.Result result36 = compiler17.compile(jSSourceFileArray27, jSModuleArray28, compilerOptions35);
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = compiler17.getScopeCreator();
        boolean boolean38 = compiler17.isInliningForbidden();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        compiler40.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.options;
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput46 = compiler40.getInput("");
        int int47 = compiler40.getWarningCount();
        boolean boolean48 = compiler40.hasErrors();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker50 = compiler49.tracker;
        boolean boolean51 = compiler49.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier52 = compiler49.getUniqueNameIdSupplier();
        java.io.PrintStream printStream53 = null;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler(printStream53);
        compiler54.setUnnormalized();
        com.google.javascript.jscomp.Scope scope56 = compiler54.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange57 = compiler54.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap58 = compiler54.getFunctionalInformationMap();
        java.io.PrintStream printStream59 = null;
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler(printStream59);
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler60.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator62 = compiler60.getScopeCreator();
        com.google.javascript.rhino.Node node63 = compiler60.jsRoot;
        java.io.PrintStream printStream64 = null;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler(printStream64);
        compiler65.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler65.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph68 = compiler65.getModuleGraph();
        com.google.javascript.jscomp.Scope scope69 = compiler65.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager70 = compiler65.getErrorManager();
        compiler60.setErrorManager(errorManager70);
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler(errorManager70);
        compiler54.setErrorManager(errorManager70);
        compiler49.setErrorManager(errorManager70);
        compiler40.setErrorManager(errorManager70);
        compiler17.setErrorManager(errorManager70);
        com.google.javascript.jscomp.CompilerOptions compilerOptions77 = null;
        compiler17.options = compilerOptions77;
        java.io.PrintStream printStream79 = null;
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler(printStream79);
        compiler80.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler80.options;
        com.google.javascript.rhino.Node node84 = compiler80.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput86 = compiler80.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState87 = compiler80.getState();
        com.google.javascript.rhino.Node node89 = compiler80.parseTestCode("hi!");
        compiler17.externAndJsRoot = node89;
        compiler6.prepareAst(node89);
        java.lang.String str92 = compiler0.toSource(node89);
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerInput12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray27);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray27, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray28);
        org.junit.Assert.assertArrayEquals(jSModuleArray28, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(compilerOptions35);
        org.junit.Assert.assertNotNull(result36);
        org.junit.Assert.assertNull(scopeCreator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(compilerInput46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(performanceTracker50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strSupplier52);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNotNull(recentChange57);
        org.junit.Assert.assertNull(functionInformationMap58);
        org.junit.Assert.assertNull(compilerOptions61);
        org.junit.Assert.assertNull(scopeCreator62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(compilerOptions67);
        org.junit.Assert.assertNull(jSModuleGraph68);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNotNull(errorManager70);
        org.junit.Assert.assertNull(compilerOptions82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNull(compilerInput86);
        org.junit.Assert.assertNotNull(intermediateState87);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler0.getTypeValidator();
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(typeValidator6);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        com.google.common.base.Supplier<java.lang.String> strSupplier25 = compiler23.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler23.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap28 = compiler1.getCssRenamingMap();
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        com.google.javascript.rhino.Node node33 = compiler30.jsRoot;
        java.io.PrintStream printStream34 = null;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler(printStream34);
        compiler35.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler35.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph38 = compiler35.getModuleGraph();
        com.google.javascript.jscomp.Scope scope39 = compiler35.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler35.getErrorManager();
        compiler30.setErrorManager(errorManager40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(errorManager40);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(errorManager40);
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(errorManager40);
        com.google.javascript.jscomp.PassConfig passConfig45 = compiler44.createPassConfigInternal();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: this.passes has already been assigned");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(strSupplier25);
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNull(cssRenamingMap28);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(compilerOptions37);
        org.junit.Assert.assertNull(jSModuleGraph38);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(passConfig45);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler1.tracker;
        compiler1.setUnnormalized();
        com.google.javascript.rhino.Node node26 = compiler1.parseTestCode("hi!");
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter27 = compiler1.getDefaultErrorReporter();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(errorReporter27);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = compiler6.getScopeCreator();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.externsRoot = node14;
        compiler1.jsRoot = node14;
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler18.getOptions();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        compiler18.jsRoot = node26;
        compiler1.externAndJsRoot = node26;
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler1.getPassConfig();
        com.google.javascript.jscomp.CompilerPass compilerPass30 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.process(compilerPass30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scopeCreator8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(compilerOptions19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(passConfig29);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler1.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler1.acquireSymbolTable();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler1.getWarnings();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = compiler1.toSourceArray(jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(symbolTable9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertArrayEquals(jSErrorArray10, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler5.getPassConfig();
        compiler1.setPassConfig(passConfig7);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler10.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = compiler10.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap13 = compiler10.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope14 = compiler10.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        compiler10.options = compilerOptions15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler17.defaultCodingConvention;
        boolean boolean20 = compiler17.precheck();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        compiler21.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable24 = compiler21.acquireSymbolTable();
        compiler17.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable24);
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable24);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable24);
        java.lang.String str28 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = compiler1.parse(jSSourceFile29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNotNull(passConfig7);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNull(scopeCreator12);
        org.junit.Assert.assertNull(functionInformationMap13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNotNull(symbolTable24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler5.getPassConfig();
        compiler1.setPassConfig(passConfig7);
        compiler1.reportCodeChange();
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.JsAst jsAst11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.addIncrementalSourceAst(jsAst11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNotNull(passConfig7);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        com.google.javascript.rhino.Node node14 = compiler1.externAndJsRoot;
        com.google.javascript.rhino.Node node16 = compiler1.parseTestCode("hi!");
        compiler1.addToDebugLog("hi!hi!");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler1.tracker = performanceTracker19;
        com.google.javascript.jscomp.Tracer tracer22 = compiler1.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(tracer22);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        boolean boolean6 = compiler1.precheck();
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler1.acquireSymbolTable();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler9.getOptions();
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        java.lang.String str17 = compiler9.toSource(node16);
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler19.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler19.getScopeCreator();
        com.google.javascript.jscomp.SymbolTable symbolTable22 = compiler19.acquireSymbolTable();
        compiler9.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable22);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable22);
        com.google.javascript.jscomp.PassConfig passConfig25 = compiler1.getPassConfig();
        com.google.javascript.rhino.Node node26 = compiler1.jsRoot;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = null;
        compiler1.tracker = performanceTracker27;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph29 = compiler1.getModuleGraph();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(symbolTable7);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNotNull(symbolTable22);
        org.junit.Assert.assertNotNull(passConfig25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(jSModuleGraph29);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compiler0.setCssRenamingMap(cssRenamingMap7);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = codeBuilder9.append("hi!");
        int int12 = codeBuilder9.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder14 = codeBuilder9.append("");
        int int15 = codeBuilder9.getLength();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = codeBuilder9.append("");
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler20.getOptions();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        java.lang.String str28 = compiler20.toSource(node27);
        compiler0.toSource(codeBuilder9, (int) (byte) 1, node27);
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(codeBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(codeBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(codeBuilder17);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler7.getErrors();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable12 = compiler9.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler9.getErrorManager();
        compiler7.setErrorManager(errorManager13);
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph19 = compiler16.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler20.getPassConfig();
        compiler16.setPassConfig(passConfig22);
        compiler7.setPassConfig(passConfig22);
        com.google.javascript.rhino.Node node26 = compiler7.parseTestCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"SCRIPT\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(symbolTable12);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(jSModuleGraph19);
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Scope scope13 = compiler1.getTopScope();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler1.getDefaultErrorReporter();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler1.getPropertyMap();
        compiler1.setNormalized();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNull(variableMap15);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        compiler1.options = compilerOptions4;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler6.acquireSymbolTable();
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable9);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile12 = null;
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler14.toSource(node24);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler14.getCodingConvention();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler14.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result28 = compiler1.compile(jSSourceFile11, jSSourceFile12, compilerOptions27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(symbolTable9);
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(compilerOptions27);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        compiler1.options = compilerOptions4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler1.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initInputsByNameMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler24.getOptions();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        compiler28.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.options;
        com.google.javascript.rhino.Node node32 = compiler28.parseTestCode("");
        compiler24.jsRoot = node32;
        compiler24.initCompilerOptionsIfTesting();
        int int35 = compiler24.getWarningCount();
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        compiler37.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.options;
        com.google.javascript.rhino.Node node41 = compiler37.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput43 = compiler37.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState44 = compiler37.getState();
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler46.getOptions();
        java.io.PrintStream printStream48 = null;
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler(printStream48);
        compiler49.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.options;
        com.google.javascript.rhino.Node node53 = compiler49.parseTestCode("");
        java.lang.String str54 = compiler46.toSource(node53);
        intermediateState44.externsRoot = node53;
        compiler24.externAndJsRoot = node53;
        compiler1.prepareAst(node53);
        boolean boolean58 = compiler1.isTypeCheckingEnabled();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(compilerInput43);
        org.junit.Assert.assertNotNull(intermediateState44);
        org.junit.Assert.assertNull(compilerOptions47);
        org.junit.Assert.assertNull(compilerOptions51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder23 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = codeBuilder23.append("hi!");
        int int26 = codeBuilder23.getColumnIndex();
        int int27 = codeBuilder23.getColumnIndex();
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler30.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph34 = compiler30.getModuleGraph();
        com.google.javascript.rhino.Node node36 = compiler30.parseTestCode("");
        compiler1.toSource(codeBuilder23, (int) (short) 100, node36);
        int int38 = codeBuilder23.getColumnIndex();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNotNull(codeBuilder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNull(jSModuleGraph34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler1.tracker;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler1.getVariableMap();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNull(variableMap10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler1.tracker;
        com.google.javascript.jscomp.Tracer tracer25 = compiler1.newTracer("");
        com.google.javascript.jscomp.TypeValidator typeValidator26 = compiler1.getTypeValidator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler1.getSourceMap();
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph33 = compiler30.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        compiler34.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler34.getPassConfig();
        compiler30.setPassConfig(passConfig36);
        compiler30.reportCodeChange();
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = compiler40.getOptions();
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        compiler40.externAndJsRoot = node47;
        java.io.PrintStream printStream49 = null;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler(printStream49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler50.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = compiler50.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap53 = compiler50.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope54 = compiler50.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = null;
        compiler50.options = compilerOptions55;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        compiler57.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention59 = compiler57.defaultCodingConvention;
        boolean boolean60 = compiler57.precheck();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        compiler61.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention63 = compiler61.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable64 = compiler61.acquireSymbolTable();
        compiler57.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable64);
        compiler50.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable64);
        compiler40.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable64);
        compiler30.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable64);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState69 = compiler30.getState();
        compiler1.setState(intermediateState69);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(tracer25);
        org.junit.Assert.assertNotNull(typeValidator26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNull(jSModuleGraph33);
        org.junit.Assert.assertNotNull(passConfig36);
        org.junit.Assert.assertNull(compilerOptions41);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(compilerOptions51);
        org.junit.Assert.assertNull(scopeCreator52);
        org.junit.Assert.assertNull(functionInformationMap53);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNotNull(codingConvention59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(codingConvention63);
        org.junit.Assert.assertNotNull(symbolTable64);
        org.junit.Assert.assertNotNull(intermediateState69);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler1.getState();
        com.google.javascript.rhino.Node node14 = intermediateState13.externsRoot;
        com.google.javascript.rhino.Node node15 = intermediateState13.externsRoot;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler1.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler1.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler1.options;
        com.google.javascript.rhino.Node node14 = compiler1.getRoot();
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = compiler1.getScopeCreator();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(scopeCreator15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler1.getState();
        boolean boolean4 = compiler1.precheck();
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler1.createPassConfigInternal();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(passConfig5);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler12.getState();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler17.toSource(node24);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler17.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray27 = compiler17.getErrors();
        compiler17.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler17.getState();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler31.getSourceMap();
        com.google.javascript.rhino.Node node36 = compiler31.parseTestCode("");
        intermediateState29.externsRoot = node36;
        intermediateState15.externsRoot = node36;
        compiler1.setState(intermediateState15);
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter40 = compiler1.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ScopeCreator scopeCreator41 = compiler1.getScopeCreator();
        java.lang.String str42 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSError[] jSErrorArray43 = compiler1.getWarnings();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(jSErrorArray27);
        org.junit.Assert.assertArrayEquals(jSErrorArray27, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter40);
        org.junit.Assert.assertNull(scopeCreator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(jSErrorArray43);
        org.junit.Assert.assertArrayEquals(jSErrorArray43, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getPropertyMap();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.options;
        com.google.javascript.rhino.Node node12 = compiler8.parseTestCode("");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler0.getState();
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(jSModuleGraph5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(intermediateState14);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        int int2 = codeBuilder0.getLength();
        boolean boolean4 = codeBuilder0.endsWith("hi!");
        codeBuilder0.reset();
        int int6 = codeBuilder0.getLength();
        int int7 = codeBuilder0.getLineIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler1.getState();
        boolean boolean4 = compiler1.precheck();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler1.tracker = performanceTracker5;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler1.getTypeRegistry();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler6.getInput("");
        int int13 = compiler6.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler6.getMessages();
        compiler6.resetUniqueNameId();
        compiler6.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler18.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable21 = compiler18.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler18.getErrorManager();
        boolean boolean23 = compiler18.isIdeMode();
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        compiler25.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.options;
        com.google.javascript.rhino.Node node29 = compiler25.parseTestCode("");
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        java.lang.String str36 = compiler25.toSource(node35);
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        compiler38.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.options;
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler38.getSourceMap();
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler43.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = compiler43.getScopeCreator();
        java.io.PrintStream printStream46 = null;
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler(printStream46);
        compiler47.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler47.options;
        com.google.javascript.rhino.Node node51 = compiler47.parseTestCode("");
        compiler43.externsRoot = node51;
        compiler38.jsRoot = node51;
        compiler25.externsRoot = node51;
        compiler18.externAndJsRoot = node51;
        intermediateState17.externsRoot = node51;
        compiler1.setState(intermediateState17);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerInput12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertArrayEquals(jSErrorArray14, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertNotNull(symbolTable21);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(compilerOptions27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(compilerOptions40);
        org.junit.Assert.assertNull(sourceMap41);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(scopeCreator45);
        org.junit.Assert.assertNull(compilerOptions49);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getPropertyMap();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler1.getSourceMap();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNull(sourceMap6);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.getOptions();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        compiler11.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler11.options;
        com.google.javascript.rhino.Node node15 = compiler11.parseTestCode("");
        java.lang.String str16 = compiler8.toSource(node15);
        java.lang.String str17 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        compiler21.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.options;
        com.google.javascript.rhino.Node node25 = compiler21.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler21.options;
        com.google.javascript.jscomp.Result result27 = compiler8.compile(jSSourceFileArray18, jSModuleArray19, compilerOptions26);
        compiler1.options = compilerOptions26;
        boolean boolean29 = compiler1.precheck();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        compiler37.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.options;
        com.google.javascript.rhino.Node node41 = compiler37.parseTestCode("");
        java.lang.String str42 = compiler31.toSource(node41);
        com.google.javascript.jscomp.CodingConvention codingConvention43 = compiler31.getCodingConvention();
        compiler31.resetUniqueNameId();
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        compiler46.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler46.options;
        com.google.javascript.rhino.Node node50 = compiler46.parseTestCode("");
        java.io.PrintStream printStream51 = null;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(printStream51);
        compiler52.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler52.options;
        com.google.javascript.rhino.Node node56 = compiler52.parseTestCode("");
        java.lang.String str57 = compiler46.toSource(node56);
        com.google.javascript.jscomp.CodingConvention codingConvention58 = compiler46.getCodingConvention();
        compiler46.addToDebugLog("hi!");
        java.io.PrintStream printStream61 = null;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler(printStream61);
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler62.getOptions();
        java.io.PrintStream printStream64 = null;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler(printStream64);
        compiler65.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler65.options;
        com.google.javascript.rhino.Node node69 = compiler65.parseTestCode("");
        java.lang.String str70 = compiler62.toSource(node69);
        java.lang.String str71 = compiler62.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray72 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray73 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream74 = null;
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler(printStream74);
        compiler75.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions77 = compiler75.options;
        com.google.javascript.rhino.Node node79 = compiler75.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = compiler75.options;
        com.google.javascript.jscomp.Result result81 = compiler62.compile(jSSourceFileArray72, jSModuleArray73, compilerOptions80);
        com.google.javascript.jscomp.ScopeCreator scopeCreator82 = compiler62.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions83 = compiler62.getOptions();
        compiler46.options = compilerOptions83;
        compiler31.options = compilerOptions83;
        com.google.javascript.jscomp.CompilerOptions compilerOptions86 = compiler31.options;
        compiler1.options = compilerOptions86;
        compiler1.resetUniqueNameId();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNull(compilerOptions13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray18, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray19);
        org.junit.Assert.assertArrayEquals(jSModuleArray19, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(result27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(codingConvention43);
        org.junit.Assert.assertNull(compilerOptions48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(compilerOptions54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(codingConvention58);
        org.junit.Assert.assertNull(compilerOptions63);
        org.junit.Assert.assertNull(compilerOptions67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray72);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray72, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray73);
        org.junit.Assert.assertArrayEquals(jSModuleArray73, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(compilerOptions80);
        org.junit.Assert.assertNotNull(result81);
        org.junit.Assert.assertNull(scopeCreator82);
        org.junit.Assert.assertNotNull(compilerOptions83);
        org.junit.Assert.assertNotNull(compilerOptions86);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap22 = compiler1.getCssRenamingMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig24 = compiler1.createPassConfigInternal();
        compiler1.startPass("hi!");
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertNull(cssRenamingMap22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertNotNull(passConfig24);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.getCodingConvention();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler1.getVariableMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler1.getState();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler1.getErrorManager();
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph19 = compiler16.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler20.getPassConfig();
        compiler16.setPassConfig(passConfig22);
        java.io.PrintStream printStream24 = null;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler(printStream24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler25.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = compiler25.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap28 = compiler25.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope29 = compiler25.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = null;
        compiler25.options = compilerOptions30;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        compiler32.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler32.defaultCodingConvention;
        boolean boolean35 = compiler32.precheck();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention38 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable39 = compiler36.acquireSymbolTable();
        compiler32.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable39);
        compiler25.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable39);
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable39);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler16.recentChange;
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange43);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(variableMap12);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(jSModuleGraph19);
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(scopeCreator27);
        org.junit.Assert.assertNull(functionInformationMap28);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNotNull(codingConvention34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(codingConvention38);
        org.junit.Assert.assertNotNull(symbolTable39);
        org.junit.Assert.assertNotNull(recentChange43);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.TypeValidator typeValidator4 = compiler1.getTypeValidator();
        compiler1.setNormalized();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler1.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap7 = compiler1.getFunctionalInformationMap();
        com.google.javascript.rhino.Node node10 = compiler1.parseSyntheticCode("", "");
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap11 = compiler1.getFunctionalInformationMap();
        boolean boolean12 = compiler1.hasErrors();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNotNull(typeValidator4);
        org.junit.Assert.assertNotNull(passConfig6);
        org.junit.Assert.assertNull(functionInformationMap7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(functionInformationMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler1.createPassConfigInternal();
        com.google.javascript.rhino.Node node4 = compiler1.externsRoot;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator5 = compiler0.getScopeCreator();
        com.google.javascript.jscomp.parsing.Config config6 = compiler0.getParserConfig();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compiler0.setCssRenamingMap(cssRenamingMap7);
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNull(scopeCreator5);
        org.junit.Assert.assertNotNull(config6);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!");
        boolean boolean13 = compiler1.isNormalized();
        java.lang.String str16 = compiler1.getSourceLine("", (int) '4');
        com.google.javascript.jscomp.Scope scope17 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node18 = compiler1.jsRoot;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(tracer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler1.getOptions();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler1.toSourceArray(jSModule9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNotNull(compilerOptions8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        boolean boolean4 = codeBuilder0.endsWith("hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder0.append("hi!");
        boolean boolean8 = codeBuilder6.endsWith("hi!hi!");
        int int9 = codeBuilder6.getLength();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(codeBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!");
        boolean boolean13 = compiler1.isNormalized();
        java.lang.String str16 = compiler1.getSourceLine("", (int) '4');
        java.lang.String str17 = compiler1.toSource();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput25 = compiler19.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler19.getState();
        com.google.javascript.rhino.Node node28 = compiler19.parseTestCode("hi!");
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler30.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = compiler30.getScopeCreator();
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.SymbolTable symbolTable34 = compiler30.acquireSymbolTable();
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable34);
        compiler1.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable34);
        com.google.javascript.jscomp.TypeValidator typeValidator37 = compiler1.getTypeValidator();
        com.google.javascript.rhino.Node node38 = compiler1.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier39 = compiler1.getUniqueNameIdSupplier();
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        java.lang.String str49 = compiler41.toSource(node48);
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = compiler41.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler41.getOptions();
        compiler1.options = compilerOptions51;
        compiler1.setNormalized();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(tracer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(compilerInput25);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(compilerOptions31);
        org.junit.Assert.assertNull(scopeCreator32);
        org.junit.Assert.assertNotNull(symbolTable34);
        org.junit.Assert.assertNotNull(typeValidator37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(strSupplier39);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(scopeCreator50);
        org.junit.Assert.assertNotNull(compilerOptions51);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler1.getOptions();
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        compiler9.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.options;
        com.google.javascript.rhino.Node node13 = compiler9.parseTestCode("");
        java.lang.String str14 = compiler6.toSource(node13);
        java.lang.String str15 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray17 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler19.options;
        com.google.javascript.jscomp.Result result25 = compiler6.compile(jSSourceFileArray16, jSModuleArray17, compilerOptions24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        compiler26.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler26.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention29 = compiler26.defaultCodingConvention;
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler31.getOptions();
        java.io.PrintStream printStream33 = null;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler(printStream33);
        compiler34.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.options;
        com.google.javascript.rhino.Node node38 = compiler34.parseTestCode("");
        java.lang.String str39 = compiler31.toSource(node38);
        java.lang.String str40 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        compiler44.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler44.options;
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler44.options;
        com.google.javascript.jscomp.Result result50 = compiler31.compile(jSSourceFileArray41, jSModuleArray42, compilerOptions49);
        com.google.javascript.jscomp.JSModule[] jSModuleArray51 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        compiler53.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler53.options;
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler53.options;
        compiler26.init(jSSourceFileArray41, jSModuleArray51, compilerOptions58);
        java.io.PrintStream printStream60 = null;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler(printStream60);
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler61.getOptions();
        java.io.PrintStream printStream63 = null;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler(printStream63);
        compiler64.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = compiler64.options;
        com.google.javascript.rhino.Node node68 = compiler64.parseTestCode("");
        java.lang.String str69 = compiler61.toSource(node68);
        java.lang.String str70 = compiler61.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray71 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray72 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream73 = null;
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler(printStream73);
        compiler74.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler74.options;
        com.google.javascript.rhino.Node node78 = compiler74.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler74.options;
        com.google.javascript.jscomp.Result result80 = compiler61.compile(jSSourceFileArray71, jSModuleArray72, compilerOptions79);
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = compiler61.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions82 = compiler61.getOptions();
        compiler1.init(jSSourceFileArray16, jSSourceFileArray41, compilerOptions82);
        com.google.javascript.jscomp.parsing.Config config84 = compiler1.getParserConfig();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(compilerOptions11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray16, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray17);
        org.junit.Assert.assertArrayEquals(jSModuleArray17, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(compilerOptions24);
        org.junit.Assert.assertNotNull(result25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNotNull(codingConvention29);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNull(compilerOptions36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray42);
        org.junit.Assert.assertArrayEquals(jSModuleArray42, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(result50);
        org.junit.Assert.assertNotNull(jSModuleArray51);
        org.junit.Assert.assertArrayEquals(jSModuleArray51, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(compilerOptions58);
        org.junit.Assert.assertNull(compilerOptions62);
        org.junit.Assert.assertNull(compilerOptions66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray71);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray71, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray72);
        org.junit.Assert.assertArrayEquals(jSModuleArray72, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNotNull(result80);
        org.junit.Assert.assertNull(scopeCreator81);
        org.junit.Assert.assertNotNull(compilerOptions82);
        org.junit.Assert.assertNotNull(config84);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node4 = compiler1.parseTestCode("");
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler6.getOptions();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        compiler10.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler10.options;
        com.google.javascript.rhino.Node node14 = compiler10.parseTestCode("");
        compiler6.jsRoot = node14;
        compiler6.initCompilerOptionsIfTesting();
        int int17 = compiler6.getWarningCount();
        java.io.PrintStream printStream18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(printStream18);
        compiler19.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.options;
        com.google.javascript.rhino.Node node23 = compiler19.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput25 = compiler19.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler19.getState();
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler28.getOptions();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        java.lang.String str36 = compiler28.toSource(node35);
        intermediateState26.externsRoot = node35;
        compiler6.externAndJsRoot = node35;
        compiler1.jsRoot = node35;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(compilerOptions7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(compilerInput25);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compiler0.setCssRenamingMap(cssRenamingMap7);
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        compiler0.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        java.lang.String str9 = compiler1.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler1.getErrorManager();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        compiler1.addToDebugLog("hi!");
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        compiler20.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.options;
        com.google.javascript.rhino.Node node24 = compiler20.parseTestCode("");
        java.lang.String str25 = compiler17.toSource(node24);
        java.lang.String str26 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray27 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray28 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler30.options;
        com.google.javascript.jscomp.Result result36 = compiler17.compile(jSSourceFileArray27, jSModuleArray28, compilerOptions35);
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = compiler17.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler17.getOptions();
        compiler1.options = compilerOptions38;
        com.google.javascript.jscomp.JSError[] jSErrorArray40 = compiler1.getWarnings();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler1.recentChange;
        boolean boolean42 = compiler1.isIdeMode();
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler44.getOptions();
        java.io.PrintStream printStream46 = null;
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler(printStream46);
        compiler47.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler47.options;
        com.google.javascript.rhino.Node node51 = compiler47.parseTestCode("");
        java.lang.String str52 = compiler44.toSource(node51);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = compiler44.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray54 = compiler44.getErrors();
        com.google.javascript.jscomp.SourceMap sourceMap55 = compiler44.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler44.options;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap57 = compiler44.getFunctionalInformationMap();
        com.google.javascript.rhino.Node node60 = compiler44.parseSyntheticCode("", "");
        compiler1.jsRoot = node60;
        com.google.javascript.rhino.Node node62 = compiler1.externsRoot;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray27);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray27, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray28);
        org.junit.Assert.assertArrayEquals(jSModuleArray28, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(compilerOptions35);
        org.junit.Assert.assertNotNull(result36);
        org.junit.Assert.assertNull(scopeCreator37);
        org.junit.Assert.assertNotNull(compilerOptions38);
        org.junit.Assert.assertNotNull(jSErrorArray40);
        org.junit.Assert.assertArrayEquals(jSErrorArray40, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNull(compilerOptions49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(codingConvention53);
        org.junit.Assert.assertNotNull(jSErrorArray54);
        org.junit.Assert.assertArrayEquals(jSErrorArray54, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(sourceMap55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNull(functionInformationMap57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node62);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        java.lang.String[] strArray21 = compiler1.toSourceArray();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler1.getPassConfig();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler24.getSourceMap();
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler29.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = compiler29.getScopeCreator();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        compiler29.externsRoot = node37;
        compiler24.jsRoot = node37;
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = compiler41.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler41.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph45 = compiler41.getModuleGraph();
        com.google.javascript.rhino.Node node47 = compiler41.parseTestCode("");
        compiler24.externAndJsRoot = node47;
        java.lang.String str49 = compiler1.toSource(node47);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState50 = compiler1.getState();
        com.google.javascript.rhino.Node node51 = compiler1.getRoot();
        java.io.PrintStream printStream52 = null;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler(printStream52);
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler53.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator55 = compiler53.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap56 = compiler53.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope57 = compiler53.getTopScope();
        boolean boolean58 = compiler53.precheck();
        com.google.javascript.jscomp.SymbolTable symbolTable59 = compiler53.acquireSymbolTable();
        com.google.javascript.rhino.Node node62 = compiler53.parseSyntheticCode("hi!", "");
        compiler1.jsRoot = node62;
        boolean boolean64 = compiler1.isNormalized();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNull(scopeCreator31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(scopeCreator43);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(jSModuleGraph45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(intermediateState50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(compilerOptions54);
        org.junit.Assert.assertNull(scopeCreator55);
        org.junit.Assert.assertNull(functionInformationMap56);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(symbolTable59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler1.getVariableMap();
        compiler1.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler1.getOptions();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler1.tracker = performanceTracker9;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler1.getState();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        com.google.javascript.rhino.Node node6 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.parsing.Config config7 = compiler1.getParserConfig();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler1.getInput("hi!");
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(config7);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        com.google.javascript.jscomp.Result result8 = compiler1.getResult();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = compiler1.getUniqueNameIdSupplier();
        boolean boolean10 = compiler1.isIdeMode();
        com.google.javascript.rhino.Node node11 = compiler1.externAndJsRoot;
        boolean boolean12 = compiler1.precheck();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = null;
        java.io.PrintStream printStream15 = null;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream15);
        compiler16.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph19 = compiler16.getModuleGraph();
        com.google.javascript.jscomp.Scope scope20 = compiler16.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler16.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = compiler16.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler16.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result24 = compiler1.compile(jSSourceFile13, jSSourceFile14, compilerOptions23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(jSModuleGraph19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNull(scopeCreator22);
        org.junit.Assert.assertNotNull(compilerOptions23);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler1.recentChange;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("");
        java.io.PrintStream printStream11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream11);
        compiler12.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler12.options;
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("");
        java.lang.String str17 = compiler6.toSource(node16);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler6.getCodingConvention();
        compiler1.defaultCodingConvention = codingConvention18;
        java.io.PrintStream printStream20 = null;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream20);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler21.getOptions();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.rhino.Node node28 = compiler24.parseTestCode("");
        java.lang.String str29 = compiler21.toSource(node28);
        com.google.javascript.rhino.Node node30 = null;
        compiler21.externAndJsRoot = node30;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        compiler32.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler32.getPassConfig();
        compiler21.setPassConfig(passConfig34);
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler37.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = compiler37.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap40 = compiler37.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState41 = compiler37.getState();
        com.google.javascript.rhino.Node node42 = intermediateState41.externsRoot;
        compiler21.setState(intermediateState41);
        compiler1.setState(intermediateState41);
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler1.tracker;
        com.google.javascript.rhino.Node node49 = compiler1.parseSyntheticCode("hi!", "");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(passConfig34);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNull(scopeCreator39);
        org.junit.Assert.assertNull(functionInformationMap40);
        org.junit.Assert.assertNotNull(intermediateState41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(scopeCreator45);
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.rhino.Node node11 = compiler1.externsRoot;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initInputsByNameMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        int int22 = compiler1.getWarningCount();
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler1.getPassConfig();
        boolean boolean24 = compiler1.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        compiler26.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler26.defaultCodingConvention;
        java.io.PrintStream printStream29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        compiler30.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.options;
        com.google.javascript.rhino.Node node34 = compiler30.parseTestCode("");
        java.io.PrintStream printStream35 = null;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        compiler36.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler36.options;
        com.google.javascript.rhino.Node node40 = compiler36.parseTestCode("");
        java.lang.String str41 = compiler30.toSource(node40);
        compiler26.externsRoot = node40;
        compiler1.externAndJsRoot = node40;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(compilerOptions38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler5.getOptions();
        java.io.PrintStream printStream7 = null;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(printStream7);
        compiler8.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.options;
        com.google.javascript.rhino.Node node12 = compiler8.parseTestCode("");
        java.lang.String str13 = compiler5.toSource(node12);
        java.lang.String str14 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler18.options;
        com.google.javascript.jscomp.Result result24 = compiler5.compile(jSSourceFileArray15, jSModuleArray16, compilerOptions23);
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        compiler27.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.options;
        com.google.javascript.rhino.Node node31 = compiler27.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler27.options;
        compiler0.init(jSSourceFileArray15, jSModuleArray25, compilerOptions32);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler0.getPassConfig();
        java.io.PrintStream printStream36 = null;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler(printStream36);
        compiler37.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.options;
        com.google.javascript.rhino.Node node41 = compiler37.parseTestCode("");
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        java.lang.String str48 = compiler37.toSource(node47);
        com.google.javascript.jscomp.CodingConvention codingConvention49 = compiler37.getCodingConvention();
        com.google.javascript.rhino.Node node50 = compiler37.externAndJsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler37.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler(errorManager51);
        compiler0.setErrorManager(errorManager51);
        java.io.PrintStream printStream54 = null;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler(printStream54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler55.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator57 = compiler55.getScopeCreator();
        com.google.javascript.rhino.Node node58 = compiler55.jsRoot;
        java.io.PrintStream printStream59 = null;
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler(printStream59);
        compiler60.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler60.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph63 = compiler60.getModuleGraph();
        com.google.javascript.jscomp.Scope scope64 = compiler60.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler60.getErrorManager();
        compiler55.setErrorManager(errorManager65);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler(errorManager65);
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler(errorManager65);
        compiler0.setErrorManager(errorManager65);
        com.google.javascript.jscomp.parsing.Config config70 = compiler0.getParserConfig();
        com.google.javascript.rhino.Node node71 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray15, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertArrayEquals(jSModuleArray16, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(compilerOptions23);
        org.junit.Assert.assertNotNull(result24);
        org.junit.Assert.assertNotNull(jSModuleArray25);
        org.junit.Assert.assertArrayEquals(jSModuleArray25, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertNull(compilerOptions39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(codingConvention49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNull(compilerOptions56);
        org.junit.Assert.assertNull(scopeCreator57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(compilerOptions62);
        org.junit.Assert.assertNull(jSModuleGraph63);
        org.junit.Assert.assertNull(scope64);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(config70);
        org.junit.Assert.assertNull(node71);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.rhino.Node node4 = compiler1.jsRoot;
        java.io.PrintStream printStream5 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream5);
        compiler6.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler6.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler6.getModuleGraph();
        com.google.javascript.jscomp.Scope scope10 = compiler6.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler6.getErrorManager();
        compiler1.setErrorManager(errorManager11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager11);
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler15.getMessages();
        java.io.PrintStream printStream17 = null;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(printStream17);
        compiler18.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler18.options;
        com.google.javascript.rhino.Node node22 = compiler18.parseTestCode("");
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.rhino.Node node28 = compiler24.parseTestCode("");
        java.lang.String str29 = compiler18.toSource(node28);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler18.getCodingConvention();
        com.google.javascript.rhino.Node node31 = compiler18.externAndJsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager32 = compiler18.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention33 = compiler18.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention33;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler15.options;
        com.google.javascript.jscomp.JsAst jsAst36 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.addIncrementalSourceAst(jsAst36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compilerOptions8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerOptions20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(errorManager32);
        org.junit.Assert.assertNotNull(codingConvention33);
        org.junit.Assert.assertNull(compilerOptions35);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = null;
        compiler1.options = compilerOptions6;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler8.defaultCodingConvention;
        boolean boolean11 = compiler8.precheck();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable15 = compiler12.acquireSymbolTable();
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable15);
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable15);
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter18 = compiler1.getDefaultErrorReporter();
        java.io.PrintStream printStream19 = null;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler20.getOptions();
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        compiler23.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.options;
        com.google.javascript.rhino.Node node27 = compiler23.parseTestCode("");
        java.lang.String str28 = compiler20.toSource(node27);
        java.lang.String str29 = compiler20.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray30 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray31 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler33.options;
        com.google.javascript.jscomp.Result result39 = compiler20.compile(jSSourceFileArray30, jSModuleArray31, compilerOptions38);
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = compiler20.getScopeCreator();
        boolean boolean41 = compiler20.isInliningForbidden();
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        compiler43.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.options;
        com.google.javascript.rhino.Node node47 = compiler43.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput49 = compiler43.getInput("");
        int int50 = compiler43.getWarningCount();
        boolean boolean51 = compiler43.hasErrors();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker53 = compiler52.tracker;
        boolean boolean54 = compiler52.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier55 = compiler52.getUniqueNameIdSupplier();
        java.io.PrintStream printStream56 = null;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler(printStream56);
        compiler57.setUnnormalized();
        com.google.javascript.jscomp.Scope scope59 = compiler57.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange60 = compiler57.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap61 = compiler57.getFunctionalInformationMap();
        java.io.PrintStream printStream62 = null;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler(printStream62);
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = compiler63.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator65 = compiler63.getScopeCreator();
        com.google.javascript.rhino.Node node66 = compiler63.jsRoot;
        java.io.PrintStream printStream67 = null;
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler(printStream67);
        compiler68.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions70 = compiler68.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph71 = compiler68.getModuleGraph();
        com.google.javascript.jscomp.Scope scope72 = compiler68.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager73 = compiler68.getErrorManager();
        compiler63.setErrorManager(errorManager73);
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler(errorManager73);
        compiler57.setErrorManager(errorManager73);
        compiler52.setErrorManager(errorManager73);
        compiler43.setErrorManager(errorManager73);
        compiler20.setErrorManager(errorManager73);
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = null;
        compiler20.options = compilerOptions80;
        java.io.PrintStream printStream82 = null;
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler(printStream82);
        compiler83.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler83.options;
        com.google.javascript.rhino.Node node87 = compiler83.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput89 = compiler83.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState90 = compiler83.getState();
        com.google.javascript.rhino.Node node92 = compiler83.parseTestCode("hi!");
        compiler20.externAndJsRoot = node92;
        compiler1.jsRoot = node92;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(symbolTable15);
        org.junit.Assert.assertNotNull(errorReporter18);
        org.junit.Assert.assertNull(compilerOptions21);
        org.junit.Assert.assertNull(compilerOptions25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray30);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray30, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray31);
        org.junit.Assert.assertArrayEquals(jSModuleArray31, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(compilerOptions38);
        org.junit.Assert.assertNotNull(result39);
        org.junit.Assert.assertNull(scopeCreator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(compilerInput49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(performanceTracker53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSupplier55);
        org.junit.Assert.assertNull(scope59);
        org.junit.Assert.assertNotNull(recentChange60);
        org.junit.Assert.assertNull(functionInformationMap61);
        org.junit.Assert.assertNull(compilerOptions64);
        org.junit.Assert.assertNull(scopeCreator65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(compilerOptions70);
        org.junit.Assert.assertNull(jSModuleGraph71);
        org.junit.Assert.assertNull(scope72);
        org.junit.Assert.assertNotNull(errorManager73);
        org.junit.Assert.assertNull(compilerOptions85);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNull(compilerInput89);
        org.junit.Assert.assertNotNull(intermediateState90);
        org.junit.Assert.assertNotNull(node92);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler1.getInput("");
        int int8 = compiler1.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler1.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler1.createPassConfigInternal();
        com.google.javascript.jscomp.Tracer tracer12 = compiler1.newTracer("hi!");
        boolean boolean13 = compiler1.isNormalized();
        java.lang.String str16 = compiler1.getSourceLine("", (int) '4');
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler1.createPassConfigInternal();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(tracer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(passConfig17);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.io.PrintStream printStream1 = null;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler2.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = compiler2.getScopeCreator();
        com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler2.acquireSymbolTable();
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable5);
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler0.tracker;
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(scopeCreator4);
        org.junit.Assert.assertNotNull(symbolTable5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(performanceTracker8);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler1.recentChange;
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler1.getPropertyMap();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler1.isInliningForbidden();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(variableMap5);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        java.lang.String[] strArray21 = compiler1.toSourceArray();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler1.getPassConfig();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler24.getSourceMap();
        java.io.PrintStream printStream28 = null;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler(printStream28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler29.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = compiler29.getScopeCreator();
        java.io.PrintStream printStream32 = null;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler(printStream32);
        compiler33.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler33.options;
        com.google.javascript.rhino.Node node37 = compiler33.parseTestCode("");
        compiler29.externsRoot = node37;
        compiler24.jsRoot = node37;
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler41.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = compiler41.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler41.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph45 = compiler41.getModuleGraph();
        com.google.javascript.rhino.Node node47 = compiler41.parseTestCode("");
        compiler24.externAndJsRoot = node47;
        java.lang.String str49 = compiler1.toSource(node47);
        com.google.javascript.jscomp.JSError[] jSErrorArray50 = compiler1.getWarnings();
        com.google.javascript.jscomp.Result result51 = compiler1.getResult();
        compiler1.addToDebugLog("hi!hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap54 = compiler1.getCssRenamingMap();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertNull(compilerOptions30);
        org.junit.Assert.assertNull(scopeCreator31);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNull(scopeCreator43);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(jSModuleGraph45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(jSErrorArray50);
        org.junit.Assert.assertArrayEquals(jSErrorArray50, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNull(cssRenamingMap54);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        com.google.javascript.rhino.Node node14 = compiler1.externAndJsRoot;
        com.google.javascript.rhino.Node node16 = compiler1.parseTestCode("hi!");
        compiler1.addToDebugLog("hi!hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = codeBuilder19.append("");
        codeBuilder19.reset();
        int int23 = codeBuilder19.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = codeBuilder19.append("hi!");
        java.io.PrintStream printStream27 = null;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler(printStream27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler28.getOptions();
        java.io.PrintStream printStream30 = null;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler31.options;
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("");
        java.lang.String str36 = compiler28.toSource(node35);
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler28.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray38 = compiler28.getErrors();
        compiler28.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState40 = compiler28.getState();
        java.io.PrintStream printStream41 = null;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        compiler42.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler42.options;
        com.google.javascript.jscomp.SourceMap sourceMap45 = compiler42.getSourceMap();
        com.google.javascript.rhino.Node node47 = compiler42.parseTestCode("");
        intermediateState40.externsRoot = node47;
        compiler1.toSource(codeBuilder19, (int) '#', node47);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder50 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int51 = codeBuilder50.getLineIndex();
        int int52 = codeBuilder50.getLength();
        int int53 = codeBuilder50.getLineIndex();
        int int54 = codeBuilder50.getLineIndex();
        java.io.PrintStream printStream56 = null;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler(printStream56);
        compiler57.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler57.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph60 = compiler57.getModuleGraph();
        com.google.javascript.jscomp.Scope scope61 = compiler57.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler57.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator63 = compiler57.getScopeCreator();
        com.google.javascript.rhino.Node node64 = compiler57.externsRoot;
        boolean boolean65 = compiler57.isTypeCheckingEnabled();
        compiler57.resetUniqueNameId();
        com.google.javascript.jscomp.PassConfig passConfig67 = compiler57.getPassConfig();
        java.io.PrintStream printStream68 = null;
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler(printStream68);
        compiler69.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = compiler69.options;
        com.google.javascript.rhino.Node node73 = compiler69.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput75 = compiler69.getInput("");
        int int76 = compiler69.getWarningCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray77 = compiler69.getMessages();
        com.google.javascript.rhino.Node node79 = compiler69.parseTestCode("hi!");
        compiler57.jsRoot = node79;
        compiler1.toSource(codeBuilder50, (int) (short) 10, node79);
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(codeBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(codeBuilder25);
        org.junit.Assert.assertNull(compilerOptions29);
        org.junit.Assert.assertNull(compilerOptions33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNotNull(jSErrorArray38);
        org.junit.Assert.assertArrayEquals(jSErrorArray38, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState40);
        org.junit.Assert.assertNull(compilerOptions44);
        org.junit.Assert.assertNull(sourceMap45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(compilerOptions59);
        org.junit.Assert.assertNull(jSModuleGraph60);
        org.junit.Assert.assertNull(scope61);
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertNull(scopeCreator63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(passConfig67);
        org.junit.Assert.assertNull(compilerOptions71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(compilerInput75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray77);
        org.junit.Assert.assertArrayEquals(jSErrorArray77, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler1.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler1.options;
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(compilerOptions11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        com.google.javascript.jscomp.Scope scope5 = compiler1.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler8.isTypeCheckingEnabled();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        compiler4.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.options;
        com.google.javascript.rhino.Node node8 = compiler4.parseTestCode("");
        java.lang.String str9 = compiler1.toSource(node8);
        java.lang.String str10 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        compiler14.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler14.options;
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler14.options;
        com.google.javascript.jscomp.Result result20 = compiler1.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = compiler1.getScopeCreator();
        boolean boolean22 = compiler1.isInliningForbidden();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.rhino.Node node28 = compiler24.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput30 = compiler24.getInput("");
        int int31 = compiler24.getWarningCount();
        boolean boolean32 = compiler24.hasErrors();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = compiler33.tracker;
        boolean boolean35 = compiler33.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier36 = compiler33.getUniqueNameIdSupplier();
        java.io.PrintStream printStream37 = null;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler(printStream37);
        compiler38.setUnnormalized();
        com.google.javascript.jscomp.Scope scope40 = compiler38.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler38.recentChange;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap42 = compiler38.getFunctionalInformationMap();
        java.io.PrintStream printStream43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler(printStream43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler44.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator46 = compiler44.getScopeCreator();
        com.google.javascript.rhino.Node node47 = compiler44.jsRoot;
        java.io.PrintStream printStream48 = null;
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler(printStream48);
        compiler49.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph52 = compiler49.getModuleGraph();
        com.google.javascript.jscomp.Scope scope53 = compiler49.getTopScope();
        com.google.javascript.jscomp.ErrorManager errorManager54 = compiler49.getErrorManager();
        compiler44.setErrorManager(errorManager54);
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler(errorManager54);
        compiler38.setErrorManager(errorManager54);
        compiler33.setErrorManager(errorManager54);
        compiler24.setErrorManager(errorManager54);
        compiler1.setErrorManager(errorManager54);
        com.google.javascript.jscomp.PassConfig passConfig61 = compiler1.createPassConfigInternal();
        int int62 = compiler1.getWarningCount();
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(scopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(compilerInput30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(performanceTracker34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strSupplier36);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertNull(functionInformationMap42);
        org.junit.Assert.assertNull(compilerOptions45);
        org.junit.Assert.assertNull(scopeCreator46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(compilerOptions51);
        org.junit.Assert.assertNull(jSModuleGraph52);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(errorManager54);
        org.junit.Assert.assertNotNull(passConfig61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertNotNull(compilerOptions5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(result8);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.rhino.Node node5 = compiler1.parseTestCode("");
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        compiler7.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.options;
        com.google.javascript.rhino.Node node11 = compiler7.parseTestCode("");
        java.lang.String str12 = compiler1.toSource(node11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler1.getCodingConvention();
        com.google.javascript.rhino.Node node14 = compiler1.externAndJsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler1.getSourceMap();
        java.io.PrintStream printStream16 = null;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler17.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = compiler17.getScopeCreator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = compiler17.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler17.defaultCodingConvention;
        compiler1.defaultCodingConvention = codingConvention21;
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler1.getWarnings();
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNull(scopeCreator19);
        org.junit.Assert.assertNotNull(jSTypeRegistry20);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler1.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = compiler1.getScopeCreator();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler1.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler1.options;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        compiler1.setState(intermediateState10);
        java.io.PrintStream printStream12 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler(printStream12);
        compiler13.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler13.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler17.getPassConfig();
        compiler13.setPassConfig(passConfig19);
        java.io.PrintStream printStream21 = null;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream21);
        compiler22.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.options;
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("");
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler22.getVariableMap();
        compiler22.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler22.getOptions();
        compiler13.options = compilerOptions29;
        compiler1.options = compilerOptions29;
        com.google.javascript.jscomp.SymbolTable symbolTable32 = compiler1.acquireSymbolTable();
        compiler1.setNormalized();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray35 = compiler1.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNull(scopeCreator3);
        org.junit.Assert.assertNull(functionInformationMap4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(compilerOptions15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNotNull(passConfig19);
        org.junit.Assert.assertNull(compilerOptions24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(symbolTable32);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = codeBuilder5.append("");
        codeBuilder5.reset();
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler11.getOptions();
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = compiler11.getScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler11.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph15 = compiler11.getModuleGraph();
        com.google.javascript.rhino.Node node17 = compiler11.parseTestCode("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder20 = codeBuilder18.append("");
        codeBuilder18.reset();
        java.io.PrintStream printStream23 = null;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler(printStream23);
        compiler24.setUnnormalized();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.options;
        com.google.javascript.rhino.Node node28 = compiler24.parseTestCode("");
        com.google.javascript.jscomp.CompilerInput compilerInput30 = compiler24.getInput("");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler24.getState();
        com.google.javascript.rhino.Node node33 = compiler24.parseTestCode("hi!");
        compiler11.toSource(codeBuilder18, (int) '4', node33);
        compiler0.toSource(codeBuilder5, (int) (short) 10, node33);
        com.google.javascript.jscomp.JSError[] jSErrorArray36 = compiler0.getWarnings();
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSError[] jSErrorArray38 = compiler0.getErrors();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler0.recentChange;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codingConvention2);
        org.junit.Assert.assertNotNull(symbolTable3);
        org.junit.Assert.assertNotNull(codeBuilder7);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNull(scopeCreator13);
        org.junit.Assert.assertNull(compilerOptions14);
        org.junit.Assert.assertNull(jSModuleGraph15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(codeBuilder20);
        org.junit.Assert.assertNull(compilerOptions26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(compilerInput30);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSErrorArray36);
        org.junit.Assert.assertArrayEquals(jSErrorArray36, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNotNull(jSErrorArray38);
        org.junit.Assert.assertArrayEquals(jSErrorArray38, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange39);
    }
}

