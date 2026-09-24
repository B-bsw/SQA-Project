package org.apache.commons.math.linear;

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
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        openMapRealVector4.set((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector11.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double16 = openMapRealVector11.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector18.mapSubtract((double) 10);
        double[] doubleArray21 = openMapRealVector18.getData();
        double double22 = openMapRealVector11.getLInfDistance(doubleArray21);
        double double23 = openMapRealVector4.getDistance(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector1.subtract(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector30.mapSubtract((double) 10);
        double[] doubleArray33 = openMapRealVector30.getData();
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector26.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector40.mapSubtract((double) 10);
        double[] doubleArray43 = openMapRealVector40.getData();
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector36.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector30.append(realVector44);
        int int46 = openMapRealVector45.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector48.mapSubtract((double) 10);
        double[] doubleArray51 = openMapRealVector48.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector48.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector61.mapSubtract((double) 10);
        double[] doubleArray64 = openMapRealVector61.getData();
        openMapRealVector61.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double71 = openMapRealVector68.dotProduct(openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector61.append((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector55.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector75.projection((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector80.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double85 = openMapRealVector80.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector89 = openMapRealVector87.mapSubtract((double) 10);
        double[] doubleArray90 = openMapRealVector87.getData();
        double double91 = openMapRealVector80.getLInfDistance(doubleArray90);
        double double92 = openMapRealVector75.getL1Distance(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector72.ebeDivide(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector53.subtract(doubleArray90);
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector45.add(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector24.ebeDivide(doubleArray90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector95.", openMapRealVector1.equals(realVector95) == realVector95.equals(openMapRealVector1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector10.mapSubtract((double) 10);
        double[] doubleArray13 = openMapRealVector10.getData();
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector6.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double21 = openMapRealVector18.dotProduct(openMapRealVector20);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector10.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector28.mapSubtract((double) 10);
        double[] doubleArray31 = openMapRealVector28.getData();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector24.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double39 = openMapRealVector36.dotProduct(openMapRealVector38);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector28.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector10.subtract(openMapRealVector38);
        double double42 = openMapRealVector1.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector1);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector43.add(doubleArray44);
        double double46 = openMapRealVector43.getL1Norm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector45.", openMapRealVector1.equals(realVector45) == realVector45.equals(openMapRealVector1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector11.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append(realVector19);
        int int21 = openMapRealVector20.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector23.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector30.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector36.mapSubtract((double) 10);
        double[] doubleArray39 = openMapRealVector36.getData();
        openMapRealVector36.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double46 = openMapRealVector43.dotProduct(openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.append((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector30.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double60 = openMapRealVector55.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector62.mapSubtract((double) 10);
        double[] doubleArray65 = openMapRealVector62.getData();
        double double66 = openMapRealVector55.getLInfDistance(doubleArray65);
        double double67 = openMapRealVector50.getL1Distance(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector47.ebeDivide(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector28.subtract(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector20.add(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector72.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double79 = openMapRealVector76.dotProduct(openMapRealVector78);
        int int80 = openMapRealVector78.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector84.mapSubtract((double) 10);
        double[] doubleArray87 = openMapRealVector84.getData();
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector78.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray87);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector72.ebeDivide(doubleArray87);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector72.copy();
        double double91 = openMapRealVector20.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector70.", openMapRealVector1.equals(realVector70) == realVector70.equals(openMapRealVector1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector1.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double8 = openMapRealVector5.dotProduct(openMapRealVector7);
        int int9 = openMapRealVector7.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector13.mapSubtract((double) 10);
        double[] doubleArray16 = openMapRealVector13.getData();
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector7.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray16);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector7.mapSubtract((double) '4');
        boolean boolean21 = openMapRealVector7.isDefaultValue((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector27.mapSubtract((double) 10);
        double[] doubleArray30 = openMapRealVector27.getData();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector23.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector37.mapSubtract((double) 10);
        double[] doubleArray40 = openMapRealVector37.getData();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector33.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector27.append(realVector41);
        int int43 = openMapRealVector42.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector7.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector50.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector56.mapSubtract((double) 10);
        double[] doubleArray59 = openMapRealVector56.getData();
        openMapRealVector56.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double66 = openMapRealVector63.dotProduct(openMapRealVector65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector56.append((org.apache.commons.math.linear.RealVector) openMapRealVector65);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector50.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector67);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector70.projection((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector75.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double80 = openMapRealVector75.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector79);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector84 = openMapRealVector82.mapSubtract((double) 10);
        double[] doubleArray85 = openMapRealVector82.getData();
        double double86 = openMapRealVector75.getLInfDistance(doubleArray85);
        double double87 = openMapRealVector70.getL1Distance(doubleArray85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector67.ebeDivide(doubleArray85);
        double double89 = openMapRealVector46.getL1Distance(doubleArray85);
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector42.add(doubleArray85);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector1.append(doubleArray85);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector90.", openMapRealVector1.equals(realVector90) == realVector90.equals(openMapRealVector1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double4 = openMapRealVector1.dotProduct(openMapRealVector3);
        int int5 = openMapRealVector3.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector9.mapSubtract((double) 10);
        double[] doubleArray12 = openMapRealVector9.getData();
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector3.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray12);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector3.mapSubtract((double) '4');
        boolean boolean17 = openMapRealVector3.isDefaultValue((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector33.mapSubtract((double) 10);
        double[] doubleArray36 = openMapRealVector33.getData();
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector29.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append(realVector37);
        int int39 = openMapRealVector38.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector3.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector46.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector52.mapSubtract((double) 10);
        double[] doubleArray55 = openMapRealVector52.getData();
        openMapRealVector52.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double62 = openMapRealVector59.dotProduct(openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector52.append((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector46.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector71.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double76 = openMapRealVector71.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector78.mapSubtract((double) 10);
        double[] doubleArray81 = openMapRealVector78.getData();
        double double82 = openMapRealVector71.getLInfDistance(doubleArray81);
        double double83 = openMapRealVector66.getL1Distance(doubleArray81);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector63.ebeDivide(doubleArray81);
        double double85 = openMapRealVector42.getL1Distance(doubleArray81);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector38.add(doubleArray81);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector38.mapDivideToSelf((double) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector86.", openMapRealVector1.equals(realVector86) == realVector86.equals(openMapRealVector1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double4 = openMapRealVector1.dotProduct(openMapRealVector3);
        int int5 = openMapRealVector3.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector9.mapSubtract((double) 10);
        double[] doubleArray12 = openMapRealVector9.getData();
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector3.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray12);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector3.mapSubtract((double) '4');
        boolean boolean17 = openMapRealVector3.isDefaultValue((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector33.mapSubtract((double) 10);
        double[] doubleArray36 = openMapRealVector33.getData();
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector29.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append(realVector37);
        int int39 = openMapRealVector38.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector3.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        double double41 = openMapRealVector38.getMaxValue();
        double double42 = openMapRealVector38.getSparsity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector44.projection((org.apache.commons.math.linear.RealVector) openMapRealVector46);
        openMapRealVector44.set((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector51.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double56 = openMapRealVector51.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector58.mapSubtract((double) 10);
        double[] doubleArray61 = openMapRealVector58.getData();
        double double62 = openMapRealVector51.getLInfDistance(doubleArray61);
        double double63 = openMapRealVector44.getDistance(doubleArray61);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector38.add(doubleArray61);
        boolean boolean66 = openMapRealVector38.isDefaultValue(1.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector64.", openMapRealVector1.equals(realVector64) == realVector64.equals(openMapRealVector1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector10.mapSubtract((double) 10);
        double[] doubleArray13 = openMapRealVector10.getData();
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector6.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double21 = openMapRealVector18.dotProduct(openMapRealVector20);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector10.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector28.mapSubtract((double) 10);
        double[] doubleArray31 = openMapRealVector28.getData();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector24.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double39 = openMapRealVector36.dotProduct(openMapRealVector38);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector28.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector10.subtract(openMapRealVector38);
        double double42 = openMapRealVector1.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector1);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector43.add(doubleArray44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapSubtract((double) 10);
        double[] doubleArray50 = openMapRealVector47.getData();
        openMapRealVector47.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double57 = openMapRealVector54.dotProduct(openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector47.append((org.apache.commons.math.linear.RealVector) openMapRealVector56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double63 = openMapRealVector60.dotProduct(openMapRealVector62);
        int int64 = openMapRealVector62.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector68.mapSubtract((double) 10);
        double[] doubleArray71 = openMapRealVector68.getData();
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector62.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray71);
        double double73 = openMapRealVector56.getL1Distance(doubleArray71);
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector43.add(doubleArray71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector45.", openMapRealVector1.equals(realVector45) == realVector45.equals(openMapRealVector1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector11.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append(realVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector22.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double27 = openMapRealVector22.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        openMapRealVector22.set((-1.0d));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector35.mapSubtract((double) 10);
        double[] doubleArray38 = openMapRealVector35.getData();
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector31.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double46 = openMapRealVector43.dotProduct(openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector35.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector53.mapSubtract((double) 10);
        double[] doubleArray56 = openMapRealVector53.getData();
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector49.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double64 = openMapRealVector61.dotProduct(openMapRealVector63);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector53.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector35.subtract(openMapRealVector63);
        double[] doubleArray67 = openMapRealVector35.getData();
        int int68 = openMapRealVector35.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector22.add(openMapRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector75.mapSubtract((double) 10);
        double[] doubleArray78 = openMapRealVector75.getData();
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector71.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double86 = openMapRealVector83.dotProduct(openMapRealVector85);
        org.apache.commons.math.linear.RealVector realVector87 = openMapRealVector75.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector85);
        boolean boolean89 = openMapRealVector75.isDefaultValue((double) 0);
        boolean boolean90 = openMapRealVector75.isInfinite();
        double[] doubleArray91 = openMapRealVector75.getData();
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector69.add(doubleArray91);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector20.subtract(doubleArray91);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector92.", openMapRealVector1.equals(realVector92) == realVector92.equals(openMapRealVector1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double16 = openMapRealVector13.dotProduct(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector5.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double34 = openMapRealVector31.dotProduct(openMapRealVector33);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector23.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector5.subtract(openMapRealVector33);
        double[] doubleArray37 = openMapRealVector5.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37);
        openMapRealVector38.set((double) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double52 = openMapRealVector47.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector54.mapSubtract((double) 10);
        double[] doubleArray57 = openMapRealVector54.getData();
        double double58 = openMapRealVector47.getLInfDistance(doubleArray57);
        double double59 = openMapRealVector42.getL1Distance(doubleArray57);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector38.add(doubleArray57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray57, (double) (byte) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector60.", openMapRealVector1.equals(realVector60) == realVector60.equals(openMapRealVector1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double6 = openMapRealVector1.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        openMapRealVector1.set((-1.0d));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector14.mapSubtract((double) 10);
        double[] doubleArray17 = openMapRealVector14.getData();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector10.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double25 = openMapRealVector22.dotProduct(openMapRealVector24);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector14.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector32.mapSubtract((double) 10);
        double[] doubleArray35 = openMapRealVector32.getData();
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector28.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double43 = openMapRealVector40.dotProduct(openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector32.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector14.subtract(openMapRealVector42);
        double[] doubleArray46 = openMapRealVector14.getData();
        int int47 = openMapRealVector14.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector1.add(openMapRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector54.mapSubtract((double) 10);
        double[] doubleArray57 = openMapRealVector54.getData();
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector50.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double65 = openMapRealVector62.dotProduct(openMapRealVector64);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector54.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector64);
        boolean boolean68 = openMapRealVector54.isDefaultValue((double) 0);
        boolean boolean69 = openMapRealVector54.isInfinite();
        double[] doubleArray70 = openMapRealVector54.getData();
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector48.add(doubleArray70);
        java.lang.Class<?> wildcardClass72 = doubleArray70.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector71.", openMapRealVector1.equals(realVector71) == realVector71.equals(openMapRealVector1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(0, (int) (short) -1, (double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector5.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double12 = openMapRealVector9.dotProduct(openMapRealVector11);
        int int13 = openMapRealVector11.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapSubtract((double) 10);
        double[] doubleArray20 = openMapRealVector17.getData();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector11.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector5.ebeDivide(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector3.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector30.mapSubtract((double) 10);
        double[] doubleArray33 = openMapRealVector30.getData();
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector26.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector40.mapSubtract((double) 10);
        double[] doubleArray43 = openMapRealVector40.getData();
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector36.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector30.append(realVector44);
        int int46 = openMapRealVector45.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector48.mapSubtract((double) 10);
        double[] doubleArray51 = openMapRealVector48.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector48.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector61.mapSubtract((double) 10);
        double[] doubleArray64 = openMapRealVector61.getData();
        openMapRealVector61.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double71 = openMapRealVector68.dotProduct(openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector61.append((org.apache.commons.math.linear.RealVector) openMapRealVector70);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector55.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector75.projection((org.apache.commons.math.linear.RealVector) openMapRealVector77);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector80.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double85 = openMapRealVector80.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector84);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector89 = openMapRealVector87.mapSubtract((double) 10);
        double[] doubleArray90 = openMapRealVector87.getData();
        double double91 = openMapRealVector80.getLInfDistance(doubleArray90);
        double double92 = openMapRealVector75.getL1Distance(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector72.ebeDivide(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector53.subtract(doubleArray90);
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector45.add(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector5.append(doubleArray90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and realVector95.", openMapRealVector3.equals(realVector95) == realVector95.equals(openMapRealVector3));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double4 = openMapRealVector1.dotProduct(openMapRealVector3);
        int int5 = openMapRealVector3.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector9.mapSubtract((double) 10);
        double[] doubleArray12 = openMapRealVector9.getData();
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector3.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray12);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector3.mapSubtract((double) '4');
        boolean boolean17 = openMapRealVector3.isDefaultValue((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector33.mapSubtract((double) 10);
        double[] doubleArray36 = openMapRealVector33.getData();
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector29.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector23.append(realVector37);
        int int39 = openMapRealVector38.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector3.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector46.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector52.mapSubtract((double) 10);
        double[] doubleArray55 = openMapRealVector52.getData();
        openMapRealVector52.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double62 = openMapRealVector59.dotProduct(openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector52.append((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector46.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector66.projection((org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector73 = openMapRealVector71.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double76 = openMapRealVector71.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector78.mapSubtract((double) 10);
        double[] doubleArray81 = openMapRealVector78.getData();
        double double82 = openMapRealVector71.getLInfDistance(doubleArray81);
        double double83 = openMapRealVector66.getL1Distance(doubleArray81);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector63.ebeDivide(doubleArray81);
        double double85 = openMapRealVector42.getL1Distance(doubleArray81);
        org.apache.commons.math.linear.RealVector realVector86 = openMapRealVector38.add(doubleArray81);
        org.apache.commons.math.linear.RealVector realVector88 = openMapRealVector38.mapDivideToSelf((double) '#');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector86.", openMapRealVector1.equals(realVector86) == realVector86.equals(openMapRealVector1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector3);
        openMapRealVector1.set((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector8.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double13 = openMapRealVector8.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        double double19 = openMapRealVector8.getLInfDistance(doubleArray18);
        double double20 = openMapRealVector1.getDistance(doubleArray18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector22.projection((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector27.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector33.mapSubtract((double) 10);
        double[] doubleArray36 = openMapRealVector33.getData();
        openMapRealVector33.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double43 = openMapRealVector40.dotProduct(openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector33.append((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector27.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector24.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector52.mapSubtract((double) 10);
        double[] doubleArray55 = openMapRealVector52.getData();
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector48.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double63 = openMapRealVector60.dotProduct(openMapRealVector62);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector52.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector62);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector70.mapSubtract((double) 10);
        double[] doubleArray73 = openMapRealVector70.getData();
        org.apache.commons.math.linear.RealVector realVector74 = openMapRealVector66.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double81 = openMapRealVector78.dotProduct(openMapRealVector80);
        org.apache.commons.math.linear.RealVector realVector82 = openMapRealVector70.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector80);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector52.subtract(openMapRealVector80);
        double[] doubleArray84 = openMapRealVector52.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray84, (double) 10);
        org.apache.commons.math.linear.RealVector realVector87 = openMapRealVector24.add(doubleArray84);
        double double88 = openMapRealVector1.getLInfDistance(doubleArray84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector87.", openMapRealVector1.equals(realVector87) == realVector87.equals(openMapRealVector1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector7.mapSubtract((double) 10);
        double[] doubleArray10 = openMapRealVector7.getData();
        openMapRealVector7.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double17 = openMapRealVector14.dotProduct(openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector1.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector18);
        boolean boolean20 = openMapRealVector18.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector26.mapSubtract((double) 10);
        double[] doubleArray29 = openMapRealVector26.getData();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector22.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double37 = openMapRealVector34.dotProduct(openMapRealVector36);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector26.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector36);
        boolean boolean40 = openMapRealVector26.isDefaultValue((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double45 = openMapRealVector42.dotProduct(openMapRealVector44);
        int int46 = openMapRealVector44.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector50.mapSubtract((double) 10);
        double[] doubleArray53 = openMapRealVector50.getData();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector44.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector26.add(doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector18.ebeMultiply(doubleArray53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector55.", openMapRealVector1.equals(realVector55) == realVector55.equals(openMapRealVector1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double16 = openMapRealVector13.dotProduct(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector5.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        boolean boolean19 = openMapRealVector5.isDefaultValue((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double24 = openMapRealVector21.dotProduct(openMapRealVector23);
        int int25 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapSubtract((double) 10);
        double[] doubleArray32 = openMapRealVector29.getData();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector23.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector5.add(doubleArray32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector34.", openMapRealVector1.equals(realVector34) == realVector34.equals(openMapRealVector1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double6 = openMapRealVector1.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector8.mapSubtract((double) 10);
        double[] doubleArray11 = openMapRealVector8.getData();
        double double12 = openMapRealVector1.getLInfDistance(doubleArray11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double34 = openMapRealVector31.dotProduct(openMapRealVector33);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector23.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector41.mapSubtract((double) 10);
        double[] doubleArray44 = openMapRealVector41.getData();
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector37.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double52 = openMapRealVector49.dotProduct(openMapRealVector51);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector41.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector23.subtract(openMapRealVector51);
        double double55 = openMapRealVector14.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector56.add(doubleArray57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector1.ebeDivide(doubleArray57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector58.", openMapRealVector1.equals(realVector58) == realVector58.equals(openMapRealVector1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector3);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor5 = openMapRealVector1.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector7.projection((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector12.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector18.mapSubtract((double) 10);
        double[] doubleArray21 = openMapRealVector18.getData();
        openMapRealVector18.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double28 = openMapRealVector25.dotProduct(openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector18.append((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector12.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector9.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector37.mapSubtract((double) 10);
        double[] doubleArray40 = openMapRealVector37.getData();
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector33.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double48 = openMapRealVector45.dotProduct(openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector37.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        double[] doubleArray58 = openMapRealVector55.getData();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector51.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector55);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double66 = openMapRealVector63.dotProduct(openMapRealVector65);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector55.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector37.subtract(openMapRealVector65);
        double[] doubleArray69 = openMapRealVector37.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray69, (double) 10);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector9.add(doubleArray69);
        double double73 = openMapRealVector1.getL1Distance(doubleArray69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector72.", openMapRealVector1.equals(realVector72) == realVector72.equals(openMapRealVector1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector7.mapSubtract((double) 10);
        double[] doubleArray10 = openMapRealVector7.getData();
        openMapRealVector7.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double17 = openMapRealVector14.dotProduct(openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector1.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector21.projection((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector26.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double31 = openMapRealVector26.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector33.mapSubtract((double) 10);
        double[] doubleArray36 = openMapRealVector33.getData();
        double double37 = openMapRealVector26.getLInfDistance(doubleArray36);
        double double38 = openMapRealVector21.getL1Distance(doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector18.ebeDivide(doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector41.projection((org.apache.commons.math.linear.RealVector) openMapRealVector43);
        openMapRealVector41.set((double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector48.mapSubtract((double) 10);
        double[] doubleArray51 = openMapRealVector48.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector41.ebeDivide(doubleArray51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector18.subtract(doubleArray51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector59.mapSubtract((double) 10);
        double[] doubleArray62 = openMapRealVector59.getData();
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector55.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double70 = openMapRealVector67.dotProduct(openMapRealVector69);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector59.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector69);
        boolean boolean73 = openMapRealVector59.isDefaultValue((double) 0);
        boolean boolean74 = openMapRealVector59.isInfinite();
        double[] doubleArray75 = openMapRealVector59.getData();
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector18.add(doubleArray75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray75);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector76.", openMapRealVector1.equals(realVector76) == realVector76.equals(openMapRealVector1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double16 = openMapRealVector13.dotProduct(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector5.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        boolean boolean19 = openMapRealVector5.isDefaultValue((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double24 = openMapRealVector21.dotProduct(openMapRealVector23);
        int int25 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapSubtract((double) 10);
        double[] doubleArray32 = openMapRealVector29.getData();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector23.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector5.add(doubleArray32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator35 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry36 = openMapRealVector5.new OpenMapEntry(iterator35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector34.", openMapRealVector1.equals(realVector34) == realVector34.equals(openMapRealVector1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double16 = openMapRealVector13.dotProduct(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector5.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double34 = openMapRealVector31.dotProduct(openMapRealVector33);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector23.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector5.subtract(openMapRealVector33);
        double[] doubleArray37 = openMapRealVector5.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37);
        openMapRealVector38.set((double) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double52 = openMapRealVector47.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector54.mapSubtract((double) 10);
        double[] doubleArray57 = openMapRealVector54.getData();
        double double58 = openMapRealVector47.getLInfDistance(doubleArray57);
        double double59 = openMapRealVector42.getL1Distance(doubleArray57);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector38.add(doubleArray57);
        double double61 = openMapRealVector38.getNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector60.", openMapRealVector1.equals(realVector60) == realVector60.equals(openMapRealVector1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector6.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector12.mapSubtract((double) 10);
        double[] doubleArray15 = openMapRealVector12.getData();
        openMapRealVector12.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double22 = openMapRealVector19.dotProduct(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector12.append((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector6.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector3.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector31.mapSubtract((double) 10);
        double[] doubleArray34 = openMapRealVector31.getData();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector27.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double42 = openMapRealVector39.dotProduct(openMapRealVector41);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector31.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector49.mapSubtract((double) 10);
        double[] doubleArray52 = openMapRealVector49.getData();
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector45.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double60 = openMapRealVector57.dotProduct(openMapRealVector59);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector49.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector31.subtract(openMapRealVector59);
        double[] doubleArray63 = openMapRealVector31.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray63, (double) 10);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector3.add(doubleArray63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector3.mapAdd((double) (-1));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector66.", openMapRealVector1.equals(realVector66) == realVector66.equals(openMapRealVector1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector11.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append(realVector19);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector20.mapDivideToSelf((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector24.projection((org.apache.commons.math.linear.RealVector) openMapRealVector26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector33.mapSubtract((double) 10);
        double[] doubleArray36 = openMapRealVector33.getData();
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector29.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double44 = openMapRealVector41.dotProduct(openMapRealVector43);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector33.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector51.mapSubtract((double) 10);
        double[] doubleArray54 = openMapRealVector51.getData();
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector47.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double62 = openMapRealVector59.dotProduct(openMapRealVector61);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector51.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector33.subtract(openMapRealVector61);
        double double65 = openMapRealVector24.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector24);
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector66.add(doubleArray67);
        double double69 = openMapRealVector20.dotProduct(doubleArray67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector68.", openMapRealVector1.equals(realVector68) == realVector68.equals(openMapRealVector1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector11.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append(realVector19);
        int int21 = openMapRealVector20.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector23.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector30.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector36.mapSubtract((double) 10);
        double[] doubleArray39 = openMapRealVector36.getData();
        openMapRealVector36.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double46 = openMapRealVector43.dotProduct(openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.append((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector30.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double60 = openMapRealVector55.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector62.mapSubtract((double) 10);
        double[] doubleArray65 = openMapRealVector62.getData();
        double double66 = openMapRealVector55.getLInfDistance(doubleArray65);
        double double67 = openMapRealVector50.getL1Distance(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector47.ebeDivide(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector28.subtract(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector20.add(doubleArray65);
        int int71 = openMapRealVector20.getMinIndex();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector70.", openMapRealVector1.equals(realVector70) == realVector70.equals(openMapRealVector1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector11.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append(realVector19);
        int int21 = openMapRealVector20.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector23.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector30.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector36.mapSubtract((double) 10);
        double[] doubleArray39 = openMapRealVector36.getData();
        openMapRealVector36.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double46 = openMapRealVector43.dotProduct(openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.append((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector30.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double60 = openMapRealVector55.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector62.mapSubtract((double) 10);
        double[] doubleArray65 = openMapRealVector62.getData();
        double double66 = openMapRealVector55.getLInfDistance(doubleArray65);
        double double67 = openMapRealVector50.getL1Distance(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector47.ebeDivide(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector28.subtract(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector20.add(doubleArray65);
        double double71 = openMapRealVector20.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector70.", openMapRealVector1.equals(realVector70) == realVector70.equals(openMapRealVector1));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapSubtract((double) 10);
        double[] doubleArray18 = openMapRealVector15.getData();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector11.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append(realVector19);
        int int21 = openMapRealVector20.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector23.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector30.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector36.mapSubtract((double) 10);
        double[] doubleArray39 = openMapRealVector36.getData();
        openMapRealVector36.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double46 = openMapRealVector43.dotProduct(openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.append((org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector30.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector50.projection((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double60 = openMapRealVector55.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector62.mapSubtract((double) 10);
        double[] doubleArray65 = openMapRealVector62.getData();
        double double66 = openMapRealVector55.getLInfDistance(doubleArray65);
        double double67 = openMapRealVector50.getL1Distance(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector47.ebeDivide(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector28.subtract(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector20.add(doubleArray65);
        double double71 = openMapRealVector20.getNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector70.", openMapRealVector1.equals(realVector70) == realVector70.equals(openMapRealVector1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector1.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector1.mapMultiply((double) 1.0f);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector1.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 10, 1.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector13.projection((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector22.mapSubtract((double) 10);
        double[] doubleArray25 = openMapRealVector22.getData();
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector18.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector28.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double33 = openMapRealVector28.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector35.mapSubtract((double) 10);
        double[] doubleArray38 = openMapRealVector35.getData();
        double double39 = openMapRealVector28.getLInfDistance(doubleArray38);
        double double40 = openMapRealVector18.getL1Distance(openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector42.mapSubtract((double) 10);
        double double45 = openMapRealVector28.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector15.add(openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector52.mapSubtract((double) 10);
        double[] doubleArray55 = openMapRealVector52.getData();
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector48.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double63 = openMapRealVector60.dotProduct(openMapRealVector62);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector52.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector62);
        double double65 = openMapRealVector52.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector46.add((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double71 = openMapRealVector68.dotProduct(openMapRealVector70);
        int int72 = openMapRealVector70.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector78 = openMapRealVector76.mapSubtract((double) 10);
        double[] doubleArray79 = openMapRealVector76.getData();
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector70.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray79);
        double double81 = openMapRealVector46.getL1Distance(doubleArray79);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector11.add(doubleArray79);
        double double84 = openMapRealVector1.getLInfDistance(doubleArray79);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector83.", openMapRealVector1.equals(realVector83) == realVector83.equals(openMapRealVector1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(0, (int) (short) -1, (double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector5.mapAdd((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double12 = openMapRealVector9.dotProduct(openMapRealVector11);
        int int13 = openMapRealVector11.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapSubtract((double) 10);
        double[] doubleArray20 = openMapRealVector17.getData();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector11.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector5.ebeDivide(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector5.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector3.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector5.mapAddToSelf((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector32.mapSubtract((double) 10);
        double[] doubleArray35 = openMapRealVector32.getData();
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector28.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector42.mapSubtract((double) 10);
        double[] doubleArray45 = openMapRealVector42.getData();
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector38.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector32.append(realVector46);
        int int48 = openMapRealVector47.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector50.mapSubtract((double) 10);
        double[] doubleArray53 = openMapRealVector50.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector50.mapAddToSelf((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector57.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector63.mapSubtract((double) 10);
        double[] doubleArray66 = openMapRealVector63.getData();
        openMapRealVector63.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double73 = openMapRealVector70.dotProduct(openMapRealVector72);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector63.append((org.apache.commons.math.linear.RealVector) openMapRealVector72);
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector57.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector77.projection((org.apache.commons.math.linear.RealVector) openMapRealVector79);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector84 = openMapRealVector82.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double87 = openMapRealVector82.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector86);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector91 = openMapRealVector89.mapSubtract((double) 10);
        double[] doubleArray92 = openMapRealVector89.getData();
        double double93 = openMapRealVector82.getLInfDistance(doubleArray92);
        double double94 = openMapRealVector77.getL1Distance(doubleArray92);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector95 = openMapRealVector74.ebeDivide(doubleArray92);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector55.subtract(doubleArray92);
        org.apache.commons.math.linear.RealVector realVector97 = openMapRealVector47.add(doubleArray92);
        double double98 = openMapRealVector5.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and realVector97.", openMapRealVector3.equals(realVector97) == realVector97.equals(openMapRealVector3));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapSubtract((double) 10);
        double[] doubleArray8 = openMapRealVector5.getData();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector1.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double16 = openMapRealVector13.dotProduct(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector5.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapSubtract((double) 10);
        double[] doubleArray26 = openMapRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector19.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double34 = openMapRealVector31.dotProduct(openMapRealVector33);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector23.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector5.subtract(openMapRealVector33);
        double[] doubleArray37 = openMapRealVector5.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37);
        openMapRealVector38.set((double) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector42.projection((org.apache.commons.math.linear.RealVector) openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double52 = openMapRealVector47.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector56 = openMapRealVector54.mapSubtract((double) 10);
        double[] doubleArray57 = openMapRealVector54.getData();
        double double58 = openMapRealVector47.getLInfDistance(doubleArray57);
        double double59 = openMapRealVector42.getL1Distance(doubleArray57);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector38.add(doubleArray57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector60.", openMapRealVector1.equals(realVector60) == realVector60.equals(openMapRealVector1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0);
        boolean boolean6 = openMapRealVector4.isDefaultValue(100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((-1), (int) (short) 10, (double) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector12.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double17 = openMapRealVector12.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector19.mapSubtract((double) 10);
        double[] doubleArray22 = openMapRealVector19.getData();
        double double23 = openMapRealVector12.getLInfDistance(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapSubtract((double) 10);
        double[] doubleArray32 = openMapRealVector29.getData();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector25.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double40 = openMapRealVector37.dotProduct(openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector29.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapSubtract((double) 10);
        double[] doubleArray50 = openMapRealVector47.getData();
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector43.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double58 = openMapRealVector55.dotProduct(openMapRealVector57);
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector47.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector29.subtract(openMapRealVector57);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor61 = openMapRealVector29.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector65 = openMapRealVector63.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double68 = openMapRealVector63.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector67);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector70.mapSubtract((double) 10);
        double[] doubleArray73 = openMapRealVector70.getData();
        double double74 = openMapRealVector63.getLInfDistance(doubleArray73);
        double double75 = openMapRealVector29.getLInfDistance(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector12.ebeDivide(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray73, (double) 0.0f);
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector10.add(doubleArray73);
        double double80 = openMapRealVector4.getL1Distance(doubleArray73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector79.", openMapRealVector2.equals(realVector79) == realVector79.equals(openMapRealVector2));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 0, (int) (short) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.projection((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector13.mapSubtract((double) 10);
        double[] doubleArray16 = openMapRealVector13.getData();
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector9.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double24 = openMapRealVector21.dotProduct(openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector13.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector31.mapSubtract((double) 10);
        double[] doubleArray34 = openMapRealVector31.getData();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector27.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double42 = openMapRealVector39.dotProduct(openMapRealVector41);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector31.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector13.subtract(openMapRealVector41);
        double double45 = openMapRealVector4.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector46.add(doubleArray47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector2.projection(doubleArray47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector48.", openMapRealVector2.equals(realVector48) == realVector48.equals(openMapRealVector2));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector7.mapSubtract((double) 10);
        double[] doubleArray10 = openMapRealVector7.getData();
        openMapRealVector7.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double17 = openMapRealVector14.dotProduct(openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector1.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double24 = openMapRealVector21.dotProduct(openMapRealVector23);
        int int25 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapSubtract((double) 10);
        double[] doubleArray32 = openMapRealVector29.getData();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector23.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray32);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector23.mapSubtract((double) '4');
        boolean boolean37 = openMapRealVector23.isDefaultValue((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector43.mapSubtract((double) 10);
        double[] doubleArray46 = openMapRealVector43.getData();
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector39.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector53.mapSubtract((double) 10);
        double[] doubleArray56 = openMapRealVector53.getData();
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector49.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector43.append(realVector57);
        int int59 = openMapRealVector58.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector23.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector1.append(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator62 = openMapRealVector1.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        openMapRealVector64.set((double) (short) 1);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector64.mapSubtract((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector64.mapAdd((double) 0);
        boolean boolean75 = openMapRealVector73.isDefaultValue((double) 1);
        double[] doubleArray76 = openMapRealVector73.toArray();
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector1.add(doubleArray76);
        org.apache.commons.math.linear.RealVector realVector79 = openMapRealVector1.mapMultiply((double) 10.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector77.", openMapRealVector1.equals(realVector77) == realVector77.equals(openMapRealVector1));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math.linear.RealVector) openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector6.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector12.mapSubtract((double) 10);
        double[] doubleArray15 = openMapRealVector12.getData();
        openMapRealVector12.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double22 = openMapRealVector19.dotProduct(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector12.append((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector6.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector3.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector31.mapSubtract((double) 10);
        double[] doubleArray34 = openMapRealVector31.getData();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector27.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double42 = openMapRealVector39.dotProduct(openMapRealVector41);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector31.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector49.mapSubtract((double) 10);
        double[] doubleArray52 = openMapRealVector49.getData();
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector45.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double60 = openMapRealVector57.dotProduct(openMapRealVector59);
        org.apache.commons.math.linear.RealVector realVector61 = openMapRealVector49.combineToSelf((double) (byte) 100, (double) ' ', (org.apache.commons.math.linear.RealVector) openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector31.subtract(openMapRealVector59);
        double[] doubleArray63 = openMapRealVector31.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray63, (double) 10);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector3.add(doubleArray63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector3.copy();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector66.", openMapRealVector1.equals(realVector66) == realVector66.equals(openMapRealVector1));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtract((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector7.mapSubtract((double) 10);
        double[] doubleArray10 = openMapRealVector7.getData();
        openMapRealVector7.set((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double17 = openMapRealVector14.dotProduct(openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) openMapRealVector16);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector1.combineToSelf((double) (-1L), (double) 0, (org.apache.commons.math.linear.RealVector) openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double double24 = openMapRealVector21.dotProduct(openMapRealVector23);
        int int25 = openMapRealVector23.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapSubtract((double) 10);
        double[] doubleArray32 = openMapRealVector29.getData();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector23.combineToSelf((double) 1.0f, (double) 1.0f, doubleArray32);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector23.mapSubtract((double) '4');
        boolean boolean37 = openMapRealVector23.isDefaultValue((double) (short) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector43.mapSubtract((double) 10);
        double[] doubleArray46 = openMapRealVector43.getData();
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector39.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector53.mapSubtract((double) 10);
        double[] doubleArray56 = openMapRealVector53.getData();
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector49.combine((double) 1L, (double) 10L, (org.apache.commons.math.linear.RealVector) openMapRealVector53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector43.append(realVector57);
        int int59 = openMapRealVector58.getMaxIndex();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector23.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector58);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector1.append(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator62 = openMapRealVector1.new OpenMapSparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector64.projection((org.apache.commons.math.linear.RealVector) openMapRealVector66);
        openMapRealVector64.set((double) (short) 1);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector64.mapSubtract((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector64.mapAdd((double) 0);
        boolean boolean75 = openMapRealVector73.isDefaultValue((double) 1);
        double[] doubleArray76 = openMapRealVector73.toArray();
        org.apache.commons.math.linear.RealVector realVector77 = openMapRealVector1.add(doubleArray76);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and realVector77.", openMapRealVector1.equals(realVector77) == realVector77.equals(openMapRealVector1));
    }
}

