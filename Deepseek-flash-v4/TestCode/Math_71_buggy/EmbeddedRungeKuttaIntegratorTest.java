package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class TestIntegrator extends EmbeddedRungeKuttaIntegrator {
        public TestIntegrator(String name, boolean fsal,
                              double[] c, double[][] a, double[] b,
                              RungeKuttaStepInterpolator prototype,
                              double minStep, double maxStep,
                              double scalAbsoluteTolerance, double scalRelativeTolerance) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep,
                  scalAbsoluteTolerance, scalRelativeTolerance);
        }

        @Override
        public int getOrder() { return 4; }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            // always accept step
            return 0.0;
        }
    }

    @Test
    public void testSafetyGetterSetter() {
        TestIntegrator integ = createIntegrator();
        assertEquals(0.9, integ.getSafety(), 1e-15);
        integ.setSafety(0.5);
        assertEquals(0.5, integ.getSafety(), 1e-15);
        integ.setSafety(1.5);
        assertEquals(1.5, integ.getSafety(), 1e-15);
    }

    @Test
    public void testMinReductionGetterSetter() {
        TestIntegrator integ = createIntegrator();
        assertEquals(0.2, integ.getMinReduction(), 1e-15);
        integ.setMinReduction(0.1);
        assertEquals(0.1, integ.getMinReduction(), 1e-15);
        integ.setMinReduction(0.0);
        assertEquals(0.0, integ.getMinReduction(), 1e-15);
    }

    @Test
    public void testMaxGrowthGetterSetter() {
        TestIntegrator integ = createIntegrator();
        assertEquals(10.0, integ.getMaxGrowth(), 1e-15);
        integ.setMaxGrowth(5.0);
        assertEquals(5.0, integ.getMaxGrowth(), 1e-15);
        integ.setMaxGrowth(20.0);
        assertEquals(20.0, integ.getMaxGrowth(), 1e-15);
    }

    @Test
    public void testIntegrateForward() throws DerivativeException, IntegratorException {
        TestIntegrator integ = createIntegrator();
        FirstOrderDifferentialEquations eq = new FirstOrderDifferentialEquations() {
            public int getDimension() { return 1; }
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = 1.0;
            }
        };
        double t0 = 0.0;
        double[] y0 = new double[] {0.0};
        double t = 1.0;
        double[] y = new double[1];
        double stopTime = integ.integrate(eq, t0, y0, t, y);
        assertEquals(1.0, y[0], 1e-8);
        assertTrue(stopTime >= 0.9999);
    }

    @Test
    public void testIntegrateBackward() throws DerivativeException, IntegratorException {
        TestIntegrator integ = createIntegrator();
        FirstOrderDifferentialEquations eq = new FirstOrderDifferentialEquations() {
            public int getDimension() { return 1; }
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = 1.0;
            }
        };
        double t0 = 1.0;
        double[] y0 = new double[] {1.0};
        double t = 0.0;
        double[] y = new double[1];
        double stopTime = integ.integrate(eq, t0, y0, t, y);
        assertEquals(0.0, y[0], 1e-8);
        assertTrue(stopTime <= 0.0001);
    }

    @Test(expected = NullPointerException.class)
    public void testIntegrateNullEquations() throws DerivativeException, IntegratorException {
        TestIntegrator integ = createIntegrator();
        integ.integrate(null, 0.0, new double[] {0.0}, 1.0, new double[1]);
    }

    @Test(expected = NullPointerException.class)
    public void testIntegrateNullY0() throws DerivativeException, IntegratorException {
        TestIntegrator integ = createIntegrator();
        FirstOrderDifferentialEquations eq = new FirstOrderDifferentialEquations() {
            public int getDimension() { return 1; }
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = 0.0;
            }
        };
        integ.integrate(eq, 0.0, null, 1.0, new double[1]);
    }

    private TestIntegrator createIntegrator() {
        double[] c = new double[] {0.5};
        double[][] a = new double[][] {{0.5}};
        double[] b = new double[] {0.5, 0.5};
        return new TestIntegrator("test", false, c, a, b, null,
                                  1e-6, 0.1, 1e-10, 1e-10);
    }
}