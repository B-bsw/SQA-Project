import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.JSDocInfo;

public class JsDocInfoParserTest {
    private JsDocInfoParser parser;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        parser = new JsDocInfoParser(registry);
    }

    @After
    public void tearDown() {
        parser = null;
        registry = null;
    }

    @Test
    public void testParseTypeStringSimpleType() {
        Node result = JsDocInfoParser.parseTypeString("string");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testParseTypeStringNullType() {
        Node result = JsDocInfoParser.parseTypeString("null");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("null", result.getString());
    }

    @Test
    public void testParseTypeStringFunctionType() {
        Node result = JsDocInfoParser.parseTypeString("function(string, number): boolean");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
    }

    @Test
    public void testParseTypeStringUnionType() {
        Node result = JsDocInfoParser.parseTypeString("(string|number)");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
    }

    @Test
    public void testParseTypeStringArrayType() {
        Node result = JsDocInfoParser.parseTypeString("[number]");
        assertNotNull(result);
        assertEquals(Token.LB, result.getType());
    }

    @Test
    public void testParseTypeStringRecordType() {
        Node result = JsDocInfoParser.parseTypeString("{key: string}");
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
    }

    @Test
    public void testParseTypeStringGenericType() {
        Node result = JsDocInfoParser.parseTypeString("Array.<string>");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringEmptyString() {
        assertNull(JsDocInfoParser.parseTypeString(""));
    }

    @Test
    public void testParseTypeStringNullInput() {
        assertNull(JsDocInfoParser.parseTypeString(null));
    }

    @Test
    public void testParseTypeStringUnknownType() {
        assertNull(JsDocInfoParser.parseTypeString("unknownType"));
    }

    @Test
    public void testParseTypeStringVarArgsType() {
        Node result = JsDocInfoParser.parseTypeString("...number");
        assertNotNull(result);
        assertEquals(Token.ELLIPSIS, result.getType());
    }

    @Test
    public void testParseTypeStringOptionalType() {
        Node result = JsDocInfoParser.parseTypeString("=number");
        assertNotNull(result);
        assertEquals(Token.EQUALS, result.getType());
    }

    @Test
    public void testParseTypeStringNullableType() {
        Node result = JsDocInfoParser.parseTypeString("?number");
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
    }

    @Test
    public void testParseTypeStringNonNullableType() {
        Node result = JsDocInfoParser.parseTypeString("!number");
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
    }

    @Test
    public void testParseTypeStringEllipsisWithNullInner() {
        Node result = JsDocInfoParser.parseTypeString("...");
        assertNotNull(result);
        assertEquals(Token.ELLIPSIS, result.getType());
    }

    @Test
    public void testParseTypeStringFunctionWithRestArgs() {
        Node result = JsDocInfoParser.parseTypeString("function(...string): void");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
    }

    @Test
    public void testParseTypeStringFunctionOptionalParam() {
        Node result = JsDocInfoParser.parseTypeString("function(string=): void");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringFunctionVarArgs() {
        Node result = JsDocInfoParser.parseTypeString("function(...string): void");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringFunctionNoReturnType() {
        Node result = JsDocInfoParser.parseTypeString("function(string)");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
    }

    @Test
    public void testParseTypeStringInvalidFunctionNoLP() {
        assertNull(JsDocInfoParser.parseTypeString("function string)"));
    }

    @Test
    public void testParseTypeStringInvalidFunctionNoRP() {
        assertNull(JsDocInfoParser.parseTypeString("function(string"));
    }

    @Test
    public void testParseTypeStringInvalidArrayMissingRB() {
        assertNull(JsDocInfoParser.parseTypeString("[number"));
    }

    @Test
    public void testParseTypeStringInvalidRecordMissingRC() {
        assertNull(JsDocInfoParser.parseTypeString("{key: string"));
    }

    @Test
    public void testParseTypeStringInvalidUnionMissingRP() {
        assertNull(JsDocInfoParser.parseTypeString("(string|number"));
    }

    @Test
    public void testParseTypeStringInvalidUnionMissingPipe() {
        assertNull(JsDocInfoParser.parseTypeString("(string number)"));
    }

    @Test
    public void testParseTypeStringInvalidGenericMissingGT() {
        assertNull(JsDocInfoParser.parseTypeString("Array.<string"));
    }

    @Test
    public void testParseTypeStringInvalidGenericMissingComma() {
        Node result = JsDocInfoParser.parseTypeString("Array.<string number>");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringRecordWithMultipleFields() {
        Node result = JsDocInfoParser.parseTypeString("{key1: string, key2: number}");
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
    }

    @Test
    public void testParseTypeStringRecordWithDottedFieldName() {
        Node result = JsDocInfoParser.parseTypeString("{obj.key: string}");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringNestedRecord() {
        Node result = JsDocInfoParser.parseTypeString("{outer: {inner: string}}");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringUnionWithFunction() {
        Node result = JsDocInfoParser.parseTypeString("(function(): void|number)");
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
    }

    @Test
    public void testParseTypeStringUnionWithRecord() {
        Node result = JsDocInfoParser.parseTypeString("({a: string}|number)");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringUnionWithArray() {
        Node result = JsDocInfoParser.parseTypeString("([number]|string)");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringThisType() {
        Node result = JsDocInfoParser.parseTypeString("this: {a: string}");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringThisTypeNoColon() {
        Node result = JsDocInfoParser.parseTypeString("this");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringVarArgsWithUnion() {
        Node result = JsDocInfoParser.parseTypeString("...(string|number)");
        assertNotNull(result);
        assertEquals(Token.ELLIPSIS, result.getType());
    }

    @Test
    public void testReportTypeSyntaxWarning() {
        assertNull(JsDocInfoParser.parseTypeString("function(:)"));
    }

    @Test
    public void testReportGenericTypeSyntaxWarning() {
        assertNull(JsDocInfoParser.parseTypeString("@"));
    }

    @Test
    public void testExtractionInfoGetStringAndToken() {
        JsDocInfoParser.ExtractionInfo info = new JsDocInfoParser.ExtractionInfo("test", JsDocToken.STRING);
        assertEquals("test", info.getString());
        assertEquals(JsDocToken.STRING, info.getToken());
    }

    @Test
    public void testParseTypeStringFunctionTypeWithColonValid() {
        Node result = JsDocInfoParser.parseTypeString("function(): void");
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
    }

    @Test
    public void testParseTypeStringFunctionTypeWithColonInvalidReturn() {
        Node result = JsDocInfoParser.parseTypeString("function(): invalidType");
        assertNotNull(result);
    }

    @Test
    public void testParseTypeStringStringLiteral() {
        Node result = JsDocInfoParser.parseTypeString("\"quoted\"");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
    }

    @Test
    public void testParseTypeStringNumberLiteral() {
        Node result = JsDocInfoParser.parseTypeString("123");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
    }

    @Test
    public void testParseTypeStringBooleanLiteral() {
        Node result = JsDocInfoParser.parseTypeString("true");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
    }
}