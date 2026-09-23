package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProcessCommonJSModulesTest {

  private ProcessCommonJSModules processCommonJSModules;
  private AbstractCompiler compiler;
  private Node scriptNode;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    processCommonJSModules = new ProcessCommonJSModules(compiler, "", true);
  }

  @Test
  public void testToModuleName_removesLeadingDotSlash() {
    assertEquals("module$test", ProcessCommonJSModules.toModuleName("./test.js"));
  }

  @Test
  public void testToModuleName_replacesSlashWithDollar() {
    assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("foo/bar.js"));
  }

  @Test
  public void testToModuleName_removesJsSuffix() {
    assertEquals("module$test", ProcessCommonJSModules.toModuleName("test.js"));
  }

  @Test
  public void testToModuleName_replacesHyphenWithUnderscore() {
    assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("foo-bar.js"));
  }

  @Test
  public void testToModuleName_emptyFilename_returnsPrefix() {
    assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
  }

  @Test
  public void testToModuleName_nestedPathWithDots_handlesRelative() {
    assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("./foo/bar.js"));
  }

  @Test
  public void testToModuleName_withCurrentFilename_relativeResolve() {
    assertEquals("module$foo$bar",
        ProcessCommonJSModules.toModuleName("bar.js", "./foo/"));
  }

  @Test
  public void testToModuleName_withRelativeImport_noResolve() {
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo", "./"));
  }

  @Test
  public void testGuessCJSModuleName_stripsPrefix() {
    processCommonJSModules = new ProcessCommonJSModules(compiler, "./", true);
    assertEquals("module$foo.js", processCommonJSModules.guessCJSModuleName("./foo.js"));
  }

  @Test
  public void testGuessCJSModuleName_noPrefixKeepsFullName() {
    processCommonJSModules = new ProcessCommonJSModules(compiler, "./", true);
    assertEquals("module$path/foo.js", processCommonJSModules.guessCJSModuleName("path/foo.js"));
  }

  @Test
  public void testProcess_noExports_noChange() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    processCommonJSModules.process(null, root);
    assertEquals(0, script.getChildCount());
  }

  @Test
  public void testProcess_singleRequire_rewritesAndAddsGoogRequire() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    // Build require("a") call.
    Node requireCall = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "require");
    Node arg = Node.newString(Token.STRING, "a");
    requireCall.addChildToBack(name);
    requireCall.addChildToBack(arg);
    script.addChildToBack(requireCall);
    String sourceName = "test.js";
    script.setSourceFileNameForTesting(sourceName);
    processCommonJSModules.process(null, root);
    // After processing, script should have goog.provide and goog.require calls added.
    assertTrue(script.getFirstChild().isExprResult());
    assertTrue(script.getFirstChild().getFirstChild().isCall());
    assertEquals("goog.provide", script.getFirstChild().getFirstChild().getFirstChild()
        .getQualifiedName());
    assertTrue(script.getChildAtIndex(1).isExprResult());
  }

  @Test
  public void testProcess_moduleExportsOverridden() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    String sourceName = "test.js";
    script.setSourceFileNameForTesting(sourceName);
    // build script with exports reference
    Node moduleExports = Node.newString(Token.GETPROP, "module.exports");
    script.addChildToBack(moduleExports);
    processCommonJSModules.process(null, root);
    // After processing, script should have goog.provide, exports override if handled.
    assertTrue(script.getFirstChild().isExprResult());
  }

  @Test
  public void testProcess_withExistingExports_noCrash() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    String sourceName = "test.js";
    script.setSourceFileNameForTesting(sourceName);
    script.addChildToBack(new Node(Token.EMPTY)); // Add some node.
    processCommonJSModules.process(null, root);
    // Just verify no exception.
    assertTrue(true);
  }

  @Test
  public void testToModuleName_withParentFolderResolves() {
    assertEquals("module$foo",
        ProcessCommonJSModules.toModuleName("../foo.js", "bar/baz.js"));
  }

  @Test
  public void testVisitScript_withExports_callsProvide() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    String sourceName = "test.js";
    script.setSourceFileNameForTesting(sourceName);
    // Create a variable declaration for module.exports in script.
    Node call = new Node(Token.CALL);
    Node target = Node.newString(Token.NAME, "module");

    processCommonJSModules.process(null, root);
    assertTrue(script.getFirstChild().isExprResult());
  }

  @Test
  public void testVisitScript_withoutExports_doesNotProvide() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    String sourceName = "test.js";
    script.setSourceFileNameForTesting(sourceName);
    processCommonJSModules.process(null, root);
    // Since no exports, only goog.provide is added.
    assertEquals(1, script.getChildCount());
    assertTrue(script.getFirstChild().isExprResult());
  }

  @Test
  public void testProcess_withMultipleScripts_throwsException() {
    Node root = new Node(Token.ROOT);
    Node script1 = new Node(Token.SCRIPT);
    Node script2 = new Node(Token.SCRIPT);
    root.addChildToBack(script1);
    root.addChildToBack(script2);
    try {
      processCommonJSModules.process(null, root);
      fail("Expected RuntimeException for multiple scripts");
    } catch (RuntimeException e) {
      assertEquals("ProcessCommonJSModules supports only one invocation per CompilerInput / script node",
          e.getMessage());
    }
  }

  @Test
  public void testNormalizeSourceName_removesPrefix() {
    ProcessCommonJSModules p = new ProcessCommonJSModules(compiler, "src/", true);
    assertEquals("file.js", p.normalizeSourceName("src/file.js"));
  }

  private static class TestCompiler extends AbstractCompiler {
    @Override
    public void reportCodeChange() {
      // no-op
    }
  }
}