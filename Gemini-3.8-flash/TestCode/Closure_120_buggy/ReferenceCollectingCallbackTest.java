package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReferenceCollectingCallbackTest {

  private static ReferenceCollectingCallback.Reference createTestReference(
      Node nameNode,
      ReferenceCollectingCallback.BasicBlock basicBlock,
      Scope scope,
      InputId inputId) {
    try {
      Constructor constructor =
          ReferenceCollectingCallback.Reference.class.getDeclaredConstructor(
              new Class[] {
                Node.class,
                ReferenceCollectingCallback.BasicBlock.class,
                Scope.class,
                InputId.class
              });
      constructor.setAccessible(true);
      return (ReferenceCollectingCallback.Reference)
          constructor.newInstance(
              new Object[] {nameNode, basicBlock, scope, inputId});
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static boolean invokeIsBlockBoundary(Node n, Node parent) {
    try {
      Method method =
          ReferenceCollectingCallback.class.getDeclaredMethod(
              "isBlockBoundary", new Class[] {Node.class, Node.class});
      method.setAccessible(true);
      Boolean result = (Boolean) method.invoke(null, new Object[] {n, parent});
      return result.booleanValue();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static ReferenceCollectingCallback.ReferenceMap createReferenceMapWrapper(
      Map<Scope.Var, ReferenceCollectingCallback.ReferenceCollection> map) {
    try {
      Class clazz =
          Class.forName(
              "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceMapWrapper");
      Constructor constructor =
          clazz.getDeclaredConstructor(new Class[] {Map.class});
      constructor.setAccessible(true);
      return (ReferenceCollectingCallback.ReferenceMap)
          constructor.newInstance(new Object[] {map});
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void basicBlock_givenNullParent_shouldBeGlobalScopeBlock() {
    Node root = new Node(Token.BLOCK);
    ReferenceCollectingCallback.BasicBlock block =
        new ReferenceCollectingCallback.BasicBlock(null, root);

    Assert.assertNull(block.getParent());
    Assert.assertTrue(block.isGlobalScopeBlock());
  }

  @Test
  public void basicBlock_givenParentInLoop_shouldSetIsLoopTrue() {
    Node loopNode = new Node(Token.WHILE);
    Node childNode = new Node(Token.BLOCK);
    loopNode.addChildToBack(childNode);

    ReferenceCollectingCallback.BasicBlock parentBlock =
        new ReferenceCollectingCallback.BasicBlock(null, loopNode);
    ReferenceCollectingCallback.BasicBlock childBlock =
        new ReferenceCollectingCallback.BasicBlock(parentBlock, childNode);

    Assert.assertEquals(parentBlock, childBlock.getParent());
    Assert.assertFalse(childBlock.isGlobalScopeBlock());
  }

  @Test
  public void basicBlock_givenParentInDoLoop_shouldRecognizeLoop() {
    Node doNode = new Node(Token.DO);
    Node body = new Node(Token.BLOCK);
    doNode.addChildToBack(body);

    ReferenceCollectingCallback.BasicBlock parentBlock =
        new ReferenceCollectingCallback.BasicBlock(null, doNode);
    ReferenceCollectingCallback.BasicBlock bodyBlock =
        new ReferenceCollectingCallback.BasicBlock(parentBlock, body);

    Assert.assertEquals(parentBlock, bodyBlock.getParent());
  }

  @Test
  public void basicBlock_givenParentInForLoop_shouldRecognizeLoop() {
    Node forNode = new Node(Token.FOR);
    Node body = new Node(Token.BLOCK);
    forNode.addChildToBack(body);

    ReferenceCollectingCallback.BasicBlock parentBlock =
        new ReferenceCollectingCallback.BasicBlock(null, forNode);
    ReferenceCollectingCallback.BasicBlock bodyBlock =
        new ReferenceCollectingCallback.BasicBlock(parentBlock, body);

    Assert.assertEquals(parentBlock, bodyBlock.getParent());
  }

  @Test
  public void basicBlock_provablyExecutesBefore_givenSameBlock_shouldReturnTrue() {
    Node root = new Node(Token.BLOCK);
    ReferenceCollectingCallback.BasicBlock block =
        new ReferenceCollectingCallback.BasicBlock(null, root);

    Assert.assertTrue(block.provablyExecutesBefore(block));
  }

  @Test
  public void basicBlock_provablyExecutesBefore_givenAncestorBlock_shouldReturnTrue() {
    Node root = new Node(Token.BLOCK);
    Node child = new Node(Token.BLOCK);
    root.addChildToBack(child);

    ReferenceCollectingCallback.BasicBlock rootBlock =
        new ReferenceCollectingCallback.BasicBlock(null, root);
    ReferenceCollectingCallback.BasicBlock childBlock =
        new ReferenceCollectingCallback.BasicBlock(rootBlock, child);

    Assert.assertTrue(rootBlock.provablyExecutesBefore(childBlock));
    Assert.assertFalse(childBlock.provablyExecutesBefore(rootBlock));
  }

  @Test
  public void basicBlock_provablyExecutesBefore_givenBothGlobalScopeBlocks_shouldReturnTrue() {
    Node root1 = new Node(Token.BLOCK);
    Node root2 = new Node(Token.BLOCK);