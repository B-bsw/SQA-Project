package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class ProcessCommonJSModulesTest {

  private ProcessCommonJSModules processCommonJSModules;
  private AbstractCompiler compiler;
  private Node root;
  private Node scriptNode;

  @Before
  public void setUp() {
    compiler = new Compiler();
    processCommonJSModules = new ProcessCommonJSModules(compiler, "prefix");
    root = new Node(Node.SCRIPT);
    scriptNode = new Node(Node.SCRIPT);
    root.addChildToFront(scriptNode);
  }

  @Test
  public void testToModuleName_removesLeadingDotSlash() {
    assertEquals("module$prefix", ProcessCommonJSModules.toModuleName("./prefix"));
  }

  @Test
  public void testToModuleName_replacesSlashWithDollar() {
    assertEquals("module$a$b$c", ProcessCommonJSModules.toModuleName("/a/b/c"));
  }

  @Test
  public void testToModuleName_removesTrailingJs() {
    assertEquals("module$abc", ProcessCommonJSModules.toModuleName("abc.js"));
  }

  @Test
  public void testToModuleName_replacesHyphenWithUnderscore() {
    assertEquals("module$a_b", ProcessCommonJSModules.toModuleName("a-b"));
  }

  @Test
  public void testToModuleName_preservesExistingDollarSign() {
    assertEquals("module$abc", ProcessCommonJSModules.toModuleName("abc"));
  }

  @Test
  public void testToModuleName_allTransformations() {
    assertEquals("module$foo$bar$baz_qux", 
        ProcessCommonJSModules.toModuleName("./foo/bar/baz-qux.js"));
  }

  @Test
  public void testToModuleName_withCurrentFilename_relativePath() {
    assertEquals("module$prefix$dir$module", 
        ProcessCommonJSModules.toModuleName("./dir/module", "/path/to/current.js"));
  }

  @Test
  public void testToModuleName_withCurrentFilename_parentPath() {
    assertEquals("module$parent$module", 
        ProcessCommonJSModules.toModuleName("../parent/module", "/path/current.js"));
  }

  @Test
  public void testToModuleName_withCurrentFilename_absolutePath() {
    assertEquals("module$abs$module", 
        ProcessCommonJSModules.toModuleName("/abs/module", "/path/current.js"));
  }

  @Test
  public void testToModuleName_withCurrentFilename_keepExtension() {
    assertEquals("module$module", 
        ProcessCommonJSModules.toModuleName("module.js", "/path/current.js"));
  }

  @Test
  public void testGuessCJSModuleName_removesPrefix() {
    processCommonJSModules = new ProcessCommonJSModules(compiler, "/prefix/");
    assertEquals("module$module", processCommonJSModules.guessCJSModuleName("/prefix/module.js"));
  }

  @Test
  public void testGuessCJSModuleName_noPrefix() {
    assertEquals("module$module", processCommonJSModules.guessCJSModuleName("module.js"));
  }

  @Test
  public void testGuessCJSModuleName_differentPrefix() {
    processCommonJSModules = new ProcessCommonJSModules(compiler, "/other/");
    assertEquals("module$name", processCommonJSModules.guessCJSModuleName("/other/name.js"));
  }

  @Test
  public void testGetModule_initialNull() {
    assertNull(processCommonJSModules.getModule());
  }

  @Test
  public void testProcess_noModules() {
    Node root = new Node(Node.SCRIPT);
    processCommonJSModules.process(new Node(Node.EMPTY), root);
    assertNull(processCommonJSModules.getModule());
  }

  @Test
  public void testProcess_moduleAdded() {
    Node script = new Node(Node.SCRIPT);
    script.setSourceFileName("module.js");
    Node root = new Node(Node.SCRIPT);
    root.addChildToFront(script);
    processCommonJSModules.process(new Node(Node.EMPTY), root);
    assertNotNull(processCommonJSModules.getModule());
    assertEquals("module$module", processCommonJSModules.getModule().getName());
  }

  @Test
  public void testProcess_multipleScripts_throws() {
    Node script1 = new Node(Node.SCRIPT);
    script1.setSourceFileName("script1.js");
    Node script2 = new Node(Node.SCRIPT);
    script2.setSourceFileName("script2.js");
    Node root = new Node(Node.SCRIPT);
    root.addChildToFront(script1);
    root.addChildToFront(script2);
    try {
      processCommonJSModules.process(new Node(Node.EMPTY), root);
      fail("Expected exception for multiple scripts");
    } catch (IllegalArgumentException e) {
      // expected
    }
  }

  @Test
  public void testToModuleName_withEmptyString() {
    assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
  }

  @Test
  public void testToModuleName_withNullInput() {
    try {
      ProcessCommonJSModules.toModuleName(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testToModuleName_withCurrentFileNull() {
    try {
      ProcessCommonJSModules.toModuleName("module", null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testToModuleName_withJsOnly() {
    assertEquals("module$", ProcessCommonJSModules.toModuleName(".js"));
  }

  @Test
  public void testToModuleName_withDotSlashAtStart() {
    assertEquals("module$abc", ProcessCommonJSModules.toModuleName("./abc"));
  }

  @Test
  public void testToModuleName_withBackslash() {
    assertEquals("module$path$to$file", ProcessCommonJSModules.toModuleName("path\\to\\file"));
  }

  @Test
  public void testNormalizeSourceName_withPrefix() {
    processCommonJSModules = new ProcessCommonJSModules(compiler, "/base/");
    String result = processCommonJSModules.guessCJSModuleName("/base/module.js");
    assertEquals("module$module", result);
  }

  @Test
  public void testNormalizeSourceName_withoutPrefix() {
    processCommonJSModules = new ProcessCommonJSModules(compiler, "/base/");
    String result = processCommonJSModules.guessCJSModuleName("/other/module.js");
    assertEquals("module$other$module", result);
  }

  @Test
  public void testProcess_withRequireCall() {
    Node script = new Node(Node.SCRIPT);
    script.setSourceFileName("/base/module.js");
    Node root = new Node(Node.SCRIPT);
    root.addChildToFront(script);
    
    Node requireCall = new Node(Node.CALL);
    requireCall.addChildToBack(new Node(Node.NAME, "require"));
    requireCall.addChildToBack(new Node(Node.STRING, "dep"));
    script.addChildToBack(requireCall);
    
    processCommonJSModules.process(new Node(Node.EMPTY), root);
    assertNotNull(processCommonJSModules.getModule());
    assertEquals("module$module", processCommonJSModules.getModule().getName());
  }

  @Test
  public void testProcess_exportsAssignment() {
    Node script = new Node(Node.SCRIPT);
    script.setSourceFileName("/base/module.js");
    Node root = new Node(Node.SCRIPT);
    root.addChildToFront(script);
    
    Node exportsProp = Node.newString("exports");
    Node getProp = new Node(Node.GETPROP, new Node(Node.NAME, "module"), exportsProp);
    script.addChildToBack(Node.exprResult(getProp));
    
    processCommonJSModules.process(new Node(Node.EMPTY), root);
    assertNotNull(processCommonJSModules.getModule());
  }
}