package org.jfree.data.general;

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
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 10, (org.jfree.data.KeyedValues) pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset14", pieDataset12.equals(pieDataset14) ? pieDataset12.hashCode() == pieDataset14.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) '#', (double) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 1, (org.jfree.data.KeyedValues) pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset14", pieDataset12.equals(pieDataset14) ? pieDataset12.hashCode() == pieDataset14.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 'a', (org.jfree.data.KeyedValues) pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset14", pieDataset12.equals(pieDataset14) ? pieDataset12.hashCode() == pieDataset14.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 0L, (double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) "", (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        double double14 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10L, (double) (-1), 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 20.0d, 0.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10L, (double) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) (short) 0, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) 0L, (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) "", (double) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) "hi!", (double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset16", pieDataset12.equals(pieDataset16) ? pieDataset12.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), (double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset19, (java.lang.Comparable) '#', 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset19", pieDataset13.equals(pieDataset19) ? pieDataset13.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        double double20 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset19", pieDataset13.equals(pieDataset19) ? pieDataset13.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10L, (double) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) "", (double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray14 = new double[] { 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray12, doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray4, doubleArray15);
        java.lang.Comparable[] comparableArray21 = new java.lang.Comparable[] { 10 };
        java.lang.Comparable[] comparableArray24 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray26 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray34 = new double[] { 100.0d };
        double[] doubleArray36 = new double[] { 100.0d };
        double[][] doubleArray37 = new double[][] { doubleArray34, doubleArray36 };
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray37);
        org.jfree.data.category.CategoryDataset categoryDataset40 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray37);
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray24, comparableArray26, doubleArray37);
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray21, doubleArray37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset38", categoryDataset16.equals(categoryDataset38) ? categoryDataset16.hashCode() == categoryDataset38.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10L, (double) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) '4', (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset19", pieDataset13.equals(pieDataset19) ? pieDataset13.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 100.0f, (double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10L, (double) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 1, (double) (short) 10, 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-6.0d), 0.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset20", categoryDataset19.equals(categoryDataset20) ? categoryDataset19.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (short) 0, (double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset14", categoryDataset13.equals(categoryDataset14) ? categoryDataset13.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset20", pieDataset14.equals(pieDataset20) ? pieDataset14.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (-1.0d), 1.0d);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10, true);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset10);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (int) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset21", pieDataset12.equals(pieDataset21) ? pieDataset12.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset24", categoryDataset20.equals(categoryDataset24) ? categoryDataset20.hashCode() == categoryDataset24.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray48);
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) (byte) 1, (double) (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset20", pieDataset11.equals(pieDataset20) ? pieDataset11.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        java.lang.Class<?> wildcardClass14 = doubleArray10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset13", categoryDataset11.equals(categoryDataset13) ? categoryDataset11.hashCode() == categoryDataset13.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 100.0f, (double) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset24", pieDataset14.equals(pieDataset24) ? pieDataset14.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (int) (short) 0);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (byte) 1, 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1L, (org.jfree.data.KeyedValues) pieDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset19", pieDataset15.equals(pieDataset19) ? pieDataset15.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset20", categoryDataset19.equals(categoryDataset20) ? categoryDataset19.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset14", categoryDataset13.equals(categoryDataset14) ? categoryDataset13.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 0);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset20", pieDataset11.equals(pieDataset20) ? pieDataset11.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset15, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset14", categoryDataset13.equals(categoryDataset14) ? categoryDataset13.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) "hi!", (double) (-1), (int) (byte) 1);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset21", pieDataset14.equals(pieDataset21) ? pieDataset14.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 0L, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (byte) 1, 0.0d);
        java.lang.Class<?> wildcardClass19 = pieDataset18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset18", pieDataset14.equals(pieDataset18) ? pieDataset14.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (byte) 1, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) ' ', (double) 0, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset18", pieDataset14.equals(pieDataset18) ? pieDataset14.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        double[] doubleArray14 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray21 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray28 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset32", categoryDataset30.equals(categoryDataset32) ? categoryDataset30.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset20", categoryDataset18.equals(categoryDataset20) ? categoryDataset18.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        double[] doubleArray47 = new double[] { 100.0d };
        double[] doubleArray49 = new double[] { 100.0d };
        double[][] doubleArray50 = new double[][] { doubleArray47, doubleArray49 };
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset19, (java.lang.Comparable) 10L, (double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset19", pieDataset11.equals(pieDataset19) ? pieDataset11.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset20", pieDataset14.equals(pieDataset20) ? pieDataset14.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        double[] doubleArray12 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray26 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray27 = new double[][] { doubleArray12, doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        double[] doubleArray47 = new double[] { 100.0d };
        double[] doubleArray49 = new double[] { 100.0d };
        double[][] doubleArray50 = new double[][] { doubleArray47, doubleArray49 };
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset18", categoryDataset15.equals(categoryDataset18) ? categoryDataset15.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (byte) 1, 0.0d);
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset18", pieDataset14.equals(pieDataset18) ? pieDataset14.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset19, (java.lang.Comparable) 1.0d, (double) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset19", pieDataset13.equals(pieDataset19) ? pieDataset13.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset20", categoryDataset17.equals(categoryDataset20) ? categoryDataset17.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset27, (double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset27", categoryDataset26.equals(categoryDataset27) ? categoryDataset26.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (-1.0d), (double) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 10L, (double) 10L, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 0, (double) 10, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) true, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset20", categoryDataset17.equals(categoryDataset20) ? categoryDataset17.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) 10.0d, (double) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) 0L, (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset19", pieDataset15.equals(pieDataset19) ? pieDataset15.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) "hi!", (double) (-1), (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 1.0f, (-1.0d), (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset21", pieDataset14.equals(pieDataset21) ? pieDataset14.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray30 = new double[][] { doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset32", categoryDataset31.equals(categoryDataset32) ? categoryDataset31.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset19", pieDataset11.equals(pieDataset19) ? pieDataset11.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) '#');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) ' ', (double) 0L, (int) (byte) 1);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset23", pieDataset18.equals(pieDataset23) ? pieDataset18.hashCode() == pieDataset23.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset18", categoryDataset15.equals(categoryDataset18) ? categoryDataset15.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = categoryDataset9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = categoryDataset9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) -1, (double) '4');
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) -1, (double) (-1));
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1.0f), (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset21", pieDataset12.equals(pieDataset21) ? pieDataset12.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray18 = new java.lang.Number[][] { numberArray14, numberArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset23", categoryDataset19.equals(categoryDataset23) ? categoryDataset19.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset25", categoryDataset20.equals(categoryDataset25) ? categoryDataset20.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) 97.0d, 100.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        double double12 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1L), (double) 0L, (-1));
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (-6.0d), (double) (short) -1);
        double double20 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) "", 0.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset18, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (int) (short) 0);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset10, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset19", pieDataset12.equals(pieDataset19) ? pieDataset12.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        double double23 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset22", pieDataset18.equals(pieDataset22) ? pieDataset18.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) '#');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) ' ', (double) 0L, (int) (byte) 1);
        double double24 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset23", pieDataset18.equals(pieDataset23) ? pieDataset18.hashCode() == pieDataset23.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset9 and categoryDataset10", categoryDataset9.equals(categoryDataset10) ? categoryDataset9.hashCode() == categoryDataset10.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray30 = new double[][] { doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset32", categoryDataset31.equals(categoryDataset32) ? categoryDataset31.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        double[] doubleArray47 = new double[] { 100.0d };
        double[] doubleArray49 = new double[] { 100.0d };
        double[][] doubleArray50 = new double[][] { doubleArray47, doubleArray49 };
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset52 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray50);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        java.lang.Class<?> wildcardClass16 = numberArray12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (short) -1, 32.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset19", pieDataset15.equals(pieDataset19) ? pieDataset15.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset27", categoryDataset22.equals(categoryDataset27) ? categoryDataset22.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset25", categoryDataset24.equals(categoryDataset25) ? categoryDataset24.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 100.0d, (double) (byte) 0, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset19, (java.lang.Comparable) 100.0f, (double) 1.0f, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset19", pieDataset13.equals(pieDataset19) ? pieDataset13.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset30, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset30", categoryDataset29.equals(categoryDataset30) ? categoryDataset29.hashCode() == categoryDataset30.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset30", categoryDataset29.equals(categoryDataset30) ? categoryDataset29.hashCode() == categoryDataset30.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10L, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) -1, 10.0d, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (short) 10, (double) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset26", pieDataset22.equals(pieDataset26) ? pieDataset22.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset20", categoryDataset18.equals(categoryDataset20) ? categoryDataset18.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 100, (double) 'a', (int) (byte) 10);
        double double21 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        double double13 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (-1L), (double) 0L, (-1));
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) (-6.0d), (double) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1.0d, (org.jfree.data.KeyedValues) pieDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset17 and pieDataset20", pieDataset17.equals(pieDataset20) ? pieDataset17.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        boolean boolean13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (int) (short) 0);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (byte) 1, 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 20.0d, (org.jfree.data.KeyedValues) pieDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset19", pieDataset15.equals(pieDataset19) ? pieDataset15.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset20", categoryDataset18.equals(categoryDataset20) ? categoryDataset18.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray18 = new java.lang.Number[][] { numberArray14, numberArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset23", categoryDataset19.equals(categoryDataset23) ? categoryDataset19.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (byte) -1, (double) 0L);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        java.lang.Class<?> wildcardClass28 = categoryDataset27.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset27", categoryDataset26.equals(categoryDataset27) ? categoryDataset26.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) false, (double) (short) 0, 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset22", pieDataset18.equals(pieDataset22) ? pieDataset18.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 100, (double) 'a', (int) (byte) 10);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) (-1.0f), (double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset24", categoryDataset20.equals(categoryDataset24) ? categoryDataset20.hashCode() == categoryDataset24.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 100, (double) 'a', (int) (byte) 10);
        double double21 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10L, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) '4', (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 'a', 97.0d, 10);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10.0d, (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset29", pieDataset13.equals(pieDataset29) ? pieDataset13.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10, true);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset10);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset10);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10, true);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '#', (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset23", pieDataset12.equals(pieDataset23) ? pieDataset12.hashCode() == pieDataset23.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) "hi!", (double) 100);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (short) -1, (double) (byte) 1);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset23);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 192.0d, (double) (-1.0f), 100);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset31", pieDataset23.equals(pieDataset31) ? pieDataset23.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        double[] doubleArray14 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray21 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray28 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray29);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset32 and categoryDataset33", categoryDataset32.equals(categoryDataset33) ? categoryDataset32.hashCode() == categoryDataset33.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray30 = new double[][] { doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset32", categoryDataset31.equals(categoryDataset32) ? categoryDataset31.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset17", pieDataset11.equals(pieDataset17) ? pieDataset11.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        double[] doubleArray12 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray26 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray27 = new double[][] { doubleArray12, doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset27", categoryDataset26.equals(categoryDataset27) ? categoryDataset26.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset25", categoryDataset20.equals(categoryDataset25) ? categoryDataset20.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 10.0f, (double) 10.0f, (int) '4');
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10, (double) '#');
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset18);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) ' ', (double) 0L, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) 1L, (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset23", pieDataset18.equals(pieDataset23) ? pieDataset18.hashCode() == pieDataset23.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset27", categoryDataset22.equals(categoryDataset27) ? categoryDataset22.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (-1.0d), 1.0d);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) false, (double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) '4', (double) (-1), (int) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-6.0d), (org.jfree.data.KeyedValues) pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset16", pieDataset12.equals(pieDataset16) ? pieDataset12.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) '#', (double) 0.0f, (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (-1.0d), 0.0d, 0);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 32.0d, (double) 0L, (int) (byte) 10);
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        java.lang.Class<?> wildcardClass23 = pieDataset18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset22", pieDataset18.equals(pieDataset22) ? pieDataset18.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10L, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) -1, 10.0d, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (short) 100, 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset26", pieDataset22.equals(pieDataset26) ? pieDataset22.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) '4', (double) 100.0f);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset13, (double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset13", categoryDataset12.equals(categoryDataset13) ? categoryDataset12.hashCode() == categoryDataset13.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 10.0f, (double) 10.0f, (int) '4');
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] { numberArray4, numberArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 0L, (double) 100L);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 1L, 1.0d, (-1));
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 1.0f, (double) (-1), (int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1), (org.jfree.data.KeyedValues) pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset26", pieDataset22.equals(pieDataset26) ? pieDataset22.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset25", categoryDataset24.equals(categoryDataset25) ? categoryDataset24.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) "hi!", (double) (-1), (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 32.0d, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset21", pieDataset14.equals(pieDataset21) ? pieDataset14.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset18", categoryDataset17.equals(categoryDataset18) ? categoryDataset17.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        double[] doubleArray16 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray23 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray30 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray31 = new double[][] { doubleArray16, doubleArray23, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) '4', (double) 100.0f);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 10.0f, (double) (byte) 0, 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        double[] doubleArray16 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray23 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray30 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray31 = new double[][] { doubleArray16, doubleArray23, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 10.0d, 1 };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[] doubleArray17 = new double[] { 100.0d };
        double[][] doubleArray18 = new double[][] { doubleArray15, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray7, doubleArray18);
        java.lang.Comparable[] comparableArray27 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray29 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray37 = new double[] { 100.0d };
        double[] doubleArray39 = new double[] { 100.0d };
        double[][] doubleArray40 = new double[][] { doubleArray37, doubleArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray27, comparableArray29, doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray7, doubleArray40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset41", categoryDataset19.equals(categoryDataset41) ? categoryDataset19.hashCode() == categoryDataset41.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) (byte) 10, (double) '4', (int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset17", pieDataset11.equals(pieDataset17) ? pieDataset11.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 10L, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) false, (double) 0.0f, (int) (short) 1);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset26", pieDataset13.equals(pieDataset26) ? pieDataset13.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        double[] doubleArray12 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray26 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray27 = new double[][] { doubleArray12, doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        java.lang.Class<?> wildcardClass31 = categoryDataset30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset30", categoryDataset28.equals(categoryDataset30) ? categoryDataset28.hashCode() == categoryDataset30.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 10L, (double) 10L, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) 97.0d, 20.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset21", categoryDataset20.equals(categoryDataset21) ? categoryDataset20.hashCode() == categoryDataset21.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray7 = new java.lang.Number[][] { numberArray5, numberArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset8);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset8, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset15);
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) '#', (double) 0.0f, (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (-1.0d), 0.0d, 0);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 32.0d, (double) 0L, (int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0d, (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset10);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset10, false);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) 10L, (double) 10L, (int) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1), (org.jfree.data.KeyedValues) pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset17 and pieDataset21", pieDataset17.equals(pieDataset21) ? pieDataset17.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) (-1.0d), 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) true, (org.jfree.data.KeyedValues) pieDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset17 and pieDataset20", pieDataset17.equals(pieDataset20) ? pieDataset17.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset17", pieDataset11.equals(pieDataset17) ? pieDataset11.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 0.0f, 10.0d };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[] doubleArray17 = new double[] { 100.0d };
        double[][] doubleArray18 = new double[][] { doubleArray15, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray7, doubleArray18);
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
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray7, doubleArray42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset43", categoryDataset19.equals(categoryDataset43) ? categoryDataset19.hashCode() == categoryDataset43.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset13, 0);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) 10, (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (short) -1, 0.0d, 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-6.0d), (org.jfree.data.KeyedValues) pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset25", pieDataset15.equals(pieDataset25) ? pieDataset15.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset27", categoryDataset26.equals(categoryDataset27) ? categoryDataset26.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset14);
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        double double18 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 10L, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) '4', (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 'a', 97.0d, 10);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset30", pieDataset14.equals(pieDataset30) ? pieDataset14.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        double[] doubleArray10 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray17 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray24 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray25 = new double[][] { doubleArray10, doubleArray17, doubleArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray25);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset27", categoryDataset26.equals(categoryDataset27) ? categoryDataset26.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        double[] doubleArray12 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray26 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray27 = new double[][] { doubleArray12, doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset9 and categoryDataset10", categoryDataset9.equals(categoryDataset10) ? categoryDataset9.hashCode() == categoryDataset10.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset15, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) 100.0d, 200.0d, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset17", pieDataset13.equals(pieDataset17) ? pieDataset13.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset21", categoryDataset20.equals(categoryDataset21) ? categoryDataset20.hashCode() == categoryDataset21.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 10, (-1.0d), 10);
        boolean boolean21 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset20", pieDataset12.equals(pieDataset20) ? pieDataset12.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 10, (-1.0d), 10);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 10, (org.jfree.data.KeyedValues) pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset21", pieDataset13.equals(pieDataset21) ? pieDataset13.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        double[] doubleArray16 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray23 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray30 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray31 = new double[][] { doubleArray16, doubleArray23, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset13", categoryDataset12.equals(categoryDataset13) ? categoryDataset12.hashCode() == categoryDataset13.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset13", pieDataset11.equals(pieDataset13) ? pieDataset11.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 1);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset19", pieDataset11.equals(pieDataset19) ? pieDataset11.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray13 = new java.lang.Number[][] { numberArray9, numberArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray13);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset14, 0);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 2.0d, (org.jfree.data.KeyedValues) pieDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset16);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset21", categoryDataset19.equals(categoryDataset21) ? categoryDataset19.hashCode() == categoryDataset21.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        double double12 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1L), (double) 0L, (-1));
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (-6.0d), (double) (short) -1);
        java.lang.Class<?> wildcardClass20 = pieDataset19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset15, (int) (short) 0);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset17", pieDataset13.equals(pieDataset17) ? pieDataset13.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (byte) -1, (double) 0L);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset15", pieDataset11.equals(pieDataset15) ? pieDataset11.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset22 and categoryDataset27", categoryDataset22.equals(categoryDataset27) ? categoryDataset22.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 1);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset25", categoryDataset24.equals(categoryDataset25) ? categoryDataset24.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset16", categoryDataset15.equals(categoryDataset16) ? categoryDataset15.hashCode() == categoryDataset16.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        double[] doubleArray12 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray26 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray27 = new double[][] { doubleArray12, doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset20", categoryDataset17.equals(categoryDataset20) ? categoryDataset17.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        double[] doubleArray16 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray23 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray30 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray31 = new double[][] { doubleArray16, doubleArray23, doubleArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray16 = new double[] { 100.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[][] doubleArray19 = new double[][] { doubleArray16, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset25", categoryDataset24.equals(categoryDataset25) ? categoryDataset24.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 100, (double) 'a', (int) (byte) 10);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) false, 1.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset21", categoryDataset20.equals(categoryDataset21) ? categoryDataset20.hashCode() == categoryDataset21.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset13, 0);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) 10, (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (byte) 0, 11.0d, 10);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 2.0d, (org.jfree.data.KeyedValues) pieDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset25", pieDataset15.equals(pieDataset25) ? pieDataset15.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset10);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset10, false);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0f, (org.jfree.data.KeyedValues) pieDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset18", pieDataset12.equals(pieDataset18) ? pieDataset12.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        double[] doubleArray13 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        double[][] doubleArray16 = new double[][] { doubleArray13, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset21", categoryDataset20.equals(categoryDataset21) ? categoryDataset20.hashCode() == categoryDataset21.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        double[] doubleArray7 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { 100.0d };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset13", categoryDataset11.equals(categoryDataset13) ? categoryDataset11.hashCode() == categoryDataset13.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        boolean boolean13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0, (org.jfree.data.KeyedValues) pieDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        java.lang.Comparable[] comparableArray44 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray46 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray54 = new double[] { 100.0d };
        double[] doubleArray56 = new double[] { 100.0d };
        double[][] doubleArray57 = new double[][] { doubleArray54, doubleArray56 };
        org.jfree.data.category.CategoryDataset categoryDataset58 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray57);
        org.jfree.data.category.CategoryDataset categoryDataset59 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray57);
        org.jfree.data.category.CategoryDataset categoryDataset60 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray57);
        org.jfree.data.category.CategoryDataset categoryDataset61 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray44, comparableArray46, doubleArray57);
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray57);
        org.jfree.data.category.CategoryDataset categoryDataset63 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 10, (org.jfree.data.KeyedValues) pieDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset14", pieDataset12.equals(pieDataset14) ? pieDataset12.hashCode() == pieDataset14.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset27", categoryDataset24.equals(categoryDataset27) ? categoryDataset24.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray8, numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset19", categoryDataset18.equals(categoryDataset19) ? categoryDataset18.hashCode() == categoryDataset19.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) "hi!", (double) (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = pieDataset21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset21", pieDataset14.equals(pieDataset21) ? pieDataset14.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 100, (double) 'a', (int) (byte) 10);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) (byte) 100, 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) '4', (double) 100.0f);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 1, 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset19", pieDataset16.equals(pieDataset19) ? pieDataset16.hashCode() == pieDataset19.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (byte) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset21", pieDataset11.equals(pieDataset21) ? pieDataset11.hashCode() == pieDataset21.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 0.0f, 97.0d, 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset24", pieDataset14.equals(pieDataset24) ? pieDataset14.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray3, numberArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset6);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 0L, (double) 100L);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 1L, 1.0d, (-1));
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 1.0f, (double) (-1), (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) '4', (double) (-1.0f), (int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.lang.Number[] numberArray5 = new java.lang.Number[] {};
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray7 = new java.lang.Number[][] { numberArray5, numberArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset8);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset8);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset8, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10, (double) (-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset15);
        double double17 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset15);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) '#', (double) 0.0f, (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, (java.lang.Comparable) (-1.0d), 0.0d, 0);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 32.0d, (double) 0L, (int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 11.0d, (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray31 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray7, numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) 10, (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset14);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset14, (java.lang.Comparable) (byte) 0, 11.0d, 10);
        java.lang.Class<?> wildcardClass25 = pieDataset24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset24", pieDataset14.equals(pieDataset24) ? pieDataset14.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset18", categoryDataset17.equals(categoryDataset18) ? categoryDataset17.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        java.lang.Comparable[] comparableArray46 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray48 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray56 = new double[] { 100.0d };
        double[] doubleArray58 = new double[] { 100.0d };
        double[][] doubleArray59 = new double[][] { doubleArray56, doubleArray58 };
        org.jfree.data.category.CategoryDataset categoryDataset60 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray59);
        org.jfree.data.category.CategoryDataset categoryDataset61 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray59);
        org.jfree.data.category.CategoryDataset categoryDataset62 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray59);
        org.jfree.data.category.CategoryDataset categoryDataset63 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray46, comparableArray48, doubleArray59);
        org.jfree.data.category.CategoryDataset categoryDataset64 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray59);
        org.jfree.data.category.CategoryDataset categoryDataset65 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray59);
        org.jfree.data.category.CategoryDataset categoryDataset66 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) 1L);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset18", pieDataset11.equals(pieDataset18) ? pieDataset11.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        double[] doubleArray14 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray21 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray28 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray29);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset33", categoryDataset31.equals(categoryDataset33) ? categoryDataset31.hashCode() == categoryDataset33.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        double[] doubleArray14 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray21 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[] doubleArray28 = new double[] { 1L, 10.0d, 'a', (byte) 10, '#', 1L };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset32", categoryDataset30.equals(categoryDataset32) ? categoryDataset30.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset27", categoryDataset24.equals(categoryDataset27) ? categoryDataset24.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray14);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset18", categoryDataset17.equals(categoryDataset18) ? categoryDataset17.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100.0d, (-1) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1.0d };
        double[] doubleArray18 = new double[] { 100.0d };
        double[] doubleArray20 = new double[] { 100.0d };
        double[][] doubleArray21 = new double[][] { doubleArray18, doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray8, comparableArray10, doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset27", categoryDataset26.equals(categoryDataset27) ? categoryDataset26.hashCode() == categoryDataset27.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset19, 291.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset19", categoryDataset17.equals(categoryDataset19) ? categoryDataset17.hashCode() == categoryDataset19.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) 20.0d, (double) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset22", pieDataset18.equals(pieDataset22) ? pieDataset18.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset9 and categoryDataset10", categoryDataset9.equals(categoryDataset10) ? categoryDataset9.hashCode() == categoryDataset10.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, (double) (-1L));
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 0);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, 0);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset18", pieDataset15.equals(pieDataset18) ? pieDataset15.hashCode() == pieDataset18.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, false);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) 10L, (double) 10L, (int) (short) 10);
        double double21 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset16 and pieDataset20", pieDataset16.equals(pieDataset20) ? pieDataset16.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        boolean boolean12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset11);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) (-1), 100.0d, (int) 'a');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset11, (java.lang.Comparable) '#', (double) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset16", pieDataset11.equals(pieDataset16) ? pieDataset11.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) "hi!", (double) 100);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) -1, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100.0d, 100.0d);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset25", pieDataset22.equals(pieDataset25) ? pieDataset22.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray12, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset20", categoryDataset17.equals(categoryDataset20) ? categoryDataset17.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        double[] doubleArray7 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray11 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray15 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray19 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray23 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray27 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray28 = new double[][] { doubleArray7, doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray28);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset30, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset30", categoryDataset29.equals(categoryDataset30) ? categoryDataset29.hashCode() == categoryDataset30.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        double double15 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 10, 100.0d);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) "", (-6.0d), (int) (byte) 0);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, 20.0d, 0);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) '4', (int) '4');
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 11.0d, (double) '#', 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray18 = new java.lang.Number[][] { numberArray14, numberArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset23", categoryDataset20.equals(categoryDataset23) ? categoryDataset20.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray14);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset19", categoryDataset18.equals(categoryDataset19) ? categoryDataset18.hashCode() == categoryDataset19.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, 0);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 11.0d, (double) 10L);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset27", pieDataset24.equals(pieDataset27) ? pieDataset24.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) 10, 0.0f, 0.0d, (-1.0f), (-1), (-1.0d) };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) 10, 0.0f, 0.0d, (-1.0f), (-1), (-1.0d) };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) 10, 0.0f, 0.0d, (-1.0f), (-1), (-1.0d) };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) 10, 0.0f, 0.0d, (-1.0f), (-1), (-1.0d) };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray14, numberArray21, numberArray28, numberArray35 };
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray36);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray36);
        org.jfree.data.category.CategoryDataset categoryDataset40 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset38 and categoryDataset39", categoryDataset38.equals(categoryDataset39) ? categoryDataset38.hashCode() == categoryDataset39.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 2.0d, 20.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset22", pieDataset11.equals(pieDataset22) ? pieDataset11.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 100.0d };
        double[][] doubleArray8 = new double[][] { doubleArray5, doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        boolean boolean11 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset9 and categoryDataset10", categoryDataset9.equals(categoryDataset10) ? categoryDataset9.hashCode() == categoryDataset10.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray6, numberArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset11, 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 1, (double) 100);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (short) 100, (double) '#', (int) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1.0d, (org.jfree.data.KeyedValues) pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset24", pieDataset13.equals(pieDataset24) ? pieDataset13.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        java.lang.Class<?> wildcardClass25 = pieDataset14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset14 and pieDataset24", pieDataset14.equals(pieDataset24) ? pieDataset14.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray18 = new java.lang.Number[][] { numberArray14, numberArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset20 and categoryDataset23", categoryDataset20.equals(categoryDataset23) ? categoryDataset20.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray5, numberArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset12);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10L, (double) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) 97.0d, (double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset17", pieDataset12.equals(pieDataset17) ? pieDataset12.hashCode() == pieDataset17.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset18", categoryDataset15.equals(categoryDataset18) ? categoryDataset15.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray12);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset16", categoryDataset13.equals(categoryDataset16) ? categoryDataset13.hashCode() == categoryDataset16.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray4, numberArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray8);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset9, true);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 1);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset20", pieDataset11.equals(pieDataset20) ? pieDataset11.hashCode() == pieDataset20.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, 1);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset11 and pieDataset28", pieDataset11.equals(pieDataset28) ? pieDataset11.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) 1.0d, (double) 0, (int) '4');
        double double24 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset23", pieDataset13.equals(pieDataset23) ? pieDataset13.hashCode() == pieDataset23.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        java.lang.Class<?> wildcardClass27 = pieDataset22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset26", pieDataset22.equals(pieDataset26) ? pieDataset22.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        double[] doubleArray9 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray13 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray17 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray25 = new double[] { 1.0d, (-1), ' ' };
        double[] doubleArray29 = new double[] { 1.0d, (-1), ' ' };
        double[][] doubleArray30 = new double[][] { doubleArray9, doubleArray13, doubleArray17, doubleArray21, doubleArray25, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray30);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset33, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset33", categoryDataset31.equals(categoryDataset33) ? categoryDataset31.hashCode() == categoryDataset33.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray52);
        org.jfree.data.category.CategoryDataset categoryDataset57 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray24, doubleArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset36", categoryDataset16.equals(categoryDataset36) ? categoryDataset16.hashCode() == categoryDataset36.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 10, 1.0f };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset15, 0);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100L, (org.jfree.data.KeyedValues) pieDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 2.0d, (org.jfree.data.KeyedValues) pieDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 20.0d, (org.jfree.data.KeyedValues) pieDataset17);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) (short) 10, 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 192.0d, (org.jfree.data.KeyedValues) pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset17 and pieDataset25", pieDataset17.equals(pieDataset25) ? pieDataset17.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) 10, 0L, 1.0f, 10L, 1.0f };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray11 };
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray12);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset15", categoryDataset14.equals(categoryDataset15) ? categoryDataset14.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray11, doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset18", categoryDataset17.equals(categoryDataset18) ? categoryDataset17.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.Number[] numberArray2 = new java.lang.Number[] {};
        java.lang.Number[] numberArray3 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray4 = new java.lang.Number[][] { numberArray2, numberArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset5, (java.lang.Comparable) "");
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset8, (java.lang.Comparable) 100.0f, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset8, (java.lang.Comparable) 1.0d, (double) 100.0f, (-1));
        java.lang.Comparable comparable16 = null;
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset15, comparable16, (double) (-1), 1);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset15 and pieDataset19", pieDataset15.equals(pieDataset19) ? pieDataset15.hashCode() == pieDataset19.hashCode() : true);
    }
}

