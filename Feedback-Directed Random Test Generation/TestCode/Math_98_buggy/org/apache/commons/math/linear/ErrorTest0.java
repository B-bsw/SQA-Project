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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray17 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray35 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix2 = realMatrixImpl0.getRowMatrix(10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray10 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray16 = new double[][] { doubleArray5, doubleArray10, doubleArray15 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        boolean boolean36 = realMatrixImpl34.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl0.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray92 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl33.add(realMatrix69);
        java.lang.String str71 = realMatrixImpl33.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray72 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        java.math.BigDecimal bigDecimal65 = bigMatrixImpl28.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl28.inverse();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray87);
        realMatrixImpl71.lu = doubleArray87;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray91 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray20 = realMatrixImpl19.getPermutation();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        double[][] doubleArray92 = realMatrixImpl71.data;
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl71.scalarAdd((double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray95 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = realMatrixImpl0.getRow((int) (byte) -1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        double[] doubleArray93 = realMatrixImpl71.getRow(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray94 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray46 = new double[][] { doubleArray35, doubleArray40, doubleArray45 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray46);
        java.math.BigDecimal[] bigDecimalArray50 = bigMatrixImpl48.getColumn((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl13.operate(bigDecimalArray50);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray53 = bigMatrixImpl52.getPermutation();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl53.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (short) 10);
        int int3 = bigMatrixImpl2.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        bigMatrixImpl28.setRoundingMode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl28.inverse();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        int int32 = bigMatrixImpl13.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray1 = bigMatrixImpl0.lu;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl0 and bigMatrixImpl0", bigMatrixImpl0.equals(bigMatrixImpl0) ? bigMatrixImpl0.hashCode() == bigMatrixImpl0.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        boolean boolean71 = realMatrixImpl69.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl69.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl33.add(realMatrix73);
        int[] intArray75 = realMatrixImpl33.permutation;
        double[][] doubleArray76 = realMatrixImpl33.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray77 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray36 = realMatrixImpl16.getRow(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray37 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        bigMatrixImpl28.setRoundingMode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray67 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (short) 10);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        double[][] doubleArray92 = realMatrixImpl71.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray95 = realMatrixImpl94.getPermutation();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.lang.String str47 = bigMatrixImpl46.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl46.scalarAdd(bigDecimal48);
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl46.getTrace();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl13.scalarAdd(bigDecimal50);
        java.lang.String str52 = bigMatrixImpl13.toString();
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        java.math.BigDecimal[] bigDecimalArray72 = bigMatrixImpl70.getColumn((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray73 = bigMatrixImpl13.solve(bigDecimalArray72);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray10 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray16 = new double[][] { doubleArray5, doubleArray10, doubleArray15 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl17.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl17.copy();
        double[] doubleArray42 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray53 = new double[][] { doubleArray42, doubleArray47, doubleArray52 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        boolean boolean58 = realMatrixImpl17.equals((java.lang.Object) doubleArray53);
        double double59 = realMatrixImpl17.getNorm();
        int int60 = realMatrixImpl17.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = realMatrixImpl0.multiply(realMatrixImpl17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal1 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[][] doubleArray75 = realMatrixImpl53.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75, true);
        java.lang.String str78 = realMatrixImpl77.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray79 = realMatrixImpl77.getPermutation();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl28.getData();
        int int48 = bigMatrixImpl28.getRoundingMode();
        int int49 = bigMatrixImpl28.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray50 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray8 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7 };
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal[][] bigDecimalArray13 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray8, bigDecimalArray12 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray13);
        java.lang.String str15 = bigMatrixImpl14.toString();
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal16, bigDecimal17, bigDecimal18 };
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray23, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        bigMatrixImpl14.lu = bigDecimalArray28;
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl14.transpose();
        double[] doubleArray36 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray47 = new double[][] { doubleArray36, doubleArray41, doubleArray46 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl49.getColumn((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl14.operate(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray54 = bigMatrixImpl0.solve(bigDecimalArray52);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 100);
        int int3 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 1);
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getTrace();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        java.lang.String str47 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        java.lang.String str62 = bigMatrixImpl61.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl28.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl61);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        double[] doubleArray23 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray34 = new double[][] { doubleArray23, doubleArray28, doubleArray33 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean54 = realMatrixImpl52.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl52.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray58 = realMatrixImpl18.getPermutation();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl68.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray73 = realMatrixImpl68.getPermutation();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        bigMatrixImpl13.parity = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray20 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        int int20 = bigMatrixImpl17.getColumnDimension();
        double[] doubleArray25 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray30 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray36 = new double[][] { doubleArray25, doubleArray30, doubleArray35 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray42 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray53 = new double[][] { doubleArray42, doubleArray47, doubleArray52 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray57 = realMatrixImpl37.getRow(1);
        java.math.BigDecimal[] bigDecimalArray58 = bigMatrixImpl17.operate(doubleArray57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray60 = realMatrixImpl59.getPermutation();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray46 = bigMatrixImpl45.getPermutation();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27, true);
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        java.lang.String str45 = bigMatrixImpl44.toString();
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63 };
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray68 = new java.math.BigDecimal[] { bigDecimal65, bigDecimal66, bigDecimal67 };
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray72 = new java.math.BigDecimal[] { bigDecimal69, bigDecimal70, bigDecimal71 };
        java.math.BigDecimal[][] bigDecimalArray73 = new java.math.BigDecimal[][] { bigDecimalArray64, bigDecimalArray68, bigDecimalArray72 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray73);
        bigMatrixImpl59.lu = bigDecimalArray73;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = bigMatrixImpl44.multiply(bigMatrixImpl59);
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray80 = new java.math.BigDecimal[] { bigDecimal77, bigDecimal78, bigDecimal79 };
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray84 = new java.math.BigDecimal[] { bigDecimal81, bigDecimal82, bigDecimal83 };
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal86 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal87 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray88 = new java.math.BigDecimal[] { bigDecimal85, bigDecimal86, bigDecimal87 };
        java.math.BigDecimal[][] bigDecimalArray89 = new java.math.BigDecimal[][] { bigDecimalArray80, bigDecimalArray84, bigDecimalArray88 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray89);
        java.lang.String str91 = bigMatrixImpl90.toString();
        java.math.BigDecimal bigDecimal92 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl90.scalarAdd(bigDecimal92);
        boolean boolean94 = bigMatrixImpl90.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl59.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl90);
        java.math.BigDecimal bigDecimal96 = bigMatrixImpl59.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix97 = bigMatrixImpl30.scalarMultiply(bigDecimal96);
        org.apache.commons.math.linear.BigMatrix bigMatrix98 = bigMatrixImpl13.scalarMultiply(bigDecimal96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray99 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.lu;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray16 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.copy();
        int int33 = bigMatrixImpl13.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        boolean boolean17 = bigMatrixImpl13.isSquare();
        bigMatrixImpl13.parity = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray20 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray10 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray16 = new double[][] { doubleArray5, doubleArray10, doubleArray15 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        boolean boolean71 = realMatrixImpl69.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = realMatrixImpl34.subtract(realMatrixImpl69);
        double double75 = realMatrixImpl72.getEntry((int) (byte) 1, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl72.scalarAdd((double) (short) 1);
        boolean boolean78 = realMatrixImpl0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realMatrixImpl0 and realMatrixImpl0", realMatrixImpl0.equals(realMatrixImpl0) ? realMatrixImpl0.hashCode() == realMatrixImpl0.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        bigMatrixImpl13.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray33 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 10);
        bigMatrixImpl2.setRoundingMode((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 100, (int) (short) 100);
        double[][] doubleArray3 = realMatrixImpl2.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        int[] intArray23 = new int[] { '4', 0, 3, (short) 0, (byte) 1, (short) 100 };
        bigMatrixImpl13.permutation = intArray23;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray32, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.lang.String str39 = bigMatrixImpl38.toString();
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl38.scalarAdd(bigDecimal40);
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl13.add(bigMatrix41);
        java.math.BigDecimal bigDecimal43 = bigMatrixImpl13.getNorm();
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal[][] bigDecimalArray56 = new java.math.BigDecimal[][] { bigDecimalArray47, bigDecimalArray51, bigDecimalArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.lang.String str58 = bigMatrixImpl57.toString();
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray66 = new java.math.BigDecimal[] { bigDecimal63, bigDecimal64, bigDecimal65 };
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal[][] bigDecimalArray71 = new java.math.BigDecimal[][] { bigDecimalArray62, bigDecimalArray66, bigDecimalArray70 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray71);
        bigMatrixImpl57.lu = bigDecimalArray71;
        double[] doubleArray75 = bigMatrixImpl57.getColumnAsDoubleArray((int) (short) 1);
        bigMatrixImpl57.setRoundingMode(3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = bigMatrixImpl13.multiply(bigMatrixImpl57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl57.inverse();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray35 = realMatrixImpl16.lu;
        boolean boolean36 = realMatrixImpl16.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray37 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl90.getColumnMatrix((int) (short) 1);
        double[][] doubleArray93 = realMatrixImpl90.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = realMatrixImpl68.subtract(realMatrixImpl90);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl95 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl68.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl95);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = bigMatrixImpl21.getPermutation();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double double74 = realMatrixImpl71.getEntry((int) (byte) 1, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.scalarAdd((double) (short) 1);
        int int77 = realMatrixImpl71.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray78 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        boolean boolean71 = realMatrixImpl69.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl69.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl33.add(realMatrix73);
        int[] intArray75 = realMatrixImpl33.permutation;
        double[][] doubleArray76 = realMatrixImpl33.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray79 = realMatrixImpl78.getPermutation();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 10);
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray6 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5 };
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal7, bigDecimal8, bigDecimal9 };
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray6, bigDecimalArray10, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.lang.String str17 = bigMatrixImpl16.toString();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        bigMatrixImpl31.lu = bigDecimalArray45;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = bigMatrixImpl16.multiply(bigMatrixImpl31);
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal[][] bigDecimalArray61 = new java.math.BigDecimal[][] { bigDecimalArray52, bigDecimalArray56, bigDecimalArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61);
        java.lang.String str63 = bigMatrixImpl62.toString();
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl62.scalarAdd(bigDecimal64);
        boolean boolean66 = bigMatrixImpl62.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl31.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl62);
        java.math.BigDecimal bigDecimal68 = bigMatrixImpl31.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl2.scalarAdd(bigDecimal68);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12, true);
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal16, bigDecimal17, bigDecimal18 };
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray23, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.lang.String str30 = bigMatrixImpl29.toString();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        java.lang.String str45 = bigMatrixImpl44.toString();
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        bigMatrixImpl44.lu = bigDecimalArray58;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = bigMatrixImpl29.multiply(bigMatrixImpl44);
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68 };
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal[][] bigDecimalArray74 = new java.math.BigDecimal[][] { bigDecimalArray65, bigDecimalArray69, bigDecimalArray73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74);
        java.lang.String str76 = bigMatrixImpl75.toString();
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl75.scalarAdd(bigDecimal77);
        boolean boolean79 = bigMatrixImpl75.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl44.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl75);
        java.math.BigDecimal bigDecimal81 = bigMatrixImpl44.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl15.scalarMultiply(bigDecimal81);
        int int83 = bigMatrixImpl15.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix85 = bigMatrixImpl15.getRowMatrix(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray86 = bigMatrixImpl15.getPermutation();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray35 = realMatrixImpl16.lu;
        int int36 = realMatrixImpl16.getRowDimension();
        int int37 = realMatrixImpl16.getRowDimension();
        double[][] doubleArray38 = realMatrixImpl16.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray39 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray1 = bigMatrixImpl0.getData();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.copy();
        int int33 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.copy();
        int int35 = bigMatrixImpl13.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray46 = new double[][] { doubleArray35, doubleArray40, doubleArray45 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray46);
        java.math.BigDecimal[] bigDecimalArray50 = bigMatrixImpl48.getColumn((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl13.operate(bigDecimalArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray52 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.lang.String str47 = bigMatrixImpl46.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl46.scalarAdd(bigDecimal48);
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl46.getTrace();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl13.scalarAdd(bigDecimal50);
        java.lang.String str52 = bigMatrixImpl13.toString();
        java.lang.String str53 = bigMatrixImpl13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.lu;
        double[] doubleArray20 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray25 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray30 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray31 = new double[][] { doubleArray20, doubleArray25, doubleArray30 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[] bigDecimalArray35 = bigMatrixImpl33.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal[][] bigDecimalArray49 = new java.math.BigDecimal[][] { bigDecimalArray40, bigDecimalArray44, bigDecimalArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        bigMatrixImpl36.data = bigDecimalArray49;
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl13.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl36);
        boolean boolean56 = bigMatrixImpl13.isSquare();
        int int57 = bigMatrixImpl13.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray58 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.copy();
        int int33 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.copy();
        boolean boolean35 = bigMatrixImpl13.isSingular();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal[][] bigDecimalArray48 = new java.math.BigDecimal[][] { bigDecimalArray39, bigDecimalArray43, bigDecimalArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        java.lang.String str50 = bigMatrixImpl49.toString();
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal[][] bigDecimalArray63 = new java.math.BigDecimal[][] { bigDecimalArray54, bigDecimalArray58, bigDecimalArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        bigMatrixImpl49.lu = bigDecimalArray63;
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl49.transpose();
        double[] doubleArray71 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray82 = new double[][] { doubleArray71, doubleArray76, doubleArray81 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray82);
        java.math.BigDecimal[] bigDecimalArray86 = bigMatrixImpl84.getColumn((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray87 = bigMatrixImpl49.operate(bigDecimalArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray90 = bigMatrixImpl13.solve(bigDecimalArray87);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray61 = new double[][] { doubleArray50, doubleArray55, doubleArray60 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        java.math.BigDecimal[] bigDecimalArray65 = bigMatrixImpl63.getColumn((int) (byte) 0);
        int int66 = bigMatrixImpl63.getRoundingMode();
        int int67 = bigMatrixImpl63.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl13.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl63);
        java.lang.String str69 = bigMatrixImpl63.toString();
        boolean boolean70 = bigMatrixImpl63.isSingular();
        int[] intArray71 = bigMatrixImpl63.permutation;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray72 = bigMatrixImpl63.getPermutation();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        int int19 = realMatrixImpl18.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl18.scalarAdd((double) (byte) -1);
        double[][] doubleArray22 = realMatrixImpl18.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray23 = realMatrixImpl18.getPermutation();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        java.math.BigDecimal[] bigDecimalArray37 = bigMatrixImpl35.getColumn((int) (byte) 0);
        int int38 = bigMatrixImpl35.getRoundingMode();
        int int39 = bigMatrixImpl35.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl35);
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray56 = new double[][] { doubleArray45, doubleArray50, doubleArray55 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray56);
        java.math.BigDecimal[] bigDecimalArray60 = bigMatrixImpl58.getColumn((int) (byte) 0);
        int int61 = bigMatrixImpl58.getColumnDimension();
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray71 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray77 = new double[][] { doubleArray66, doubleArray71, doubleArray76 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray77);
        java.math.BigDecimal[] bigDecimalArray81 = bigMatrixImpl79.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray81);
        java.math.BigDecimal[] bigDecimalArray83 = bigMatrixImpl58.preMultiply(bigDecimalArray81);
        boolean boolean84 = bigMatrixImpl58.isSingular();
        java.math.BigDecimal[][] bigDecimalArray85 = bigMatrixImpl58.data;
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray87 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = realMatrixImpl0.getRowDimension();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 1);
        int int3 = bigMatrixImpl2.getRowDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl2.luDecompose();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray10 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray16 = new double[][] { doubleArray5, doubleArray10, doubleArray15 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        int int36 = realMatrixImpl17.getColumnDimension();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[][] doubleArray72 = realMatrixImpl53.lu;
        int int73 = realMatrixImpl53.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = realMatrixImpl17.add(realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl74.scalarAdd((double) 1);
        int int77 = realMatrixImpl74.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = realMatrixImpl0.add(realMatrixImpl74);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl33.scalarAdd((double) (-1));
        double[] doubleArray42 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray53 = new double[][] { doubleArray42, doubleArray47, doubleArray52 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray59 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray64 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray69 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray70 = new double[][] { doubleArray59, doubleArray64, doubleArray69 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        int int73 = realMatrixImpl54.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl54.copy();
        double[] doubleArray79 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray84 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray89 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray90 = new double[][] { doubleArray79, doubleArray84, doubleArray89 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        boolean boolean95 = realMatrixImpl54.equals((java.lang.Object) doubleArray90);
        realMatrixImpl54.parity = (byte) 0;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl98 = realMatrixImpl33.add(realMatrixImpl54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray99 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getData();
        int int47 = bigMatrixImpl45.parity;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        java.lang.String str62 = bigMatrixImpl61.toString();
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray66 = new java.math.BigDecimal[] { bigDecimal63, bigDecimal64, bigDecimal65 };
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray74 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73 };
        java.math.BigDecimal[][] bigDecimalArray75 = new java.math.BigDecimal[][] { bigDecimalArray66, bigDecimalArray70, bigDecimalArray74 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray75);
        bigMatrixImpl61.lu = bigDecimalArray75;
        double[] doubleArray79 = bigMatrixImpl61.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal bigDecimal80 = bigMatrixImpl61.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl45.scalarAdd(bigDecimal80);
        java.math.BigDecimal bigDecimal82 = bigMatrixImpl45.getTrace();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray83 = bigMatrixImpl45.getPermutation();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        boolean boolean17 = bigMatrixImpl13.isSquare();
        bigMatrixImpl13.parity = (-1);
        int int20 = bigMatrixImpl13.getColumnDimension();
        java.lang.String str21 = bigMatrixImpl13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray18 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        java.lang.String str45 = bigMatrixImpl44.toString();
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63 };
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray68 = new java.math.BigDecimal[] { bigDecimal65, bigDecimal66, bigDecimal67 };
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray72 = new java.math.BigDecimal[] { bigDecimal69, bigDecimal70, bigDecimal71 };
        java.math.BigDecimal[][] bigDecimalArray73 = new java.math.BigDecimal[][] { bigDecimalArray64, bigDecimalArray68, bigDecimalArray72 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray73);
        bigMatrixImpl59.lu = bigDecimalArray73;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = bigMatrixImpl44.multiply(bigMatrixImpl59);
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray80 = new java.math.BigDecimal[] { bigDecimal77, bigDecimal78, bigDecimal79 };
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray84 = new java.math.BigDecimal[] { bigDecimal81, bigDecimal82, bigDecimal83 };
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal86 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal87 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray88 = new java.math.BigDecimal[] { bigDecimal85, bigDecimal86, bigDecimal87 };
        java.math.BigDecimal[][] bigDecimalArray89 = new java.math.BigDecimal[][] { bigDecimalArray80, bigDecimalArray84, bigDecimalArray88 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray89);
        java.lang.String str91 = bigMatrixImpl90.toString();
        java.math.BigDecimal bigDecimal92 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl90.scalarAdd(bigDecimal92);
        boolean boolean94 = bigMatrixImpl90.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl59.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix96 = bigMatrixImpl13.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray78 = new java.math.BigDecimal[] { bigDecimal75, bigDecimal76, bigDecimal77 };
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray82 = new java.math.BigDecimal[] { bigDecimal79, bigDecimal80, bigDecimal81 };
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray86 = new java.math.BigDecimal[] { bigDecimal83, bigDecimal84, bigDecimal85 };
        java.math.BigDecimal[][] bigDecimalArray87 = new java.math.BigDecimal[][] { bigDecimalArray78, bigDecimalArray82, bigDecimalArray86 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87, true);
        boolean boolean91 = realMatrixImpl16.equals((java.lang.Object) bigDecimalArray87);
        int int92 = realMatrixImpl16.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray93 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        boolean boolean18 = bigMatrixImpl16.equals((java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray19 = bigMatrixImpl16.getPermutation();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray61 = new double[][] { doubleArray50, doubleArray55, doubleArray60 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        java.math.BigDecimal[] bigDecimalArray65 = bigMatrixImpl63.getColumn((int) (byte) 0);
        int int66 = bigMatrixImpl63.getRoundingMode();
        int int67 = bigMatrixImpl63.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl13.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl63);
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray74 = bigMatrixImpl73.getPermutation();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl13.getNorm();
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl13.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        int int33 = bigMatrixImpl13.getRoundingMode();
        int int34 = bigMatrixImpl13.getRoundingMode();
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal[][] bigDecimalArray47 = new java.math.BigDecimal[][] { bigDecimalArray38, bigDecimalArray42, bigDecimalArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47);
        java.lang.String str49 = bigMatrixImpl48.toString();
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal58, bigDecimal59, bigDecimal60 };
        java.math.BigDecimal[][] bigDecimalArray62 = new java.math.BigDecimal[][] { bigDecimalArray53, bigDecimalArray57, bigDecimalArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray62);
        bigMatrixImpl48.lu = bigDecimalArray62;
        double[] doubleArray66 = bigMatrixImpl48.getColumnAsDoubleArray((int) (short) 1);
        int int67 = bigMatrixImpl48.getColumnDimension();
        bigMatrixImpl48.parity = (byte) 100;
        java.lang.String str70 = bigMatrixImpl48.toString();
        int int71 = bigMatrixImpl48.getColumnDimension();
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray87);
        java.math.BigDecimal[] bigDecimalArray91 = bigMatrixImpl89.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl92 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray91);
        java.math.BigDecimal[] bigDecimalArray93 = bigMatrixImpl48.preMultiply(bigDecimalArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray94 = bigMatrixImpl13.solve(bigDecimalArray93);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        boolean boolean71 = realMatrixImpl69.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl69.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl33.add(realMatrix73);
        double[][] doubleArray75 = realMatrixImpl33.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray78 = realMatrixImpl77.getPermutation();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.lang.String str47 = bigMatrixImpl46.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        bigMatrixImpl46.lu = bigDecimalArray60;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = bigMatrixImpl31.multiply(bigMatrixImpl46);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl13.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl31);
        java.math.BigDecimal bigDecimal65 = bigMatrixImpl13.getNorm();
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray75 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray80 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray81 = new double[][] { doubleArray70, doubleArray75, doubleArray80 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray81);
        java.math.BigDecimal[] bigDecimalArray85 = bigMatrixImpl83.getColumn((int) (byte) 0);
        int int86 = bigMatrixImpl83.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = bigMatrixImpl13.multiply(bigMatrixImpl83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray88 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        int int47 = bigMatrixImpl28.parity;
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl28.getTrace();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl28.inverse();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        bigMatrixImpl13.parity = (short) 1;
        int int20 = bigMatrixImpl13.getRowDimension();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getTrace();
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray40 = bigMatrixImpl37.getPermutation();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 1);
        int int3 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        double[][] doubleArray92 = realMatrixImpl71.data;
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl71.scalarAdd((double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl71.scalarAdd((double) 64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[][] doubleArray71 = realMatrixImpl52.lu;
        int int72 = realMatrixImpl52.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = realMatrixImpl16.add(realMatrixImpl52);
        int int74 = realMatrixImpl73.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray75 = realMatrixImpl73.getPermutation();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray36 = realMatrixImpl16.getRow(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[][] doubleArray39 = realMatrixImpl38.data;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray41 = bigMatrixImpl40.getPermutation();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '#', 64);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.lu;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl90.getColumnMatrix((int) (short) 1);
        double[][] doubleArray93 = realMatrixImpl90.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = realMatrixImpl68.subtract(realMatrixImpl90);
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl94.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl94.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = realMatrixImpl94.getPermutation();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        boolean boolean71 = realMatrixImpl69.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl69.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl33.add(realMatrix73);
        double[][] doubleArray75 = realMatrixImpl33.data;
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl33.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray77 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double double74 = realMatrixImpl71.getEntry((int) (byte) 1, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.scalarAdd((double) (short) 1);
        int int77 = realMatrixImpl71.parity;
        double[][] doubleArray78 = realMatrixImpl71.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray78);
        double[] doubleArray81 = bigMatrixImpl79.getColumnAsDoubleArray(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, 1);
        boolean boolean85 = bigMatrixImpl79.equals((java.lang.Object) bigMatrixImpl84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl84 and bigMatrixImpl84", bigMatrixImpl84.equals(bigMatrixImpl84) ? bigMatrixImpl84.hashCode() == bigMatrixImpl84.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (-1L));
        double[][] doubleArray21 = realMatrixImpl18.getData();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray36 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray37 = new double[][] { doubleArray26, doubleArray31, doubleArray36 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray53 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray54 = new double[][] { doubleArray43, doubleArray48, doubleArray53 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl38.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        int int57 = realMatrixImpl38.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl38.copy();
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray73 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray74 = new double[][] { doubleArray63, doubleArray68, doubleArray73 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        boolean boolean79 = realMatrixImpl38.equals((java.lang.Object) doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl38.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray82 = realMatrixImpl38.getPermutation();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 64);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl2.getRowMatrix(1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.lang.String str47 = bigMatrixImpl46.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        bigMatrixImpl46.lu = bigDecimalArray60;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = bigMatrixImpl31.multiply(bigMatrixImpl46);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl13.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl31);
        int int65 = bigMatrixImpl13.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray66 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        boolean boolean20 = bigMatrixImpl17.isSquare();
        bigMatrixImpl17.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray23 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getData();
        int int47 = bigMatrixImpl45.parity;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        java.lang.String str62 = bigMatrixImpl61.toString();
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray66 = new java.math.BigDecimal[] { bigDecimal63, bigDecimal64, bigDecimal65 };
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray74 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73 };
        java.math.BigDecimal[][] bigDecimalArray75 = new java.math.BigDecimal[][] { bigDecimalArray66, bigDecimalArray70, bigDecimalArray74 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray75);
        bigMatrixImpl61.lu = bigDecimalArray75;
        double[] doubleArray79 = bigMatrixImpl61.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal bigDecimal80 = bigMatrixImpl61.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl45.scalarAdd(bigDecimal80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray82 = bigMatrixImpl45.getPermutation();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl16.copy();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        boolean boolean57 = realMatrixImpl16.equals((java.lang.Object) doubleArray52);
        double double58 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl16.scalarAdd((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray61 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getDeterminant();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[][] doubleArray71 = realMatrixImpl52.lu;
        int int72 = realMatrixImpl52.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = realMatrixImpl16.add(realMatrixImpl52);
        double[][] doubleArray74 = realMatrixImpl16.getDataRef();
        int int75 = realMatrixImpl16.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray76 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl28.getData();
        int int48 = bigMatrixImpl28.getRoundingMode();
        int int49 = bigMatrixImpl28.getColumnDimension();
        int int50 = bigMatrixImpl28.getScale();
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl28.getDataRef();
        bigMatrixImpl28.parity = (byte) 100;
        int int54 = bigMatrixImpl28.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl28.lu;
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray71 = new double[][] { doubleArray60, doubleArray65, doubleArray70 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        java.math.BigDecimal[] bigDecimalArray75 = bigMatrixImpl73.getColumn((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray76 = bigMatrixImpl28.solve(bigDecimalArray75);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, (int) '4');
        boolean boolean3 = bigMatrixImpl2.isSquare();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 3);
        bigMatrixImpl2.parity = 100;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        int int32 = bigMatrixImpl13.getColumnDimension();
        bigMatrixImpl13.parity = (byte) 100;
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl13.lu;
        bigMatrixImpl13.parity = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 100, (int) (short) 100);
        double[][] doubleArray3 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl4 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray3);
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray8 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7 };
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray16 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15 };
        java.math.BigDecimal[][] bigDecimalArray17 = new java.math.BigDecimal[][] { bigDecimalArray8, bigDecimalArray12, bigDecimalArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        java.lang.String str19 = bigMatrixImpl18.toString();
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal[][] bigDecimalArray32 = new java.math.BigDecimal[][] { bigDecimalArray23, bigDecimalArray27, bigDecimalArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.lang.String str34 = bigMatrixImpl33.toString();
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal[][] bigDecimalArray47 = new java.math.BigDecimal[][] { bigDecimalArray38, bigDecimalArray42, bigDecimalArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47);
        bigMatrixImpl33.lu = bigDecimalArray47;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = bigMatrixImpl18.multiply(bigMatrixImpl33);
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray66 = new double[][] { doubleArray55, doubleArray60, doubleArray65 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        java.math.BigDecimal[] bigDecimalArray70 = bigMatrixImpl68.getColumn((int) (byte) 0);
        int int71 = bigMatrixImpl68.getRoundingMode();
        int int72 = bigMatrixImpl68.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl18.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl68);
        java.math.BigDecimal[][] bigDecimalArray74 = bigMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74, true);
        double[][] doubleArray78 = bigMatrixImpl77.getDataAsDoubleArray();
        realMatrixImpl4.data = doubleArray78;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray80 = realMatrixImpl4.getPermutation();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        bigMatrixImpl13.setRoundingMode(3);
        bigMatrixImpl13.setScale((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray36 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = bigMatrixImpl2.isSingular();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = bigMatrixImpl21.multiply(bigMatrixImpl24);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(100, 10);
        bigMatrixImpl2.setRoundingMode((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        int[] intArray23 = new int[] { '4', 0, 3, (short) 0, (byte) 1, (short) 100 };
        bigMatrixImpl13.permutation = intArray23;
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray33, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.lang.String str40 = bigMatrixImpl39.toString();
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal[][] bigDecimalArray53 = new java.math.BigDecimal[][] { bigDecimalArray44, bigDecimalArray48, bigDecimalArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        bigMatrixImpl39.lu = bigDecimalArray53;
        double[] doubleArray57 = bigMatrixImpl39.getColumnAsDoubleArray((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl13.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl39);
        bigMatrixImpl39.parity = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = bigMatrixImpl39.inverse();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl20.data = bigDecimalArray33;
        int int39 = bigMatrixImpl20.getRowDimension();
        double[][] doubleArray40 = bigMatrixImpl20.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray43 = realMatrixImpl42.getPermutation();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 10);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl53.scalarAdd(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray77 = realMatrixImpl53.getPermutation();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getColumnAsDoubleArray((int) (byte) 10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        int int47 = bigMatrixImpl28.parity;
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl28.getTrace();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray49 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl13.data;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal42, bigDecimal43, bigDecimal44 };
        java.math.BigDecimal[][] bigDecimalArray46 = new java.math.BigDecimal[][] { bigDecimalArray37, bigDecimalArray41, bigDecimalArray45 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray46);
        java.lang.String str48 = bigMatrixImpl47.toString();
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl47.scalarAdd(bigDecimal49);
        boolean boolean51 = bigMatrixImpl47.isSquare();
        int[] intArray52 = bigMatrixImpl47.permutation;
        int int53 = bigMatrixImpl47.getRowDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = bigMatrixImpl13.multiply(bigMatrixImpl47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        java.math.BigDecimal[] bigDecimalArray37 = bigMatrixImpl35.getColumn((int) (byte) 0);
        int int38 = bigMatrixImpl35.getRoundingMode();
        int int39 = bigMatrixImpl35.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl35);
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal[][] bigDecimalArray53 = new java.math.BigDecimal[][] { bigDecimalArray44, bigDecimalArray48, bigDecimalArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        java.lang.String str55 = bigMatrixImpl54.toString();
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray67 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal65, bigDecimal66 };
        java.math.BigDecimal[][] bigDecimalArray68 = new java.math.BigDecimal[][] { bigDecimalArray59, bigDecimalArray63, bigDecimalArray67 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray68);
        bigMatrixImpl54.lu = bigDecimalArray68;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray68, true);
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl72.getData();
        bigMatrixImpl35.lu = bigDecimalArray73;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray73);
        double[] doubleArray80 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray85 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray90 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray91 = new double[][] { doubleArray80, doubleArray85, doubleArray90 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray91);
        java.math.BigDecimal[] bigDecimalArray95 = bigMatrixImpl93.getColumn((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray96 = bigMatrixImpl75.operate(bigDecimalArray95);
        bigMatrixImpl75.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray99 = bigMatrixImpl75.getPermutation();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl13.getColumnMatrix(1);
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.lang.String str35 = bigMatrixImpl34.toString();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal[][] bigDecimalArray48 = new java.math.BigDecimal[][] { bigDecimalArray39, bigDecimalArray43, bigDecimalArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        bigMatrixImpl34.lu = bigDecimalArray48;
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl34.transpose();
        bigMatrixImpl34.setRoundingMode(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl34);
        bigMatrixImpl34.setScale((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray57 = bigMatrixImpl34.getPermutation();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(6, (int) (byte) 10);
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray6 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5 };
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal7, bigDecimal8, bigDecimal9 };
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray6, bigDecimalArray10, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, true);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getDeterminant();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl18.transpose();
        boolean boolean21 = bigMatrixImpl18.isSingular();
        boolean boolean22 = bigMatrixImpl2.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[][] doubleArray71 = realMatrixImpl52.lu;
        int int72 = realMatrixImpl52.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = realMatrixImpl16.add(realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl73.scalarAdd((double) 1);
        int int76 = realMatrixImpl73.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl73.scalarAdd(3.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray79 = realMatrixImpl73.getPermutation();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(100, 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl2.getColumnMatrix((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getColumnAsDoubleArray((int) (short) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 64);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.lang.String str44 = bigMatrixImpl43.toString();
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray48, bigDecimalArray52, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        bigMatrixImpl43.lu = bigDecimalArray57;
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl43.transpose();
        int int61 = bigMatrixImpl43.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl43);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl13.getColumnMatrix((int) (byte) 0);
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray68 = new java.math.BigDecimal[] { bigDecimal65, bigDecimal66, bigDecimal67 };
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray72 = new java.math.BigDecimal[] { bigDecimal69, bigDecimal70, bigDecimal71 };
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal73, bigDecimal74, bigDecimal75 };
        java.math.BigDecimal[][] bigDecimalArray77 = new java.math.BigDecimal[][] { bigDecimalArray68, bigDecimalArray72, bigDecimalArray76 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray77);
        java.lang.String str79 = bigMatrixImpl78.toString();
        java.math.BigDecimal[][] bigDecimalArray80 = bigMatrixImpl78.lu;
        double[][] doubleArray81 = bigMatrixImpl78.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl13.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl78);
        boolean boolean83 = bigMatrixImpl13.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix84 = bigMatrixImpl13.copy();
        java.lang.String str85 = bigMatrixImpl13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        boolean boolean17 = bigMatrixImpl13.isSquare();
        bigMatrixImpl13.parity = (-1);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl13.getData();
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl13.lu;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal[][] bigDecimalArray34 = new java.math.BigDecimal[][] { bigDecimalArray25, bigDecimalArray29, bigDecimalArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34);
        java.lang.String str36 = bigMatrixImpl35.toString();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl35.lu;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal42, bigDecimal43, bigDecimal44 };
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal[][] bigDecimalArray50 = new java.math.BigDecimal[][] { bigDecimalArray41, bigDecimalArray45, bigDecimalArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        java.lang.String str52 = bigMatrixImpl51.toString();
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63 };
        java.math.BigDecimal[][] bigDecimalArray65 = new java.math.BigDecimal[][] { bigDecimalArray56, bigDecimalArray60, bigDecimalArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray65);
        bigMatrixImpl51.lu = bigDecimalArray65;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl51.transpose();
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix70 = bigMatrixImpl51.scalarAdd(bigDecimal69);
        boolean boolean71 = bigMatrixImpl35.equals((java.lang.Object) bigMatrixImpl51);
        java.math.BigDecimal[][] bigDecimalArray72 = bigMatrixImpl35.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl35.getData();
        bigMatrixImpl13.lu = bigDecimalArray73;
        double[][] doubleArray75 = bigMatrixImpl13.getDataAsDoubleArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl13.transpose();
        int int20 = bigMatrixImpl13.getColumnDimension();
        double[][] doubleArray21 = bigMatrixImpl13.getDataAsDoubleArray();
        bigMatrixImpl13.parity = 0;
        boolean boolean24 = bigMatrixImpl13.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray25 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        int int20 = bigMatrixImpl17.getRoundingMode();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.lang.String str35 = bigMatrixImpl34.toString();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal[][] bigDecimalArray48 = new java.math.BigDecimal[][] { bigDecimalArray39, bigDecimalArray43, bigDecimalArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        java.lang.String str50 = bigMatrixImpl49.toString();
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal[][] bigDecimalArray63 = new java.math.BigDecimal[][] { bigDecimalArray54, bigDecimalArray58, bigDecimalArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        bigMatrixImpl49.lu = bigDecimalArray63;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = bigMatrixImpl34.multiply(bigMatrixImpl49);
        java.math.BigDecimal[][] bigDecimalArray67 = bigMatrixImpl66.getData();
        bigMatrixImpl17.data = bigDecimalArray67;
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl17.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray70 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        java.lang.String str45 = bigMatrixImpl44.toString();
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl44.scalarAdd(bigDecimal46);
        boolean boolean48 = bigMatrixImpl44.isSquare();
        bigMatrixImpl44.parity = (-1);
        int int51 = bigMatrixImpl44.getScale();
        java.lang.String str52 = bigMatrixImpl44.toString();
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63 };
        java.math.BigDecimal[][] bigDecimalArray65 = new java.math.BigDecimal[][] { bigDecimalArray56, bigDecimalArray60, bigDecimalArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray65);
        java.lang.String str67 = bigMatrixImpl66.toString();
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal68, bigDecimal69, bigDecimal70 };
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray79 = new java.math.BigDecimal[] { bigDecimal76, bigDecimal77, bigDecimal78 };
        java.math.BigDecimal[][] bigDecimalArray80 = new java.math.BigDecimal[][] { bigDecimalArray71, bigDecimalArray75, bigDecimalArray79 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray80);
        bigMatrixImpl66.lu = bigDecimalArray80;
        double[] doubleArray84 = bigMatrixImpl66.getColumnAsDoubleArray((int) (short) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        java.math.BigDecimal[] bigDecimalArray86 = bigMatrixImpl44.operate(doubleArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray87 = bigMatrixImpl13.solve(bigDecimalArray86);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        double[] doubleArray4 = new double[] { 3, (short) 1, 10.0f, '#' };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl6.transpose();
        int int8 = realMatrixImpl6.getColumnDimension();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray23 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray24 = new double[][] { doubleArray13, doubleArray18, doubleArray23 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray30 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray41 = new double[][] { doubleArray30, doubleArray35, doubleArray40 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray53 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray59 = new double[][] { doubleArray48, doubleArray53, doubleArray58 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray75 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray76 = new double[][] { doubleArray65, doubleArray70, doubleArray75 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl60.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl77);
        boolean boolean79 = realMatrixImpl77.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = realMatrixImpl42.subtract(realMatrixImpl77);
        double[] doubleArray85 = new double[] { 4, 64, 10.0d, 0 };
        double[] doubleArray86 = realMatrixImpl80.operate(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray88 = realMatrixImpl6.operate(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        int[] intArray91 = realMatrixImpl90.permutation;
        double[][] doubleArray92 = realMatrixImpl90.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray93 = realMatrixImpl90.getPermutation();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '#', 64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        double[] doubleArray4 = new double[] { 3, (short) 1, 10.0f, '#' };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl6.transpose();
        int int8 = realMatrixImpl6.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray9 = realMatrixImpl6.getPermutation();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.getRowMatrix(1);
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal[][] bigDecimalArray47 = new java.math.BigDecimal[][] { bigDecimalArray38, bigDecimalArray42, bigDecimalArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47);
        java.lang.String str49 = bigMatrixImpl48.toString();
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl48.scalarAdd(bigDecimal50);
        int[] intArray58 = new int[] { '4', 0, 3, (short) 0, (byte) 1, (short) 100 };
        bigMatrixImpl48.permutation = intArray58;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray67 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal65, bigDecimal66 };
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal68, bigDecimal69, bigDecimal70 };
        java.math.BigDecimal[][] bigDecimalArray72 = new java.math.BigDecimal[][] { bigDecimalArray63, bigDecimalArray67, bigDecimalArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray72);
        java.lang.String str74 = bigMatrixImpl73.toString();
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl73.scalarAdd(bigDecimal75);
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrixImpl48.add(bigMatrix76);
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl13.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl48);
        bigMatrixImpl13.setRoundingMode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray81 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        bigMatrixImpl2.setScale((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        int int47 = bigMatrixImpl28.parity;
        int int48 = bigMatrixImpl28.getColumnDimension();
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal[][] bigDecimalArray61 = new java.math.BigDecimal[][] { bigDecimalArray52, bigDecimalArray56, bigDecimalArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61);
        java.lang.String str63 = bigMatrixImpl62.toString();
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl62.scalarAdd(bigDecimal64);
        int int66 = bigMatrixImpl62.getScale();
        java.math.BigDecimal bigDecimal67 = bigMatrixImpl62.getTrace();
        java.math.BigDecimal[] bigDecimalArray69 = bigMatrixImpl62.getRow(1);
        java.math.BigDecimal[] bigDecimalArray70 = bigMatrixImpl28.preMultiply(bigDecimalArray69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray71 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl13.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray21 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl31.scalarAdd(bigDecimal33);
        int int35 = bigMatrixImpl31.getScale();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl31.getTrace();
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl13.scalarAdd(bigDecimal36);
        bigMatrixImpl13.setScale((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray40 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl13.transpose();
        int int20 = bigMatrixImpl13.getColumnDimension();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.lang.String str35 = bigMatrixImpl34.toString();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl34.scalarAdd(bigDecimal36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl34.getTrace();
        int int39 = bigMatrixImpl34.getColumnDimension();
        bigMatrixImpl34.setScale((int) '#');
        double[] doubleArray43 = bigMatrixImpl34.getColumnAsDoubleArray(1);
        java.math.BigDecimal[] bigDecimalArray44 = bigMatrixImpl13.operate(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray44);
        int int46 = bigMatrixImpl45.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl45.getPermutation();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 10, (int) (short) 1);
        double[][] doubleArray3 = realMatrixImpl2.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getRoundingMode();
        int int19 = bigMatrixImpl13.getScale();
        java.lang.String str20 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl13.data = bigDecimalArray33;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray41 = bigMatrixImpl40.getPermutation();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[][] doubleArray75 = realMatrixImpl53.data;
        double[][] doubleArray76 = realMatrixImpl53.lu;
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl53.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray78 = realMatrixImpl53.getPermutation();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl13.getNorm();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl13.getData();
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl13.getData();
        double[][] doubleArray49 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray51 = realMatrixImpl50.getPermutation();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        double[] doubleArray4 = new double[] { 3, (short) 1, 10.0f, '#' };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        realMatrixImpl6.parity = (byte) 10;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray16 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15 };
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray20 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal18, bigDecimal19 };
        java.math.BigDecimal[][] bigDecimalArray21 = new java.math.BigDecimal[][] { bigDecimalArray12, bigDecimalArray16, bigDecimalArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.lang.String str23 = bigMatrixImpl22.toString();
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl22.scalarAdd(bigDecimal24);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl22.getTrace();
        int int27 = bigMatrixImpl22.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl22.getColumnMatrix(1);
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.lang.String str44 = bigMatrixImpl43.toString();
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray48, bigDecimalArray52, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        bigMatrixImpl43.lu = bigDecimalArray57;
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl43.transpose();
        bigMatrixImpl43.setRoundingMode(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl22.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl43);
        bigMatrixImpl43.setScale((int) '4');
        boolean boolean66 = realMatrixImpl6.equals((java.lang.Object) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray67 = realMatrixImpl6.getPermutation();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 10);
        int int3 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, 100);
        bigMatrixImpl2.parity = (short) 10;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl13.transpose();
        int int20 = bigMatrixImpl13.getColumnDimension();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.lang.String str35 = bigMatrixImpl34.toString();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl34.scalarAdd(bigDecimal36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl34.getTrace();
        int int39 = bigMatrixImpl34.getColumnDimension();
        bigMatrixImpl34.setScale((int) '#');
        double[] doubleArray43 = bigMatrixImpl34.getColumnAsDoubleArray(1);
        java.math.BigDecimal[] bigDecimalArray44 = bigMatrixImpl13.operate(doubleArray43);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl13.getData();
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = bigMatrixImpl13.subtract(bigMatrixImpl62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray64 = bigMatrixImpl62.getPermutation();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray61 = new double[][] { doubleArray50, doubleArray55, doubleArray60 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        java.math.BigDecimal[] bigDecimalArray65 = bigMatrixImpl63.getColumn((int) (byte) 0);
        int int66 = bigMatrixImpl63.getRoundingMode();
        int int67 = bigMatrixImpl63.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl13.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl63);
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69, false);
        java.lang.String str74 = bigMatrixImpl73.toString();
        int int75 = bigMatrixImpl73.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray76 = bigMatrixImpl73.getPermutation();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        boolean boolean17 = bigMatrixImpl13.isSquare();
        bigMatrixImpl13.parity = (-1);
        int int20 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl13.copy();
        boolean boolean22 = bigMatrixImpl13.isSquare();
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray30 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29 };
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray30, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        java.lang.String str37 = bigMatrixImpl36.toString();
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl36.scalarAdd(bigDecimal38);
        int[] intArray46 = new int[] { '4', 0, 3, (short) 0, (byte) 1, (short) 100 };
        bigMatrixImpl36.permutation = intArray46;
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl36.getTrace();
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl13.scalarMultiply(bigDecimal48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray50 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl20.data = bigDecimalArray33;
        int int39 = bigMatrixImpl20.getRowDimension();
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal[][] bigDecimalArray52 = new java.math.BigDecimal[][] { bigDecimalArray43, bigDecimalArray47, bigDecimalArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.lang.String str54 = bigMatrixImpl53.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = bigMatrixImpl20.multiply(bigMatrixImpl53);
        java.math.BigDecimal bigDecimal56 = bigMatrixImpl20.getNorm();
        double[][] doubleArray57 = bigMatrixImpl20.getDataAsDoubleArray();
        int[] intArray58 = bigMatrixImpl20.permutation;
        bigMatrixImpl20.setRoundingMode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray61 = bigMatrixImpl20.getPermutation();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        int int47 = bigMatrixImpl28.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray48 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[] doubleArray22 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray33 = new double[][] { doubleArray22, doubleArray27, doubleArray32 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        java.math.BigDecimal[] bigDecimalArray37 = bigMatrixImpl35.getColumn((int) (byte) 0);
        int int38 = bigMatrixImpl35.getRoundingMode();
        int int39 = bigMatrixImpl35.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl35);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl17.transpose();
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray57 = new double[][] { doubleArray46, doubleArray51, doubleArray56 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        java.math.BigDecimal[] bigDecimalArray61 = bigMatrixImpl59.getColumn((int) (byte) 0);
        int int62 = bigMatrixImpl59.getColumnDimension();
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray77 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray78 = new double[][] { doubleArray67, doubleArray72, doubleArray77 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray78);
        java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl80.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray82);
        java.math.BigDecimal[] bigDecimalArray84 = bigMatrixImpl59.preMultiply(bigDecimalArray82);
        boolean boolean85 = bigMatrixImpl59.isSingular();
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl59.data;
        bigMatrixImpl17.lu = bigDecimalArray86;
        java.math.BigDecimal[][] bigDecimalArray88 = bigMatrixImpl17.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray89 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        java.math.BigDecimal bigDecimal65 = bigMatrixImpl28.getNorm();
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68 };
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal[][] bigDecimalArray78 = new java.math.BigDecimal[][] { bigDecimalArray69, bigDecimalArray73, bigDecimalArray77 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        java.lang.String str80 = bigMatrixImpl79.toString();
        java.math.BigDecimal[][] bigDecimalArray81 = bigMatrixImpl79.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl28.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl79);
        bigMatrixImpl28.parity = (short) 1;
        java.math.BigDecimal[][] bigDecimalArray85 = bigMatrixImpl28.lu;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl86 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray87 = bigMatrixImpl86.getPermutation();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18, true);
        int int21 = bigMatrixImpl20.getScale();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray36 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray37 = new double[][] { doubleArray26, doubleArray31, doubleArray36 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[] bigDecimalArray41 = bigMatrixImpl39.getColumn((int) (byte) 0);
        int int42 = bigMatrixImpl39.getColumnDimension();
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray58 = new double[][] { doubleArray47, doubleArray52, doubleArray57 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray58);
        java.math.BigDecimal[] bigDecimalArray62 = bigMatrixImpl60.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray62);
        java.math.BigDecimal[] bigDecimalArray64 = bigMatrixImpl39.preMultiply(bigDecimalArray62);
        java.math.BigDecimal[][] bigDecimalArray65 = bigMatrixImpl39.data;
        boolean boolean66 = bigMatrixImpl20.equals((java.lang.Object) bigMatrixImpl39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray67 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        int int32 = bigMatrixImpl13.getColumnDimension();
        bigMatrixImpl13.parity = (byte) 100;
        java.lang.String str35 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal[][] bigDecimalArray48 = new java.math.BigDecimal[][] { bigDecimalArray39, bigDecimalArray43, bigDecimalArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        java.lang.String str50 = bigMatrixImpl49.toString();
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl49.scalarAdd(bigDecimal51);
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl49.getTrace();
        int int54 = bigMatrixImpl49.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl49.getColumnMatrix(1);
        bigMatrixImpl49.parity = 10;
        double[] doubleArray60 = bigMatrixImpl49.getRowAsDoubleArray(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray61 = bigMatrixImpl13.solve(doubleArray60);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, false);
        double[][] doubleArray24 = realMatrixImpl23.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24, true);
        boolean boolean28 = realMatrixImpl27.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray29 = realMatrixImpl27.getPermutation();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 1);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 1);
        int int3 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', (int) (byte) 10);
        double[] doubleArray7 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray12 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray18 = new double[][] { doubleArray7, doubleArray12, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray24 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray29 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray35 = new double[][] { doubleArray24, doubleArray29, doubleArray34 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        boolean boolean38 = realMatrixImpl36.isSquare();
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray53 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray54 = new double[][] { doubleArray43, doubleArray48, doubleArray53 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray71 = new double[][] { doubleArray60, doubleArray65, doubleArray70 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl55.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        boolean boolean74 = realMatrixImpl72.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl72.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl36.add(realMatrix76);
        int[] intArray78 = realMatrixImpl36.permutation;
        double[][] doubleArray79 = realMatrixImpl36.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray79);
        java.math.BigDecimal[] bigDecimalArray84 = bigMatrixImpl82.getRow(0);
        int int85 = bigMatrixImpl82.parity;
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl82.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray86, 0, 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl13.getColumnMatrix(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray21 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.copy();
        int int33 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.copy();
        int int35 = bigMatrixImpl13.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray36 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        int int17 = bigMatrixImpl13.getScale();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        bigMatrixImpl31.parity = (short) 0;
        double[] doubleArray36 = bigMatrixImpl31.getColumnAsDoubleArray(0);
        java.math.BigDecimal[] bigDecimalArray37 = bigMatrixImpl13.operate(doubleArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal[][] bigDecimalArray51 = new java.math.BigDecimal[][] { bigDecimalArray42, bigDecimalArray46, bigDecimalArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        java.lang.String str53 = bigMatrixImpl52.toString();
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal58, bigDecimal59, bigDecimal60 };
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal[][] bigDecimalArray66 = new java.math.BigDecimal[][] { bigDecimalArray57, bigDecimalArray61, bigDecimalArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray66);
        bigMatrixImpl52.lu = bigDecimalArray66;
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl52.transpose();
        bigMatrixImpl52.setRoundingMode(0);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl52.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl38.scalarAdd(bigDecimal72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray74 = bigMatrixImpl38.getPermutation();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        int int65 = bigMatrixImpl59.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl59.transpose();
        java.math.BigDecimal[][] bigDecimalArray67 = bigMatrixImpl59.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray68 = bigMatrixImpl59.getPermutation();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) (byte) 100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[][] doubleArray20 = realMatrixImpl19.lu;
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.getColumnMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.scalarMultiply((double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl19.scalarAdd((double) '4');
        boolean boolean27 = realMatrixImpl19.isSquare();
        int int28 = realMatrixImpl19.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray29 = realMatrixImpl19.getPermutation();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl31.scalarAdd(bigDecimal33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl31.getTrace();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal[][] bigDecimalArray48 = new java.math.BigDecimal[][] { bigDecimalArray39, bigDecimalArray43, bigDecimalArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        java.lang.String str50 = bigMatrixImpl49.toString();
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal[][] bigDecimalArray63 = new java.math.BigDecimal[][] { bigDecimalArray54, bigDecimalArray58, bigDecimalArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        java.lang.String str65 = bigMatrixImpl64.toString();
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68 };
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal[][] bigDecimalArray78 = new java.math.BigDecimal[][] { bigDecimalArray69, bigDecimalArray73, bigDecimalArray77 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        bigMatrixImpl64.lu = bigDecimalArray78;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = bigMatrixImpl49.multiply(bigMatrixImpl64);
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl31.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl49);
        boolean boolean83 = bigMatrixImpl17.equals((java.lang.Object) bigMatrixImpl49);
        java.lang.String str84 = bigMatrixImpl17.toString();
        boolean boolean85 = bigMatrixImpl17.isSingular();
        int int86 = bigMatrixImpl17.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray87 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl33.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl33.scalarAdd((double) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray40 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray35 = realMatrixImpl33.data;
        double[] doubleArray37 = realMatrixImpl33.getColumn(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray38 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(100, 1);
        double[] doubleArray7 = new double[] { 3, (short) 1, 10.0f, '#' };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        realMatrixImpl9.parity = (byte) 10;
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray27 = new double[][] { doubleArray16, doubleArray21, doubleArray26 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray44 = new double[][] { doubleArray33, doubleArray38, doubleArray43 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray62 = new double[][] { doubleArray51, doubleArray56, doubleArray61 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray73 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray78 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray79 = new double[][] { doubleArray68, doubleArray73, doubleArray78 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl80);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl45.add(realMatrix81);
        int[] intArray88 = new int[] { (short) 0, (short) 1, (byte) 100, (byte) 100, (short) 100 };
        realMatrixImpl45.permutation = intArray88;
        realMatrixImpl9.permutation = intArray88;
        bigMatrixImpl2.permutation = intArray88;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray87);
        realMatrixImpl71.lu = doubleArray87;
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl71.scalarAdd((double) (short) 10);
        double[][] doubleArray93 = realMatrixImpl71.getData();
        realMatrixImpl71.parity = (byte) 0;
        int int96 = realMatrixImpl71.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.copy();
        int int33 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl20.data = bigDecimalArray33;
        int int39 = bigMatrixImpl20.getRowDimension();
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal[][] bigDecimalArray52 = new java.math.BigDecimal[][] { bigDecimalArray43, bigDecimalArray47, bigDecimalArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.lang.String str54 = bigMatrixImpl53.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = bigMatrixImpl20.multiply(bigMatrixImpl53);
        java.math.BigDecimal bigDecimal56 = bigMatrixImpl55.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray57 = bigMatrixImpl55.getPermutation();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.lu;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal16, bigDecimal17, bigDecimal18 };
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray23, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.lang.String str30 = bigMatrixImpl29.toString();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        bigMatrixImpl29.lu = bigDecimalArray43;
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl29.transpose();
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl29.scalarAdd(bigDecimal47);
        boolean boolean49 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl29);
        bigMatrixImpl13.setRoundingMode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray52 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double double74 = realMatrixImpl71.getEntry((int) (byte) 1, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.scalarAdd((double) (short) 1);
        int int77 = realMatrixImpl71.parity;
        double[][] doubleArray78 = realMatrixImpl71.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl71.copy();
        double[][] doubleArray80 = realMatrixImpl71.getData();
        java.lang.String str81 = realMatrixImpl71.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray82 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl16.copy();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        boolean boolean57 = realMatrixImpl16.equals((java.lang.Object) doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl16.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl16.scalarMultiply((-1.0d));
        boolean boolean61 = realMatrixImpl16.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl16.copy();
        double[][] doubleArray63 = realMatrixImpl16.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray65 = realMatrixImpl64.getPermutation();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        java.math.BigDecimal bigDecimal65 = bigMatrixImpl28.getNorm();
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68 };
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal[][] bigDecimalArray78 = new java.math.BigDecimal[][] { bigDecimalArray69, bigDecimalArray73, bigDecimalArray77 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        java.lang.String str80 = bigMatrixImpl79.toString();
        java.math.BigDecimal[][] bigDecimalArray81 = bigMatrixImpl79.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl28.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl79);
        java.lang.String str83 = bigMatrixImpl28.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix84 = bigMatrixImpl28.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray85 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        int int20 = bigMatrixImpl17.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl17.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, (int) (short) 1);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getRow(52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        int int32 = bigMatrixImpl13.getColumnDimension();
        bigMatrixImpl13.parity = (byte) 100;
        java.lang.String str35 = bigMatrixImpl13.toString();
        int int36 = bigMatrixImpl13.getColumnDimension();
        java.lang.String str37 = bigMatrixImpl13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray38 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        double[] doubleArray23 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray34 = new double[][] { doubleArray23, doubleArray28, doubleArray33 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean54 = realMatrixImpl52.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl52.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[][] doubleArray58 = realMatrixImpl52.data;
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl52.scalarAdd((double) 6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray61 = realMatrixImpl52.getPermutation();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.lang.String str47 = bigMatrixImpl46.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        bigMatrixImpl46.lu = bigDecimalArray60;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = bigMatrixImpl31.multiply(bigMatrixImpl46);
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray67 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal65, bigDecimal66 };
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal68, bigDecimal69, bigDecimal70 };
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal[][] bigDecimalArray76 = new java.math.BigDecimal[][] { bigDecimalArray67, bigDecimalArray71, bigDecimalArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76);
        java.lang.String str78 = bigMatrixImpl77.toString();
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl77.scalarAdd(bigDecimal79);
        boolean boolean81 = bigMatrixImpl77.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl46.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl77);
        bigMatrixImpl46.setRoundingMode((int) '#');
        java.math.BigDecimal bigDecimal85 = bigMatrixImpl46.getDeterminant();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl86 = bigMatrixImpl13.multiply(bigMatrixImpl46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray87 = bigMatrixImpl46.getPermutation();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl20.data = bigDecimalArray33;
        boolean boolean39 = bigMatrixImpl20.isSquare();
        double[] doubleArray41 = bigMatrixImpl20.getRowAsDoubleArray(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray43 = realMatrixImpl42.getPermutation();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        double[] doubleArray34 = bigMatrixImpl13.getRowAsDoubleArray(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        int int92 = realMatrixImpl71.getColumnDimension();
        boolean boolean93 = realMatrixImpl71.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray94 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.copy();
        int int33 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.copy();
        boolean boolean35 = bigMatrixImpl13.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl13.copy();
        java.math.BigDecimal bigDecimal37 = bigMatrixImpl13.getTrace();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl13.inverse();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getRoundingMode();
        int int19 = bigMatrixImpl13.getScale();
        java.lang.String str20 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl13.data = bigDecimalArray33;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, false);
        int int41 = bigMatrixImpl40.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = bigMatrixImpl40.getPermutation();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl68.transpose();
        double[][] doubleArray73 = realMatrixImpl68.getDataRef();
        double[][] doubleArray74 = realMatrixImpl68.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray76 = realMatrixImpl75.getPermutation();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        int int19 = realMatrixImpl18.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl18.scalarAdd((double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = realMatrixImpl18.getPermutation();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        bigMatrixImpl28.setRoundingMode((int) '#');
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl28.copy();
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray77 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray82 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray83 = new double[][] { doubleArray72, doubleArray77, doubleArray82 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray83);
        java.math.BigDecimal[] bigDecimalArray87 = bigMatrixImpl85.getColumn((int) (byte) 0);
        int int88 = bigMatrixImpl85.getRoundingMode();
        int int89 = bigMatrixImpl85.getRowDimension();
        bigMatrixImpl85.setRoundingMode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl28.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl85);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.lu;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal16, bigDecimal17, bigDecimal18 };
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray23, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.lang.String str30 = bigMatrixImpl29.toString();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        bigMatrixImpl29.lu = bigDecimalArray43;
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl29.transpose();
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl29.scalarAdd(bigDecimal47);
        boolean boolean49 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl29);
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl13.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray51 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray10 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray16 = new double[][] { doubleArray5, doubleArray10, doubleArray15 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16, true);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarMultiply((double) (-1L));
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray36 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray37 = new double[][] { doubleArray26, doubleArray31, doubleArray36 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray53 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray54 = new double[][] { doubleArray43, doubleArray48, doubleArray53 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl38.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray71 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray72 = new double[][] { doubleArray61, doubleArray66, doubleArray71 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        double[] doubleArray78 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray83 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray88 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray89 = new double[][] { doubleArray78, doubleArray83, doubleArray88 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl73.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
        boolean boolean92 = realMatrixImpl90.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = realMatrixImpl55.subtract(realMatrixImpl90);
        int int94 = realMatrixImpl93.getRowDimension();
        java.lang.String str95 = realMatrixImpl93.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl0.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 10, (int) (short) 1);
        double[][] doubleArray3 = realMatrixImpl2.data;
        int int4 = realMatrixImpl2.getColumnDimension();
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.lu;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        double[] doubleArray4 = new double[] { 3, (short) 1, 10.0f, '#' };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl6.transpose();
        int int8 = realMatrixImpl6.getColumnDimension();
        double[][] doubleArray9 = realMatrixImpl6.lu;
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray19 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray24 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray25 = new double[][] { doubleArray14, doubleArray19, doubleArray24 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25, true);
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray44 = new double[][] { doubleArray33, doubleArray38, doubleArray43 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray61 = new double[][] { doubleArray50, doubleArray55, doubleArray60 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl45.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        boolean boolean64 = realMatrixImpl62.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl62.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        double[][] doubleArray68 = realMatrixImpl62.data;
        realMatrixImpl6.data = doubleArray68;
        int[] intArray70 = realMatrixImpl6.permutation;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray71 = realMatrixImpl6.getPermutation();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(10, (int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.getRowMatrix(1);
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal[][] bigDecimalArray47 = new java.math.BigDecimal[][] { bigDecimalArray38, bigDecimalArray42, bigDecimalArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47);
        java.lang.String str49 = bigMatrixImpl48.toString();
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl48.scalarAdd(bigDecimal50);
        int[] intArray58 = new int[] { '4', 0, 3, (short) 0, (byte) 1, (short) 100 };
        bigMatrixImpl48.permutation = intArray58;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray67 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal65, bigDecimal66 };
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal68, bigDecimal69, bigDecimal70 };
        java.math.BigDecimal[][] bigDecimalArray72 = new java.math.BigDecimal[][] { bigDecimalArray63, bigDecimalArray67, bigDecimalArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray72);
        java.lang.String str74 = bigMatrixImpl73.toString();
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl73.scalarAdd(bigDecimal75);
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrixImpl48.add(bigMatrix76);
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl13.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl48);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl13.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl13.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray81 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        boolean boolean17 = bigMatrixImpl13.isSquare();
        bigMatrixImpl13.parity = (-1);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray23 = bigMatrixImpl22.getPermutation();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.scalarMultiply((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray74 = realMatrixImpl68.getPermutation();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, (int) '4');
        double[] doubleArray7 = new double[] { 3, (short) 1, 10.0f, '#' };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        realMatrixImpl9.parity = (byte) 10;
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray27 = new double[][] { doubleArray16, doubleArray21, doubleArray26 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray44 = new double[][] { doubleArray33, doubleArray38, doubleArray43 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray62 = new double[][] { doubleArray51, doubleArray56, doubleArray61 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray73 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray78 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray79 = new double[][] { doubleArray68, doubleArray73, doubleArray78 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl80);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl45.add(realMatrix81);
        int[] intArray88 = new int[] { (short) 0, (short) 1, (byte) 100, (byte) 100, (short) 100 };
        realMatrixImpl45.permutation = intArray88;
        realMatrixImpl9.permutation = intArray88;
        bigMatrixImpl2.permutation = intArray88;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray68 = new double[][] { doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[][] doubleArray71 = realMatrixImpl52.lu;
        int int72 = realMatrixImpl52.getRowDimension();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = realMatrixImpl16.add(realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl73.scalarAdd((double) 1);
        int int76 = realMatrixImpl73.getRowDimension();
        double double77 = realMatrixImpl73.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray78 = realMatrixImpl73.getPermutation();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        double[] doubleArray23 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray34 = new double[][] { doubleArray23, doubleArray28, doubleArray33 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray51 = new double[][] { doubleArray40, doubleArray45, doubleArray50 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean54 = realMatrixImpl52.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl52.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl18.scalarAdd((double) 'a');
        java.lang.String str60 = realMatrixImpl18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray61 = realMatrixImpl18.getPermutation();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean35 = realMatrixImpl33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl33.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl33.scalarAdd((double) 4);
        boolean boolean40 = realMatrixImpl33.isSingular();
        int int41 = realMatrixImpl33.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = realMatrixImpl33.getPermutation();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray36 = realMatrixImpl16.getRow(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[][] doubleArray39 = realMatrixImpl38.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        int int41 = realMatrixImpl40.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = realMatrixImpl40.getPermutation();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '#', 3);
        int int3 = realMatrixImpl2.parity;
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl2.scalarAdd((double) 4);
        double[] doubleArray10 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray20 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray21 = new double[][] { doubleArray10, doubleArray15, doubleArray20 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21, true);
        int[] intArray30 = new int[] { (short) 0, (short) 100, (byte) 100, 4, 10 };
        realMatrixImpl24.permutation = intArray30;
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl24.copy();
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray42 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray48 = new double[][] { doubleArray37, doubleArray42, doubleArray47 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48, true);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.getColumnMatrix((int) (short) 1);
        double[][] doubleArray54 = realMatrixImpl51.getDataRef();
        int int55 = realMatrixImpl51.parity;
        double[][] doubleArray56 = realMatrixImpl51.getData();
        realMatrixImpl24.data = doubleArray56;
        realMatrixImpl2.lu = doubleArray56;
        realMatrixImpl2.parity = 1;
        int int61 = realMatrixImpl2.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray62 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray35 = realMatrixImpl16.lu;
        int int36 = realMatrixImpl16.getRowDimension();
        int int37 = realMatrixImpl16.getRowDimension();
        double[][] doubleArray38 = realMatrixImpl16.getData();
        double[][] doubleArray39 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl16.scalarMultiply(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.lang.String str44 = bigMatrixImpl43.toString();
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl43.scalarAdd(bigDecimal45);
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl43.getTrace();
        int int48 = bigMatrixImpl43.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl43.getColumnMatrix(1);
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal[][] bigDecimalArray63 = new java.math.BigDecimal[][] { bigDecimalArray54, bigDecimalArray58, bigDecimalArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        java.lang.String str65 = bigMatrixImpl64.toString();
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68 };
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal[][] bigDecimalArray78 = new java.math.BigDecimal[][] { bigDecimalArray69, bigDecimalArray73, bigDecimalArray77 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        bigMatrixImpl64.lu = bigDecimalArray78;
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl64.transpose();
        bigMatrixImpl64.setRoundingMode(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix84 = bigMatrixImpl43.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix85 = bigMatrixImpl13.solve(bigMatrix84);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        double[] doubleArray31 = bigMatrixImpl13.getColumnAsDoubleArray((int) (short) 1);
        int int32 = bigMatrixImpl13.getColumnDimension();
        bigMatrixImpl13.parity = (byte) 100;
        java.lang.String str35 = bigMatrixImpl13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray36 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray28, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33, true);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        bigMatrixImpl20.data = bigDecimalArray33;
        int int39 = bigMatrixImpl20.getRowDimension();
        java.math.BigDecimal[] bigDecimalArray41 = bigMatrixImpl20.getColumn((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray43 = bigMatrixImpl20.getColumn(1);
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal[][] bigDecimalArray56 = new java.math.BigDecimal[][] { bigDecimalArray47, bigDecimalArray51, bigDecimalArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.lang.String str58 = bigMatrixImpl57.toString();
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray66 = new java.math.BigDecimal[] { bigDecimal63, bigDecimal64, bigDecimal65 };
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal[][] bigDecimalArray71 = new java.math.BigDecimal[][] { bigDecimalArray62, bigDecimalArray66, bigDecimalArray70 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray71);
        java.lang.String str73 = bigMatrixImpl72.toString();
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray81 = new java.math.BigDecimal[] { bigDecimal78, bigDecimal79, bigDecimal80 };
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray85 = new java.math.BigDecimal[] { bigDecimal82, bigDecimal83, bigDecimal84 };
        java.math.BigDecimal[][] bigDecimalArray86 = new java.math.BigDecimal[][] { bigDecimalArray77, bigDecimalArray81, bigDecimalArray85 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86);
        bigMatrixImpl72.lu = bigDecimalArray86;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = bigMatrixImpl57.multiply(bigMatrixImpl72);
        java.math.BigDecimal bigDecimal90 = bigMatrixImpl57.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix91 = bigMatrixImpl20.scalarAdd(bigDecimal90);
        java.lang.String str92 = bigMatrixImpl20.toString();
        int int93 = bigMatrixImpl20.getScale();
        double[][] doubleArray94 = bigMatrixImpl20.getDataAsDoubleArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray95 = bigMatrixImpl20.getPermutation();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        bigMatrixImpl13.lu = bigDecimalArray27;
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl13.transpose();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        int int33 = bigMatrixImpl13.getRoundingMode();
        int int34 = bigMatrixImpl13.parity;
        double[][] doubleArray35 = bigMatrixImpl13.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42 };
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal[][] bigDecimalArray48 = new java.math.BigDecimal[][] { bigDecimalArray39, bigDecimalArray43, bigDecimalArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        java.lang.String str50 = bigMatrixImpl49.toString();
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl49.scalarAdd(bigDecimal51);
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl49.getTrace();
        int int54 = bigMatrixImpl49.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl49.transpose();
        boolean boolean56 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray57 = bigMatrixImpl49.getPermutation();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray21 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal19, bigDecimal20 };
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24 };
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal[][] bigDecimalArray30 = new java.math.BigDecimal[][] { bigDecimalArray21, bigDecimalArray25, bigDecimalArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.lang.String str32 = bigMatrixImpl31.toString();
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray40, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.lang.String str47 = bigMatrixImpl46.toString();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray55, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        bigMatrixImpl46.lu = bigDecimalArray60;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = bigMatrixImpl31.multiply(bigMatrixImpl46);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl13.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl31);
        double[] doubleArray69 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray74 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray79 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray80 = new double[][] { doubleArray69, doubleArray74, doubleArray79 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray80);
        java.math.BigDecimal[] bigDecimalArray84 = bigMatrixImpl82.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray84);
        java.math.BigDecimal[] bigDecimalArray86 = bigMatrixImpl13.operate(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86);
        double[][] doubleArray88 = bigMatrixImpl87.getDataAsDoubleArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray89 = bigMatrixImpl87.getPermutation();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        int int37 = realMatrixImpl16.parity;
        double[][] doubleArray38 = realMatrixImpl16.data;
        realMatrixImpl16.parity = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray41 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray53, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.lang.String str60 = bigMatrixImpl59.toString();
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.scalarAdd(bigDecimal61);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl28.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray65 = bigMatrixImpl59.getPermutation();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        boolean boolean46 = bigMatrixImpl28.isSingular();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl28.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray48 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        int[] intArray20 = realMatrixImpl19.permutation;
        double[] doubleArray25 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray30 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray36 = new double[][] { doubleArray25, doubleArray30, doubleArray35 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.lu;
        double[][] doubleArray41 = bigMatrixImpl39.getDataAsDoubleArray();
        double[][] doubleArray42 = bigMatrixImpl39.getDataAsDoubleArray();
        boolean boolean43 = realMatrixImpl19.equals((java.lang.Object) bigMatrixImpl39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray44 = realMatrixImpl19.getPermutation();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getTrace();
        double[][] doubleArray15 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray18 = realMatrixImpl17.getPermutation();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal16, bigDecimal17 };
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21 };
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray22, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        java.lang.String str29 = bigMatrixImpl28.toString();
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray37, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        bigMatrixImpl28.lu = bigDecimalArray42;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl13.multiply(bigMatrixImpl28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray46 = bigMatrixImpl28.getPermutation();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double double77 = realMatrixImpl53.getEntry(0, 1);
        double[][] doubleArray78 = realMatrixImpl53.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray79 = realMatrixImpl53.getPermutation();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray36 = realMatrixImpl16.getDataRef();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray52 = new double[][] { doubleArray41, doubleArray46, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray69 = new double[][] { doubleArray58, doubleArray63, doubleArray68 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        int int72 = realMatrixImpl53.getColumnDimension();
        double[][] doubleArray73 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[][] doubleArray75 = realMatrixImpl53.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75, true);
        java.lang.String str78 = realMatrixImpl77.toString();
        boolean boolean79 = realMatrixImpl77.isSingular();
        int int80 = realMatrixImpl77.parity;
        double[] doubleArray82 = realMatrixImpl77.getColumn((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray83 = realMatrixImpl77.getPermutation();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15, false);
        double[][] doubleArray24 = realMatrixImpl23.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24, true);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray29 = realMatrixImpl28.getPermutation();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray36 = realMatrixImpl16.getRow(1);
        double[][] doubleArray37 = realMatrixImpl16.getData();
        int int38 = realMatrixImpl16.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray39 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl13.transpose();
        double[] doubleArray24 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray29 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray35 = new double[][] { doubleArray24, doubleArray29, doubleArray34 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[] bigDecimalArray39 = bigMatrixImpl37.getColumn((int) (byte) 0);
        int int40 = bigMatrixImpl37.getColumnDimension();
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray56 = new double[][] { doubleArray45, doubleArray50, doubleArray55 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray56);
        java.math.BigDecimal[] bigDecimalArray60 = bigMatrixImpl58.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        java.math.BigDecimal[] bigDecimalArray62 = bigMatrixImpl37.preMultiply(bigDecimalArray60);
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl37.data;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63, true);
        bigMatrixImpl13.data = bigDecimalArray63;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray69 = bigMatrixImpl68.getPermutation();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray50 = new double[][] { doubleArray39, doubleArray44, doubleArray49 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray66 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray67 = new double[][] { doubleArray56, doubleArray61, doubleArray66 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean70 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = realMatrixImpl33.subtract(realMatrixImpl68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray87 = new double[][] { doubleArray76, doubleArray81, doubleArray86 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87, true);
        realMatrixImpl71.data = doubleArray87;
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl71.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl71.scalarAdd(0.0d);
        int int95 = realMatrixImpl71.getRowDimension();
        int int96 = realMatrixImpl71.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = realMatrixImpl71.getPermutation();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl17.getColumn((int) (byte) 0);
        int int20 = bigMatrixImpl17.getColumnDimension();
        double[] doubleArray25 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray30 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray36 = new double[][] { doubleArray25, doubleArray30, doubleArray35 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray42 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray53 = new double[][] { doubleArray42, doubleArray47, doubleArray52 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray57 = realMatrixImpl37.getRow(1);
        java.math.BigDecimal[] bigDecimalArray58 = bigMatrixImpl17.operate(doubleArray57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        java.lang.String str61 = realMatrixImpl60.toString();
        double double62 = realMatrixImpl60.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray63 = realMatrixImpl60.getPermutation();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray9 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int35 = realMatrixImpl16.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl16.copy();
        int int37 = realMatrixImpl16.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray38 = realMatrixImpl16.getPermutation();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.lu;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal16, bigDecimal17, bigDecimal18 };
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray23, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.lang.String str30 = bigMatrixImpl29.toString();
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray38, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        bigMatrixImpl29.lu = bigDecimalArray43;
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl29.transpose();
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl29.scalarAdd(bigDecimal47);
        boolean boolean49 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl29);
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl13.getDataRef();
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl13.getTrace();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray52 = bigMatrixImpl13.getPermutation();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray3, bigDecimalArray7, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.lang.String str14 = bigMatrixImpl13.toString();
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.scalarAdd(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl13.getTrace();
        int int18 = bigMatrixImpl13.getRoundingMode();
        int[] intArray19 = bigMatrixImpl13.permutation;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray20 = bigMatrixImpl13.getPermutation();
    }
}

