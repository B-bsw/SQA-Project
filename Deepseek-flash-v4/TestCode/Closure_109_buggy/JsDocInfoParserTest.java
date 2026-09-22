package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class JsDocInfoParserTest {

    @Test
    public void testParseTypeString_basicType() {
        Node result = JsDocInfoParser.parseTypeString("string");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getToken());
    }
}