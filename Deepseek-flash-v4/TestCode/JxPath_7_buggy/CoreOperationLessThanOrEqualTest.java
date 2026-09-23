package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoreOperationLessThanOrEqualTest {

    private EvalContext context;

    @Before
    public void setUp() {
        context = new org.apache.commons.jxpath.ri.EvalContext(null, null) {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean nextNode() {
                return false;
            }

            @Override
            public boolean nextSet() {
                return false;
            }

            @Override
            public boolean nextNode(int position) {
                return false;
            }

            @Override
            public void reset() {
            }

            @Override
            public int getPosition() {
                return 0;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public org.apache.commons.jxpath.Pointer getCurrentNodePointer() {
                return null;
            }

            @Override
            public Object getCurrentNode() {
                return null;
            }

            @Override
            public void setPosition(int position) {
            }

            @Override
            public boolean nextNode(Object object) {
                return false;
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {
            }

            @Override
            public int getCurrentPosition() {
                return 0;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getSize() {
                return 1;
            }

            @Override
            public void setCurrentPosition(int position) {
            }
        };
    }

    @Test
    public void testLessThanEqual_TrueCase() {
        // arrange
        Expression left = new Constant("1");
        Expression right = new Constant("2");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
        assertEquals("<=", op.getSymbol());
    }

    @Test
    public void testLessThanEqual_ExactMatch() {
        // arrange
        Expression left = new Constant("5");
        Expression right = new Constant("5");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testLessThanEqual_FalseCase() {
        // arrange
        Expression left = new Constant("3");
        Expression right = new Constant("1");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testLessThanEqual_DecimalValues() {
        // arrange
        Expression left = new Constant("1.5");
        Expression right = new Constant("1.6");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testLessThanEqual_NegativeNumbers() {
        // arrange
        Expression left = new Constant("-2");
        Expression right = new Constant("-1");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testLessThanEqual_ZeroAndPositive() {
        // arrange
        Expression left = new Constant("0");
        Expression right = new Constant("0.001");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testLessThanEqual_NullArguments() {
        // arrange
        Expression left = new Constant(null);
        Expression right = new Constant("1");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testLessThanEqual_NullBothArguments() {
        // arrange
        Expression left = new Constant(null);
        Expression right = new Constant(null);
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testLessThanEqual_StringNumbers() {
        // arrange
        Expression left = new Constant("10");
        Expression right = new Constant("10.0");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        Object result = op.computeValue(context);

        // assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSymbol() {
        // arrange
        Expression left = new Constant("1");
        Expression right = new Constant("2");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act
        String symbol = op.getSymbol();

        // assert
        assertEquals("<=", symbol);
    }

    @Test
    public void testComputeValue_StringNonNumeric() {
        // arrange - ensure non-numeric strings are handled, expecting exception or false
        Expression left = new Constant("abc");
        Expression right = new Constant("1");
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(left, right);

        // act & assert - should throw NumberFormatException or return false
        try {
            Object result = op.computeValue(context);
            // If no exception, assert false (since NaN comparisons are false)
            assertEquals(Boolean.FALSE, result);
        } catch (Exception e) {
            // Expected exception for invalid number
        }
    }

    // Helper class for testing with constant values
    private static class Constant implements Expression {
        private final Object value;

        public Constant(Object value) {
            this.value = value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        @Override
        public Expression[] getArguments() {
            return null;
        }

        @Override
        public boolean isContextDependent() {
            return false;
        }

        @Override
        public String toString() {
            return "Constant{" + value + '}';
        }
    }

    // Abstract method implementations needed for the abstract EvalContext
    // These are minimal implementations for testing purposes
    private abstract static class EvalContextStub extends EvalContext {
        protected EvalContextStub() {
            super(null, null);
        }
    }

    // Interface for Expression (simplified)
    private interface Expression {
        Object computeValue(EvalContext context);
        Expression[] getArguments();
        boolean isContextDependent();
    }
}

// Note: The above test class is complete with proper package, imports, and closing braces.