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
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator8 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(memoizedScopeCreator8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        java.lang.String str17 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = compiler18.jsRoot;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler20.recentChange;
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.rhino.Node node27 = compiler18.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config28 = compiler18.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        compiler29.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        com.google.javascript.rhino.Node node38 = compiler29.parseSyntheticCode("hi!", "hi!");
        compiler18.jsRoot = node38;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler40.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention44 = null;
        compiler40.defaultCodingConvention = codingConvention44;
        com.google.javascript.jscomp.PassConfig passConfig46 = compiler40.getPassConfig();
        compiler18.setPassConfig(passConfig46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.rhino.Node node54 = compiler51.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter55 = compiler51.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node57 = compiler51.parseTestCode("");
        compiler48.externAndJsRoot = node57;
        java.lang.String str59 = compiler18.toSource(node57);
        compiler9.externsRoot = node57;
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler9.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention61;
        com.google.javascript.jscomp.PassConfig passConfig63 = compiler0.createPassConfigInternal();
        boolean boolean64 = compiler0.hasHaltingErrors();
        boolean boolean65 = compiler0.isInliningForbidden();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(passConfig46);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorReporter55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNotNull(passConfig63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.externsRoot = node4;
        com.google.javascript.rhino.Node node6 = compiler3.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter7 = compiler3.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node9 = compiler3.parseTestCode("");
        compiler0.externAndJsRoot = node9;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        com.google.javascript.jscomp.parsing.Config config14 = compiler0.getParserConfig();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = compiler0.parseInputs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(result13);
        org.junit.Assert.assertNotNull(config14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = compiler6.jsRoot;
        com.google.javascript.rhino.Node node8 = null;
        compiler6.jsRoot = node8;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler10.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = compiler12.jsRoot;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler14.recentChange;
        compiler12.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        com.google.javascript.rhino.Node node21 = compiler12.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config22 = compiler12.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = compiler23.jsRoot;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = null;
        compiler25.externsRoot = node26;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange28 = compiler25.recentChange;
        compiler23.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange28);
        com.google.javascript.rhino.Node node32 = compiler23.parseSyntheticCode("hi!", "hi!");
        compiler12.jsRoot = node32;
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange37 = compiler34.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention38 = null;
        compiler34.defaultCodingConvention = codingConvention38;
        com.google.javascript.jscomp.PassConfig passConfig40 = compiler34.getPassConfig();
        compiler12.setPassConfig(passConfig40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.rhino.Node node48 = compiler45.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter49 = compiler45.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node51 = compiler45.parseTestCode("");
        compiler42.externAndJsRoot = node51;
        java.lang.String str53 = compiler12.toSource(node51);
        compiler10.jsRoot = node51;
        compiler6.jsRoot = node51;
        compiler0.jsRoot = node51;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig57 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.rhino.Node node61 = compiler58.getRoot();
        boolean boolean62 = compiler58.hasRegExpGlobalReferences();
        compiler58.addToDebugLog("");
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node66 = null;
        compiler65.externsRoot = node66;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange68 = compiler65.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention69 = null;
        compiler65.defaultCodingConvention = codingConvention69;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker71 = null;
        compiler65.tracker = performanceTracker71;
        compiler65.addToDebugLog("");
        com.google.javascript.jscomp.ErrorManager errorManager75 = compiler65.getErrorManager();
        compiler58.setErrorManager(errorManager75);
        com.google.javascript.jscomp.Compiler compiler77 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node78 = null;
        compiler77.externsRoot = node78;
        com.google.javascript.jscomp.PassConfig passConfig80 = compiler77.createPassConfigInternal();
        com.google.javascript.rhino.Node node82 = compiler77.parseTestCode("");
        compiler58.externsRoot = node82;
        java.lang.String str84 = compiler0.toSource(node82);
        com.google.common.base.Supplier<java.lang.String> strSupplier85 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(config22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(recentChange28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(recentChange37);
        org.junit.Assert.assertNotNull(passConfig40);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(errorReporter49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(defaultPassConfig57);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(recentChange68);
        org.junit.Assert.assertNotNull(errorManager75);
        org.junit.Assert.assertNotNull(passConfig80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(strSupplier85);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        com.google.javascript.rhino.Node node11 = compiler0.externAndJsRoot;
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler0.getErrorManager();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        java.lang.String str17 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = compiler18.jsRoot;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler20.recentChange;
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.rhino.Node node27 = compiler18.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config28 = compiler18.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        compiler29.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        com.google.javascript.rhino.Node node38 = compiler29.parseSyntheticCode("hi!", "hi!");
        compiler18.jsRoot = node38;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler40.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention44 = null;
        compiler40.defaultCodingConvention = codingConvention44;
        com.google.javascript.jscomp.PassConfig passConfig46 = compiler40.getPassConfig();
        compiler18.setPassConfig(passConfig46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.rhino.Node node54 = compiler51.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter55 = compiler51.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node57 = compiler51.parseTestCode("");
        compiler48.externAndJsRoot = node57;
        java.lang.String str59 = compiler18.toSource(node57);
        compiler9.externsRoot = node57;
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler9.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention61;
        com.google.javascript.rhino.Node node64 = compiler0.parseSyntheticCode("hi!");
        com.google.javascript.jscomp.PassConfig passConfig65 = compiler0.createPassConfigInternal();
        boolean boolean66 = compiler0.acceptConstKeyword();
        java.lang.String str67 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention68 = compiler0.getCodingConvention();
        java.lang.Exception exception70 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", exception70);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?digraph AST {?  node [color=lightblue2, style=filled];?  node0 [label=\"BLOCK\"];?  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];?}?");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(passConfig46);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorReporter55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(passConfig65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(codingConvention68);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer10 = compiler0.newTracer("hi!");
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node19 = compiler13.parseTestCode("");
        com.google.javascript.rhino.Node node20 = compiler13.getRoot();
        boolean boolean21 = compiler13.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler13.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSSourceFileArray23);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList27 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, jSSourceFileArray26);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.rhino.Node node31 = null;
        compiler29.jsRoot = node31;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter33 = compiler29.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler29.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.externsRoot = node38;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler37.recentChange;
        compiler35.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        java.lang.String str42 = compiler35.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler35.recentChange;
        compiler29.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler29.getOptions();
        com.google.javascript.jscomp.Result result46 = compiler13.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, compilerOptions45);
        com.google.javascript.jscomp.Result result47 = compiler0.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions45);
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Region region51 = compiler0.getSourceRegion("hi!hi!", (int) (byte) 1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tracer10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray23, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(recentChange40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNotNull(result46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNull(variableMap48);
        org.junit.Assert.assertNull(region51);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        boolean boolean17 = compiler9.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode18 = compiler9.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList20 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList20, jSSourceFileArray19);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList23 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, jSSourceFileArray22);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = compiler25.jsRoot;
        com.google.javascript.rhino.Node node27 = null;
        compiler25.jsRoot = node27;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter29 = compiler25.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler25.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        compiler31.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler33.recentChange;
        compiler31.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        java.lang.String str38 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler31.recentChange;
        compiler25.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = compiler25.getOptions();
        com.google.javascript.jscomp.Result result42 = compiler9.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList20, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, compilerOptions41);
        com.google.javascript.rhino.Node node43 = compiler9.getRoot();
        com.google.javascript.rhino.Node node45 = compiler9.parseTestCode("");
        boolean boolean46 = compiler9.isInliningForbidden();
        com.google.javascript.jscomp.Tracer tracer48 = compiler9.newTracer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler8.stopTracer(tracer48, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + languageMode18 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode18.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray19, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertNotNull(recentChange36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertNotNull(compilerOptions41);
        org.junit.Assert.assertNotNull(result42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tracer48);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node2 = compiler0.getRoot();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNotNull(passConfig6);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = compiler16.jsRoot;
        com.google.javascript.rhino.Node node18 = null;
        compiler16.jsRoot = node18;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter20 = compiler16.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler16.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange27 = compiler24.recentChange;
        compiler22.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange27);
        java.lang.String str29 = compiler22.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange30 = compiler22.recentChange;
        compiler16.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler16.getOptions();
        com.google.javascript.jscomp.Result result33 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, compilerOptions32);
        com.google.javascript.rhino.Node node34 = compiler0.getRoot();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler0.options;
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter36 = compiler0.getReverseAbstractInterpreter();
        compiler0.normalize();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray10, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(recentChange27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(recentChange30);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(result33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(compilerOptions35);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter36);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler8.options;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler8.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertNull(compilerOptions12);
        org.junit.Assert.assertNotNull(recentChange13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer10 = compiler0.newTracer("hi!");
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node19 = compiler13.parseTestCode("");
        com.google.javascript.rhino.Node node20 = compiler13.getRoot();
        boolean boolean21 = compiler13.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler13.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSSourceFileArray23);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList27 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, jSSourceFileArray26);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.rhino.Node node31 = null;
        compiler29.jsRoot = node31;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter33 = compiler29.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler29.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.externsRoot = node38;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler37.recentChange;
        compiler35.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        java.lang.String str42 = compiler35.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler35.recentChange;
        compiler29.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler29.getOptions();
        com.google.javascript.jscomp.Result result46 = compiler13.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, compilerOptions45);
        com.google.javascript.jscomp.Result result47 = compiler0.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions45);
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap49 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.PassConfig passConfig50 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tracer10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray23, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(recentChange40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNotNull(result46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNull(variableMap48);
        org.junit.Assert.assertNull(referenceMap49);
        org.junit.Assert.assertNotNull(passConfig50);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = compiler10.jsRoot;
        com.google.javascript.rhino.Node node12 = null;
        compiler10.jsRoot = node12;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler18.recentChange;
        compiler16.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange21);
        java.lang.String str23 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler16.recentChange;
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler0.options;
        boolean boolean28 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode30 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.rhino.Node node34 = compiler31.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter35 = compiler31.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node37 = compiler31.parseTestCode("");
        com.google.javascript.rhino.Node node38 = compiler31.getRoot();
        java.lang.String str39 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = compiler40.jsRoot;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler42.recentChange;
        compiler40.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        com.google.javascript.rhino.Node node49 = compiler40.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config50 = compiler40.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = compiler51.jsRoot;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.externsRoot = node54;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange56 = compiler53.recentChange;
        compiler51.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange56);
        com.google.javascript.rhino.Node node60 = compiler51.parseSyntheticCode("hi!", "hi!");
        compiler40.jsRoot = node60;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node63 = null;
        compiler62.externsRoot = node63;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange65 = compiler62.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention66 = null;
        compiler62.defaultCodingConvention = codingConvention66;
        com.google.javascript.jscomp.PassConfig passConfig68 = compiler62.getPassConfig();
        compiler40.setPassConfig(passConfig68);
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node71 = null;
        compiler70.externsRoot = node71;
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node74 = null;
        compiler73.externsRoot = node74;
        com.google.javascript.rhino.Node node76 = compiler73.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter77 = compiler73.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node79 = compiler73.parseTestCode("");
        compiler70.externAndJsRoot = node79;
        java.lang.String str81 = compiler40.toSource(node79);
        compiler31.externsRoot = node79;
        com.google.javascript.jscomp.CodingConvention codingConvention83 = compiler31.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention83;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertTrue("'" + languageMode30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode30.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(recentChange45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(config50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(recentChange56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(recentChange65);
        org.junit.Assert.assertNotNull(passConfig68);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(errorReporter77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(codingConvention83);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.rhino.Node node36 = compiler33.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter37 = compiler33.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node39 = compiler33.parseTestCode("");
        compiler30.externAndJsRoot = node39;
        java.lang.String str41 = compiler0.toSource(node39);
        com.google.javascript.rhino.Node node42 = compiler0.jsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap43 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node45 = compiler0.parseTestCode("hi!");
        boolean boolean46 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter47 = compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(sourceMap43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter47);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter8 = compiler0.getDefaultErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler0.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(errorReporter8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = compiler0.getGlobalVarReferences();
        compiler0.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.rhino.Node node10 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node18 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler11.getState();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.rhino.Node node23 = compiler20.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter24 = compiler20.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node26 = compiler20.parseTestCode("");
        com.google.javascript.rhino.Node node27 = compiler20.getRoot();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = compiler28.jsRoot;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler30.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        com.google.javascript.rhino.Node node37 = compiler28.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder38 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder40 = codeBuilder38.append("hi!");
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.rhino.Node node48 = compiler45.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter49 = compiler45.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node51 = compiler45.parseTestCode("");
        compiler42.externAndJsRoot = node51;
        compiler28.toSource(codeBuilder40, (int) (byte) 1, node51);
        compiler20.externAndJsRoot = node51;
        intermediateState19.externsRoot = node51;
        compiler0.setState(intermediateState19);
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(referenceMap6);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(intermediateState19);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(codeBuilder40);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(errorReporter49);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        compiler0.externAndJsRoot = node15;
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Tracer tracer19 = compiler0.newTracer("hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(variableMap17);
        org.junit.Assert.assertNotNull(tracer19);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(errorManager10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler11.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer10 = compiler0.newTracer("hi!");
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node19 = compiler13.parseTestCode("");
        com.google.javascript.rhino.Node node20 = compiler13.getRoot();
        boolean boolean21 = compiler13.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler13.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSSourceFileArray23);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList27 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, jSSourceFileArray26);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.rhino.Node node31 = null;
        compiler29.jsRoot = node31;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter33 = compiler29.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler29.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.externsRoot = node38;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler37.recentChange;
        compiler35.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        java.lang.String str42 = compiler35.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler35.recentChange;
        compiler29.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler29.getOptions();
        com.google.javascript.jscomp.Result result46 = compiler13.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, compilerOptions45);
        com.google.javascript.jscomp.Result result47 = compiler0.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions45);
        com.google.javascript.rhino.Node node49 = compiler0.parseSyntheticCode("");
        com.google.javascript.jscomp.TypeValidator typeValidator50 = compiler0.getTypeValidator();
        java.lang.String str53 = compiler0.getSourceLine("", (int) (short) 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tracer10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray23, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(recentChange40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNotNull(result46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(typeValidator50);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        boolean boolean3 = compiler0.hasRegExpGlobalReferences();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.rhino.Node node9 = compiler6.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter10 = compiler6.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node12 = compiler6.parseTestCode("");
        compiler0.jsRoot = node12;
        com.google.javascript.rhino.Node node14 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node15 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node16 = compiler0.externsRoot;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(variableMap4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(errorReporter10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer10 = compiler0.newTracer("hi!");
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node19 = compiler13.parseTestCode("");
        com.google.javascript.rhino.Node node20 = compiler13.getRoot();
        boolean boolean21 = compiler13.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler13.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, jSSourceFileArray23);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList27 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, jSSourceFileArray26);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.rhino.Node node31 = null;
        compiler29.jsRoot = node31;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter33 = compiler29.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler29.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.externsRoot = node38;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler37.recentChange;
        compiler35.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        java.lang.String str42 = compiler35.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler35.recentChange;
        compiler29.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler29.getOptions();
        com.google.javascript.jscomp.Result result46 = compiler13.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList24, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList27, compilerOptions45);
        com.google.javascript.jscomp.Result result47 = compiler0.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions45);
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler0.getPropertyMap();
        int int49 = compiler0.getErrorCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tracer10);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray23, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(recentChange40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNotNull(result46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNull(variableMap48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node12 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler0.buildKnownSymbolTable();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.rhino.Node node16 = compiler0.getRoot();
        boolean boolean17 = compiler0.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNotNull(defaultPassConfig10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(symbolTable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.rhino.Node node9 = compiler6.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter10 = compiler6.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node12 = compiler6.parseTestCode("");
        com.google.javascript.rhino.Node node13 = compiler6.getRoot();
        boolean boolean14 = compiler6.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer16 = compiler6.newTracer("hi!");
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray18 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.rhino.Node node22 = compiler19.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter23 = compiler19.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node25 = compiler19.parseTestCode("");
        com.google.javascript.rhino.Node node26 = compiler19.getRoot();
        boolean boolean27 = compiler19.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode28 = compiler19.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray29 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList30 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList30, jSSourceFileArray29);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList33 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList33, jSSourceFileArray32);
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = compiler35.jsRoot;
        com.google.javascript.rhino.Node node37 = null;
        compiler35.jsRoot = node37;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter39 = compiler35.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler35.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        compiler41.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange46 = compiler43.recentChange;
        compiler41.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange46);
        java.lang.String str48 = compiler41.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler41.recentChange;
        compiler35.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler35.getOptions();
        com.google.javascript.jscomp.Result result52 = compiler19.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList30, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList33, compilerOptions51);
        com.google.javascript.jscomp.Result result53 = compiler6.compile(jSSourceFileArray17, jSModuleArray18, compilerOptions51);
        com.google.javascript.rhino.Node node55 = compiler6.parseSyntheticCode("");
        compiler0.externAndJsRoot = node55;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray57 = compiler0.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNull(referenceMap5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(errorReporter10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tracer16);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray17, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray18);
        org.junit.Assert.assertArrayEquals(jSModuleArray18, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + languageMode28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode28.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray29);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray29, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray32, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(errorReporter39);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(recentChange46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(result52);
        org.junit.Assert.assertNotNull(result53);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        com.google.javascript.rhino.Node node11 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = compiler0.toSource(jSModule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.PassConfig passConfig33 = compiler30.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler30.options;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler30.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.TypeValidator typeValidator37 = compiler0.getTypeValidator();
        boolean boolean38 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap39 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CompilerPass compilerPass40 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.process(compilerPass40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNotNull(passConfig33);
        org.junit.Assert.assertNull(compilerOptions34);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNotNull(typeValidator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(referenceMap39);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler0.createPassConfigInternal();
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(variableMap4);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.rhino.Node node8 = compiler0.jsRoot;
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention17 = null;
        compiler13.defaultCodingConvention = codingConvention17;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = null;
        compiler13.tracker = performanceTracker19;
        compiler13.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler13.getErrorManager();
        compiler0.setErrorManager(errorManager22);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.rhino.Node node27 = compiler24.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter28 = compiler24.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node30 = compiler24.parseTestCode("");
        com.google.javascript.rhino.Node node31 = compiler24.getRoot();
        boolean boolean32 = compiler24.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode33 = compiler24.languageMode();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = compiler34.jsRoot;
        com.google.javascript.rhino.Node node36 = null;
        compiler34.jsRoot = node36;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter38 = compiler34.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler34.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        compiler40.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler42.recentChange;
        compiler40.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        java.lang.String str47 = compiler40.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange48 = compiler40.recentChange;
        compiler34.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange48);
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange48);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange48);
        com.google.javascript.jscomp.VariableMap variableMap52 = compiler0.getVariableMap();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(symbolTable9);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(errorReporter28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + languageMode33 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode33.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(errorReporter38);
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(recentChange45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(recentChange48);
        org.junit.Assert.assertNull(variableMap52);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        boolean boolean7 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.getOptions();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups9 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.rhino.Node node13 = compiler10.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler10.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node16 = compiler10.parseTestCode("");
        com.google.javascript.rhino.Node node17 = compiler10.getRoot();
        boolean boolean18 = compiler10.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode19 = compiler10.languageMode();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = compiler20.jsRoot;
        com.google.javascript.rhino.Node node22 = null;
        compiler20.jsRoot = node22;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter24 = compiler20.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler20.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        compiler26.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange31 = compiler28.recentChange;
        compiler26.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange31);
        java.lang.String str33 = compiler26.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler26.recentChange;
        compiler20.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler10.options;
        compiler0.options = compilerOptions37;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        compiler39.setHasRegExpGlobalReferences(true);
        java.lang.String str44 = compiler39.getAstDotGraph();
        com.google.javascript.rhino.Node node45 = compiler39.externAndJsRoot;
        compiler39.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler39.getState();
        com.google.javascript.rhino.Node node48 = intermediateState47.externsRoot;
        com.google.javascript.rhino.Node node49 = intermediateState47.externsRoot;
        compiler0.setState(intermediateState47);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(diagnosticGroups9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + languageMode19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode19.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertNotNull(recentChange31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(compilerOptions37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.rhino.Node node5 = compiler0.jsRoot;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.rhino.Node node8 = compiler0.jsRoot;
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler0.tracker = performanceTracker13;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter15 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node16 = compiler0.externAndJsRoot;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = compiler0.parseSyntheticCode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(symbolTable9);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        java.lang.String str17 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = compiler18.jsRoot;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler20.recentChange;
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.rhino.Node node27 = compiler18.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config28 = compiler18.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        compiler29.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        com.google.javascript.rhino.Node node38 = compiler29.parseSyntheticCode("hi!", "hi!");
        compiler18.jsRoot = node38;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler40.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention44 = null;
        compiler40.defaultCodingConvention = codingConvention44;
        com.google.javascript.jscomp.PassConfig passConfig46 = compiler40.getPassConfig();
        compiler18.setPassConfig(passConfig46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.rhino.Node node54 = compiler51.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter55 = compiler51.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node57 = compiler51.parseTestCode("");
        compiler48.externAndJsRoot = node57;
        java.lang.String str59 = compiler18.toSource(node57);
        compiler9.externsRoot = node57;
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler9.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention61;
        com.google.javascript.rhino.Node node64 = compiler0.parseSyntheticCode("hi!");
        com.google.javascript.jscomp.SourceMap sourceMap65 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker66 = compiler0.tracker;
        com.google.javascript.jscomp.Region region69 = compiler0.getSourceRegion("hi!hi!", (int) (short) 10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(passConfig46);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorReporter55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(sourceMap65);
        org.junit.Assert.assertNull(performanceTracker66);
        org.junit.Assert.assertNull(region69);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler0.parseInputs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler0.parseInputs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler8.getExternsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node7 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.rhino.Node node9 = intermediateState8.externsRoot;
        com.google.javascript.rhino.Node node10 = intermediateState8.externsRoot;
        com.google.javascript.rhino.Node node11 = intermediateState8.externsRoot;
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.rhino.Node node36 = compiler33.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter37 = compiler33.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node39 = compiler33.parseTestCode("");
        compiler30.externAndJsRoot = node39;
        java.lang.String str41 = compiler0.toSource(node39);
        com.google.javascript.rhino.Node node42 = compiler0.jsRoot;
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph43 = compiler0.computeCFG();
        boolean boolean44 = compiler0.acceptConstKeyword();
        compiler0.startPass("");
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode47 = compiler0.languageMode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = compiler0.parseInputs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeControlFlowGraph43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + languageMode47 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode47.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node7 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler0.hasErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(compilerOptions8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph30 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = null;
        compiler0.tracker = performanceTracker31;
        boolean boolean33 = compiler0.isIdeMode();
        compiler0.recordFunctionInformation();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler0.getPropertyMap();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(jSModuleGraph30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertNull(variableMap36);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getInputsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node12 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler0.buildKnownSymbolTable();
        boolean boolean15 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler0.getOptions();
        boolean boolean17 = compiler0.hasRegExpGlobalReferences();
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNotNull(defaultPassConfig10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(symbolTable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        java.lang.String str3 = codeBuilder0.toString();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = codeBuilder0.append("");
        java.lang.String str6 = codeBuilder0.toString();
        boolean boolean8 = codeBuilder0.endsWith("hi!");
        int int9 = codeBuilder0.getLineIndex();
        codeBuilder0.reset();
        codeBuilder0.reset();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(codeBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph30 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = compiler33.jsRoot;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange38 = compiler35.recentChange;
        compiler33.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange38);
        com.google.javascript.rhino.Node node42 = compiler33.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config43 = compiler33.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = compiler44.jsRoot;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler46.recentChange;
        compiler44.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange49);
        com.google.javascript.rhino.Node node53 = compiler44.parseSyntheticCode("hi!", "hi!");
        compiler33.jsRoot = node53;
        compiler0.externsRoot = node53;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(jSModuleGraph30);
        org.junit.Assert.assertNull(variableMap31);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(recentChange38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        int int3 = codeBuilder0.getColumnIndex();
        boolean boolean5 = codeBuilder0.endsWith("");
        codeBuilder0.reset();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.rhino.Node node14 = compiler11.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter15 = compiler11.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node17 = compiler11.parseTestCode("");
        compiler8.externAndJsRoot = node17;
        compiler7.externAndJsRoot = node17;
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler7.getErrors();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups21 = compiler7.getDiagnosticGroups();
        com.google.javascript.rhino.Node node23 = compiler7.parseTestCode("hi!");
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = null;
        compiler25.externsRoot = node26;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange28 = compiler25.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention29 = null;
        compiler25.defaultCodingConvention = codingConvention29;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups31 = compiler25.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        compiler32.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.externsRoot = node35;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange37 = compiler34.recentChange;
        compiler32.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange37);
        com.google.javascript.rhino.Node node39 = compiler32.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState40 = compiler32.getState();
        compiler25.setState(intermediateState40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler44.recentChange;
        compiler42.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange47);
        java.lang.String str49 = compiler42.getAstDotGraph();
        com.google.javascript.jscomp.PassConfig passConfig50 = compiler42.getPassConfig();
        boolean boolean51 = compiler42.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange55 = compiler52.recentChange;
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.externsRoot = node57;
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = null;
        compiler59.externsRoot = node60;
        com.google.javascript.rhino.Node node62 = compiler59.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter63 = compiler59.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node65 = compiler59.parseTestCode("");
        compiler56.externAndJsRoot = node65;
        compiler52.jsRoot = node65;
        compiler42.jsRoot = node65;
        intermediateState40.externsRoot = node65;
        compiler7.externsRoot = node65;
        com.google.javascript.jscomp.Result result71 = compiler7.getResult();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(diagnosticGroups21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(recentChange28);
        org.junit.Assert.assertNotNull(diagnosticGroups31);
        org.junit.Assert.assertNotNull(recentChange37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(intermediateState40);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(passConfig50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(recentChange55);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(errorReporter63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(result71);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.PassConfig passConfig7 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(compilerInputList4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(defaultPassConfig6);
        org.junit.Assert.assertNotNull(passConfig7);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.rhino.Node node26 = compiler23.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter27 = compiler23.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node29 = compiler23.parseTestCode("");
        com.google.javascript.rhino.Node node30 = compiler23.getRoot();
        boolean boolean31 = compiler23.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer33 = compiler23.newTracer("hi!");
        compiler0.stopTracer(tracer33, "");
        com.google.javascript.rhino.Node node36 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(codingConvention22);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(errorReporter27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tracer33);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        java.lang.String str13 = compiler0.getAstDotGraph();
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = null;
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.externsRoot = node16;
        com.google.javascript.rhino.Node node18 = compiler15.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter19 = compiler15.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node21 = compiler15.parseTestCode("");
        com.google.javascript.rhino.Node node22 = compiler15.getRoot();
        boolean boolean23 = compiler15.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode24 = compiler15.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList26 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, jSSourceFileArray25);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList29 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList29, jSSourceFileArray28);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = compiler31.jsRoot;
        com.google.javascript.rhino.Node node33 = null;
        compiler31.jsRoot = node33;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter35 = compiler31.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler31.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        compiler37.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler39.recentChange;
        compiler37.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange42);
        java.lang.String str44 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler37.recentChange;
        compiler31.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler31.getOptions();
        com.google.javascript.jscomp.Result result48 = compiler15.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList29, compilerOptions47);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node50 = null;
        compiler49.externsRoot = node50;
        com.google.javascript.rhino.Node node52 = compiler49.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter53 = compiler49.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node55 = compiler49.parseTestCode("");
        com.google.javascript.rhino.Node node56 = compiler49.getRoot();
        boolean boolean57 = compiler49.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode58 = compiler49.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray59 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList60 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList60, jSSourceFileArray59);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray62 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList63 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList63, jSSourceFileArray62);
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node66 = compiler65.jsRoot;
        com.google.javascript.rhino.Node node67 = null;
        compiler65.jsRoot = node67;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter69 = compiler65.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager70 = compiler65.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        compiler71.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node74 = null;
        compiler73.externsRoot = node74;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange76 = compiler73.recentChange;
        compiler71.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        java.lang.String str78 = compiler71.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange79 = compiler71.recentChange;
        compiler65.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange79);
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = compiler65.getOptions();
        com.google.javascript.jscomp.Result result82 = compiler49.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList60, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList63, compilerOptions81);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result83 = compiler0.compile(jSSourceFileList14, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList29, compilerOptions81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(errorReporter19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + languageMode24 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode24.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray25, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray28, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(recentChange42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(recentChange45);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(result48);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(errorReporter53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + languageMode58 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode58.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray59);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray59, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray62);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray62, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(errorReporter69);
        org.junit.Assert.assertNotNull(errorManager70);
        org.junit.Assert.assertNotNull(recentChange76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(recentChange79);
        org.junit.Assert.assertNotNull(compilerOptions81);
        org.junit.Assert.assertNotNull(result82);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        java.lang.String str13 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler6.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.rhino.Node node19 = compiler16.getRoot();
        boolean boolean20 = compiler16.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node21 = compiler16.getRoot();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.rhino.Node node25 = compiler22.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter26 = compiler22.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node28 = compiler22.parseTestCode("");
        com.google.javascript.rhino.Node node29 = compiler22.getRoot();
        java.lang.String str30 = compiler22.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = compiler31.jsRoot;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler33.recentChange;
        compiler31.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        com.google.javascript.rhino.Node node40 = compiler31.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config41 = compiler31.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = compiler42.jsRoot;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler44.recentChange;
        compiler42.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange47);
        com.google.javascript.rhino.Node node51 = compiler42.parseSyntheticCode("hi!", "hi!");
        compiler31.jsRoot = node51;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.externsRoot = node54;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange56 = compiler53.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention57 = null;
        compiler53.defaultCodingConvention = codingConvention57;
        com.google.javascript.jscomp.PassConfig passConfig59 = compiler53.getPassConfig();
        compiler31.setPassConfig(passConfig59);
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.externsRoot = node62;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.rhino.Node node67 = compiler64.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter68 = compiler64.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node70 = compiler64.parseTestCode("");
        compiler61.externAndJsRoot = node70;
        java.lang.String str72 = compiler31.toSource(node70);
        compiler22.externsRoot = node70;
        com.google.javascript.jscomp.CodingConvention codingConvention74 = compiler22.defaultCodingConvention;
        compiler16.defaultCodingConvention = codingConvention74;
        compiler0.defaultCodingConvention = codingConvention74;
        com.google.javascript.jscomp.ErrorManager errorManager77 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups78 = compiler0.getDiagnosticGroups();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeExternInput("hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(errorReporter26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(recentChange36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(config41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(recentChange56);
        org.junit.Assert.assertNotNull(passConfig59);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(errorReporter68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(codingConvention74);
        org.junit.Assert.assertNotNull(errorManager77);
        org.junit.Assert.assertNotNull(diagnosticGroups78);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder12 = codeBuilder10.append("hi!");
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.externsRoot = node18;
        com.google.javascript.rhino.Node node20 = compiler17.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter21 = compiler17.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node23 = compiler17.parseTestCode("");
        compiler14.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder12, (int) (byte) 1, node23);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator26 = compiler0.getTypedScopeCreator();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups28 = compiler0.getDiagnosticGroups();
        int int29 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.rhino.Node node33 = compiler30.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter34 = compiler30.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node36 = compiler30.parseTestCode("");
        com.google.javascript.rhino.Node node37 = compiler30.getRoot();
        boolean boolean38 = compiler30.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer40 = compiler30.newTracer("hi!");
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.rhino.Node node44 = compiler41.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter45 = compiler41.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node47 = compiler41.parseTestCode("");
        com.google.javascript.rhino.Node node48 = compiler41.getRoot();
        boolean boolean49 = compiler41.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode50 = compiler41.languageMode();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = compiler51.jsRoot;
        com.google.javascript.rhino.Node node53 = null;
        compiler51.jsRoot = node53;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter55 = compiler51.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager56 = compiler51.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        compiler57.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = null;
        compiler59.externsRoot = node60;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange62 = compiler59.recentChange;
        compiler57.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange62);
        java.lang.String str64 = compiler57.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange65 = compiler57.recentChange;
        compiler51.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange65);
        compiler41.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange65);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler41.options;
        compiler30.options = compilerOptions68;
        compiler0.options = compilerOptions68;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(codeBuilder12);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(memoizedScopeCreator26);
        org.junit.Assert.assertNotNull(diagnosticGroups28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(errorReporter34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tracer40);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(errorReporter45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + languageMode50 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode50.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(errorReporter55);
        org.junit.Assert.assertNotNull(errorManager56);
        org.junit.Assert.assertNotNull(recentChange62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(recentChange65);
        org.junit.Assert.assertNotNull(compilerOptions68);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.externsRoot = node4;
        com.google.javascript.rhino.Node node6 = compiler3.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter7 = compiler3.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node9 = compiler3.parseTestCode("");
        compiler0.externAndJsRoot = node9;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        boolean boolean17 = compiler13.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node18 = compiler13.getRoot();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.rhino.Node node22 = compiler19.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter23 = compiler19.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node25 = compiler19.parseTestCode("");
        com.google.javascript.rhino.Node node26 = compiler19.getRoot();
        java.lang.String str27 = compiler19.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = compiler28.jsRoot;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler30.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        com.google.javascript.rhino.Node node37 = compiler28.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config38 = compiler28.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = compiler39.jsRoot;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler41.recentChange;
        compiler39.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        com.google.javascript.rhino.Node node48 = compiler39.parseSyntheticCode("hi!", "hi!");
        compiler28.jsRoot = node48;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.externsRoot = node51;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange53 = compiler50.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention54 = null;
        compiler50.defaultCodingConvention = codingConvention54;
        com.google.javascript.jscomp.PassConfig passConfig56 = compiler50.getPassConfig();
        compiler28.setPassConfig(passConfig56);
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.externsRoot = node62;
        com.google.javascript.rhino.Node node64 = compiler61.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter65 = compiler61.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node67 = compiler61.parseTestCode("");
        compiler58.externAndJsRoot = node67;
        java.lang.String str69 = compiler28.toSource(node67);
        compiler19.externsRoot = node67;
        com.google.javascript.jscomp.CodingConvention codingConvention71 = compiler19.defaultCodingConvention;
        compiler13.defaultCodingConvention = codingConvention71;
        compiler0.defaultCodingConvention = codingConvention71;
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator74 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter75 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(recentChange53);
        org.junit.Assert.assertNotNull(passConfig56);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(errorReporter65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(codingConvention71);
        org.junit.Assert.assertNull(memoizedScopeCreator74);
        org.junit.Assert.assertNotNull(errorReporter75);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertArrayEquals(jSErrorArray76, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        boolean boolean11 = compiler0.acceptConstKeyword();
        boolean boolean12 = compiler0.isIdeMode();
        java.lang.String str13 = compiler0.getAstDotGraph();
        boolean boolean14 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.rhino.Node node22 = compiler19.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter23 = compiler19.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node25 = compiler19.parseTestCode("");
        compiler16.externAndJsRoot = node25;
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Scope scope28 = compiler16.getTopScope();
        com.google.javascript.jscomp.Result result29 = compiler16.getResult();
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler16.getCodingConvention();
        compiler0.defaultCodingConvention = codingConvention30;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups32 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNotNull(diagnosticGroups32);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config19 = compiler9.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = compiler20.jsRoot;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        compiler20.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        com.google.javascript.rhino.Node node29 = compiler20.parseSyntheticCode("hi!", "hi!");
        compiler9.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compiler31.defaultCodingConvention = codingConvention35;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler31.getPassConfig();
        compiler9.setPassConfig(passConfig37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.rhino.Node node45 = compiler42.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter46 = compiler42.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node48 = compiler42.parseTestCode("");
        compiler39.externAndJsRoot = node48;
        java.lang.String str50 = compiler9.toSource(node48);
        compiler0.externsRoot = node48;
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Region region55 = compiler0.getSourceRegion("hi!", 3);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker56 = null;
        compiler0.tracker = performanceTracker56;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups58 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(errorReporter46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNull(region55);
        org.junit.Assert.assertNotNull(diagnosticGroups58);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        java.lang.String str13 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler6.recentChange;
        compiler6.resetUniqueNameId();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig16 = compiler6.ensureDefaultPassConfig();
        compiler0.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig16);
        com.google.javascript.jscomp.Scope scope18 = compiler0.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(defaultPassConfig16);
        org.junit.Assert.assertNull(scope18);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph2 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node6 = compiler0.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap9 = null;
        compiler0.setCssRenamingMap(cssRenamingMap9);
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModuleGraph2);
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.externsRoot = node4;
        com.google.javascript.rhino.Node node6 = compiler3.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter7 = compiler3.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node9 = compiler3.parseTestCode("");
        compiler0.externAndJsRoot = node9;
        compiler0.addToDebugLog("");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.rhino.Node node36 = compiler33.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter37 = compiler33.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node39 = compiler33.parseTestCode("");
        compiler30.externAndJsRoot = node39;
        java.lang.String str41 = compiler0.toSource(node39);
        com.google.javascript.rhino.Node node42 = compiler0.jsRoot;
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph43 = compiler0.computeCFG();
        boolean boolean44 = compiler0.acceptConstKeyword();
        compiler0.startPass("");
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node48 = null;
        compiler47.externsRoot = node48;
        com.google.javascript.rhino.Node node50 = compiler47.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter51 = compiler47.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node53 = compiler47.parseTestCode("");
        com.google.javascript.rhino.Node node54 = compiler47.getRoot();
        boolean boolean55 = compiler47.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode56 = compiler47.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray57 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList58 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList58, jSSourceFileArray57);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray60 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList61 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList61, jSSourceFileArray60);
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = compiler63.jsRoot;
        com.google.javascript.rhino.Node node65 = null;
        compiler63.jsRoot = node65;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter67 = compiler63.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager68 = compiler63.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        compiler69.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node72 = null;
        compiler71.externsRoot = node72;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange74 = compiler71.recentChange;
        compiler69.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange74);
        java.lang.String str76 = compiler69.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange77 = compiler69.recentChange;
        compiler63.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange77);
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler63.getOptions();
        com.google.javascript.jscomp.Result result80 = compiler47.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList58, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList61, compilerOptions79);
        compiler0.initOptions(compilerOptions79);
        com.google.javascript.rhino.Node node82 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput84 = compiler0.getInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeControlFlowGraph43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(errorReporter51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + languageMode56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode56.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray57);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray57, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray60);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray60, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(errorReporter67);
        org.junit.Assert.assertNotNull(errorManager68);
        org.junit.Assert.assertNotNull(recentChange74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(recentChange77);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNotNull(result80);
        org.junit.Assert.assertNull(node82);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        int int3 = codeBuilder0.getColumnIndex();
        boolean boolean5 = codeBuilder0.endsWith("");
        int int6 = codeBuilder0.getLineIndex();
        codeBuilder0.reset();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = codeBuilder0.append("hi!");
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(codeBuilder9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node7 = compiler0.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.rhino.Node node11 = null;
        compiler9.jsRoot = node11;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler9.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList16 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, jSSourceFileArray15);
        com.google.javascript.jscomp.JSModule[] jSModuleArray18 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList19 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList19, jSModuleArray18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.externsRoot = node22;
        com.google.javascript.rhino.Node node24 = compiler21.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter25 = compiler21.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node27 = compiler21.parseTestCode("");
        com.google.javascript.rhino.Node node28 = compiler21.getRoot();
        boolean boolean29 = compiler21.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode30 = compiler21.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList32 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList32, jSSourceFileArray31);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList35 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList35, jSSourceFileArray34);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = compiler37.jsRoot;
        com.google.javascript.rhino.Node node39 = null;
        compiler37.jsRoot = node39;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter41 = compiler37.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager42 = compiler37.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        compiler43.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.externsRoot = node46;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange48 = compiler45.recentChange;
        compiler43.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange48);
        java.lang.String str50 = compiler43.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange51 = compiler43.recentChange;
        compiler37.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange51);
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler37.getOptions();
        com.google.javascript.jscomp.Result result54 = compiler21.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList32, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList35, compilerOptions53);
        com.google.javascript.jscomp.Result result55 = compiler9.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList19, compilerOptions53);
        java.util.List<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList56 = null;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node58 = null;
        compiler57.externsRoot = node58;
        com.google.javascript.rhino.Node node60 = compiler57.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter61 = compiler57.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node63 = compiler57.parseTestCode("");
        boolean boolean64 = compiler57.isIdeMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = compiler57.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result66 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList16, jSSourceFileList56, compilerOptions65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray15, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSModuleArray18);
        org.junit.Assert.assertArrayEquals(jSModuleArray18, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(errorReporter25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + languageMode30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode30.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray31);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray31, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray34, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(errorReporter41);
        org.junit.Assert.assertNotNull(errorManager42);
        org.junit.Assert.assertNotNull(recentChange48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(recentChange51);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNotNull(result54);
        org.junit.Assert.assertNotNull(result55);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(errorReporter61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(compilerOptions65);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node12 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initInputsByNameMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNotNull(defaultPassConfig10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler5.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = null;
        compiler5.defaultCodingConvention = codingConvention9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler5.tracker = performanceTracker11;
        com.google.javascript.rhino.Node node13 = compiler5.jsRoot;
        com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler5.buildKnownSymbolTable();
        java.lang.String str15 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler5.options;
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler5.createPassConfigInternal();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = compiler5.tracker;
        compiler5.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Tracer tracer21 = compiler5.newTracer("");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.stopTracer(tracer21, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(symbolTable14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(compilerOptions16);
        org.junit.Assert.assertNotNull(passConfig17);
        org.junit.Assert.assertNull(performanceTracker18);
        org.junit.Assert.assertNotNull(tracer21);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        boolean boolean8 = compiler0.hasRegExpGlobalReferences();
        boolean boolean9 = compiler0.hasRegExpGlobalReferences();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = compiler8.jsRoot;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        com.google.javascript.rhino.Node node17 = compiler8.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder20 = codeBuilder18.append("hi!");
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = null;
        compiler25.externsRoot = node26;
        com.google.javascript.rhino.Node node28 = compiler25.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter29 = compiler25.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node31 = compiler25.parseTestCode("");
        compiler22.externAndJsRoot = node31;
        compiler8.toSource(codeBuilder20, (int) (byte) 1, node31);
        compiler0.externAndJsRoot = node31;
        com.google.common.base.Supplier<java.lang.String> strSupplier35 = compiler0.getUniqueNameIdSupplier();
        compiler0.disableThreads();
        java.lang.Class<?> wildcardClass37 = compiler0.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(codeBuilder20);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(strSupplier35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = codeBuilder5.append("hi!");
        int int8 = codeBuilder5.getLength();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph12 = compiler10.getModuleGraph();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler10.createPassConfigInternal();
        com.google.javascript.rhino.Node node16 = compiler10.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler10.getMessages();
        java.lang.String str18 = compiler10.getAstDotGraph();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap19 = null;
        compiler10.setCssRenamingMap(cssRenamingMap19);
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler10.getWarnings();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = compiler10.getTypeRegistry();
        compiler10.addToDebugLog("hi!");
        com.google.javascript.rhino.Node node26 = compiler10.parseTestCode("hi!");
        compiler0.toSource(codeBuilder5, 3, node26);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange28 = compiler0.recentChange;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(codeBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(jSModuleGraph12);
        org.junit.Assert.assertNotNull(passConfig13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(jSErrorArray17);
        org.junit.Assert.assertArrayEquals(jSErrorArray17, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertArrayEquals(jSErrorArray21, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSTypeRegistry22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(recentChange28);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SymbolTable symbolTable1 = compiler0.buildKnownSymbolTable();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        org.junit.Assert.assertNotNull(symbolTable1);
        org.junit.Assert.assertNull(compilerInputList2);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder12 = codeBuilder10.append("hi!");
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.externsRoot = node18;
        com.google.javascript.rhino.Node node20 = compiler17.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter21 = compiler17.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node23 = compiler17.parseTestCode("");
        compiler14.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder12, (int) (byte) 1, node23);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler0.getExternsForTesting();
        boolean boolean27 = compiler0.precheck();
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(codeBuilder12);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(compilerInputList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(passConfig28);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        java.lang.String str13 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler6.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler0.getPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(passConfig16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        int int3 = codeBuilder0.getColumnIndex();
        int int4 = codeBuilder0.getLineIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder0.append("hi!hi!");
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codeBuilder6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler0.defaultCodingConvention;
        compiler0.addToDebugLog("hi!");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = compiler13.jsRoot;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler13.recentChange;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler13.getErrorManager();
        compiler0.setErrorManager(errorManager16);
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(performanceTracker9);
        org.junit.Assert.assertNull(codingConvention10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNotNull(errorManager16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        boolean boolean17 = compiler9.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode18 = compiler9.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList20 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList20, jSSourceFileArray19);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList23 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, jSSourceFileArray22);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = compiler25.jsRoot;
        com.google.javascript.rhino.Node node27 = null;
        compiler25.jsRoot = node27;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter29 = compiler25.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler25.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        compiler31.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler33.recentChange;
        compiler31.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        java.lang.String str38 = compiler31.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler31.recentChange;
        compiler25.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = compiler25.getOptions();
        com.google.javascript.jscomp.Result result42 = compiler9.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList20, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, compilerOptions41);
        com.google.javascript.rhino.Node node43 = compiler9.getRoot();
        compiler0.externsRoot = node43;
        boolean boolean45 = compiler0.isInliningForbidden();
        int int46 = compiler0.getErrorCount();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + languageMode18 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode18.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray19, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertNotNull(recentChange36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertNotNull(compilerOptions41);
        org.junit.Assert.assertNotNull(result42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.rhino.Node node9 = compiler0.parseTestCode("hi!hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups6 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange12 = compiler9.recentChange;
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange12);
        com.google.javascript.rhino.Node node14 = compiler7.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler7.getState();
        compiler0.setState(intermediateState15);
        com.google.javascript.jscomp.PassConfig passConfig17 = compiler0.createPassConfigInternal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Tracer tracer19 = compiler0.newTracer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(diagnosticGroups6);
        org.junit.Assert.assertNotNull(recentChange12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(passConfig17);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = compiler10.jsRoot;
        com.google.javascript.rhino.Node node12 = null;
        compiler10.jsRoot = node12;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler18.recentChange;
        compiler16.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange21);
        java.lang.String str23 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler16.recentChange;
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler0.options;
        boolean boolean28 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSError[] jSErrorArray29 = compiler0.getErrors();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList30 = compiler0.getInputsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList31 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Scope scope32 = compiler0.getTopScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jSErrorArray29);
        org.junit.Assert.assertArrayEquals(jSErrorArray29, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerInputList30);
        org.junit.Assert.assertNull(compilerInputList31);
        org.junit.Assert.assertNull(scope32);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        java.lang.String str13 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler6.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler0.getOptions();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig17 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.rhino.Node node21 = compiler18.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter22 = compiler18.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node24 = compiler18.parseTestCode("");
        com.google.javascript.rhino.Node node25 = compiler18.getRoot();
        boolean boolean26 = compiler18.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode27 = compiler18.languageMode();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = compiler28.jsRoot;
        com.google.javascript.rhino.Node node30 = null;
        compiler28.jsRoot = node30;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter32 = compiler28.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler28.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        compiler34.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler36.recentChange;
        compiler34.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange39);
        java.lang.String str41 = compiler34.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler34.recentChange;
        compiler28.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange42);
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler18.options;
        boolean boolean46 = compiler18.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.ErrorManager errorManager47 = compiler18.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler18.getPropertyMap();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState49 = compiler18.getState();
        compiler0.setState(intermediateState49);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(defaultPassConfig17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + languageMode27 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode27.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(recentChange42);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(errorManager47);
        org.junit.Assert.assertNull(variableMap48);
        org.junit.Assert.assertNotNull(intermediateState49);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.parsing.Config config8 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config19 = compiler9.getParserConfig();
        boolean boolean20 = compiler9.acceptConstKeyword();
        boolean boolean21 = compiler9.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler9.getSourceMap();
        int int23 = compiler9.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node25 = null;
        compiler24.externsRoot = node25;
        com.google.javascript.rhino.Node node27 = compiler24.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter28 = compiler24.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node30 = compiler24.parseTestCode("");
        compiler9.prepareAst(node30);
        java.lang.String str32 = compiler0.toSource(node30);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = compiler33.jsRoot;
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange38 = compiler35.recentChange;
        compiler33.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange38);
        com.google.javascript.rhino.Node node42 = compiler33.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config43 = compiler33.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = compiler44.jsRoot;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler46.recentChange;
        compiler44.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange49);
        com.google.javascript.rhino.Node node53 = compiler44.parseSyntheticCode("hi!", "hi!");
        compiler33.jsRoot = node53;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node56 = null;
        compiler55.externsRoot = node56;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange58 = compiler55.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention59 = null;
        compiler55.defaultCodingConvention = codingConvention59;
        com.google.javascript.jscomp.PassConfig passConfig61 = compiler55.getPassConfig();
        compiler33.setPassConfig(passConfig61);
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = null;
        compiler63.externsRoot = node64;
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.externsRoot = node67;
        com.google.javascript.rhino.Node node69 = compiler66.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter70 = compiler66.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node72 = compiler66.parseTestCode("");
        compiler63.externAndJsRoot = node72;
        java.lang.String str74 = compiler33.toSource(node72);
        com.google.javascript.rhino.Node node75 = compiler33.jsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap76 = compiler33.getSourceMap();
        com.google.javascript.rhino.Node node78 = compiler33.parseTestCode("hi!");
        compiler0.externAndJsRoot = node78;
        com.google.javascript.jscomp.ErrorManager errorManager80 = compiler0.getErrorManager();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(errorReporter28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(recentChange38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(config43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(recentChange58);
        org.junit.Assert.assertNotNull(passConfig61);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(errorReporter70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(sourceMap76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(errorManager80);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler8.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        compiler14.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange19 = compiler16.recentChange;
        compiler14.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange19);
        java.lang.String str21 = compiler14.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler14.recentChange;
        compiler14.resetUniqueNameId();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig24 = compiler14.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node26 = compiler14.parseTestCode("hi!");
        com.google.javascript.jscomp.Scope scope27 = compiler14.getTopScope();
        com.google.javascript.jscomp.SymbolTable symbolTable28 = compiler14.buildKnownSymbolTable();
        boolean boolean29 = compiler14.acceptConstKeyword();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler14.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result31 = compiler8.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSModuleList13, compilerOptions30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray10, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(recentChange19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(defaultPassConfig24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(symbolTable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(compilerOptions30);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        boolean boolean11 = compiler0.acceptConstKeyword();
        boolean boolean12 = compiler0.isIdeMode();
        java.lang.String str13 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler0.buildKnownSymbolTable();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(symbolTable14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = compiler8.jsRoot;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        com.google.javascript.rhino.Node node17 = compiler8.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config18 = compiler8.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = compiler19.jsRoot;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.externsRoot = node22;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler21.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.rhino.Node node28 = compiler19.parseSyntheticCode("hi!", "hi!");
        compiler8.jsRoot = node28;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler30.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention34 = null;
        compiler30.defaultCodingConvention = codingConvention34;
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler30.getPassConfig();
        compiler8.setPassConfig(passConfig36);
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.externsRoot = node39;
        com.google.javascript.jscomp.PassConfig passConfig41 = compiler38.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler38.options;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler38.recentChange;
        compiler8.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange43);
        com.google.javascript.jscomp.TypeValidator typeValidator45 = compiler8.getTypeValidator();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.rhino.Node node49 = compiler46.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter50 = compiler46.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node52 = compiler46.parseTestCode("");
        boolean boolean53 = compiler46.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap54 = compiler46.getSourceMap();
        com.google.javascript.jscomp.TypeValidator typeValidator55 = compiler46.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange56 = compiler46.recentChange;
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange56);
        int int58 = compiler8.getErrorCount();
        com.google.javascript.rhino.Node node60 = compiler8.parseTestCode("");
        java.lang.String str61 = compiler0.toSource(node60);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(config18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(passConfig36);
        org.junit.Assert.assertNotNull(passConfig41);
        org.junit.Assert.assertNull(compilerOptions42);
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(typeValidator45);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(errorReporter50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(sourceMap54);
        org.junit.Assert.assertNotNull(typeValidator55);
        org.junit.Assert.assertNotNull(recentChange56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.rhino.Node node8 = compiler0.jsRoot;
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
        java.lang.String str10 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig11 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.rhino.Node node22 = compiler19.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter23 = compiler19.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node25 = compiler19.parseTestCode("");
        compiler16.externAndJsRoot = node25;
        compiler12.jsRoot = node25;
        compiler0.jsRoot = node25;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result29 = compiler0.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(symbolTable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(defaultPassConfig11);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.rhino.Node node36 = compiler33.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter37 = compiler33.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node39 = compiler33.parseTestCode("");
        compiler30.externAndJsRoot = node39;
        java.lang.String str41 = compiler0.toSource(node39);
        com.google.javascript.rhino.Node node42 = compiler0.jsRoot;
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph43 = compiler0.computeCFG();
        com.google.javascript.jscomp.SourceMap sourceMap44 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler0.options;
        int int46 = compiler0.getWarningCount();
        compiler0.addToDebugLog("");
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeControlFlowGraph43);
        org.junit.Assert.assertNull(sourceMap44);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups6 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        boolean boolean16 = compiler9.isIdeMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler9.getOptions();
        compiler0.options = compilerOptions17;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange19 = compiler0.recentChange;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(diagnosticGroups6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNotNull(recentChange19);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        java.lang.String str17 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = compiler18.jsRoot;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler20.recentChange;
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.rhino.Node node27 = compiler18.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config28 = compiler18.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        compiler29.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        com.google.javascript.rhino.Node node38 = compiler29.parseSyntheticCode("hi!", "hi!");
        compiler18.jsRoot = node38;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler40.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention44 = null;
        compiler40.defaultCodingConvention = codingConvention44;
        com.google.javascript.jscomp.PassConfig passConfig46 = compiler40.getPassConfig();
        compiler18.setPassConfig(passConfig46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.rhino.Node node54 = compiler51.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter55 = compiler51.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node57 = compiler51.parseTestCode("");
        compiler48.externAndJsRoot = node57;
        java.lang.String str59 = compiler18.toSource(node57);
        compiler9.externsRoot = node57;
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler9.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention61;
        com.google.javascript.rhino.Node node64 = compiler0.parseSyntheticCode("hi!");
        com.google.javascript.jscomp.SourceMap sourceMap65 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(passConfig46);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorReporter55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(sourceMap65);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.externsRoot = node7;
        com.google.javascript.jscomp.PassConfig passConfig9 = compiler6.createPassConfigInternal();
        compiler0.setPassConfig(passConfig9);
        boolean boolean11 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter12 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups13 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = compiler14.jsRoot;
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.externsRoot = node17;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange19 = compiler16.recentChange;
        compiler14.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange19);
        com.google.javascript.rhino.Node node23 = compiler14.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config24 = compiler14.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = compiler25.jsRoot;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.externsRoot = node28;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange30 = compiler27.recentChange;
        compiler25.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange30);
        com.google.javascript.rhino.Node node34 = compiler25.parseSyntheticCode("hi!", "hi!");
        compiler14.jsRoot = node34;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler36.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention40 = null;
        compiler36.defaultCodingConvention = codingConvention40;
        com.google.javascript.jscomp.PassConfig passConfig42 = compiler36.getPassConfig();
        compiler14.setPassConfig(passConfig42);
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.jscomp.PassConfig passConfig47 = compiler44.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler44.options;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler44.recentChange;
        compiler14.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange49);
        com.google.javascript.rhino.Node node51 = compiler14.externsRoot;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.rhino.Node node55 = compiler52.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter56 = compiler52.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node58 = compiler52.parseTestCode("");
        com.google.javascript.rhino.Node node59 = compiler52.getRoot();
        boolean boolean60 = compiler52.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode61 = compiler52.languageMode();
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node63 = compiler62.jsRoot;
        com.google.javascript.rhino.Node node64 = null;
        compiler62.jsRoot = node64;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter66 = compiler62.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager67 = compiler62.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        compiler68.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node71 = null;
        compiler70.externsRoot = node71;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange73 = compiler70.recentChange;
        compiler68.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange73);
        java.lang.String str75 = compiler68.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange76 = compiler68.recentChange;
        compiler62.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        compiler52.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler52.options;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker80 = null;
        compiler52.tracker = performanceTracker80;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker82 = compiler52.tracker;
        com.google.javascript.jscomp.Tracer tracer84 = compiler52.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        compiler14.stopTracer(tracer84, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.stopTracer(tracer84, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(passConfig9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(errorReporter12);
        org.junit.Assert.assertNotNull(diagnosticGroups13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(recentChange19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(config24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(recentChange30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertNotNull(passConfig42);
        org.junit.Assert.assertNotNull(passConfig47);
        org.junit.Assert.assertNull(compilerOptions48);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(errorReporter56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + languageMode61 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode61.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(errorReporter66);
        org.junit.Assert.assertNotNull(errorManager67);
        org.junit.Assert.assertNotNull(recentChange73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(recentChange76);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNull(performanceTracker82);
        org.junit.Assert.assertNotNull(tracer84);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList7 = compiler0.getInputsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator8 = compiler7.getTypedScopeCreator();
        com.google.javascript.jscomp.Result result9 = compiler7.getResult();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler7.getState();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        java.lang.String str18 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange19 = compiler11.recentChange;
        compiler11.resetUniqueNameId();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig21 = compiler11.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node23 = compiler11.parseTestCode("hi!");
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler11.getErrorManager();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler11.recentChange;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = compiler26.jsRoot;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange31 = compiler28.recentChange;
        compiler26.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange31);
        com.google.javascript.rhino.Node node35 = compiler26.parseSyntheticCode("hi!", "hi!");
        compiler11.externsRoot = node35;
        intermediateState10.externsRoot = node35;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(memoizedScopeCreator8);
        org.junit.Assert.assertNotNull(result9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(recentChange19);
        org.junit.Assert.assertNotNull(defaultPassConfig21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(recentChange31);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder12 = codeBuilder10.append("hi!");
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.externsRoot = node18;
        com.google.javascript.rhino.Node node20 = compiler17.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter21 = compiler17.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node23 = compiler17.parseTestCode("");
        compiler14.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder12, (int) (byte) 1, node23);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator26 = compiler0.getTypedScopeCreator();
        compiler0.startPass("hi!");
        compiler0.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(codeBuilder12);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(memoizedScopeCreator26);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        boolean boolean8 = compiler0.hasRegExpGlobalReferences();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph2 = compiler0.getModuleGraph();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler4.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange7);
        org.junit.Assert.assertNull(jSModuleGraph2);
        org.junit.Assert.assertNull(compilerInputList3);
        org.junit.Assert.assertNotNull(recentChange7);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = compiler10.jsRoot;
        com.google.javascript.rhino.Node node12 = null;
        compiler10.jsRoot = node12;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler18.recentChange;
        compiler16.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange21);
        java.lang.String str23 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler16.recentChange;
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler0.options;
        boolean boolean28 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSError[] jSErrorArray29 = compiler0.getErrors();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList30 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.JSError[] jSErrorArray31 = compiler0.getWarnings();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler0.getVariableMap();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node34 = compiler0.externsRoot;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler0.recentChange;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jSErrorArray29);
        org.junit.Assert.assertArrayEquals(jSErrorArray29, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerInputList30);
        org.junit.Assert.assertNotNull(jSErrorArray31);
        org.junit.Assert.assertArrayEquals(jSErrorArray31, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(recentChange35);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph2 = compiler0.getModuleGraph();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        compiler0.disableThreads();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig5 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.options;
        org.junit.Assert.assertNull(jSModuleGraph2);
        org.junit.Assert.assertNull(compilerInputList3);
        org.junit.Assert.assertNotNull(defaultPassConfig5);
        org.junit.Assert.assertNull(compilerOptions6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.SymbolTable symbolTable30 = compiler0.buildKnownSymbolTable();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode31 = compiler0.languageMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler0.getMessages();
        int int33 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = compiler0.parseSyntheticCode("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNotNull(symbolTable30);
        org.junit.Assert.assertTrue("'" + languageMode31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode31.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        com.google.javascript.rhino.Node node9 = intermediateState8.externsRoot;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention14 = null;
        compiler10.defaultCodingConvention = codingConvention14;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups16 = compiler10.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        compiler17.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        com.google.javascript.rhino.Node node24 = compiler17.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler17.getState();
        compiler10.setState(intermediateState25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        compiler27.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler29.recentChange;
        compiler27.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange32);
        java.lang.String str34 = compiler27.getAstDotGraph();
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler27.getPassConfig();
        boolean boolean36 = compiler27.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.externsRoot = node38;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler37.recentChange;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.externsRoot = node45;
        com.google.javascript.rhino.Node node47 = compiler44.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter48 = compiler44.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node50 = compiler44.parseTestCode("");
        compiler41.externAndJsRoot = node50;
        compiler37.jsRoot = node50;
        compiler27.jsRoot = node50;
        intermediateState25.externsRoot = node50;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node56 = compiler55.jsRoot;
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node58 = null;
        compiler57.externsRoot = node58;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange60 = compiler57.recentChange;
        compiler55.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange60);
        com.google.javascript.rhino.Node node64 = compiler55.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config65 = compiler55.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = compiler66.jsRoot;
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node69 = null;
        compiler68.externsRoot = node69;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange71 = compiler68.recentChange;
        compiler66.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange71);
        com.google.javascript.rhino.Node node75 = compiler66.parseSyntheticCode("hi!", "hi!");
        compiler55.jsRoot = node75;
        intermediateState25.externsRoot = node75;
        intermediateState8.externsRoot = node75;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(intermediateState8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(diagnosticGroups16);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(intermediateState25);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(recentChange40);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(errorReporter48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(recentChange60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(config65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(recentChange71);
        org.junit.Assert.assertNotNull(node75);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.SymbolTable symbolTable30 = compiler0.buildKnownSymbolTable();
        com.google.javascript.jscomp.PassConfig passConfig31 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler0.getPropertyMap();
        boolean boolean33 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = compiler34.jsRoot;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler36.recentChange;
        compiler34.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange39);
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        compiler41.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange46 = compiler43.recentChange;
        compiler41.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange46);
        java.lang.String str48 = compiler41.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler41.recentChange;
        compiler34.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange49);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange49);
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler0.defaultCodingConvention;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNotNull(symbolTable30);
        org.junit.Assert.assertNotNull(passConfig31);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertNotNull(recentChange46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertNotNull(codingConvention52);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList7 = compiler0.getExternsForTesting();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = codeBuilder19.append("hi!");
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.rhino.Node node29 = compiler26.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter30 = compiler26.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node32 = compiler26.parseTestCode("");
        compiler23.externAndJsRoot = node32;
        compiler9.toSource(codeBuilder21, (int) (byte) 1, node32);
        compiler0.jsRoot = node32;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap36 = compiler0.getFunctionalInformationMap();
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNull(compilerInputList7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(codeBuilder21);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(errorReporter30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(functionInformationMap36);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager3);
        com.google.javascript.jscomp.PassConfig passConfig5 = compiler4.getPassConfig();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler4.recentChange;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(passConfig5);
        org.junit.Assert.assertNotNull(recentChange6);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.externsRoot = node34;
        com.google.javascript.rhino.Node node36 = compiler33.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter37 = compiler33.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node39 = compiler33.parseTestCode("");
        compiler30.externAndJsRoot = node39;
        java.lang.String str41 = compiler0.toSource(node39);
        com.google.javascript.rhino.Node node42 = compiler0.jsRoot;
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph43 = compiler0.computeCFG();
        boolean boolean44 = compiler0.acceptConstKeyword();
        compiler0.startPass("");
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode47 = compiler0.languageMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker48 = null;
        compiler0.tracker = performanceTracker48;
        com.google.javascript.rhino.Node node52 = compiler0.parseSyntheticCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeControlFlowGraph43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + languageMode47 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode47.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node9 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph10 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler0.getVariableMap();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = compiler0.getGlobalVarReferences();
        boolean boolean13 = compiler0.precheck();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModuleGraph10);
        org.junit.Assert.assertNull(variableMap11);
        org.junit.Assert.assertNull(referenceMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        boolean boolean4 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compiler0.setCssRenamingMap(cssRenamingMap7);
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        compiler0.setHasRegExpGlobalReferences(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(strSupplier4);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.externsRoot = node10;
        com.google.javascript.rhino.Node node12 = compiler9.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter13 = compiler9.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node15 = compiler9.parseTestCode("");
        com.google.javascript.rhino.Node node16 = compiler9.getRoot();
        java.lang.String str17 = compiler9.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = compiler18.jsRoot;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler20.recentChange;
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.rhino.Node node27 = compiler18.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config28 = compiler18.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = compiler29.jsRoot;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        compiler29.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        com.google.javascript.rhino.Node node38 = compiler29.parseSyntheticCode("hi!", "hi!");
        compiler18.jsRoot = node38;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.externsRoot = node41;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange43 = compiler40.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention44 = null;
        compiler40.defaultCodingConvention = codingConvention44;
        com.google.javascript.jscomp.PassConfig passConfig46 = compiler40.getPassConfig();
        compiler18.setPassConfig(passConfig46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.externsRoot = node49;
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.externsRoot = node52;
        com.google.javascript.rhino.Node node54 = compiler51.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter55 = compiler51.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node57 = compiler51.parseTestCode("");
        compiler48.externAndJsRoot = node57;
        java.lang.String str59 = compiler18.toSource(node57);
        compiler9.externsRoot = node57;
        com.google.javascript.jscomp.CodingConvention codingConvention61 = compiler9.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention61;
        com.google.javascript.jscomp.SourceMap sourceMap63 = compiler0.getSourceMap();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(config28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(recentChange43);
        org.junit.Assert.assertNotNull(passConfig46);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorReporter55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(codingConvention61);
        org.junit.Assert.assertNull(sourceMap63);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap6 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(functionInformationMap6);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer10 = compiler0.newTracer("hi!");
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.rhino.Node node14 = compiler11.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter15 = compiler11.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node17 = compiler11.parseTestCode("");
        com.google.javascript.rhino.Node node18 = compiler11.getRoot();
        boolean boolean19 = compiler11.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode20 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = compiler21.jsRoot;
        com.google.javascript.rhino.Node node23 = null;
        compiler21.jsRoot = node23;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter25 = compiler21.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler21.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        compiler27.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.externsRoot = node30;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler29.recentChange;
        compiler27.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange32);
        java.lang.String str34 = compiler27.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler27.recentChange;
        compiler21.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange35);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler11.options;
        compiler0.options = compilerOptions38;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = compiler41.jsRoot;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange46 = compiler43.recentChange;
        compiler41.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange46);
        com.google.javascript.rhino.Node node50 = compiler41.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config51 = compiler41.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = compiler52.jsRoot;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.externsRoot = node55;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange57 = compiler54.recentChange;
        compiler52.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange57);
        com.google.javascript.rhino.Node node61 = compiler52.parseSyntheticCode("hi!", "hi!");
        compiler41.jsRoot = node61;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange63 = compiler41.recentChange;
        com.google.javascript.rhino.Node node65 = compiler41.parseTestCode("hi!hi!");
        compiler0.jsRoot = node65;
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler0.getOptions();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tracer10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + languageMode20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode20.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(errorReporter25);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNotNull(compilerOptions38);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(recentChange46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(config51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(recentChange57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(recentChange63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(compilerOptions67);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = compiler8.jsRoot;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.externsRoot = node11;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler10.recentChange;
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        com.google.javascript.rhino.Node node17 = compiler8.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config18 = compiler8.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = compiler19.jsRoot;
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.externsRoot = node22;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler21.recentChange;
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.rhino.Node node28 = compiler19.parseSyntheticCode("hi!", "hi!");
        compiler8.jsRoot = node28;
        com.google.javascript.jscomp.CodingConvention codingConvention30 = compiler8.getCodingConvention();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.rhino.Node node34 = compiler31.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter35 = compiler31.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node37 = compiler31.parseTestCode("");
        com.google.javascript.rhino.Node node38 = compiler31.getRoot();
        boolean boolean39 = compiler31.acceptEcmaScript5();
        com.google.javascript.jscomp.Tracer tracer41 = compiler31.newTracer("hi!");
        compiler8.stopTracer(tracer41, "");
        compiler0.stopTracer(tracer41, "hi!hi!");
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.externsRoot = node47;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler46.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention50 = null;
        compiler46.defaultCodingConvention = codingConvention50;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups52 = compiler46.getDiagnosticGroups();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler46.options;
        com.google.javascript.rhino.Node node56 = compiler46.parseSyntheticCode("hi!", "");
        compiler0.prepareAst(node56);
        com.google.javascript.jscomp.JSError[] jSErrorArray58 = compiler0.getErrors();
        int int59 = compiler0.getWarningCount();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(recentChange13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(config18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(codingConvention30);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tracer41);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertNotNull(diagnosticGroups52);
        org.junit.Assert.assertNull(compilerOptions53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(jSErrorArray58);
        org.junit.Assert.assertArrayEquals(jSErrorArray58, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = codeBuilder0.append("hi!");
        boolean boolean4 = codeBuilder0.endsWith("");
        int int5 = codeBuilder0.getLineIndex();
        org.junit.Assert.assertNotNull(codeBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config19 = compiler9.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = compiler20.jsRoot;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        compiler20.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        com.google.javascript.rhino.Node node29 = compiler20.parseSyntheticCode("hi!", "hi!");
        compiler9.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compiler31.defaultCodingConvention = codingConvention35;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler31.getPassConfig();
        compiler9.setPassConfig(passConfig37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.rhino.Node node45 = compiler42.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter46 = compiler42.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node48 = compiler42.parseTestCode("");
        compiler39.externAndJsRoot = node48;
        java.lang.String str50 = compiler9.toSource(node48);
        compiler0.externsRoot = node48;
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Region region55 = compiler0.getSourceRegion("hi!", 3);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList56 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Scope scope57 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = compiler0.toSource(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(errorReporter46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNull(region55);
        org.junit.Assert.assertNull(compilerInputList56);
        org.junit.Assert.assertNull(scope57);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node7 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState8 = compiler0.getState();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("hi!hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(intermediateState8);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node9 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph10 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.rhino.Node node13 = null;
        compiler11.jsRoot = node13;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter15 = compiler11.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler11.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(errorManager16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler(errorManager16);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler(errorManager16);
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler19.getErrors();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.externsRoot = node22;
        com.google.javascript.rhino.Node node24 = compiler21.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter25 = compiler21.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node27 = compiler21.parseTestCode("");
        com.google.javascript.rhino.Node node28 = compiler21.getRoot();
        boolean boolean29 = compiler21.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode30 = compiler21.languageMode();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = compiler31.jsRoot;
        com.google.javascript.rhino.Node node33 = null;
        compiler31.jsRoot = node33;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter35 = compiler31.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler31.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        compiler37.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler39.recentChange;
        compiler37.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange42);
        java.lang.String str44 = compiler37.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler37.recentChange;
        compiler31.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler21.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler21.options;
        boolean boolean49 = compiler21.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = compiler50.jsRoot;
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.externsRoot = node53;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange55 = compiler52.recentChange;
        compiler50.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange55);
        com.google.javascript.rhino.Node node59 = compiler50.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder60 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder62 = codeBuilder60.append("hi!");
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.externsRoot = node65;
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node68 = null;
        compiler67.externsRoot = node68;
        com.google.javascript.rhino.Node node70 = compiler67.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter71 = compiler67.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node73 = compiler67.parseTestCode("");
        compiler64.externAndJsRoot = node73;
        compiler50.toSource(codeBuilder62, (int) (byte) 1, node73);
        compiler21.externAndJsRoot = node73;
        compiler19.jsRoot = node73;
        java.lang.String str78 = compiler0.toSource(node73);
        com.google.javascript.jscomp.JSError[] jSErrorArray79 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region82 = compiler0.getSourceRegion("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModuleGraph10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(errorReporter25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + languageMode30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode30.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(recentChange42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(recentChange45);
        org.junit.Assert.assertNotNull(compilerOptions48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(recentChange55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(codeBuilder62);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(errorReporter71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(jSErrorArray79);
        org.junit.Assert.assertArrayEquals(jSErrorArray79, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler4.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.rhino.Node node17 = compiler13.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler13.getErrorManager();
        compiler0.setErrorManager(errorManager18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput21 = compiler0.getInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
        org.junit.Assert.assertNotNull(passConfig12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(errorManager18);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
        compiler0.startPass("");
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator10 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config21 = compiler11.getParserConfig();
        boolean boolean22 = compiler11.acceptConstKeyword();
        boolean boolean23 = compiler11.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler11.getSourceMap();
        int int25 = compiler11.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.externsRoot = node27;
        com.google.javascript.rhino.Node node29 = compiler26.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter30 = compiler26.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node32 = compiler26.parseTestCode("");
        compiler11.prepareAst(node32);
        com.google.javascript.jscomp.Tracer tracer35 = compiler11.newTracer("hi!");
        compiler0.stopTracer(tracer35, "hi!hi!");
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(compilerInputList6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(memoizedScopeCreator10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(config21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(errorReporter30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(tracer35);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config19 = compiler9.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = compiler20.jsRoot;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        compiler20.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        com.google.javascript.rhino.Node node29 = compiler20.parseSyntheticCode("hi!", "hi!");
        compiler9.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compiler31.defaultCodingConvention = codingConvention35;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler31.getPassConfig();
        compiler9.setPassConfig(passConfig37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.rhino.Node node45 = compiler42.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter46 = compiler42.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node48 = compiler42.parseTestCode("");
        compiler39.externAndJsRoot = node48;
        java.lang.String str50 = compiler9.toSource(node48);
        compiler0.externsRoot = node48;
        compiler0.startPass("");
        com.google.javascript.rhino.Node node55 = compiler0.parseTestCode("hi!hi!");
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.externsRoot = node57;
        com.google.javascript.rhino.Node node59 = compiler56.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter60 = compiler56.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node62 = compiler56.parseTestCode("");
        com.google.javascript.rhino.Node node63 = compiler56.getRoot();
        boolean boolean64 = compiler56.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode65 = compiler56.languageMode();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = compiler66.jsRoot;
        com.google.javascript.rhino.Node node68 = null;
        compiler66.jsRoot = node68;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter70 = compiler66.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager71 = compiler66.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        compiler72.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node75 = null;
        compiler74.externsRoot = node75;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange77 = compiler74.recentChange;
        compiler72.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange77);
        java.lang.String str79 = compiler72.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange80 = compiler72.recentChange;
        compiler66.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange80);
        compiler56.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange80);
        com.google.javascript.jscomp.CompilerOptions compilerOptions83 = compiler56.options;
        boolean boolean84 = compiler56.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSError[] jSErrorArray85 = compiler56.getErrors();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList86 = compiler56.getInputsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList87 = compiler56.getInputsForTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange88 = compiler56.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange88);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(errorReporter46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(errorReporter60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + languageMode65 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode65.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(errorReporter70);
        org.junit.Assert.assertNotNull(errorManager71);
        org.junit.Assert.assertNotNull(recentChange77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(recentChange80);
        org.junit.Assert.assertNotNull(compilerOptions83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(jSErrorArray85);
        org.junit.Assert.assertArrayEquals(jSErrorArray85, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerInputList86);
        org.junit.Assert.assertNull(compilerInputList87);
        org.junit.Assert.assertNotNull(recentChange88);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean2 = codeBuilder0.endsWith("hi!");
        int int3 = codeBuilder0.getLineIndex();
        codeBuilder0.reset();
        int int5 = codeBuilder0.getLength();
        int int6 = codeBuilder0.getLength();
        int int7 = codeBuilder0.getColumnIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config19 = compiler9.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = compiler20.jsRoot;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        compiler20.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        com.google.javascript.rhino.Node node29 = compiler20.parseSyntheticCode("hi!", "hi!");
        compiler9.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compiler31.defaultCodingConvention = codingConvention35;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler31.getPassConfig();
        compiler9.setPassConfig(passConfig37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.rhino.Node node45 = compiler42.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter46 = compiler42.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node48 = compiler42.parseTestCode("");
        compiler39.externAndJsRoot = node48;
        java.lang.String str50 = compiler9.toSource(node48);
        compiler0.externsRoot = node48;
        compiler0.startPass("");
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator54 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(errorReporter46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(memoizedScopeCreator54);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.externsRoot = node4;
        com.google.javascript.rhino.Node node6 = compiler3.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter7 = compiler3.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node9 = compiler3.parseTestCode("");
        compiler0.externAndJsRoot = node9;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        boolean boolean17 = compiler13.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node18 = compiler13.getRoot();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.rhino.Node node22 = compiler19.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter23 = compiler19.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node25 = compiler19.parseTestCode("");
        com.google.javascript.rhino.Node node26 = compiler19.getRoot();
        java.lang.String str27 = compiler19.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = compiler28.jsRoot;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.externsRoot = node31;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler30.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        com.google.javascript.rhino.Node node37 = compiler28.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config38 = compiler28.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = compiler39.jsRoot;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.externsRoot = node42;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler41.recentChange;
        compiler39.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        com.google.javascript.rhino.Node node48 = compiler39.parseSyntheticCode("hi!", "hi!");
        compiler28.jsRoot = node48;
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.externsRoot = node51;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange53 = compiler50.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention54 = null;
        compiler50.defaultCodingConvention = codingConvention54;
        com.google.javascript.jscomp.PassConfig passConfig56 = compiler50.getPassConfig();
        compiler28.setPassConfig(passConfig56);
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.externsRoot = node59;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.externsRoot = node62;
        com.google.javascript.rhino.Node node64 = compiler61.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter65 = compiler61.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node67 = compiler61.parseTestCode("");
        compiler58.externAndJsRoot = node67;
        java.lang.String str69 = compiler28.toSource(node67);
        compiler19.externsRoot = node67;
        com.google.javascript.jscomp.CodingConvention codingConvention71 = compiler19.defaultCodingConvention;
        compiler13.defaultCodingConvention = codingConvention71;
        compiler0.defaultCodingConvention = codingConvention71;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList74 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph75 = compiler0.getModuleGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(config38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(recentChange53);
        org.junit.Assert.assertNotNull(passConfig56);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(errorReporter65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(codingConvention71);
        org.junit.Assert.assertNull(compilerInputList74);
        org.junit.Assert.assertNull(jSModuleGraph75);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        boolean boolean10 = compiler0.isTypeCheckingEnabled();
        boolean boolean11 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = null;
        compiler0.setCssRenamingMap(cssRenamingMap12);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.externsRoot = node15;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler14.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler14.options;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange19 = compiler14.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange19);
        boolean boolean21 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNull(compilerOptions18);
        org.junit.Assert.assertNotNull(recentChange19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.externsRoot = node5;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler4.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler0.getInputsForTesting();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNull(functionInformationMap10);
        org.junit.Assert.assertNull(compilerInputList11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = compiler10.jsRoot;
        com.google.javascript.rhino.Node node12 = null;
        compiler10.jsRoot = node12;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.externsRoot = node19;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler18.recentChange;
        compiler16.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange21);
        java.lang.String str23 = compiler16.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler16.recentChange;
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler0.options;
        boolean boolean28 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator29 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(memoizedScopeCreator29);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = compiler0.getGlobalVarReferences();
        compiler0.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.rhino.Node node10 = compiler0.externsRoot;
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.SymbolTable symbolTable12 = compiler0.buildKnownSymbolTable();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(referenceMap6);
        org.junit.Assert.assertNull(compilerOptions9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertNotNull(symbolTable12);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler0.getPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(passConfig8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        boolean boolean9 = compiler0.hasErrors();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange15);
        com.google.javascript.rhino.Node node17 = compiler10.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler10.getState();
        com.google.javascript.rhino.Node node19 = intermediateState18.externsRoot;
        com.google.javascript.rhino.Node node20 = null;
        intermediateState18.externsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.rhino.Node node25 = compiler22.getRoot();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler22.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler22.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.rhino.Node node31 = compiler28.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter32 = compiler28.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node34 = compiler28.parseTestCode("");
        compiler22.jsRoot = node34;
        intermediateState18.externsRoot = node34;
        compiler0.setState(intermediateState18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(variableMap26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager5);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.rhino.Node node14 = compiler11.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter15 = compiler11.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node17 = compiler11.parseTestCode("");
        compiler8.externAndJsRoot = node17;
        compiler7.externAndJsRoot = node17;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler7.getState();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator21 = compiler7.getTypedScopeCreator();
        boolean boolean22 = compiler7.hasRegExpGlobalReferences();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(intermediateState20);
        org.junit.Assert.assertNull(memoizedScopeCreator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler0.recentChange;
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups24 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(diagnosticGroups24);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        boolean boolean4 = compiler0.hasRegExpGlobalReferences();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.externsRoot = node8;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler7.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention11 = null;
        compiler7.defaultCodingConvention = codingConvention11;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker13 = null;
        compiler7.tracker = performanceTracker13;
        compiler7.addToDebugLog("");
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler7.getErrorManager();
        compiler0.setErrorManager(errorManager17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler19.createPassConfigInternal();
        com.google.javascript.rhino.Node node24 = compiler19.parseTestCode("");
        compiler0.externsRoot = node24;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph26 = compiler0.computeCFG();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(passConfig22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(compilerOptions10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("hi!", (int) 'a');
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter11 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter11);
        org.junit.Assert.assertNotNull(codingConvention12);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = compiler10.jsRoot;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange15);
        com.google.javascript.rhino.Node node19 = compiler10.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config20 = compiler10.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = compiler21.jsRoot;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler23.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        com.google.javascript.rhino.Node node30 = compiler21.parseSyntheticCode("hi!", "hi!");
        compiler10.jsRoot = node30;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder32 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder34 = codeBuilder32.append("");
        int int35 = codeBuilder34.getLineIndex();
        int int36 = codeBuilder34.getLength();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder38 = codeBuilder34.append("hi!");
        int int39 = codeBuilder38.getLineIndex();
        int int40 = codeBuilder38.getLineIndex();
        int int41 = codeBuilder38.getLength();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.externsRoot = node44;
        com.google.javascript.rhino.Node node46 = compiler43.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter47 = compiler43.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node49 = compiler43.parseTestCode("");
        com.google.javascript.rhino.Node node50 = compiler43.getRoot();
        boolean boolean51 = compiler43.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode52 = compiler43.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList54 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList54, jSSourceFileArray53);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray56 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList57 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList57, jSSourceFileArray56);
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = compiler59.jsRoot;
        com.google.javascript.rhino.Node node61 = null;
        compiler59.jsRoot = node61;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter63 = compiler59.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager64 = compiler59.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        compiler65.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node68 = null;
        compiler67.externsRoot = node68;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange70 = compiler67.recentChange;
        compiler65.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange70);
        java.lang.String str72 = compiler65.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange73 = compiler65.recentChange;
        compiler59.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange73);
        com.google.javascript.jscomp.CompilerOptions compilerOptions75 = compiler59.getOptions();
        com.google.javascript.jscomp.Result result76 = compiler43.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList54, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList57, compilerOptions75);
        com.google.javascript.rhino.Node node77 = compiler43.getRoot();
        compiler10.toSource(codeBuilder38, (int) '#', node77);
        compiler0.externsRoot = node77;
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(config20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(recentChange26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(codeBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(codeBuilder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(errorReporter47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + languageMode52 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode52.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray53, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray56);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray56, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(errorReporter63);
        org.junit.Assert.assertNotNull(errorManager64);
        org.junit.Assert.assertNotNull(recentChange70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(recentChange73);
        org.junit.Assert.assertNotNull(compilerOptions75);
        org.junit.Assert.assertNotNull(result76);
        org.junit.Assert.assertNotNull(node77);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.externsRoot = node4;
        com.google.javascript.rhino.Node node6 = compiler3.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter7 = compiler3.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node9 = compiler3.parseTestCode("");
        compiler0.externAndJsRoot = node9;
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node19 = compiler13.parseTestCode("");
        com.google.javascript.rhino.Node node20 = compiler13.getRoot();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = compiler21.jsRoot;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.externsRoot = node24;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler23.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        com.google.javascript.rhino.Node node30 = compiler21.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder31 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder33 = codeBuilder31.append("hi!");
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.externsRoot = node36;
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.externsRoot = node39;
        com.google.javascript.rhino.Node node41 = compiler38.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter42 = compiler38.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node44 = compiler38.parseTestCode("");
        compiler35.externAndJsRoot = node44;
        compiler21.toSource(codeBuilder33, (int) (byte) 1, node44);
        compiler13.externAndJsRoot = node44;
        java.lang.String str48 = compiler0.toSource(node44);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph49 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler0.getPropertyMap();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(recentChange26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(codeBuilder33);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(jSModuleGraph49);
        org.junit.Assert.assertNull(variableMap50);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention4 = null;
        compiler0.defaultCodingConvention = codingConvention4;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.rhino.Node node8 = compiler0.jsRoot;
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("", (int) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.rhino.Node node16 = compiler13.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler13.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node19 = compiler13.parseTestCode("");
        com.google.javascript.rhino.Node node20 = compiler13.getRoot();
        boolean boolean21 = compiler13.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler13.languageMode();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = compiler23.jsRoot;
        com.google.javascript.rhino.Node node25 = null;
        compiler23.jsRoot = node25;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter27 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        compiler29.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        compiler29.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange34);
        java.lang.String str36 = compiler29.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange37 = compiler29.recentChange;
        compiler23.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange37);
        compiler13.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange37);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler13.options;
        compiler0.initOptions(compilerOptions40);
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(symbolTable9);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(errorReporter27);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(recentChange37);
        org.junit.Assert.assertNotNull(compilerOptions40);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        boolean boolean4 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler0.getGlobalVarReferences();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compiler0.getSourceLine("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(referenceMap5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = compiler6.jsRoot;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        compiler6.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        com.google.javascript.rhino.Node node15 = compiler6.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config16 = compiler6.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = compiler17.jsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.externsRoot = node20;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler19.recentChange;
        compiler17.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        com.google.javascript.rhino.Node node26 = compiler17.parseSyntheticCode("hi!", "hi!");
        compiler6.jsRoot = node26;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.externsRoot = node29;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange31 = compiler28.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention32 = null;
        compiler28.defaultCodingConvention = codingConvention32;
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler28.getPassConfig();
        compiler6.setPassConfig(passConfig34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.rhino.Node node42 = compiler39.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter43 = compiler39.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node45 = compiler39.parseTestCode("");
        compiler36.externAndJsRoot = node45;
        java.lang.String str47 = compiler6.toSource(node45);
        compiler4.jsRoot = node45;
        compiler0.jsRoot = node45;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.JSError[] jSErrorArray51 = compiler0.getErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(config16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(recentChange31);
        org.junit.Assert.assertNotNull(passConfig34);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(jSErrorArray51);
        org.junit.Assert.assertArrayEquals(jSErrorArray51, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSTypeRegistry52);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        com.google.javascript.rhino.Node node8 = compiler0.externsRoot;
        boolean boolean9 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph10 = compiler0.getModuleGraph();
        int int11 = compiler0.getWarningCount();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModuleGraph10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("");
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler11.recentChange;
        compiler9.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.Node node18 = compiler9.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config19 = compiler9.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = compiler20.jsRoot;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        compiler20.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        com.google.javascript.rhino.Node node29 = compiler20.parseSyntheticCode("hi!", "hi!");
        compiler9.jsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.externsRoot = node32;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler31.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compiler31.defaultCodingConvention = codingConvention35;
        com.google.javascript.jscomp.PassConfig passConfig37 = compiler31.getPassConfig();
        compiler9.setPassConfig(passConfig37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.externsRoot = node43;
        com.google.javascript.rhino.Node node45 = compiler42.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter46 = compiler42.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node48 = compiler42.parseTestCode("");
        compiler39.externAndJsRoot = node48;
        java.lang.String str50 = compiler9.toSource(node48);
        compiler0.externsRoot = node48;
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Region region55 = compiler0.getSourceRegion("hi!", 3);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList56 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler0.getOptions();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(config19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNotNull(passConfig37);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(errorReporter46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNull(region55);
        org.junit.Assert.assertNull(compilerInputList56);
        org.junit.Assert.assertNotNull(compilerOptions57);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.externsRoot = node6;
        compiler5.setHasRegExpGlobalReferences(true);
        java.lang.String str10 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.externsRoot = node12;
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler11.createPassConfigInternal();
        compiler5.setPassConfig(passConfig14);
        boolean boolean16 = compiler5.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter17 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.externsRoot = node21;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler20.recentChange;
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.rhino.Node node25 = compiler18.jsRoot;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState26 = compiler18.getState();
        com.google.javascript.rhino.Node node27 = intermediateState26.externsRoot;
        compiler5.setState(intermediateState26);
        com.google.javascript.rhino.Node node29 = null;
        intermediateState26.externsRoot = node29;
        compiler0.setState(intermediateState26);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.externsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler32.recentChange;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.externsRoot = node40;
        com.google.javascript.rhino.Node node42 = compiler39.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter43 = compiler39.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node45 = compiler39.parseTestCode("");
        compiler36.externAndJsRoot = node45;
        compiler32.jsRoot = node45;
        intermediateState26.externsRoot = node45;
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(intermediateState26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.externsRoot = node3;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler2.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.rhino.Node node9 = compiler0.parseSyntheticCode("hi!", "hi!");
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = compiler11.jsRoot;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.externsRoot = node14;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler13.recentChange;
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler11.parseSyntheticCode("hi!", "hi!");
        compiler0.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.externsRoot = node23;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler22.recentChange;
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compiler22.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        compiler0.setPassConfig(passConfig28);
        com.google.javascript.jscomp.SymbolTable symbolTable30 = compiler0.buildKnownSymbolTable();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode31 = compiler0.languageMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(config10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNotNull(symbolTable30);
        org.junit.Assert.assertTrue("'" + languageMode31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode31.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray32);
        org.junit.Assert.assertArrayEquals(jSErrorArray32, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = compiler0.tracker;
        java.lang.String str9 = compiler0.getSourceLine("", 0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        com.google.javascript.rhino.Node node11 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(performanceTracker6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(compilerOptions10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph2 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node6 = compiler0.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = null;
        compiler0.setCssRenamingMap(cssRenamingMap8);
        com.google.javascript.jscomp.parsing.Config config10 = compiler0.getParserConfig();
        org.junit.Assert.assertNull(jSModuleGraph2);
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(config10);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph2 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node6 = compiler0.parseSyntheticCode("hi!", "");
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        java.lang.String str8 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap9 = null;
        compiler0.setCssRenamingMap(cssRenamingMap9);
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        compiler0.addToDebugLog("hi!");
        com.google.javascript.rhino.Node node16 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler0.getSourceMap();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler0.getVariableMap();
        org.junit.Assert.assertNull(jSModuleGraph2);
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNull(variableMap18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.externsRoot = node9;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler8.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        java.lang.String str13 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler6.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler0.getOptions();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator17 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNull(memoizedScopeCreator17);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.externsRoot = node1;
        compiler0.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypeValidator typeValidator8 = compiler0.getTypeValidator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList7 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, jSSourceFileArray6);
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList10, jSModuleArray9);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.externsRoot = node13;
        com.google.javascript.rhino.Node node15 = compiler12.getRoot();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter16 = compiler12.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node18 = compiler12.parseTestCode("");
        com.google.javascript.rhino.Node node19 = compiler12.getRoot();
        boolean boolean20 = compiler12.acceptEcmaScript5();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode21 = compiler12.languageMode();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList23 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, jSSourceFileArray22);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList26 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, jSSourceFileArray25);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = compiler28.jsRoot;
        com.google.javascript.rhino.Node node30 = null;
        compiler28.jsRoot = node30;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter32 = compiler28.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler28.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        compiler34.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.externsRoot = node37;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler36.recentChange;
        compiler34.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange39);
        java.lang.String str41 = compiler34.getAstDotGraph();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler34.recentChange;
        compiler28.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler28.getOptions();
        com.google.javascript.jscomp.Result result45 = compiler12.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList23, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, compilerOptions44);
        com.google.javascript.jscomp.Result result46 = compiler0.compileModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList7, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList10, compilerOptions44);
        com.google.javascript.jscomp.JSError[] jSErrorArray47 = compiler0.getMessages();
        java.lang.String str50 = compiler0.getSourceLine("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph51 = compiler0.computeCFG();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSModuleArray9);
        org.junit.Assert.assertArrayEquals(jSModuleArray9, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + languageMode21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode21.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray25, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(recentChange42);
        org.junit.Assert.assertNotNull(compilerOptions44);
        org.junit.Assert.assertNotNull(result45);
        org.junit.Assert.assertNotNull(result46);
        org.junit.Assert.assertNotNull(jSErrorArray47);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node2 = null;
        compiler0.jsRoot = node2;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter4 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups6 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node8 = compiler0.jsRoot;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(diagnosticGroups6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(compilerOptions9);
    }
}

