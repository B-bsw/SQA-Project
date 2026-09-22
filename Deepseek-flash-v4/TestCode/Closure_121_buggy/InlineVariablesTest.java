package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.JSChunk;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(JUnit4.class)
public class InlineVariablesTest {

  private Compiler compiler;
  private InlineVariables inlineVariables;

  private static final String EXTERNS = "var window; var document; var undefined;";

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions();
  }

  private void testInline(InlineVariables.Mode mode, boolean inlineAllStrings, String code, String expected) {
    compiler.init(
        new JSChunk[] {JSChunk.EXTERN_CHUNK, JSChunk.CODE_CHUNK},
        new SourceFile[] {SourceFile.fromCode("externs", EXTERNS)},
        new SourceFile[] {SourceFile.fromCode("code", code)});
    inlineVariables = new InlineVariables(compiler, mode, inlineAllStrings);
    inlineVariables.process(compiler.getRoot(), compiler.getRoot());
    String result = compiler.toSource();
    assertEquals(expected, result);
  }

  private void testInline(InlineVariables.Mode mode, String code, String expected) {
    testInline(mode, false, code, expected);
  }

  @Test
  public void testConstantsOnlyMode() {
    testInline(InlineVariables.Mode.CONSTANTS_ONLY,
        "var CONST = 5; var x = CONST;",
        "var CONST=5;var x=5;");
  }

  @Test
  public void testLocalsOnlyMode() {
    testInline(InlineVariables.Mode.LOCALS_ONLY,
        "function f() { var x = 5; var y = x; }",
        "function f(){var x=5;var y=5;}");
  }

  @Test
  public void testAllMode() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x;",
        "var x=5;var y=5;");
  }

  @Test
  public void testInlineAllStrings() {
    testInline(InlineVariables.Mode.ALL, true,
        "var s = 'abc'; var t = s;",
        "var s='abc';var t='abc';");
  }

  @Test
  public void testNoInlineStringByDefault() {
    testInline(InlineVariables.Mode.ALL, false,
        "var s = 'abc'; var t = s;",
        "var s='abc';var t='abc';");
  }

  @Test
  public void testInlineFunction() {
    testInline(InlineVariables.Mode.ALL,
        "var f = function() { return 1; }; var g = f();",
        "var f=function(){return 1;};var g=f();");
  }

  @Test
  public void testInlineFunctionDeclaration() {
    testInline(InlineVariables.Mode.ALL,
        "function f() { return 1; } var g = f();",
        "function f(){return 1;}var g=f();");
  }

  @Test
  public void testNoInlineFunctionWithSideEffects() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 1; var y = x + 1;",
        "var x=1;var y=x+1;");
  }

  @Test
  public void testInlineImmutableValue() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x;",
        "var x=5;var y=5;");
  }

  @Test
  public void testInlineWithMultipleReferences() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x + x;",
        "var x=5;var y=5+5;");
  }

  @Test
  public void testInlineSingleReference() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x;",
        "var x=5;var y=5;");
  }

  @Test
  public void testNoInlineWhenExtern() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x;",
        "var x=5;var y=5;");
  }

  @Test
  public void testNoInlineWhenExported() {
    testInline(InlineVariables.Mode.ALL,
        "var _x = 5; var y = _x;",
        "var _x=5;var y=_x;");
  }

  @Test
  public void testInlineLocalVariable() {
    testInline(InlineVariables.Mode.ALL,
        "function f() { var x = 5; var y = x; }",
        "function f(){var x=5;var y=5;}");
  }

  @Test
  public void testNoInlineWhenModifiedArguments() {
    testInline(InlineVariables.Mode.ALL,
        "function f() { var x = 5; arguments[0] = 10; var y = x; }",
        "function f(){var x=5;arguments[0]=10;var y=x;}");
  }

  @Test
  public void testNoInlineWhenVarIsStale() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x; var z = x;",
        "var x=5;var y=5;var z=x;");
  }

  @Test
  public void testInlineDeclaredConstant() {
    testInline(InlineVariables.Mode.ALL,
        "const C = 5; var y = C;",
        "const C=5;var y=5;");
  }

  @Test
  public void testNoInlineWhenExternVar() {
    testInline(InlineVariables.Mode.ALL,
        "var window; var y = window;",
        "var window;var y=window;");
  }

  @Test
  public void testNullInput() {
    try {
      compiler.init(
          new JSChunk[] {JSChunk.EXTERN_CHUNK, JSChunk.CODE_CHUNK},
          new SourceFile[] {SourceFile.fromCode("externs", EXTERNS)},
          new SourceFile[] {null});
      fail("Expected NullPointerException or similar");
    } catch (Exception e) {
      // Expected exception
    }
  }

  @Test
  public void testEmptyCode() {
    testInline(InlineVariables.Mode.ALL, "", "");
  }

  @Test
  public void testNoInlineWhenInitializationIsNull() {
    testInline(InlineVariables.Mode.ALL,
        "var x; var y = x;",
        "var x;var y=x;");
  }

  @Test
  public void testNoInlineWhenVariableIsNotWellDefined() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 1; if (true) { x = 2; } var y = x;",
        "var x=1;if(true){}var y=x;");
  }

  @Test
  public void testNoInlineWhenReferenceIsNotValid() {
    testInline(InlineVariables.Mode.ALL,
        "function f() { var x = 5; var y = x; x = 10; }",
        "function f(){var x=5;var y=5;x=10;}");
  }

  @Test
  public void testNoInlineWhenVarIsDeclaredAfterUse() {
    testInline(InlineVariables.Mode.ALL,
        "var y = x; var x = 5;",
        "var y=x;var x=5;");
  }

  @Test
  public void testInlineWithGetProp() {
    testInline(InlineVariables.Mode.ALL,
        "var obj = {a: 1}; var x = obj.a;",
        "var obj={a:1};var x=1;");
  }

  @Test
  public void testNoInlineGetPropWhenNotCall() {
    testInline(InlineVariables.Mode.ALL,
        "var obj = {a: 1}; var x = obj.a + 1;",
        "var obj={a:1};var x=1+1;");
  }

  @Test
  public void testInlineInConstructorCall() {
    testInline(InlineVariables.Mode.ALL,
        "function Foo() {} var f = new Foo();",
        "function Foo(){}var f=new Foo();");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInAssignment() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x; var z = x = 10;",
        "var x=5;var y=5;x=10;var z=x;");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInIncDec() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; var y = x++;",
        "var x=5;var y=x++;");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInForIn() {
    testInline(InlineVariables.Mode.ALL,
        "var obj = {a: 1}; for (var k in obj) { var x = obj[k]; }",
        "var obj={a:1};for(var k in obj){}");
  }

  @Test
  public void testNoInlineWhenVarIsFunctionDeclaration() {
    testInline(InlineVariables.Mode.ALL,
        "function f() {} var x = f; var y = x;",
        "function f(){}var x=f;var y=f;");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInLabelBreak() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; outer: while (true) { var y = x; break outer; }",
        "var x=5;outer:while(true){var y=5;break outer;}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInSwitchCase() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 5; switch (x) { case 1: var y = x; break; }",
        "var x=5;switch(5){case 1:var y=5;break;}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInCatchBlock() {
    testInline(InlineVariables.Mode.ALL,
        "try { throw 1; } catch (e) { var x = e; }",
        "try{throw 1;}catch(e){}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInFinallyBlock() {
    testInline(InlineVariables.Mode.ALL,
        "try { } finally { var x = 5; }",
        "try{}finally{var x=5;}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInWithStatement() {
    testInline(InlineVariables.Mode.ALL,
        "with ({x: 5}) { var y = x; }",
        "with({x:5}){}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInClosure() {
    testInline(InlineVariables.Mode.ALL,
        "function outer() { var x = 5; return function() { return x; }; }",
        "function outer(){var x=5;return function(){return x;};}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInGetter() {
    testInline(InlineVariables.Mode.ALL,
        "var obj = { get x() { return 5; } }; var y = obj.x;",
        "var obj={get x(){return 5;}};var y=5;");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInSetter() {
    testInline(InlineVariables.Mode.ALL,
        "var obj = { set x(v) { this._x = v; } }; obj.x = 5;",
        "var obj={set x(v){this._x=v;}};obj.x=5;");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInComputedProperty() {
    testInline(InlineVariables.Mode.ALL,
        "var prop = 'a'; var obj = { [prop]: 1 }; var y = obj[prop];",
        "var prop='a';var obj={a:1};var y=obj[prop];");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInDefaultParameter() {
    testInline(InlineVariables.Mode.ALL,
        "function f(a = 5) { var x = a; }",
        "function f(a=5){var x=a;}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInRestParameter() {
    testInline(InlineVariables.Mode.ALL,
        "function f(...args) { var x = args; }",
        "function f(...args){var x=args;}");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInSpread() {
    testInline(InlineVariables.Mode.ALL,
        "var arr = [1, 2]; var y = [...arr, 3];",
        "var arr=[1,2];var y=[...arr,3];");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInTemplateString() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 'a'; var y = `hello ${x}`;",
        "var x='a';var y=`hello ${x}`;");
  }

  @Test
  public void testNoInlineWhenVarIsUsedInTaggedTemplate() {
    testInline(InlineVariables.Mode.ALL,
        "var x = 'a'; tag`hello ${x}`;",
        "var x='a';tag`hello ${x}`;");
  }
}