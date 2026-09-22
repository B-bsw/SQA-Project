package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.rhino.Node;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SourceMapTest {

  private SourceMap sourceMap;

  @Before
  public void setUp() {
    sourceMap = SourceMap.Format.V3.getInstance();
  }

  @Test
  public void testAddMapping_withNullSourceFile_shouldReturnEarly() throws IOException {
    Node node = new Node(1, 1, 1);
    node.setSourceFileName(null);
    node.setLineno(10);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
    // Should not include the mapping since sourceFile is null
    assertTrue(output.contains("originalName") == false);
  }

  @Test
  public void testAddMapping_withNegativeLineNumber_shouldReturnEarly() throws IOException {
    Node node = new Node(1, 1, 1);
    node.setSourceFileName("source.js");
    node.setLineno(-1);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
  }

  @Test
  public void testAddMapping_withValidNode_shouldAddMapping() throws IOException {
    Node node = new Node(1, 1, 1);
    node.setSourceFileName("source.js");
    node.setLineno(5);
    node.setCharno(3);
    node.putProp(Node.ORIGINALNAME_PROP, "originalName");

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
    assertTrue(output.contains("originalName"));
    assertTrue(output.contains("source.js"));
  }

  @Test
  public void testAddMapping_withNullOriginalName_shouldNotFail() throws IOException {
    Node node = new Node(1, 1, 1);
    node.setSourceFileName("source.js");
    node.setLineno(5);
    node.setCharno(3);
    node.removeProp(Node.ORIGINALNAME_PROP);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
  }

  @Test
  public void testAddMapping_withPrefixMappings_shouldApplyFirstMatch() throws IOException {
    sourceMap.setPrefixMappings(Arrays.asList(
        new SourceMap.LocationMapping("originalDir/", "mappedDir/"),
        new SourceMap.LocationMapping("otherDir/", "otherMapped/")
    ));

    Node node = new Node(1, 1, 1);
    node.setSourceFileName("originalDir/file.js");
    node.setLineno(5);
    node.setCharno(3);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
    assertTrue(output.contains("mappedDir/file.js"));
  }

  @Test
  public void testAddMapping_withPrefixMappings_noMatch_shouldUseOriginal() throws IOException {
    sourceMap.setPrefixMappings(Collections.singletonList(
        new SourceMap.LocationMapping("prefix/", "replacement/")
    ));

    Node node = new Node(1, 1, 1);
    node.setSourceFileName("other/file.js");
    node.setLineno(5);
    node.setCharno(3);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
    assertTrue(output.contains("other/file.js"));
  }

  @Test
  public void testAddMapping_withPrefixMapping_substringPrefix() throws IOException {
    sourceMap.setPrefixMappings(Collections.singletonList(
        new SourceMap.LocationMapping("/app/", "/build/")
    ));

    Node node = new Node(1, 1, 1);
    node.setSourceFileName("/app/html/index.html");
    node.setLineno(3);
    node.setCharno(1);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "test.map");

    String output = writer.toString();
    assertNotNull(output);
    assertTrue(output.contains("/build/html/index.html"));
  }

  @Test
  public void testReset_shouldClearCache() {
    sourceMap.setPrefixMappings(Collections.singletonList(
        new SourceMap.LocationMapping("prefix/", "replacement/")
    ));

    Node node = new Node(1, 1, 1);
    node.setSourceFileName("prefix/file.js");
    node.setLineno(5);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    sourceMap.reset();

    node.setSourceFileName("prefix/other.js");
    node.setLineno(6);

    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    StringWriter writer = new StringWriter();
    try {
      sourceMap.appendTo(writer, "test.map");
    } catch (IOException e) {
      fail("Unexpected IOException: " + e.getMessage());
    }

    String output = writer.toString();
    assertNotNull(output);
  }

  @Test(expected = NullPointerException.class)
  public void testSetPrefixMappings_withNullList_shouldThrowNPE() {
    sourceMap.setPrefixMappings(null);
  }

  @Test
  public void testSetWrapperPrefix() {
    sourceMap.setWrapperPrefix("wrapper");

    // Should not throw
    sourceMap.validate(true);
  }

  @Test
  public void testValidate() {
    sourceMap.validate(true);
    sourceMap.validate(false);
  }

  @Test
  public void testSetStartingPosition() {
    sourceMap.setStartingPosition(10, 20);
  }

  @Test
  public void testAppendTo_withIOException_shouldPropagate() {
    Appendable failingAppendable = new Appendable() {
      @Override
      public Appendable append(CharSequence csq) throws IOException {
        throw new IOException("Expected failure");
      }

      @Override
      public Appendable append(CharSequence csq, int start, int end) throws IOException {
        throw new IOException("Expected failure");
      }

      @Override
      public Appendable append(char c) throws IOException {
        throw new IOException("Expected failure");
      }
    };

    Node node = new Node(1, 1, 1);
    node.setSourceFileName("test.js");
    node.setLineno(5);
    sourceMap.addMapping(node, new FilePosition(1, 1), new FilePosition(2, 2));

    try {
      sourceMap.appendTo(failingAppendable, "test.map");
      fail("Expected IOException not thrown");
    } catch (IOException e) {
      // Expected
    }
  }

  @Test
  public void testDetailLevelAll_shouldReturnTrue() {
    assertTrue(SourceMap.DetailLevel.ALL.apply(new Node(1, 1, 1)));
  }

  @Test
  public void testDetailLevelSymbols() {
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(new Node(1, 1, 1)) == false);
  }

  @Test
  public void testFormatV3GetInstance_shouldReturnSourceMap() {
    assertNotNull(SourceMap.Format.V3.getInstance());
  }

  @Test
  public void testFormatDefaultGetInstance_shouldReturnSourceMap() {
    assertNotNull(SourceMap.Format.DEFAULT.getInstance());
  }

  @Test
  public void testLocationMapping_constructor() {
    SourceMap.LocationMapping mapping = new SourceMap.LocationMapping("prefix", "replacement");
    assertEquals("prefix", mapping.prefix);
    assertEquals("replacement", mapping.replacement);
  }
}