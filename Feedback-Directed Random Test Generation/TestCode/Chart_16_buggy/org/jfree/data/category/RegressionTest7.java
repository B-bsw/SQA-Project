package org.jfree.data.category;

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
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent20 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = defaultIntervalCategoryDataset13.indexOf((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray15 = new java.lang.Number[][] { numberArray8, numberArray10, numberArray12, numberArray14 };
        java.lang.Number[][] numberArray16 = null;
        java.lang.Number[] numberArray17 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray18 = new java.lang.Number[][] { numberArray17 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset19 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray16, numberArray18);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset20 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray15, numberArray16);
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray31 = new java.lang.Number[][] { numberArray25, numberArray30 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray16, numberArray31);
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray41 = new java.lang.Number[][] { numberArray34, numberArray36, numberArray38, numberArray40 };
        java.lang.Number[][] numberArray42 = null;
        java.lang.Number[] numberArray43 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray43 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset45 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray42, numberArray44);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset46 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray41, numberArray42);
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray57 = new java.lang.Number[][] { numberArray51, numberArray56 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset58 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray42, numberArray57);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset59 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray6, numberArray31, numberArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertArrayEquals(numberArray17, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertArrayEquals(numberArray43, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray56);
        org.junit.Assert.assertNotNull(numberArray57);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        java.util.List list8 = defaultIntervalCategoryDataset3.getColumnKeys();
        int int9 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list10 = defaultIntervalCategoryDataset3.getColumnKeys();
        defaultIntervalCategoryDataset3.validateObject();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray15, numberArray17, numberArray19, numberArray21 };
        java.lang.Number[][] numberArray23 = null;
        java.lang.Number[] numberArray24 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray24 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset26 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray23, numberArray25);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray22, numberArray23);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset28 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray12, numberArray13, numberArray22);
        defaultIntervalCategoryDataset3.setSeriesKeys((java.lang.Comparable[]) strArray12);
        java.lang.Class<?> wildcardClass30 = strArray12.getClass();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertArrayEquals(numberArray24, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.lang.String[] strArray0 = null;
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 0L };
        java.lang.Number[] numberArray4 = new java.lang.Number[] { 0L };
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 0L };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 0L };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray4, numberArray6, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray11 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray10, numberArray12);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset14 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray0, numberArray9, numberArray10);
        defaultIntervalCategoryDataset14.validateObject();
        defaultIntervalCategoryDataset14.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultIntervalCategoryDataset14.getStartValue((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): category index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        defaultIntervalCategoryDataset13.validateObject();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent16);
        int int18 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset13.getGroup();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list5 = defaultIntervalCategoryDataset3.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        java.util.List list9 = defaultIntervalCategoryDataset3.getRowKeys();
        int int11 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray16, numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray20);
        defaultIntervalCategoryDataset21.validateObject();
        int int23 = defaultIntervalCategoryDataset21.getCategoryCount();
        defaultIntervalCategoryDataset21.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultIntervalCategoryDataset21.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultIntervalCategoryDataset21.addChangeListener(datasetChangeListener26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset21.removeChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultIntervalCategoryDataset21.getGroup();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(datasetGroup25);
        org.junit.Assert.assertNotNull(datasetGroup30);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray16, numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray20);
        defaultIntervalCategoryDataset21.validateObject();
        int int23 = defaultIntervalCategoryDataset21.getCategoryCount();
        java.util.List list24 = defaultIntervalCategoryDataset21.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = defaultIntervalCategoryDataset21.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        java.util.List list20 = defaultIntervalCategoryDataset13.getColumnKeys();
        int int21 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset13.getGroup();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(datasetGroup22);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.Number[][] numberArray6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.Number[][] numberArray8 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray17 = new java.lang.Number[][] { numberArray10, numberArray12, numberArray14, numberArray16 };
        java.lang.Number[][] numberArray18 = null;
        java.lang.Number[] numberArray19 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray18, numberArray20);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset22 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray17, numberArray18);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray7, numberArray8, numberArray17);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset24 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray5, numberArray6, numberArray8);
        int int25 = defaultIntervalCategoryDataset24.getCategoryCount();
        defaultIntervalCategoryDataset24.validateObject();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertArrayEquals(numberArray19, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int27 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultIntervalCategoryDataset25.getGroup();
        int int31 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultIntervalCategoryDataset25.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener33);
        defaultIntervalCategoryDataset25.validateObject();
        int int37 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(datasetGroup30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(datasetGroup32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        java.lang.Comparable[] comparableArray18 = new java.lang.Comparable[] { 0.0f };
        defaultIntervalCategoryDataset13.setCategoryKeys(comparableArray18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultIntervalCategoryDataset13.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultIntervalCategoryDataset13.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(comparableArray18);
        org.junit.Assert.assertNotNull(datasetGroup20);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray16, numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray20);
        defaultIntervalCategoryDataset21.validateObject();
        int int23 = defaultIntervalCategoryDataset21.getCategoryCount();
        defaultIntervalCategoryDataset21.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultIntervalCategoryDataset21.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultIntervalCategoryDataset21.removeChangeListener(datasetChangeListener26);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(datasetGroup25);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent5 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent5);
        java.util.List list7 = defaultIntervalCategoryDataset3.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent8 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent8);
        defaultIntervalCategoryDataset3.validateObject();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener14);
        defaultIntervalCategoryDataset13.validateObject();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent17 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent17);
        int int19 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent20 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent20);
        java.lang.Number[][] numberArray22 = null;
        java.lang.Number[] numberArray23 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray22, numberArray24);
        int int27 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent28 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent28);
        java.util.List list30 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int31 = defaultIntervalCategoryDataset25.getSeriesCount();
        java.util.List list32 = defaultIntervalCategoryDataset25.getColumnKeys();
        defaultIntervalCategoryDataset25.validateObject();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.lang.Number[][] numberArray35 = null;
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray37, numberArray39, numberArray41, numberArray43 };
        java.lang.Number[][] numberArray45 = null;
        java.lang.Number[] numberArray46 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray46 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray45, numberArray47);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset49 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray44, numberArray45);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset50 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray34, numberArray35, numberArray44);
        defaultIntervalCategoryDataset25.setSeriesKeys((java.lang.Comparable[]) strArray34);
        java.lang.Number[][] numberArray52 = new java.lang.Number[][] {};
        java.lang.Number[][] numberArray53 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset54 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray34, numberArray52, numberArray53);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset13.setSeriesKeys((java.lang.Comparable[]) strArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the data.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertArrayEquals(numberArray23, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertArrayEquals(numberArray46, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertArrayEquals(numberArray52, new java.lang.Number[][] {});
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray5, numberArray7, numberArray9, numberArray11 };
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray14 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray15 = new java.lang.Number[][] { numberArray14 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray13, numberArray15);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray12, numberArray13);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 0.0f };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 0.0f };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray19, numberArray21 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray13, numberArray22);
        defaultIntervalCategoryDataset23.validateObject();
        java.util.List list25 = defaultIntervalCategoryDataset23.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = defaultIntervalCategoryDataset23.getSeriesIndex((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertArrayEquals(numberArray14, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.Number[][] numberArray6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.Number[][] numberArray8 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray17 = new java.lang.Number[][] { numberArray10, numberArray12, numberArray14, numberArray16 };
        java.lang.Number[][] numberArray18 = null;
        java.lang.Number[] numberArray19 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray18, numberArray20);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset22 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray17, numberArray18);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray7, numberArray8, numberArray17);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset24 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray5, numberArray6, numberArray8);
        java.lang.Number[][] numberArray25 = null;
        java.lang.Number[][] numberArray26 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray5, numberArray25, numberArray26);
        java.lang.String[] strArray28 = null;
        java.lang.Number[][] numberArray29 = new java.lang.Number[][] {};
        java.lang.Number[][] numberArray30 = null;
        java.lang.Number[] numberArray31 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray31 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray30, numberArray32);
        java.lang.Number[][] numberArray34 = new java.lang.Number[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset35 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray30, numberArray34);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset36 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray28, numberArray29, numberArray34);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray45 = new java.lang.Number[][] { numberArray38, numberArray40, numberArray42, numberArray44 };
        java.lang.Number[][] numberArray46 = null;
        java.lang.Number[] numberArray47 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray48 = new java.lang.Number[][] { numberArray47 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset49 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray48);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset50 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray45, numberArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset51 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray5, numberArray34, numberArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertArrayEquals(numberArray19, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertArrayEquals(numberArray29, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertArrayEquals(numberArray31, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertArrayEquals(numberArray34, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertArrayEquals(numberArray47, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray48);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        boolean boolean15 = defaultIntervalCategoryDataset13.equals((java.lang.Object) (short) 0);
        int int16 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset13.getGroup();
        int int20 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.util.List list21 = defaultIntervalCategoryDataset13.getColumnKeys();
        java.lang.Class<?> wildcardClass22 = defaultIntervalCategoryDataset13.getClass();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        boolean boolean7 = defaultIntervalCategoryDataset3.equals((java.lang.Object) '#');
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultIntervalCategoryDataset3.getGroup();
        java.util.List list9 = defaultIntervalCategoryDataset3.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent10 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultIntervalCategoryDataset3.getSeriesKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No such series : 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent24 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset13.getGroup();
        int int27 = defaultIntervalCategoryDataset13.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultIntervalCategoryDataset13.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset13.getGroup();
        java.util.List list23 = defaultIntervalCategoryDataset13.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset13.setStartValue(0, (java.lang.Comparable) 0.0f, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int27 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultIntervalCategoryDataset25.getGroup();
        int int31 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener32);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset25.setEndValue((int) '#', (java.lang.Comparable) (-1.0d), (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(datasetGroup30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        int int26 = defaultIntervalCategoryDataset25.getCategoryCount();
        int int27 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.removeChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultIntervalCategoryDataset25.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultIntervalCategoryDataset25.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(datasetGroup30);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int27 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultIntervalCategoryDataset25.getGroup();
        int int31 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener32);
        int int35 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable37 = defaultIntervalCategoryDataset25.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(datasetGroup30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        int int20 = defaultIntervalCategoryDataset13.getCategoryCount();
        int int21 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener24);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray5, numberArray7, numberArray9, numberArray11 };
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray14 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray15 = new java.lang.Number[][] { numberArray14 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray13, numberArray15);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray12, numberArray13);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 0.0f };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 0.0f };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray19, numberArray21 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray13, numberArray22);
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[][] numberArray40 = new java.lang.Number[][] { numberArray27, numberArray31, numberArray35, numberArray39 };
        java.lang.Number[][] numberArray41 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray40, numberArray41);
        java.lang.Number[][] numberArray43 = null;
        java.lang.String[] strArray44 = null;
        java.lang.Number[][] numberArray45 = new java.lang.Number[][] {};
        java.lang.Number[][] numberArray46 = null;
        java.lang.Number[] numberArray47 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray48 = new java.lang.Number[][] { numberArray47 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset49 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray48);
        java.lang.Number[][] numberArray50 = new java.lang.Number[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset51 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray50);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset52 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray44, numberArray45, numberArray50);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset53 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray43, numberArray50);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset54 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray40, numberArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertArrayEquals(numberArray14, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertArrayEquals(numberArray45, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertArrayEquals(numberArray47, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertArrayEquals(numberArray50, new java.lang.Number[][] {});
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent20 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener22);
        java.util.List list24 = defaultIntervalCategoryDataset13.getRowKeys();
        int int25 = defaultIntervalCategoryDataset13.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = defaultIntervalCategoryDataset13.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        java.util.List list20 = defaultIntervalCategoryDataset13.getColumnKeys();
        int int21 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent22 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent22);
        int int24 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int25 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.util.List list26 = defaultIntervalCategoryDataset13.getRowKeys();
        java.lang.Class<?> wildcardClass27 = defaultIntervalCategoryDataset13.getClass();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent9 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener11);
        int int13 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) 1);
        java.util.List list16 = defaultIntervalCategoryDataset3.getRowKeys();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list5 = defaultIntervalCategoryDataset3.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        java.util.List list9 = defaultIntervalCategoryDataset3.getRowKeys();
        java.util.List list10 = defaultIntervalCategoryDataset3.getColumnKeys();
        int int11 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        java.lang.String[] strArray7 = null;
        java.lang.Number[] numberArray9 = new java.lang.Number[] { 0L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 0L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 0L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 0L };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray9, numberArray11, numberArray13, numberArray15 };
        java.lang.Number[][] numberArray17 = null;
        java.lang.Number[] numberArray18 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray19 = new java.lang.Number[][] { numberArray18 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset20 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray17, numberArray19);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray7, numberArray16, numberArray17);
        java.lang.Number[][] numberArray22 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray6, numberArray16, numberArray22);
        java.lang.String[] strArray24 = null;
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] {};
        java.lang.Number[][] numberArray26 = null;
        java.lang.Number[] numberArray27 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray27 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray26, numberArray28);
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset31 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray26, numberArray30);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray24, numberArray25, numberArray30);
        java.lang.Number[][] numberArray33 = null;
        java.lang.Number[] numberArray34 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray35 = new java.lang.Number[][] { numberArray34 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset36 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray33, numberArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset37 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray6, numberArray25, numberArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "", "", "" });
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertArrayEquals(numberArray18, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertArrayEquals(numberArray25, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertArrayEquals(numberArray27, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertArrayEquals(numberArray30, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertArrayEquals(numberArray34, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray35);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list5 = defaultIntervalCategoryDataset3.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        java.util.List list9 = defaultIntervalCategoryDataset3.getRowKeys();
        int int10 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultIntervalCategoryDataset3.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent12 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent12);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultIntervalCategoryDataset13.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = defaultIntervalCategoryDataset13.getCategoryIndex((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset25.getGroup();
        java.util.List list27 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.Number[][] numberArray1 = null;
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray3, numberArray5, numberArray7, numberArray9 };
        java.lang.Number[][] numberArray11 = null;
        java.lang.Number[] numberArray12 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray13 = new java.lang.Number[][] { numberArray12 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset14 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray11, numberArray13);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray10, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray0, numberArray1, numberArray10);
        java.util.List list17 = defaultIntervalCategoryDataset16.getColumnKeys();
        int int18 = defaultIntervalCategoryDataset16.getCategoryCount();
        java.util.List list19 = defaultIntervalCategoryDataset16.getColumnKeys();
        int int20 = defaultIntervalCategoryDataset16.getCategoryCount();
        java.util.List list21 = defaultIntervalCategoryDataset16.getRowKeys();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertArrayEquals(numberArray12, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener24);
        int int26 = defaultIntervalCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent28 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent28);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent30 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent30);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(datasetGroup27);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double[] doubleArray6 = new double[] { 'a', (byte) 1, 1L, 100.0d, (short) 100, '4' };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        double[][] doubleArray8 = new double[][] {};
        double[][] doubleArray9 = new double[][] {};
        double[][] doubleArray10 = new double[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray9, doubleArray10);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray8, doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, 1.0d, 1.0d, 100.0d, 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[][] {});
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[][] {});
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[][] {});
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray5, numberArray7, numberArray9, numberArray11 };
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray14 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray15 = new java.lang.Number[][] { numberArray14 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray13, numberArray15);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray12, numberArray13);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 0.0f };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 0.0f };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray19, numberArray21 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray13, numberArray22);
        int int24 = defaultIntervalCategoryDataset23.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultIntervalCategoryDataset23.getGroup();
        defaultIntervalCategoryDataset23.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = defaultIntervalCategoryDataset23.getCategoryIndex((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertArrayEquals(numberArray14, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(datasetGroup25);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent24 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset13.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultIntervalCategoryDataset13.getEndValue(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup26);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.Number[][] numberArray0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] {};
        java.lang.Number[][] numberArray3 = null;
        java.lang.Number[] numberArray4 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray5 = new java.lang.Number[][] { numberArray4 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset6 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray3, numberArray5);
        java.lang.Number[][] numberArray7 = new java.lang.Number[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray3, numberArray7);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray1, numberArray2, numberArray7);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray7);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset10.setEndValue((-1), (java.lang.Comparable) (-1.0f), (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertArrayEquals(numberArray4, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[][] {});
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int10 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 100.0f);
        java.util.List list11 = defaultIntervalCategoryDataset3.getColumnKeys();
        int int12 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list13 = defaultIntervalCategoryDataset3.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultIntervalCategoryDataset3.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        int int15 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int16 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.lang.Number number19 = defaultIntervalCategoryDataset13.getStartValue(2, (int) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener20);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (short) 1 + "'", number19, (short) 1);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        int int26 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent27 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener29);
        defaultIntervalCategoryDataset25.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultIntervalCategoryDataset25.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener27);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent29 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent29);
        java.util.List list31 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent32 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent32);
        java.util.List list34 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int35 = defaultIntervalCategoryDataset25.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = defaultIntervalCategoryDataset25.getSeriesIndex((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent5 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent5);
        java.util.List list7 = defaultIntervalCategoryDataset3.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultIntervalCategoryDataset3.getStartValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list5 = defaultIntervalCategoryDataset3.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        java.util.List list9 = defaultIntervalCategoryDataset3.getRowKeys();
        int int10 = defaultIntervalCategoryDataset3.getSeriesCount();
        int int11 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int12 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        int int5 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int6 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list7 = defaultIntervalCategoryDataset3.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultIntervalCategoryDataset3.getStartValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list5 = defaultIntervalCategoryDataset3.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        defaultIntervalCategoryDataset3.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener10);
        int int12 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int13 = defaultIntervalCategoryDataset3.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray5, numberArray7, numberArray9, numberArray11 };
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray14 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray15 = new java.lang.Number[][] { numberArray14 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray13, numberArray15);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray12, numberArray13);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 0.0f };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 0.0f };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray19, numberArray21 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray13, numberArray22);
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) 100, 10L, (byte) 100 };
        java.lang.Number[][] numberArray40 = new java.lang.Number[][] { numberArray27, numberArray31, numberArray35, numberArray39 };
        java.lang.Number[][] numberArray41 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray40, numberArray41);
        java.util.List list43 = defaultIntervalCategoryDataset42.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultIntervalCategoryDataset42.getGroup();
        java.lang.Number[][] numberArray45 = null;
        java.lang.Number[] numberArray46 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray46 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray45, numberArray47);
        int int49 = defaultIntervalCategoryDataset48.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent50 = null;
        defaultIntervalCategoryDataset48.seriesChanged(seriesChangeEvent50);
        int int52 = defaultIntervalCategoryDataset48.getCategoryCount();
        java.util.List list53 = defaultIntervalCategoryDataset48.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent54 = null;
        defaultIntervalCategoryDataset48.seriesChanged(seriesChangeEvent54);
        java.util.List list56 = defaultIntervalCategoryDataset48.getRowKeys();
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.lang.Number[][] numberArray58 = null;
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray67 = new java.lang.Number[][] { numberArray60, numberArray62, numberArray64, numberArray66 };
        java.lang.Number[][] numberArray68 = null;
        java.lang.Number[] numberArray69 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray70 = new java.lang.Number[][] { numberArray69 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset71 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray68, numberArray70);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset72 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray67, numberArray68);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset73 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray57, numberArray58, numberArray67);
        defaultIntervalCategoryDataset48.setSeriesKeys((java.lang.Comparable[]) strArray57);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset42.setSeriesKeys((java.lang.Comparable[]) strArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the data.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertArrayEquals(numberArray14, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(datasetGroup44);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertArrayEquals(numberArray46, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray60);
        org.junit.Assert.assertNotNull(numberArray62);
        org.junit.Assert.assertNotNull(numberArray64);
        org.junit.Assert.assertNotNull(numberArray66);
        org.junit.Assert.assertNotNull(numberArray67);
        org.junit.Assert.assertNotNull(numberArray69);
        org.junit.Assert.assertArrayEquals(numberArray69, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray70);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int6 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 1L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultIntervalCategoryDataset3.equals(obj11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset3.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int27 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.removeChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener30);
        int int33 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) (-1.0f));
        java.lang.Comparable[] comparableArray39 = new java.lang.Comparable[] { 2, (short) 1, true, ' ', 100L };
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset25.setSeriesKeys(comparableArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the data.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(comparableArray39);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        java.util.List list8 = defaultIntervalCategoryDataset3.getColumnKeys();
        int int9 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent10 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent10);
        defaultIntervalCategoryDataset3.validateObject();
        java.lang.Comparable[] comparableArray13 = new java.lang.Comparable[] {};
        defaultIntervalCategoryDataset3.setSeriesKeys(comparableArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultIntervalCategoryDataset3.getStartValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unknown 'series' key.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(comparableArray13);
        org.junit.Assert.assertArrayEquals(comparableArray13, new java.lang.Comparable[] {});
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.lang.Number[][] numberArray26 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray24, numberArray26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultIntervalCategoryDataset27.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        boolean boolean15 = defaultIntervalCategoryDataset13.equals((java.lang.Object) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent19 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent19);
        java.util.List list21 = defaultIntervalCategoryDataset13.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultIntervalCategoryDataset13.getSeriesKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No such series : 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int6 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 1L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultIntervalCategoryDataset3.equals(obj11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset3.getGroup();
        defaultIntervalCategoryDataset3.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = defaultIntervalCategoryDataset3.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        defaultIntervalCategoryDataset13.validateObject();
        int int20 = defaultIntervalCategoryDataset13.getCategoryCount();
        defaultIntervalCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener22);
        java.util.List list24 = defaultIntervalCategoryDataset13.getRowKeys();
        int int25 = defaultIntervalCategoryDataset13.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = defaultIntervalCategoryDataset13.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        defaultIntervalCategoryDataset3.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultIntervalCategoryDataset3.getEndValue((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset13.getGroup();
        defaultIntervalCategoryDataset13.validateObject();
        java.util.List list24 = defaultIntervalCategoryDataset13.getColumnKeys();
        defaultIntervalCategoryDataset13.validateObject();
        int int27 = defaultIntervalCategoryDataset13.getSeriesIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener14);
        defaultIntervalCategoryDataset13.validateObject();
        java.util.List list17 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultIntervalCategoryDataset13.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset13.setEndValue((int) (byte) 100, (java.lang.Comparable) 1L, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        boolean boolean7 = defaultIntervalCategoryDataset3.equals((java.lang.Object) '#');
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultIntervalCategoryDataset3.getGroup();
        int int10 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener11);
        defaultIntervalCategoryDataset3.validateObject();
        defaultIntervalCategoryDataset3.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultIntervalCategoryDataset3.getEndValue((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        int int26 = defaultIntervalCategoryDataset25.getCategoryCount();
        defaultIntervalCategoryDataset25.validateObject();
        java.util.List list28 = defaultIntervalCategoryDataset25.getRowKeys();
        java.util.List list29 = defaultIntervalCategoryDataset25.getRowKeys();
        int int30 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double[][] doubleArray0 = new double[][] {};
        double[][] doubleArray1 = new double[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0, doubleArray1);
        int int3 = defaultIntervalCategoryDataset2.getSeriesCount();
        int int4 = defaultIntervalCategoryDataset2.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent5 = null;
        defaultIntervalCategoryDataset2.seriesChanged(seriesChangeEvent5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultIntervalCategoryDataset2.getCategoryIndex((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[][] {});
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[][] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.util.List list14 = defaultIntervalCategoryDataset13.getRowKeys();
        java.util.List list15 = defaultIntervalCategoryDataset13.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultIntervalCategoryDataset13.getStartValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int6 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 1L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultIntervalCategoryDataset3.equals(obj11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset3.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent14 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent14);
        java.util.List list16 = defaultIntervalCategoryDataset3.getColumnKeys();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent14 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent14);
        boolean boolean17 = defaultIntervalCategoryDataset13.equals((java.lang.Object) 0L);
        java.lang.Object obj18 = null;
        boolean boolean19 = defaultIntervalCategoryDataset13.equals(obj18);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent20 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent20);
        int int22 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultIntervalCategoryDataset13.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = defaultIntervalCategoryDataset13.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(datasetGroup23);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int27 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultIntervalCategoryDataset25.getGroup();
        int int31 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultIntervalCategoryDataset25.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultIntervalCategoryDataset25.getGroup();
        int int34 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent35 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent35);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(datasetGroup30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(datasetGroup32);
        org.junit.Assert.assertNotNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent24 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset13.getGroup();
        int int27 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int29 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int9 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int11 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) 10);
        int int13 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 100.0f);
        int int15 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) ' ');
        int int16 = defaultIntervalCategoryDataset3.getSeriesCount();
        int int17 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultIntervalCategoryDataset3.getStartValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        boolean boolean7 = defaultIntervalCategoryDataset3.equals((java.lang.Object) '#');
        defaultIntervalCategoryDataset3.validateObject();
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultIntervalCategoryDataset3.equals(obj9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener11);
        int int13 = defaultIntervalCategoryDataset3.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = defaultIntervalCategoryDataset3.getCategoryIndex((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultIntervalCategoryDataset3.equals(obj9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultIntervalCategoryDataset3.getGroup();
        int int13 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultIntervalCategoryDataset3.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent26 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent26);
        java.util.List list28 = defaultIntervalCategoryDataset25.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultIntervalCategoryDataset25.getGroup();
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = defaultIntervalCategoryDataset25.getRowIndex(comparable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(datasetGroup29);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        java.util.List list8 = defaultIntervalCategoryDataset3.getColumnKeys();
        int int9 = defaultIntervalCategoryDataset3.getSeriesCount();
        java.util.List list10 = defaultIntervalCategoryDataset3.getColumnKeys();
        defaultIntervalCategoryDataset3.validateObject();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray15, numberArray17, numberArray19, numberArray21 };
        java.lang.Number[][] numberArray23 = null;
        java.lang.Number[] numberArray24 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray24 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset26 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray23, numberArray25);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray22, numberArray23);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset28 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray12, numberArray13, numberArray22);
        defaultIntervalCategoryDataset3.setSeriesKeys((java.lang.Comparable[]) strArray12);
        java.lang.Comparable comparable30 = null;
        int int31 = defaultIntervalCategoryDataset3.getRowIndex(comparable30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = defaultIntervalCategoryDataset3.getValue((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertArrayEquals(numberArray24, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray5, numberArray7, numberArray9, numberArray11 };
        java.lang.Number[][] numberArray13 = null;
        java.lang.Number[] numberArray14 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray15 = new java.lang.Number[][] { numberArray14 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray13, numberArray15);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray12, numberArray13);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 0.0f };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 0.0f };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray19, numberArray21 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray3, numberArray13, numberArray22);
        int int24 = defaultIntervalCategoryDataset23.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultIntervalCategoryDataset23.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent26 = null;
        defaultIntervalCategoryDataset23.seriesChanged(seriesChangeEvent26);
        defaultIntervalCategoryDataset23.validateObject();
        java.util.List list29 = defaultIntervalCategoryDataset23.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultIntervalCategoryDataset23.getStartValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertArrayEquals(numberArray14, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(datasetGroup25);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double[][] doubleArray0 = null;
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray1, doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'data' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[][] {});
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[][] {});
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener14);
        defaultIntervalCategoryDataset13.validateObject();
        java.util.List list17 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultIntervalCategoryDataset13.getGroup();
        java.util.List list19 = defaultIntervalCategoryDataset13.getColumnKeys();
        java.util.List list20 = defaultIntervalCategoryDataset13.getRowKeys();
        java.util.List list21 = defaultIntervalCategoryDataset13.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset13.setEndValue((int) (short) 10, (java.lang.Comparable) '#', (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent9 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener13);
        defaultIntervalCategoryDataset3.validateObject();
        java.util.List list16 = defaultIntervalCategoryDataset3.getColumnKeys();
        java.util.List list17 = defaultIntervalCategoryDataset3.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultIntervalCategoryDataset3.getValue((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset25.getGroup();
        int int27 = defaultIntervalCategoryDataset25.getSeriesCount();
        java.util.List list28 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener29);
        int int32 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) (-1));
        defaultIntervalCategoryDataset25.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = defaultIntervalCategoryDataset25.getColumnIndex((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent9 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener11);
        int int13 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int14 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        java.lang.Comparable[] comparableArray18 = new java.lang.Comparable[] { 0.0f };
        defaultIntervalCategoryDataset13.setCategoryKeys(comparableArray18);
        int int21 = defaultIntervalCategoryDataset13.getColumnIndex((java.lang.Comparable) true);
        int int22 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultIntervalCategoryDataset13.getStartValue(comparable23, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(comparableArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener14);
        defaultIntervalCategoryDataset13.validateObject();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent17 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent17);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent19 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent19);
        int int21 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener22);
        java.util.List list24 = defaultIntervalCategoryDataset13.getRowKeys();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) (short) -1);
        int int24 = defaultIntervalCategoryDataset13.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultIntervalCategoryDataset13.getValue((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int9 = defaultIntervalCategoryDataset3.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultIntervalCategoryDataset3.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultIntervalCategoryDataset3.removeChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultIntervalCategoryDataset3.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset25.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultIntervalCategoryDataset25.getStartValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(datasetGroup26);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        int int20 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener21);
        int int23 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.util.List list24 = defaultIntervalCategoryDataset13.getRowKeys();
        int int25 = defaultIntervalCategoryDataset13.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultIntervalCategoryDataset13.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultIntervalCategoryDataset13.getValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultIntervalCategoryDataset13.getEndValue((java.lang.Comparable) 0, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset13.getGroup();
        java.lang.Comparable[] comparableArray18 = new java.lang.Comparable[] { 0.0f };
        defaultIntervalCategoryDataset13.setCategoryKeys(comparableArray18);
        int int21 = defaultIntervalCategoryDataset13.getColumnIndex((java.lang.Comparable) true);
        int int23 = defaultIntervalCategoryDataset13.getCategoryIndex((java.lang.Comparable) "hi!");
        int int24 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultIntervalCategoryDataset13.getEndValue((java.lang.Comparable) 100L, comparable26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(comparableArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        int int5 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int7 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = defaultIntervalCategoryDataset3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        int int5 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int7 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 10.0d);
        int int9 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultIntervalCategoryDataset3.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent11 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent11);
        java.util.List list13 = defaultIntervalCategoryDataset3.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = defaultIntervalCategoryDataset3.getSeriesIndex((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        int int26 = defaultIntervalCategoryDataset25.getCategoryCount();
        defaultIntervalCategoryDataset25.validateObject();
        java.util.List list28 = defaultIntervalCategoryDataset25.getRowKeys();
        int int30 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) (short) 10);
        java.util.List list31 = defaultIntervalCategoryDataset25.getRowKeys();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener24);
        int int26 = defaultIntervalCategoryDataset13.getRowCount();
        java.lang.Comparable comparable28 = defaultIntervalCategoryDataset13.getRowKey(2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener29);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) -1 + "'", comparable28, (short) -1);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        java.util.List list21 = defaultIntervalCategoryDataset13.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultIntervalCategoryDataset13.getStartValue((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.util.List list14 = defaultIntervalCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultIntervalCategoryDataset13.getRowKeys();
        int int18 = defaultIntervalCategoryDataset13.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = defaultIntervalCategoryDataset13.indexOf((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset13.getGroup();
        defaultIntervalCategoryDataset13.validateObject();
        java.util.List list24 = defaultIntervalCategoryDataset13.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset13.setEndValue((int) '4', (java.lang.Comparable) "", (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        int int15 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int16 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.util.List list17 = defaultIntervalCategoryDataset13.getColumnKeys();
        java.util.List list18 = defaultIntervalCategoryDataset13.getColumnKeys();
        java.util.List list19 = defaultIntervalCategoryDataset13.getColumnKeys();
        defaultIntervalCategoryDataset13.validateObject();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        int int15 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int16 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int17 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        java.util.List list4 = defaultIntervalCategoryDataset3.getColumnKeys();
        defaultIntervalCategoryDataset3.validateObject();
        defaultIntervalCategoryDataset3.validateObject();
        java.util.List list7 = defaultIntervalCategoryDataset3.getRowKeys();
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener27);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent29 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent29);
        java.util.List list31 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent32 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent32);
        java.util.List list34 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int35 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultIntervalCategoryDataset25.removeChangeListener(datasetChangeListener36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable39 = defaultIntervalCategoryDataset25.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray2 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray4, numberArray6, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] { numberArray11 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray10, numberArray12);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset14 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray19, numberArray24 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset26 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray10, numberArray25);
        java.lang.Number[][] numberArray27 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset28 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray25, numberArray27);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray25);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset29.setStartValue(100, (java.lang.Comparable) (short) 10, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray25);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        int int20 = defaultIntervalCategoryDataset13.getCategoryCount();
        int int21 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener22);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultIntervalCategoryDataset13.hasListener(eventListener24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset13.getGroup();
        int int27 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset13.getGroup();
        int int24 = defaultIntervalCategoryDataset13.indexOf((java.lang.Comparable) (short) 100);
        boolean boolean26 = defaultIntervalCategoryDataset13.equals((java.lang.Object) false);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent27 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent27);
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultIntervalCategoryDataset13.hasListener(eventListener29);
        int int32 = defaultIntervalCategoryDataset13.getSeriesIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset13.setEndValue((int) (short) 100, (java.lang.Comparable) 0.0f, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent9 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent9);
        defaultIntervalCategoryDataset3.validateObject();
        int int12 = defaultIntervalCategoryDataset3.getSeriesCount();
        defaultIntervalCategoryDataset3.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset3.addChangeListener(datasetChangeListener14);
        defaultIntervalCategoryDataset3.validateObject();
        int int18 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (byte) 100);
        java.util.List list19 = defaultIntervalCategoryDataset3.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = defaultIntervalCategoryDataset3.getSeriesIndex((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        java.util.List list4 = defaultIntervalCategoryDataset3.getColumnKeys();
        defaultIntervalCategoryDataset3.validateObject();
        defaultIntervalCategoryDataset3.validateObject();
        java.util.List list7 = defaultIntervalCategoryDataset3.getRowKeys();
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset3.setStartValue((int) (short) 1, (java.lang.Comparable) (byte) 10, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (byte) 100, (byte) 10 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray16, numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray20);
        defaultIntervalCategoryDataset21.validateObject();
        int int23 = defaultIntervalCategoryDataset21.getCategoryCount();
        java.util.List list24 = defaultIntervalCategoryDataset21.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultIntervalCategoryDataset21.addChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultIntervalCategoryDataset21.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultIntervalCategoryDataset21.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(datasetGroup27);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int4 = defaultIntervalCategoryDataset3.getSeriesCount();
        int int5 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int7 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 10.0d);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        java.util.List list26 = defaultIntervalCategoryDataset25.getColumnKeys();
        int int27 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset25.removeChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener30);
        java.util.List list32 = defaultIntervalCategoryDataset25.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultIntervalCategoryDataset25.getEndValue((java.lang.Comparable) 1, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        int int26 = defaultIntervalCategoryDataset25.getCategoryCount();
        defaultIntervalCategoryDataset25.validateObject();
        java.util.List list28 = defaultIntervalCategoryDataset25.getRowKeys();
        int int30 = defaultIntervalCategoryDataset25.indexOf((java.lang.Comparable) (short) 10);
        java.util.List list31 = defaultIntervalCategoryDataset25.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultIntervalCategoryDataset25.removeChangeListener(datasetChangeListener32);
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        boolean boolean7 = defaultIntervalCategoryDataset3.equals((java.lang.Object) '#');
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultIntervalCategoryDataset3.getGroup();
        int int10 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 1);
        java.util.List list11 = defaultIntervalCategoryDataset3.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset3.setStartValue(10, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.Number[][] numberArray1 = null;
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray10 = new java.lang.Number[][] { numberArray3, numberArray5, numberArray7, numberArray9 };
        java.lang.Number[][] numberArray11 = null;
        java.lang.Number[] numberArray12 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray13 = new java.lang.Number[][] { numberArray12 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset14 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray11, numberArray13);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray10, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray0, numberArray1, numberArray10);
        java.util.List list17 = defaultIntervalCategoryDataset16.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent18 = null;
        defaultIntervalCategoryDataset16.seriesChanged(seriesChangeEvent18);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertArrayEquals(numberArray12, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultIntervalCategoryDataset13.getRowKeys();
        int int20 = defaultIntervalCategoryDataset13.getCategoryCount();
        int int21 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultIntervalCategoryDataset13.getEndValue((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        java.lang.Comparable[] comparableArray19 = new java.lang.Comparable[] { ' ', 1, (short) -1, 1L };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray19);
        int int21 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int23 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener24);
        int int27 = defaultIntervalCategoryDataset13.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = defaultIntervalCategoryDataset13.getCategoryIndex((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent14 = null;
        defaultIntervalCategoryDataset13.seriesChanged(seriesChangeEvent14);
        boolean boolean17 = defaultIntervalCategoryDataset13.equals((java.lang.Object) 0L);
        java.util.List list18 = defaultIntervalCategoryDataset13.getColumnKeys();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int8 = defaultIntervalCategoryDataset3.getCategoryCount();
        int int10 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultIntervalCategoryDataset3.getRowIndex((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.lang.Number[][] numberArray0 = null;
        java.lang.Number[] numberArray1 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] { numberArray1 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0, numberArray2);
        int int5 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) (short) -1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent6 = null;
        defaultIntervalCategoryDataset3.seriesChanged(seriesChangeEvent6);
        int int9 = defaultIntervalCategoryDataset3.indexOf((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultIntervalCategoryDataset3.getValue((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertArrayEquals(numberArray1, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        defaultIntervalCategoryDataset13.validateObject();
        int int15 = defaultIntervalCategoryDataset13.getSeriesCount();
        int int16 = defaultIntervalCategoryDataset13.getSeriesCount();
        java.lang.Number number19 = defaultIntervalCategoryDataset13.getStartValue(2, (int) (short) 0);
        int int20 = defaultIntervalCategoryDataset13.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (short) 1 + "'", number19, (short) 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.Number[] numberArray1 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray3 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) 1 };
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray1, numberArray3, numberArray5, numberArray7 };
        java.lang.Number[][] numberArray9 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray11);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray8, numberArray9);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (-1L), 10.0f, (byte) 10, (short) -1 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray18, numberArray23 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray24);
        int int26 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent27 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent27);
        java.util.List list29 = defaultIntervalCategoryDataset25.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener30);
        int int32 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray1);
        org.junit.Assert.assertNotNull(numberArray3);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }
}

