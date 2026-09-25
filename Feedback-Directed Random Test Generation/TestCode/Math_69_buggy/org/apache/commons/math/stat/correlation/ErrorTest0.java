package org.apache.commons.math.stat.correlation;

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
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation1.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray9 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray15 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray21 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray27 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray33 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray34 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33 };
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation3.computeCorrelationMatrix(doubleArray34);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation1.computeCorrelationMatrix(realMatrix35);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray44 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray50 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray56 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray62 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray68 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation38.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation0.getCorrelationMatrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation1.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray9 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray15 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray21 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray27 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray33 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray34 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33 };
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation3.computeCorrelationMatrix(doubleArray34);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation1.computeCorrelationMatrix(realMatrix35);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray44 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray50 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray56 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray62 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray68 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation38.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix34);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation37 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray43 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray49 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray55 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray61 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray67 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray68 = new double[][] { doubleArray43, doubleArray49, doubleArray55, doubleArray61, doubleArray67 };
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation37.computeCorrelationMatrix(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray6 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray12 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray18 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray24 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray30 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray31 = new double[][] { doubleArray6, doubleArray12, doubleArray18, doubleArray24, doubleArray30 };
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationPValues();
        double[] doubleArray42 = new double[] { (byte) 1, (byte) 0, 10, (-1.0f) };
        double[] doubleArray47 = new double[] { (byte) 1, (byte) 0, 10, (-1.0f) };
        double[] doubleArray52 = new double[] { (byte) 1, (byte) 0, 10, (-1.0f) };
        double[] doubleArray57 = new double[] { (byte) 1, (byte) 0, 10, (-1.0f) };
        double[] doubleArray62 = new double[] { (byte) 1, (byte) 0, 10, (-1.0f) };
        double[] doubleArray67 = new double[] { (byte) 1, (byte) 0, 10, (-1.0f) };
        double[][] doubleArray68 = new double[][] { doubleArray42, doubleArray47, doubleArray52, doubleArray57, doubleArray62, doubleArray67 };
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation36.computeCorrelationMatrix(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        double[] doubleArray40 = new double[] { (-1.0f), 0.0d, 0L, (-1L), 100.0f };
        double[] doubleArray46 = new double[] { '#', (short) -1, 0L, 0.0d, 'a' };
        double double47 = pearsonsCorrelation34.correlation(doubleArray40, doubleArray46);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation48 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray54 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray60 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray66 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray72 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray78 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray79 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78 };
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation48.computeCorrelationMatrix(doubleArray79);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation81 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation81.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation34.computeCorrelationMatrix(realMatrix82);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix82);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation0.getCorrelationMatrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix86 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation0.getCorrelationMatrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray46 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray52 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray58 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray64 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray70 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation40.computeCorrelationMatrix(doubleArray71);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation73.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        double[] doubleArray41 = new double[] { (-1.0f), 0.0d, 0L, (-1L), 100.0f };
        double[] doubleArray47 = new double[] { '#', (short) -1, 0L, 0.0d, 'a' };
        double double48 = pearsonsCorrelation35.correlation(doubleArray41, doubleArray47);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation49 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray55 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray61 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray67 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray73 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray79 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray80 = new double[][] { doubleArray55, doubleArray61, doubleArray67, doubleArray73, doubleArray79 };
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation49.computeCorrelationMatrix(doubleArray80);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix81);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation82.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation35.computeCorrelationMatrix(realMatrix83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation1.computeCorrelationMatrix(realMatrix83);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix87 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix34);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation37 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray43 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray49 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray55 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray61 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray67 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray68 = new double[][] { doubleArray43, doubleArray49, doubleArray55, doubleArray61, doubleArray67 };
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation37.computeCorrelationMatrix(doubleArray68);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation70.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation73.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix3 = pearsonsCorrelation0.getCorrelationMatrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix4 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix3 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation4 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray10 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray16 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray22 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray28 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray34 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray10, doubleArray16, doubleArray22, doubleArray28, doubleArray34 };
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation4.computeCorrelationMatrix(doubleArray35);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation37 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray9 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray15 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray21 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray27 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray33 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray34 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33 };
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation3.computeCorrelationMatrix(doubleArray34);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix35);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix35, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation38.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation2.computeCorrelationMatrix(realMatrix39);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation42 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix39, (int) ' ');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray49 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray55 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray61 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray67 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray73 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray74 = new double[][] { doubleArray49, doubleArray55, doubleArray61, doubleArray67, doubleArray73 };
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation43.computeCorrelationMatrix(doubleArray74);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, 10);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation42.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix3 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix4 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation5 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation6 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray12 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray18 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray24 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray30 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray36 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray12, doubleArray18, doubleArray24, doubleArray30, doubleArray36 };
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation6.computeCorrelationMatrix(doubleArray37);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix38);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation41 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix38, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = pearsonsCorrelation41.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = pearsonsCorrelation5.computeCorrelationMatrix(realMatrix42);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix42, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix47 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray44 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray50 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray56 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray62 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray68 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation38.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation71.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix72);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation74 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix72);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation2 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray8 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray14 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray26 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray32 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray8, doubleArray14, doubleArray20, doubleArray26, doubleArray32 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation2.computeCorrelationMatrix(doubleArray33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation36.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation36.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation41 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray47 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray53 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray59 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray65 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray71 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray72 = new double[][] { doubleArray47, doubleArray53, doubleArray59, doubleArray65, doubleArray71 };
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation41.computeCorrelationMatrix(doubleArray72);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation74 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation74.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, 0);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation77.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation36.covarianceToCorrelation(realMatrix78);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix2 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix3 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation4 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray10 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray16 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray22 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray28 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray34 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray10, doubleArray16, doubleArray22, doubleArray28, doubleArray34 };
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation4.computeCorrelationMatrix(doubleArray35);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation37 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation37.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation37.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation37.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = pearsonsCorrelation0.getCorrelationMatrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix43 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix37);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray45 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray51 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray57 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray63 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray69 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray70 = new double[][] { doubleArray45, doubleArray51, doubleArray57, doubleArray63, doubleArray69 };
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation39.computeCorrelationMatrix(doubleArray70);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71, (int) ' ');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation74 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71, (int) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation1.computeCorrelationMatrix(doubleArray32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, 10);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation37 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray44 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray50 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray56 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray62 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[] doubleArray68 = new double[] { (byte) 10, (byte) -1, 100.0f, (-1L), 100.0d };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation38.computeCorrelationMatrix(doubleArray69);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation37.covarianceToCorrelation(realMatrix73);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation0.covarianceToCorrelation(realMatrix74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }
}

