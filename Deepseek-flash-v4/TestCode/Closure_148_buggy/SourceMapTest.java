package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import java.io.IOException;
import java.io.StringWriter;
import org.junit.Before;
import org.junit.Test;

public class SourceMapTest {

  private SourceMap sourceMap;
  private StringWriter out;

  private static final String TEST_SOURCE = "test.js";
  private static final String TEST_SOURCE2 = "test2.js";

  @Before
  public void setUp() {
    sourceMap = new SourceMap();
    out = new StringWriter();
  }

  @Test
  public void testAddMapping_SourceFileNull() throws IOException {
    Node node = new Node(1);
    sourceMap.addMapping(node, new Position(1, 1), new Position(1, 5));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertTrue(result.contains("\"file\" : \"test.js\""));
    assertTrue(result.contains("count"));
  }

  @Test
  public void testAddMapping_LineNumberNegative() throws IOException {
    Node node = new Node(1);
    node.putProp(Node.SOURCEFILE_PROP, TEST_SOURCE);
    node.setLineno(-1);
    sourceMap.addMapping(node, new Position(1, 1), new Position(1, 5));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertTrue(result.contains("\"file\" : \"test.js\""));
  }

  @Test
  public void testAddMapping_BasicMapping() throws IOException {
    Node node = createNode(TEST_SOURCE, 1, 0);
    sourceMap.addMapping(node, new Position(1, 0), new Position(1, 5));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertTrue(result.contains(TEST_SOURCE));
    assertTrue(result.contains("\"count\""));
  }

  @Test
  public void testAddMapping_MultipleMappings() throws IOException {
    Node node1 = createNode(TEST_SOURCE, 1, 0);
    Node node2 = createNode(TEST_SOURCE, 2, 0);
    Node node3 = createNode(TEST_SOURCE2, 3, 0);

    sourceMap.addMapping(node1, new Position(1, 0), new Position(1, 5));
    sourceMap.addMapping(node2, new Position(2, 0), new Position(2, 3));
    sourceMap.addMapping(node3, new Position(3, 0), new Position(3, 10));

    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertTrue(result.contains(TEST_SOURCE));
    assertTrue(result.contains(TEST_SOURCE2));
    assertTrue(result.contains("\"count\""));
  }

  @Test
  public void testSetWrapperPrefix_NoMappings() throws IOException {
    sourceMap.setWrapperPrefix("var x = ");
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertNotNull(result);
  }

  @Test
  public void testSetStartingPosition_WithMappings() throws IOException {
    sourceMap.setStartingPosition(10, 20);
    Node node = createNode(TEST_SOURCE, 1, 0);
    sourceMap.addMapping(node, new Position(1, 0), new Position(1, 5));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertNotNull(result);
  }

  @Test
  public void testReset() throws IOException {
    Node node1 = createNode(TEST_SOURCE, 1, 0);
    sourceMap.addMapping(node1, new Position(1, 0), new Position(1, 5));

    sourceMap.reset();
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertTrue(result.contains("\"count\""));

    Node node2 = createNode(TEST_SOURCE2, 2, 0);
    sourceMap.addMapping(node2, new Position(2, 0), new Position(2, 3));
    sourceMap.appendTo(out, "test2.js");
    result = out.toString();
    assertTrue(result.contains(TEST_SOURCE2));
  }

  @Test
  public void testAppendTo_WithOriginalName() throws IOException {
    Node node = createNode(TEST_SOURCE, 1, 0);
    node.putProp(Node.ORIGINALNAME_PROP, "originalName");
    sourceMap.addMapping(node, new Position(1, 0), new Position(1, 5));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertTrue(result.contains("originalName"));
  }

  @Test
  public void testAddMapping_DuplicateSourceFileImport() throws IOException {
    Node node1 = createNode(TEST_SOURCE, 1, 0);
    Node node2 = createNode(TEST_SOURCE, 2, 0);
    sourceMap.addMapping(node1, new Position(1, 0), new Position(1, 5));
    sourceMap.addMapping(node2, new Position(2, 0), new Position(2, 3));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertNotNull(result);
  }

  @Test
  public void testAddMapping_WithPrefix() throws IOException {
    sourceMap.setWrapperPrefix("var x = 1;\nvar y = 2;");
    Node node = createNode(TEST_SOURCE, 2, 0);
    sourceMap.addMapping(node, new Position(2, 0), new Position(2, 5));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertNotNull(result);
  }

  @Test
  public void testAppendTo_EmptyMappings() {
    try {
      sourceMap.appendTo(out, "test.js");
      fail("Expected IOException for empty mappings");
    } catch (IOException e) {
      assertNotNull(e.getMessage());
    }
  }

  @Test
  public void testSetStartingPosition_MultipleAdds() throws IOException {
    sourceMap.setStartingPosition(5, 10);
    Node node1 = createNode(TEST_SOURCE, 1, 0);
    Node node2 = createNode(TEST_SOURCE, 2, 0);
    sourceMap.addMapping(node1, new Position(1, 0), new Position(1, 5));
    sourceMap.addMapping(node2, new Position(2, 0), new Position(2, 3));
    sourceMap.appendTo(out, "test.js");
    String result = out.toString();
    assertNotNull(result);
  }

  private Node createNode(String sourceFile, int line, int charNo) {
    Node node = new Node(1);
    node.putProp(Node.SOURCEFILE_PROP, sourceFile);
    node.setLineno(line);
    node.setCharno(charNo);
    return node;
  }
}