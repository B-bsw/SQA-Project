package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 1, (double) (byte) 0, (double) 0.0f, (double) (-1), false);
        double double6 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D7 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D7, (double) 0L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double22 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation15, rotation21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation34);
        double double36 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation15.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double45 = rotation44.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double58 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation51, rotation57);
        double double59 = rotation51.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double73 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation66, rotation72);
        double double74 = rotation66.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation51.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation44.applyInverseTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation15.applyInverseTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation9.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation80.revert();
        double[][] doubleArray82 = rotation81.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray82, 0.028282385855620585d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation9.applyInverseTo(rotation84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D38 and vector3D79", vector3D38.equals(vector3D79) ? vector3D38.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double6 = rotation5.getAngle();
        double double7 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation10 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D8, (-0.27875162084482513d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 1, (double) (byte) 0, (double) 0.0f, (double) (-1), false);
        double double17 = rotation16.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation16.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 0L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double33 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation26, rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation45);
        double double47 = rotation39.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = rotation26.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double56 = rotation55.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double69 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation62, rotation68);
        double double70 = rotation62.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double84 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation77, rotation83);
        double double85 = rotation77.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation62.applyTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation55.applyInverseTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation26.applyInverseTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation20.applyTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D8, vector3D86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D49 and vector3D90", vector3D49.equals(vector3D90) ? vector3D49.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation7, rotation13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation26);
        double double28 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation7.applyInverseTo(rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double37 = rotation36.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation49);
        double double51 = rotation43.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation64);
        double double66 = rotation58.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation43.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation36.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation7.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double77 = rotation76.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation89);
        double[][] doubleArray91 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        double double93 = rotation92.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation0.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation98 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D96, (double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D96", vector3D30.equals(vector3D96) ? vector3D30.hashCode() == vector3D96.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation7, rotation13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation26);
        double double28 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation7.applyInverseTo(rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double37 = rotation36.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation49);
        double double51 = rotation43.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation64);
        double double66 = rotation58.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation43.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation36.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation7.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double77 = rotation76.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation89);
        double[][] doubleArray91 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        double double93 = rotation92.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation0.applyTo(vector3D67);
        java.lang.Class<?> wildcardClass97 = vector3D96.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D96", vector3D30.equals(vector3D96) ? vector3D30.hashCode() == vector3D96.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 1, (double) (byte) 0, (double) 0.0f, (double) (-1), false);
        double double6 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D7 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D7, (double) 0L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double22 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation15, rotation21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation34);
        double double36 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation15.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double45 = rotation44.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double58 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation51, rotation57);
        double double59 = rotation51.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double73 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation66, rotation72);
        double double74 = rotation66.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation51.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation44.applyInverseTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation15.applyInverseTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation9.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation9.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D38 and vector3D79", vector3D38.equals(vector3D79) ? vector3D38.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation7, rotation13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation26);
        double double28 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation7.applyInverseTo(rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double37 = rotation36.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation49);
        double double51 = rotation43.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation64);
        double double66 = rotation58.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation43.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation36.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation7.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double77 = rotation76.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation89);
        double[][] doubleArray91 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        double double93 = rotation92.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation0.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation98 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, (double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D96", vector3D30.equals(vector3D96) ? vector3D30.hashCode() == vector3D96.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation7, rotation13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation26);
        double double28 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation7.applyInverseTo(rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double37 = rotation36.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation49);
        double double51 = rotation43.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation64);
        double double66 = rotation58.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation43.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation36.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation7.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double77 = rotation76.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation89);
        double[][] doubleArray91 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        double double93 = rotation92.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation0.applyTo(vector3D67);
        java.lang.Class<?> wildcardClass97 = rotation0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D96", vector3D30.equals(vector3D96) ? vector3D30.hashCode() == vector3D96.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation7, rotation13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation26);
        double double28 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation7.applyInverseTo(rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double37 = rotation36.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation49);
        double double51 = rotation43.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation64);
        double double66 = rotation58.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation43.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation36.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation7.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double77 = rotation76.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation89);
        double[][] doubleArray91 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        double double93 = rotation92.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation0.applyTo(vector3D67);
        double double97 = rotation0.getQ0();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D96", vector3D30.equals(vector3D96) ? vector3D30.hashCode() == vector3D96.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 1, (double) (byte) 0, (double) 0.0f, (double) (-1), false);
        double double6 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D7 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D7, (double) 0L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double22 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation15, rotation21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation34);
        double double36 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation15.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double45 = rotation44.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double58 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation51, rotation57);
        double double59 = rotation51.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double73 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation66, rotation72);
        double double74 = rotation66.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation51.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation44.applyInverseTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation15.applyInverseTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation9.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, 0.1303000702364093d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D38 and vector3D79", vector3D38.equals(vector3D79) ? vector3D38.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        double[][] doubleArray2 = rotation1.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray2, 0.028282385855620585d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray2, 0.14879936743174696d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double19 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation18);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double32 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation25, rotation31);
        double double33 = rotation25.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = rotation12.applyInverseTo(rotation25);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double42 = rotation41.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double55 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation48, rotation54);
        double double56 = rotation48.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double70 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation63, rotation69);
        double double71 = rotation63.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation63.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation48.applyTo(vector3D72);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation41.applyInverseTo(vector3D72);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation12.applyInverseTo(vector3D72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D72, 0.8757240442223501d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation6.applyInverseTo(vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D79, 0.5773470624630892d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D78 and vector3D79", vector3D78.equals(vector3D79) ? vector3D78.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation7, rotation13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation26);
        double double28 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation7.applyInverseTo(rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double37 = rotation36.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation49);
        double double51 = rotation43.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation64);
        double double66 = rotation58.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation43.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation36.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation7.applyInverseTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double77 = rotation76.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation89);
        double[][] doubleArray91 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        double double93 = rotation92.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation0.applyTo(vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation98 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D96, (-0.9906381084133116d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D30 and vector3D96", vector3D30.equals(vector3D96) ? vector3D30.hashCode() == vector3D96.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation1 = rotation0.revert();
        double double2 = rotation0.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D3 = rotation0.getAxis();
        double double4 = rotation0.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation10 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 1, (double) 1.0f, (double) (short) -1, Double.NaN, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D11 = rotation10.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation17.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = rotation17.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = rotation10.applyInverseTo(rotation19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double33 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation26, rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation45);
        double double47 = rotation39.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = rotation26.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 1.0d, (double) (short) -1, (double) (-1L), false);
        double double56 = rotation55.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double69 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation62, rotation68);
        double double70 = rotation62.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100L, (double) 100L, (double) (byte) -1, (double) 0, false);
        double double84 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation77, rotation83);
        double double85 = rotation77.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation62.applyTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation55.applyInverseTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation26.applyInverseTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D86, 0.8757240442223501d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation20.applyInverseTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D93 = rotation0.applyInverseTo(vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D93, (-0.46119897352151257d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D49 and vector3D93", vector3D49.equals(vector3D93) ? vector3D49.hashCode() == vector3D93.hashCode() : true);
    }
}

