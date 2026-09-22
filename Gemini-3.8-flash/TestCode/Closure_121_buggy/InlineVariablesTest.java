package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InlineVariablesTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void constructor_givenVariousModes_shouldInstantiatePass() {
        // Arrange & Act
        InlineVariables passAll = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);
        InlineVariables passLocals = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, false);
        InlineVariables passConstants = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);

        // Assert
        Assert.assertNotNull(passAll);
        Assert.assertNotNull(passLocals);
        Assert.assertNotNull(passConstants);
    }

    @Test
    public void process_givenEmptyRoot_shouldCompleteGracefully() {
        // Arrange
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertNotNull(root);
    }

    @Test
    public void process_givenConstantsOnlyMode_shouldProcessSuccessfully() {
        // Arrange
        String js = "var CONSTANT = 10; var b = CONSTANT + 2;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenLocalsOnlyMode_shouldProcessSuccessfully() {
        // Arrange
        String js = "function test() { var a = 1; var b = a + 1; return b; }";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, false);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenAllModeWithCandidateVariables_shouldProcessSuccessfully() {
        // Arrange
        String js = "var x = 'hello'; var y = x + ' world';";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenReassignedVariable_shouldNotThrowAndComplete() {
        // Arrange
        String js = "var a = 1; a = 2; var c = a;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenSelfReferencingAssignment_shouldProcessSafely() {
        // Arrange
        String js = "var a = a || {}; var b = a;";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void process_givenCapturedVariableInsideInnerFunction_shouldProcessSafely() {
        // Arrange
        String js = "function outer() { var a = 1; function inner() { return a; } return inner(); }";
        Node externs = new Node(Token.BLOCK);
        Node root = compiler.parseTestCode(js);
        InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);

        // Act
        pass.process(externs, root);

        // Assert
        Assert.assertEquals(0, compiler.getErrorCount());
    }
}
