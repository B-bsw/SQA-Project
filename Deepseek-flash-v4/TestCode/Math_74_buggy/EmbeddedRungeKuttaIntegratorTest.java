package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class TestRKInterpolator extends RungeKuttaStepInterpolator {
        private static final long serialVersionUID = 1L;
        private double currentTime;
        private boolean forward;
        private double[] y;

        public TestRKInterpolator() {
            super();
            y = new double[1];
        }

        @Override
        public AbstractStepInterpolator copy() throws DerivativeException {
            TestRKInterpolator copy = new TestRKInterpolator();
            copy.currentTime = this.currentTime;
            copy.forward = this.forward;
            copy.y = this.y.clone();
            return copy;
        }

        @Override
        public void reinitialize(EmbeddedRungeKuttaIntegrator integrator, double[] yTmp, double[][] yDotK, boolean forward) {
            this.forward = forward;
            this.y = yTmp;
        }

        @Override
        public void storeTime(double t) {
            this.currentTime = t;
        }

        @Override
        public void shift() { }

        @Override
        public double getPreviousTime() { return currentTime - 0.1; }

        @Override
        public double getCurrentTime() { return currentTime; }

        @Override
        public double getInterpolatedTime() { return currentTime; }

        @Override
        public void setInterpolatedTime(double time) { }

        @Override
        public double[] getInterpolatedState() throws DerivativeException {
            return y.clone();
        }

        @Override
        public boolean isForward() { return forward; }
    }

    private static class SimpleEquation implements FirstOrderDifferentialEquations {
        @Override
        public int getDimension() { return 1; }
        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = 1.0;
        }
    }

    private static class SimpleStepHandler implements StepHandler {
        @Override
        public void reset() { }
        @Override
        public void handleStep(StepInterpolator interpolator, boolean isLast) { }
    }

    private ConcreteIntegrator createDefault() {
        double[] c = {0.5};
        double[][] a = {{0.5}};
        double[] b = {0.5, 0.5};
        TestRKInterpolator prototype = new TestRKInterpolator();
        return new ConcreteIntegrator("test", false, c, a, b, prototype, 1e-6, 1e-3, 1e-6, 1e-6);
    }

    private static class ConcreteIntegrator extends EmbeddedRungeKuttaIntegrator {
        public ConcreteIntegrator(String name, boolean fsal, double[] c, double[][] a, double[] b,
                                  RungeKuttaStepInterpolator prototype, double minStep, double maxStep,
                                  double scalAbsTol, double scalRelTol) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, scalAbsTol, scalRelTol);
        }
        @Override
        public int getOrder() { return 4; }
        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            return 0.5;
        }
    }

    @Test
    public void testConstructorDefaults() {
        ConcreteIntegrator integrator = createDefault();
        assertEquals(0.9, integrator.getSafety(), 1e-15);
        assertEquals(0.2, integrator.getMinReduction(), 1e-15);
        assertEquals(10.0, integrator.getMaxGrowth(), 1e-15);
    }

    @Test
    public void testSetSafety() {
        ConcreteIntegrator integrator = createDefault();
        integrator.setSafety(0.5);
        assertEquals(0.5, integrator.getSafety(), 1e-15);
        integrator.setSafety(1.5);
        assertEquals(1.5, integrator.getSafety(), 1e-15);
        integrator.setSafety(-0.1);
        assertEquals(-0.1, integrator.getSafety(), 1e-15);
    }

    @Test
    public void testSetMinReduction() {
        ConcreteIntegrator integrator = createDefault();
        integrator.setMinReduction(0.5);
        assertEquals(0.5, integrator.getMinReduction(), 1e-15);
        integrator.setMinReduction(0.0);
        assertEquals(0.0, integrator.getMinReduction(), 1e-15);
    }

    @Test
    public void testSetMaxGrowth() {
        ConcreteIntegrator integrator = createDefault();
        integrator.setMaxGrowth(5.0);
        assertEquals(5.0, integrator.getMaxGrowth(), 1e-15);
        integrator.setMaxGrowth(0.0);
        assertEquals(0.0, integrator.getMaxGrowth(), 1e-15);
    }

    @Test
    public void testGetOrder() {
        ConcreteIntegrator integrator = createDefault();
        assertEquals(4, integrator.getOrder());
    }

    @Test
    public void testIntegrateSimpleForward() throws DerivativeException, IntegratorException {
        ConcreteIntegrator integrator = createDefault();
        FirstOrderDifferentialEquations eq = new SimpleEquation();
        double t0 = 0.0;
        double[] y0 = new double[]{0.0};
        double t = 1.0;
        double[] y = new double[]{0.0};
        double stopTime = integrator.integrate(eq, t0, y0, t, y);
        assertTrue("Stop time should be >= 1.0", stopTime >= 1.0 - 1e-12);
        assertTrue("y should be > 0.5", y[0] > 0.5);
    }

}