package org.jfree.data.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (-1));
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset6, (int) '#');
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 1, (double) 100L, (int) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0f, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) (short) 0);
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
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
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
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) (byte) 1);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset27);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset27);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset27);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset27);
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + (-6.0d) + "'", number30, (-6.0d));
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + (-6.0d) + "'", number31, (-6.0d));
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (-6.0d) + "'", number32, (-6.0d));
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 10.0d + "'", number19, 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) "hi!", (double) 100);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 2.0d);
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
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0d + "'", number14, 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset9);
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset9);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) "hi!", (-6.0d));
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 10L, (double) 1);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset9);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset15);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15, 2.0d);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset15);
        org.jfree.data.KeyToGroupMap keyToGroupMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15, keyToGroupMap20);
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
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 20.0d + "'", number16, 20.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 10.0d + "'", number19, 10.0d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) true, (double) 0, 10);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) 100, (double) (short) -1, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) '#', (double) 1.0f, (-1));
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
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset26);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, 192.0d);
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
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] { numberArray4, numberArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset8, (int) (byte) 100);
        boolean boolean11 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset8);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset8);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertArrayEquals(numberArray5, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) 10.0f, (double) 100, 0);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (short) 10, (double) 1.0f);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) "hi!", (-1.0d));
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset15);
        org.junit.Assert.assertNotNull(pieDataset19);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pieDataset26);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray10, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray10, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, 0);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 1);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 0.0f);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, 97.0d);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(pieDataset19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertNull(range27);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) '4');
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
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
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 20.0d + "'", number20, 20.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 1.0d + "'", number23, 1.0d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (int) '#');
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (java.lang.Comparable) (short) 10);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset5, true);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset5);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset5);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset5);
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
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, (int) (byte) -1);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (java.lang.Comparable) 291.0d);
        java.util.List list25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset18, list25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
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
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertNotNull(pieDataset24);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) (byte) 1);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset27);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset27);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) (byte) -1);
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
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double[] doubleArray5 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray5, doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset27, true);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset27);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset27);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, 291.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 192.0d + "'", number31, 192.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset16);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset16);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 10.0f, (double) (short) -1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) 0L, 10);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) -1, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset27, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) 1, (double) (short) -1, (int) '4');
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 0, (org.jfree.data.KeyedValues) pieDataset29);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset34);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(pieDataset29);
        org.junit.Assert.assertNotNull(pieDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNull(range35);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) "hi!", (double) 100);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset14, (int) (short) 100);
        boolean boolean21 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset14);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset14);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset14, false);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset14);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset14);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertNull(range24);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray8);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, (int) (short) 0);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset11);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 291.0d, (-1.0d), (short) 0, 'a', 10, 100.0d };
        java.lang.Comparable[] comparableArray9 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray11 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray19 = new double[] { 100.0d };
        double[] doubleArray21 = new double[] { 100.0d };
        double[][] doubleArray22 = new double[][] { doubleArray19, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray9, comparableArray11, doubleArray22);
        double[] doubleArray34 = new double[] { 100.0d };
        double[] doubleArray36 = new double[] { 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray34, doubleArray36 };
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray37);
        org.jfree.data.category.CategoryDataset categoryDataset40 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray11, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray9);
        org.junit.Assert.assertNotNull(comparableArray11);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(categoryDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(categoryDataset40);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset6, (java.lang.Comparable) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0, (org.jfree.data.KeyedValues) pieDataset11);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset12);
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset12, list15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
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
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray30 = new double[][] { doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray30);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset33);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset33, true);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset33, false);
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray10, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset11);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset11, false);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset11);
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
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 20.0d + "'", number15, 20.0d);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (-1));
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 0.0d, (double) (short) 1, (int) (byte) 0);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset17);
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
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 11.0d, (org.jfree.data.KeyedValues) pieDataset17);
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
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) -1);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset19);
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
        org.junit.Assert.assertNotNull(pieDataset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 1.0d + "'", number15, 1.0d);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset5);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (java.lang.Comparable) (byte) -1);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset5);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset5);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertArrayEquals(numberArray3, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset11);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset11);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range25, false);
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
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 20.0d + "'", number24, 20.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 100, (double) (short) 10, 1, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 1);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset9);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        java.lang.Class<?> wildcardClass19 = range18.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(pieDataset14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 0.0d, (double) (byte) -1, 1, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, 0.0d);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 20.0d + "'", number13, 20.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(pieDataset11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 20.0d + "'", number17, 20.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 20.0d + "'", number18, 20.0d);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.Number[] numberArray8 = new java.lang.Number[] {};
        java.lang.Number[] numberArray9 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray8, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray10);
        java.lang.Class<?> wildcardClass15 = numberArray10.getClass();
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertArrayEquals(numberArray8, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertArrayEquals(numberArray9, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29, 2.0d);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range36, true);
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
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] { numberArray4, numberArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray6);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset7, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 'a', (org.jfree.data.KeyedValues) pieDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 32.0d, (org.jfree.data.KeyedValues) pieDataset10);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset12);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset12, (int) (short) -1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertArrayEquals(numberArray5, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNull(number13);
        org.junit.Assert.assertNotNull(pieDataset15);
    }
}

