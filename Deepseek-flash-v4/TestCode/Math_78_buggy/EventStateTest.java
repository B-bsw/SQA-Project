package org.apache.commons.math.ode.events;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.StepInterpolator;

public class EventStateTest {

    // ====== Helper inner classes ======

    static class TestHandler implements EventHandler {
        private double root;
        private int nextAction = EventHandler.CONTINUE;
        private boolean throwEventException;
        private boolean throwDerivativeException;
        private boolean resetStateCalled;

        public TestHandler(double root) { this.root = root; }
        public void setRoot(double r) { this.root = r; }
        public void setNextAction(int action) { this.nextAction = action; }
        public void setThrowEventException(boolean b) { this.throwEventException = b; }
        public void setThrowDerivativeException(boolean b) { this.throwDerivativeException = b; }
        public boolean isResetStateCalled() { return resetStateCalled; }

        public double g(double t, double[] y) throws EventException, DerivativeException {
            if (throwEventException) throw new EventException("test");
            if (throwDerivativeException) throw new DerivativeException("test");
            return t - root;
        }

        public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
            return nextAction;
        }

        public void resetState(double t, double[] y) throws EventException {
            resetStateCalled = true;
        }
    }

    static class SimpleStepInterpolator implements StepInterpolator {
        private boolean forward;
        private double currentTime;
        private double previousTime;
        private double[] state;
        private double interpolatedTime;

        public SimpleStepInterpolator(boolean forward, double currentTime, double previousTime, double[] state) {
            this.forward = forward;
            this.currentTime = currentTime;
            this.previousTime = previousTime;
            this.state = state;
        }

        public boolean isForward() { return forward; }
        public double getCurrentTime() { return currentTime; }
        public double getInterpolatedTime() { return interpolatedTime; }
        public void setInterpolatedTime(double time) { this.interpolatedTime = time; }
        public double[] getInterpolatedState() { return state; }
        public double[] getInterpolatedDerivatives() { return new double[0]; }
        public double getPreviousTime() { return previousTime; }
        public double getNextTime() { return currentTime; }
        public double getGlobalPreviousTime() { return previousTime; }
        public double getGlobalCurrentTime() { return currentTime; }
        public double[] getInterpolatedSecondaryState(int index) { return new double[0]; }
        public double[] getInterpolatedSecondaryDerivatives(int index) { return new double[0]; }
    }

    // ====== Test methods ======

    @Test
    public void testConstructorAndGetters() {
        TestHandler handler = new TestHandler(1.0);
        double maxCheck = 100.0;
        double convergence = 1e-6;
        int maxIter = 100;
        EventState state = new EventState(handler, maxCheck, convergence, maxIter);
        assertSame(handler, state.getEventHandler());
        assertEquals(maxCheck, state.getMaxCheckInterval(), 0.0);
        assertEquals(Math.abs(convergence), state.getConvergence(), 0.0);
        assertEquals(maxIter, state.getMaxIterationCount());
    }

    @Test
    public void testReinitializeBegin() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        double[] y = new double[]{1.0};
        state.reinitializeBegin(0.0, y);
        // evaluateStep should detect sign change because g0 negative, g1 positive
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, y);
        assertTrue(state.evaluateStep(interp));
        assertFalse(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testEvaluateStepNoEvent() throws Exception {
        TestHandler handler = new TestHandler(5.0) {
            public double g(double t, double[] y) { return 1.0; } // always positive
        };
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        boolean result = state.evaluateStep(interp);
        assertFalse(result);
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testEvaluateStepWithEvent() throws Exception {
        TestHandler handler = new TestHandler(5.0); // g(t)=t-5, root at 5
        EventState state = new EventState(handler, 100.0, 1e-9, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        boolean result = state.evaluateStep(interp);
        assertTrue(result);
        double eventTime = state.getEventTime();
        assertFalse(Double.isNaN(eventTime));
        assertEquals(5.0, eventTime, 1e-6);
    }

    @Test
    public void testEvaluateStepBackward() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        EventState state = new EventState(handler, 100.0, 1e-9, 100);
        state.reinitializeBegin(10.0, new double[]{1}); // g(10)=5 >0
        SimpleStepInterpolator interp = new SimpleStepInterpolator(false, 0.0, 10.0, new double[]{1});
        boolean result = state.evaluateStep(interp);
        assertTrue(result);
        assertEquals(5.0, state.getEventTime(), 1e-6);
    }

    @Test
    public void testEvaluateStepMultipleSubsteps() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        EventState state = new EventState(handler, 2.5, 1e-9, 100); // maxCheckInterval=2.5 -> ceil(10/2.5)=4
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        boolean result = state.evaluateStep(interp);
        assertTrue(result);
        assertEquals(5.0, state.getEventTime(), 1e-6);
    }

    @Test
    public void testEvaluateStepNoEventMultipleSubsteps() throws Exception {
        TestHandler handler = new TestHandler(5.0) {
            public double g(double t, double[] y) { return 1.0; }
        };
        EventState state = new EventState(handler, 2.5, 1e-9, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        boolean result = state.evaluateStep(interp);
        assertFalse(result);
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test(expected = DerivativeException.class)
    public void testEvaluateStepDerivativeException() throws DerivativeException, EventException, ConvergenceException {
        TestHandler handler = new TestHandler(5.0);
        handler.setThrowDerivativeException(true);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        state.evaluateStep(interp);
    }

    @Test(expected = EventException.class)
    public void testEvaluateStepEventException() throws DerivativeException, EventException, ConvergenceException {
        TestHandler handler = new TestHandler(5.0);
        handler.setThrowEventException(true);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        state.evaluateStep(interp);
    }

    @Test
    public void testEvaluateStepPastEvent() throws Exception {
        TestHandler handler = new TestHandler(0.05); // root at 0.05
        EventState state = new EventState(handler, 100.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp1 = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        boolean firstResult = state.evaluateStep(interp1);
        assertTrue(firstResult);
        double eventTime1 = state.getEventTime();
        assertEquals(0.05, eventTime1, 1e-6);
        // accept the event
        state.stepAccepted(eventTime1, new double[]{1}); // previousEventTime = 0.05
        // now set a new root very close to the previous event (0.06)
        handler.setRoot(0.06);
        // evaluate a step that starts at t0 = 0.05 (after stepAccepted)
        SimpleStepInterpolator interp2 = new SimpleStepInterpolator(true, 10.0, 0.05, new double[]{1});
        boolean secondResult = state.evaluateStep(interp2);
        assertFalse(secondResult); // ignored because root is within convergence of previousEventTime
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testEvaluateStepAcceptAfterReject() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        EventState state = new EventState(handler, 100.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp1 = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        boolean firstResult = state.evaluateStep(interp1);
        assertTrue(firstResult);
        double eventTime = state.getEventTime();
        assertEquals(5.0, eventTime, 1e-6);
        // second step ends very close to the pending event time
        SimpleStepInterpolator interp2 = new SimpleStepInterpolator(true, 5.05, 0.0, new double[]{1});
        boolean secondResult = state.evaluateStep(interp2);
        assertFalse(secondResult); // should accept because step ends near the pending event
        assertEquals(eventTime, state.getEventTime(), 1e-6); // pending event still exists
    }

    @Test
    public void testStepAcceptedWithPendingEventStop() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        handler.setNextAction(EventHandler.STOP);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        state.evaluateStep(interp); // fires event, pendingEvent = true
        state.stepAccepted(5.0, new double[]{1});
        assertTrue(state.stop());
    }

    @Test
    public void testStepAcceptedWithoutPendingEvent() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        state.stepAccepted(10.0, new double[]{1}); // no pending event
        assertFalse(state.stop());
    }

    @Test
    public void testResetNoPendingEvent() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        assertFalse(state.reset(0.0, new double[]{1}));
    }

    @Test
    public void testResetWithResetState() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        handler.setNextAction(EventHandler.RESET_STATE);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        state.evaluateStep(interp);
        state.stepAccepted(5.0, new double[]{1});
        assertTrue(state.reset(5.0, new double[]{1}));
        assertTrue(handler.isResetStateCalled());
    }

    @Test
    public void testResetWithResetDerivatives() throws Exception {
        TestHandler handler = new TestHandler(5.0);
        handler.setNextAction(EventHandler.RESET_DERIVATIVES);
        EventState state = new EventState(handler, 100.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[]{1});
        SimpleStepInterpolator interp = new SimpleStepInterpolator(true, 10.0, 0.0, new double[]{1});
        state.evaluateStep(interp);
        state.stepAccepted(5.0, new double[]{1});
        assertTrue(state.reset(5.0, new double[]{1}));
        assertFalse(handler.isResetStateCalled()); // resetState not called for RESET_DERIVATIVES
    }
}