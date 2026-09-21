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
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        compiler0.setProgress((double) (short) -1);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler0.getExternsForTesting();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler10.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler15.tracker = performanceTracker16;
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler15.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler15.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        java.lang.String str26 = compiler15.toSource(node25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler15.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap28 = compiler15.getCssRenamingMap();
        java.lang.String str29 = compiler15.toSource();
        boolean boolean30 = compiler15.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler15.newCompilerOptions();
        compiler10.initOptions(compilerOptions31);
        boolean boolean33 = compiler10.precheck();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler34.getState();
        com.google.javascript.rhino.Node node38 = intermediateState37.externsRoot;
        compiler10.setState(intermediateState37);
        compiler0.setState(intermediateState37);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNull(cssRenamingMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler18.getState();
        com.google.javascript.rhino.Node node22 = intermediateState21.externsRoot;
        com.google.javascript.rhino.Node node23 = null;
        intermediateState21.externsRoot = node23;
        compiler0.setState(intermediateState21);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap26 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler28.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler28.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler33.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.externsRoot = node39;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = compiler38.tracker;
        com.google.javascript.rhino.Node node43 = compiler38.parseTestCode("");
        java.lang.String str44 = compiler33.toSource(node43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler33.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap46 = compiler33.getCssRenamingMap();
        java.lang.String str47 = compiler33.toSource();
        boolean boolean48 = compiler33.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler33.newCompilerOptions();
        compiler28.initOptions(compilerOptions49);
        boolean boolean51 = compiler28.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler52.tracker;
        compiler52.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig57 = compiler52.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node58 = compiler52.externsRoot;
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = null;
        compiler59.tracker = performanceTracker60;
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler59.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention63 = compiler59.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker67 = compiler64.tracker;
        com.google.javascript.rhino.Node node69 = compiler64.parseTestCode("");
        java.lang.String str70 = compiler59.toSource(node69);
        compiler52.jsRoot = node69;
        compiler28.jsRoot = node69;
        compiler0.prepareAst(node69);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(functionInformationMap26);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNull(performanceTracker41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNull(cssRenamingMap46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertNotNull(defaultPassConfig57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertNotNull(codingConvention63);
        org.junit.Assert.assertNull(performanceTracker67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        compiler0.startPass("");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler0.tracker = performanceTracker12;
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler0.createPassConfigInternal();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(passConfig14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("");
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("{SyntheticVarsDeclar}");
        codeBuilder2.reset();
        int int4 = codeBuilder2.getLineIndex();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler5.getState();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler9.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler9.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder16 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str17 = codeBuilder16.toString();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler19.tracker;
        com.google.javascript.rhino.Node node24 = compiler19.parseTestCode("");
        compiler9.toSource(codeBuilder16, (int) (byte) 100, node24);
        intermediateState8.externsRoot = node24;
        com.google.javascript.rhino.Node node27 = intermediateState8.externsRoot;
        compiler0.externAndJsRoot = node27;
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node30 = compiler0.jsRoot;
        boolean boolean31 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JsAst jsAst32 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.rhino.Node node20 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler18.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier22 = compiler18.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope23 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange27 = compiler24.recentChange;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = null;
        compiler28.tracker = performanceTracker29;
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler28.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig32 = compiler28.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState33 = compiler28.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler28.getOptions();
        compiler24.initOptions(compilerOptions34);
        compiler18.initOptions(compilerOptions34);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler18.getState();
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler18.getVariableMap();
        boolean boolean39 = compiler18.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler18.options;
        compiler0.options = compilerOptions40;
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler0.options;
        double double43 = compiler0.getProgress();
        java.lang.String str44 = compiler0.toSource();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(strSupplier22);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(recentChange27);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertNotNull(passConfig32);
        org.junit.Assert.assertNotNull(intermediateState33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JsAst jsAst12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addIncrementalSourceAst(jsAst12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNull(functionInformationMap10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler11.tracker = performanceTracker12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        com.google.javascript.rhino.Node node21 = compiler16.parseTestCode("");
        java.lang.String str22 = compiler11.toSource(node21);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention27 = compiler23.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler23.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler23.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder30 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str31 = codeBuilder30.toString();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = compiler33.tracker;
        com.google.javascript.rhino.Node node38 = compiler33.parseTestCode("");
        compiler23.toSource(codeBuilder30, (int) (byte) 100, node38);
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        com.google.javascript.jscomp.PassConfig passConfig44 = compiler40.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = compiler45.tracker;
        com.google.javascript.rhino.Node node50 = compiler45.parseTestCode("");
        compiler40.externAndJsRoot = node50;
        boolean boolean52 = compiler11.areNodesEqualForInlining(node38, node50);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter53 = compiler11.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager54 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node56 = null;
        compiler55.externsRoot = node56;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange58 = compiler55.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange58);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange58);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(variableMap10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(codingConvention15);
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(codingConvention27);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(performanceTracker36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(passConfig44);
        org.junit.Assert.assertNull(performanceTracker48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter53);
        org.junit.Assert.assertNotNull(errorManager54);
        org.junit.Assert.assertNotNull(recentChange58);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        compiler0.startPass("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap10 = null;
        compiler0.setCssRenamingMap(cssRenamingMap10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler12.tracker;
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig17 = compiler12.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node18 = compiler12.externsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler19.tracker = performanceTracker20;
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler19.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler19.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        com.google.javascript.rhino.Node node29 = compiler24.parseTestCode("");
        java.lang.String str30 = compiler19.toSource(node29);
        compiler12.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = null;
        compiler32.tracker = performanceTracker33;
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler32.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler32.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler32.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = compiler32.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig39 = compiler32.ensureDefaultPassConfig();
        boolean boolean40 = compiler32.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = null;
        compiler41.tracker = performanceTracker42;
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler41.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler41.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = compiler46.tracker;
        com.google.javascript.rhino.Node node51 = compiler46.parseTestCode("");
        java.lang.String str52 = compiler41.toSource(node51);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = null;
        compiler53.tracker = performanceTracker54;
        com.google.javascript.jscomp.ErrorManager errorManager56 = compiler53.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention57 = compiler53.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        java.lang.String str64 = compiler53.toSource(node63);
        compiler41.externsRoot = node63;
        compiler32.prepareAst(node63);
        boolean boolean67 = compiler0.areNodesEqualForInlining(node29, node63);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler0.newCompilerOptions();
        boolean boolean69 = compiler0.acceptConstKeyword();
        compiler0.disableThreads();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(defaultPassConfig17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(performanceTracker38);
        org.junit.Assert.assertNotNull(defaultPassConfig39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertNull(performanceTracker49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(errorManager56);
        org.junit.Assert.assertNotNull(codingConvention57);
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(compilerOptions68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        compiler0.startPass("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap10 = null;
        compiler0.setCssRenamingMap(cssRenamingMap10);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        compiler0.setProgress((double) (short) -1);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler0.getExternsForTesting();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertNotNull(errorReporter9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap29 = compiler0.getCssRenamingMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler0.getWarnings();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(cssRenamingMap29);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertArrayEquals(jSErrorArray30, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        compiler0.setProgress((double) (byte) 10);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = compiler0.isInliningForbidden();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(compilerInputList5);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        int int2 = codeBuilder0.getLength();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = codeBuilder0.append("[hi![singleton]]");
        int int5 = codeBuilder4.getLength();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(codeBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = compiler0.replaceIncrementalSourceAst(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler0.getPassConfig();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler20.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier24 = compiler20.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope25 = compiler20.getTopScope();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler26.recentChange;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler30.tracker = performanceTracker31;
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler30.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler30.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState35 = compiler30.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler30.getOptions();
        compiler26.initOptions(compilerOptions36);
        compiler20.initOptions(compilerOptions36);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler20.getState();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler20.getVariableMap();
        boolean boolean41 = compiler20.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler20.options;
        com.google.javascript.jscomp.Result result43 = compiler20.getResult();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker47 = compiler44.tracker;
        com.google.javascript.jscomp.PassConfig passConfig48 = compiler44.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler44.newCompilerOptions();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.externsRoot = node51;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange53 = compiler50.recentChange;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = null;
        compiler54.tracker = performanceTracker55;
        com.google.javascript.jscomp.ErrorManager errorManager57 = compiler54.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig58 = compiler54.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState59 = compiler54.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = compiler54.getOptions();
        compiler50.initOptions(compilerOptions60);
        compiler50.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = null;
        compiler63.externsRoot = node64;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange66 = compiler63.recentChange;
        compiler50.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange66);
        compiler44.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange66);
        compiler20.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange66);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange66);
        com.google.javascript.jscomp.JsAst jsAst71 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(strSupplier24);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(passConfig34);
        org.junit.Assert.assertNotNull(intermediateState35);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNull(variableMap40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNotNull(result43);
        org.junit.Assert.assertNull(performanceTracker47);
        org.junit.Assert.assertNotNull(passConfig48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(recentChange53);
        org.junit.Assert.assertNotNull(errorManager57);
        org.junit.Assert.assertNotNull(passConfig58);
        org.junit.Assert.assertNotNull(intermediateState59);
        org.junit.Assert.assertNotNull(compilerOptions60);
        org.junit.Assert.assertNotNull(recentChange66);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("[{SyntheticVarsDeclar}]", 0);
        com.google.javascript.rhino.Node node6 = compiler0.jsRoot;
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler4.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler4.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler14.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler14.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler14.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler14.getOptions();
        compiler10.initOptions(compilerOptions20);
        compiler4.initOptions(compilerOptions20);
        compiler0.options = compilerOptions20;
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = null;
        compiler25.externsRoot = node26;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = compiler25.tracker;
        com.google.javascript.rhino.Node node30 = compiler25.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler31.getState();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = null;
        compiler35.tracker = performanceTracker36;
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler35.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention39 = compiler35.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig40 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = compiler35.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder42 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str43 = codeBuilder42.toString();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = compiler45.tracker;
        com.google.javascript.rhino.Node node50 = compiler45.parseTestCode("");
        compiler35.toSource(codeBuilder42, (int) (byte) 100, node50);
        intermediateState34.externsRoot = node50;
        compiler25.setState(intermediateState34);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.externsRoot = node55;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState57 = compiler54.getState();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker59 = null;
        compiler58.tracker = performanceTracker59;
        com.google.javascript.jscomp.ErrorManager errorManager61 = compiler58.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention62 = compiler58.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig63 = compiler58.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker64 = compiler58.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder65 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str66 = codeBuilder65.toString();
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node69 = null;
        compiler68.externsRoot = node69;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker71 = compiler68.tracker;
        com.google.javascript.rhino.Node node73 = compiler68.parseTestCode("");
        compiler58.toSource(codeBuilder65, (int) (byte) 100, node73);
        intermediateState57.externsRoot = node73;
        com.google.javascript.rhino.Node node76 = intermediateState57.externsRoot;
        compiler25.setState(intermediateState57);
        com.google.javascript.jscomp.ErrorManager errorManager78 = compiler25.getErrorManager();
        compiler0.setErrorManager(errorManager78);
        com.google.javascript.jscomp.JSError[] jSErrorArray80 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node82 = compiler0.loadLibraryCode("[{SyntheticVarsDeclar}]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNull(performanceTracker28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(codingConvention39);
        org.junit.Assert.assertNotNull(passConfig40);
        org.junit.Assert.assertNull(performanceTracker41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(performanceTracker48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(intermediateState57);
        org.junit.Assert.assertNotNull(errorManager61);
        org.junit.Assert.assertNotNull(codingConvention62);
        org.junit.Assert.assertNotNull(passConfig63);
        org.junit.Assert.assertNull(performanceTracker64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNull(performanceTracker71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(errorManager78);
        org.junit.Assert.assertNotNull(jSErrorArray80);
        org.junit.Assert.assertArrayEquals(jSErrorArray80, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node8 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap8 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap9 = compiler0.getCssRenamingMap();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getExternsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNull(functionInformationMap8);
        org.junit.Assert.assertNull(cssRenamingMap9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        compiler0.setProgress((double) (short) -1);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.rhino.Node node11 = compiler0.parseSyntheticCode("[[hi![singleton]]hi![singleton]]", "hi!");
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap12 = compiler0.getGlobalVarReferences();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(globalVarReferenceMap12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node5 = compiler0.externsRoot;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("[singleton]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler0.getPropertyMap();
        compiler0.setProgress((double) (short) 1);
        boolean boolean16 = compiler0.isInliningForbidden();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(variableMap13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(compilerInputList5);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager3);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap5 = compiler4.getGlobalVarReferences();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNull(globalVarReferenceMap5);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler8.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope13 = compiler8.getTopScope();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler14.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler14.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = compiler19.tracker;
        com.google.javascript.rhino.Node node24 = compiler19.parseTestCode("");
        java.lang.String str25 = compiler14.toSource(node24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = null;
        compiler26.tracker = performanceTracker27;
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler26.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler26.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig31 = compiler26.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler26.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder33 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str34 = codeBuilder33.toString();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler36.tracker;
        com.google.javascript.rhino.Node node41 = compiler36.parseTestCode("");
        compiler26.toSource(codeBuilder33, (int) (byte) 100, node41);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler43.tracker;
        com.google.javascript.jscomp.PassConfig passConfig47 = compiler43.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker51 = compiler48.tracker;
        com.google.javascript.rhino.Node node53 = compiler48.parseTestCode("");
        compiler43.externAndJsRoot = node53;
        boolean boolean55 = compiler14.areNodesEqualForInlining(node41, node53);
        java.lang.String str56 = compiler8.toSource(node53);
        compiler0.jsRoot = node53;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap58 = compiler0.getGlobalVarReferences();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertNull(performanceTracker22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNotNull(passConfig31);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(performanceTracker39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertNotNull(passConfig47);
        org.junit.Assert.assertNull(performanceTracker51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(globalVarReferenceMap58);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.rhino.Node node11 = compiler0.parseTestCode("");
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        boolean boolean21 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler0.getMessages();
        com.google.javascript.jscomp.JSError jSError24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel25 = compiler0.getErrorLevel(jSError24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler2.tracker;
        compiler2.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler2.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node8 = compiler2.externsRoot;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler13.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier17 = compiler13.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope18 = compiler13.getTopScope();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler13.initOptions(compilerOptions29);
        compiler9.options = compilerOptions29;
        compiler2.initOptions(compilerOptions29);
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler34.getState();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = null;
        compiler40.tracker = performanceTracker41;
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler40.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention44 = compiler40.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig45 = compiler40.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler40.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str48 = codeBuilder47.toString();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.externsRoot = node51;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker53 = compiler50.tracker;
        com.google.javascript.rhino.Node node55 = compiler50.parseTestCode("");
        compiler40.toSource(codeBuilder47, (int) (byte) 100, node55);
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.jscomp.PassConfig passConfig62 = compiler58.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = null;
        compiler63.externsRoot = node64;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker66 = compiler63.tracker;
        com.google.javascript.rhino.Node node68 = compiler63.parseTestCode("");
        compiler58.externAndJsRoot = node68;
        compiler34.toSource(codeBuilder47, 10, node68);
        compiler2.prepareAst(node68);
        compiler0.jsRoot = node68;
        boolean boolean73 = compiler0.precheck();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(strSupplier17);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(codingConvention44);
        org.junit.Assert.assertNotNull(passConfig45);
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(performanceTracker53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(passConfig62);
        org.junit.Assert.assertNull(performanceTracker66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.ErrorManager errorManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(errorManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        double double38 = compiler0.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PassConfig passConfig40 = compiler0.createPassConfigInternal();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNotNull(passConfig40);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler18.getState();
        com.google.javascript.rhino.Node node22 = intermediateState21.externsRoot;
        com.google.javascript.rhino.Node node23 = null;
        intermediateState21.externsRoot = node23;
        compiler0.setState(intermediateState21);
        com.google.javascript.rhino.Node node26 = intermediateState21.externsRoot;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        boolean boolean21 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = null;
        compiler22.tracker = performanceTracker23;
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler22.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler22.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler22.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = compiler22.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder29 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str30 = codeBuilder29.toString();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = compiler32.tracker;
        com.google.javascript.rhino.Node node37 = compiler32.parseTestCode("");
        compiler22.toSource(codeBuilder29, (int) (byte) 100, node37);
        com.google.javascript.jscomp.JSError[] jSErrorArray39 = compiler22.getMessages();
        compiler22.disableThreads();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler41.recentChange;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = null;
        compiler45.tracker = performanceTracker46;
        com.google.javascript.jscomp.ErrorManager errorManager48 = compiler45.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig49 = compiler45.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState50 = compiler45.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler45.getOptions();
        compiler41.initOptions(compilerOptions51);
        compiler41.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.externsRoot = node55;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange57 = compiler54.recentChange;
        compiler41.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange57);
        compiler22.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange57);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange57);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList61 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node62 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNull(performanceTracker28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(performanceTracker35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(jSErrorArray39);
        org.junit.Assert.assertArrayEquals(jSErrorArray39, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNotNull(errorManager48);
        org.junit.Assert.assertNotNull(passConfig49);
        org.junit.Assert.assertNotNull(intermediateState50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(recentChange57);
        org.junit.Assert.assertNull(compilerInputList61);
        org.junit.Assert.assertNull(node62);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler8.getState();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        intermediateState11.externsRoot = node27;
        com.google.javascript.rhino.Node node30 = intermediateState11.externsRoot;
        compiler0.externAndJsRoot = node30;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode36 = compiler0.languageMode();
        boolean boolean37 = compiler0.precheck();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertTrue("'" + languageMode36 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode36.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean2 = codeBuilder0.endsWith("");
        int int3 = codeBuilder0.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = codeBuilder0.append("[]");
        int int6 = codeBuilder5.getLineIndex();
        int int7 = codeBuilder5.getLineIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(codeBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler0.getErrors();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler33.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig38 = compiler33.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler33.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder40 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str41 = codeBuilder40.toString();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler43.tracker;
        com.google.javascript.rhino.Node node48 = compiler43.parseTestCode("");
        compiler33.toSource(codeBuilder40, (int) (byte) 100, node48);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.externsRoot = node51;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker53 = compiler50.tracker;
        com.google.javascript.jscomp.PassConfig passConfig54 = compiler50.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node56 = null;
        compiler55.externsRoot = node56;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker58 = compiler55.tracker;
        com.google.javascript.rhino.Node node60 = compiler55.parseTestCode("");
        compiler50.externAndJsRoot = node60;
        boolean boolean62 = compiler21.areNodesEqualForInlining(node48, node60);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter63 = compiler21.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager64 = compiler21.getErrorManager();
        compiler0.setErrorManager(errorManager64);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler(errorManager64);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node68 = null;
        compiler67.externsRoot = node68;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState70 = compiler67.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier71 = compiler67.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope72 = compiler67.getTopScope();
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node74 = null;
        compiler73.externsRoot = node74;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange76 = compiler73.recentChange;
        com.google.javascript.jscomp.Compiler compiler77 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker78 = null;
        compiler77.tracker = performanceTracker78;
        com.google.javascript.jscomp.ErrorManager errorManager80 = compiler77.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig81 = compiler77.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState82 = compiler77.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions83 = compiler77.getOptions();
        compiler73.initOptions(compilerOptions83);
        compiler67.initOptions(compilerOptions83);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState86 = compiler67.getState();
        com.google.javascript.jscomp.VariableMap variableMap87 = compiler67.getVariableMap();
        compiler67.disableThreads();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap89 = compiler67.getFunctionalInformationMap();
        compiler67.resetUniqueNameId();
        com.google.javascript.jscomp.CompilerOptions compilerOptions91 = compiler67.options;
        compiler66.options = compilerOptions91;
        compiler66.startPass("[hi![singleton]]hi![singleton]");
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNotNull(passConfig38);
        org.junit.Assert.assertNull(performanceTracker39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(performanceTracker53);
        org.junit.Assert.assertNotNull(passConfig54);
        org.junit.Assert.assertNull(performanceTracker58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter63);
        org.junit.Assert.assertNotNull(errorManager64);
        org.junit.Assert.assertNotNull(intermediateState70);
        org.junit.Assert.assertNotNull(strSupplier71);
        org.junit.Assert.assertNull(scope72);
        org.junit.Assert.assertNotNull(recentChange76);
        org.junit.Assert.assertNotNull(errorManager80);
        org.junit.Assert.assertNotNull(passConfig81);
        org.junit.Assert.assertNotNull(intermediateState82);
        org.junit.Assert.assertNotNull(compilerOptions83);
        org.junit.Assert.assertNotNull(intermediateState86);
        org.junit.Assert.assertNull(variableMap87);
        org.junit.Assert.assertNull(functionInformationMap89);
        org.junit.Assert.assertNotNull(compilerOptions91);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler0.getErrorManager();
        boolean boolean10 = compiler0.isInliningForbidden();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = null;
        compiler0.setCssRenamingMap(cssRenamingMap42);
        int int44 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler8.tracker;
        com.google.javascript.rhino.Node node12 = compiler8.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        compiler0.jsRoot = node12;
        boolean boolean14 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler15.tracker;
        com.google.javascript.rhino.Node node19 = compiler15.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        compiler0.prepareAst(node19);
        com.google.javascript.jscomp.TypeValidator typeValidator21 = compiler0.getTypeValidator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap22 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(typeValidator21);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler0.ensureDefaultPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(defaultPassConfig6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = null;
        compiler0.setCssRenamingMap(cssRenamingMap42);
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler0.getErrorManager();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator45 = compiler0.getTypedScopeCreator();
        com.google.common.base.Supplier<java.lang.String> strSupplier46 = compiler0.getUniqueNameIdSupplier();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = compiler0.loadLibraryCode("[hi![singleton]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNull(memoizedScopeCreator45);
        org.junit.Assert.assertNotNull(strSupplier46);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        double double8 = compiler0.getProgress();
        double double9 = compiler0.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler0.getDiagnosticGroups();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("{SyntheticVarsDeclar}", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JsAst jsAst12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(variableMap10);
        org.junit.Assert.assertNull(sourceMap11);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getSynthesizedExternsInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler8.tracker;
        com.google.javascript.rhino.Node node12 = compiler8.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        compiler0.jsRoot = node12;
        boolean boolean14 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler15.tracker;
        com.google.javascript.rhino.Node node19 = compiler15.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        compiler0.prepareAst(node19);
        com.google.javascript.jscomp.TypeValidator typeValidator21 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.JSError jSError22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(typeValidator21);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean2 = codeBuilder0.endsWith("");
        java.lang.String str3 = codeBuilder0.toString();
        boolean boolean5 = codeBuilder0.endsWith("[hi![singleton]]hi![singleton]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler11.tracker;
        com.google.javascript.rhino.Node node16 = compiler11.parseTestCode("");
        java.lang.String str17 = compiler6.toSource(node16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler18.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler18.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler18.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler18.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = compiler18.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str26 = codeBuilder25.toString();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = compiler28.tracker;
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("");
        compiler18.toSource(codeBuilder25, (int) (byte) 100, node33);
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = compiler35.tracker;
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        com.google.javascript.rhino.Node node45 = compiler40.parseTestCode("");
        compiler35.externAndJsRoot = node45;
        boolean boolean47 = compiler6.areNodesEqualForInlining(node33, node45);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter48 = compiler6.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager49 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.externsRoot = node51;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange53 = compiler50.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange53);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = compiler6.getTypeRegistry();
        com.google.javascript.rhino.Node node58 = compiler6.parseSyntheticCode("[[singleton]]", "");
        compiler0.jsRoot = node58;
        java.lang.Exception exception61 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("", exception61);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNull(performanceTracker24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(performanceTracker31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(performanceTracker38);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter48);
        org.junit.Assert.assertNotNull(errorManager49);
        org.junit.Assert.assertNotNull(recentChange53);
        org.junit.Assert.assertNotNull(jSTypeRegistry55);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler16.tracker = performanceTracker17;
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler16.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler16.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler16.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler16.getOptions();
        compiler12.initOptions(compilerOptions22);
        compiler0.options = compilerOptions22;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap25 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(passConfig20);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(compilerOptions22);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        double double38 = compiler0.getProgress();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap39 = compiler0.getGlobalVarReferences();
        java.lang.String str40 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        compiler41.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState46 = compiler41.getState();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler47.tracker = performanceTracker48;
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler47.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler47.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler52.tracker;
        com.google.javascript.rhino.Node node57 = compiler52.parseTestCode("");
        java.lang.String str58 = compiler47.toSource(node57);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler47.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap60 = compiler47.getCssRenamingMap();
        java.lang.String str61 = compiler47.toSource();
        boolean boolean62 = compiler47.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler47.newCompilerOptions();
        compiler41.initOptions(compilerOptions63);
        compiler0.options = compilerOptions63;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(globalVarReferenceMap39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(intermediateState46);
        org.junit.Assert.assertNotNull(errorManager50);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(compilerOptions59);
        org.junit.Assert.assertNull(cssRenamingMap60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(compilerOptions63);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig5 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("[[[hi![singleton]]hi![singleton]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(defaultPassConfig5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = codeBuilder7.append("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder20 = codeBuilder18.append("[[[hi![singleton]]hi![singleton]]]");
        codeBuilder18.reset();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(codeBuilder18);
        org.junit.Assert.assertNotNull(codeBuilder20);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.options;
        com.google.javascript.rhino.Node node7 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str9 = codeBuilder8.toString();
        int int10 = codeBuilder8.getLength();
        java.lang.String str11 = codeBuilder8.toString();
        codeBuilder8.reset();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        compiler14.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler14.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler14.getState();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.externsRoot = node22;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = compiler21.tracker;
        com.google.javascript.rhino.Node node26 = compiler21.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.externsRoot = node28;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler27.getState();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = null;
        compiler31.tracker = performanceTracker32;
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler31.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler31.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler31.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler31.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder38 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str39 = codeBuilder38.toString();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        com.google.javascript.rhino.Node node46 = compiler41.parseTestCode("");
        compiler31.toSource(codeBuilder38, (int) (byte) 100, node46);
        intermediateState30.externsRoot = node46;
        compiler21.setState(intermediateState30);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups50 = compiler21.getDiagnosticGroups();
        com.google.javascript.jscomp.parsing.Config config51 = compiler21.getParserConfig();
        com.google.javascript.rhino.Node node53 = compiler21.parseSyntheticCode("[hi![singleton]]hi![singleton]");
        intermediateState20.externsRoot = node53;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder8, (-1), node53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(compilerOptions6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(intermediateState20);
        org.junit.Assert.assertNull(performanceTracker24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertNotNull(passConfig36);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(diagnosticGroups50);
        org.junit.Assert.assertNotNull(config51);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler16.tracker = performanceTracker17;
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler16.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler16.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler16.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler16.getOptions();
        compiler12.initOptions(compilerOptions22);
        compiler0.options = compilerOptions22;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap25 = compiler0.getGlobalVarReferences();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(passConfig20);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNull(globalVarReferenceMap25);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler6.tracker;
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler6.getState();
        com.google.javascript.rhino.Node node12 = intermediateState11.externsRoot;
        compiler0.setState(intermediateState11);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler19.tracker = performanceTracker20;
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler19.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler19.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler19.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler19.getOptions();
        compiler0.initOptions(compilerOptions25);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter27 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler0.tracker = performanceTracker28;
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler0.getPropertyMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter27);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNull(variableMap31);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.defaultCodingConvention;
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap8 = compiler0.getFunctionalInformationMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(functionInformationMap8);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        boolean boolean21 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler0.options;
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNull(sourceMap23);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        int int2 = codeBuilder0.getLength();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = codeBuilder0.append("[hi![singleton]]");
        int int5 = codeBuilder0.getLength();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(codeBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = null;
        compiler0.setCssRenamingMap(cssRenamingMap42);
        int int44 = compiler0.getWarningCount();
        int int45 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        compiler0.startPass("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap10 = null;
        compiler0.setCssRenamingMap(cssRenamingMap10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler12.tracker;
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig17 = compiler12.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node18 = compiler12.externsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler19.tracker = performanceTracker20;
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler19.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler19.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        com.google.javascript.rhino.Node node29 = compiler24.parseTestCode("");
        java.lang.String str30 = compiler19.toSource(node29);
        compiler12.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = null;
        compiler32.tracker = performanceTracker33;
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler32.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler32.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler32.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = compiler32.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig39 = compiler32.ensureDefaultPassConfig();
        boolean boolean40 = compiler32.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = null;
        compiler41.tracker = performanceTracker42;
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler41.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler41.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = compiler46.tracker;
        com.google.javascript.rhino.Node node51 = compiler46.parseTestCode("");
        java.lang.String str52 = compiler41.toSource(node51);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = null;
        compiler53.tracker = performanceTracker54;
        com.google.javascript.jscomp.ErrorManager errorManager56 = compiler53.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention57 = compiler53.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        java.lang.String str64 = compiler53.toSource(node63);
        compiler41.externsRoot = node63;
        compiler32.prepareAst(node63);
        boolean boolean67 = compiler0.areNodesEqualForInlining(node29, node63);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler0.newCompilerOptions();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.PassConfig passConfig70 = compiler0.getPassConfig();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(defaultPassConfig17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(performanceTracker38);
        org.junit.Assert.assertNotNull(defaultPassConfig39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertNull(performanceTracker49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(errorManager56);
        org.junit.Assert.assertNotNull(codingConvention57);
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(compilerOptions68);
        org.junit.Assert.assertNotNull(passConfig70);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler23.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier27 = compiler23.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope28 = compiler23.getTopScope();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler29.recentChange;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler33.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler33.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler33.getOptions();
        compiler29.initOptions(compilerOptions39);
        compiler23.initOptions(compilerOptions39);
        compiler19.initOptions(compilerOptions39);
        compiler0.initOptions(compilerOptions39);
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = null;
        compiler45.tracker = performanceTracker46;
        com.google.javascript.jscomp.ErrorManager errorManager48 = compiler45.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention49 = compiler45.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig50 = compiler45.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker51 = compiler45.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder52 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str53 = codeBuilder52.toString();
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node56 = null;
        compiler55.externsRoot = node56;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker58 = compiler55.tracker;
        com.google.javascript.rhino.Node node60 = compiler55.parseTestCode("");
        compiler45.toSource(codeBuilder52, (int) (byte) 100, node60);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups62 = compiler45.getDiagnosticGroups();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker63 = compiler45.tracker;
        com.google.javascript.jscomp.Tracer tracer65 = compiler45.newTracer("[[{SyntheticVarsDeclar}]]");
        compiler0.stopTracer(tracer65, "[[singleton]]");
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(strSupplier27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(errorManager48);
        org.junit.Assert.assertNotNull(codingConvention49);
        org.junit.Assert.assertNotNull(passConfig50);
        org.junit.Assert.assertNull(performanceTracker51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(performanceTracker58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(diagnosticGroups62);
        org.junit.Assert.assertNull(performanceTracker63);
        org.junit.Assert.assertNotNull(tracer65);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Region region24 = compiler0.getSourceRegion("[{SyntheticVarsDeclar}]", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = compiler0.loadLibraryCode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertNull(region24);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = compiler0.getTypeRegistry();
        java.lang.Exception exception31 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("[hi![singleton]]hi![singleton]", exception31);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?[hi![singleton]]hi![singleton]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(jSTypeRegistry29);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler13.tracker = performanceTracker14;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler13.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler13.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler13.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig20 = compiler13.ensureDefaultPassConfig();
        compiler13.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler13.getCodingConvention();
        compiler0.defaultCodingConvention = codingConvention22;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap24 = compiler0.getCssRenamingMap();
        com.google.javascript.jscomp.Result result25 = compiler0.getResult();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler0.getExternsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(defaultPassConfig20);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNull(cssRenamingMap24);
        org.junit.Assert.assertNotNull(result25);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        compiler0.setProgress((double) 21);
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(errorManager38);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList40 = compiler39.getInputsForTesting();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNull(compilerInputList40);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap35 = compiler0.getFunctionalInformationMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(functionInformationMap35);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler6.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler6.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str14 = codeBuilder13.toString();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        com.google.javascript.rhino.Node node21 = compiler16.parseTestCode("");
        compiler6.toSource(codeBuilder13, (int) (byte) 100, node21);
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler6.getMessages();
        compiler6.disableThreads();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = null;
        compiler25.tracker = performanceTracker26;
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler25.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler25.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler25.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler25.getOptions();
        compiler6.initOptions(compilerOptions31);
        compiler4.options = compilerOptions31;
        compiler0.options = compilerOptions31;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = null;
        compiler35.tracker = performanceTracker36;
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler35.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention39 = compiler35.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig40 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = compiler35.tracker;
        compiler35.reportCodeChange();
        compiler35.startPass("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler35.ensureDefaultPassConfig();
        compiler0.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig45);
        com.google.javascript.rhino.Node node47 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNull(performanceTracker2);
        org.junit.Assert.assertNull(compilerInputList3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(performanceTracker12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(passConfig29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(codingConvention39);
        org.junit.Assert.assertNotNull(passConfig40);
        org.junit.Assert.assertNull(performanceTracker41);
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        int int9 = compiler0.getErrorCount();
        compiler0.setProgress((double) (byte) -1);
        boolean boolean12 = compiler0.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[singleton]");
        compiler0.startPass("");
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap9 = compiler0.getInputsById();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(inputIdMap9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str22 = codeBuilder21.toString();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler24.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler24.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler24.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        java.lang.String str35 = compiler24.toSource(node34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = null;
        compiler36.tracker = performanceTracker37;
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        com.google.javascript.rhino.Node node46 = compiler41.parseTestCode("");
        java.lang.String str47 = compiler36.toSource(node46);
        compiler24.externsRoot = node46;
        compiler0.toSource(codeBuilder21, (int) (byte) 100, node46);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList50 = compiler0.getInputsForTesting();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(compilerInputList50);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        boolean boolean12 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.parsing.Config config13 = compiler0.getParserConfig();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JsAst jsAst15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(config13);
        org.junit.Assert.assertNotNull(passConfig14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler18.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier22 = compiler18.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope23 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange27 = compiler24.recentChange;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = null;
        compiler28.tracker = performanceTracker29;
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler28.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig32 = compiler28.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState33 = compiler28.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler28.getOptions();
        compiler24.initOptions(compilerOptions34);
        compiler18.initOptions(compilerOptions34);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState37 = compiler18.getState();
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler18.getVariableMap();
        boolean boolean39 = compiler18.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler18.options;
        compiler0.options = compilerOptions40;
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler0.options;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(strSupplier22);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNotNull(recentChange27);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertNotNull(passConfig32);
        org.junit.Assert.assertNotNull(intermediateState33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(intermediateState37);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertNotNull(compilerOptions42);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertNotNull(codingConvention9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.externsRoot = node39;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = compiler38.tracker;
        compiler38.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState46 = compiler43.getState();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler47.tracker = performanceTracker48;
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler47.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler47.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig52 = compiler47.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker53 = compiler47.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder54 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str55 = codeBuilder54.toString();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node58 = null;
        compiler57.externsRoot = node58;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = compiler57.tracker;
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("");
        compiler47.toSource(codeBuilder54, (int) (byte) 100, node62);
        intermediateState46.externsRoot = node62;
        com.google.javascript.rhino.Node node65 = intermediateState46.externsRoot;
        compiler38.externAndJsRoot = node65;
        compiler0.prepareAst(node65);
        com.google.javascript.jscomp.JSModule jSModule68 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node69 = compiler0.getNodeForCodeInsertion(jSModule68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNull(performanceTracker41);
        org.junit.Assert.assertNotNull(intermediateState46);
        org.junit.Assert.assertNotNull(errorManager50);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertNotNull(passConfig52);
        org.junit.Assert.assertNull(performanceTracker53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(performanceTracker60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        boolean boolean21 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.Node node22 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler23.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier27 = compiler23.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope28 = compiler23.getTopScope();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler29.recentChange;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler33.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler33.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler33.getOptions();
        compiler29.initOptions(compilerOptions39);
        compiler23.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState42 = compiler23.getState();
        com.google.javascript.jscomp.VariableMap variableMap43 = compiler23.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder44 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str45 = codeBuilder44.toString();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler47.tracker = performanceTracker48;
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler47.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler47.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler52.tracker;
        com.google.javascript.rhino.Node node57 = compiler52.parseTestCode("");
        java.lang.String str58 = compiler47.toSource(node57);
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = null;
        compiler59.tracker = performanceTracker60;
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler59.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention63 = compiler59.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker67 = compiler64.tracker;
        com.google.javascript.rhino.Node node69 = compiler64.parseTestCode("");
        java.lang.String str70 = compiler59.toSource(node69);
        compiler47.externsRoot = node69;
        compiler23.toSource(codeBuilder44, (int) (byte) 100, node69);
        compiler0.prepareAst(node69);
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = compiler0.getOptions();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups75 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(strSupplier27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(intermediateState42);
        org.junit.Assert.assertNull(variableMap43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(errorManager50);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertNotNull(codingConvention63);
        org.junit.Assert.assertNull(performanceTracker67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(compilerOptions74);
        org.junit.Assert.assertNotNull(diagnosticGroups75);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList14 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler0.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups16 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(result13);
        org.junit.Assert.assertNull(compilerInputList14);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(diagnosticGroups16);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler11.tracker;
        com.google.javascript.rhino.Node node16 = compiler11.parseTestCode("");
        java.lang.String str17 = compiler6.toSource(node16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler18.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler18.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler18.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler18.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = compiler18.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str26 = codeBuilder25.toString();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = compiler28.tracker;
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("");
        compiler18.toSource(codeBuilder25, (int) (byte) 100, node33);
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = compiler35.tracker;
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        com.google.javascript.rhino.Node node45 = compiler40.parseTestCode("");
        compiler35.externAndJsRoot = node45;
        boolean boolean47 = compiler6.areNodesEqualForInlining(node33, node45);
        java.lang.String str48 = compiler0.toSource(node45);
        compiler0.reportCodeChange();
        int int50 = compiler0.getErrorCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNull(performanceTracker24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(performanceTracker31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(performanceTracker38);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.defaultCodingConvention;
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler8.tracker = performanceTracker9;
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler8.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler8.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler8.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler8.tracker;
        compiler8.reportCodeChange();
        com.google.javascript.rhino.Node node16 = compiler8.externsRoot;
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler8.getPropertyMap();
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler8.newCompilerOptions();
        compiler0.options = compilerOptions19;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(codingConvention6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(codingConvention12);
        org.junit.Assert.assertNotNull(passConfig13);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(variableMap17);
        org.junit.Assert.assertNotNull(compilerOptions19);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler0.getPropertyMap();
        boolean boolean14 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler0.getWarnings();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(variableMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertArrayEquals(jSErrorArray15, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph38 = compiler0.getModuleGraph();
        com.google.javascript.rhino.Node node41 = compiler0.parseSyntheticCode("{SyntheticVarsDeclar}", "");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = null;
        compiler0.setCssRenamingMap(cssRenamingMap42);
        compiler0.addToDebugLog("[hi![singleton]]");
        com.google.javascript.jscomp.ErrorManager errorManager46 = compiler0.getErrorManager();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNull(jSModuleGraph38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(errorManager46);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig5 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler7.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler7.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler7.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler12.tracker;
        com.google.javascript.rhino.Node node17 = compiler12.parseTestCode("");
        java.lang.String str18 = compiler7.toSource(node17);
        compiler0.jsRoot = node17;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler0.externsRoot = node25;
        com.google.javascript.rhino.Node node27 = compiler0.jsRoot;
        compiler0.reportCodeChange();
        boolean boolean29 = compiler0.precheck();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(defaultPassConfig5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler5.tracker = performanceTracker6;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler5.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        java.lang.String str16 = compiler5.toSource(node15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler5.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap18 = compiler5.getCssRenamingMap();
        java.lang.String str19 = compiler5.toSource();
        boolean boolean20 = compiler5.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions21);
        boolean boolean23 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler24.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier28 = compiler24.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope29 = compiler24.getTopScope();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler30.recentChange;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = null;
        compiler34.tracker = performanceTracker35;
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler34.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig38 = compiler34.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler34.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler34.getOptions();
        compiler30.initOptions(compilerOptions40);
        compiler24.initOptions(compilerOptions40);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler24.getState();
        compiler0.setState(intermediateState43);
        com.google.javascript.rhino.Node node45 = intermediateState43.externsRoot;
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNull(cssRenamingMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(compilerOptions21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(strSupplier28);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(passConfig38);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertNotNull(intermediateState43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler29.getState();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler33.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig38 = compiler33.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler33.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder40 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str41 = codeBuilder40.toString();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler43.tracker;
        com.google.javascript.rhino.Node node48 = compiler43.parseTestCode("");
        compiler33.toSource(codeBuilder40, (int) (byte) 100, node48);
        intermediateState32.externsRoot = node48;
        com.google.javascript.rhino.Node node51 = intermediateState32.externsRoot;
        compiler0.setState(intermediateState32);
        com.google.javascript.jscomp.ErrorManager errorManager53 = compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList54 = compiler0.getExternsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(intermediateState32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNotNull(passConfig38);
        org.junit.Assert.assertNull(performanceTracker39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(errorManager53);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str22 = codeBuilder21.toString();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler24.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler24.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler24.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        java.lang.String str35 = compiler24.toSource(node34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = null;
        compiler36.tracker = performanceTracker37;
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        com.google.javascript.rhino.Node node46 = compiler41.parseTestCode("");
        java.lang.String str47 = compiler36.toSource(node46);
        compiler24.externsRoot = node46;
        compiler0.toSource(codeBuilder21, (int) (byte) 100, node46);
        boolean boolean50 = compiler0.hasErrors();
        boolean boolean51 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap52 = compiler0.getGlobalVarReferences();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(globalVarReferenceMap52);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean2 = codeBuilder0.endsWith("");
        int int3 = codeBuilder0.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = codeBuilder0.append("[]");
        int int6 = codeBuilder5.getLineIndex();
        codeBuilder5.reset();
        codeBuilder5.reset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(codeBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        compiler20.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler20.getState();
        com.google.javascript.rhino.Node node26 = intermediateState25.externsRoot;
        compiler0.setState(intermediateState25);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(intermediateState25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        int int21 = compiler0.getWarningCount();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler0.tracker = performanceTracker22;
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups9 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.defaultCodingConvention;
        boolean boolean12 = compiler0.hasErrors();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = null;
        compiler13.tracker = performanceTracker14;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler13.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = compiler18.tracker;
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("");
        java.lang.String str24 = compiler13.toSource(node23);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler13.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap26 = compiler13.getCssRenamingMap();
        java.lang.String str27 = compiler13.toSource();
        int int28 = compiler13.getWarningCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compiler13.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler30.tracker = performanceTracker31;
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler30.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler30.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = compiler30.tracker;
        compiler30.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier38 = compiler30.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler30.options;
        compiler30.startPass("");
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker45 = compiler42.tracker;
        compiler42.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler42.getState();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = null;
        compiler48.tracker = performanceTracker49;
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler48.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler48.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig53 = compiler48.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = compiler48.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder55 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str56 = codeBuilder55.toString();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        compiler48.toSource(codeBuilder55, (int) (byte) 100, node63);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.externsRoot = node67;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker69 = compiler66.tracker;
        com.google.javascript.jscomp.PassConfig passConfig70 = compiler66.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node72 = null;
        compiler71.externsRoot = node72;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker74 = compiler71.tracker;
        com.google.javascript.rhino.Node node76 = compiler71.parseTestCode("");
        compiler66.externAndJsRoot = node76;
        compiler42.toSource(codeBuilder55, 10, node76);
        com.google.javascript.jscomp.VariableMap variableMap79 = compiler42.getPropertyMap();
        com.google.javascript.jscomp.parsing.Config config80 = compiler42.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node82 = null;
        compiler81.externsRoot = node82;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange84 = compiler81.recentChange;
        compiler42.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange84);
        compiler30.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange84);
        com.google.javascript.jscomp.Tracer tracer88 = compiler30.newTracer("hi!");
        compiler13.stopTracer(tracer88, "[hi![singleton]]hi![singleton]");
        compiler0.stopTracer(tracer88, "hi![singleton]");
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(diagnosticGroups9);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertNull(performanceTracker21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNull(cssRenamingMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(codingConvention34);
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertNull(performanceTracker36);
        org.junit.Assert.assertNotNull(strSupplier38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNull(performanceTracker45);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNotNull(passConfig53);
        org.junit.Assert.assertNull(performanceTracker54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(performanceTracker69);
        org.junit.Assert.assertNotNull(passConfig70);
        org.junit.Assert.assertNull(performanceTracker74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNull(variableMap79);
        org.junit.Assert.assertNotNull(config80);
        org.junit.Assert.assertNotNull(recentChange84);
        org.junit.Assert.assertNotNull(tracer88);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler5.tracker = performanceTracker6;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler5.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler5.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        java.lang.String str16 = compiler5.toSource(node15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler5.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap18 = compiler5.getCssRenamingMap();
        java.lang.String str19 = compiler5.toSource();
        boolean boolean20 = compiler5.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions21);
        boolean boolean23 = compiler0.isIdeMode();
        compiler0.resetUniqueNameId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable25 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNull(cssRenamingMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(compilerOptions21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("{SyntheticVarsDeclar}");
        codeBuilder2.reset();
        int int4 = codeBuilder2.getLength();
        int int5 = codeBuilder2.getLength();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler0.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler0.recentChange;
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(recentChange20);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        compiler0.startPass("");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler16 = null;
        compiler12.removeChangeHandler(codeChangeHandler16);
        boolean boolean18 = compiler12.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node20 = compiler12.parseTestCode("hi!");
        compiler0.externsRoot = node20;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        compiler0.externAndJsRoot = node10;
        com.google.javascript.jscomp.Region region14 = compiler0.getSourceRegion("", 0);
        boolean boolean15 = compiler0.hasRegExpGlobalReferences();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = compiler0.getSourceLine("[hi![singleton]]", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter42 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler44.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange47);
        com.google.javascript.jscomp.CodingConvention codingConvention49 = compiler0.defaultCodingConvention;
        com.google.javascript.rhino.Node node52 = compiler0.parseSyntheticCode("hi!", "");
        boolean boolean53 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CodingConvention codingConvention54 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter42);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertNotNull(codingConvention49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(codingConvention54);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        compiler0.setProgress((double) 21);
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler0.getErrorManager();
        boolean boolean39 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(codingConvention40);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler19.tracker = performanceTracker20;
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler19.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler19.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler19.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler19.getOptions();
        compiler0.initOptions(compilerOptions25);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter27 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker28 = null;
        compiler0.tracker = performanceTracker28;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler30.recentChange;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = null;
        compiler34.tracker = performanceTracker35;
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler34.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig38 = compiler34.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState39 = compiler34.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler34.getOptions();
        compiler30.initOptions(compilerOptions40);
        boolean boolean42 = compiler30.acceptConstKeyword();
        com.google.javascript.jscomp.parsing.Config config43 = compiler30.getParserConfig();
        com.google.javascript.jscomp.PassConfig passConfig44 = compiler30.createPassConfigInternal();
        compiler0.setPassConfig(passConfig44);
        boolean boolean46 = compiler0.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter27);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(passConfig38);
        org.junit.Assert.assertNotNull(intermediateState39);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNotNull(passConfig44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = codeBuilder0.append("hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = codeBuilder0.append("[singleton]");
        boolean boolean7 = codeBuilder5.endsWith("[]");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = codeBuilder5.append("[hi![singleton]]");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = codeBuilder5.append("hi![singleton]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(codeBuilder3);
        org.junit.Assert.assertNotNull(codeBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(codeBuilder9);
        org.junit.Assert.assertNotNull(codeBuilder11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler0.getErrors();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList21 = compiler0.getInputsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerInputList21);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter42 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler44.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange47);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.Node node52 = compiler0.parseSyntheticCode("[[singleton]]", "");
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange54 = compiler0.recentChange;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter42);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertNotNull(jSTypeRegistry49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(recentChange54);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler29.getState();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention37 = compiler33.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig38 = compiler33.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler33.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder40 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str41 = codeBuilder40.toString();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler43.tracker;
        com.google.javascript.rhino.Node node48 = compiler43.parseTestCode("");
        compiler33.toSource(codeBuilder40, (int) (byte) 100, node48);
        intermediateState32.externsRoot = node48;
        com.google.javascript.rhino.Node node51 = intermediateState32.externsRoot;
        compiler0.setState(intermediateState32);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = compiler0.getTypeRegistry();
        boolean boolean54 = compiler0.hasErrors();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(intermediateState32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(codingConvention37);
        org.junit.Assert.assertNotNull(passConfig38);
        org.junit.Assert.assertNull(performanceTracker39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(jSTypeRegistry53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler2.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler2.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope7 = compiler2.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler12.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState17 = compiler12.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler12.getOptions();
        compiler8.initOptions(compilerOptions18);
        compiler2.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler2.getState();
        java.lang.String str22 = compiler2.toSource();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = compiler23.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler23.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler23.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker30 = null;
        compiler29.tracker = performanceTracker30;
        com.google.javascript.jscomp.ErrorManager errorManager32 = compiler29.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention33 = compiler29.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = compiler29.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder36 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str37 = codeBuilder36.toString();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = compiler39.tracker;
        com.google.javascript.rhino.Node node44 = compiler39.parseTestCode("");
        compiler29.toSource(codeBuilder36, (int) (byte) 100, node44);
        com.google.javascript.jscomp.JSError[] jSErrorArray46 = compiler29.getMessages();
        compiler29.disableThreads();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = null;
        compiler48.tracker = performanceTracker49;
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler48.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig52 = compiler48.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState53 = compiler48.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler48.getOptions();
        compiler29.initOptions(compilerOptions54);
        compiler27.options = compilerOptions54;
        compiler23.options = compilerOptions54;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState67 = compiler64.getState();
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker69 = null;
        compiler68.tracker = performanceTracker69;
        com.google.javascript.jscomp.ErrorManager errorManager71 = compiler68.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention72 = compiler68.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig73 = compiler68.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker74 = compiler68.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder75 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str76 = codeBuilder75.toString();
        com.google.javascript.jscomp.Compiler compiler78 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node79 = null;
        compiler78.externsRoot = node79;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker81 = compiler78.tracker;
        com.google.javascript.rhino.Node node83 = compiler78.parseTestCode("");
        compiler68.toSource(codeBuilder75, (int) (byte) 100, node83);
        intermediateState67.externsRoot = node83;
        compiler58.setState(intermediateState67);
        com.google.javascript.rhino.Node node88 = compiler58.parseTestCode("[]");
        java.lang.String str89 = compiler23.toSource(node88);
        compiler2.externsRoot = node88;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.prepareAst(node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(passConfig16);
        org.junit.Assert.assertNotNull(intermediateState17);
        org.junit.Assert.assertNotNull(compilerOptions18);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(performanceTracker24);
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNull(compilerInputList26);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(errorManager32);
        org.junit.Assert.assertNotNull(codingConvention33);
        org.junit.Assert.assertNotNull(passConfig34);
        org.junit.Assert.assertNull(performanceTracker35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(performanceTracker42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(jSErrorArray46);
        org.junit.Assert.assertArrayEquals(jSErrorArray46, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(passConfig52);
        org.junit.Assert.assertNotNull(intermediateState53);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(intermediateState67);
        org.junit.Assert.assertNotNull(errorManager71);
        org.junit.Assert.assertNotNull(codingConvention72);
        org.junit.Assert.assertNotNull(passConfig73);
        org.junit.Assert.assertNull(performanceTracker74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(performanceTracker81);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "[]" + "'", str89, "[]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.externsRoot = node4;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler3.recentChange;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler7.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler7.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler7.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler7.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler7.getOptions();
        compiler3.initOptions(compilerOptions13);
        compiler3.initCompilerOptionsIfTesting();
        boolean boolean16 = compiler3.isInliningForbidden();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.externsRoot = node18;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = compiler17.tracker;
        compiler17.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler17.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler17.getState();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig24 = compiler17.ensureDefaultPassConfig();
        compiler3.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig24);
        compiler0.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig24);
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNull(compilerOptions2);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(performanceTracker20);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(defaultPassConfig24);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        boolean boolean12 = compiler0.acceptConstKeyword();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.Node node15 = compiler0.parseTestCode("[[{SyntheticVarsDeclar}]]");
        compiler0.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        boolean boolean19 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModuleGraph jSModuleGraph21 = compiler0.getDegenerateModuleGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(sourceMap20);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.TypeValidator typeValidator17 = compiler0.getTypeValidator();
        java.lang.String str18 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState22 = compiler19.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler19.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler24.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler24.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler24.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        java.lang.String str35 = compiler24.toSource(node34);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler24.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap37 = compiler24.getCssRenamingMap();
        java.lang.String str38 = compiler24.toSource();
        boolean boolean39 = compiler24.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler24.newCompilerOptions();
        compiler19.initOptions(compilerOptions40);
        boolean boolean42 = compiler19.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = null;
        compiler43.tracker = performanceTracker44;
        com.google.javascript.jscomp.ErrorManager errorManager46 = compiler43.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention47 = compiler43.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker51 = compiler48.tracker;
        com.google.javascript.rhino.Node node53 = compiler48.parseTestCode("");
        java.lang.String str54 = compiler43.toSource(node53);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler43.getOptions();
        compiler19.options = compilerOptions55;
        compiler19.startPass("[singleton]");
        com.google.javascript.rhino.Node node61 = compiler19.parseSyntheticCode("[singleton]", "hi!");
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker63 = null;
        compiler62.tracker = performanceTracker63;
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler62.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention66 = compiler62.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig67 = compiler62.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker68 = compiler62.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder69 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str70 = codeBuilder69.toString();
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node73 = null;
        compiler72.externsRoot = node73;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker75 = compiler72.tracker;
        com.google.javascript.rhino.Node node77 = compiler72.parseTestCode("");
        compiler62.toSource(codeBuilder69, (int) (byte) 100, node77);
        com.google.javascript.jscomp.JSError[] jSErrorArray79 = compiler62.getMessages();
        compiler62.disableThreads();
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node82 = null;
        compiler81.externsRoot = node82;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker84 = compiler81.tracker;
        compiler81.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState86 = compiler81.getState();
        com.google.javascript.rhino.Node node88 = compiler81.parseTestCode("");
        java.lang.String str89 = compiler62.toSource(node88);
        boolean boolean90 = compiler0.areNodesEqualForInlining(node61, node88);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(typeValidator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(intermediateState22);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNull(cssRenamingMap37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(errorManager46);
        org.junit.Assert.assertNotNull(codingConvention47);
        org.junit.Assert.assertNull(performanceTracker51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(codingConvention66);
        org.junit.Assert.assertNotNull(passConfig67);
        org.junit.Assert.assertNull(performanceTracker68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(performanceTracker75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(jSErrorArray79);
        org.junit.Assert.assertArrayEquals(jSErrorArray79, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(performanceTracker84);
        org.junit.Assert.assertNotNull(intermediateState86);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        boolean boolean21 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.Node node22 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler23.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier27 = compiler23.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope28 = compiler23.getTopScope();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler29.recentChange;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler33.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler33.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler33.getOptions();
        compiler29.initOptions(compilerOptions39);
        compiler23.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState42 = compiler23.getState();
        com.google.javascript.jscomp.VariableMap variableMap43 = compiler23.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder44 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str45 = codeBuilder44.toString();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler47.tracker = performanceTracker48;
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler47.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler47.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler52.tracker;
        com.google.javascript.rhino.Node node57 = compiler52.parseTestCode("");
        java.lang.String str58 = compiler47.toSource(node57);
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = null;
        compiler59.tracker = performanceTracker60;
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler59.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention63 = compiler59.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker67 = compiler64.tracker;
        com.google.javascript.rhino.Node node69 = compiler64.parseTestCode("");
        java.lang.String str70 = compiler59.toSource(node69);
        compiler47.externsRoot = node69;
        compiler23.toSource(codeBuilder44, (int) (byte) 100, node69);
        compiler0.prepareAst(node69);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable74 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(strSupplier27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(intermediateState42);
        org.junit.Assert.assertNull(variableMap43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(errorManager50);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertNotNull(codingConvention63);
        org.junit.Assert.assertNull(performanceTracker67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[singleton]");
        compiler0.startPass("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsForTesting();
        boolean boolean10 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig11 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(compilerInputList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(defaultPassConfig11);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        boolean boolean4 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler5.getState();
        compiler0.setState(intermediateState10);
        compiler0.initCompilerOptionsIfTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler0.getExternsForTesting();
        boolean boolean14 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str22 = codeBuilder21.toString();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler24.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler24.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler24.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        java.lang.String str35 = compiler24.toSource(node34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = null;
        compiler36.tracker = performanceTracker37;
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        com.google.javascript.rhino.Node node46 = compiler41.parseTestCode("");
        java.lang.String str47 = compiler36.toSource(node46);
        compiler24.externsRoot = node46;
        compiler0.toSource(codeBuilder21, (int) (byte) 100, node46);
        com.google.javascript.jscomp.JSError[] jSErrorArray50 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node51 = compiler0.externsRoot;
        boolean boolean52 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(jSErrorArray50);
        org.junit.Assert.assertArrayEquals(jSErrorArray50, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        compiler0.setProgress((double) 21);
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile39 = null;
        com.google.javascript.jscomp.SourceFile sourceFile40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState44 = compiler41.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compiler41.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker47 = null;
        compiler46.tracker = performanceTracker47;
        com.google.javascript.jscomp.ErrorManager errorManager49 = compiler46.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention50 = compiler46.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = compiler51.tracker;
        com.google.javascript.rhino.Node node56 = compiler51.parseTestCode("");
        java.lang.String str57 = compiler46.toSource(node56);
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler46.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap59 = compiler46.getCssRenamingMap();
        java.lang.String str60 = compiler46.toSource();
        boolean boolean61 = compiler46.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler46.newCompilerOptions();
        compiler41.initOptions(compilerOptions62);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result64 = compiler0.compile(sourceFile39, sourceFile40, compilerOptions62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(intermediateState44);
        org.junit.Assert.assertNotNull(errorReporter45);
        org.junit.Assert.assertNotNull(errorManager49);
        org.junit.Assert.assertNotNull(codingConvention50);
        org.junit.Assert.assertNull(performanceTracker54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(compilerOptions58);
        org.junit.Assert.assertNull(cssRenamingMap59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(compilerOptions62);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str22 = codeBuilder21.toString();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler24.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler24.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler24.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        java.lang.String str35 = compiler24.toSource(node34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = null;
        compiler36.tracker = performanceTracker37;
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        com.google.javascript.rhino.Node node46 = compiler41.parseTestCode("");
        java.lang.String str47 = compiler36.toSource(node46);
        compiler24.externsRoot = node46;
        compiler0.toSource(codeBuilder21, (int) (byte) 100, node46);
        boolean boolean50 = compiler0.hasErrors();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups51 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler52.tracker;
        compiler52.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState57 = compiler52.getState();
        compiler0.setState(intermediateState57);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(diagnosticGroups51);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertNotNull(intermediateState57);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNull(performanceTracker7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        boolean boolean5 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.externsRoot = node8;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler7.recentChange;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler11.tracker = performanceTracker12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler11.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler11.getOptions();
        compiler7.initOptions(compilerOptions17);
        compiler0.options = compilerOptions17;
        java.lang.String str20 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler0.defaultCodingConvention;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(result6);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(codingConvention21);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        compiler0.setHasRegExpGlobalReferences(true);
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        int int9 = compiler0.getErrorCount();
        compiler0.setProgress((double) (byte) -1);
        boolean boolean12 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler0.newCompilerOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compilerOptions13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph38 = compiler0.getModuleGraph();
        com.google.javascript.rhino.Node node41 = compiler0.parseSyntheticCode("{SyntheticVarsDeclar}", "");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = null;
        compiler0.setCssRenamingMap(cssRenamingMap42);
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler44.getState();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = null;
        compiler48.tracker = performanceTracker49;
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler48.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler48.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig53 = compiler48.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = compiler48.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder55 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str56 = codeBuilder55.toString();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        compiler48.toSource(codeBuilder55, (int) (byte) 100, node63);
        intermediateState47.externsRoot = node63;
        com.google.javascript.rhino.Node node66 = intermediateState47.externsRoot;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker68 = null;
        compiler67.tracker = performanceTracker68;
        com.google.javascript.jscomp.ErrorManager errorManager70 = compiler67.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention71 = compiler67.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node73 = null;
        compiler72.externsRoot = node73;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker75 = compiler72.tracker;
        com.google.javascript.rhino.Node node77 = compiler72.parseTestCode("");
        java.lang.String str78 = compiler67.toSource(node77);
        intermediateState47.externsRoot = node77;
        compiler0.externsRoot = node77;
        int int81 = compiler0.getErrorCount();
        com.google.javascript.jscomp.ErrorManager errorManager82 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState83 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNull(jSModuleGraph38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNotNull(passConfig53);
        org.junit.Assert.assertNull(performanceTracker54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(errorManager70);
        org.junit.Assert.assertNotNull(codingConvention71);
        org.junit.Assert.assertNull(performanceTracker75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(errorManager82);
        org.junit.Assert.assertNotNull(intermediateState83);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        int int9 = compiler0.getErrorCount();
        compiler0.setProgress((double) (byte) -1);
        boolean boolean12 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler13.getState();
        boolean boolean17 = compiler13.precheck();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = compiler18.tracker;
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        compiler13.setState(intermediateState23);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = null;
        compiler25.tracker = performanceTracker26;
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler25.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention29 = compiler25.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = compiler30.tracker;
        com.google.javascript.rhino.Node node35 = compiler30.parseTestCode("");
        java.lang.String str36 = compiler25.toSource(node35);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = null;
        compiler37.tracker = performanceTracker38;
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler37.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler37.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig42 = compiler37.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler37.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder44 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str45 = codeBuilder44.toString();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node48 = null;
        compiler47.externsRoot = node48;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker50 = compiler47.tracker;
        com.google.javascript.rhino.Node node52 = compiler47.parseTestCode("");
        compiler37.toSource(codeBuilder44, (int) (byte) 100, node52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.externsRoot = node55;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker57 = compiler54.tracker;
        com.google.javascript.jscomp.PassConfig passConfig58 = compiler54.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = null;
        compiler59.externsRoot = node60;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker62 = compiler59.tracker;
        com.google.javascript.rhino.Node node64 = compiler59.parseTestCode("");
        compiler54.externAndJsRoot = node64;
        boolean boolean66 = compiler25.areNodesEqualForInlining(node52, node64);
        intermediateState23.externsRoot = node64;
        com.google.javascript.rhino.Node node68 = intermediateState23.externsRoot;
        com.google.javascript.rhino.Node node69 = intermediateState23.externsRoot;
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker71 = null;
        compiler70.tracker = performanceTracker71;
        com.google.javascript.jscomp.ErrorManager errorManager73 = compiler70.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention74 = compiler70.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node76 = null;
        compiler75.externsRoot = node76;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker78 = compiler75.tracker;
        com.google.javascript.rhino.Node node80 = compiler75.parseTestCode("");
        java.lang.String str81 = compiler70.toSource(node80);
        boolean boolean82 = compiler0.areNodesEqualForInlining(node69, node80);
        compiler0.setHasRegExpGlobalReferences(false);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(performanceTracker21);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(codingConvention29);
        org.junit.Assert.assertNull(performanceTracker33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(codingConvention41);
        org.junit.Assert.assertNotNull(passConfig42);
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(performanceTracker50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(performanceTracker57);
        org.junit.Assert.assertNotNull(passConfig58);
        org.junit.Assert.assertNull(performanceTracker62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(errorManager73);
        org.junit.Assert.assertNotNull(codingConvention74);
        org.junit.Assert.assertNull(performanceTracker78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        java.lang.String str11 = compiler0.toSource();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getWarnings();
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(variableMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertArrayEquals(jSErrorArray12, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        compiler0.startPass("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap10 = null;
        compiler0.setCssRenamingMap(cssRenamingMap10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler12.tracker;
        compiler12.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig17 = compiler12.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node18 = compiler12.externsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler19.tracker = performanceTracker20;
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler19.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler19.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        com.google.javascript.rhino.Node node29 = compiler24.parseTestCode("");
        java.lang.String str30 = compiler19.toSource(node29);
        compiler12.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker33 = null;
        compiler32.tracker = performanceTracker33;
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler32.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler32.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler32.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = compiler32.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig39 = compiler32.ensureDefaultPassConfig();
        boolean boolean40 = compiler32.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = null;
        compiler41.tracker = performanceTracker42;
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler41.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler41.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = compiler46.tracker;
        com.google.javascript.rhino.Node node51 = compiler46.parseTestCode("");
        java.lang.String str52 = compiler41.toSource(node51);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = null;
        compiler53.tracker = performanceTracker54;
        com.google.javascript.jscomp.ErrorManager errorManager56 = compiler53.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention57 = compiler53.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        java.lang.String str64 = compiler53.toSource(node63);
        compiler41.externsRoot = node63;
        compiler32.prepareAst(node63);
        boolean boolean67 = compiler0.areNodesEqualForInlining(node29, node63);
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node69 = null;
        compiler68.externsRoot = node69;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange71 = compiler68.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange71);
        com.google.javascript.jscomp.CodingConvention codingConvention73 = compiler0.getCodingConvention();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList74 = compiler0.getExternsForTesting();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(defaultPassConfig17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(performanceTracker38);
        org.junit.Assert.assertNotNull(defaultPassConfig39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertNull(performanceTracker49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(errorManager56);
        org.junit.Assert.assertNotNull(codingConvention57);
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(recentChange71);
        org.junit.Assert.assertNotNull(codingConvention73);
        org.junit.Assert.assertNull(compilerInputList74);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        boolean boolean4 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        compiler5.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler5.getState();
        compiler0.setState(intermediateState10);
        compiler0.initCompilerOptionsIfTesting();
        double double13 = compiler0.getProgress();
        boolean boolean14 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.rhino.Node node30 = compiler0.parseTestCode("[]");
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = compiler31.tracker;
        compiler31.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig36 = compiler31.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node37 = compiler31.externsRoot;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = null;
        compiler38.tracker = performanceTracker39;
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler38.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention42 = compiler38.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = compiler43.tracker;
        com.google.javascript.rhino.Node node48 = compiler43.parseTestCode("");
        java.lang.String str49 = compiler38.toSource(node48);
        compiler31.jsRoot = node48;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = compiler51.tracker;
        com.google.javascript.rhino.Node node56 = compiler51.parseTestCode("");
        compiler31.externsRoot = node56;
        com.google.javascript.rhino.Node node58 = compiler31.jsRoot;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups59 = compiler31.getDiagnosticGroups();
        com.google.javascript.rhino.Node node61 = compiler31.parseTestCode("[[hi![singleton]]hi![singleton]]");
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker63 = null;
        compiler62.tracker = performanceTracker63;
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler62.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention66 = compiler62.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig67 = compiler62.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker68 = compiler62.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder69 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str70 = codeBuilder69.toString();
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node73 = null;
        compiler72.externsRoot = node73;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker75 = compiler72.tracker;
        com.google.javascript.rhino.Node node77 = compiler72.parseTestCode("");
        compiler62.toSource(codeBuilder69, (int) (byte) 100, node77);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups79 = compiler62.getDiagnosticGroups();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker80 = compiler62.tracker;
        com.google.javascript.jscomp.Tracer tracer82 = compiler62.newTracer("[[{SyntheticVarsDeclar}]]");
        compiler31.stopTracer(tracer82, "[[hi![singleton]]hi![singleton]]");
        compiler0.stopTracer(tracer82, "hi!");
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(performanceTracker34);
        org.junit.Assert.assertNotNull(defaultPassConfig36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(codingConvention42);
        org.junit.Assert.assertNull(performanceTracker46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(performanceTracker54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(diagnosticGroups59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(codingConvention66);
        org.junit.Assert.assertNotNull(passConfig67);
        org.junit.Assert.assertNull(performanceTracker68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(performanceTracker75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(diagnosticGroups79);
        org.junit.Assert.assertNull(performanceTracker80);
        org.junit.Assert.assertNotNull(tracer82);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler5.recentChange;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler9.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler9.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler9.getOptions();
        compiler5.initOptions(compilerOptions15);
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler5.getCodingConvention();
        compiler0.defaultCodingConvention = codingConvention17;
        com.google.javascript.rhino.Node node19 = compiler0.externsRoot;
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(passConfig13);
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler11.tracker = performanceTracker12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler11.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        com.google.javascript.rhino.Node node21 = compiler16.parseTestCode("");
        java.lang.String str22 = compiler11.toSource(node21);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention27 = compiler23.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = compiler28.tracker;
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("");
        java.lang.String str34 = compiler23.toSource(node33);
        compiler11.externsRoot = node33;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = null;
        compiler36.tracker = performanceTracker37;
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig41 = compiler36.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = compiler36.tracker;
        com.google.javascript.jscomp.JSError[] jSErrorArray43 = compiler36.getErrors();
        com.google.javascript.rhino.Node node45 = compiler36.parseTestCode("[[{SyntheticVarsDeclar}]]");
        java.lang.String str46 = compiler11.toSource(node45);
        intermediateState10.externsRoot = node45;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(codingConvention15);
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(codingConvention27);
        org.junit.Assert.assertNull(performanceTracker31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNotNull(passConfig41);
        org.junit.Assert.assertNull(performanceTracker42);
        org.junit.Assert.assertNotNull(jSErrorArray43);
        org.junit.Assert.assertArrayEquals(jSErrorArray43, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig5 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler7.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler7.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler7.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler12.tracker;
        com.google.javascript.rhino.Node node17 = compiler12.parseTestCode("");
        java.lang.String str18 = compiler7.toSource(node17);
        compiler0.jsRoot = node17;
        com.google.javascript.jscomp.CodingConvention codingConvention20 = compiler0.defaultCodingConvention;
        com.google.common.base.Supplier<java.lang.String> strSupplier21 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler0.newCompilerOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler0.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(defaultPassConfig5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(codingConvention20);
        org.junit.Assert.assertNotNull(strSupplier21);
        org.junit.Assert.assertNotNull(compilerOptions22);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        compiler0.setProgress((double) 21);
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler(errorManager38);
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        compiler40.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState48 = compiler45.getState();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker50 = null;
        compiler49.tracker = performanceTracker50;
        com.google.javascript.jscomp.ErrorManager errorManager52 = compiler49.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention53 = compiler49.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig54 = compiler49.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler49.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder56 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str57 = codeBuilder56.toString();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = null;
        compiler59.externsRoot = node60;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker62 = compiler59.tracker;
        com.google.javascript.rhino.Node node64 = compiler59.parseTestCode("");
        compiler49.toSource(codeBuilder56, (int) (byte) 100, node64);
        intermediateState48.externsRoot = node64;
        com.google.javascript.rhino.Node node67 = intermediateState48.externsRoot;
        compiler40.externAndJsRoot = node67;
        java.lang.String str69 = compiler39.toSource(node67);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(intermediateState48);
        org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(codingConvention53);
        org.junit.Assert.assertNotNull(passConfig54);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(performanceTracker62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        java.lang.String str20 = compiler0.toSource();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker21 = null;
        compiler0.tracker = performanceTracker21;
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig24 = compiler0.getPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = compiler0.getSourceLine("[{SyntheticVarsDeclar}]", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(passConfig24);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModuleGraph jSModuleGraph13 = compiler0.getDegenerateModuleGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(codingConvention12);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups29 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.parsing.Config config30 = compiler0.getParserConfig();
        com.google.javascript.rhino.Node node32 = compiler0.parseSyntheticCode("[hi![singleton]]hi![singleton]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups33 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(diagnosticGroups29);
        org.junit.Assert.assertNotNull(config30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(diagnosticGroups33);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        boolean boolean12 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.parsing.Config config13 = compiler0.getParserConfig();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.externsRoot = node16;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler15.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier19 = compiler15.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope20 = compiler15.getTopScope();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.externsRoot = node22;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler21.recentChange;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = null;
        compiler25.tracker = performanceTracker26;
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler25.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler25.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler25.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler25.getOptions();
        compiler21.initOptions(compilerOptions31);
        compiler15.initOptions(compilerOptions31);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState34 = compiler15.getState();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler15.getVariableMap();
        compiler15.disableThreads();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap37 = compiler15.getFunctionalInformationMap();
        compiler15.resetUniqueNameId();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler15.options;
        compiler0.options = compilerOptions39;
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(config13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNotNull(strSupplier19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(passConfig29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNotNull(intermediateState34);
        org.junit.Assert.assertNull(variableMap35);
        org.junit.Assert.assertNull(functionInformationMap37);
        org.junit.Assert.assertNotNull(compilerOptions39);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compiler0.languageMode();
        int int12 = compiler0.getWarningCount();
        com.google.javascript.rhino.InputId inputId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeExternInput(inputId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNull(functionInformationMap10);
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JsAst jsAst9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = compiler0.replaceIncrementalSourceAst(jsAst9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler6.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler6.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str14 = codeBuilder13.toString();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        com.google.javascript.rhino.Node node21 = compiler16.parseTestCode("");
        compiler6.toSource(codeBuilder13, (int) (byte) 100, node21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler24.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        compiler24.externAndJsRoot = node34;
        compiler0.toSource(codeBuilder13, 10, node34);
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node38 = compiler0.getRoot();
        boolean boolean39 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(performanceTracker12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.jscomp.SourceFile sourceFile4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = compiler0.parse(sourceFile4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator4 = compiler0.getTypedScopeCreator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNull(memoizedScopeCreator4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig5 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler7.tracker = performanceTracker8;
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler7.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler7.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler12.tracker;
        com.google.javascript.rhino.Node node17 = compiler12.parseTestCode("");
        java.lang.String str18 = compiler7.toSource(node17);
        compiler0.jsRoot = node17;
        com.google.javascript.jscomp.Scope scope20 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig26 = compiler21.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler21.tracker;
        compiler21.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = null;
        compiler21.tracker = performanceTracker29;
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler21.getPropertyMap();
        compiler21.startPass("[[singleton]]");
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = null;
        compiler34.tracker = performanceTracker35;
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler34.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention38 = compiler34.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler34.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker40 = compiler34.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder41 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str42 = codeBuilder41.toString();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker47 = compiler44.tracker;
        com.google.javascript.rhino.Node node49 = compiler44.parseTestCode("");
        compiler34.toSource(codeBuilder41, (int) (byte) 100, node49);
        com.google.javascript.jscomp.JSError[] jSErrorArray51 = compiler34.getMessages();
        compiler34.disableThreads();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.externsRoot = node54;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange56 = compiler53.recentChange;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker58 = null;
        compiler57.tracker = performanceTracker58;
        com.google.javascript.jscomp.ErrorManager errorManager60 = compiler57.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig61 = compiler57.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState62 = compiler57.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler57.getOptions();
        compiler53.initOptions(compilerOptions63);
        compiler53.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.externsRoot = node67;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange69 = compiler66.recentChange;
        compiler53.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange69);
        compiler34.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange69);
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange69);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange69);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(defaultPassConfig5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNull(performanceTracker15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNotNull(passConfig26);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNull(variableMap31);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNotNull(codingConvention38);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNull(performanceTracker40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(performanceTracker47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSErrorArray51);
        org.junit.Assert.assertArrayEquals(jSErrorArray51, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange56);
        org.junit.Assert.assertNotNull(errorManager60);
        org.junit.Assert.assertNotNull(passConfig61);
        org.junit.Assert.assertNotNull(intermediateState62);
        org.junit.Assert.assertNotNull(compilerOptions63);
        org.junit.Assert.assertNotNull(recentChange69);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.rhino.Node node44 = compiler0.parseSyntheticCode("hi![singleton]", "");
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator13 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler0.getOptions();
        boolean boolean15 = compiler0.hasHaltingErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initInputsByIdMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(memoizedScopeCreator13);
        org.junit.Assert.assertNotNull(compilerOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        boolean boolean13 = compiler0.isInliningForbidden();
        compiler0.setProgress(0.0d);
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler4.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler4.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler14.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler14.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler14.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler14.getOptions();
        compiler10.initOptions(compilerOptions20);
        compiler4.initOptions(compilerOptions20);
        compiler0.initOptions(compilerOptions20);
        int int24 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        boolean boolean18 = codeBuilder7.endsWith("[[singleton]]");
        int int19 = codeBuilder7.getLineIndex();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(defaultPassConfig6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator13 = compiler0.getTypedScopeCreator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        compiler0.startPass("{SyntheticVarsDeclar}");
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(memoizedScopeCreator13);
        org.junit.Assert.assertNotNull(compilerOptions15);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = compiler0.getCssRenamingMap();
        java.lang.String str14 = compiler0.toSource();
        int int15 = compiler0.getWarningCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator17 = compiler0.getTypedScopeCreator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable18 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNull(cssRenamingMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertNull(memoizedScopeCreator17);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = compiler0.getCssRenamingMap();
        java.lang.String str14 = compiler0.toSource();
        boolean boolean15 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig16 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.externsRoot = node18;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = compiler17.tracker;
        com.google.javascript.rhino.Node node22 = compiler17.parseTestCode("");
        compiler0.externAndJsRoot = node22;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNull(cssRenamingMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(defaultPassConfig16);
        org.junit.Assert.assertNull(performanceTracker20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        int int8 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler9.tracker;
        compiler9.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler9.getSourceMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler9.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler9.tracker;
        double double17 = compiler9.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler9.getErrorManager();
        compiler0.setErrorManager(errorManager18);
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(variableMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(performanceTracker12);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(errorManager18);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        boolean boolean8 = compiler0.hasErrors();
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator12 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler13.getState();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler13.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention18;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(memoizedScopeCreator12);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(codingConvention18);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.reportCodeChange();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNull(compilerInputList5);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler4.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler4.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler14.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler14.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler14.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler14.getOptions();
        compiler10.initOptions(compilerOptions20);
        compiler4.initOptions(compilerOptions20);
        compiler0.initOptions(compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        compiler24.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler24.getState();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler30.tracker = performanceTracker31;
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler30.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler30.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = compiler30.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder37 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str38 = codeBuilder37.toString();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        com.google.javascript.rhino.Node node45 = compiler40.parseTestCode("");
        compiler30.toSource(codeBuilder37, (int) (byte) 100, node45);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker51 = compiler48.tracker;
        com.google.javascript.jscomp.PassConfig passConfig52 = compiler48.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.externsRoot = node54;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker56 = compiler53.tracker;
        com.google.javascript.rhino.Node node58 = compiler53.parseTestCode("");
        compiler48.externAndJsRoot = node58;
        compiler24.toSource(codeBuilder37, 10, node58);
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.externsRoot = node62;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker64 = compiler61.tracker;
        compiler61.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.externsRoot = node67;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState69 = compiler66.getState();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker71 = null;
        compiler70.tracker = performanceTracker71;
        com.google.javascript.jscomp.ErrorManager errorManager73 = compiler70.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention74 = compiler70.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig75 = compiler70.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker76 = compiler70.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder77 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str78 = codeBuilder77.toString();
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node81 = null;
        compiler80.externsRoot = node81;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker83 = compiler80.tracker;
        com.google.javascript.rhino.Node node85 = compiler80.parseTestCode("");
        compiler70.toSource(codeBuilder77, (int) (byte) 100, node85);
        intermediateState69.externsRoot = node85;
        com.google.javascript.rhino.Node node88 = intermediateState69.externsRoot;
        compiler61.externAndJsRoot = node88;
        boolean boolean90 = compiler0.areNodesEqualForInlining(node58, node88);
        com.google.javascript.rhino.Node node91 = compiler0.getRoot();
        java.lang.String str92 = compiler0.toSource();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap93 = compiler0.getCssRenamingMap();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(codingConvention34);
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertNull(performanceTracker36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(performanceTracker51);
        org.junit.Assert.assertNotNull(passConfig52);
        org.junit.Assert.assertNull(performanceTracker56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(performanceTracker64);
        org.junit.Assert.assertNotNull(intermediateState69);
        org.junit.Assert.assertNotNull(errorManager73);
        org.junit.Assert.assertNotNull(codingConvention74);
        org.junit.Assert.assertNotNull(passConfig75);
        org.junit.Assert.assertNull(performanceTracker76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(performanceTracker83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNull(cssRenamingMap93);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph38 = compiler0.getModuleGraph();
        com.google.javascript.rhino.Node node41 = compiler0.parseSyntheticCode("{SyntheticVarsDeclar}", "");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler0.recentChange;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNull(jSModuleGraph38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(recentChange42);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler9.tracker = performanceTracker10;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler9.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = compiler14.tracker;
        com.google.javascript.rhino.Node node19 = compiler14.parseTestCode("");
        java.lang.String str20 = compiler9.toSource(node19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker22 = null;
        compiler21.tracker = performanceTracker22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler21.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler26.tracker;
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("");
        java.lang.String str32 = compiler21.toSource(node31);
        compiler9.externsRoot = node31;
        compiler0.prepareAst(node31);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.JSModule jSModule36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = compiler0.getNodeForCodeInsertion(jSModule36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(performanceTracker17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(compilerInputList35);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        com.google.javascript.jscomp.SourceFile sourceFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = compiler0.parse(sourceFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = codeBuilder7.append("{SyntheticVarsDeclar}");
        java.lang.String str19 = codeBuilder7.toString();
        int int20 = codeBuilder7.getLineIndex();
        int int21 = codeBuilder7.getColumnIndex();
        int int22 = codeBuilder7.getLineIndex();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(codeBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{SyntheticVarsDeclar}" + "'", str19, "{SyntheticVarsDeclar}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getPropertyMap();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertNull(variableMap6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = compiler0.getCssRenamingMap();
        java.lang.String str14 = compiler0.toSource();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNull(cssRenamingMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.getOptions();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = compiler0.getCssRenamingMap();
        java.lang.String str14 = compiler0.toSource();
        boolean boolean15 = compiler0.hasHaltingErrors();
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JsAst jsAst17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addIncrementalSourceAst(jsAst17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNull(cssRenamingMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSupplier16);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker45 = compiler42.tracker;
        compiler42.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler42.getState();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = null;
        compiler48.tracker = performanceTracker49;
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler48.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler48.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig53 = compiler48.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = compiler48.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder55 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str56 = codeBuilder55.toString();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler58.tracker;
        com.google.javascript.rhino.Node node63 = compiler58.parseTestCode("");
        compiler48.toSource(codeBuilder55, (int) (byte) 100, node63);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.externsRoot = node67;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker69 = compiler66.tracker;
        com.google.javascript.jscomp.PassConfig passConfig70 = compiler66.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node72 = null;
        compiler71.externsRoot = node72;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker74 = compiler71.tracker;
        com.google.javascript.rhino.Node node76 = compiler71.parseTestCode("");
        compiler66.externAndJsRoot = node76;
        compiler42.toSource(codeBuilder55, 10, node76);
        compiler0.jsRoot = node76;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups80 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(performanceTracker45);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNotNull(passConfig53);
        org.junit.Assert.assertNull(performanceTracker54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(performanceTracker69);
        org.junit.Assert.assertNotNull(passConfig70);
        org.junit.Assert.assertNull(performanceTracker74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(diagnosticGroups80);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler6.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler6.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str14 = codeBuilder13.toString();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        com.google.javascript.rhino.Node node21 = compiler16.parseTestCode("");
        compiler6.toSource(codeBuilder13, (int) (byte) 100, node21);
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler6.getMessages();
        compiler6.disableThreads();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = null;
        compiler25.tracker = performanceTracker26;
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler25.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler25.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState30 = compiler25.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler25.getOptions();
        compiler6.initOptions(compilerOptions31);
        compiler4.options = compilerOptions31;
        compiler0.options = compilerOptions31;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = compiler0.ensureLibraryInjected("[[{SyntheticVarsDeclar}]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNull(performanceTracker2);
        org.junit.Assert.assertNull(compilerInputList3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(performanceTracker12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(passConfig29);
        org.junit.Assert.assertNotNull(intermediateState30);
        org.junit.Assert.assertNotNull(compilerOptions31);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler0.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = codeBuilder0.append("hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = codeBuilder0.append("[singleton]");
        boolean boolean7 = codeBuilder5.endsWith("[singleton]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(codeBuilder3);
        org.junit.Assert.assertNotNull(codeBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        compiler0.startPass("");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler12.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = compiler12.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler18.recentChange;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = null;
        compiler22.tracker = performanceTracker23;
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler22.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig26 = compiler22.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler22.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler22.getOptions();
        compiler18.initOptions(compilerOptions28);
        compiler12.initOptions(compilerOptions28);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState31 = compiler12.getState();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler12.getVariableMap();
        boolean boolean33 = compiler12.acceptConstKeyword();
        com.google.javascript.rhino.Node node34 = compiler12.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler35.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier39 = compiler35.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope40 = compiler35.getTopScope();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler41.recentChange;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker46 = null;
        compiler45.tracker = performanceTracker46;
        com.google.javascript.jscomp.ErrorManager errorManager48 = compiler45.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig49 = compiler45.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState50 = compiler45.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler45.getOptions();
        compiler41.initOptions(compilerOptions51);
        compiler35.initOptions(compilerOptions51);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState54 = compiler35.getState();
        com.google.javascript.jscomp.VariableMap variableMap55 = compiler35.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder56 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str57 = codeBuilder56.toString();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = null;
        compiler59.tracker = performanceTracker60;
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler59.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention63 = compiler59.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker67 = compiler64.tracker;
        com.google.javascript.rhino.Node node69 = compiler64.parseTestCode("");
        java.lang.String str70 = compiler59.toSource(node69);
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker72 = null;
        compiler71.tracker = performanceTracker72;
        com.google.javascript.jscomp.ErrorManager errorManager74 = compiler71.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention75 = compiler71.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler76 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node77 = null;
        compiler76.externsRoot = node77;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker79 = compiler76.tracker;
        com.google.javascript.rhino.Node node81 = compiler76.parseTestCode("");
        java.lang.String str82 = compiler71.toSource(node81);
        compiler59.externsRoot = node81;
        compiler35.toSource(codeBuilder56, (int) (byte) 100, node81);
        compiler12.prepareAst(node81);
        java.lang.String str86 = compiler0.toSource(node81);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(strSupplier16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(passConfig26);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(intermediateState31);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(strSupplier39);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNotNull(errorManager48);
        org.junit.Assert.assertNotNull(passConfig49);
        org.junit.Assert.assertNotNull(intermediateState50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(intermediateState54);
        org.junit.Assert.assertNull(variableMap55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertNotNull(codingConvention63);
        org.junit.Assert.assertNull(performanceTracker67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(errorManager74);
        org.junit.Assert.assertNotNull(codingConvention75);
        org.junit.Assert.assertNull(performanceTracker79);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Region region24 = compiler0.getSourceRegion("[{SyntheticVarsDeclar}]", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = region24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertNull(region24);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler17.tracker = performanceTracker18;
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler17.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler17.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        java.lang.String str28 = compiler17.toSource(node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker30 = null;
        compiler29.tracker = performanceTracker30;
        com.google.javascript.jscomp.ErrorManager errorManager32 = compiler29.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention33 = compiler29.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker35 = compiler29.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder36 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str37 = codeBuilder36.toString();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker42 = compiler39.tracker;
        com.google.javascript.rhino.Node node44 = compiler39.parseTestCode("");
        compiler29.toSource(codeBuilder36, (int) (byte) 100, node44);
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker49 = compiler46.tracker;
        com.google.javascript.jscomp.PassConfig passConfig50 = compiler46.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker54 = compiler51.tracker;
        com.google.javascript.rhino.Node node56 = compiler51.parseTestCode("");
        compiler46.externAndJsRoot = node56;
        boolean boolean58 = compiler17.areNodesEqualForInlining(node44, node56);
        compiler0.externsRoot = node56;
        com.google.javascript.jscomp.Region region62 = compiler0.getSourceRegion("[[{SyntheticVarsDeclar}]]", (int) (short) 0);
        com.google.javascript.rhino.Node node63 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(errorManager32);
        org.junit.Assert.assertNotNull(codingConvention33);
        org.junit.Assert.assertNotNull(passConfig34);
        org.junit.Assert.assertNull(performanceTracker35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(performanceTracker42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(performanceTracker49);
        org.junit.Assert.assertNotNull(passConfig50);
        org.junit.Assert.assertNull(performanceTracker54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(region62);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        compiler0.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(defaultPassConfig6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.isIdeMode();
        java.lang.String str9 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node10 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.rhino.Node node19 = null;
        compiler0.externAndJsRoot = node19;
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        boolean boolean11 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNull(variableMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler0.getOptions();
        boolean boolean12 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(variableMap10);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry13);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[singleton]");
        compiler0.startPass("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.defaultCodingConvention;
        org.junit.Assert.assertNull(performanceTracker1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(compilerInputList9);
        org.junit.Assert.assertNotNull(codingConvention10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str22 = codeBuilder21.toString();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = null;
        compiler24.tracker = performanceTracker25;
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler24.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler24.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        java.lang.String str35 = compiler24.toSource(node34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = null;
        compiler36.tracker = performanceTracker37;
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler36.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler36.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker44 = compiler41.tracker;
        com.google.javascript.rhino.Node node46 = compiler41.parseTestCode("");
        java.lang.String str47 = compiler36.toSource(node46);
        compiler24.externsRoot = node46;
        compiler0.toSource(codeBuilder21, (int) (byte) 100, node46);
        boolean boolean50 = compiler0.hasErrors();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler0.getOptions();
        com.google.javascript.jscomp.JSError[] jSErrorArray53 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(performanceTracker44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNotNull(jSErrorArray53);
        org.junit.Assert.assertArrayEquals(jSErrorArray53, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler8.tracker;
        com.google.javascript.rhino.Node node12 = compiler8.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        compiler0.jsRoot = node12;
        boolean boolean14 = compiler0.acceptConstKeyword();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput16 = compiler0.newExternInput("[[hi![singleton]]hi![singleton]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler10.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler10.getOptions();
        compiler6.initOptions(compilerOptions16);
        compiler0.initOptions(compilerOptions16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler0.getVariableMap();
        boolean boolean21 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler0.options;
        boolean boolean23 = compiler0.hasHaltingErrors();
        compiler0.addToDebugLog("[hi![singleton]]hi![singleton]");
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker14 = compiler11.tracker;
        com.google.javascript.rhino.Node node16 = compiler11.parseTestCode("");
        java.lang.String str17 = compiler6.toSource(node16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler18.tracker = performanceTracker19;
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler18.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler18.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler18.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = compiler18.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder25 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str26 = codeBuilder25.toString();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = compiler28.tracker;
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("");
        compiler18.toSource(codeBuilder25, (int) (byte) 100, node33);
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker38 = compiler35.tracker;
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        com.google.javascript.rhino.Node node45 = compiler40.parseTestCode("");
        compiler35.externAndJsRoot = node45;
        boolean boolean47 = compiler6.areNodesEqualForInlining(node33, node45);
        java.lang.String str48 = compiler0.toSource(node45);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap49 = null;
        compiler0.setCssRenamingMap(cssRenamingMap49);
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNull(performanceTracker14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNull(performanceTracker24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(performanceTracker31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(performanceTracker38);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = null;
        compiler0.tracker = performanceTracker8;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        compiler0.addToDebugLog("[[hi![singleton]]hi![singleton]]");
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(variableMap10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker17 = null;
        compiler16.tracker = performanceTracker17;
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler16.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler16.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler16.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler16.getOptions();
        compiler12.initOptions(compilerOptions22);
        compiler0.options = compilerOptions22;
        boolean boolean25 = compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = compiler0.ensureLibraryInjected("[hi![singleton]]hi![singleton]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(passConfig20);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler6.tracker = performanceTracker7;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler6.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler6.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = compiler6.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str14 = codeBuilder13.toString();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        com.google.javascript.rhino.Node node21 = compiler16.parseTestCode("");
        compiler6.toSource(codeBuilder13, (int) (byte) 100, node21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler24.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.rhino.Node node34 = compiler29.parseTestCode("");
        compiler24.externAndJsRoot = node34;
        compiler0.toSource(codeBuilder13, 10, node34);
        com.google.javascript.jscomp.ErrorManager errorManager37 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node38 = compiler0.getRoot();
        boolean boolean39 = compiler0.hasRegExpGlobalReferences();
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNull(performanceTracker12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(errorManager37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator13 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(memoizedScopeCreator13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler8.tracker;
        com.google.javascript.rhino.Node node12 = compiler8.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        compiler0.jsRoot = node12;
        boolean boolean14 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator15 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(memoizedScopeCreator15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap8 = compiler0.getFunctionalInformationMap();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(defaultPassConfig6);
        org.junit.Assert.assertNotNull(jSTypeRegistry7);
        org.junit.Assert.assertNull(functionInformationMap8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        double double38 = compiler0.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = compiler0.getTypeRegistry();
        boolean boolean41 = compiler0.precheck();
        boolean boolean42 = compiler0.isIdeMode();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNotNull(jSTypeRegistry40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler23.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler23.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler23.getOptions();
        compiler19.initOptions(compilerOptions29);
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph38 = compiler0.getModuleGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNull(jSModuleGraph38);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        int int9 = compiler0.getErrorCount();
        compiler0.setProgress((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler4.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler4.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler14.tracker = performanceTracker15;
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler14.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler14.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler14.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler14.getOptions();
        compiler10.initOptions(compilerOptions20);
        compiler4.initOptions(compilerOptions20);
        compiler0.initOptions(compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler24.tracker;
        compiler24.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler24.getState();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler30.tracker = performanceTracker31;
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler30.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler30.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = compiler30.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder37 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str38 = codeBuilder37.toString();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker43 = compiler40.tracker;
        com.google.javascript.rhino.Node node45 = compiler40.parseTestCode("");
        compiler30.toSource(codeBuilder37, (int) (byte) 100, node45);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker51 = compiler48.tracker;
        com.google.javascript.jscomp.PassConfig passConfig52 = compiler48.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.externsRoot = node54;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker56 = compiler53.tracker;
        com.google.javascript.rhino.Node node58 = compiler53.parseTestCode("");
        compiler48.externAndJsRoot = node58;
        compiler24.toSource(codeBuilder37, 10, node58);
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.externsRoot = node62;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker64 = compiler61.tracker;
        compiler61.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.externsRoot = node67;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState69 = compiler66.getState();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker71 = null;
        compiler70.tracker = performanceTracker71;
        com.google.javascript.jscomp.ErrorManager errorManager73 = compiler70.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention74 = compiler70.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig75 = compiler70.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker76 = compiler70.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder77 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str78 = codeBuilder77.toString();
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node81 = null;
        compiler80.externsRoot = node81;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker83 = compiler80.tracker;
        com.google.javascript.rhino.Node node85 = compiler80.parseTestCode("");
        compiler70.toSource(codeBuilder77, (int) (byte) 100, node85);
        intermediateState69.externsRoot = node85;
        com.google.javascript.rhino.Node node88 = intermediateState69.externsRoot;
        compiler61.externAndJsRoot = node88;
        boolean boolean90 = compiler0.areNodesEqualForInlining(node58, node88);
        com.google.javascript.rhino.Node node91 = compiler0.getRoot();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator92 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.CodingConvention codingConvention93 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(intermediateState7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNull(performanceTracker27);
        org.junit.Assert.assertNotNull(intermediateState29);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(codingConvention34);
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertNull(performanceTracker36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(performanceTracker43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(performanceTracker51);
        org.junit.Assert.assertNotNull(passConfig52);
        org.junit.Assert.assertNull(performanceTracker56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(performanceTracker64);
        org.junit.Assert.assertNotNull(intermediateState69);
        org.junit.Assert.assertNotNull(errorManager73);
        org.junit.Assert.assertNotNull(codingConvention74);
        org.junit.Assert.assertNotNull(passConfig75);
        org.junit.Assert.assertNull(performanceTracker76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(performanceTracker83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertNull(memoizedScopeCreator92);
        org.junit.Assert.assertNotNull(codingConvention93);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker8 = compiler5.tracker;
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("");
        java.lang.String str11 = compiler0.toSource(node10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler12.tracker = performanceTracker13;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler12.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler12.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str20 = codeBuilder19.toString();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker25 = compiler22.tracker;
        com.google.javascript.rhino.Node node27 = compiler22.parseTestCode("");
        compiler12.toSource(codeBuilder19, (int) (byte) 100, node27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler29.tracker;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler29.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler34.tracker;
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("");
        compiler29.externAndJsRoot = node39;
        boolean boolean41 = compiler0.areNodesEqualForInlining(node27, node39);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter42 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler44.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange47);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.Node node50 = compiler0.externsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap51 = compiler0.getFunctionalInformationMap();
        boolean boolean52 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(performanceTracker8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(performanceTracker25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter42);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertNotNull(jSTypeRegistry49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(functionInformationMap51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler6.getState();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler10.tracker = performanceTracker11;
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler10.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler10.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str18 = codeBuilder17.toString();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler20.tracker;
        com.google.javascript.rhino.Node node25 = compiler20.parseTestCode("");
        compiler10.toSource(codeBuilder17, (int) (byte) 100, node25);
        intermediateState9.externsRoot = node25;
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap29 = compiler0.getCssRenamingMap();
        compiler0.addToDebugLog("");
        org.junit.Assert.assertNull(performanceTracker3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(performanceTracker16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(performanceTracker23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(cssRenamingMap29);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler4.tracker = performanceTracker5;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler4.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler4.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions10);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator13 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getMessages();
        compiler0.setProgress((double) ' ');
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap17 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler0.getVariableMap();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(memoizedScopeCreator13);
        org.junit.Assert.assertNotNull(jSErrorArray14);
        org.junit.Assert.assertArrayEquals(jSErrorArray14, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(globalVarReferenceMap17);
        org.junit.Assert.assertNull(variableMap18);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler11.getState();
        boolean boolean15 = compiler11.precheck();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler16.tracker;
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState21 = compiler16.getState();
        compiler11.setState(intermediateState21);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker24 = null;
        compiler23.tracker = performanceTracker24;
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler23.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention27 = compiler23.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = compiler28.tracker;
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("");
        java.lang.String str34 = compiler23.toSource(node33);
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker36 = null;
        compiler35.tracker = performanceTracker36;
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler35.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention39 = compiler35.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig40 = compiler35.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker41 = compiler35.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder42 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str43 = codeBuilder42.toString();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = compiler45.tracker;
        com.google.javascript.rhino.Node node50 = compiler45.parseTestCode("");
        compiler35.toSource(codeBuilder42, (int) (byte) 100, node50);
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker55 = compiler52.tracker;
        com.google.javascript.jscomp.PassConfig passConfig56 = compiler52.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node58 = null;
        compiler57.externsRoot = node58;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker60 = compiler57.tracker;
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("");
        compiler52.externAndJsRoot = node62;
        boolean boolean64 = compiler23.areNodesEqualForInlining(node50, node62);
        intermediateState21.externsRoot = node62;
        compiler0.externAndJsRoot = node62;
        com.google.javascript.jscomp.CodingConvention codingConvention67 = compiler0.getCodingConvention();
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(performanceTracker19);
        org.junit.Assert.assertNotNull(intermediateState21);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(codingConvention27);
        org.junit.Assert.assertNull(performanceTracker31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(errorManager38);
        org.junit.Assert.assertNotNull(codingConvention39);
        org.junit.Assert.assertNotNull(passConfig40);
        org.junit.Assert.assertNull(performanceTracker41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(performanceTracker48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(performanceTracker55);
        org.junit.Assert.assertNotNull(passConfig56);
        org.junit.Assert.assertNull(performanceTracker60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(codingConvention67);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str8 = codeBuilder7.toString();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = compiler10.tracker;
        com.google.javascript.rhino.Node node15 = compiler10.parseTestCode("");
        compiler0.toSource(codeBuilder7, (int) (byte) 100, node15);
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getMessages();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler23.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier27 = compiler23.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Scope scope28 = compiler23.getTopScope();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler29.recentChange;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler33.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler33.getPassConfig();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler33.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler33.getOptions();
        compiler29.initOptions(compilerOptions39);
        compiler23.initOptions(compilerOptions39);
        compiler19.initOptions(compilerOptions39);
        compiler0.initOptions(compilerOptions39);
        java.lang.String str44 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = compiler45.tracker;
        com.google.javascript.rhino.Node node50 = compiler45.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState54 = compiler51.getState();
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker56 = null;
        compiler55.tracker = performanceTracker56;
        com.google.javascript.jscomp.ErrorManager errorManager58 = compiler55.getErrorManager();
        com.google.javascript.jscomp.CodingConvention codingConvention59 = compiler55.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler55.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker61 = compiler55.tracker;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder62 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str63 = codeBuilder62.toString();
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node66 = null;
        compiler65.externsRoot = node66;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker68 = compiler65.tracker;
        com.google.javascript.rhino.Node node70 = compiler65.parseTestCode("");
        compiler55.toSource(codeBuilder62, (int) (byte) 100, node70);
        intermediateState54.externsRoot = node70;
        compiler45.setState(intermediateState54);
        com.google.javascript.rhino.Node node75 = compiler45.parseTestCode("[]");
        java.lang.String str76 = compiler0.toSource(node75);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(performanceTracker13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNotNull(strSupplier27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(performanceTracker48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(intermediateState54);
        org.junit.Assert.assertNotNull(errorManager58);
        org.junit.Assert.assertNotNull(codingConvention59);
        org.junit.Assert.assertNotNull(passConfig60);
        org.junit.Assert.assertNull(performanceTracker61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(performanceTracker68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
    }
}

