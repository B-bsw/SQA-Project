package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class JsDocInfoParserTest {
    private static final String STREAM_FUNCTION = "function";
    private JsDocInfoParser parser;
    private static class TestJsDocInfoParser extends JsDocInfoParser {
        TestJsDocInfoParser(String comment, String associatedNode, Config config, ErrorReporter errorReporter) {
            super(comment, associatedNode, config, errorReporter);
        }
        private TestJsDocInfoParser() { super(null, null, null, null); } // Placeholder, override to avoid NPE
    }

    @Before
    public void setUp() {
        // Initialize with a minimal configuration to avoid NPEs - override abstract methods
        parser = new JsDocInfoParser("", "", new Config(LanguageMode.ECMASCRIPT3, false), null) {
            @Override
            protected boolean parseTypeExpression() { return false; }
            @Override
            protected boolean parseTopLevelTypeExpression() { return false; }
            @Override
            protected boolean parseTypeExpressionAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternate() { return false; }
            @Override
            protected boolean parseUnionType() { return false; }
            @Override
            protected boolean parseUnionTypeWithAlternate() { return false; }
            @Override
            protected boolean parseUnionTypeExpression() { return false; }
            @Override
            protected boolean parsePostfixedType() { return false; }
            @Override
            protected boolean parsePostfixedTypeWithAlternate() { return false; }
            @Override
            protected boolean parsePrefixType() { return false; }
            @Override
            protected boolean parsePrefixTypeWithAlternate() { return false; }
            @Override
            protected boolean parseBasicTypeExpression() { return false; }
            @Override
            protected boolean parseBasicTypeExpressionWithAlternate() { return false; }
            @Override
            protected boolean parseFunctionType() { return false; }
            @Override
            protected boolean parseFunctionTypeWithAlternate() { return false; }
            @Override
            protected boolean parseRecordType() { return false; }
            @Override
            protected boolean parseRecordTypeWithAlternate() { return false; }
            @Override
            protected boolean parseArrayType() { return false; }
            @Override
            protected boolean parseArrayTypeWithAlternate() { return false; }
            @Override
            protected boolean parseTypeName() { return false; }
            @Override
            protected boolean parseTypeNameWithAlternate() { return false; }
            @Override
            protected boolean parseTypeNameExpression() { return false; }
            @Override
            protected boolean parseTypeNameExpressionWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternates() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
            @Override
            protected boolean parseTypeExpressionWithAlternatesAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternateWithAlternate() { return false; }
        };
    }

    @Test
    public void testTrimStars() throws Exception {
        assertEquals("", JsDocInfoParser.trimStars(""));
        assertEquals("a", JsDocInfoParser.trimStars("a"));
        assertEquals("a", JsDocInfoParser.trimStars("*a"));
        assertEquals("a", JsDocInfoParser.trimStars("**a**"));
        assertEquals("a b", JsDocInfoParser.trimStars(" * a b * "));
        assertEquals("a", JsDocInfoParser.trimStars("*a*"));
        assertEquals("a * b", JsDocInfoParser.trimStars("*a * b*"));
        assertEquals("a", JsDocInfoParser.trimStars("*a"));
        assertEquals("a", JsDocInfoParser.trimStars("***a***"));
        assertEquals("a", JsDocInfoParser.trimStars(" ** a ** "));
        assertEquals("", JsDocInfoParser.trimStars("***"));
    }

    @Test
    public void testParseStringLiteral() throws Exception {
        assertEquals("abc", JsDocInfoParser.parseStringLiteral("\"abc\""));
        assertEquals("a\"b", JsDocInfoParser.parseStringLiteral("\"a\\\"b\""));
        assertEquals("a\\b", JsDocInfoParser.parseStringLiteral("\"a\\\\b\""));
        assertEquals("", JsDocInfoParser.parseStringLiteral("\"\""));
        assertNull(JsDocInfoParser.parseStringLiteral("abc"));
        assertNull(JsDocInfoParser.parseStringLiteral("\"abc"));
        assertNull(JsDocInfoParser.parseStringLiteral(""));
        assertNull(JsDocInfoParser.parseStringLiteral(null));
    }

    @Test
    public void testExtractMultilineTextualBlock() throws Exception {
        JsDocInfoParser parserObj = new JsDocInfoParser("", "", new Config(LanguageMode.ECMASCRIPT3, false), null) {
            protected ExtractionInfo extractMultilineTextualBlock(JsDocToken token, WhitespaceOption option) {
                return null;
            }
        };
        assertNotNull(parserObj.extractMultilineTextualBlock(new JsDocToken(JsDocToken.STRING, 0, 0), WhitespaceOption.SINGLE_LINE));
    }

    @Test
    public void testParseTypeExpressionWithAlternate() throws Exception {
        JsDocInfoParser parserObj = new JsDocInfoParser("", "", new Config(LanguageMode.ECMASCRIPT3, false), null) {
            protected boolean parseTypeExpression() { return false; }
        };
        assertNotNull(parserObj.parseTypeExpressionWithAlternate(new JsDocToken(JsDocToken.STRING, 0, 0)));
    }
}