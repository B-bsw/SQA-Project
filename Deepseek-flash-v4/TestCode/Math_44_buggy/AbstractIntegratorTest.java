package org.apache.commons.math.ode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;

public class AbstractIntegratorTest {
    
    private AbstractIntegrator integrator;
    
    @Before
    public void setUp() {
        integrator = new TestIntegrator("test");
    }
    
    @After
    public void tearDown() {
        integrator = null;
    }
    
    private static class TestIntegrator extends AbstractIntegrator {
        public TestIntegrator(String name) {
            super(name);
        }
        
        @Override
        public void integrate(ExpandableStatefulODE equations, double t) 
                throws MathIllegalStateException, MathIllegalArgumentException {
            // no-op for testing
        }
        
        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) 
                throws MaxCountExceededException {
            super.computeDerivatives(t, y, yDot);
        }
    }
    
    private static class TestStepHandler implements StepHandler {
        private int handleCount = 0;
        private double lastTime = Double.NaN;
        
        @Override
        public void handleStep(AbstractStepInterpolator interpolator, boolean isLast) {
            handleCount++;
            lastTime = interpolator.getCurrentTime();
        }
        
        @Override
        public void init(double t0, double[] y0, double t) {
            // no-op
        }
        
        public int getHandleCount() { return handleCount; }
        public double getLastTime() { return lastTime; }
    }
    
    private static class TestEventHandler implements EventHandler {
        private int eventCount = 0;
        
        @Override
        public double g(double t, double[] y) {
            return t - 2.0; // event at t=2
        }
        
        @Override
        public void resetState(double t, double[] y) {
            // no-op
        }
        
        @Override
        public int eventOccurred(double t, double[] y, boolean increasing) {
            eventCount++;
            return CONTINUE;
        }
        
        public int getEventCount() { return eventCount; }
    }
    
    @Test
    public void testConstructorWithName() {
        assertEquals("test", integrator.getName());
        assertEquals(-1, integrator.getMaxEvaluations());
        assertEquals(0, integrator.getEvaluations());
        assertTrue(integrator.getStepHandlers().isEmpty());
        assertTrue(integrator.getEventHandlers().isEmpty());
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }
    
    @Test
    public void testConstructorWithNullName() {
        AbstractIntegrator nullName = new TestIntegrator(null);
        assertNull(nullName.getName());
    }
    
    @Test
    public void testAddAndGetStepHandlers() {
        TestStepHandler handler1 = new TestStepHandler();
        TestStepHandler handler2 = new TestStepHandler();
        
        integrator.addStepHandler(handler1);
        integrator.addStepHandler(handler2);
        
        assertEquals(2, integrator.getStepHandlers().size());
        assertTrue(integrator.getStepHandlers().contains(handler1));
        assertTrue(integrator.getStepHandlers().contains(handler2));
    }
    
    @Test
    public void testAddAndGetEventHandlers() {
        TestEventHandler handler1 = new TestEventHandler();
        TestEventHandler handler2 = new TestEventHandler();
        
        integrator.addEventHandler(handler1, 0.1, 1e-9, 10);
        integrator.addEventHandler(handler2, 0.2, 1e-8, 20);
        
        assertEquals(2, integrator.getEventHandlers().size());
        assertTrue(integrator.getEventHandlers().contains(handler1));
        assertTrue(integrator.getEventHandlers().contains(handler2));
    }
    
    @Test
    public void testClearStepHandlers() {
        integrator.addStepHandler(new TestStepHandler());
        integrator.addStepHandler(new TestStepHandler());
        
        integrator.clearStepHandlers();
        
        assertTrue(integrator.getStepHandlers().isEmpty());
    }
    
    @Test
    public void testClearEventHandlers() {
        integrator.addEventHandler(new TestEventHandler(), 0.1, 1e-9, 10);
        integrator.addEventHandler(new TestEventHandler(), 0.1, 1e-9, 10);
        
        integrator.clearEventHandlers();
        
        assertTrue(integrator.getEventHandlers().isEmpty());
    }
    
    @Test
    public void testSetMaxEvaluations() {
        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
        
        integrator.setMaxEvaluations(-5);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }
    
    @Test
    public void testGetEvaluations() {
        assertEquals(0, integrator.getEvaluations());
        
        integrator.resetEvaluations();
        assertEquals(0, integrator.getEvaluations());
    }
    
    @Test
    public void testIntegrateWithMismatchedDimensions() {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 3; }
            
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                // no-op
            }
        };
        
        double[] y0 = new double[2]; // wrong size
        double[] y = new double[3];
        
        try {
            integrator.integrate(equations, 0.0, y0, 10.0, y);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        } catch (Exception e) {
            fail("Wrong exception type: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testIntegrateWithMismatchedYLength() {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 3; }
            
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                // no-op
            }
        };
        
        double[] y0 = new double[3];
        double[] y = new double[2]; // wrong size
        
        try {
            integrator.integrate(equations, 0.0, y0, 10.0, y);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        } catch (Exception e) {
            fail("Wrong exception type: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testSanityChecksValidInterval() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(
            new FirstOrderDifferentialEquations() {
                @Override
                public int getDimension() { return 1; }
                
                @Override
                public void computeDerivatives(double t, double[] y, double[] yDot) {
                    yDot[0] = 1.0;
                }
            });
        equations.setTime(0.0);
        
        // Should not throw exception for valid interval
        integrator.sanityChecks(equations, 10.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecksTooSmallInterval() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(
            new FirstOrderDifferentialEquations() {
                @Override
                public int getDimension() { return 1; }
                
                @Override
                public void computeDerivatives(double t, double[] y, double[] yDot) {
                    yDot[0] = 1.0;
                }
            });
        equations.setTime(0.0);
        
        // Should throw exception for zero interval
        integrator.sanityChecks(equations, 0.0);
    }
    
    @Test
    public void testSetStateInitialized() {
        // This is protected, test through subclass
        TestIntegrator testIntegrator = new TestIntegrator("test") {
            public void setFlag(boolean flag) {
                setStateInitialized(flag);
            }
            
            public boolean getFlag() {
                return statesInitialized;
            }
        };
        
        // Can't directly test protected method, but test the setter works
        testIntegrator.setFlag(true);
        testIntegrator.setFlag(false);
    }
    
    @Test
    public void testGetUnmodifiableCollections() {
        integrator.addStepHandler(new TestStepHandler());
        integrator.addEventHandler(new TestEventHandler(), 0.1, 1e-9, 10);
        
        try {
            integrator.getStepHandlers().add(new TestStepHandler());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        
        try {
            integrator.getEventHandlers().add(new TestEventHandler());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
    
    @Test
    public void testMultipleHandlers() {
        TestStepHandler handler1 = new TestStepHandler();
        TestStepHandler handler2 = new TestStepHandler();
        
        integrator.addStepHandler(handler1);
        integrator.addStepHandler(handler2);
        
        assertEquals(2, integrator.getStepHandlers().size());
        
        integrator.clearStepHandlers();
        
        assertTrue(integrator.getStepHandlers().isEmpty());
    }
}