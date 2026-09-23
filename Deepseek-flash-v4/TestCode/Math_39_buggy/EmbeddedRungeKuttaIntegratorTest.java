package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class TestInterpolator extends RungeKuttaStepInterpolator {
        private static final long serialVersionUID = 1L;
        public TestInterpolator() { super(); }
        @Override
        protected StepInterpolator doCopy() { return new TestInterpolator(); }
        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH, double oneMinusTheta, double oneMinus2Theta, double[] interpolatedState, double[] interpolatedDerivatives) {
            System.arraycopy(currentState, 0, interpolatedState, 0, currentState.length);
        }
        @Override
        public double getCurrentTime() { return getInterpolatedTime(); }
    }

    private static class TestIntegrator extends EmbeddedRungeKuttaIntegrator {
        private int calls = 0;
        public TestIntegrator() {
            super("test", false, new double[]{0.5}, new double[][]{{0.5}}, new double[]{0.0, 1.0}, new TestInterpolator(), 1e-6, 1e6, 1e-6, 1e-6);
        }
        @Override
        public int getOrder() { return 2; }
        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            return 1.5;
        }
        @Override
        protected void computeDerivatives(double t, double[] y, double[] yDot) {
            calls++;
            yDot[0] = y[1];
            yDot[1] = -y[0];
        }
    }

    private TestIntegrator integrator;
    private ExpandableStatefulODE equations;
    private double[] y;

    @Before
    public void setUp() {
        integrator = new TestIntegrator();
        y = new double[]{1.0, 0.0};
        equations = new ExpandableStatefulODE(new org.apache.commons.math.ode.SecondOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 2; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = y[1];
                yDot[1] = -y[0];
            }
        });
        equations.setTime(0.0);
        equations.setCompleteState(y.clone());
    }

    @Test
    public void testSafetyControl() {
        integrator.setSafety(0.8);
        assertEquals(0.8, integrator.getSafety(), 0.0);
        integrator.setSafety(1.5);
        assertEquals(1.5, integrator.getSafety(), 0.0);
    }

    @Test
    public void testMinReductionControl() {
        integrator.setMinReduction(0.1);
        assertEquals(0.1, integrator.getMinReduction(), 0.0);
        integrator.setMinReduction(0.5);
        assertEquals(0.5, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMaxGrowthControl() {
        integrator.setMaxGrowth(5.0);
        assertEquals(5.0, integrator.getMaxGrowth(), 0.0);
        integrator.setMaxGrowth(20.0);
        assertEquals(20.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testIntegrateBasic() {
        try {
            integrator.integrate(equations, Math.PI / 2);
            double[] finalState = equations.getCompleteState();
            assertEquals(0.0, finalState[0], 1e-4);
            assertEquals(1.0, finalState[1], 1e-4);
        } catch (Exception e) {
            fail("Integration failed: " + e.getMessage());
        }
    }

    @Test
    public void testIntegrateBackward() {
        equations.setTime(Math.PI);
        try {
            integrator.integrate(equations, 0.0);
            double[] finalState = equations.getCompleteState();
            assertEquals(1.0, finalState[0], 1e-3);
            assertEquals(0.0, finalState[1], 1e-3);
        } catch (Exception e) {
            fail("Backward integration failed: " + e.getMessage());
        }
    }

    @Test
    public void testIntegrateSameTime() {
        equations.setTime(Math.PI / 4);
        try {
            integrator.integrate(equations, Math.PI / 4);
            assertArrayEquals(new double[]{1.0, 0.0}, equations.getCompleteState(), 0.0);
        } catch (Exception e) {
            fail("Same-time integration failed: " + e.getMessage());
        }
    }

    @Test
    public void testIntegrateWithStepsizeEvents() {
        equations.setTime(0.0);
        final List<Double> eventTimes = new ArrayList<Double>();
        equations.addEventHandler(new EventHandler() {
            @Override
            public void init(double t0, double[] y0, double t) {}
            @Override
            public double g(double t, double[] y) { return t - 0.5; }
            @Override
            public void resetState(double newT, double[] oldState, double[] newState) {}
            @Override
            public double eventOccurred(double t, double[] y, boolean increasing) { return 0.0; }
        }, Double.POSITIVE_INFINITY, 1.0e-10, 100);
        try {
            integrator.integrate(equations, 1.0);
            assertTrue(integrator.getCurrentStepStart() >= 0.0);
        } catch (Exception e) {
            fail("Event integration failed: " + e.getMessage());
        }
    }

    @Test
    public void testIntegrateWithStepHandler() {
        final StringBuilder sb = new StringBuilder();
        equations = new ExpandableStatefulODE(new org.apache.commons.math.ode.FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 2; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = y[1];
                yDot[1] = -y[0];
            }
        });
        equations.setTime(0.0);
        equations.setCompleteState(y.clone());
        StepHandler handler = new StepHandler() {
            @Override
            public void init(double t0, double[] y0, double t) { sb.append("init:").append(t0); }
            @Override
            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                sb.append("step:").append(interpolator.getCurrentTime());
            }
        };
        integrator.addStepHandler(handler);
        try {
            integrator.integrate(equations, 1.0);
            assertTrue(sb.length() > 0);
        } catch (Exception e) {
            fail("Step handler integration failed: " + e.getMessage());
        }
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testIntegrateToNullTime() {
        integrator.integrate(equations, Double.NaN);
    }

    @Test(expected = MathIllegalStateException.class)
    public void testIntegrateInvalidState() {
        equations.setCompleteState(new double[]{Double.NaN, 0.0});
        integrator.integrate(equations, 1.0);
    }

    @Test
    public void testGetOrder() {
        assertEquals(2, integrator.getOrder());
    }

    @Test
    public void testInterpolatorReinitialization() {
        try {
            integrator.integrate(equations, 0.5);
            assertTrue(integrator.getCurrentStepStart() >= 0.0);
        } catch (Exception e) {
            fail("Interpolation validation failed: " + e.getMessage());
        }
    }

    @Test
    public void testMultipleIntegrations() {
        try {
            integrator.integrate(equations, Math.PI);
            double[] state1 = equations.getCompleteState().clone();
            equations.setTime(0.0);
            equations.setCompleteState(new double[]{1.0, 0.0});
            integrator.integrate(equations, Math.PI);
            double[] state2 = equations.getCompleteState().clone();
            assertArrayEquals(state1, state2, 1e-8);
        } catch (Exception e) {
            fail("Multiple integration failed: " + e.getMessage());
        }
    }
}