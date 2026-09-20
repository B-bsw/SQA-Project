package org.jfree.data.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Class<?> wildcardClass10 = numberArray8.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass11 = range10.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(xYDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset27, true);
        java.lang.Class<?> wildcardClass30 = categoryDataset27.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0.0f, (double) (short) -1, (int) '4', (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0, (double) (byte) 1, (int) (short) 1, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] {};
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray1, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertArrayEquals(comparableArray1, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0L, (double) (short) 1, (int) (byte) -1, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        java.lang.Class<?> wildcardClass12 = pieDataset11.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Comparable comparable0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable0, (org.jfree.data.KeyedValues) pieDataset12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass13 = range12.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        double[] doubleArray3 = new double[] { 100.0d };
        double[] doubleArray5 = new double[] { 100.0d };
        double[][] doubleArray6 = new double[][] { doubleArray3, doubleArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { (-1), 10.0f, (byte) 0, (byte) 10, 100L, 0L };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray33 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray34 = new double[][] { doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29, doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray7, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.KeyToGroupMap keyToGroupMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0, (double) (-1.0f), 0, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0.0f, (double) '4', (int) ' ', (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) -1, (double) (byte) 100, (int) (byte) 10, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1.0f), (double) (-1), (int) '4', (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double[] doubleArray8 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray15 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray22 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray23 = new double[][] { doubleArray8, doubleArray15, doubleArray22 };
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset24, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(categoryDataset24);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.KeyToGroupMap keyToGroupMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d, (-1.0f), true, 'a' };
        java.lang.Comparable[] comparableArray11 = new java.lang.Comparable[] { 'a', '4', (short) 100, (byte) 1, 0.0d, 0 };
        double[] doubleArray20 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray27 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray34 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray35 = new double[][] { doubleArray20, doubleArray27, doubleArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray11, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray11);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(categoryDataset36);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1), 100.0d, (int) (byte) 0, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        java.lang.Class<?> wildcardClass13 = pieDataset11.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 0.0f, (double) 10.0f, 0, (java.lang.Comparable) 20.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 100.0f, (double) (byte) 10, (int) (short) -1, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) 100, (double) (byte) -1, (int) (byte) -1, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.Comparable comparable0 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable0, (org.jfree.data.KeyedValues) pieDataset17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(pieDataset17);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (-1L), (double) (byte) 10, 1, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.lang.Class<?> wildcardClass19 = categoryDataset9.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        org.jfree.data.KeyToGroupMap keyToGroupMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.lang.Class<?> wildcardClass15 = range14.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { '#', 0.0d, (-1.0f), 1L, 100.0d };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 0 };
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10L, (double) (byte) 0);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pieDataset17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 11.0d, (short) -1, 11.0d, (byte) 0 };
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100 };
        double[] doubleArray12 = new double[] { 1L, '4', 0.0f, 0L, 10L };
        double[] doubleArray18 = new double[] { 1L, '4', 0.0f, 0L, 10L };
        double[] doubleArray24 = new double[] { 1L, '4', 0.0f, 0L, 10L };
        double[] doubleArray30 = new double[] { 1L, '4', 0.0f, 0L, 10L };
        double[] doubleArray36 = new double[] { 1L, '4', 0.0f, 0L, 10L };
        double[][] doubleArray37 = new double[][] { doubleArray12, doubleArray18, doubleArray24, doubleArray30, doubleArray36 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray6, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'rowKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 52.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 52.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 52.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 52.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 52.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 0.0d, (byte) 0, false, ' ', false };
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] {};
        double[] doubleArray11 = new double[] { '4', (byte) -1, (byte) 1, 10 };
        double[] doubleArray16 = new double[] { '4', (byte) -1, (byte) 1, 10 };
        double[][] doubleArray17 = new double[][] { doubleArray11, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray6, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'rowKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertArrayEquals(comparableArray6, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 52.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 100.0d, (double) 0, (int) (short) 0, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 20.0d, (double) 1, (int) (byte) 0, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) (byte) 0, 10, (java.lang.Comparable) 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { (short) 100, true };
        java.lang.Comparable[] comparableArray9 = new java.lang.Comparable[] { 10L, (short) -1, 100.0f, 10, (byte) 0, 32.0d };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray35 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray36 = new double[][] { doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31, doubleArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray9, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray9);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(categoryDataset37);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (-1.0d), 32.0d, (int) (short) 0, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        org.jfree.data.KeyToGroupMap keyToGroupMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 10, (double) (-1.0f));
        boolean boolean13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        java.lang.Class<?> wildcardClass14 = pieDataset12.getClass();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.data.KeyToGroupMap keyToGroupMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, keyToGroupMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.util.List list17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset5);
        org.jfree.data.KeyToGroupMap keyToGroupMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, keyToGroupMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double[] doubleArray3 = new double[] { 100.0d };
        double[] doubleArray5 = new double[] { 100.0d };
        double[][] doubleArray6 = new double[][] { doubleArray3, doubleArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray6);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.KeyToGroupMap keyToGroupMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset7, keyToGroupMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(pieDataset19);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Comparable comparable0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable0, (org.jfree.data.KeyedValues) pieDataset12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(pieDataset16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (short) 10, (double) (short) 100, (int) (short) 0, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset27, true);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset27, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 32.0d + "'", number30, 32.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray10);
        boolean boolean13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset12);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Comparable comparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, comparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5, list8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { (-1), 0.0d, (short) 100, 1L };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 10.0f, (-1L), (short) 0, 11.0d, (byte) 0 };
        double[] doubleArray14 = new double[] { 100.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[][] doubleArray17 = new double[][] { doubleArray14, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 20.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass19 = range18.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, 11.0d, (-1), comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 100);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) ' ', (double) 10L, (int) (short) 10, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass13 = range12.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.KeyToGroupMap keyToGroupMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 100, 0.0d, (int) (short) 10, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Comparable[] comparableArray0 = null;
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] {};
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray1, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertArrayEquals(comparableArray1, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 100);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (-6.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset13);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset13);
        java.util.List list16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset13, list16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0d + "'", number14, 10.0d);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 'a', 10.0d, (int) (short) 0, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset26, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (-1.0d), 1.0d);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(pieDataset19);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 0.0d, (double) 'a', 0, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { (-1.0d), (byte) 100, 1.0d, (-1L), 0.0f, (byte) 0 };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] {};
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray33 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray34 = new double[][] { doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29, doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray7, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertArrayEquals(comparableArray7, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 1.0f, 100 };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 0.0f, "" };
        double[] doubleArray12 = new double[] { (short) 10, 0.0d, '4', (-1L), (-1.0f), 1.0d };
        double[] doubleArray19 = new double[] { (short) 10, 0.0d, '4', (-1L), (-1.0f), 1.0d };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray5, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 52.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 52.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 32.0d, 0.0d, (int) (byte) 1, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        boolean boolean10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset9);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 1, (double) 0L, (int) '4', (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { true, 'a', 10, false, 1.0f };
        double[] doubleArray14 = new double[] { 100.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[][] doubleArray17 = new double[][] { doubleArray14, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray6, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset27, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10.0d + "'", number12, 10.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 10.0d + "'", number13, 10.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 'a', (double) 0.0f, (int) (byte) 1, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset5);
        java.lang.Class<?> wildcardClass9 = categoryDataset5.getClass();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.KeyToGroupMap keyToGroupMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 20.0d + "'", number10, 20.0d);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 1.0f, (double) (-1L), 1, (java.lang.Comparable) (-6.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset11);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 1.0d + "'", number12, 1.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 20.0d + "'", number13, 20.0d);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        java.lang.Class<?> wildcardClass15 = categoryDataset9.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) 1, (double) (short) 0, (-1), (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 20.0d + "'", number10, 20.0d);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        boolean boolean6 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (int) (byte) 100);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset5, list11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(pieDataset8);
        org.junit.Assert.assertNotNull(pieDataset10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.lang.Class<?> wildcardClass15 = range14.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset5);
        org.jfree.data.KeyToGroupMap keyToGroupMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, keyToGroupMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0.0d + "'", number15, 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset5);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset5, list9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray21 = new java.lang.Comparable[] { 100.0d };
        double[] doubleArray27 = new double[] { 100.0d };
        double[] doubleArray29 = new double[] { 100.0d };
        double[][] doubleArray30 = new double[][] { doubleArray27, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray21, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray25 = new java.lang.Comparable[] { (-1L), 20.0d, false, true, 1L };
        double[] doubleArray29 = new double[] { 100.0d };
        double[] doubleArray31 = new double[] { 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray29, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray25);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(categoryDataset33);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 11.0d, (double) (byte) 100, 1, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (-1.0d), (double) (byte) 100, (int) (short) 1, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) -1, (double) 10, (int) ' ', (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        boolean boolean15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 1.0d + "'", number10, 1.0d);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) '4', (double) 0L, (int) ' ', (java.lang.Comparable) (-6.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray8);
        boolean boolean11 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset10);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset10, list12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.KeyToGroupMap keyToGroupMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset18, keyToGroupMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        java.util.List list17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset16, list17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 10.0f, (byte) 10, (-6.0d), "" };
        java.lang.Comparable[] comparableArray27 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray29 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray37 = new double[] { 100.0d };
        double[] doubleArray39 = new double[] { 100.0d };
        double[][] doubleArray40 = new double[][] { doubleArray37, doubleArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray27, comparableArray29, doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray24, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertNotNull(comparableArray27);
        org.junit.Assert.assertNotNull(comparableArray29);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(categoryDataset41);
        org.junit.Assert.assertNotNull(categoryDataset42);
        org.junit.Assert.assertNotNull(categoryDataset43);
        org.junit.Assert.assertNotNull(categoryDataset44);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1L), 0.0d, (int) (byte) 0, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 100.0d, 0.0d, 0, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) "hi!", (double) (-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(pieDataset21);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset17, list18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 10, (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (short) -1, 0.0d, 1);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(pieDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(pieDataset24);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (short) 1);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        java.util.List list16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0.0d + "'", number14, 0.0d);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray23 = new java.lang.Comparable[] { 32.0d, 0L, (short) 0 };
        double[] doubleArray31 = new double[] { 100.0d };
        double[] doubleArray33 = new double[] { 100.0d };
        double[][] doubleArray34 = new double[][] { doubleArray31, doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray23, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray23);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset15);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 10.0d + "'", number16, 10.0d);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1.0d + "'", number19, 1.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 1.0d + "'", number20, 1.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 100.0d, (double) (byte) 1, (int) (short) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0L, (double) (byte) -1, (int) '#', (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset11);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 1.0d + "'", number12, 1.0d);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10.0d + "'", number12, 10.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        org.jfree.data.KeyToGroupMap keyToGroupMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 10.0d + "'", number19, 10.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 10.0d, (double) 0, (int) (short) 100, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (short) 1);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.KeyedValues keyedValues1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset2 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) true, keyedValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowData' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { false, (short) 100 };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[] doubleArray17 = new double[] { 100.0d };
        double[][] doubleArray18 = new double[][] { doubleArray15, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray7, doubleArray18);
        double[] doubleArray31 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray38 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray45 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray46 = new double[][] { doubleArray31, doubleArray38, doubleArray45 };
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray5, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(categoryDataset47);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 10, (double) 10.0f, 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        boolean boolean15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset6, (java.lang.Comparable) "");
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset9);
        boolean boolean11 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset9);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29, (double) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 10, (-1.0d), 10);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(pieDataset20);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset13);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset13);
        java.util.List list16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset13, list16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0d + "'", number14, 10.0d);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        boolean boolean6 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset5);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5, list8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray10);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset12, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset12, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 10, (double) (-1.0f));
        double double13 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset9);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 10.0d, (double) 10.0f, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = pieDataset9.getClass();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (-6.0d), (double) (byte) 100, 1, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 20.0d + "'", number10, 20.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (short) 1);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 0L);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, (int) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray32 = new double[] { 100.0d };
        double[] doubleArray34 = new double[] { 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray32, doubleArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray22, comparableArray24, doubleArray35);
        double[] doubleArray45 = new double[] { 100.0d };
        double[] doubleArray47 = new double[] { 100.0d };
        double[][] doubleArray48 = new double[][] { doubleArray45, doubleArray47 };
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray22, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(categoryDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertNotNull(categoryDataset50);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray32 = new double[] { 100.0d };
        double[] doubleArray34 = new double[] { 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray32, doubleArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray22, comparableArray24, doubleArray35);
        double[] doubleArray43 = new double[] { 100.0d };
        double[] doubleArray45 = new double[] { 100.0d };
        double[][] doubleArray46 = new double[][] { doubleArray43, doubleArray45 };
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray24, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(categoryDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(categoryDataset47);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 10, (double) (-1.0f));
        double double13 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset9);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) (short) 100, (double) 'a', 100);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset9);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double[] doubleArray3 = new double[] { 100.0d };
        double[] doubleArray5 = new double[] { 100.0d };
        double[][] doubleArray6 = new double[][] { doubleArray3, doubleArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset7, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 0.0f, (double) '#', 0, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 0L);
        org.jfree.data.KeyToGroupMap keyToGroupMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Number[] numberArray8 = new java.lang.Number[] {};
        java.lang.Number[] numberArray9 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray8, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset14);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset14, (int) (byte) 1);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset17);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertArrayEquals(numberArray8, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertArrayEquals(numberArray9, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) '#', (double) 10.0f, (int) 'a', (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray32 = new double[] { 100.0d };
        double[] doubleArray34 = new double[] { 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray32, doubleArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray22, comparableArray24, doubleArray35);
        double[] doubleArray45 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray49 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray53 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray57 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray61 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray65 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray66 = new double[][] { doubleArray45, doubleArray49, doubleArray53, doubleArray57, doubleArray61, doubleArray65 };
        org.jfree.data.category.CategoryDataset categoryDataset67 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray24, doubleArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(categoryDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(categoryDataset67);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0.0d + "'", number14, 0.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (-1.0d), (double) 1.0f, (int) (byte) 100, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 11.0d, (double) (short) -1, 10, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        java.lang.Class<?> wildcardClass16 = pieDataset13.getClass();
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (short) 1);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0, (double) 10L, (int) (short) 100, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1L), (double) 1.0f, 0, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, 0.0d);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset5, list11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, (int) (short) 0);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 1);
        java.util.List list17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0.0d + "'", number14, 0.0d);
        org.junit.Assert.assertNotNull(pieDataset16);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset30, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (byte) 1);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset13, list14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.Comparable[] comparableArray0 = null;
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray5, doubleArray16);
        double[] doubleArray28 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray32 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray36 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray40 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray44 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray48 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray49 = new double[][] { doubleArray28, doubleArray32, doubleArray36, doubleArray40, doubleArray44, doubleArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray49);
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray49);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray3, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(categoryDataset50);
        org.junit.Assert.assertNotNull(categoryDataset51);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, (int) (short) 0);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray20 = null;
        double[] doubleArray28 = new double[] { 100.0d };
        double[] doubleArray30 = new double[] { 100.0d };
        double[][] doubleArray31 = new double[][] { doubleArray28, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray20, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] {};
        double[] doubleArray30 = new double[] { 100.0d };
        double[] doubleArray32 = new double[] { 100.0d };
        double[][] doubleArray33 = new double[][] { doubleArray30, doubleArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray33);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray33);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray20, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertArrayEquals(comparableArray20, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (int) '#');
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (java.lang.Comparable) (short) 10);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5, list14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { (byte) 0, ' ', 1, "", 10 };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { (short) 100, (-1), '4', '4' };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray26 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray33 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray34 = new double[][] { doubleArray19, doubleArray26, doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray10, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0.0d + "'", number14, 0.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        java.util.List list17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (-1L));
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset11);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, 0);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 1.0d + "'", number15, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0L, (double) (byte) 0, (int) '#', (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1L), 32.0d, 100, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (short) 1);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.KeyToGroupMap keyToGroupMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, keyToGroupMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (byte) 1, 0.0d);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(pieDataset18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset26, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.KeyToGroupMap keyToGroupMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 1.0d + "'", number10, 1.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 20.0d + "'", number11, 20.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 20.0d + "'", number12, 20.0d);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, 0.0d);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        java.lang.Comparable comparable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset3 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, comparable1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass10 = categoryDataset5.getClass();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double[][] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 'a', (double) 1.0f, (int) (short) 0, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (-1L));
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset11);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, 0);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 1.0d + "'", number15, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 1, (double) '#', (int) 'a', (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray8);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset10);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10, list13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (byte) 1);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5, list14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        boolean boolean15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset14);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 0L);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.KeyToGroupMap keyToGroupMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 10L, (double) 10L, (int) (short) 10);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(pieDataset20);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 10.0d + "'", number20, 10.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 100L);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 1.0d + "'", number26, 1.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 10.0f };
        java.lang.Comparable[] comparableArray2 = null;
        double[] doubleArray8 = new double[] { 100.0d };
        double[] doubleArray10 = new double[] { 100.0d };
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray2, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) '#');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) (-1.0d), (double) (short) 10);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
        org.junit.Assert.assertNotNull(pieDataset22);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray8);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10, list11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (byte) 1);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.KeyToGroupMap keyToGroupMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, keyToGroupMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 1.0d + "'", number10, 1.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0.0d + "'", number15, 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray5, doubleArray16);
        double[] doubleArray28 = new double[] { 100.0d };
        double[] doubleArray30 = new double[] { 100.0d };
        double[][] doubleArray31 = new double[][] { doubleArray28, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray5, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 20.0d, (double) (short) 0, (int) '4', (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { (byte) 1, 20.0d, 100.0d };
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray35 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray39 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray43 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray47 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray51 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray52 = new double[][] { doubleArray31, doubleArray35, doubleArray39, doubleArray43, doubleArray47, doubleArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray8, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray8);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(categoryDataset54);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] { numberArray4, numberArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset14);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset14);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 32.0d, (double) (short) 0, (-1));
        double double23 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertArrayEquals(numberArray5, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 100L);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        java.util.List list26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset13, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0d + "'", number14, 10.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '4', 11.0d, (int) '#', (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, false);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset11);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double[] doubleArray8 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray15 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray22 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray23 = new double[][] { doubleArray8, doubleArray15, doubleArray22 };
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset24, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(categoryDataset24);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] { numberArray4, numberArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset14);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 10.0f, (double) (short) -1);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) ' ', (double) 0L, 10);
        java.lang.Class<?> wildcardClass25 = pieDataset20.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertArrayEquals(numberArray5, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { true, (byte) 0, (short) 0, 10, 192.0d };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        java.lang.Comparable[] comparableArray30 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray32 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray40 = new double[] { 100.0d };
        double[] doubleArray42 = new double[] { 100.0d };
        double[][] doubleArray43 = new double[][] { doubleArray40, doubleArray42 };
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray30, comparableArray32, doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray8, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray8);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(comparableArray30);
        org.junit.Assert.assertNotNull(comparableArray32);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(categoryDataset44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertNotNull(categoryDataset47);
        org.junit.Assert.assertNotNull(categoryDataset48);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 100);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (byte) 1);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.KeyToGroupMap keyToGroupMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, keyToGroupMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (int) '#');
        java.lang.Class<?> wildcardClass12 = categoryDataset5.getClass();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, 0.0d);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5, list10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 'a', (short) 10, (-1L), 11.0d };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray9 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray17 = new double[] { 100.0d };
        double[] doubleArray19 = new double[] { 100.0d };
        double[][] doubleArray20 = new double[][] { doubleArray17, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray7, comparableArray9, doubleArray20);
        java.lang.Comparable[] comparableArray29 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray31 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray39 = new double[] { 100.0d };
        double[] doubleArray41 = new double[] { 100.0d };
        double[][] doubleArray42 = new double[][] { doubleArray39, doubleArray41 };
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray29, comparableArray31, doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray9, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(comparableArray9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(comparableArray29);
        org.junit.Assert.assertNotNull(comparableArray31);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(categoryDataset43);
        org.junit.Assert.assertNotNull(categoryDataset44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertNotNull(categoryDataset47);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { (byte) 1, 10.0f, (short) -1 };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 1.0d, 192.0d, (short) 100 };
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (-1L));
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset11);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, 0);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 1.0d + "'", number15, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset14, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset14, (int) '4');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset5);
        boolean boolean9 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset5);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, 0.0d);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset13);
        org.jfree.data.KeyToGroupMap keyToGroupMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset13, keyToGroupMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0d + "'", number14, 10.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        java.lang.Class<?> wildcardClass16 = pieDataset13.getClass();
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 0);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        java.lang.Class<?> wildcardClass19 = categoryDataset9.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset14);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 20.0d + "'", number10, 20.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 1, (double) '4', (int) (byte) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(range8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1L), (double) 10L, (int) (short) 10, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (int) '#');
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] {};
        double[] doubleArray28 = new double[] { 100.0d };
        double[] doubleArray30 = new double[] { 100.0d };
        double[][] doubleArray31 = new double[][] { doubleArray28, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray20, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertArrayEquals(comparableArray20, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray32 = new double[] { 100.0d };
        double[] doubleArray34 = new double[] { 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray32, doubleArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray22, comparableArray24, doubleArray35);
        double[] doubleArray49 = new double[] { 100.0d };
        double[] doubleArray51 = new double[] { 100.0d };
        double[][] doubleArray52 = new double[][] { doubleArray49, doubleArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray22, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(categoryDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertNotNull(categoryDataset55);
        org.junit.Assert.assertNotNull(categoryDataset56);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (short) 0, 0.0d, 10, comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset15, comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 1L, 11.0d, (int) (short) 1, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) (byte) 10, 0.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) -1, (double) 100, (int) (byte) -1, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 10.0d, (double) 1L, (-1), (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10.0d + "'", number12, 10.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 0, (double) (short) 10, 100, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 10, (double) ' ', (int) '#', (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass21 = categoryDataset9.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1.0d + "'", number19, 1.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) (byte) 10, 100, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 192.0d, (double) 1, (int) '4', (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset13, list14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset13);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double[][] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { (short) 1, 0L, true, 0.0f, (byte) -1 };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        java.lang.Comparable[] comparableArray30 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray32 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray40 = new double[] { 100.0d };
        double[] doubleArray42 = new double[] { 100.0d };
        double[][] doubleArray43 = new double[][] { doubleArray40, doubleArray42 };
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray30, comparableArray32, doubleArray43);
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray10, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray8);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(comparableArray30);
        org.junit.Assert.assertNotNull(comparableArray32);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(categoryDataset44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertNotNull(categoryDataset47);
        org.junit.Assert.assertNotNull(categoryDataset48);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 0);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 1, (double) 100);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) 100, (double) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(pieDataset19);
        org.junit.Assert.assertNotNull(pieDataset23);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[][] doubleArray17 = new double[][] { doubleArray14, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray6, doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        java.lang.Class<?> wildcardClass23 = categoryDataset22.getClass();
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset13);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset13, false);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0d + "'", number14, 10.0d);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double[] doubleArray8 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray15 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray22 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray23 = new double[][] { doubleArray8, doubleArray15, doubleArray22 };
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray23);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset24);
        java.lang.Class<?> wildcardClass26 = range25.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray23 = new java.lang.Comparable[] { 1.0f, 1.0f, 20.0d };
        double[] doubleArray31 = new double[] { 100.0d };
        double[] doubleArray33 = new double[] { 100.0d };
        double[][] doubleArray34 = new double[][] { doubleArray31, doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray23, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray23);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 10, (double) (-1.0f), (int) 'a', (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0.0d + "'", number15, 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0.0f, (double) (-1L), (int) '4', (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 10, (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset20, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(pieDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass21 = range20.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset14);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14);
        org.jfree.data.KeyToGroupMap keyToGroupMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14, keyToGroupMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(range16);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset11);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 1.0d + "'", number21, 1.0d);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0.0d + "'", number14, 0.0d);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset14);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset14, false);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 0, (double) (short) 0, 100, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 100);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Class<?> wildcardClass20 = categoryDataset9.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset14, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset14, (int) '4');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset14, (int) '4');
        double double21 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset20);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) '#');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        double double20 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) 100.0f, (int) (byte) 10, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        java.util.List list22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1.0d + "'", number19, 1.0d);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        boolean boolean15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset13);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset13);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset19, list20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.0d + "'", double16 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertNotNull(categoryDataset19);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset18);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset18);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset18, true);
        java.lang.Class<?> wildcardClass23 = categoryDataset18.getClass();
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 10, (double) (byte) 1, (int) (short) 0, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (-1));
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset12);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, comparable14, (double) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.KeyToGroupMap keyToGroupMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15, keyToGroupMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset27, true);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset27, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 32.0d + "'", number30, 32.0d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 192.0d, (double) 0.0f, (int) (byte) -1, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset9, list14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 20.0d + "'", number13, 20.0d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) -1);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset3 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) (-1.0d), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset13);
        java.util.List list16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset15, list16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (-1.0f), (double) 0.0f, 0, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] { numberArray4, numberArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset14);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset14);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 32.0d, (double) (short) 0, (-1));
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (-1), (double) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertArrayEquals(numberArray5, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset26);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        double double14 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset10);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 1.0d, (double) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset10);
        java.lang.Class<?> wildcardClass19 = pieDataset10.getClass();
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset14);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset14);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset14);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { "", 10.0f, 11.0d, (-1.0f), (-1.0f), 10.0d };
        double[] doubleArray18 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray25 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray32 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray33 = new double[][] { doubleArray18, doubleArray25, doubleArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray7, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5, 0.0d);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5, list10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (byte) -1, (double) 100, (int) (short) -1);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) 100.0f, (double) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(pieDataset15);
        org.junit.Assert.assertNotNull(pieDataset19);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) (byte) 1);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset27);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset27, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + (-1.0d) + "'", number30, (-1.0d));
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 20.0d + "'", number19, 20.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) '#');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, list19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 100, (double) (-1L), (int) (short) 0, (java.lang.Comparable) 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 100L, 11.0d, (int) (byte) -1, comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1.0d + "'", number19, 1.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 10.0f);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 10.0d, (double) (byte) -1, 0, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) (short) 1);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.KeyToGroupMap keyToGroupMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 20.0d + "'", number13, 20.0d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray10);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset12, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray32 = new double[] { 100.0d };
        double[] doubleArray34 = new double[] { 100.0d };
        double[][] doubleArray35 = new double[][] { doubleArray32, doubleArray34 };
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray35);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray22, comparableArray24, doubleArray35);
        double[] doubleArray52 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray59 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray66 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray67 = new double[][] { doubleArray52, doubleArray59, doubleArray66 };
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray67);
        org.jfree.data.category.CategoryDataset categoryDataset69 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray67);
        org.jfree.data.category.CategoryDataset categoryDataset70 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray67);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset71 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(comparableArray24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
        org.junit.Assert.assertNotNull(categoryDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d, 10.0d, 97.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(categoryDataset68);
        org.junit.Assert.assertNotNull(categoryDataset69);
        org.junit.Assert.assertNotNull(categoryDataset70);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset5, list7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, true);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset6);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset6, (java.lang.Comparable) 11.0d);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1L, (org.jfree.data.KeyedValues) pieDataset12);
        double double14 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset12);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10.0d + "'", number12, 10.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 10.0d + "'", number13, 10.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 'a', (double) 100L, (int) (short) 0, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 1, (-1.0d), (int) (byte) 0, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 10, (double) (byte) -1, (-1), (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Comparable[] comparableArray0 = null;
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray5, doubleArray16);
        double[] doubleArray26 = new double[] { 100.0d };
        double[] doubleArray28 = new double[] { 100.0d };
        double[][] doubleArray29 = new double[][] { doubleArray26, doubleArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray5, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11, (double) 1L);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray23 = new java.lang.Comparable[] { (byte) -1, (byte) 100, 10.0f };
        double[] doubleArray31 = new double[] { 100.0d };
        double[] doubleArray33 = new double[] { 100.0d };
        double[][] doubleArray34 = new double[][] { doubleArray31, doubleArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray34);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray23, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(comparableArray23);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(categoryDataset37);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(pieDataset17);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.Comparable comparable0 = null;
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable0, (org.jfree.data.KeyedValues) pieDataset14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 100, 10.0d, (int) (short) 10, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11, false);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0.0d + "'", number15, 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
    }
}

