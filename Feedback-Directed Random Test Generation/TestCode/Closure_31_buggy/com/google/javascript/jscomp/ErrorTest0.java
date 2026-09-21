package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable1 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray1 = compiler0.getMessages();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node2 = compiler0.loadLibraryCode("");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsInOrder();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "[{SyntheticVarsDeclar}]" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "[singleton]", "{SyntheticVarsDeclar}", "{SyntheticVarsDeclar}", "[singleton]" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "[{SyntheticVarsDeclar}]" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "[singleton]", "hi!", "[singleton]" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet7, (java.util.Set<java.lang.String>) strSet15, (java.util.Set<java.lang.String>) strSet21, (java.util.Set<java.lang.String>) strSet28);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getErrorCount();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph2 = compiler0.computeCFG();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer4 = compiler0.newTracer("hi![singleton]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.parseInputs();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler0.newExternInput("[]");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isIdeMode();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[singleton]");
        compiler0.startPass("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = compiler0.parseInputs();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[singleton]");
        compiler0.startPass("");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getInputsInOrder();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("[{SyntheticVarsDeclar}]", "hi!");
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[singleton]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }
}

