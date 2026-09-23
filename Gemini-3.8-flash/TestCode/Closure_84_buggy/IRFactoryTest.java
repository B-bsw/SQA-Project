```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class IRFactoryTest {

    private IRFactory factory;

    @Before
    public void setUp() {
        factory = new IRFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testTransformTreeWithNullComments() {
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot root = 
            new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
        root.setComments(null);
        Node result = IRFactory.transformTree(root, null, null);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithNonParsedJSDoc() {
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot root = 
            new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
        Comment comment = new Comment(0, 0, com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.JSDOC, "test");
        comment.setParsed(false);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(comment);
        root.setComments(comments);
        Node result = IRFactory.transformTree(root, null, null);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransformWithCatchClauseNoCondition() {
        CatchClause clause = new CatchClause();
        clause.setCatchCondition(null);
        clause.setCatchVar(new Name(0, "e"));
        TryStatement tryStmt = new TryStatement();
        tryStmt.setCatchClauses(java.util.Collections.singletonList(clause));
        factory.transform(tryStmt);
    }

    @Test
    public void testTransformBreakWithLabel() {
        BreakStatement br = new BreakStatement();
        Label label = new Label();
        label.setName("outer");
        br.setBreakLabel(label);
        Node result = factory.transform(br);
        assertNotNull(result);
        assertEquals(Token.BREAK, result.getType());
    }

    @Test
    public void testTransformContinueWithoutLabel() {
        ContinueStatement cont = new ContinueStatement();
        Node result = factory.transform(cont);
        assertNotNull(result);
    }
}