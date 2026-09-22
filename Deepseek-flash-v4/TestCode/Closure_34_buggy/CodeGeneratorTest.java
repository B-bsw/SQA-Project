package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

    private CodeGenerator generator;
    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = new CodeGenerator(consumer);
    }

    @Test
    public void testConstructorDefaultCharset() {
        generator = new CodeGenerator(new TestCodeConsumer());
        assertNull(generator.outputCharsetEncoder);
    }

    @Test
    public void testConstructorAsciiCharset() {
        generator = new CodeGenerator(new TestCodeConsumer(), Charsets.US_ASCII);
        assertNull(generator.outputCharsetEncoder);
    }

    @Test
    public void testConstructorUtf8Charset() {
        generator = new CodeGenerator(new TestCodeConsumer(), StandardCharsets.UTF_8);
        assertTrue(generator.outputCharsetEncoder != null);
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getCode());
    }

    @Test
    public void testAddString() {
        generator.add("hello");
        assertEquals("hello", consumer.getCode());
    }

    @Test
    public void testAddNullNode() {
        generator.add((Node) null);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testAddNumberNode() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(3.14);
        generator.add(n);
        assertEquals("3.14", consumer.getCode());
    }

    @Test
    public void testAddNameNode() {
        Node n = new Node(Token.NAME, "x");
        generator.add(n);
        assertEquals("x", consumer.getCode());
    }

    @Test
    public void testAddVarNode() {
        Node n = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "a");
        Node value = new Node(Token.NUMBER);
        value.setDouble(5);
        name.addChildToBack(value);
        n.addChildToBack(name);
        generator.add(n);
        assertEquals("var a=5", consumer.getCode());
    }

    @Test
    public void testAddReturnWithValue() {
        Node n = new Node(Token.RETURN);
        Node val = new Node(Token.NUMBER);
        val.setDouble(42);
        n.addChildToBack(val);
        generator.add(n);
        assertEquals("return 42", consumer.getCode());
    }

    @Test
    public void testAddReturnNoValue() {
        Node n = new Node(Token.RETURN);
        generator.add(n);
        assertEquals("return", consumer.getCode());
    }

    @Test
    public void testAddThrow() {
        Node n = new Node(Token.THROW);
        Node name = new Node(Token.NAME, "e");
        n.addChildToBack(name);
        generator.add(n);
        assertEquals("throw e", consumer.getCode());
    }

    @Test
    public void testAddFunctionDeclaration() {
        Node fun = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME, "foo");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        fun.addChildToBack(name);
        fun.addChildToBack(params);
        fun.addChildToBack(body);
        generator.add(fun);
        assertEquals("function foo()", consumer.getCode());
    }
}