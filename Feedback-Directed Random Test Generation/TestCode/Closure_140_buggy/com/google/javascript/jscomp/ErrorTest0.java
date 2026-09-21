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
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.getCodingConvention();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet7, (java.util.Set<java.lang.String>) strSet12, (java.util.Set<java.lang.String>) strSet16, (java.util.Set<java.lang.String>) strSet20);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler4.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler4.acquireSymbolTable();
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        compiler0.setUnnormalized();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isInliningForbidden();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        compiler0.setNormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.toSource();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("", 3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isInliningForbidden();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result4 = compiler0.getResult();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler4.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler4.acquireSymbolTable();
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) symbolTable7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.hasErrors();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        compiler0.setUnnormalized();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.parseInputs();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer8 = compiler0.newTracer("");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        compiler0.setNormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph4 = compiler0.computeCFG();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler0.acquireSymbolTable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config5 = compiler0.getParserConfig();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        compiler0.setUnnormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        compiler0.setUnnormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = compiler0.toSourceArray();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        compiler0.setUnnormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isInliningForbidden();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("hi!hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet6, (java.util.Set<java.lang.String>) strSet11, (java.util.Set<java.lang.String>) strSet17, (java.util.Set<java.lang.String>) strSet23);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getInput("hi!hi!");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap1 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        java.lang.String str4 = compiler0.getAstDotGraph();
        compiler0.setUnnormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.hasErrors();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph4 = compiler0.computeCFG();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ScopeCreator scopeCreator5 = compiler0.getScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseInputs();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer5 = compiler0.newTracer("hi!hi!");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        boolean boolean5 = compiler0.isIdeMode();
        com.google.javascript.rhino.Node node8 = compiler0.parseSyntheticCode("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = compiler0.parseSyntheticCode("hi!hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config5 = compiler0.getParserConfig();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler0.getSourceLine("hi!", 10);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        compiler0.setUnnormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isInliningForbidden();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        java.lang.String str2 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!hi!", "hi!", "hi!hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.stripCode((java.util.Set<java.lang.String>) strSet5, (java.util.Set<java.lang.String>) strSet11, (java.util.Set<java.lang.String>) strSet15, (java.util.Set<java.lang.String>) strSet21);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getModuleGraph();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node4 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.hasErrors();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result4 = compiler0.getResult();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        compiler0.setNormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        java.lang.String str4 = compiler0.getAstDotGraph();
        compiler0.setUnnormalized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.acquireSymbolTable();
        com.google.javascript.jscomp.TypeValidator typeValidator4 = compiler0.getTypeValidator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph5 = compiler0.computeCFG();
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getModuleGraph();
        com.google.javascript.rhino.Node node6 = compiler0.externsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = compiler0.getErrorCount();
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        boolean boolean2 = compiler0.precheck();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node4 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("hi!hi!");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = compiler0.tracker;
        compiler0.setUnnormalized();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        boolean boolean3 = compiler0.precheck();
        java.lang.String str4 = compiler0.getAstDotGraph();
        compiler0.setUnnormalized();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }
}

