package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollapseVariableDeclarationsTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void constructor_givenCompiler_shouldInstantiate() {
        // Arrange & Act
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Assert
        Assert.assertNotNull(pass);
    }

    @Test
    public void process_givenEmptyRoot_shouldCompleteGracefully() {
        // Arrange
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenMultipleConsecutiveVars_shouldProcessWithoutError() {
        // Arrange
        String js = "var a; var b = 1; var c = 2;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenSingleVar_shouldNotModifyStructure() {
        // Arrange
        String js = "var a = 1;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenNonConsecutiveVars_shouldProcessSuccessfully() {
        // Arrange
        String js = "var a = 1; alert(a); var b = 2;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenFunctionScopedVars_shouldProcessSuccessfully() {
        // Arrange
        String js = "function f() { var x = 1; var y = 2; return x + y; }";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenVarAndChainedAssignment_shouldProcessSuccessfully() {
        // Arrange
        String js = "a = true; b = true; var c = true;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }
}
