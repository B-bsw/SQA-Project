package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;

public class CoreOperationGreaterThanTest {
    
    private static class MockContext implements EvalContext {
        private final Object value1;
        private final Object value2;
        private int callCount = 0;
        
        public MockContext(Object v1, Object v2) {
            this.value1 = v1;
            this.value2 = v2;
        }
        
        @Override
        public Object computeValue(EvalContext ctx) {
            callCount++;
            return callCount == 1 ? value1 : value2;
        }
        
        @Override
        public boolean nextNode() { return false; }
        
        @Override
        public boolean nextSet() { return false; }
        
        @Override
        public Object getValue() { return null; }
        
        @Override
        public Object getNode() { return null; }
    }
    
    @Test
    public void testComputeValueGreaterThanTrue() {
        Expression arg1 = new Constant("5");
        Expression arg2 = new Constant("3");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertEquals(Boolean.TRUE, op.computeValue(null));
        assertEquals(">", op.getSymbol());
    }
    
    @Test
    public void testComputeValueGreaterThanFalse() {
        Expression arg1 = new Constant("3");
        Expression arg2 = new Constant("5");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }
    
    @Test
    public void testComputeValueEqualNumbers() {
        Expression arg1 = new Constant("3");
        Expression arg2 = new Constant("3");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }
    
    @Test
    public void testComputeValueBoundary() {
        Expression arg1 = new Constant("2.5");
        Expression arg2 = new Constant("2.4");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }
    
    @Test
    public void testComputeValueNegativeBoundary() {
        Expression arg1 = new Constant("-1.0");
        Expression arg2 = new Constant("-1.0");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }
    
    @Test
    public void testComputeValueWithContext() {
        MockContext ctx = new MockContext(5.0, 3.0);
        
        Expression arg1 = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return 5.0;
            }
            
            @Override
            public String getSymbol() { return "mock1"; }
            
            @Override
            public String getFunctionName() { return null; }
            
            @Override
            public boolean isContextDependent() { return false; }
        };
        
        Expression arg2 = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return 3.0;
            }
            
            @Override
            public String getSymbol() { return "mock2"; }
            
            @Override
            public String getFunctionName() { return null; }
            
            @Override
            public boolean isContextDependent() { return false; }
        };
        
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }
    
    @Test
    public void testGetSymbol() {
        Expression arg1 = new Constant("1");
        Expression arg2 = new Constant("2");
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertEquals(">", op.getSymbol());
    }
    
    @Test
    public void testNullInputs() {
        Expression arg1 = new Constant(null);
        Expression arg2 = new Constant(null);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(arg1, arg2);
        
        assertNotNull(op.computeValue(null));
        assertTrue(op.computeValue(null) instanceof Boolean);
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullArguments() {
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(null, null);
        op.computeValue(null);
    }
}