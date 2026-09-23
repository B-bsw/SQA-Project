package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RungeKuttaIntegratorTest {

    private ClassicalRungeKuttaIntegrator integrator;
    private FirstOrderDifferentialEquations ode;
    private double[] y0;
    private double[] y;

    @Before
    public void setUp() {
        integrator = new ClassicalRungeKuttaIntegrator(0.5);
        ode = new FirstOrderDifferentialEquations() {
            public int getDimension() {
                return 1;
            }
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = 1.0;
            }
        };
        y0 = new double[] { 0.0 };
        y = new double[1];
    }

    @Test
    public void testIntegrateForward() throws DerivativeException, IntegratorException {
        double stopTime = integrator.integrate(ode, 0.0, y0, 2.0, y);
        Assert.assertEquals(2.0, stopTime, 1e-12);
        Assert.assertEquals(2.0, y[0], 1e-6);
    }

    @Test
    public void testIntegrateBackward() throws DerivativeException, IntegratorException {
        y0[0] = 2.0;
        double stopTime = integrator.integrate(ode, 2.0, y0, 0.0, y);
        Assert.assertEquals(0.0, stopTime, 1e-12);
        Assert.assertEquals(0.0, y[0], 1e-6);
    }

    @Test
    public void testIntegrateSameTime() throws DerivativeException, IntegratorException {
        double stopTime = integrator.integrate(ode, 0.5, y0, 0.5, y);
        Assert.assertEquals(0.5, stopTime, 1e-12);
        Assert.assertEquals(0.0, y[0], 1e-12);
    }

    @Test
    public void testIntegrateWithEvent() throws DerivativeException, IntegratorException {
        EventHandler event = new EventHandler() {
            public double g(double t, double[] y) {
                return t - 0.3;
            }
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.STOP;
            }
            public double resetState(double t, double[] y) {
                return y[0];
            }
        };
        integrator.addEventHandler(event, 1e-9, 1e-6, 100);
        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);
        Assert.assertEquals(0.3, stopTime, 1e-9);
        Assert.assertEquals(0.3, y[0], 1e-5);
    }

    @Test(expected = DerivativeException.class)
    public void testNullEquations() throws DerivativeException, IntegratorException {
        integrator.integrate(null, 0.0, y0, 1.0, y);
    }

    @Test(expected = DerivativeException.class)
    public void testNullY() throws DerivativeException, IntegratorException {
        integrator.integrate(ode, 0.0, y0, 1.0, null);
    }

    @Test(expected = DerivativeException.class)
    public void testDimensionMismatch() throws DerivativeException, IntegratorException {
        FirstOrderDifferentialEquations ode2 = new FirstOrderDifferentialEquations() {
            public int getDimension() {
                return 2;
            }
            public void computeDerivatives(double t, double[] y, double[] yDot) {
                yDot[0] = 1.0;
                yDot[1] = 0.0;
            }
        };
        integrator.integrate(ode2, 0.0, y0, 1.0, y);
    }
}