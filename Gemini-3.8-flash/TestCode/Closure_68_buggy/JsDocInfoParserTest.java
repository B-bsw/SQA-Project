package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class JsDocInfoParserTest {

    private JsDocInfoParser parser;
    private JsDocInfoBuilder builder;
    private ErrorReporterParser errorReporter;

    private static class TestErrorReporter implements ErrorReporter {
        boolean errorReported = false;
        boolean warningReported = false;
        String lastMessage;

        @Override
        public void error(String message, String sourceName, int lineno, int lineOffset) {
            errorReported = true;
            lastMessage = message;
        }

        @Override
        public void warning(String message, String sourceName, int lineno, int lineOffset) {
            warningReported = true;
            lastMessage = message;
        }
    }

    @Before
    public void setUp() {
        builder = new JsDocInfoBuilder(true);
        errorReporter = new TestErrorReporter();
        parser = new JsDocInfoParser(builder, errorReporter);
    }

    @Test
    public void testParseEmptyString() {
        String comment = "";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
        assertTrue(info.isEmpty());
    }

    @Test
    public void testParseNullComment() {
        try {
            parser.parse(null, 0, 0, true);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseSimpleDescription() {
        String comment = "Hello world";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
        assertTrue(info.getDescription() != null && info.getDescription().contains("Hello"));
    }

    @Test
    public void testParseAuthorAnnotation() {
        String comment = "@author John";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
    }

    @Test
    public void testParseConstructorAnnotation() {
        String comment = "@constructor";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
        assertTrue(info.isConstructor());
    }

    @Test
    public void testParseTypeExpression() {
        JSDocInfo info = parser.parse("@type {string}", 0, 0, true);
        assertNotNull(info);
        assertNotNull(info.getType());
    }

    @Test
    public void testParseInvalidTypeExpression() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        p.parse("@type {invalid{", 0, 0, true);
        assertTrue("Expected error reported", reporter.errorReported);
    }

    @Test
    public void testParseFunctionType() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@type {function(string):number}", 0, 0, true);
        assertNotNull(info);
        assertNotNull(info.getType());
    }

    @Test
    public void testParseVarArgsType() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@param {...number} args", 0, 0, true);
        assertNotNull(info);
    }

    @Test
    public void testParseRecordType() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@type {{a: number, b: string}}", 0, 0, true);
        assertNotNull(info);
        assertNotNull(info.getType());
    }

    @Test
    public void testParseUnionType() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@type {number|string|null}", 0, 0, true);
        assertNotNull(info);
        assertNotNull(info.getType());
    }

    @Test
    public void testParseArrayType() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@type {Array<number>}", 0, 0, true);
        assertNotNull(info);
        assertNotNull(info.getType());
    }

    @Test
    public void testParsePreserveWhitespace() {
        String comment = "line1\n * line2\n * line3";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
    }

    @Test
    public void testParseNoImplicitCast() {
        parser.parse("@noimplicitcast", 0, 0, true);
        assertTrue(builder.hasNoImplicitCast());
    }

    @Test
    public void testParseDeprecatedWithReason() {
        String comment = "@deprecated Use new method";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
        assertTrue(info.isDeprecated());
        assertEquals("Use new method", info.getDeprecationReason());
    }

    @Test
    public void testParseDeprecatedWithoutReason() {
        JSDocInfo info = parser.parse("@deprecated", 0, 0, true);
        assertNotNull(info);
        assertTrue(info.isDeprecated());
    }

    @Test
    public void testParseSuppress() {
        JSDocInfo info = parser.parse("@suppress {visibility|deprecated}", 0, 0, true);
        assertNotNull(info);
        assertTrue(info.getSuppressions().contains("visibility"));
        assertTrue(info.getSuppressions().contains("deprecated"));
    }

    @Test
    public void testParseFileOverview() {
        JSDocInfo info = parser.parse("@fileoverview This is a file", 0, 0, true);
        assertNotNull(info);
        assertEquals("This is a file", info.getFileOverview());
    }

    @Test
    public void testParseModifies() {
        JSDocInfo info = parser.parse("@modifies {this}", 0, 0, true);
        assertNotNull(info);
        assertTrue(info.getModifies().contains("this"));
    }

    @Test
    public void testParseNonSingleLineExtraction() {
        String comment = "* first\n * second\n * third";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
    }

    @Test
    public void testParseWhitespaceOptionSingleLine() {
        String comment = "@author John Doe";
        JSDocInfo info = parser.parse(comment, 0, 0, true);
        assertNotNull(info);
    }

    @Test
    public void testParseMultiLineType() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@param {string} name\n@return {number}", 0, 0, true);
        assertNotNull(info);
    }

    @Test
    public void testParseRecordTypeWithTypeNode() {
        TestErrorReporter reporter = new TestErrorReporter();
        JsDocInfoParser p = new JsDocInfoParser(new JsDocInfoBuilder(true), reporter);
        JSDocInfo info = p.parse("@type {{foo: string, bar: number}}", 0, 0, true);
        assertNotNull(info);
        assertNotNull(info.getType());
        assertTrue(info.getType().isRecordType());
    }

    @Test
    public void testParseSimpleTypeName() {
        String typeString = "string";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
    }

    @Test
    public void testParseNullTypeString() {
        try {
            JsDocInfoParser.parseTypeString(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseEmptyTypeString() {
        Node result = JsDocInfoParser.parseTypeString("");
        assertNotNull(result);
    }

    @Test
    public void testParseFunctionTypeString() {
        Node result = JsDocInfoParser.parseTypeString("function(string):number");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
    }

    @Test
    public void testParseOptionalType() {
        Node result = JsDocInfoParser.parseTypeString("?number");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
    }

    @Test
    public void testParseVarArgsInTypeString() {
        Node result = JsDocInfoParser.parseTypeString("...number");
        assertNotNull(result);
        assertEquals(Token.ELLIPSIS, result.getType());
    }

    @Test
    public void testParseUnionTypeString() {
        Node result = JsDocInfoParser.parseTypeString("number|string|null");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
    }

    @Test
    public void testParseRecordTypeString() {
        Node result = JsDocInfoParser.parseTypeString("{{a:number,b:string}}");
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
    }

    @Test
    public void testParseArrayTypeString() {
        Node result = JsDocInfoParser.parseTypeString("Array<number>");
        assertNotNull(result);
        assertEquals(Token.ARRAY, result.getType());
    }
}