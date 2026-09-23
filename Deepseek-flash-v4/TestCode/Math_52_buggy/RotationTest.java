package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.apache.commons.math.util.FastMath;

public class RotationTest {
    private static final double EPS = 1e-10;

    @Test
    public void testIdentityRotation() {
        Rotation r = Rotation.IDENTITY;
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
        assertEquals(0.0, r.getAngle(), EPS);
    }

    @Test
    public void testConstructorNormalization() {
        Rotation r = new Rotation(2.0, 0.0, 0.0, 0.0, true);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    @Test
    public void testConstructorNoNormalization() {
        Rotation r = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
    }

    @Test
    public void testAxisAngleConstructor() {
        Vector3D axis = new Vector3D(0, 0, 1);
        Rotation r = new Rotation(axis, Math.PI / 2);
        double expectedCos = FastMath.cos(Math.PI / 4);
        double expectedSin = FastMath.sin(Math.PI / 4);
        assertEquals(expectedCos, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(expectedSin, r.getQ3(), EPS);
    }

    @Test(expected = MathRuntimeException.class)
    public void testAxisAngleConstructorZeroNorm() {
        new Rotation(new Vector3D(0, 0, 0), 0.5);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testMatrixConstructorInvalidDimension() {
        new Rotation(new double[][]{{1,0},{0,1}}, 0.1);
    }

    @Test
    public void testMatrixConstructorValid() {
        double[][] m = {{1,0,0},{0,1,0},{0,0,1}};
        Rotation r = new Rotation(m, 0.1);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    @Test
    public void testGetQ0Q1Q2Q3() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        assertEquals(0.5, r.getQ0(), 0.1);
        assertEquals(0.5, r.getQ1(), 0.1);
        assertEquals(0.5, r.getQ2(), 0.1);
        assertEquals(0.5, r.getQ3(), 0.1);
    }

    @Test
    public void testRevert() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        Rotation rev = r.revert();
        assertEquals(r.getQ0(), rev.getQ0(), EPS);
        assertEquals(-r.getQ1(), rev.getQ1(), EPS);
        assertEquals(-r.getQ2(), rev.getQ2(), EPS);
        assertEquals(-r.getQ3(), rev.getQ3(), EPS);
    }

    @Test
    public void testGetAxisIdentity() {
        Rotation r = Rotation.IDENTITY;
        Vector3D axis = r.getAxis();
        assertEquals(0.0, axis.getX(), EPS);
        assertEquals(0.0, axis.getY(), EPS);
        assertEquals(1.0, axis.getZ(), EPS);
    }

    @Test
    public void testGetAxisNonZero() {
        Rotation r = new Rotation(new Vector3D(1, 0, 0), 0.5);
        Vector3D axis = r.getAxis();
        assertEquals(1.0, axis.getX(), EPS);
        assertEquals(0.0, axis.getY(), EPS);
        assertEquals(0.0, axis.getZ(), EPS);
    }

    @Test
    public void testGetAngle() {
        Rotation r = new Rotation(new Vector3D(1, 0, 0), 0.5);
        assertEquals(0.5, r.getAngle(), EPS);
    }

    @Test
    public void testGetAnglesXYZ() {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.1, 0.2, 0.3);
        double[] angles = r.getAngles(RotationOrder.XYZ);
        assertEquals(0.1, angles[0], 1e-6);
        assertEquals(0.2, angles[1], 1e-6);
        assertEquals(0.3, angles[2], 1e-6);
    }

    @Test
    public void testGetAnglesXYZGimbalLock() {
        Rotation r = new Rotation(new double[][]{{0,0,1},{0,1,0},{-1,0,0}}, 0.1);
        double[] angles = r.getAngles(RotationOrder.XYZ);
        assertNotNull(angles);
        assertEquals(3, angles.length);
    }

    @Test
    public void testGetAnglesZYZ() {
        Rotation r = new Rotation(RotationOrder.ZYZ, 0.1, 0.2, 0.3);
        double[] angles = r.getAngles(RotationOrder.ZYZ);
        assertNotNull(angles);
        assertEquals(3, angles.length);
    }

    @Test
    public void testGetAnglesNullOrder() {
        Rotation r = new Rotation(1, 0, 0, 0, false);
        try {
            r.getAngles(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetAnglesUndefinedOrder() {
        Rotation r = new Rotation(1, 0, 0, 0, false);
        try {
            RotationOrder customOrder = new RotationOrder("UNKNOWN", Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_K);
            r.getAngles(customOrder);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testApplyTo() {
        Rotation r = Rotation.IDENTITY;
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D result = r.applyTo(u);
        assertEquals(1.0, result.getX(), EPS);
        assertEquals(2.0, result.getY(), EPS);
        assertEquals(3.0, result.getZ(), EPS);
    }

    @Test
    public void testApplyInverseTo() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D result = r.applyInverseTo(u);
        assertNotNull(result);
        assertEquals(3, result.getX(), 1e-6);
    }

    @Test
    public void testApplyToRotation() {
        Rotation r1 = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        Rotation r2 = new Rotation(0.2, 0.3, 0.4, 0.5, true);
        Rotation result = r1.applyTo(r2);
        assertNotNull(result);
    }

    @Test
    public void testApplyInverseToRotation() {
        Rotation r1 = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        Rotation r2 = new Rotation(0.2, 0.3, 0.4, 0.5, true);
        Rotation result = r1.applyInverseTo(r2);
        assertNotNull(result);
    }

    @Test
    public void testDistance() {
        Rotation r1 = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        Rotation r2 = new Rotation(0.2, 0.3, 0.4, 0.5, true);
        double dist = Rotation.distance(r1, r2);
        assertTrue(dist >= 0);
        assertTrue(dist <= Math.PI);
    }

    @Test
    public void testDistanceSameRotation() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        double dist = Rotation.distance(r, r);
        assertEquals(0.0, dist, EPS);
    }

    @Test
    public void testGetMatrix() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        double[][] m = r.getMatrix();
        assertEquals(3, m.length);
        for (int i = 0; i < 3; i++) {
            assertEquals(3, m[i].length);
        }
    }

    @Test
    public void testRotationOrderConstructor() {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.1, 0.2, 0.3);
        assertNotNull(r.getQ0());
        assertEquals(0.983, r.getQ0(), 1e-3);
    }

    @Test
    public void testVectorConstructor() {
        Vector3D u = new Vector3D(1, 0, 0);
        Vector3D v = new Vector3D(0, 1, 0);
        Rotation r = new Rotation(u, v);
        assertEquals(0.7071067811865476, r.getQ0(), 1e-6);
        assertEquals(0.0, r.getQ1(), 1e-6);
        assertEquals(0.0, r.getQ2(), 1e-6);
        assertEquals(0.7071067811865476, r.getQ3(), 1e-6);
    }

    @Test(expected = MathRuntimeException.class)
    public void testVectorConstructorZeroNorm() {
        new Rotation(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
    }

    @Test
    public void testVectorConstructorOppositeVectors() {
        Vector3D u = new Vector3D(1, 0, 0);
        Vector3D v = new Vector3D(-1, 0, 0);
        Rotation r = new Rotation(u, v);
        assertNotNull(r);
        assertEquals(Math.PI, r.getAngle(), 1e-6);
    }

    @Test
    public void testVectorConstructorNormalCase() {
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(3, 2, 1);
        Rotation r = new Rotation(u, v);
        assertNotNull(r);
        Vector3D rotated = r.applyTo(u);
        double dot = rotated.normalize().dotProduct(v.normalize());
        assertTrue(dot > 0.99);
    }

    @Test
    public void testGetAnglesAllOrders() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, true);
        assertNotNull(r.getAngles(RotationOrder.XYZ));
        assertNotNull(r.getAngles(RotationOrder.XZY));
        assertNotNull(r.getAngles(RotationOrder.YXZ));
        assertNotNull(r.getAngles(RotationOrder.YZX));
        assertNotNull(r.getAngles(RotationOrder.ZXY));
        assertNotNull(r.getAngles(RotationOrder.ZYX));
        assertNotNull(r.getAngles(RotationOrder.XYX));
        assertNotNull(r.getAngles(RotationOrder.XZX));
        assertNotNull(r.getAngles(RotationOrder.YXY));
        assertNotNull(r.getAngles(RotationOrder.YZY));
        assertNotNull(r.getAngles(RotationOrder.ZXZ));
    }
}