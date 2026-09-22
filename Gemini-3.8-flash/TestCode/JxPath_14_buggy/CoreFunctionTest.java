package org.apache.commons.jxpath.ri.compiler;

import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;

import org.junit.Assert;
import org.junit.Test;

public class CoreFunctionTest {

    // -------------------------------------------------------------
    // Helper Test Stub Classes
    // -------------------------------------------------------------

    private static class ConstantExpression extends Expression {
        private Object value;
        private boolean contextDependent;

        public ConstantExpression(Object value) {
            this(value, false);
        }

        public ConstantExpression(Object value, boolean contextDependent) {
            this.value = value;
            this.contextDependent = contextDependent;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public boolean computeContextDependent() {
            return contextDependent;
        }

        public String toString() {
            return String.valueOf(value);
        }
    }

    private static class StubNodePointer extends NodePointer {
        private static final long serialVersionUID = 1L;
        private Object value;
        private QName name;
        private String namespaceURI;
        private String language;
        private Locale locale;

        public StubNodePointer(Object value) {
            this(value, new QName(null, "stubName"), "http://stub.namespace", "en", Locale.ENGLISH);
        }

        public StubNodePointer(Object value, QName name, String namespaceURI, String language, Locale locale) {
            super(null, locale);
            this.value = value;
            this.name = name;
            this.namespaceURI = namespaceURI;
            this.language = language;
            this.locale = locale;
        }

        public QName getName() {
            return name;
        }

        public Object getBaseValue() {
            return value;
        }

        public Object getImmediateNode() {
            return value;
        }

        public Object getValue() {
            return value;
        }

        public int getLength() {
            return 1;
        }

        public boolean isCollection() {
            return false;
        }

        public boolean isLeaf() {
            return true;
        }

        public boolean isActual() {
            return true;
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        public String getNamespaceURI() {
            return namespaceURI;
        }

        public boolean isLanguage(String lang) {
            return language != null && language.equalsIgnoreCase(lang);
        }

        public Locale getLocale() {
            return locale;
        }

        public Pointer getPointerByID(JXPathContext context, String id) {
            return new StubNodePointer("pointer:" + id);
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

    private static class StubJXPathContext extends JXPathContext {
        private Locale locale = Locale.US;
        private NodePointer contextPointer;

        public StubJXPathContext() {
            super(null, null);
        }

        public void setContextPointer(NodePointer contextPointer) {
            this.contextPointer = contextPointer;
        }

        public Pointer getContextPointer() {
            return contextPointer;
        }

        public Locale getLocale() {
            return locale;
        }

        public void setLocale(Locale locale) {
            this.locale = locale;
        }

        public DecimalFormatSymbols getDecimalFormatSymbols(String name) {
            if ("custom".equals(name)) {
                DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.GERMANY);
                return symbols;
            }
            return new DecimalFormatSymbols(Locale.US);
        }

        public NodeSet getNodeSetByKey(String key, Object value) {
            BasicNodeSet ns = new BasicNodeSet();
            ns.add(new StubNodePointer(key + "=" + value));
            return ns;
        }

        public Object getValue(String xpath) { return null; }
        public Object getValue(String xpath, Class requiredType) { return null; }
        public Iterator iterate(String xpath) { return Collections.EMPTY_LIST.iterator(); }
        public Pointer getPointer(String xpath) { return null; }
        public Iterator iteratePointers(String xpath) { return Collections.EMPTY_LIST.iterator(); }
        public Pointer createPath(String xpath) { return null; }
        public Pointer createPathAndSetValue(String xpath, Object value) { return null; }
        public void removePath(String xpath) {}
        public void removeAll(String xpath) {}
        public JXPathContext getParentContext() { return null; }
        public JXPathContext getRelativeContext(Pointer pointer) { return this; }
        public Pointer getVariablePointer(QName name) { return null; }
        public Pointer getNamespaceURI(String prefix) { return null; }
    }

    private static class StubEvalContext extends EvalContext {
        private List nodes;
        private int pos = 0;
        private NodePointer currentNodePointer;
        private StubJXPathContext jxpathContext;

        public StubEvalContext(List nodes) {
            super(null);
            this.nodes = (nodes == null) ? new ArrayList() : new ArrayList(nodes);
            this.jxpathContext = new StubJXPathContext();
            if (this.nodes.size() > 0 && this.nodes.get(0) instanceof NodePointer) {
                this.currentNodePointer = (NodePointer) this.nodes.get(0);
                this.jxpathContext.setContextPointer(this.currentNodePointer);
            }
        }

        public StubEvalContext(NodePointer singleNode) {
            this(singleNode != null ? Collections.singletonList(singleNode) : Collections.EMPTY_LIST);
            this.currentNodePointer = singleNode;
            if (singleNode != null) {
                this.jxpathContext.setContextPointer(singleNode);
            }
        }

        public void setCurrentNodePointer(NodePointer currentNodePointer) {
            this.currentNodePointer = currentNodePointer;
            if (this.jxpathContext != null) {
                this.jxpathContext.setContextPointer(currentNodePointer);
            }
        }

        public StubJXPathContext getJXPathContext() {
            return jxpathContext;
        }

        public NodePointer getCurrentNodePointer() {
            return currentNodePointer;
        }

        public NodePointer getSingleNodePointer() {
            return currentNodePointer;
        }

        public int getCurrentPosition() {
            return pos;
        }

        public boolean setPosition(int position) {
            this.pos = position;
            return position > 0 && position <= nodes.size();
        }

        public void reset() {
            this.pos = 0;
        }

        public boolean nextNode() {
            if (pos < nodes.size()) {
                pos++;
                Object n = nodes.get(pos - 1);
                if (n instanceof NodePointer) {
                    this.currentNodePointer = (NodePointer) n;
                } else {
                    this.currentNodePointer = new StubNodePointer(n);
                }
                return true;
            }
            return false;
        }

        public boolean nextSet() {
            return false;
        }

        public boolean hasNext() {
            return pos < nodes.size();
        }

        public Object next() {
            if (hasNext()) {
                Object n = nodes.get(pos++);
                if (n instanceof NodePointer) {
                    return n;
                }
                return new StubNodePointer(n);
            }
            return null;
        }
    }

    // -------------------------------------------------------------
    // Test: Construction and Basic Accessors
    // -------------------------------------------------------------

    @Test
    public void getFunctionCode_givenCode_shouldReturnSameCode() {
        // Arrange
        int code = Compiler.FUNCTION_LAST;
        Expression[] args = new Expression[0];
        CoreFunction func = new CoreFunction(code, args);

        // Act
        int actualCode = func.getFunctionCode();

        // Assert
        Assert.assertEquals(code, actualCode);
    }

    @Test
    public void getArgumentCount_givenVariousArgs_shouldReturnCorrectLength() {
        // Arrange & Act
        CoreFunction funcNull = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        CoreFunction funcEmpty = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction funcTwo = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[] {
            new ConstantExpression("a"), new ConstantExpression("b")
        });

        // Assert
        Assert.assertEquals(0, funcNull.getArgumentCount());
        Assert.assertEquals(0, funcEmpty.getArgumentCount());
        Assert.assertEquals(2, funcTwo.getArgumentCount());
    }

    @Test
    public void getArgAccessors_givenThreeArgs_shouldReturnExpectedExpressions() {
        // Arrange
        Expression arg1 = new ConstantExpression("1");
        Expression arg2 = new ConstantExpression("2");
        Expression arg3 = new ConstantExpression("3");
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { arg1, arg2, arg3 });

        // Act & Assert
        Assert.assertSame(arg1, func.getArg1());
        Assert.assertSame(arg2, func.getArg2());
        Assert.assertSame(arg3, func.getArg3());
    }

    // -------------------------------------------------------------
    // Test: Function Name Mapping
    // -------------------------------------------------------------

    @Test
    public void getFunctionName_givenKnownAndUnknownCodes_shouldReturnExpectedNames() {
        int[] codes = new int[] {
            Compiler.FUNCTION_LAST, Compiler.FUNCTION_POSITION, Compiler.FUNCTION_COUNT,
            Compiler.FUNCTION_ID, Compiler.FUNCTION_LOCAL_NAME, Compiler.FUNCTION_NAMESPACE_URI,
            Compiler.FUNCTION_NAME, Compiler.FUNCTION_STRING, Compiler.FUNCTION_CONCAT,
            Compiler.FUNCTION_STARTS_WITH, Compiler.FUNCTION_CONTAINS, Compiler.FUNCTION_SUBSTRING_BEFORE,
            Compiler.FUNCTION_SUBSTRING_AFTER, Compiler.FUNCTION_SUBSTRING, Compiler.FUNCTION_STRING_LENGTH,
            Compiler.FUNCTION_NORMALIZE_SPACE, Compiler.FUNCTION_TRANSLATE, Compiler.FUNCTION_BOOLEAN,
            Compiler.FUNCTION_NOT, Compiler.FUNCTION_TRUE, Compiler.FUNCTION_FALSE,
            Compiler.FUNCTION_LANG, Compiler.FUNCTION_NUMBER, Compiler.FUNCTION_SUM,
            Compiler.FUNCTION_FLOOR, Compiler.FUNCTION_CEILING, Compiler.FUNCTION_ROUND,
            Compiler.FUNCTION_KEY, Compiler.FUNCTION_FORMAT_NUMBER
        };

        String[] expectedNames = new String[] {
            "last", "position", "count", "id", "local-name", "namespace-uri", "name",
            "string", "concat", "starts-with", "contains", "substring-before",
            "substring-after", "substring", "string-length", "normalize-space",
            "translate", "boolean", "not", "true", "false", "lang", "number", "sum",
            "floor", "ceiling", "round", "key", "format-number"
        };

        for (int i = 0; i < codes.length; i++) {
            CoreFunction func = new CoreFunction(codes[i], null);
            Assert.assertEquals(expectedNames[i], func.getFunctionName());
        }

        // Unknown function code
        CoreFunction unknownFunc = new CoreFunction(9999, null);
        Assert.assertEquals("unknownFunction9999()", unknownFunc.getFunctionName());
    }

    // -------------------------------------------------------------
    // Test: toString
    // -------------------------------------------------------------

    @Test
    public void toString_givenNullArgs_shouldPrintEmptyArgs() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, null);
        Assert.assertEquals("last()", func.toString());
    }

    @Test
    public void toString_givenMultipleArgs_shouldPrintCommaSeparated() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[] {
            new ConstantExpression("a"), new ConstantExpression("b"), new ConstantExpression("c")
        });
        Assert.assertEquals("concat(a, b, c)", func.toString());
    }

    // -------------------------------------------------------------
    // Test: computeContextDependent
    // -------------------------------------------------------------

    @Test
    public void computeContextDependent_givenSuperContextDependent_shouldReturnTrue() {
        Expression arg = new ConstantExpression("x", true);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[] { arg });
        Assert.assertTrue(func.computeContextDependent());
    }

    @Test
    public void computeContextDependent_givenSpecificCodes_shouldEvaluateProperly() {
        // Last & Position always true
        Assert.assertTrue(new CoreFunction(Compiler.FUNCTION_LAST, null).computeContextDependent());
        Assert.assertTrue(new CoreFunction(Compiler.FUNCTION_POSITION, null).computeContextDependent());

        // Codes that return true when args == null or args.length == 0
        int[] contextWhenZeroArgs = new int[] {
            Compiler.FUNCTION_BOOLEAN, Compiler.FUNCTION_LOCAL_NAME, Compiler.FUNCTION_NAME,
            Compiler.FUNCTION_NAMESPACE_URI, Compiler.FUNCTION_STRING, Compiler.FUNCTION_LANG,
            Compiler.FUNCTION_NUMBER
        };
        for (int i = 0; i < contextWhenZeroArgs.length; i++) {
            CoreFunction fnNull = new CoreFunction(contextWhenZeroArgs[i], null);
            CoreFunction fnEmpty = new CoreFunction(contextWhenZeroArgs[i], new Expression[0]);
            CoreFunction fnWithArg = new CoreFunction(contextWhenZeroArgs[i], new Expression[] { new ConstantExpression("a") });

            Assert.assertTrue(fnNull.computeContextDependent());
            Assert.assertTrue(fnEmpty.computeContextDependent());
            Assert.assertFalse(fnWithArg.computeContextDependent());
        }

        // Functions that always return false
        int[] alwaysFalse = new int[] {
            Compiler.FUNCTION_COUNT, Compiler.FUNCTION_ID, Compiler.FUNCTION_CONCAT,
            Compiler.FUNCTION_STARTS_WITH, Compiler.FUNCTION_CONTAINS, Compiler.FUNCTION_SUBSTRING_BEFORE,
            Compiler.FUNCTION_SUBSTRING_AFTER, Compiler.FUNCTION_SUBSTRING, Compiler.FUNCTION_STRING_LENGTH,
            Compiler.FUNCTION_NORMALIZE_SPACE, Compiler.FUNCTION_TRANSLATE, Compiler.FUNCTION_NOT,
            Compiler.FUNCTION_TRUE, Compiler.FUNCTION_FALSE, Compiler.FUNCTION_SUM,
            Compiler.FUNCTION_FLOOR, Compiler.FUNCTION_CEILING, Compiler.FUNCTION_ROUND
        };
        for (int i = 0; i < alwaysFalse.length; i++) {
            CoreFunction fn = new CoreFunction(alwaysFalse[i], null);
            Assert.assertFalse(fn.computeContextDependent());
        }

        // Format Number returns true when args != null && args.length == 2
        CoreFunction fnFormat0 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, null);
        CoreFunction fnFormat2 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] {
            new ConstantExpression("1"), new ConstantExpression("#")
        });
        CoreFunction fnFormat3 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] {
            new ConstantExpression("1"), new ConstantExpression("#"), new ConstantExpression("custom")
        });
        Assert.assertFalse(fnFormat0.computeContextDependent());
        Assert.assertTrue(fnFormat2.computeContextDependent());
        Assert.assertFalse(fnFormat3.computeContextDependent());

        // Default unknown code returns false
        CoreFunction fnUnknown = new CoreFunction(9999, null);
        Assert.assertFalse(fnUnknown.computeContextDependent());
    }

    // -------------------------------------------------------------
    // Test: Function Evaluations
    // -------------------------------------------------------------

    @Test
    public void functionLast_givenNodes_shouldReturnTotalCountAndRestorePosition() {
        // Arrange
        List nodes = Arrays.asList(new Object[] { "node1", "node2", "node3" });
        StubEvalContext ctx = new StubEvalContext(nodes);
        ctx.setPosition(2);

        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);

        // Act
        Object result = func.compute(ctx);

        // Assert
        Assert.assertEquals(new Double(3.0), result);
        Assert.assertEquals(2, ctx.getCurrentPosition());
    }

    @Test
    public void functionLast_givenZeroOldPosition_shouldNotResetPosition() {
        List nodes = Arrays.asList(new Object[] { "node1" });
        StubEvalContext ctx = new StubEvalContext(nodes);
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);

        Object result = func.compute(ctx);
        Assert.assertEquals(new Double(1.0), result);
        Assert.assertEquals(1, ctx.getCurrentPosition());
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void functionLast_givenArguments_shouldThrowException() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[] { new ConstantExpression("arg") });
        func.compute(new StubEvalContext((List) null));
    }

    @Test
    public void functionPosition_givenContextPosition_shouldReturnCurrentPosition() {
        StubEvalContext ctx = new StubEvalContext(Arrays.asList(new Object[] { "a", "b" }));
        ctx.setPosition(2);

        CoreFunction func = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        Object result = func.compute(ctx);

        Assert.assertEquals(new Integer(2), result);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void functionPosition_givenArguments_shouldThrowException() {
        CoreFunction func = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[] { new ConstantExpression("arg") });
        func.compute(new StubEvalContext((List) null));
    }

    @Test
    public void functionCount_givenDifferentArgTypes_shouldReturnExpectedCounts() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        // 1. NodePointer with collection
        StubNodePointer ptrCollection = new StubNodePointer(Arrays.asList(new Object[] { "1", "2" }));
        CoreFunction fnPtrCol = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] { new ConstantExpression(ptrCollection) });
        Assert.assertEquals(new Double(2.0), fnPtrCol.compute(ctx));

        // 2. NodePointer with single value
        StubNodePointer ptrSingle = new StubNodePointer("single");
        CoreFunction fnPtrSingle = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] { new ConstantExpression(ptrSingle) });
        Assert.assertEquals(new Double(1.0), fnPtrSingle.compute(ctx));

        // 3. EvalContext
        StubEvalContext subCtx = new StubEvalContext(Arrays.asList(new Object[] { "a", "b", "c" }));
        CoreFunction fnCtx = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] { new ConstantExpression(subCtx) });
        Assert.assertEquals(new Double(3.0), fnCtx.compute(ctx));

        // 4. Collection directly
        CoreFunction fnCol = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] {
            new ConstantExpression(Arrays.asList(new Object[] { "x", "y" }))
        });
        Assert.assertEquals(new Double(2.0), fnCol.compute(ctx));

        // 5. null value
        CoreFunction fnNull = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] { new ConstantExpression(null) });
        Assert.assertEquals(new Double(0.0), fnNull.compute(ctx));

        // 6. Generic object
        CoreFunction fnObj = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] { new ConstantExpression("text") });
        Assert.assertEquals(new Double(1.0), fnObj.compute(ctx));
    }

    @Test
    public void functionLang_givenMatchingAndNonMatchingLanguage_shouldReturnBoolean() {
        StubNodePointer pointerEn = new StubNodePointer("value", new QName("name"), "uri", "en", Locale.ENGLISH);
        StubEvalContext ctxEn = new StubEvalContext(pointerEn);

        CoreFunction fnEn = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[] { new ConstantExpression("en") });
        CoreFunction fnFr = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[] { new ConstantExpression("fr") });

        Assert.assertEquals(Boolean.TRUE, fnEn.compute(ctxEn));
        Assert.assertEquals(Boolean.FALSE, fnFr.compute(ctxEn));

        // When pointer is null
        StubEvalContext ctxEmpty = new StubEvalContext(Collections.EMPTY_LIST);
        ctxEmpty.setCurrentNodePointer(null);
        Assert.assertEquals(Boolean.FALSE, fnEn.compute(ctxEmpty));
    }

    @Test
    public void functionID_givenId_shouldReturnPointerByID() {
        StubNodePointer root = new StubNodePointer("root");
        StubEvalContext ctx = new StubEvalContext(root);

        CoreFunction func = new CoreFunction(Compiler.FUNCTION_ID, new Expression[] { new ConstantExpression("elementId") });
        Object result = func.compute(ctx);

        Assert.assertTrue(result instanceof Pointer);
        Assert.assertEquals("pointer:elementId", ((Pointer) result).getValue());
    }

    @Test
    public void functionKey_givenSingleAndMultipleValues_shouldReturnNodeSetContext() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        // Value is single object
        CoreFunction fnKey1 = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[] {
            new ConstantExpression("myKey"), new ConstantExpression("myValue")
        });
        Object res1 = fnKey1.compute(ctx);
        Assert.assertTrue(res1 instanceof NodeSetContext);

        // Value is EvalContext empty
        StubEvalContext emptyValCtx = new StubEvalContext(Collections.EMPTY_LIST);
        CoreFunction fnKeyEmpty = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[] {
            new ConstantExpression("myKey"), new ConstantExpression(emptyValCtx)
        });
        Object resEmpty = fnKeyEmpty.compute(ctx);
        Assert.assertTrue(resEmpty instanceof BasicNodeSet);

        // Value is EvalContext with multiple elements (accum branch)
        List multiList = Arrays.asList(new Object[] { new StubNodePointer("v1"), new StubNodePointer("v2") });
        StubEvalContext multiValCtx = new StubEvalContext(multiList);
        CoreFunction fnKeyMulti = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[] {
            new ConstantExpression("myKey"), new ConstantExpression(multiValCtx)
        });
        Object resMulti = fnKeyMulti.compute(ctx);
        Assert.assertTrue(resMulti instanceof NodeSetContext);
    }

    @Test
    public void functionNamespaceURI_givenZeroAndOneArg_shouldReturnURI() {
        StubNodePointer ptr = new StubNodePointer("val", new QName("test"), "http://example.com", "en", Locale.US);
        StubEvalContext ctx = new StubEvalContext(ptr);

        // 0 args
        CoreFunction fnZero = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[0]);
        Assert.assertEquals("http://example.com", fnZero.compute(ctx));

        // 0 args with null URI
        StubNodePointer ptrNullURI = new StubNodePointer("val", new QName("test"), null, "en", Locale.US);
        StubEvalContext ctxNullURI = new StubEvalContext(ptrNullURI);
        Assert.assertEquals("", fnZero.compute(ctxNullURI));

        // 1 arg with EvalContext returning node
        StubEvalContext argCtx = new StubEvalContext(ptr);
        CoreFunction fnOne = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[] { new ConstantExpression(argCtx) });
        Assert.assertEquals("http://example.com", fnOne.compute(ctx));

        // 1 arg with empty EvalContext
        StubEvalContext argEmptyCtx = new StubEvalContext(Collections.EMPTY_LIST);
        CoreFunction fnEmpty = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[] { new ConstantExpression(argEmptyCtx) });
        Assert.assertEquals("", fnEmpty.compute(ctx));

        // 1 arg not EvalContext
        CoreFunction fnNotCtx = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[] { new ConstantExpression("string") });
        Assert.assertEquals("", fnNotCtx.compute(ctx));
    }

    @Test
    public void functionLocalName_givenZeroAndOneArg_shouldReturnLocalName() {
        StubNodePointer ptr = new StubNodePointer("val", new QName("prefix", "myLocalName"), "uri", "en", Locale.US);
        StubEvalContext ctx = new StubEvalContext(ptr);

        // 0 args
        CoreFunction fnZero = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[0]);
        Assert.assertEquals("myLocalName", fnZero.compute(ctx));

        // 1 arg with EvalContext
        StubEvalContext argCtx = new StubEvalContext(ptr);
        CoreFunction fnOne = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[] { new ConstantExpression(argCtx) });
        Assert.assertEquals("myLocalName", fnOne.compute(ctx));

        // 1 arg empty EvalContext
        StubEvalContext argEmptyCtx = new StubEvalContext(Collections.EMPTY_LIST);
        CoreFunction fnEmpty = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[] { new ConstantExpression(argEmptyCtx) });
        Assert.assertEquals("", fnEmpty.compute(ctx));
    }

    @Test
    public void functionName_givenZeroAndOneArg_shouldReturnQNameString() {
        StubNodePointer ptr = new StubNodePointer("val", new QName("prefix", "local"), "uri", "en", Locale.US);
        StubEvalContext ctx = new StubEvalContext(ptr);

        // 0 args
        CoreFunction fnZero = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[0]);
        Assert.assertEquals("prefix:local", fnZero.compute(ctx));

        // 1 arg with EvalContext
        StubEvalContext argCtx = new StubEvalContext(ptr);
        CoreFunction fnOne = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[] { new ConstantExpression(argCtx) });
        Assert.assertEquals("prefix:local", fnOne.compute(ctx));

        // 1 arg empty EvalContext
        StubEvalContext argEmptyCtx = new StubEvalContext(Collections.EMPTY_LIST);
        CoreFunction fnEmpty = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[] { new ConstantExpression(argEmptyCtx) });
        Assert.assertEquals("", fnEmpty.compute(ctx));
    }

    @Test
    public void functionString_givenZeroAndOneArg_shouldReturnStringValue() {
        StubNodePointer ptr = new StubNodePointer("helloContext");
        StubEvalContext ctx = new StubEvalContext(ptr);

        // 0 args
        CoreFunction fnZero = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[0]);
        Assert.assertEquals("helloContext", fnZero.compute(ctx));

        // 1 arg
        CoreFunction fnOne = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[] { new ConstantExpression(new Integer(123)) });
        Assert.assertEquals("123", fnOne.compute(ctx));
    }

    @Test
    public void functionConcat_givenMultipleArgs_shouldConcatenateAll() {
        CoreFunction fn = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[] {
            new ConstantExpression("foo"), new ConstantExpression("-"), new ConstantExpression("bar")
        });
        Assert.assertEquals("foo-bar", fn.compute(new StubEvalContext(Collections.EMPTY_LIST)));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void functionConcat_givenLessThanTwoArgs_shouldThrowException() {
        CoreFunction fn = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[] { new ConstantExpression("foo") });
        fn.compute(new StubEvalContext(Collections.EMPTY_LIST));
    }

    @Test
    public void functionStartsWith_givenStrings_shouldCheckPrefix() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnTrue = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[] {
            new ConstantExpression("abcdef"), new ConstantExpression("abc")
        });
        CoreFunction fnFalse = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[] {
            new ConstantExpression("abcdef"), new ConstantExpression("xyz")
        });

        Assert.assertEquals(Boolean.TRUE, fnTrue.compute(ctx));
        Assert.assertEquals(Boolean.FALSE, fnFalse.compute(ctx));
    }

    @Test
    public void functionContains_givenStrings_shouldCheckSubstringPresence() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnTrue = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[] {
            new ConstantExpression("abcdef"), new ConstantExpression("cde")
        });
        CoreFunction fnFalse = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[] {
            new ConstantExpression("abcdef"), new ConstantExpression("zzz")
        });

        Assert.assertEquals(Boolean.TRUE, fnTrue.compute(ctx));
        Assert.assertEquals(Boolean.FALSE, fnFalse.compute(ctx));
    }

    @Test
    public void functionSubstringBefore_givenStrings_shouldReturnPrefixOrEmpty() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnFound = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[] {
            new ConstantExpression("1999/04/01"), new ConstantExpression("/")
        });
        CoreFunction fnNotFound = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[] {
            new ConstantExpression("1999/04/01"), new ConstantExpression("?")
        });

        Assert.assertEquals("1999", fnFound.compute(ctx));
        Assert.assertEquals("", fnNotFound.compute(ctx));
    }

    @Test
    public void functionSubstringAfter_givenStrings_shouldReturnSuffixOrEmpty() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnFound = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[] {
            new ConstantExpression("1999/04/01"), new ConstantExpression("/")
        });
        CoreFunction fnNotFound = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[] {
            new ConstantExpression("1999/04/01"), new ConstantExpression("?")
        });

        Assert.assertEquals("04/01", fnFound.compute(ctx));
        Assert.assertEquals("", fnNotFound.compute(ctx));
    }

    @Test
    public void functionSubstring_givenVariousFromAndLength_shouldHandleAllBranches() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        // NaN from
        CoreFunction fnNaN = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(Double.NaN))
        });
        Assert.assertEquals("", fnNaN.compute(ctx));

        // from > length + 1
        CoreFunction fnFromTooLarge = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(10.0))
        });
        Assert.assertEquals("", fnFromTooLarge.compute(ctx));

        // 2 args normal
        CoreFunction fn2ArgsNormal = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(2.0))
        });
        Assert.assertEquals("ello", fn2ArgsNormal.compute(ctx));

        // 2 args from < 1
        CoreFunction fn2ArgsFromNeg = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(-2.0))
        });
        Assert.assertEquals("hello", fn2ArgsFromNeg.compute(ctx));

        // 3 args length < 0
        CoreFunction fn3ArgsNegLen = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(2.0)), new ConstantExpression(new Double(-1.0))
        });
        Assert.assertEquals("", fn3ArgsNegLen.compute(ctx));

        // 3 args to < 1
        CoreFunction fn3ArgsToNeg = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(-5.0)), new ConstantExpression(new Double(2.0))
        });
        Assert.assertEquals("", fn3ArgsToNeg.compute(ctx));

        // 3 args to > length + 1 with from < 1
        CoreFunction fn3ArgsToLargeFromNeg = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(-1.0)), new ConstantExpression(new Double(20.0))
        });
        Assert.assertEquals("hello", fn3ArgsToLargeFromNeg.compute(ctx));

        // 3 args to > length + 1 with from >= 1
        CoreFunction fn3ArgsToLargeFromNormal = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(3.0)), new ConstantExpression(new Double(20.0))
        });
        Assert.assertEquals("llo", fn3ArgsToLargeFromNormal.compute(ctx));

        // 3 args normal with from < 1
        CoreFunction fn3ArgsFromNeg = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(0.0)), new ConstantExpression(new Double(3.0))
        });
        Assert.assertEquals("he", fn3ArgsFromNeg.compute(ctx));

        // 3 args normal
        CoreFunction fn3ArgsNormal = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] {
            new ConstantExpression("hello"), new ConstantExpression(new Double(2.0)), new ConstantExpression(new Double(3.0))
        });
        Assert.assertEquals("ell", fn3ArgsNormal.compute(ctx));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void functionSubstring_givenWrongArgCount_shouldThrowException() {
        CoreFunction fn = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[] { new ConstantExpression("hello") });
        fn.compute(new StubEvalContext(Collections.EMPTY_LIST));
    }

    @Test
    public void functionStringLength_givenZeroAndOneArg_shouldReturnLength() {
        StubNodePointer ptr = new StubNodePointer("12345");
        StubEvalContext ctx = new StubEvalContext(ptr);

        // 0 args
        CoreFunction fnZero = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[0]);
        Assert.assertEquals(new Double(5.0), fnZero.compute(ctx));

        // 1 arg
        CoreFunction fnOne = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[] {
            new ConstantExpression("abcdef")
        });
        Assert.assertEquals(new Double(6.0), fnOne.compute(ctx));
    }

    @Test
    public void functionNormalizeSpace_givenVariousWhitespaces_shouldNormalizeProperly() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fn1 = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[] {
            new ConstantExpression("  hello   world  \t\r\n")
        });
        Assert.assertEquals("hello world", fn1.compute(ctx));

        CoreFunction fnAllSpace = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[] {
            new ConstantExpression("   \t  \r \n ")
        });
        Assert.assertEquals("", fnAllSpace.compute(ctx));

        CoreFunction fnNoSpace = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[] {
            new ConstantExpression("test")
        });
        Assert.assertEquals("test", fnNoSpace.compute(ctx));
    }

    @Test
    public void functionTranslate_givenReplacementStrings_shouldTranslateCharacters() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        // Standard replace
        CoreFunction fn1 = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[] {
            new ConstantExpression("bar"), new ConstantExpression("abc"), new ConstantExpression("ABC")
        });
        Assert.assertEquals("BAr", fn1.compute(ctx));

        // Delete char when s3 is shorter than s2 index
        CoreFunction fnDelete = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[] {
            new ConstantExpression("--aaa--"), new ConstantExpression("abc-"), new ConstantExpression("ABC")
        });
        Assert.assertEquals("AAA", fnDelete.compute(ctx));
    }

    @Test
    public void functionBooleanAndNot_givenConditions_shouldReturnBooleans() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnBoolTrue = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[] { new ConstantExpression("true") });
        CoreFunction fnBoolFalse = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[] { new ConstantExpression("") });
        Assert.assertEquals(Boolean.TRUE, fnBoolTrue.compute(ctx));
        Assert.assertEquals(Boolean.FALSE, fnBoolFalse.compute(ctx));

        CoreFunction fnNotTrue = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[] { new ConstantExpression("true") });
        CoreFunction fnNotFalse = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[] { new ConstantExpression("") });
        Assert.assertEquals(Boolean.FALSE, fnNotTrue.compute(ctx));
        Assert.assertEquals(Boolean.TRUE, fnNotFalse.compute(ctx));
    }

    @Test
    public void functionTrueFalseNull_shouldReturnConstants() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnTrue = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction fnFalse = new CoreFunction(Compiler.FUNCTION_FALSE, new Expression[0]);
        CoreFunction fnNull = new CoreFunction(Compiler.FUNCTION_NULL, new Expression[0]);

        Assert.assertEquals(Boolean.TRUE, fnTrue.compute(ctx));
        Assert.assertEquals(Boolean.FALSE, fnFalse.compute(ctx));
        Assert.assertNull(fnNull.compute(ctx));
    }

    @Test
    public void functionNumber_givenZeroAndOneArg_shouldReturnNumber() {
        StubNodePointer ptr = new StubNodePointer("42.5");
        StubEvalContext ctx = new StubEvalContext(ptr);

        CoreFunction fnZero = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[0]);
        Assert.assertEquals(new Double(42.5), fnZero.compute(ctx));

        CoreFunction fnOne = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[] { new ConstantExpression("100") });
        Assert.assertEquals(new Double(100.0), fnOne.compute(ctx));
    }

    @Test
    public void functionSum_givenContextOrNull_shouldSumValues() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        // Arg evaluates to null
        CoreFunction fnNull = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[] { new ConstantExpression(null) });
        Assert.assertEquals(new Double(0.0), fnNull.compute(ctx));

        // Arg evaluates to EvalContext
        List nodes = Arrays.asList(new Object[] { new StubNodePointer("10.5"), new StubNodePointer("20.5") });
        StubEvalContext valCtx = new StubEvalContext(nodes);
        CoreFunction fnSum = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[] { new ConstantExpression(valCtx) });
        Assert.assertEquals(new Double(31.0), fnSum.compute(ctx));
    }

    @Test(expected = JXPathException.class)
    public void functionSum_givenInvalidType_shouldThrowException() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);
        CoreFunction fnInvalid = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[] { new ConstantExpression("invalid") });
        fnInvalid.compute(ctx);
    }

    @Test
    public void functionMath_givenFloorCeilingRound_shouldCalculateCorrectly() {
        StubEvalContext ctx = new StubEvalContext(Collections.EMPTY_LIST);

        CoreFunction fnFloor = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[] { new ConstantExpression(new Double(2.7)) });
        CoreFunction fnCeiling = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[] { new ConstantExpression(new Double(2.3)) });
        CoreFunction fnRound = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[] { new ConstantExpression(new Double(2.5)) });

        Assert.assertEquals(new Double(2.0), fnFloor.compute(ctx));
        Assert.assertEquals(new Double(3.0), fnCeiling.compute(ctx));
        Assert.assertEquals(new Double(3.0), fnRound.compute(ctx));
    }

    @Test
    public void functionFormatNumber_givenTwoAndThreeArgs_shouldFormatAccordingly() {
        StubNodePointer ptr = new StubNodePointer("val", new QName("name"), "uri", "en", Locale.US);
        StubEvalContext ctx = new StubEvalContext(ptr);

        // 2 args with pointer locale
        CoreFunction fn2Args = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] {
            new ConstantExpression(new Double(1234.56)), new ConstantExpression("#,##0.00")
        });
        String formatted2 = (String) fn2Args.compute(ctx);
        Assert.assertTrue(formatted2.indexOf("1,234.56") != -1 || formatted2.indexOf("1.234,56") != -1);

        // 2 args without pointer (uses JXPathContext locale)
        StubEvalContext ctxNoPointer = new StubEvalContext(Collections.EMPTY_LIST);
        ctxNoPointer.setCurrentNodePointer(null);
        String formattedNoPtr = (String) fn2Args.compute(ctxNoPointer);
        Assert.assertNotNull(formattedNoPtr);

        // 3 args with custom decimal format symbols
        CoreFunction fn3Args = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] {
            new ConstantExpression(new Double(1234.5)), new ConstantExpression("#,##0.00"), new ConstantExpression("custom")
        });
        String formatted3 = (String) fn3Args.compute(ctx);
        Assert.assertEquals("1.234,50", formatted3);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void functionFormatNumber_givenInvalidArgCount_shouldThrowException() {
        CoreFunction fn = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] { new ConstantExpression("1") });
        fn.compute(new StubEvalContext(Collections.EMPTY_LIST));
    }

    @Test
    public void computeValue_givenUnknownFunctionCode_shouldReturnNull() {
        CoreFunction fn = new CoreFunction(9999, new Expression[0]);
        Object result = fn.compute(new StubEvalContext(Collections.EMPTY_LIST));
        Assert.assertNull(result);
    }

    @Test
    public void assertArgRange_givenTooFewOrTooManyArgs_shouldThrowException() {
        try {
            CoreFunction fn = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[] { new ConstantExpression("a") });
            fn.compute(new StubEvalContext(Collections.EMPTY_LIST));
            Assert.fail("Expected JXPathInvalidSyntaxException for too few args");
        } catch (JXPathInvalidSyntaxException expected) {
            Assert.assertTrue(expected.getMessage().indexOf("Incorrect number of arguments") != -1);
        }

        try {
            CoreFunction fn = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[] {
                new ConstantExpression("a"), new ConstantExpression("b"), new ConstantExpression("c")
            });
            fn.compute(new StubEvalContext(Collections.EMPTY_LIST));
            Assert.fail("Expected JXPathInvalidSyntaxException for too many args");
        } catch (JXPathInvalidSyntaxException expected) {
            Assert.assertTrue(expected.getMessage().indexOf("Incorrect number of arguments") != -1);
        }
    }
}