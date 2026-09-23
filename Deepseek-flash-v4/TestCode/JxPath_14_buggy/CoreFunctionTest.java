package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.InfoSetUtil;

public class CoreFunctionTest {

    private CoreFunction function;
    private EvalContext mockContext;

    @Before
    public void setUp() {
        mockContext = new MockEvalContext();
    }

    @Test
    public void testGetFunctionCode() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertEquals(Compiler.FUNCTION_LAST, function.getFunctionCode());
    }

    @Test
    public void testGetFunctionName() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertEquals("last", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        assertEquals("position", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        assertEquals("count", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_ID, null);
        assertEquals("id", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, null);
        assertEquals("local-name", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, null);
        assertEquals("namespace-uri", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_NAME, null);
        assertEquals("name", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_STRING, null);
        assertEquals("string", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_CONCAT, null);
        assertEquals("concat", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, null);
        assertEquals("starts-with", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_CONTAINS, null);
        assertEquals("contains", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, null);
        assertEquals("substring-before", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, null);
        assertEquals("substring-after", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, null);
        assertEquals("substring", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, null);
        assertEquals("string-length", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, null);
        assertEquals("normalize-space", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_TRANSLATE, null);
        assertEquals("translate", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertEquals("boolean", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_NOT, null);
        assertEquals("not", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_FALSE, null);
        assertEquals("false", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_LANG, null);
        assertEquals("lang", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_NUMBER, null);
        assertEquals("number", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_SUM, null);
        assertEquals("sum", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_FLOOR, null);
        assertEquals("floor", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_CEILING, null);
        assertEquals("ceiling", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_ROUND, null);
        assertEquals("round", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_KEY, null);
        assertEquals("key", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, null);
        assertEquals("format-number", function.getFunctionName());
        function = new CoreFunction(999, null);
        assertEquals("unknownFunction999()", function.getFunctionName());
    }

    @Test
    public void testGetArgumentCount() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertEquals(0, function.getArgumentCount());
        Expression[] args = new Expression[] { new Constant("a"), new Constant("b") };
        function = new CoreFunction(Compiler.FUNCTION_CONCAT, args);
        assertEquals(2, function.getArgumentCount());
    }

    @Test
    public void testComputeContextDependent() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertTrue(function.computeContextDependent());
        function = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        assertTrue(function.computeContextDependent());
        function = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        assertFalse(function.computeContextDependent());
        function = new CoreFunction(Compiler.FUNCTION_ID, null);
        assertFalse(function.computeContextDependent());
        function = new CoreFunction(Compiler.FUNCTION_LANG, null);
        assertTrue(function.computeContextDependent());
        function = new CoreFunction(Compiler.FUNCTION_NUMBER, null);
        assertTrue(function.computeContextDependent());
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertTrue(function.computeContextDependent());
    }

    @Test
    public void testFunctionLast() {
        MockEvalContext ctx = new MockEvalContext();
        ctx.setCurrentPosition(1);
        ctx.setHasNext(true, 3);
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        Object result = function.functionLast(ctx);
        assertEquals(3, ((Number) result).intValue());
    }

    @Test
    public void testFunctionPosition() {
        MockEvalContext ctx = new MockEvalContext();
        ctx.setCurrentPosition(5);
        function = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        Object result = function.functionPosition(ctx);
        assertEquals(5, ((Number) result).intValue());
    }

    @Test
    public void testFunctionCount() {
        Expression[] args = new Expression[] { new Constant("a") };
        function = new CoreFunction(Compiler.FUNCTION_COUNT, args);
        Object result = function.functionCount(mockContext);
        assertEquals(1, ((Number) result).intValue());
    }

    @Test
    public void testFunctionString() {
        Expression[] args = new Expression[] { new Constant("test") };
        function = new CoreFunction(Compiler.FUNCTION_STRING, args);
        Object result = function.functionString(mockContext);
        assertEquals("test", result);
    }

    @Test
    public void testFunctionConcat() {
        Expression[] args = new Expression[] { new Constant("Hello"), new Constant(" "), new Constant("World") };
        function = new CoreFunction(Compiler.FUNCTION_CONCAT, args);
        Object result = function.functionConcat(mockContext);
        assertEquals("Hello World", result);
    }

    @Test
    public void testFunctionStartsWith() {
        Expression[] args = new Expression[] { new Constant("hello"), new Constant("he") };
        function = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, args);
        Object result = function.functionStartsWith(mockContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testFunctionContains() {
        Expression[] args = new Expression[] { new Constant("hello"), new Constant("ell") };
        function = new CoreFunction(Compiler.FUNCTION_CONTAINS, args);
        Object result = function.functionContains(mockContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testFunctionSubstringBefore() {
        Expression[] args = new Expression[] { new Constant("hello world"), new Constant(" ") };
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, args);
        Object result = function.functionSubstringBefore(mockContext);
        assertEquals("hello", result);
    }

    @Test
    public void testFunctionSubstringAfter() {
        Expression[] args = new Expression[] { new Constant("hello world"), new Constant(" ") };
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, args);
        Object result = function.functionSubstringAfter(mockContext);
        assertEquals("world", result);
    }

    @Test
    public void testFunctionSubstring() {
        Expression[] args = new Expression[] { new Constant("hello"), new Constant(2) };
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        Object result = function.functionSubstring(mockContext);
        assertEquals("ello", result);
    }

    @Test
    public void testFunctionStringLength() {
        Expression[] args = new Expression[] { new Constant("hello") };
        function = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, args);
        Object result = function.functionStringLength(mockContext);
        assertEquals(5, ((Number) result).intValue());
    }

    @Test
    public void testFunctionNormalizeSpace() {
        Expression[] args = new Expression[] { new Constant("  hello   world  ") };
        function = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, args);
        Object result = function.functionNormalizeSpace(mockContext);
        assertEquals("hello world", result);
    }

    @Test
    public void testFunctionBoolean() {
        Expression[] args = new Expression[] { new Constant("true") };
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, args);
        Object result = function.functionBoolean(mockContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testFunctionNot() {
        Expression[] args = new Expression[] { new Constant(false) };
        function = new CoreFunction(Compiler.FUNCTION_NOT, args);
        Object result = function.functionNot(mockContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testFunctionTrue() {
        function = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        Object result = function.functionTrue(mockContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testFunctionFalse() {
        function = new CoreFunction(Compiler.FUNCTION_FALSE, null);
        Object result = function.functionFalse(mockContext);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testFunctionLang() {
        Expression[] args = new Expression[] { new Constant("en") };
        function = new CoreFunction(Compiler.FUNCTION_LANG, args);
        Object result = function.functionLang(mockContext);
        assertNotNull(result);
    }

    @Test
    public void testFunctionNumber() {
        Expression[] args = new Expression[] { new Constant("123") };
        function = new CoreFunction(Compiler.FUNCTION_NUMBER, args);
        Object result = function.functionNumber(mockContext);
        assertEquals(123.0, ((Number) result).doubleValue(), 0.001);
    }

    @Test
    public void testFunctionSum() {
        Expression[] args = new Expression[] { new Constant(1), new Constant(2) };
        function = new CoreFunction(Compiler.FUNCTION_SUM, args);
        Object result = function.functionSum(mockContext);
        assertEquals(3.0, ((Number) result).doubleValue(), 0.001);
    }

    @Test
    public void testFunctionFloor() {
        Expression[] args = new Expression[] { new Constant(3.7) };
        function = new CoreFunction(Compiler.FUNCTION_FLOOR, args);
        Object result = function.functionFloor(mockContext);
        assertEquals(3.0, ((Number) result).doubleValue(), 0.001);
    }

    @Test
    public void testFunctionCeiling() {
        Expression[] args = new Expression[] { new Constant(3.2) };
        function = new CoreFunction(Compiler.FUNCTION_CEILING, args);
        Object result = function.functionCeiling(mockContext);
        assertEquals(4.0, ((Number) result).doubleValue(), 0.001);
    }

    @Test
    public void testFunctionRound() {
        Expression[] args = new Expression[] { new Constant(3.5) };
        function = new CoreFunction(Compiler.FUNCTION_ROUND, args);
        Object result = function.functionRound(mockContext);
        assertEquals(4L, ((Number) result).longValue());
    }

    @Test
    public void testToString() {
        Expression[] args = new Expression[] { new Constant("a") };
        function = new CoreFunction(Compiler.FUNCTION_STRING, args);
        assertEquals("string(a)", function.toString());
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLastInvalidArgCount() {
        Expression[] args = new Expression[] { new Constant("a") };
        function = new CoreFunction(Compiler.FUNCTION_LAST, args);
        function.functionLast(mockContext);
        fail("Expected JXPathInvalidSyntaxException");
    }

    @Test
    public void testComputeValue() {
        Expression[] args = new Expression[] { new Constant("test") };
        function = new CoreFunction(Compiler.FUNCTION_STRING, args);
        Object result = function.computeValue(mockContext);
        assertEquals("test", result);
    }

    private static class Constant implements Expression {
        private final Object value;

        Constant(Object value) {
            this.value = value;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    private static class MockEvalContext implements EvalContext {
        private int position = 1;
        private int count = 0;
        private int total = 0;
        private boolean hasNext = false;

        void setCurrentPosition(int pos) { this.position = pos; }
        void setHasNext(boolean has, int total) { this.hasNext = has; this.total = total; }

        @Override
        public int getCurrentPosition() { return position; }

        @Override
        public boolean setPosition(int position) { this.position = position; return true; }

        @Override
        public boolean nextNode() {
            if (count < total) { count++; return true; }
            return false;
        }

        @Override
        public boolean next() {
            return nextNode();
        }

        @Override
        public boolean hasNext() {
            return hasNext && count < total;
        }

        @Override
        public Object getNodePointer() { return null; }

        @Override
        public Object getCurrentNodePointer() { return null; }

        @Override
        public Object getContext() { return null; }

        @Override
        public int getSize() { return total; }

        @Override
        public void reset() { count = 0; }

        @Override
        public void setPosition(int pos, boolean reset) { this.position = pos; }

        @Override
        public void setNodePointer(Object pointer) {}

        @Override
        public Object getValue() { return null; }

        @Override
        public void setValue(Object value) {}

        @Override
        public Object getJXPathContext() { return null; }

        @Override
        public void setJXPathContext(JXPathContext context) {}
    }

    private interface Expression {
        Object compute(EvalContext context);
        Object computeValue(EvalContext context);
        boolean isContextDependent();
    }
}