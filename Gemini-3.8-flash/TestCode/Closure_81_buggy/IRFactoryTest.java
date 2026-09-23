package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.mozilla.rhino.ast.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;

public class IRFactoryTest {
    private IRFactory irFactory;
    private ErrorReporter errorReporter;
    private AstRoot astRoot;

    @Before
    public void setUp() {
        errorReporter = new ErrorReporter() {
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
        };
        irFactory = new IRFactory(errorReporter, null, null);
        astRoot = new AstRoot();
    }

    @Test
    public void testTransformTreeNullComments() {
        astRoot.setComments(null);
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testTransformTreeWithCommentsButNoJSDoc() {
        Comment comment = new Comment(0, "", 0, null);
        comment.setCommentType(com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.BLOCK);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(comment);
        astRoot.setComments(comments);
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithJSDocUnparsed() throws Exception {
        Comment jsDocComment = new Comment(0, "/** test */", 0, null);
        jsDocComment.setCommentType(JSDOC);
        jsDocComment.setParsed(false);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(jsDocComment);
        astRoot.setComments(comments);
        
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }

    private static final com.google.javascript.jscomp.mozilla.rhino.Token.CommentType JSDOC = 
        com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.JSDOC;

    @Test
    public void testTransformTreeWithFileOverviewJSDoc() throws Exception {
        Comment jsDocComment = new Comment(0, "/** @fileoverview test */", 0, null);
        jsDocComment.setCommentType(JSDOC);
        jsDocComment.setParsed(true);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(jsDocComment);
        astRoot.setComments(comments);
        
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithFileOverviewAndProcessedInfo() throws Exception {
        Comment jsDocComment = new Comment(0, "/** @fileoverview test */", 0, null);
        jsDocComment.setCommentType(JSDOC);
        jsDocComment.setParsed(true);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(jsDocComment);
        astRoot.setComments(comments);
        
        // Mock jsDocParser to return non-null info
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithEmptyCommentType() {
        Comment comment = new Comment(0, "/** test */", 0, null);
        comment.setCommentType(com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.BLOCK);
        comment.setParsed(true);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(comment);
        astRoot.setComments(comments);
        
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testTransformTreeWithNullCommentType() {
        Comment comment = new Comment(0, "", 0, null);
        comment.setCommentType(null);
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(comment);
        astRoot.setComments(comments);
        
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithMultipleCommentsIncludingJSDoc() throws Exception {
        Comment blockComment = new Comment(1, "/* normal */", 1, null);
        blockComment.setCommentType(com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.BLOCK);
        
        Comment jsDocComment = new Comment(2, "/** @return {number} */", 2, null);
        jsDocComment.setCommentType(JSDOC);
        jsDocComment.setParsed(false);
        
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(blockComment);
        comments.add(jsDocComment);
        astRoot.setComments(comments);
        
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeNoComments() {
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testTransformTreeWithExistingJSDocInfo() throws Exception {
        JSDocInfo jsdocInfo = new JSDocInfo();
        astRoot.setJSDocInfo(jsdocInfo);
        
        Comment jsDocComment = new Comment(0, "/** test */", 0, null);
        jsDocComment.setCommentType(JSDOC);
        jsDocComment.setParsed(true);
        jsDocComment.setJSDocInfo(jsdocInfo);
        
        java.util.List<Comment> comments = new java.util.ArrayList<>();
        comments.add(jsDocComment);
        astRoot.setComments(comments);
        
        Node result = IRFactory.transformTree(astRoot, errorReporter);
        assertNotNull(result);
    }
}