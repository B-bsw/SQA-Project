package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.NodeUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InlineVariablesTest {

    private Compiler compiler;
    private InlineVariables inlineVariables;
    private InlineVariables.Mode mode;
    private boolean inlineAllStrings;
    private Map<String, String> variableMap;

    @Before
    public void setUp() {
        compiler = new Compiler();
        variableMap = new HashMap<>();
        inlineAllStrings = false;
    }

    @After
    public void tearDown() {
        compiler = null;
        inlineVariables = null;
        variableMap = null;
    }

    private void test(InlineVariables.Mode mode, String code, String expected) {
        this.mode = mode;
        this.inlineAllStrings = false;
        testInternal(code, expected);
    }

    private void testAllModes(String code, String expected) {
        test(InlineVariables.Mode.ALL, code, expected);
        test(InlineVariables.Mode.LOCALS_ONLY, code, expected);
        test(InlineVariables.Mode.CONSTANTS_ONLY, code, expected);
    }

    private void testInternal(String code, String expected) {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT5);
        options.setCheckTypes(true);

        compiler.init(new SourceFile[] { SourceFile.fromCode("externs", "var window;") },
                      new SourceFile[] { SourceFile.fromCode("input", code) },
                      options);
        compiler.process(new Node[] {}, new Node[] {});

        inlineVariables = new InlineVariables(compiler, mode, inlineAllStrings);
        inlineVariables.process(compiler.getRoot(), compiler.getRoot());
        String result = compiler.toSource();
        assertEquals("Unexpected result for mode: " + mode, expected, result);
    }

    private void testWithFilter(InlineVariables.Mode mode, boolean filterAllStrings,
                                 String code, String expected) {
        this.mode = mode;
        this.inlineAllStrings = filterAllStrings;
        testInternal(code, expected);
    }

    @Test
    public void testInlineConstantsOnly() {
        String code = "var FOO = 1; var bar = FOO;";
        String expected = "var FOO=1;var bar=1;";
        test(InlineVariables.Mode.CONSTANTS_ONLY, code, expected);
    }

    @Test
    public void testInlineLocalsOnly() {
        String code = "function f(){ var x = 1; return x; }";
        String expected = "function f(){return 1;}";
        test(InlineVariables.Mode.LOCALS_ONLY, code, expected);
    }

    @Test
    public void testInlineAll() {
        String code = "var x = 1; var y = x;";
        String expected = "var x=1;var y=1;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineNonConstants() {
        String code = "var x = 1; var y = x + 1;";
        String expected = "var x=1;var y=x+1;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineWithMultipleReferences() {
        String code = "var x = 1; var y = x + x;";
        String expected = "var x=1;var y=2;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineFunctionDeclaration() {
        String code = "function f(){ return 1; } var x = f; var y = x();";
        String expected = "function f(){return 1;}var y=f();";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineStringWithAllStrings() {
        String code = "var x = \"hello\"; var y = x;";
        String expected = "var x=\"hello\";var y=\"hello\";";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineStringWithFlags() {
        String code = "var x = \"hello\"; var y = x;";
        String expected = "var x=\"hello\";var y=x;";
        test(InlineVariables.Mode.CONSTANTS_ONLY, code, expected);
    }

    @Test
    public void testInlineThisAlias() {
        String code = "function f(){ var x = this; return x.y; }";
        String expected = "function f(){return this.y;}";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineForLoopVariable() {
        String code = "function f(){ var i=0; for(i; i<10; i++){ } }";
        String expected = "function f(){for(var i=0;i<10;i++){}}";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineVarInForLoop() {
        String code = "function f(){ for(var i=0; i<10; i++){ } }";
        String expected = "function f(){for(var i=0;i<10;i++){}}";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineArray() {
        String code = "var x = [1,2]; var y = x[0];";
        String expected = "var x=[1,2];var y=x[0];";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineObject() {
        String code = "var x = {a: 1, b: 2}; var y = x.a;";
        String expected = "var x={a:1,b:2};var y=x.a;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineNumber() {
        String code = "var x = 1; var y = x + 2;";
        String expected = "var x=1;var y=3;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineBoolean() {
        String code = "var x = true; var y = x ? 1 : 2;";
        String expected = "var x=true;var y=1;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineForExportedVar() {
        String code = "var x = 1; window.foo = x;";
        String expected = "var x=1;window.foo=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineForNotWellDefined() {
        String code = "var x; if(foo){ x = 1; } var y = x;";
        String expected = "var x;if(foo){x=1}var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineForAssignmentBeforeDeclaration() {
        String code = "if(foo){ x = 1; } var x; var y = x;";
        String expected = "if(foo){x=1}var x;var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineReferenceInSameBlock() {
        String code = "function f(){ var x = 1; return x; }";
        String expected = "function f(){return 1;}";
        test(InlineVariables.Mode.LOCALS_ONLY, code, expected);
    }

    @Test
    public void testInlineReferenceInDifferentBlock() {
        String code = "function f(x){ var y = x; if(y){ return y; } return 0; }";
        String expected = "function f(x){var y=x;if(y){return y}return 0}";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineBecauseValueMutated() {
        String code = "var x = []; x.push(1); var y = x;";
        String expected = "var x=[];x.push(1);var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineBecauseAliasExists() {
        String code = "var x = 1; var alias = x; var y = x;";
        String expected = "var x=1;var alias=x;var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineBecauseReferenceIsDeclaration() {
        String code = "function f(){ var x = 1; var y = 2; return x; }";
        String expected = "function f(){var x=1;var y=2;return x}";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineBecauseReferenceIsLvalue() {
        String code = "var x = 1; x = 2; var y = x;";
        String expected = "var x=1;x=2;var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineForNotValidValue() {
        String code = "var x = function(){}; var y = x;";
        String expected = "var x=function(){};var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineForMutableValue() {
        String code = "var x = {}; x.a = 1; var y = x;";
        String expected = "var x={};x.a=1;var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineForSubclassDefinition() {
        String code = "var x = function(){}; var y = x();";
        String expected = "var x=function(){};var y=x();";
        test(InlineVariables.Mode.ALL, code, expected);
    }
    
    @Test
    public void testInlineConstantsInExpression() {
        String code = "var X=5; var Y=1+X;";
        String expected = "var X=5;var Y=6;";
        test(InlineVariables.Mode.CONSTANTS_ONLY, code, expected);
    }
    
    @Test
    public void testNoInlineForNonConstantInConstantsOnly() {
        String code = "var x=5; var y=x+1;";
        String expected = "var x=5;var y=6;";
        test(InlineVariables.Mode.CONSTANTS_ONLY, code, expected);
    }

    @Test
    public void testNoInlineBecauseEscaped() {
        String code = "var x=1; function f(){ return x; } f();";
        String expected = "var x=1;function f(){return x}f();";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineBecauseAssignedMultipleTimes() {
        String code = "var x=1; x=2; var y=x;";
        String expected = "var x=1;x=2;var y=2;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineWithGetProp() {
        String code = "var x={a:1}; var y=x.a;";
        String expected = "var x={a:1};var y=1;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineWithDynamicValue() {
        String code = "var x; if(foo){x=1}else{x=2} var y=x;";
        String expected = "var x;if(foo){x=1}else{x=2}var y=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testNoInlineWithTooManyReferences() {
        String code = "var x=1; var a=x; var b=x; var c=x;";
        String expected = "var x=1;var a=x;var b=x;var c=x;";
        test(InlineVariables.Mode.ALL, code, expected);
    }

    @Test
    public void testInlineWithNoReferences() {
        String code = "var x=1;";
        String expected = "var x=1;";
        test(InlineVariables.Mode.ALL, code, expected);
    }
}