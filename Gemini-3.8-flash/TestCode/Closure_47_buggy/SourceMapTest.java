package com.google.javascript.jscomp;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SourceMapTest {

  private SourceMap sourceMap;

  @Before
  public void setUp() {
    sourceMap = SourceMap.Format.V3.getInstance();
  }

  @Test
  public void getInstance_givenFormatV1_shouldReturnNonNullSourceMap() {
    SourceMap map = SourceMap.Format.V1.getInstance();
    Assert.assertNotNull(map);
  }

  @Test
  public void getInstance_givenFormatDefault_shouldReturnNonNullSourceMap() {
    SourceMap map = SourceMap.Format.DEFAULT.getInstance();
    Assert.assertNotNull(map);
  }

  @Test
  public void getInstance_givenFormatV2_shouldReturnNonNullSourceMap() {
    SourceMap map = SourceMap.Format.V2.getInstance();
    Assert.assertNotNull(map);
  }

  @Test
  public void getInstance_givenFormatV3_shouldReturnNonNullSourceMap() {
    SourceMap map = SourceMap.Format.V3.getInstance();
    Assert.assertNotNull(map);
  }

  @Test
  public void format_valueOfAndValues_shouldContainAllFormats() {
    SourceMap.Format[] formats = SourceMap.Format.values();
    Assert.assertEquals(4, formats.length);
    Assert.assertEquals(SourceMap.Format.V1, SourceMap.Format.valueOf("V1"));
    Assert.assertEquals(SourceMap.Format.DEFAULT, SourceMap.Format.valueOf("DEFAULT"));
    Assert.assertEquals(SourceMap.Format.V2, SourceMap.Format.valueOf("V2"));
    Assert.assertEquals(SourceMap.Format.V3, SourceMap.Format.valueOf("V3"));
  }

  @Test
  public void apply_givenDetailLevelAll_shouldAlwaysReturnTrue() {
    Node node = new Node(Token.VAR);
    Assert.assertTrue(SourceMap.DetailLevel.ALL.apply(node));
    Assert.assertTrue(SourceMap.DetailLevel.ALL.apply(null));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithCallNode_shouldReturnTrue() {
    Node node = new Node(Token.CALL);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(node));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithNewNode_shouldReturnTrue() {
    Node node = new Node(Token.NEW);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(node));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithFunctionNode_shouldReturnTrue() {
    Node node = new Node(Token.FUNCTION);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(node));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithNameNode_shouldReturnTrue() {
    Node node = new Node(Token.NAME);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(node));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithGetPropNode_shouldReturnTrue() {
    Node node = new Node(Token.GETPROP);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(node));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithGetElemNode_shouldReturnTrue() {
    Node node = new Node(Token.GETELEM);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(node));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithObjectLitKey_shouldReturnTrue() {
    Node objLit = new Node(Token.OBJECTLIT);
    Node keyNode = Node.newString("key");
    objLit.addChildToBack(keyNode);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(keyNode));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithStringChildOfGet_shouldReturnTrue() {
    Node getPropNode = new Node(Token.GETPROP);
    Node stringChild = Node.newString("prop");
    getPropNode.addChildToBack(stringChild);
    Assert.assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(stringChild));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithStringChildOfNonGet_shouldReturnFalse() {
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node stringChild = Node.newString("prop");
    exprResult.addChildToBack(stringChild);
    Assert.assertFalse(SourceMap.DetailLevel.SYMBOLS.apply(stringChild));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithNonStringChildOfGet_shouldReturnFalse() {
    Node getPropNode = new Node(Token.GETPROP);
    Node numberChild = Node.newNumber(42);
    getPropNode.addChildToBack(numberChild);
    Assert.assertFalse(SourceMap.DetailLevel.SYMBOLS.apply(numberChild));
  }

  @Test
  public void apply_givenDetailLevelSymbolsWithUnmatchedNode_shouldReturnFalse() {
    Node varNode = new Node(Token.VAR);
    Assert.assertFalse(SourceMap.DetailLevel.SYMBOLS.apply(varNode));
  }

  @Test
  public void detailLevel_valueOfAndValues_shouldContainAllLevels() {
    SourceMap.DetailLevel[] levels = SourceMap.DetailLevel.values();
    Assert.assertEquals(2, levels.length);
    Assert.assertEquals(SourceMap.DetailLevel.ALL, SourceMap.DetailLevel.valueOf("ALL"));
    Assert.assertEquals(SourceMap.DetailLevel.SYMBOLS, SourceMap.DetailLevel.valueOf("SYMBOLS"));
  }

  @Test
  public void locationMapping_givenPrefixAndReplacement_shouldSetFieldsCorrectly() {
    SourceMap.LocationMapping mapping = new SourceMap.LocationMapping("/prefix/", "/replacement/");
    Assert.assertEquals("/prefix/", mapping.prefix);
    Assert.assertEquals("/replacement/", mapping.replacement);
  }

  @Test
  public void addMapping_givenNullSourceFileName_shouldReturnEarlyWithoutAdding() throws IOException {
    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName(null);

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertFalse(out.toString().contains("null"));
  }

  @Test
  public void addMapping_givenNegativeLineNumber_shouldReturnEarlyWithoutAdding() throws IOException {
    Node node = new Node(Token.NAME);
    node.setSourceFileName("source.js");

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertFalse(out.toString().contains("source.js"));
  }

  @Test
  public void addMapping_givenValidNodeWithoutOriginalName_shouldAddMappingSuccessfully() throws IOException {
    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("source.js");

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("source.js"));
  }

  @Test
  public void addMapping_givenValidNodeWithOriginalName_shouldAddMappingSuccessfully() throws IOException {
    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("source.js");
    node.putProp(Node.ORIGINALNAME_PROP, "originalIdentifier");

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("source.js"));
    Assert.assertTrue(out.toString().contains("originalIdentifier"));
  }

  @Test
  public void addMapping_givenEmptyPrefixMappings_shouldUseOriginalSourcePath() throws IOException {
    sourceMap.setPrefixMappings(Collections.<SourceMap.LocationMapping>emptyList());

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("/unmodified/path/source.js");

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("/unmodified/path/source.js"));
  }

  @Test
  public void addMapping_givenMatchingPrefix_shouldRemapSourceLocation() throws IOException {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("/workspace/src/", "http://example.com/src/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("/workspace/src/app/main.js");

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("http://example.com/src/app/main.js"));
    Assert.assertFalse(out.toString().contains("/workspace/src/app/main.js"));
  }

  @Test
  public void addMapping_givenRepeatedMatchingSource_shouldUseFixupCache() throws IOException {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("/workspace/src/", "http://example.com/src/"));
    sourceMap.setPrefixMappings(mappings);

    Node firstNode = new Node(Token.NAME, 1, 0);
    firstNode.setSourceFileName("/workspace/src/cached.js");
    sourceMap.addMapping(firstNode, new FilePosition(1, 0), new FilePosition(1, 5));

    Node secondNode = new Node(Token.NAME, 2, 0);
    secondNode.setSourceFileName("/workspace/src/cached.js");
    sourceMap.addMapping(secondNode, new FilePosition(2, 0), new FilePosition(2, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("http://example.com/src/cached.js"));
  }

  @Test
  public void addMapping_givenUnmatchedPrefix_shouldKeepOriginalAndCache() throws IOException {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("/workspace/src/", "http://example.com/src/"));
    sourceMap.setPrefixMappings(mappings);

    Node firstNode = new Node(Token.NAME, 1, 0);
    firstNode.setSourceFileName("/external/lib/other.js");
    sourceMap.addMapping(firstNode, new FilePosition(1, 0), new FilePosition(1, 5));

    Node secondNode = new Node(Token.NAME, 2, 0);
    secondNode.setSourceFileName("/external/lib/other.js");
    sourceMap.addMapping(secondNode, new FilePosition(2, 0), new FilePosition(2, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("/external/lib/other.js"));
  }

  @Test
  public void addMapping_givenMultiplePrefixes_shouldUseFirstMatchingPrefix() throws IOException {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("/workspace/", "http://example.com/all/"));
    mappings.add(new SourceMap.LocationMapping("/workspace/src/", "http://example.com/specific/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("/workspace/src/app.js");

    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("http://example.com/all/src/app.js"));
    Assert.assertFalse(out.toString().contains("http://example.com/specific/"));
  }

  @Test
  public void appendTo_givenValidAppendable_shouldWriteSourceMap() throws IOException {
    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("out.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "generated.js");

    Assert.assertTrue(out.length() > 0);
  }

  @Test
  public void appendTo_givenThrowingAppendable_shouldPropagateIOException() {
    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("source.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    Appendable throwingAppendable = new Appendable() {
      public Appendable append(CharSequence csq) throws IOException {
        throw new IOException("Simulated append error");
      }

      public Appendable append(CharSequence csq, int start, int end) throws IOException {
        throw new IOException("Simulated append error");
      }

      public Appendable append(char c) throws IOException {
        throw new IOException("Simulated append error");
      }
    };

    try {
      sourceMap.appendTo(throwingAppendable, "out.js");
      Assert.fail("Expected IOException to be thrown");
    } catch (IOException e) {
      Assert.assertEquals("Simulated append error", e.getMessage());
    }
  }

  @Test
  public void reset_givenPopulatedSourceMap_shouldResetGeneratorAndClearCache() throws IOException {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("/workspace/", "http://example.com/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("/workspace/test.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    sourceMap.reset();

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertFalse(out.toString().contains("/workspace/test.js"));

    Node afterResetNode = new Node(Token.NAME, 2, 0);
    afterResetNode.setSourceFileName("/workspace/test.js");
    sourceMap.addMapping(afterResetNode, new FilePosition(2, 0), new FilePosition(2, 5));

    StringBuilder outAfter = new StringBuilder();
    sourceMap.appendTo(outAfter, "test");
    Assert.assertTrue(outAfter.toString().contains("http://example.com/test.js"));
  }

  @Test
  public void setStartingPosition_givenOffsets_shouldDelegateToGenerator() {
    sourceMap.setStartingPosition(10, 20);

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("start_pos.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));
  }

  @Test
  public void setWrapperPrefix_givenPrefix_shouldDelegateToGenerator() {
    sourceMap.setWrapperPrefix("(function(){\n");

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("wrapped.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));
  }

  @Test
  public void validate_givenFlag_shouldDelegateToGenerator() {
    sourceMap.validate(true);
    sourceMap.validate(false);

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("validate.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));
  }

  @Test
  public void setPrefixMappings_givenNewMappingsList_shouldUpdateMappings() throws IOException {
    List<SourceMap.LocationMapping> initial = new ArrayList<SourceMap.LocationMapping>();
    initial.add(new SourceMap.LocationMapping("/initial/", "http://initial/"));
    sourceMap.setPrefixMappings(initial);

    List<SourceMap.LocationMapping> updated = new ArrayList<SourceMap.LocationMapping>();
    updated.add(new SourceMap.LocationMapping("/updated/", "http://updated/"));
    sourceMap.setPrefixMappings(updated);

    Node node = new Node(Token.NAME, 1, 0);
    node.setSourceFileName("/updated/file.js");
    sourceMap.addMapping(node, new FilePosition(1, 0), new FilePosition(1, 5));

    StringBuilder out = new StringBuilder();
    sourceMap.appendTo(out, "test");
    Assert.assertTrue(out.toString().contains("http://updated/file.js"));
  }
}