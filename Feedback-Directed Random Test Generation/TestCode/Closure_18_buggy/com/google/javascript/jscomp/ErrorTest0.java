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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile2 = compiler0.getSourceFileByName("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer3 = compiler0.newTracer("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput1 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray1 = compiler0.getErrors();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = compiler0.toSourceArray();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph2 = compiler0.computeCFG();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node2 = compiler0.loadLibraryCode("");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.loadLibraryCode("hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        java.lang.String[] strArray5 = new java.lang.String[] { "[singleton]", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "[singleton]", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet6, (java.util.Set<java.lang.String>) strSet10, (java.util.Set<java.lang.String>) strSet14, (java.util.Set<java.lang.String>) strSet20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.hasErrors();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile4 = compiler0.getSourceFileByName("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = compiler0.getWarningCount();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.isIdeMode();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isInliningForbidden();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isIdeMode();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput2 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = compiler0.toSourceArray();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("Unversioned directory");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isIdeMode();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("Unversioned directory");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        java.lang.String[] strArray5 = new java.lang.String[] { "Unversioned directory", "Unversioned directory", "[singleton]" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "Unversioned directory", "", "Unversioned directory", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "[singleton]", "[singleton]", "[singleton]", "2569/09/20 21:43" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "2569/09/20 21:43" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet6, (java.util.Set<java.lang.String>) strSet13, (java.util.Set<java.lang.String>) strSet21, (java.util.Set<java.lang.String>) strSet25);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("hi!", (int) (byte) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config2 = compiler0.getParserConfig();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getInputsInOrder();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = compiler0.loadLibraryCode("2569/09/20 21:43");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("[singleton]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = compiler0.parseSyntheticCode("hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.newCompilerOptions();
        compiler5.initOptions(compilerOptions11);
        compiler5.setProgress((double) (byte) -1);
        int int15 = compiler5.getErrorCount();
        com.google.javascript.rhino.Node node17 = compiler5.parseTestCode("hi!");
        compiler0.externsRoot = node17;
        java.lang.String[] strArray21 = new java.lang.String[] { "Unversioned directory", "[[singleton]]" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "2569/09/20 21:43", "hi!", "2569/09/20 21:43", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "[singleton]", "2569/09/20 21:43", "[[singleton]]", "Unversioned directory" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "2569/09/20 21:43" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet22, (java.util.Set<java.lang.String>) strSet30, (java.util.Set<java.lang.String>) strSet39, (java.util.Set<java.lang.String>) strSet43);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getExternsInOrder();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("", (int) ' ');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config6 = compiler0.getParserConfig();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result3 = compiler0.getResult();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = compiler0.parseInputs();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable15 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope15 = compiler14.getTopScope();
        com.google.javascript.jscomp.Scope scope16 = compiler14.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler14.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler14.getPropertyMap();
        com.google.javascript.jscomp.Scope scope19 = compiler14.getTopScope();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compiler20.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler20.recentChange;
        compiler14.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler7.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        compiler12.setProgress((double) (byte) -1);
        int int22 = compiler12.getErrorCount();
        com.google.javascript.rhino.Node node24 = compiler12.parseTestCode("hi!");
        compiler7.externsRoot = node24;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.prepareAst(node24);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler0.getCssRenamingMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.parsing.Config config11 = compiler0.getParserConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile13 = compiler0.getSourceFileByName("2569/09/20 21:43");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compiler6.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler6.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange8);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.Scope scope12 = compiler10.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler10.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.newCompilerOptions();
        compiler15.initOptions(compilerOptions21);
        compiler15.setProgress((double) (byte) -1);
        int int25 = compiler15.getErrorCount();
        com.google.javascript.rhino.Node node27 = compiler15.parseTestCode("hi!");
        compiler10.externsRoot = node27;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.prepareAst(node27);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler0.getMessages();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph4 = compiler0.computeCFG();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.parsing.Config config11 = compiler0.getParserConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("[[2569/09/20 21:43]]", (int) (short) 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler13.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler13.newCompilerOptions();
        compiler9.initOptions(compilerOptions15);
        compiler9.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        com.google.javascript.jscomp.Result result29 = compiler9.compile(jSSourceFileArray19, jSModuleArray20, compilerOptions27);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope31 = compiler30.getTopScope();
        com.google.javascript.jscomp.Scope scope32 = compiler30.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler30.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.newCompilerOptions();
        compiler30.initOptions(compilerOptions36);
        compiler30.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope43 = compiler42.getTopScope();
        com.google.javascript.jscomp.Scope scope44 = compiler42.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap45 = compiler42.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap47 = compiler46.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler46.newCompilerOptions();
        compiler42.initOptions(compilerOptions48);
        com.google.javascript.jscomp.Result result50 = compiler30.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions48);
        com.google.javascript.jscomp.JSModule[] jSModuleArray51 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope53 = compiler52.getTopScope();
        com.google.javascript.jscomp.Scope scope54 = compiler52.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap55 = compiler52.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler52.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler57.newCompilerOptions();
        compiler52.initOptions(compilerOptions59);
        compiler9.init(jSSourceFileArray40, jSModuleArray51, compilerOptions59);
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope63 = compiler62.getTopScope();
        com.google.javascript.jscomp.Scope scope64 = compiler62.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap65 = compiler62.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap67 = compiler66.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler66.newCompilerOptions();
        compiler62.initOptions(compilerOptions68);
        compiler9.options = compilerOptions68;
        compiler0.options = compilerOptions68;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph72 = compiler0.computeCFG();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Result result12 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("[[singleton]]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Scope scope8 = compiler3.getTopScope();
        compiler3.initCompilerOptionsIfTesting();
        compiler3.startPass("");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        compiler12.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        com.google.javascript.jscomp.Result result32 = compiler12.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        compiler33.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope46 = compiler45.getTopScope();
        com.google.javascript.jscomp.Scope scope47 = compiler45.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler45.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap50 = compiler49.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.newCompilerOptions();
        compiler45.initOptions(compilerOptions51);
        com.google.javascript.jscomp.Result result53 = compiler33.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions51);
        com.google.javascript.jscomp.JSModule[] jSModuleArray54 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope56 = compiler55.getTopScope();
        com.google.javascript.jscomp.Scope scope57 = compiler55.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap58 = compiler55.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler55.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap61 = compiler60.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler60.newCompilerOptions();
        compiler55.initOptions(compilerOptions62);
        compiler12.init(jSSourceFileArray43, jSModuleArray54, compilerOptions62);
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope66 = compiler65.getTopScope();
        com.google.javascript.jscomp.Scope scope67 = compiler65.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap68 = compiler65.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap70 = compiler69.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = compiler69.newCompilerOptions();
        compiler65.initOptions(compilerOptions71);
        compiler12.options = compilerOptions71;
        compiler3.options = compilerOptions71;
        compiler0.options = compilerOptions71;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean76 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compiler34.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler34.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = compiler0.getWarningCount();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compiler6.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler6.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("[2569/09/20 21:43]", (int) ' ');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph53 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph54 = compiler0.getModuleGraph();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList55 = compiler0.getExternsInOrder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope9 = compiler8.getTopScope();
        com.google.javascript.jscomp.Scope scope10 = compiler8.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler8.getVariableMap();
        compiler8.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope14 = compiler8.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler8.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput17 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.newCompilerOptions();
        compiler17.initOptions(compilerOptions23);
        compiler17.setProgress((double) (byte) -1);
        int int27 = compiler17.getErrorCount();
        com.google.javascript.rhino.Node node29 = compiler17.parseTestCode("hi!");
        compiler12.externsRoot = node29;
        java.lang.String str31 = compiler0.toSource(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput32 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator5 = compiler0.getTypeValidator();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile6 = compiler0.getSourceFileByName("");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope9 = compiler8.getTopScope();
        com.google.javascript.jscomp.Scope scope10 = compiler8.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler8.getVariableMap();
        java.lang.String str12 = compiler8.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler13.getPropertyMap();
        com.google.javascript.jscomp.Scope scope18 = compiler13.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler13.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler13.getErrorManager();
        compiler8.setErrorManager(errorManager20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Scope scope24 = compiler22.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Scope scope27 = compiler22.getTopScope();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compiler28.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange30 = compiler28.recentChange;
        compiler22.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange30);
        compiler8.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange30);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList34 = compiler0.getInputsInOrder();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler10.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        compiler10.setErrorManager(errorManager16);
        compiler0.setErrorManager(errorManager16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph19 = compiler0.computeCFG();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.getOptions();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        int int10 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler0.getInputsInOrder();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        boolean boolean14 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = compiler0.getSourceLine("[{SyntheticVarsDeclar}]", (int) ' ');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsInOrder();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile6 = compiler0.getSourceFileByName("Unversioned directory");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups10 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler0.getExternsInOrder();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = compiler0.parseSyntheticCode("[hi!]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Scope scope8 = compiler3.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig9 = compiler3.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator2 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getWarningCount();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        compiler2.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope8 = compiler2.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Result result12 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph53 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention54 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = compiler0.loadLibraryCode("[hi!]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        compiler0.addToDebugLog("[[2569/09/20 21:43]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Scope scope8 = compiler3.getTopScope();
        compiler3.initCompilerOptionsIfTesting();
        compiler3.startPass("");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        compiler12.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        com.google.javascript.jscomp.Result result32 = compiler12.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        compiler33.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope46 = compiler45.getTopScope();
        com.google.javascript.jscomp.Scope scope47 = compiler45.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler45.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap50 = compiler49.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.newCompilerOptions();
        compiler45.initOptions(compilerOptions51);
        com.google.javascript.jscomp.Result result53 = compiler33.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions51);
        com.google.javascript.jscomp.JSModule[] jSModuleArray54 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope56 = compiler55.getTopScope();
        com.google.javascript.jscomp.Scope scope57 = compiler55.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap58 = compiler55.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler55.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap61 = compiler60.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler60.newCompilerOptions();
        compiler55.initOptions(compilerOptions62);
        compiler12.init(jSSourceFileArray43, jSModuleArray54, compilerOptions62);
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope66 = compiler65.getTopScope();
        com.google.javascript.jscomp.Scope scope67 = compiler65.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap68 = compiler65.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap70 = compiler69.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = compiler69.newCompilerOptions();
        compiler65.initOptions(compilerOptions71);
        compiler12.options = compilerOptions71;
        compiler3.options = compilerOptions71;
        compiler0.options = compilerOptions71;
        com.google.javascript.jscomp.TypeValidator typeValidator76 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.VariableMap variableMap77 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = compiler0.loadLibraryCode("[[hi!]]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseInputs();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder7 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        codeBuilder7.reset();
        int int9 = codeBuilder7.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = codeBuilder7.append("Unversioned directory");
        int int12 = codeBuilder11.getLength();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope15 = compiler14.getTopScope();
        com.google.javascript.jscomp.Scope scope16 = compiler14.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler14.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler14.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope20 = compiler19.getTopScope();
        com.google.javascript.jscomp.Scope scope21 = compiler19.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler19.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler23.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler23.newCompilerOptions();
        compiler19.initOptions(compilerOptions25);
        compiler19.setProgress((double) (byte) -1);
        int int29 = compiler19.getErrorCount();
        com.google.javascript.rhino.Node node31 = compiler19.parseTestCode("hi!");
        compiler14.externsRoot = node31;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.toSource(codeBuilder11, 1, node31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph3 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler3.initOptions(compilerOptions9);
        compiler3.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.newCompilerOptions();
        compiler15.initOptions(compilerOptions21);
        com.google.javascript.jscomp.Result result23 = compiler3.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        compiler24.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray35 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope37 = compiler36.getTopScope();
        com.google.javascript.jscomp.Scope scope38 = compiler36.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler36.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler40.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.newCompilerOptions();
        compiler36.initOptions(compilerOptions42);
        com.google.javascript.jscomp.Result result44 = compiler24.compile(jSSourceFileArray34, jSModuleArray35, compilerOptions42);
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler46.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap52 = compiler51.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.newCompilerOptions();
        compiler46.initOptions(compilerOptions53);
        compiler3.init(jSSourceFileArray34, jSModuleArray45, compilerOptions53);
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope58 = compiler57.getTopScope();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap60 = compiler59.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler59.newCompilerOptions();
        compiler57.options = compilerOptions61;
        com.google.javascript.jscomp.Result result63 = compiler0.compile(jSSourceFileArray34, jSModuleArray56, compilerOptions61);
        boolean boolean64 = compiler0.hasErrors();
        java.lang.String[] strArray65 = compiler0.toSourceArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        boolean boolean14 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile17 = compiler0.getSourceFileByName("[[hi!]]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("[singleton]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getInputsInOrder();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = compiler0.ensureLibraryInjected("[[2569/09/20 21:43]]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("{SyntheticVarsDeclar}", (int) (short) 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler10.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        compiler10.setErrorManager(errorManager16);
        compiler0.setErrorManager(errorManager16);
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile21 = compiler0.getSourceFileByName("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compiler34.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler34.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable39 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph53 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.CodingConvention codingConvention54 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph55 = compiler0.computeCFG();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler0.getTypeValidator();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler10.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        compiler10.setErrorManager(errorManager16);
        compiler0.setErrorManager(errorManager16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = compiler0.ensureLibraryInjected("[singleton]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = compiler0.ensureLibraryInjected("[hi!]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = compiler0.getSourceLine("[[2569/09/20 21:43]]", (int) '4');
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        int int10 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph11 = compiler0.computeCFG();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile6 = compiler0.getSourceFileByName("2569/09/20 21:43");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList34 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode35 = compiler0.languageMode();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.rhino.Node node44 = compiler21.parseSyntheticCode("hi!", "Unversioned directory");
        compiler0.externAndJsRoot = node44;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = compiler0.loadLibraryCode("[[hi!]]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.newCompilerOptions();
        com.google.javascript.rhino.Node node6 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isInliningForbidden();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.newCompilerOptions();
        compiler5.initOptions(compilerOptions11);
        compiler5.setProgress((double) (byte) -1);
        int int15 = compiler5.getErrorCount();
        com.google.javascript.rhino.Node node17 = compiler5.parseTestCode("hi!");
        compiler0.externsRoot = node17;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder19 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        codeBuilder19.reset();
        int int21 = codeBuilder19.getColumnIndex();
        boolean boolean23 = codeBuilder19.endsWith("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler29.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.newCompilerOptions();
        compiler25.initOptions(compilerOptions31);
        compiler25.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray36 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap42 = compiler41.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.newCompilerOptions();
        compiler37.initOptions(compilerOptions43);
        com.google.javascript.jscomp.Result result45 = compiler25.compile(jSSourceFileArray35, jSModuleArray36, compilerOptions43);
        com.google.javascript.jscomp.PassConfig passConfig46 = compiler25.getPassConfig();
        com.google.javascript.rhino.Node node49 = compiler25.parseSyntheticCode("Unversioned directory", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.toSource(codeBuilder19, 100, node49);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.common.base.Supplier<java.lang.String> strSupplier21 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput23 = compiler0.newExternInput("[[[singleton]]]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator5 = compiler0.getTypeValidator();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region13 = compiler0.getSourceRegion("", (int) '#');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.getCodingConvention();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Scope scope8 = compiler3.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig9 = compiler3.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager10);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler12.getSourceMap();
        compiler12.addToDebugLog("[singleton]");
        compiler12.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope19 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler20.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.newCompilerOptions();
        compiler18.options = compilerOptions22;
        compiler12.initOptions(compilerOptions22);
        com.google.javascript.rhino.Node node25 = compiler12.externAndJsRoot;
        com.google.javascript.rhino.Node node26 = compiler12.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = compiler12.tracker;
        compiler12.startPass("[[singleton]]");
        compiler12.addToDebugLog("[2569/09/20 21:43]");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState32 = compiler12.getState();
        compiler0.setState(intermediateState32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap34 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isInliningForbidden();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.lang.String[] strArray14 = new java.lang.String[] { "[[hi!]]", "[hi!]", "[singleton]", "2569/09/20 21:43", "[{SyntheticVarsDeclar}]", "[[hi!]]", "hi!", "[{SyntheticVarsDeclar}]", "{SyntheticVarsDeclar}", "[[singleton]]", "[singleton]", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.lang.String[] strArray27 = new java.lang.String[] { "[singleton]", "2569/09/20 21:43", "hi!", "", "[[[singleton]]]", "[{SyntheticVarsDeclar}]", "hi!", "2569/09/20 21:43", "", "[singleton]" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.lang.String[] strArray35 = new java.lang.String[] { "[[2569/09/20 21:43]]", "[[2569/09/20 21:43]]", "2569/09/20 21:43", "[hi!]", "[2569/09/20 21:43]" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.lang.String[] strArray46 = new java.lang.String[] { "[2569/09/20 21:43]", "[2569/09/20 21:43]", "{SyntheticVarsDeclar}", "", "[[2569/09/20 21:43]]", "2569/09/20 21:43", "[singleton]", "[[2569/09/20 21:43]]" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stripCode((java.util.Set<java.lang.String>) strSet15, (java.util.Set<java.lang.String>) strSet28, (java.util.Set<java.lang.String>) strSet36, (java.util.Set<java.lang.String>) strSet47);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compiler6.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler6.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getMessages();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = compiler0.getWarningCount();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope12 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler11.getVariableMap();
        java.lang.String str15 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compiler16.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope19 = compiler18.getTopScope();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler18.getVariableMap();
        java.lang.String str22 = compiler18.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        com.google.javascript.jscomp.Scope scope25 = compiler23.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler23.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler23.getPropertyMap();
        com.google.javascript.jscomp.Scope scope28 = compiler23.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler23.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler23.getErrorManager();
        compiler18.setErrorManager(errorManager30);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope33 = compiler32.getTopScope();
        com.google.javascript.jscomp.Scope scope34 = compiler32.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler32.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler32.getPropertyMap();
        com.google.javascript.jscomp.Scope scope37 = compiler32.getTopScope();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compiler38.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler38.recentChange;
        compiler32.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = compiler0.parseInputs();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.getOptions();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap4 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler0.getTypeValidator();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph12 = compiler0.computeCFG();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.Scope scope11 = compiler6.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler6.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("[2569/09/20 21:43]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.Scope scope11 = compiler6.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler6.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        compiler16.addToDebugLog("[singleton]");
        compiler16.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.newCompilerOptions();
        compiler22.options = compilerOptions26;
        compiler16.initOptions(compilerOptions26);
        com.google.javascript.rhino.Node node29 = compiler16.externAndJsRoot;
        com.google.javascript.rhino.Node node30 = compiler16.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker31 = compiler16.tracker;
        compiler16.startPass("[[singleton]]");
        compiler16.addToDebugLog("[2569/09/20 21:43]");
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope37 = compiler36.getTopScope();
        com.google.javascript.jscomp.Scope scope38 = compiler36.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler36.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler40.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.newCompilerOptions();
        compiler36.initOptions(compilerOptions42);
        compiler36.setProgress((double) (byte) -1);
        int int46 = compiler36.getErrorCount();
        com.google.javascript.rhino.Node node48 = compiler36.parseTestCode("hi!");
        compiler16.externAndJsRoot = node48;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.prepareAst(node48);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler17.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.newCompilerOptions();
        compiler13.initOptions(compilerOptions19);
        compiler13.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray24 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler29.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.newCompilerOptions();
        compiler25.initOptions(compilerOptions31);
        com.google.javascript.jscomp.Result result33 = compiler13.compile(jSSourceFileArray23, jSModuleArray24, compilerOptions31);
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope35 = compiler34.getTopScope();
        com.google.javascript.jscomp.Scope scope36 = compiler34.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler34.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler38.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.newCompilerOptions();
        compiler34.initOptions(compilerOptions40);
        compiler34.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray44 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler50.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.newCompilerOptions();
        compiler46.initOptions(compilerOptions52);
        com.google.javascript.jscomp.Result result54 = compiler34.compile(jSSourceFileArray44, jSModuleArray45, compilerOptions52);
        com.google.javascript.jscomp.JSModule[] jSModuleArray55 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope57 = compiler56.getTopScope();
        com.google.javascript.jscomp.Scope scope58 = compiler56.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler56.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler56.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.newCompilerOptions();
        compiler56.initOptions(compilerOptions63);
        compiler13.init(jSSourceFileArray44, jSModuleArray55, compilerOptions63);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope67 = compiler66.getTopScope();
        com.google.javascript.jscomp.Scope scope68 = compiler66.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler66.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.newCompilerOptions();
        compiler66.initOptions(compilerOptions72);
        compiler13.options = compilerOptions72;
        compiler4.options = compilerOptions72;
        compiler0.options = compilerOptions72;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result77 = compiler0.getResult();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler3.initOptions(compilerOptions9);
        compiler3.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.newCompilerOptions();
        compiler15.initOptions(compilerOptions21);
        com.google.javascript.jscomp.Result result23 = compiler3.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        compiler24.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray35 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope37 = compiler36.getTopScope();
        com.google.javascript.jscomp.Scope scope38 = compiler36.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler36.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler40.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.newCompilerOptions();
        compiler36.initOptions(compilerOptions42);
        com.google.javascript.jscomp.Result result44 = compiler24.compile(jSSourceFileArray34, jSModuleArray35, compilerOptions42);
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler46.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap52 = compiler51.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.newCompilerOptions();
        compiler46.initOptions(compilerOptions53);
        compiler3.init(jSSourceFileArray34, jSModuleArray45, compilerOptions53);
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope58 = compiler57.getTopScope();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap60 = compiler59.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler59.newCompilerOptions();
        compiler57.options = compilerOptions61;
        com.google.javascript.jscomp.Result result63 = compiler0.compile(jSSourceFileArray34, jSModuleArray56, compilerOptions61);
        boolean boolean64 = compiler0.hasErrors();
        java.lang.String[] strArray65 = compiler0.toSourceArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = compiler0.ensureLibraryInjected("hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.toSource();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope12 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler11.getVariableMap();
        java.lang.String str15 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler16.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler16.getErrorManager();
        compiler11.setErrorManager(errorManager23);
        com.google.javascript.jscomp.Result result25 = compiler11.getResult();
        int int26 = compiler11.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope30 = compiler29.getTopScope();
        com.google.javascript.jscomp.Scope scope31 = compiler29.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler29.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler29.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.newCompilerOptions();
        compiler29.initOptions(compilerOptions36);
        compiler27.initOptions(compilerOptions36);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope40 = compiler39.getTopScope();
        com.google.javascript.jscomp.Scope scope41 = compiler39.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap42 = compiler39.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig43 = compiler39.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope45 = compiler44.getTopScope();
        com.google.javascript.jscomp.Scope scope46 = compiler44.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler44.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler44.initOptions(compilerOptions50);
        compiler44.setProgress((double) (byte) -1);
        int int54 = compiler44.getErrorCount();
        com.google.javascript.rhino.Node node56 = compiler44.parseTestCode("hi!");
        compiler39.externsRoot = node56;
        java.lang.String str58 = compiler27.toSource(node56);
        compiler11.externsRoot = node56;
        compiler0.externAndJsRoot = node56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler2.newCompilerOptions();
        compiler0.options = compilerOptions4;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseTestCode("2569/09/20 21:43");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Scope scope8 = compiler3.getTopScope();
        compiler3.initCompilerOptionsIfTesting();
        compiler3.startPass("");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        compiler12.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        com.google.javascript.jscomp.Result result32 = compiler12.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        compiler33.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope46 = compiler45.getTopScope();
        com.google.javascript.jscomp.Scope scope47 = compiler45.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler45.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap50 = compiler49.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.newCompilerOptions();
        compiler45.initOptions(compilerOptions51);
        com.google.javascript.jscomp.Result result53 = compiler33.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions51);
        com.google.javascript.jscomp.JSModule[] jSModuleArray54 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope56 = compiler55.getTopScope();
        com.google.javascript.jscomp.Scope scope57 = compiler55.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap58 = compiler55.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler55.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap61 = compiler60.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler60.newCompilerOptions();
        compiler55.initOptions(compilerOptions62);
        compiler12.init(jSSourceFileArray43, jSModuleArray54, compilerOptions62);
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope66 = compiler65.getTopScope();
        com.google.javascript.jscomp.Scope scope67 = compiler65.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap68 = compiler65.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap70 = compiler69.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = compiler69.newCompilerOptions();
        compiler65.initOptions(compilerOptions71);
        compiler12.options = compilerOptions71;
        compiler3.options = compilerOptions71;
        compiler0.options = compilerOptions71;
        com.google.javascript.jscomp.TypeValidator typeValidator76 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.VariableMap variableMap77 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput78 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig15 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node16 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = compiler0.hasErrors();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer19 = compiler0.newTracer("[[[singleton]]]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.newCompilerOptions();
        compiler0.initOptions(compilerOptions9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = compiler0.parseSyntheticCode("[singleton]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseSyntheticCode("2569/09/20 21:43", "[2569/09/20 21:43]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler10.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler13.getPropertyMap();
        com.google.javascript.jscomp.Scope scope18 = compiler13.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler13.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler13.getErrorManager();
        compiler10.setErrorManager(errorManager20);
        compiler0.setErrorManager(errorManager20);
        compiler0.setProgress((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput26 = compiler0.newExternInput("[[singleton]]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseSyntheticCode("[[2569/09/20 21:43]]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.newCompilerOptions();
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        com.google.javascript.jscomp.TypeValidator typeValidator12 = compiler0.getTypeValidator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph13 = compiler0.computeCFG();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = compiler0.getWarningCount();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope15 = compiler14.getTopScope();
        com.google.javascript.jscomp.Scope scope16 = compiler14.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler14.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler14.getPropertyMap();
        com.google.javascript.jscomp.Scope scope19 = compiler14.getTopScope();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compiler20.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler20.recentChange;
        compiler14.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = compiler0.loadLibraryCode("Unversioned directory");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler4.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler0.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator9 = compiler8.getTypeValidator();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile4 = compiler0.getSourceFileByName("[2569/09/20 21:43]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler4.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        compiler0.setErrorManager(errorManager6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = compiler8.ensureLibraryInjected("2569/09/20 21:43");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = compiler0.toSourceArray();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = compiler5.toSourceArray();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler0.newCompilerOptions();
        com.google.javascript.rhino.Node node13 = compiler0.parseTestCode("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        boolean boolean7 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseInputs();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.getOptions();
        compiler4.resetUniqueNameId();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler4.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("[{SyntheticVarsDeclar}]", (int) '#');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.isIdeMode();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsInOrder();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.Scope scope20 = compiler15.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler15.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        com.google.javascript.jscomp.Scope scope25 = compiler23.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler23.getVariableMap();
        java.lang.String str27 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler28.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler28.getErrorManager();
        compiler23.setErrorManager(errorManager35);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler37.getPropertyMap();
        com.google.javascript.jscomp.Scope scope42 = compiler37.getTopScope();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = compiler43.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler43.recentChange;
        compiler37.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler23.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler15.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope51 = compiler50.getTopScope();
        com.google.javascript.jscomp.Scope scope52 = compiler50.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap53 = compiler50.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap54 = compiler50.getPropertyMap();
        com.google.javascript.jscomp.Scope scope55 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        compiler50.startPass("");
        boolean boolean59 = compiler50.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler50.getPassConfig();
        boolean boolean61 = compiler50.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState62 = compiler50.getState();
        compiler0.setState(intermediateState62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = compiler0.loadLibraryCode("Unversioned directory");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler8.optimize();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList34 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = compiler0.parseSyntheticCode("[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph53 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph54 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph55 = compiler0.computeCFG();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile7 = compiler0.getSourceFileByName("");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile4 = compiler0.getSourceFileByName("[[singleton]]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        boolean boolean13 = compiler4.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler4.getPassConfig();
        int int15 = compiler4.getWarningCount();
        com.google.javascript.rhino.Node node17 = compiler4.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler4.options;
        compiler0.options = compilerOptions18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        boolean boolean6 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope11 = compiler10.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler10.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler14.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        compiler10.setErrorManager(errorManager16);
        compiler0.setErrorManager(errorManager16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap19 = compiler0.getInputsById();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        compiler0.addToDebugLog("[[2569/09/20 21:43]]");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.Scope scope20 = compiler15.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler15.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        com.google.javascript.jscomp.Scope scope25 = compiler23.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler23.getVariableMap();
        java.lang.String str27 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler28.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler28.getErrorManager();
        compiler23.setErrorManager(errorManager35);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler37.getPropertyMap();
        com.google.javascript.jscomp.Scope scope42 = compiler37.getTopScope();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = compiler43.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler43.recentChange;
        compiler37.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler23.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler15.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler50.getSourceMap();
        com.google.javascript.rhino.Node node52 = compiler50.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope54 = compiler53.getTopScope();
        com.google.javascript.jscomp.Scope scope55 = compiler53.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler53.getVariableMap();
        java.lang.String str57 = compiler53.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope59 = compiler58.getTopScope();
        com.google.javascript.jscomp.Scope scope60 = compiler58.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap61 = compiler58.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap62 = compiler58.getPropertyMap();
        com.google.javascript.jscomp.Scope scope63 = compiler58.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig64 = compiler58.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler58.getErrorManager();
        compiler53.setErrorManager(errorManager65);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope68 = compiler67.getTopScope();
        com.google.javascript.jscomp.Scope scope69 = compiler67.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap70 = compiler67.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap71 = compiler67.getPropertyMap();
        com.google.javascript.jscomp.Scope scope72 = compiler67.getTopScope();
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter74 = compiler73.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange75 = compiler73.recentChange;
        compiler67.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange75);
        compiler53.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange75);
        compiler50.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange75);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap80 = compiler0.getInputsById();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = compiler0.toSource();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        boolean boolean3 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.Scope scope20 = compiler15.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler15.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        com.google.javascript.jscomp.Scope scope25 = compiler23.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler23.getVariableMap();
        java.lang.String str27 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler28.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler28.getErrorManager();
        compiler23.setErrorManager(errorManager35);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler37.getPropertyMap();
        com.google.javascript.jscomp.Scope scope42 = compiler37.getTopScope();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = compiler43.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler43.recentChange;
        compiler37.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler23.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler15.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope51 = compiler50.getTopScope();
        com.google.javascript.jscomp.Scope scope52 = compiler50.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap53 = compiler50.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap54 = compiler50.getPropertyMap();
        com.google.javascript.jscomp.Scope scope55 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        compiler50.startPass("");
        boolean boolean59 = compiler50.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler50.getPassConfig();
        boolean boolean61 = compiler50.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState62 = compiler50.getState();
        compiler0.setState(intermediateState62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode64 = compiler0.languageMode();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope12 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler11.getVariableMap();
        java.lang.String str15 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compiler16.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope19 = compiler18.getTopScope();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler18.getVariableMap();
        java.lang.String str22 = compiler18.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        com.google.javascript.jscomp.Scope scope25 = compiler23.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler23.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler23.getPropertyMap();
        com.google.javascript.jscomp.Scope scope28 = compiler23.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler23.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler23.getErrorManager();
        compiler18.setErrorManager(errorManager30);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope33 = compiler32.getTopScope();
        com.google.javascript.jscomp.Scope scope34 = compiler32.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler32.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler32.getPropertyMap();
        com.google.javascript.jscomp.Scope scope37 = compiler32.getTopScope();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compiler38.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange40 = compiler38.recentChange;
        compiler32.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = compiler0.parseInputs();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler17.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.newCompilerOptions();
        compiler13.initOptions(compilerOptions19);
        compiler13.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray24 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler29.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.newCompilerOptions();
        compiler25.initOptions(compilerOptions31);
        com.google.javascript.jscomp.Result result33 = compiler13.compile(jSSourceFileArray23, jSModuleArray24, compilerOptions31);
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope35 = compiler34.getTopScope();
        com.google.javascript.jscomp.Scope scope36 = compiler34.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler34.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler38.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.newCompilerOptions();
        compiler34.initOptions(compilerOptions40);
        compiler34.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray44 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler50.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.newCompilerOptions();
        compiler46.initOptions(compilerOptions52);
        com.google.javascript.jscomp.Result result54 = compiler34.compile(jSSourceFileArray44, jSModuleArray45, compilerOptions52);
        com.google.javascript.jscomp.JSModule[] jSModuleArray55 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope57 = compiler56.getTopScope();
        com.google.javascript.jscomp.Scope scope58 = compiler56.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler56.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler56.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.newCompilerOptions();
        compiler56.initOptions(compilerOptions63);
        compiler13.init(jSSourceFileArray44, jSModuleArray55, compilerOptions63);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope67 = compiler66.getTopScope();
        com.google.javascript.jscomp.Scope scope68 = compiler66.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler66.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.newCompilerOptions();
        compiler66.initOptions(compilerOptions72);
        compiler13.options = compilerOptions72;
        compiler4.options = compilerOptions72;
        compiler0.options = compilerOptions72;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention78 = compiler0.defaultCodingConvention;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int79 = compiler0.getWarningCount();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node13 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler0.options;
        boolean boolean15 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput17 = compiler0.newExternInput("[singleton]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        compiler0.reportCodeChange();
        boolean boolean21 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = compiler0.parseSyntheticCode("[[[singleton]]]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope21 = compiler20.getTopScope();
        com.google.javascript.jscomp.Scope scope22 = compiler20.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler20.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler24.newCompilerOptions();
        compiler20.initOptions(compilerOptions26);
        compiler20.setProgress((double) (byte) -1);
        int int30 = compiler20.getErrorCount();
        com.google.javascript.rhino.Node node32 = compiler20.parseTestCode("hi!");
        compiler0.externAndJsRoot = node32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList34 = compiler0.getInputsInOrder();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compiler34.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler34.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray39 = compiler0.getWarnings();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        boolean boolean14 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph16 = compiler0.computeCFG();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config7 = compiler0.getParserConfig();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState20 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = compiler0.getSourceLine("[[singleton]]", 42);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange12 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable6 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput53 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.Scope scope20 = compiler15.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler15.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler15.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        com.google.javascript.jscomp.Scope scope25 = compiler23.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler23.getVariableMap();
        java.lang.String str27 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler28.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler28.getErrorManager();
        compiler23.setErrorManager(errorManager35);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler37.getPropertyMap();
        com.google.javascript.jscomp.Scope scope42 = compiler37.getTopScope();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter44 = compiler43.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange45 = compiler43.recentChange;
        compiler37.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler23.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler15.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("[[2569/09/20 21:43]]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        java.lang.String str12 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler17.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.newCompilerOptions();
        compiler13.initOptions(compilerOptions19);
        compiler13.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray24 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler29.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.newCompilerOptions();
        compiler25.initOptions(compilerOptions31);
        com.google.javascript.jscomp.Result result33 = compiler13.compile(jSSourceFileArray23, jSModuleArray24, compilerOptions31);
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope35 = compiler34.getTopScope();
        com.google.javascript.jscomp.Scope scope36 = compiler34.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler34.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler38.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.newCompilerOptions();
        compiler34.initOptions(compilerOptions40);
        compiler34.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray44 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler50.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.newCompilerOptions();
        compiler46.initOptions(compilerOptions52);
        com.google.javascript.jscomp.Result result54 = compiler34.compile(jSSourceFileArray44, jSModuleArray45, compilerOptions52);
        com.google.javascript.jscomp.JSModule[] jSModuleArray55 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope57 = compiler56.getTopScope();
        com.google.javascript.jscomp.Scope scope58 = compiler56.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler56.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler56.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.newCompilerOptions();
        compiler56.initOptions(compilerOptions63);
        compiler13.init(jSSourceFileArray44, jSModuleArray55, compilerOptions63);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope67 = compiler66.getTopScope();
        com.google.javascript.jscomp.Scope scope68 = compiler66.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler66.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.newCompilerOptions();
        compiler66.initOptions(compilerOptions72);
        compiler13.options = compilerOptions72;
        compiler4.options = compilerOptions72;
        compiler0.options = compilerOptions72;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention78 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap80 = compiler79.getSourceMap();
        compiler79.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange83 = compiler79.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph85 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        boolean boolean3 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node4 = compiler0.externsRoot;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.newCompilerOptions();
        compiler5.initOptions(compilerOptions11);
        compiler5.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.newCompilerOptions();
        compiler17.initOptions(compilerOptions23);
        com.google.javascript.jscomp.Result result25 = compiler5.compile(jSSourceFileArray15, jSModuleArray16, compilerOptions23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope27 = compiler26.getTopScope();
        com.google.javascript.jscomp.Scope scope28 = compiler26.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap29 = compiler26.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler30.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler30.newCompilerOptions();
        compiler26.initOptions(compilerOptions32);
        compiler26.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray37 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope39 = compiler38.getTopScope();
        com.google.javascript.jscomp.Scope scope40 = compiler38.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler38.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap43 = compiler42.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler42.newCompilerOptions();
        compiler38.initOptions(compilerOptions44);
        com.google.javascript.jscomp.Result result46 = compiler26.compile(jSSourceFileArray36, jSModuleArray37, compilerOptions44);
        com.google.javascript.jscomp.JSModule[] jSModuleArray47 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope49 = compiler48.getTopScope();
        com.google.javascript.jscomp.Scope scope50 = compiler48.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap51 = compiler48.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap52 = compiler48.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap54 = compiler53.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler53.newCompilerOptions();
        compiler48.initOptions(compilerOptions55);
        compiler5.init(jSSourceFileArray36, jSModuleArray47, compilerOptions55);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph58 = compiler5.getModuleGraph();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph59 = compiler5.getModuleGraph();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList60 = compiler5.getExternsInOrder();
        com.google.javascript.jscomp.Tracer tracer62 = compiler5.newTracer("[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.stopTracer(tracer62, "[[hi!]]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig11 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups12 = compiler9.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler9.getPassConfig();
        compiler8.setPassConfig(passConfig13);
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler8.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = compiler8.hasErrors();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray34 = compiler0.getWarnings();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        boolean boolean13 = compiler4.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler4.getPassConfig();
        int int15 = compiler4.getWarningCount();
        com.google.javascript.rhino.Node node17 = compiler4.parseTestCode("hi!");
        compiler0.externAndJsRoot = node17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode19 = compiler0.languageMode();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = compiler0.parseSyntheticCode("hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler0.getCssRenamingMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList15 = compiler0.getInputsInOrder();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = compiler9.ensureLibraryInjected("[[2569/09/20 21:43]]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph53 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph54 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput55 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result4 = compiler0.getResult();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler0.getTypedScopeCreator();
        boolean boolean12 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseSyntheticCode("2569/09/20 21:43");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node13 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = compiler0.ensureLibraryInjected("[{SyntheticVarsDeclar}]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig15 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node16 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer18 = compiler0.newTracer("{SyntheticVarsDeclar}");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        double double36 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.Scope scope14 = compiler9.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler9.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler9.getErrorManager();
        compiler4.setErrorManager(errorManager16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope19 = compiler18.getTopScope();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler18.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler18.getPropertyMap();
        com.google.javascript.jscomp.Scope scope23 = compiler18.getTopScope();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = compiler24.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler24.recentChange;
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        compiler4.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        compiler3.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable30 = compiler3.buildKnownSymbolTable();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.rhino.Node node10 = compiler8.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope12 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler11.getVariableMap();
        java.lang.String str15 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler16.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler16.getErrorManager();
        compiler11.setErrorManager(errorManager23);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap29 = compiler25.getPropertyMap();
        com.google.javascript.jscomp.Scope scope30 = compiler25.getTopScope();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler31.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler31.recentChange;
        compiler25.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler10.getInputsInOrder();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        codeBuilder5.reset();
        int int7 = codeBuilder5.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder9 = codeBuilder5.append("Unversioned directory");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = codeBuilder5.append("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compiler13.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler20.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler20.newCompilerOptions();
        compiler15.initOptions(compilerOptions22);
        compiler13.initOptions(compilerOptions22);
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler25.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope31 = compiler30.getTopScope();
        com.google.javascript.jscomp.Scope scope32 = compiler30.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler30.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.newCompilerOptions();
        compiler30.initOptions(compilerOptions36);
        compiler30.setProgress((double) (byte) -1);
        int int40 = compiler30.getErrorCount();
        com.google.javascript.rhino.Node node42 = compiler30.parseTestCode("hi!");
        compiler25.externsRoot = node42;
        java.lang.String str44 = compiler13.toSource(node42);
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope46 = compiler45.getTopScope();
        com.google.javascript.jscomp.Scope scope47 = compiler45.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler45.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap50 = compiler49.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler49.newCompilerOptions();
        compiler45.initOptions(compilerOptions51);
        compiler45.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray55 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope58 = compiler57.getTopScope();
        com.google.javascript.jscomp.Scope scope59 = compiler57.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler57.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.newCompilerOptions();
        compiler57.initOptions(compilerOptions63);
        com.google.javascript.jscomp.Result result65 = compiler45.compile(jSSourceFileArray55, jSModuleArray56, compilerOptions63);
        com.google.javascript.rhino.Node node68 = compiler45.parseSyntheticCode("hi!", "Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope70 = compiler69.getTopScope();
        com.google.javascript.jscomp.Scope scope71 = compiler69.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler69.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap74 = compiler73.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions75 = compiler73.newCompilerOptions();
        compiler69.initOptions(compilerOptions75);
        compiler69.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray79 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray80 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope82 = compiler81.getTopScope();
        com.google.javascript.jscomp.Scope scope83 = compiler81.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap84 = compiler81.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler85 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap86 = compiler85.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions87 = compiler85.newCompilerOptions();
        compiler81.initOptions(compilerOptions87);
        com.google.javascript.jscomp.Result result89 = compiler69.compile(jSSourceFileArray79, jSModuleArray80, compilerOptions87);
        com.google.javascript.rhino.Node node92 = compiler69.parseSyntheticCode("hi!", "Unversioned directory");
        boolean boolean93 = compiler13.areNodesEqualForInlining(node68, node92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.toSource(codeBuilder5, (int) (byte) 10, node68);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler0.getCssRenamingMap();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = compiler0.parseSyntheticCode("[[2569/09/20 21:43]]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = compiler3.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler3.parseInputs();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler2.newCompilerOptions();
        compiler0.options = compilerOptions4;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        java.lang.String str7 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile9 = compiler0.getSourceFileByName("[[2569/09/20 21:43]]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("{SyntheticVarsDeclar}");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        compiler2.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope8 = compiler2.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler2.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange9);
        com.google.javascript.rhino.Node node11 = compiler0.externsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler0.getMessages();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        int int11 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node13 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        int int15 = compiler0.getErrorCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getErrorCount();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler2.newCompilerOptions();
        compiler0.options = compilerOptions4;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        java.lang.String str7 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList34 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = compiler0.getTypeRegistry();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler12.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.newCompilerOptions();
        compiler17.initOptions(compilerOptions23);
        compiler17.setProgress((double) (byte) -1);
        int int27 = compiler17.getErrorCount();
        com.google.javascript.rhino.Node node29 = compiler17.parseTestCode("hi!");
        compiler12.externsRoot = node29;
        java.lang.String str31 = compiler0.toSource(node29);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList32 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = compiler0.parseSyntheticCode("[[singleton]]");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler0.getTypedScopeCreator();
        boolean boolean12 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList14 = compiler0.getInputsInOrder();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.getSourceLine("", 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig11 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups12 = compiler9.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler9.getPassConfig();
        compiler8.setPassConfig(passConfig13);
        compiler8.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = compiler8.hasHaltingErrors();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        boolean boolean21 = compiler0.hasErrors();
        compiler0.rebuildInputsFromModules();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager25);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(errorManager25);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler27.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator29 = compiler27.getTypeValidator();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.newCompilerOptions();
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        com.google.javascript.jscomp.TypeValidator typeValidator12 = compiler0.getTypeValidator();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput15 = compiler0.newExternInput("[[[singleton]]]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        boolean boolean21 = compiler0.hasErrors();
        compiler0.rebuildInputsFromModules();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker23 = compiler0.tracker;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput27 = compiler26.getSynthesizedExternsInput();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray1 = compiler0.getWarnings();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config8 = compiler0.getParserConfig();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator10 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler5.removeTryCatchFinally();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("[{SyntheticVarsDeclar}]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.Scope scope14 = compiler9.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler9.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler9.getErrorManager();
        compiler4.setErrorManager(errorManager16);
        com.google.javascript.jscomp.Result result18 = compiler4.getResult();
        int int19 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compiler20.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Scope scope24 = compiler22.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.newCompilerOptions();
        compiler22.initOptions(compilerOptions29);
        compiler20.initOptions(compilerOptions29);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope33 = compiler32.getTopScope();
        com.google.javascript.jscomp.Scope scope34 = compiler32.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler32.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler32.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap42 = compiler41.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.newCompilerOptions();
        compiler37.initOptions(compilerOptions43);
        compiler37.setProgress((double) (byte) -1);
        int int47 = compiler37.getErrorCount();
        com.google.javascript.rhino.Node node49 = compiler37.parseTestCode("hi!");
        compiler32.externsRoot = node49;
        java.lang.String str51 = compiler20.toSource(node49);
        compiler4.externsRoot = node49;
        compiler0.jsRoot = node49;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean54 = compiler0.isInliningForbidden();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler5.getExternsForTesting();
        compiler5.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler5.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.Scope scope14 = compiler9.getTopScope();
        compiler9.initCompilerOptionsIfTesting();
        compiler9.startPass("");
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope19 = compiler18.getTopScope();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler18.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler22.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.newCompilerOptions();
        compiler18.initOptions(compilerOptions24);
        compiler18.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray29 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope31 = compiler30.getTopScope();
        com.google.javascript.jscomp.Scope scope32 = compiler30.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler30.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.newCompilerOptions();
        compiler30.initOptions(compilerOptions36);
        com.google.javascript.jscomp.Result result38 = compiler18.compile(jSSourceFileArray28, jSModuleArray29, compilerOptions36);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope40 = compiler39.getTopScope();
        com.google.javascript.jscomp.Scope scope41 = compiler39.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap42 = compiler39.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap44 = compiler43.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.newCompilerOptions();
        compiler39.initOptions(compilerOptions45);
        compiler39.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray49 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray50 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope52 = compiler51.getTopScope();
        com.google.javascript.jscomp.Scope scope53 = compiler51.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap54 = compiler51.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap56 = compiler55.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler55.newCompilerOptions();
        compiler51.initOptions(compilerOptions57);
        com.google.javascript.jscomp.Result result59 = compiler39.compile(jSSourceFileArray49, jSModuleArray50, compilerOptions57);
        com.google.javascript.jscomp.JSModule[] jSModuleArray60 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope62 = compiler61.getTopScope();
        com.google.javascript.jscomp.Scope scope63 = compiler61.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap64 = compiler61.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap65 = compiler61.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap67 = compiler66.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler66.newCompilerOptions();
        compiler61.initOptions(compilerOptions68);
        compiler18.init(jSSourceFileArray49, jSModuleArray60, compilerOptions68);
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope72 = compiler71.getTopScope();
        com.google.javascript.jscomp.Scope scope73 = compiler71.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap74 = compiler71.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap76 = compiler75.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions77 = compiler75.newCompilerOptions();
        compiler71.initOptions(compilerOptions77);
        compiler18.options = compilerOptions77;
        compiler9.options = compilerOptions77;
        compiler5.options = compilerOptions77;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = compiler5.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention83 = compiler5.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention83;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = compiler0.ensureLibraryInjected("{SyntheticVarsDeclar}");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.newCompilerOptions();
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        com.google.javascript.jscomp.TypeValidator typeValidator12 = compiler0.getTypeValidator();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        int int11 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = compiler0.parseInputs();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.newCompilerOptions();
        compiler5.initOptions(compilerOptions11);
        compiler5.setProgress((double) (byte) -1);
        int int15 = compiler5.getErrorCount();
        com.google.javascript.rhino.Node node17 = compiler5.parseTestCode("hi!");
        compiler0.externsRoot = node17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator19 = compiler0.getTypeValidator();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getExternsForTesting();
        com.google.javascript.rhino.Node node11 = compiler0.externsRoot;
        com.google.javascript.jscomp.Result result12 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        boolean boolean12 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = compiler0.parseSyntheticCode("[[hi!]]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler8.newCompilerOptions();
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        com.google.javascript.jscomp.TypeValidator typeValidator12 = compiler0.getTypeValidator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = compiler0.tracker;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        double double36 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        java.lang.String str6 = compiler2.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.Scope scope12 = compiler7.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler7.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler7.getErrorManager();
        compiler2.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compiler22.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler16.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler2.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.Scope scope33 = compiler28.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compiler34.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler34.recentChange;
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        java.lang.String str41 = compiler0.getSourceLine("[[2569/09/20 21:43]]", (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = compiler0.hasErrors();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.rhino.Node node44 = compiler21.parseSyntheticCode("hi!", "Unversioned directory");
        compiler0.externAndJsRoot = node44;
        com.google.javascript.jscomp.CodingConvention codingConvention46 = compiler0.defaultCodingConvention;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        double double5 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler0.defaultCodingConvention;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region16 = compiler0.getSourceRegion("[]", 10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        com.google.javascript.rhino.Node node11 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        compiler0.addToDebugLog("[2569/09/20 21:43]");
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.rhino.Node node44 = compiler21.parseSyntheticCode("hi!", "Unversioned directory");
        compiler0.externAndJsRoot = node44;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile47 = compiler0.getSourceFileByName("[singleton]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        java.lang.String str21 = compiler17.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Scope scope24 = compiler22.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Scope scope27 = compiler22.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler22.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler22.getErrorManager();
        compiler17.setErrorManager(errorManager29);
        com.google.javascript.jscomp.Result result31 = compiler17.getResult();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope33 = compiler32.getTopScope();
        com.google.javascript.jscomp.Scope scope34 = compiler32.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler32.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler32.getPropertyMap();
        com.google.javascript.jscomp.Scope scope37 = compiler32.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig38 = compiler32.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler32.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope41 = compiler40.getTopScope();
        com.google.javascript.jscomp.Scope scope42 = compiler40.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap43 = compiler40.getVariableMap();
        java.lang.String str44 = compiler40.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope46 = compiler45.getTopScope();
        com.google.javascript.jscomp.Scope scope47 = compiler45.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler45.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler45.getPropertyMap();
        com.google.javascript.jscomp.Scope scope50 = compiler45.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig51 = compiler45.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager52 = compiler45.getErrorManager();
        compiler40.setErrorManager(errorManager52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope55 = compiler54.getTopScope();
        com.google.javascript.jscomp.Scope scope56 = compiler54.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap57 = compiler54.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap58 = compiler54.getPropertyMap();
        com.google.javascript.jscomp.Scope scope59 = compiler54.getTopScope();
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter61 = compiler60.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange62 = compiler60.recentChange;
        compiler54.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange62);
        compiler40.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange62);
        compiler32.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange62);
        compiler17.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange62);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope68 = compiler67.getTopScope();
        com.google.javascript.jscomp.Scope scope69 = compiler67.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap70 = compiler67.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap71 = compiler67.getPropertyMap();
        com.google.javascript.jscomp.Scope scope72 = compiler67.getTopScope();
        compiler67.initCompilerOptionsIfTesting();
        compiler67.startPass("");
        boolean boolean76 = compiler67.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig77 = compiler67.getPassConfig();
        boolean boolean78 = compiler67.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState79 = compiler67.getState();
        compiler17.setState(intermediateState79);
        compiler0.setState(intermediateState79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config82 = compiler0.getParserConfig();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups10 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope12 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler11.getVariableMap();
        java.lang.String str15 = compiler11.getAstDotGraph();
        boolean boolean16 = compiler11.precheck();
        com.google.javascript.rhino.Node node19 = compiler11.parseSyntheticCode("[]", "[]");
        compiler0.externAndJsRoot = node19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList21 = compiler0.getExternsInOrder();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.Scope scope14 = compiler9.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler9.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler9.getErrorManager();
        compiler4.setErrorManager(errorManager16);
        com.google.javascript.jscomp.Result result18 = compiler4.getResult();
        int int19 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compiler20.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Scope scope24 = compiler22.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.newCompilerOptions();
        compiler22.initOptions(compilerOptions29);
        compiler20.initOptions(compilerOptions29);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope33 = compiler32.getTopScope();
        com.google.javascript.jscomp.Scope scope34 = compiler32.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler32.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler32.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap42 = compiler41.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.newCompilerOptions();
        compiler37.initOptions(compilerOptions43);
        compiler37.setProgress((double) (byte) -1);
        int int47 = compiler37.getErrorCount();
        com.google.javascript.rhino.Node node49 = compiler37.parseTestCode("hi!");
        compiler32.externsRoot = node49;
        java.lang.String str51 = compiler20.toSource(node49);
        compiler4.externsRoot = node49;
        compiler0.jsRoot = node49;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result54 = compiler0.getResult();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        boolean boolean14 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator15 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput17 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getErrorCount();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.rhino.Node node2 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Result result11 = compiler0.getResult();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        compiler12.initCompilerOptionsIfTesting();
        compiler12.startPass("");
        boolean boolean21 = compiler12.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler12.getPassConfig();
        int int23 = compiler12.getWarningCount();
        com.google.javascript.rhino.Node node25 = compiler12.parseTestCode("hi!");
        compiler0.jsRoot = node25;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = compiler0.ensureLibraryInjected("");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getExternsForTesting();
        com.google.javascript.rhino.Node node11 = compiler0.externsRoot;
        com.google.javascript.jscomp.Result result12 = compiler0.getResult();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getVariableMap();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = compiler0.isInliningForbidden();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler3.initOptions(compilerOptions10);
        boolean boolean12 = compiler3.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler3.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler3.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler3.newCompilerOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler16.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        int int31 = compiler21.getErrorCount();
        com.google.javascript.rhino.Node node33 = compiler21.parseTestCode("hi!");
        compiler16.externsRoot = node33;
        compiler3.jsRoot = node33;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.prepareAst(node33);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        compiler16.startPass("");
        boolean boolean25 = compiler16.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig26 = compiler16.getPassConfig();
        int int27 = compiler16.getWarningCount();
        com.google.javascript.rhino.Node node29 = compiler16.parseTestCode("hi!");
        compiler0.jsRoot = node29;
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList32 = compiler0.getExternsInOrder();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.parsing.Config config11 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig14 = compiler12.ensureDefaultPassConfig();
        compiler12.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler17.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.newCompilerOptions();
        compiler12.options = compilerOptions19;
        compiler0.initOptions(compilerOptions19);
        double double22 = compiler0.getProgress();
        boolean boolean23 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput24 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getErrorCount();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        compiler0.addToDebugLog("[[2569/09/20 21:43]]");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getExternsForTesting();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        java.lang.String str7 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope9 = compiler8.getTopScope();
        com.google.javascript.jscomp.Scope scope10 = compiler8.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler8.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler8.getPropertyMap();
        com.google.javascript.jscomp.Scope scope13 = compiler8.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler8.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler8.getErrorManager();
        compiler3.setErrorManager(errorManager15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler17.getPropertyMap();
        com.google.javascript.jscomp.Scope scope22 = compiler17.getTopScope();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        compiler17.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        compiler3.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = compiler0.getWarningCount();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getExternsInOrder();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap11 = compiler0.getCssRenamingMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = compiler0.parseSyntheticCode("[[hi!]]", "Unversioned directory");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        java.lang.String str12 = compiler0.getAstDotGraph();
        boolean boolean13 = compiler0.isInliningForbidden();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = compiler0.parseInputs();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compiler5.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope8 = compiler7.getTopScope();
        com.google.javascript.jscomp.Scope scope9 = compiler7.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler7.getVariableMap();
        java.lang.String str11 = compiler7.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.Scope scope17 = compiler12.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler12.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler12.getErrorManager();
        compiler7.setErrorManager(errorManager19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.Scope scope26 = compiler21.getTopScope();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList34 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = compiler0.getWarningCount();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        compiler0.addToDebugLog("[[2569/09/20 21:43]]");
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        java.lang.String str7 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope9 = compiler8.getTopScope();
        com.google.javascript.jscomp.Scope scope10 = compiler8.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler8.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler8.getPropertyMap();
        com.google.javascript.jscomp.Scope scope13 = compiler8.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler8.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler8.getErrorManager();
        compiler3.setErrorManager(errorManager15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler17.getPropertyMap();
        com.google.javascript.jscomp.Scope scope22 = compiler17.getTopScope();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        compiler17.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        compiler3.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange25);
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap31 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler9.newCompilerOptions();
        compiler5.initOptions(compilerOptions11);
        compiler5.setProgress((double) (byte) -1);
        int int15 = compiler5.getErrorCount();
        com.google.javascript.rhino.Node node17 = compiler5.parseTestCode("hi!");
        compiler0.externsRoot = node17;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = compiler0.loadLibraryCode("2569/09/20 21:43");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler0.ensureDefaultPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.precheck();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler2.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler2.newCompilerOptions();
        compiler0.options = compilerOptions4;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler9.getExternsForTesting();
        compiler9.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler9.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = compiler13.getPropertyMap();
        com.google.javascript.jscomp.Scope scope18 = compiler13.getTopScope();
        compiler13.initCompilerOptionsIfTesting();
        compiler13.startPass("");
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Scope scope24 = compiler22.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler26.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler26.newCompilerOptions();
        compiler22.initOptions(compilerOptions28);
        compiler22.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray33 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope35 = compiler34.getTopScope();
        com.google.javascript.jscomp.Scope scope36 = compiler34.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler34.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler38.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.newCompilerOptions();
        compiler34.initOptions(compilerOptions40);
        com.google.javascript.jscomp.Result result42 = compiler22.compile(jSSourceFileArray32, jSModuleArray33, compilerOptions40);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler47.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler47.newCompilerOptions();
        compiler43.initOptions(compilerOptions49);
        compiler43.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray54 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope56 = compiler55.getTopScope();
        com.google.javascript.jscomp.Scope scope57 = compiler55.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap58 = compiler55.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap60 = compiler59.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler59.newCompilerOptions();
        compiler55.initOptions(compilerOptions61);
        com.google.javascript.jscomp.Result result63 = compiler43.compile(jSSourceFileArray53, jSModuleArray54, compilerOptions61);
        com.google.javascript.jscomp.JSModule[] jSModuleArray64 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope66 = compiler65.getTopScope();
        com.google.javascript.jscomp.Scope scope67 = compiler65.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap68 = compiler65.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler65.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.newCompilerOptions();
        compiler65.initOptions(compilerOptions72);
        compiler22.init(jSSourceFileArray53, jSModuleArray64, compilerOptions72);
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope76 = compiler75.getTopScope();
        com.google.javascript.jscomp.Scope scope77 = compiler75.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap78 = compiler75.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap80 = compiler79.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = compiler79.newCompilerOptions();
        compiler75.initOptions(compilerOptions81);
        compiler22.options = compilerOptions81;
        compiler13.options = compilerOptions81;
        compiler9.options = compilerOptions81;
        compiler0.init(jSSourceFileArray7, jSModuleArray8, compilerOptions81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput88 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        boolean boolean6 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph3 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        boolean boolean7 = compiler0.precheck();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        java.lang.String str13 = compiler9.getAstDotGraph();
        boolean boolean14 = compiler9.precheck();
        com.google.javascript.rhino.Node node17 = compiler9.parseSyntheticCode("[]", "[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.prepareAst(node17);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        compiler16.startPass("");
        boolean boolean25 = compiler16.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig26 = compiler16.getPassConfig();
        int int27 = compiler16.getWarningCount();
        com.google.javascript.rhino.Node node29 = compiler16.parseTestCode("hi!");
        compiler0.jsRoot = node29;
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = compiler0.getTypeRegistry();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope6 = compiler5.getTopScope();
        com.google.javascript.jscomp.Scope scope7 = compiler5.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler5.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.Scope scope10 = compiler5.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler5.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager12);
        com.google.javascript.jscomp.Result result14 = compiler0.getResult();
        int int15 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        compiler16.startPass("");
        boolean boolean25 = compiler16.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig26 = compiler16.getPassConfig();
        int int27 = compiler16.getWarningCount();
        com.google.javascript.rhino.Node node29 = compiler16.parseTestCode("hi!");
        compiler0.jsRoot = node29;
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = compiler0.getTypeRegistry();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler3.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile6 = compiler3.getSourceFileByName("[]");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        boolean boolean14 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler0.getErrors();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("", (int) (short) 10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        boolean boolean6 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        compiler0.setHasRegExpGlobalReferences(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("[[[singleton]]]");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        com.google.javascript.jscomp.Scope scope23 = compiler21.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler21.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler25.newCompilerOptions();
        compiler21.initOptions(compilerOptions27);
        compiler21.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray32 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler37.newCompilerOptions();
        compiler33.initOptions(compilerOptions39);
        com.google.javascript.jscomp.Result result41 = compiler21.compile(jSSourceFileArray31, jSModuleArray32, compilerOptions39);
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope44 = compiler43.getTopScope();
        com.google.javascript.jscomp.Scope scope45 = compiler43.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler43.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler43.initOptions(compilerOptions50);
        compiler0.init(jSSourceFileArray31, jSModuleArray42, compilerOptions50);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope54 = compiler53.getTopScope();
        com.google.javascript.jscomp.Scope scope55 = compiler53.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler53.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler57.newCompilerOptions();
        compiler53.initOptions(compilerOptions59);
        compiler0.options = compilerOptions59;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput63 = compiler0.newExternInput("[[2569/09/20 21:43]]");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope9 = compiler8.getTopScope();
        com.google.javascript.jscomp.Scope scope10 = compiler8.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler8.getVariableMap();
        compiler8.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope14 = compiler8.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler8.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange15);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph17 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result18 = compiler0.getResult();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler5.getExternsForTesting();
        compiler5.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler5.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.Scope scope14 = compiler9.getTopScope();
        compiler9.initCompilerOptionsIfTesting();
        compiler9.startPass("");
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope19 = compiler18.getTopScope();
        com.google.javascript.jscomp.Scope scope20 = compiler18.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler18.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler22.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler22.newCompilerOptions();
        compiler18.initOptions(compilerOptions24);
        compiler18.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray29 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope31 = compiler30.getTopScope();
        com.google.javascript.jscomp.Scope scope32 = compiler30.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler30.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.newCompilerOptions();
        compiler30.initOptions(compilerOptions36);
        com.google.javascript.jscomp.Result result38 = compiler18.compile(jSSourceFileArray28, jSModuleArray29, compilerOptions36);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope40 = compiler39.getTopScope();
        com.google.javascript.jscomp.Scope scope41 = compiler39.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap42 = compiler39.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap44 = compiler43.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler43.newCompilerOptions();
        compiler39.initOptions(compilerOptions45);
        compiler39.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray49 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray50 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope52 = compiler51.getTopScope();
        com.google.javascript.jscomp.Scope scope53 = compiler51.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap54 = compiler51.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap56 = compiler55.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler55.newCompilerOptions();
        compiler51.initOptions(compilerOptions57);
        com.google.javascript.jscomp.Result result59 = compiler39.compile(jSSourceFileArray49, jSModuleArray50, compilerOptions57);
        com.google.javascript.jscomp.JSModule[] jSModuleArray60 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope62 = compiler61.getTopScope();
        com.google.javascript.jscomp.Scope scope63 = compiler61.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap64 = compiler61.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap65 = compiler61.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap67 = compiler66.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler66.newCompilerOptions();
        compiler61.initOptions(compilerOptions68);
        compiler18.init(jSSourceFileArray49, jSModuleArray60, compilerOptions68);
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope72 = compiler71.getTopScope();
        com.google.javascript.jscomp.Scope scope73 = compiler71.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap74 = compiler71.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap76 = compiler75.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions77 = compiler75.newCompilerOptions();
        compiler71.initOptions(compilerOptions77);
        compiler18.options = compilerOptions77;
        compiler9.options = compilerOptions77;
        compiler5.options = compilerOptions77;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = compiler5.getTypeRegistry();
        com.google.javascript.jscomp.CodingConvention codingConvention83 = compiler5.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention83;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile86 = compiler0.getSourceFileByName("");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler0.recentChange;
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator8 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile10 = compiler0.getSourceFileByName("[[hi!]]");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        int int10 = compiler0.getErrorCount();
        com.google.javascript.rhino.Node node12 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList14 = compiler13.getExternsForTesting();
        compiler13.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler13.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = compiler17.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope20 = compiler19.getTopScope();
        com.google.javascript.jscomp.Scope scope21 = compiler19.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler19.getVariableMap();
        compiler19.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope25 = compiler19.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler19.recentChange;
        compiler17.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        com.google.javascript.rhino.Node node29 = compiler17.parseTestCode("[[2569/09/20 21:43]]");
        compiler13.externsRoot = node29;
        compiler0.externsRoot = node29;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = compiler0.loadLibraryCode("[Unversioned directory2569/09/20 21:43]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        java.lang.String str8 = compiler4.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope10 = compiler9.getTopScope();
        com.google.javascript.jscomp.Scope scope11 = compiler9.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler9.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.Scope scope14 = compiler9.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler9.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler9.getErrorManager();
        compiler4.setErrorManager(errorManager16);
        com.google.javascript.jscomp.Result result18 = compiler4.getResult();
        int int19 = compiler4.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compiler20.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope23 = compiler22.getTopScope();
        com.google.javascript.jscomp.Scope scope24 = compiler22.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler27.newCompilerOptions();
        compiler22.initOptions(compilerOptions29);
        compiler20.initOptions(compilerOptions29);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope33 = compiler32.getTopScope();
        com.google.javascript.jscomp.Scope scope34 = compiler32.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler32.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig36 = compiler32.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope38 = compiler37.getTopScope();
        com.google.javascript.jscomp.Scope scope39 = compiler37.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler37.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap42 = compiler41.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler41.newCompilerOptions();
        compiler37.initOptions(compilerOptions43);
        compiler37.setProgress((double) (byte) -1);
        int int47 = compiler37.getErrorCount();
        com.google.javascript.rhino.Node node49 = compiler37.parseTestCode("hi!");
        compiler32.externsRoot = node49;
        java.lang.String str51 = compiler20.toSource(node49);
        compiler4.externsRoot = node49;
        compiler0.jsRoot = node49;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter54 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        boolean boolean13 = compiler4.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler4.getPassConfig();
        int int15 = compiler4.getWarningCount();
        com.google.javascript.rhino.Node node17 = compiler4.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler4.options;
        compiler0.options = compilerOptions18;
        boolean boolean20 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope5 = compiler4.getTopScope();
        com.google.javascript.jscomp.Scope scope6 = compiler4.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler4.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.Scope scope9 = compiler4.getTopScope();
        compiler4.initCompilerOptionsIfTesting();
        compiler4.startPass("");
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope14 = compiler13.getTopScope();
        com.google.javascript.jscomp.Scope scope15 = compiler13.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler13.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap18 = compiler17.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler17.newCompilerOptions();
        compiler13.initOptions(compilerOptions19);
        compiler13.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray24 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope26 = compiler25.getTopScope();
        com.google.javascript.jscomp.Scope scope27 = compiler25.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler25.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap30 = compiler29.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler29.newCompilerOptions();
        compiler25.initOptions(compilerOptions31);
        com.google.javascript.jscomp.Result result33 = compiler13.compile(jSSourceFileArray23, jSModuleArray24, compilerOptions31);
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope35 = compiler34.getTopScope();
        com.google.javascript.jscomp.Scope scope36 = compiler34.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler34.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler38.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler38.newCompilerOptions();
        compiler34.initOptions(compilerOptions40);
        compiler34.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray44 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler50.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler50.newCompilerOptions();
        compiler46.initOptions(compilerOptions52);
        com.google.javascript.jscomp.Result result54 = compiler34.compile(jSSourceFileArray44, jSModuleArray45, compilerOptions52);
        com.google.javascript.jscomp.JSModule[] jSModuleArray55 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope57 = compiler56.getTopScope();
        com.google.javascript.jscomp.Scope scope58 = compiler56.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler56.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler56.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler61.newCompilerOptions();
        compiler56.initOptions(compilerOptions63);
        compiler13.init(jSSourceFileArray44, jSModuleArray55, compilerOptions63);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope67 = compiler66.getTopScope();
        com.google.javascript.jscomp.Scope scope68 = compiler66.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler66.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler70.newCompilerOptions();
        compiler66.initOptions(compilerOptions72);
        compiler13.options = compilerOptions72;
        compiler4.options = compilerOptions72;
        compiler0.options = compilerOptions72;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = compiler0.getTypeRegistry();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList78 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator2 = compiler0.getTypedScopeCreator();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("[[2569/09/20 21:43]]", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler0.getErrorManager();
        boolean boolean13 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = compiler0.parseInputs();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.Scope scope11 = compiler6.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler6.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = compiler0.loadLibraryCode("");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups10 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler3.initOptions(compilerOptions9);
        compiler3.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.newCompilerOptions();
        compiler15.initOptions(compilerOptions21);
        com.google.javascript.jscomp.Result result23 = compiler3.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        compiler24.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray35 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope37 = compiler36.getTopScope();
        com.google.javascript.jscomp.Scope scope38 = compiler36.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler36.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler40.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.newCompilerOptions();
        compiler36.initOptions(compilerOptions42);
        com.google.javascript.jscomp.Result result44 = compiler24.compile(jSSourceFileArray34, jSModuleArray35, compilerOptions42);
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler46.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap52 = compiler51.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.newCompilerOptions();
        compiler46.initOptions(compilerOptions53);
        compiler3.init(jSSourceFileArray34, jSModuleArray45, compilerOptions53);
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope58 = compiler57.getTopScope();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap60 = compiler59.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler59.newCompilerOptions();
        compiler57.options = compilerOptions61;
        com.google.javascript.jscomp.Result result63 = compiler0.compile(jSSourceFileArray34, jSModuleArray56, compilerOptions61);
        boolean boolean64 = compiler0.hasErrors();
        java.lang.String[] strArray65 = compiler0.toSourceArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = compiler0.loadLibraryCode("");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope13 = compiler12.getTopScope();
        com.google.javascript.jscomp.Scope scope14 = compiler12.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler16.newCompilerOptions();
        compiler12.initOptions(compilerOptions18);
        com.google.javascript.jscomp.Result result20 = compiler0.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions18);
        boolean boolean21 = compiler0.hasErrors();
        com.google.javascript.jscomp.SourceFile sourceFile23 = compiler0.getSourceFileByName("[singleton]");
        int int24 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput25 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.jscomp.Tracer tracer14 = compiler0.newTracer("[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap12 = compiler0.getCssRenamingMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph16 = compiler0.computeCFG();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        compiler0.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.Scope scope11 = compiler6.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler6.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler6.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(errorManager13);
        compiler0.setErrorManager(errorManager13);
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter17 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getErrorCount();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler3.recordFunctionInformation();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        compiler0.setHasRegExpGlobalReferences(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler5.newCompilerOptions();
        compiler0.initOptions(compilerOptions7);
        boolean boolean9 = compiler0.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.defaultCodingConvention;
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler4.newCompilerOptions();
        compiler0.initOptions(compilerOptions6);
        compiler0.setProgress((double) (byte) -1);
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope12 = compiler11.getTopScope();
        com.google.javascript.jscomp.Scope scope13 = compiler11.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler11.getVariableMap();
        java.lang.String str15 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope17 = compiler16.getTopScope();
        com.google.javascript.jscomp.Scope scope18 = compiler16.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler16.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler16.getPropertyMap();
        com.google.javascript.jscomp.Scope scope21 = compiler16.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig22 = compiler16.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler16.getErrorManager();
        compiler11.setErrorManager(errorManager23);
        com.google.javascript.jscomp.Result result25 = compiler11.getResult();
        int int26 = compiler11.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compiler27.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope30 = compiler29.getTopScope();
        com.google.javascript.jscomp.Scope scope31 = compiler29.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler29.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler29.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler34.newCompilerOptions();
        compiler29.initOptions(compilerOptions36);
        compiler27.initOptions(compilerOptions36);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope40 = compiler39.getTopScope();
        com.google.javascript.jscomp.Scope scope41 = compiler39.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap42 = compiler39.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig43 = compiler39.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope45 = compiler44.getTopScope();
        com.google.javascript.jscomp.Scope scope46 = compiler44.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler44.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler48.newCompilerOptions();
        compiler44.initOptions(compilerOptions50);
        compiler44.setProgress((double) (byte) -1);
        int int54 = compiler44.getErrorCount();
        com.google.javascript.rhino.Node node56 = compiler44.parseTestCode("hi!");
        compiler39.externsRoot = node56;
        java.lang.String str58 = compiler27.toSource(node56);
        compiler11.externsRoot = node56;
        compiler0.externAndJsRoot = node56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.startPass("");
        boolean boolean9 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        boolean boolean11 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        com.google.javascript.jscomp.Scope scope13 = compiler0.getTopScope();
        boolean boolean14 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups15 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = compiler0.getReverseAbstractInterpreter();
        int int17 = compiler0.getWarningCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        boolean boolean14 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler0.getErrors();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope18 = compiler17.getTopScope();
        com.google.javascript.jscomp.Scope scope19 = compiler17.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler17.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler21.newCompilerOptions();
        compiler17.initOptions(compilerOptions23);
        compiler17.setProgress((double) (byte) -1);
        compiler17.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope29 = compiler28.getTopScope();
        com.google.javascript.jscomp.Scope scope30 = compiler28.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler28.getVariableMap();
        java.lang.String str32 = compiler28.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope34 = compiler33.getTopScope();
        com.google.javascript.jscomp.Scope scope35 = compiler33.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap36 = compiler33.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler33.getPropertyMap();
        com.google.javascript.jscomp.Scope scope38 = compiler33.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler33.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler33.getErrorManager();
        compiler28.setErrorManager(errorManager40);
        com.google.javascript.jscomp.Result result42 = compiler28.getResult();
        int int43 = compiler28.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = compiler44.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler46.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap52 = compiler51.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.newCompilerOptions();
        compiler46.initOptions(compilerOptions53);
        compiler44.initOptions(compilerOptions53);
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope57 = compiler56.getTopScope();
        com.google.javascript.jscomp.Scope scope58 = compiler56.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler56.getVariableMap();
        com.google.javascript.jscomp.PassConfig passConfig60 = compiler56.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope62 = compiler61.getTopScope();
        com.google.javascript.jscomp.Scope scope63 = compiler61.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap64 = compiler61.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap66 = compiler65.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler65.newCompilerOptions();
        compiler61.initOptions(compilerOptions67);
        compiler61.setProgress((double) (byte) -1);
        int int71 = compiler61.getErrorCount();
        com.google.javascript.rhino.Node node73 = compiler61.parseTestCode("hi!");
        compiler56.externsRoot = node73;
        java.lang.String str75 = compiler44.toSource(node73);
        compiler28.externsRoot = node73;
        compiler17.externAndJsRoot = node73;
        compiler0.externsRoot = node73;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput79 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = compiler0.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler4.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getVariableMap();
        compiler6.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope12 = compiler6.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler6.recentChange;
        compiler4.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        com.google.javascript.rhino.Node node16 = compiler4.parseTestCode("[[2569/09/20 21:43]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.prepareAst(node16);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.addToDebugLog("[singleton]");
        compiler0.setProgress((double) 0);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler8.newCompilerOptions();
        compiler6.options = compilerOptions10;
        compiler0.initOptions(compilerOptions10);
        com.google.javascript.rhino.Node node13 = compiler0.externAndJsRoot;
        com.google.javascript.rhino.Node node14 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = compiler0.tracker;
        compiler0.startPass("[[singleton]]");
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode18 = compiler0.languageMode();
        boolean boolean19 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig20 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        boolean boolean3 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node4 = compiler0.externAndJsRoot;
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph6 = compiler0.computeCFG();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList1 = compiler0.getExternsForTesting();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler4.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope7 = compiler6.getTopScope();
        com.google.javascript.jscomp.Scope scope8 = compiler6.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getVariableMap();
        compiler6.addToDebugLog("[singleton]");
        com.google.javascript.jscomp.Scope scope12 = compiler6.getTopScope();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler6.recentChange;
        compiler4.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        com.google.javascript.rhino.Node node16 = compiler4.parseTestCode("[[2569/09/20 21:43]]");
        compiler0.externsRoot = node16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph18 = compiler0.computeCFG();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope3 = compiler2.getTopScope();
        com.google.javascript.jscomp.Scope scope4 = compiler2.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler2.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler2.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler2.initOptions(compilerOptions9);
        compiler0.initOptions(compilerOptions9);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.newExternInput("[{SyntheticVarsDeclar}]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.ensureLibraryInjected("[[[singleton]]]");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler3.getPropertyMap();
        com.google.javascript.jscomp.Scope scope8 = compiler3.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig9 = compiler3.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager10);
        java.lang.String str12 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.toSource();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(errorManager7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler10.hasErrors();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig2 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups6 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("[singleton]", (int) (byte) 1);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope1 = compiler0.getTopScope();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.setProgress((double) (byte) -1);
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap9 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getInputsInOrder();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope4 = compiler3.getTopScope();
        com.google.javascript.jscomp.Scope scope5 = compiler3.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler3.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler7.newCompilerOptions();
        compiler3.initOptions(compilerOptions9);
        compiler3.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope16 = compiler15.getTopScope();
        com.google.javascript.jscomp.Scope scope17 = compiler15.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler15.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler19.newCompilerOptions();
        compiler15.initOptions(compilerOptions21);
        com.google.javascript.jscomp.Result result23 = compiler3.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions21);
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope25 = compiler24.getTopScope();
        com.google.javascript.jscomp.Scope scope26 = compiler24.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler24.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler28.newCompilerOptions();
        compiler24.initOptions(compilerOptions30);
        compiler24.setProgress((double) (byte) -1);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray35 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope37 = compiler36.getTopScope();
        com.google.javascript.jscomp.Scope scope38 = compiler36.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler36.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap41 = compiler40.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler40.newCompilerOptions();
        compiler36.initOptions(compilerOptions42);
        com.google.javascript.jscomp.Result result44 = compiler24.compile(jSSourceFileArray34, jSModuleArray35, compilerOptions42);
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope47 = compiler46.getTopScope();
        com.google.javascript.jscomp.Scope scope48 = compiler46.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler46.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler46.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap52 = compiler51.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler51.newCompilerOptions();
        compiler46.initOptions(compilerOptions53);
        compiler3.init(jSSourceFileArray34, jSModuleArray45, compilerOptions53);
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Scope scope58 = compiler57.getTopScope();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap60 = compiler59.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler59.newCompilerOptions();
        compiler57.options = compilerOptions61;
        com.google.javascript.jscomp.Result result63 = compiler0.compile(jSSourceFileArray34, jSModuleArray56, compilerOptions61);
        boolean boolean64 = compiler0.hasErrors();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = compiler0.getTypeRegistry();
        compiler0.rebuildInputsFromModules();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph68 = compiler0.computeCFG();
    }
}

