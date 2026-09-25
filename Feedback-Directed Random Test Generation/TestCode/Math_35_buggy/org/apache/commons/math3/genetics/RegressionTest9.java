package org.apache.commons.math3.genetics;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setElitismRate(0.0d);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation5.getChromosomes();
        java.lang.String str15 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        java.lang.String str8 = elitisticListPopulation5.toString();
        int int9 = elitisticListPopulation5.getPopulationSize();
        int int10 = elitisticListPopulation5.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation5.getChromosomes();
        int int21 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray26 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27, chromosomeArray26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27, 1, (double) '4');
        elitisticListPopulation31.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation36.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str42 = elitisticListPopulation41.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation36.setChromosomes(chromosomeList43);
        elitisticListPopulation31.setChromosomes(chromosomeList43);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray46 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, chromosomeArray46);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, 1, (double) '4');
        elitisticListPopulation31.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation55.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str61 = elitisticListPopulation60.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = elitisticListPopulation60.getChromosomes();
        elitisticListPopulation55.setChromosomes(chromosomeList62);
        elitisticListPopulation31.setChromosomes(chromosomeList62);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray65 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66, chromosomeArray65);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66, 1, (double) '4');
        elitisticListPopulation31.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation75 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66, (int) ' ', 1.0d);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator76 = elitisticListPopulation75.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome77 = null;
        elitisticListPopulation75.addChromosome(chromosome77);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation75.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeArray26);
        org.junit.Assert.assertArrayEquals(chromosomeArray26, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertNotNull(chromosomeList43);
        org.junit.Assert.assertNotNull(chromosomeArray46);
        org.junit.Assert.assertArrayEquals(chromosomeArray46, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertNotNull(chromosomeList62);
        org.junit.Assert.assertNotNull(chromosomeArray65);
        org.junit.Assert.assertArrayEquals(chromosomeArray65, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator76);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray46 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, chromosomeArray46);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList47, 1, (double) '4');
        elitisticListPopulation51.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation56.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str62 = elitisticListPopulation61.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = elitisticListPopulation61.getChromosomes();
        elitisticListPopulation56.setChromosomes(chromosomeList63);
        elitisticListPopulation51.setChromosomes(chromosomeList63);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList66);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList66, (int) (short) 100, 0.0d);
        double double71 = elitisticListPopulation70.getElitismRate();
        int int72 = elitisticListPopulation70.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeArray46);
        org.junit.Assert.assertArrayEquals(chromosomeArray46, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[]" + "'", str62, "[]");
        org.junit.Assert.assertNotNull(chromosomeList63);
        org.junit.Assert.assertNotNull(chromosomeList66);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        int int10 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit(0);
        java.lang.String str13 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[null]" + "'", str13, "[null]");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        elitisticListPopulation5.setChromosomes(chromosomeList48);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor51 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation54.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str60 = elitisticListPopulation59.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList61 = elitisticListPopulation59.getChromosomes();
        elitisticListPopulation54.setChromosomes(chromosomeList61);
        elitisticListPopulation5.setChromosomes(chromosomeList61);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator64 = elitisticListPopulation5.spliterator();
        java.lang.String str65 = elitisticListPopulation5.toString();
        int int66 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeItor51);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertNotNull(chromosomeList61);
        org.junit.Assert.assertNotNull(chromosomeSpliterator64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int31 = elitisticListPopulation5.getPopulationSize();
        int int32 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation5.addChromosome(chromosome34);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(chromosomeList36);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList48, (int) 'a', (double) 100.0f);
        org.apache.commons.math3.genetics.Population population52 = elitisticListPopulation51.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation51.setPopulationLimit((-1));
        org.apache.commons.math3.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation51.addChromosome(chromosome56);
        java.lang.Class<?> wildcardClass58 = elitisticListPopulation51.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(population52);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.lang.String str18 = elitisticListPopulation2.toString();
        java.lang.String str19 = elitisticListPopulation2.toString();
        double double20 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[null]" + "'", str18, "[null]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[null]" + "'", str19, "[null]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, 35.0d);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 100, (double) (short) 10);
        int int34 = elitisticListPopulation33.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        elitisticListPopulation5.setChromosomes(chromosomeList48);
        org.apache.commons.math3.genetics.Population population51 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator54 = elitisticListPopulation5.spliterator();
        int int55 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(population51);
        org.junit.Assert.assertNotNull(chromosomeSpliterator54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        int int19 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation10.iterator();
        int int21 = elitisticListPopulation10.getPopulationLimit();
        double double22 = elitisticListPopulation10.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList23);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeList23);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        double double12 = elitisticListPopulation5.getElitismRate();
        int int13 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0L);
        int int17 = elitisticListPopulation16.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) ' ', (double) '4');
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) (byte) 10, (double) (byte) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = null;
        elitisticListPopulation31.setChromosomes(chromosomeList32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation31.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation31.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation31.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(chromosomeList34);
        org.junit.Assert.assertNull(chromosomeList35);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        int int39 = elitisticListPopulation5.getPopulationSize();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str41 = elitisticListPopulation5.toString();
        java.lang.String str42 = elitisticListPopulation5.toString();
        int int43 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation5.getChromosomes();
        java.lang.String str45 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 100L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor49 = elitisticListPopulation48.iterator();
        elitisticListPopulation48.setElitismRate((double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList52);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor49);
        org.junit.Assert.assertNotNull(chromosomeList52);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation25.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation32.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation37.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str43 = elitisticListPopulation42.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation37.setChromosomes(chromosomeList44);
        elitisticListPopulation32.setChromosomes(chromosomeList44);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray47 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, chromosomeArray47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, 1, (double) '4');
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, (int) 'a', (double) (byte) -1);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation62 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation62.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation67 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str68 = elitisticListPopulation67.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList69 = elitisticListPopulation67.getChromosomes();
        elitisticListPopulation62.setChromosomes(chromosomeList69);
        java.lang.String str71 = elitisticListPopulation62.toString();
        java.lang.String str72 = elitisticListPopulation62.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome73 = null;
        elitisticListPopulation62.addChromosome(chromosome73);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList75 = elitisticListPopulation62.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList75);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation79 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList75, (int) (short) 100, 0.0d);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor80 = elitisticListPopulation79.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome81 = null;
        elitisticListPopulation79.addChromosome(chromosome81);
        org.apache.commons.math3.genetics.Chromosome chromosome83 = null;
        elitisticListPopulation79.addChromosome(chromosome83);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertNotNull(chromosomeArray47);
        org.junit.Assert.assertArrayEquals(chromosomeArray47, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertNotNull(chromosomeList69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertNotNull(chromosomeList75);
        org.junit.Assert.assertNotNull(chromosomeItor80);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, 1, (double) '4');
        elitisticListPopulation12.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation17.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList24);
        elitisticListPopulation12.setChromosomes(chromosomeList24);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        int int37 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor38 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray40 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, chromosomeArray40);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, 1, (double) '4');
        double double46 = elitisticListPopulation45.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor47 = elitisticListPopulation45.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation50.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str56 = elitisticListPopulation55.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = elitisticListPopulation55.getChromosomes();
        elitisticListPopulation50.setChromosomes(chromosomeList57);
        elitisticListPopulation50.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation50.addChromosome(chromosome61);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray63 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList64 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, chromosomeArray63);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, 1, (double) '4');
        elitisticListPopulation50.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        elitisticListPopulation45.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator71 = chromosomeList64.spliterator();
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation75 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, 1, 10.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList76 = elitisticListPopulation75.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertArrayEquals(chromosomeArray7, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor38);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeArray40);
        org.junit.Assert.assertArrayEquals(chromosomeArray40, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor47);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertNotNull(chromosomeList57);
        org.junit.Assert.assertNotNull(chromosomeArray63);
        org.junit.Assert.assertArrayEquals(chromosomeArray63, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator71);
        org.junit.Assert.assertNotNull(chromosomeList76);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, (double) 0.0f);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray6 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, chromosomeArray6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, (int) 'a', (double) 'a');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeArray6);
        org.junit.Assert.assertArrayEquals(chromosomeArray6, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(chromosomeItor23);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        double double31 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation5.addChromosome(chromosome32);
        elitisticListPopulation5.setPopulationLimit(32);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor42 = elitisticListPopulation41.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray43 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, chromosomeArray43);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, 1, (double) '4');
        elitisticListPopulation48.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation53.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation53.setChromosomes(chromosomeList60);
        elitisticListPopulation48.setChromosomes(chromosomeList60);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray63 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList64 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, chromosomeArray63);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, 1, (double) '4');
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        elitisticListPopulation41.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation73 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, (int) (byte) 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, (int) (short) 100, (double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation79 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray80 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList81 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81, chromosomeArray80);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation85 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81, 1, (double) '4');
        elitisticListPopulation79.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation89 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81, (int) 'a', (double) 'a');
        elitisticListPopulation76.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation93 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81, 1, (double) 100);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation97 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList81, (int) ' ', 100.0d);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chromosomeItor42);
        org.junit.Assert.assertNotNull(chromosomeArray43);
        org.junit.Assert.assertArrayEquals(chromosomeArray43, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeArray63);
        org.junit.Assert.assertArrayEquals(chromosomeArray63, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(chromosomeArray80);
        org.junit.Assert.assertArrayEquals(chromosomeArray80, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (byte) 10);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, (double) 100.0f);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        int int5 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationSize();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', 35.0d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 100L);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        int int10 = elitisticListPopulation5.getPopulationSize();
        int int11 = elitisticListPopulation5.getPopulationSize();
        double double12 = elitisticListPopulation5.getElitismRate();
        int int13 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, 1, (double) '4');
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) 'a', (double) 'a');
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) (short) 10, (double) 100L);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation26.spliterator();
        elitisticListPopulation26.setElitismRate(0.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation26.getChromosomes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertNotNull(chromosomeList30);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        double double15 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate(0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, 32.0d);
        java.lang.Class<?> wildcardClass3 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 100.0f);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (short) 100);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        double double7 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation2.toString();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        elitisticListPopulation5.setChromosomes(chromosomeList48);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor51 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor52 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray53 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList54 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList54, chromosomeArray53);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList54, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor59 = elitisticListPopulation58.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation58.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation58.addChromosome(chromosome61);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation65.setPopulationLimit((int) (short) 0);
        int int68 = elitisticListPopulation65.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList69 = elitisticListPopulation65.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator70 = chromosomeList69.spliterator();
        elitisticListPopulation58.setChromosomes(chromosomeList69);
        elitisticListPopulation58.setPopulationLimit((int) '#');
        double double74 = elitisticListPopulation58.getElitismRate();
        int int75 = elitisticListPopulation58.getPopulationLimit();
        int int76 = elitisticListPopulation58.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList77 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList77);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeItor51);
        org.junit.Assert.assertNotNull(chromosomeItor52);
        org.junit.Assert.assertNotNull(chromosomeArray53);
        org.junit.Assert.assertArrayEquals(chromosomeArray53, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chromosomeItor59);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(chromosomeList69);
        org.junit.Assert.assertNotNull(chromosomeSpliterator70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 52.0d + "'", double74 == 52.0d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 35 + "'", int75 == 35);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(chromosomeList77);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        int int11 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) (byte) 10, 52.0d);
        int int16 = elitisticListPopulation15.getPopulationLimit();
        java.lang.String str17 = elitisticListPopulation15.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        int int14 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        elitisticListPopulation5.setPopulationLimit(100);
        int int10 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, 52, (double) (-1.0f));
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation25.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation32.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation37.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str43 = elitisticListPopulation42.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation37.setChromosomes(chromosomeList44);
        elitisticListPopulation32.setChromosomes(chromosomeList44);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray47 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, chromosomeArray47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, 1, (double) '4');
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, (int) 'a', (double) (byte) -1);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        int int60 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str61 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor62 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertNotNull(chromosomeArray47);
        org.junit.Assert.assertArrayEquals(chromosomeArray47, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor62);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) (byte) 10);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray5 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, chromosomeArray5);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList6, 1, (double) '4');
        double double11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation10.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = chromosomeList17.spliterator();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation10.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        int int23 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass24 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray5);
        org.junit.Assert.assertArrayEquals(chromosomeArray5, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray6 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, chromosomeArray6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, (int) 'a', (double) 'a');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7);
        int int17 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        int int19 = elitisticListPopulation2.getPopulationSize();
        int int20 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray6);
        org.junit.Assert.assertArrayEquals(chromosomeArray6, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(population18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 10.0f);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        int int5 = elitisticListPopulation2.getPopulationSize();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation13.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator28 = chromosomeList19.spliterator();
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList31, 32, 0.0d);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation34.iterator();
        org.apache.commons.math3.genetics.Population population36 = elitisticListPopulation34.nextGeneration();
        java.lang.Class<?> wildcardClass37 = elitisticListPopulation34.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertArrayEquals(chromosomeArray8, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator28);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        java.lang.String str31 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, 1, (double) '4');
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        double double43 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Population population44 = elitisticListPopulation5.nextGeneration();
        int int45 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate(1.0d);
        org.apache.commons.math3.genetics.Population population48 = elitisticListPopulation5.nextGeneration();
        int int49 = elitisticListPopulation5.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation5.addChromosome(chromosome50);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation5.iterator();
        int int16 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation5.iterator();
        int int21 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator22 = elitisticListPopulation5.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray25 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, chromosomeArray25);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList26, 1, (double) '4');
        double double31 = elitisticListPopulation30.getElitismRate();
        org.apache.commons.math3.genetics.Population population32 = elitisticListPopulation30.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor39 = elitisticListPopulation38.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray43 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, chromosomeArray43);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, 1, (double) '4');
        elitisticListPopulation42.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, (int) 'a', (double) 'a');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator53 = chromosomeList44.spliterator();
        elitisticListPopulation38.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        elitisticListPopulation30.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, 32, 0.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList59);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator22);
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeArray25);
        org.junit.Assert.assertArrayEquals(chromosomeArray25, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chromosomeItor39);
        org.junit.Assert.assertNotNull(chromosomeArray43);
        org.junit.Assert.assertArrayEquals(chromosomeArray43, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator53);
        org.junit.Assert.assertNotNull(chromosomeList59);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray6 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, chromosomeArray6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, (int) 'a', (double) 'a');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        double double23 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray24 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, chromosomeArray24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor30 = elitisticListPopulation29.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation29.spliterator();
        int int32 = elitisticListPopulation29.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor33 = elitisticListPopulation29.iterator();
        int int34 = elitisticListPopulation29.getPopulationSize();
        org.apache.commons.math3.genetics.Population population35 = elitisticListPopulation29.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation29.addChromosome(chromosome36);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, 1, (double) '4');
        elitisticListPopulation43.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation48.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str54 = elitisticListPopulation53.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation48.setChromosomes(chromosomeList55);
        elitisticListPopulation43.setChromosomes(chromosomeList55);
        elitisticListPopulation29.setChromosomes(chromosomeList55);
        elitisticListPopulation2.setChromosomes(chromosomeList55);
        org.junit.Assert.assertNotNull(chromosomeArray6);
        org.junit.Assert.assertArrayEquals(chromosomeArray6, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray24);
        org.junit.Assert.assertArrayEquals(chromosomeArray24, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chromosomeItor30);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(chromosomeList55);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, 0.0d);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeItor6);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, 1, (double) '4');
        elitisticListPopulation12.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation17.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList24);
        elitisticListPopulation12.setChromosomes(chromosomeList24);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (byte) 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (short) 100, (double) 0L);
        java.lang.String str41 = elitisticListPopulation40.toString();
        double double42 = elitisticListPopulation40.getElitismRate();
        org.apache.commons.math3.genetics.Population population43 = elitisticListPopulation40.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertArrayEquals(chromosomeArray7, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(population43);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(3, (double) (byte) 100);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, 100.0d);
        elitisticListPopulation2.setPopulationLimit(100);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) (byte) 100, (double) 'a');
        int int17 = elitisticListPopulation16.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation16.addChromosome(chromosome18);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.lang.String str39 = elitisticListPopulation5.toString();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        double double41 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate((double) 1L);
        int int44 = elitisticListPopulation5.getPopulationLimit();
        int int45 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = null;
        elitisticListPopulation5.setChromosomes(chromosomeList46);
        elitisticListPopulation5.setPopulationLimit(32);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = elitisticListPopulation5.getPopulationSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 52.0d + "'", double41 == 52.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation5.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        elitisticListPopulation5.setPopulationLimit(2);
        java.lang.String str17 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[null, null]" + "'", str17, "[null, null]");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList50 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList50);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList50, (int) '#', (double) 10L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation54.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList55, 10, (-1.0d));
        org.apache.commons.math3.genetics.Chromosome chromosome59 = null;
        elitisticListPopulation58.addChromosome(chromosome59);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator61 = elitisticListPopulation58.spliterator();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeList50);
        org.junit.Assert.assertNotNull(chromosomeList55);
        org.junit.Assert.assertNotNull(chromosomeSpliterator61);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        int int8 = elitisticListPopulation2.getPopulationSize();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        double double12 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        double double8 = elitisticListPopulation2.getElitismRate();
        double double9 = elitisticListPopulation2.getElitismRate();
        java.lang.String str10 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        elitisticListPopulation2.setPopulationLimit((-1));
        int int15 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation21.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation28.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation33.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.setChromosomes(chromosomeList40);
        elitisticListPopulation28.setChromosomes(chromosomeList40);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray43 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, chromosomeArray43);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, 1, (double) '4');
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, (int) (byte) 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, (int) (short) 100, (double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray60 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList61 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61, chromosomeArray60);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61, 1, (double) '4');
        elitisticListPopulation59.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation69 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61, (int) 'a', (double) 'a');
        elitisticListPopulation56.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList61);
        org.apache.commons.math3.genetics.Population population71 = elitisticListPopulation56.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator72 = elitisticListPopulation56.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList73 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList73);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        double double77 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertNotNull(chromosomeArray43);
        org.junit.Assert.assertArrayEquals(chromosomeArray43, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(chromosomeArray60);
        org.junit.Assert.assertArrayEquals(chromosomeArray60, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(population71);
        org.junit.Assert.assertNotNull(chromosomeSpliterator72);
        org.junit.Assert.assertNotNull(chromosomeList73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, (double) (byte) 100);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList4);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, (double) 2);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList20);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) '#');
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (-1.0d));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(chromosomeItor4);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int31 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str32 = elitisticListPopulation5.toString();
        int int33 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str34 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 10L);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) (-1L));
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray6 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, chromosomeArray6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        elitisticListPopulation18.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        elitisticListPopulation18.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, 1, (double) '4');
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, (int) (byte) 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, (int) (short) 100, (double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation49 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray50 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, chromosomeArray50);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, 1, (double) '4');
        elitisticListPopulation49.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, (int) 'a', (double) 'a');
        elitisticListPopulation46.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator65 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray6);
        org.junit.Assert.assertArrayEquals(chromosomeArray6, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chromosomeArray50);
        org.junit.Assert.assertArrayEquals(chromosomeArray50, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chromosomeList62);
        org.junit.Assert.assertNotNull(chromosomeSpliterator65);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.lang.String str39 = elitisticListPopulation5.toString();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList43, 32, (double) 100.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation49 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str50 = elitisticListPopulation49.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation49.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor52 = elitisticListPopulation49.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor53 = elitisticListPopulation49.iterator();
        int int54 = elitisticListPopulation49.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population55 = elitisticListPopulation49.nextGeneration();
        int int56 = elitisticListPopulation49.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = elitisticListPopulation49.getChromosomes();
        elitisticListPopulation46.setChromosomes(chromosomeList57);
        double double59 = elitisticListPopulation46.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chromosomeList43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertNotNull(chromosomeItor52);
        org.junit.Assert.assertNotNull(chromosomeItor53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertNotNull(population55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(chromosomeList57);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, 1, (double) '4');
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) 'a', (double) 'a');
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator26 = chromosomeList25.spliterator();
        java.lang.Class<?> wildcardClass27 = chromosomeSpliterator26.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeItor24);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        int int15 = elitisticListPopulation12.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation12.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator17 = chromosomeList16.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList16);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator17);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeItor20);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) (byte) 100, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (-1), (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, 100.0d);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 100L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 100L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, (int) '#', 97.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, 10, (double) 'a');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation9.iterator();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(chromosomeItor10);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        double double5 = elitisticListPopulation2.getElitismRate();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int31 = elitisticListPopulation5.getPopulationSize();
        int int32 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor34 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation5.addChromosome(chromosome35);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(chromosomeItor34);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, 1.0d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        int int8 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        elitisticListPopulation18.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        elitisticListPopulation18.setChromosomes(chromosomeList30);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation12.setChromosomes(chromosomeList33);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation12.getChromosomes();
        int int36 = elitisticListPopulation12.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, 1, (double) '4');
        elitisticListPopulation12.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation17.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList24);
        elitisticListPopulation12.setChromosomes(chromosomeList24);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator35 = chromosomeList28.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (short) 100, (double) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation38.getChromosomes();
        org.apache.commons.math3.genetics.Population population40 = elitisticListPopulation38.nextGeneration();
        elitisticListPopulation38.setElitismRate((double) (byte) 1);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertArrayEquals(chromosomeArray7, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator35);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(population40);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, (double) (byte) 100);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        int int22 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str23 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(32);
        java.lang.String str26 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation2.addChromosome(chromosome27);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(1);
        double double20 = elitisticListPopulation2.getElitismRate();
        double double21 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation24.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str30 = elitisticListPopulation29.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation24.setChromosomes(chromosomeList31);
        int int33 = elitisticListPopulation24.getPopulationSize();
        double double34 = elitisticListPopulation24.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator35 = elitisticListPopulation24.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation24.getChromosomes();
        int int37 = elitisticListPopulation24.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, 1, (double) '4');
        double double44 = elitisticListPopulation43.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor45 = elitisticListPopulation43.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str49 = elitisticListPopulation48.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList50 = elitisticListPopulation48.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator51 = chromosomeList50.spliterator();
        elitisticListPopulation43.setChromosomes(chromosomeList50);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, 1, (double) '4');
        elitisticListPopulation55.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray66 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList67 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, chromosomeArray66);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation71 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList67, 1, (double) '4');
        elitisticListPopulation71.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation76.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation81 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str82 = elitisticListPopulation81.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList83 = elitisticListPopulation81.getChromosomes();
        elitisticListPopulation76.setChromosomes(chromosomeList83);
        elitisticListPopulation71.setChromosomes(chromosomeList83);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList86 = elitisticListPopulation71.getChromosomes();
        elitisticListPopulation65.setChromosomes(chromosomeList86);
        elitisticListPopulation43.setChromosomes(chromosomeList86);
        int int89 = elitisticListPopulation43.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList90 = elitisticListPopulation43.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator91 = chromosomeList90.spliterator();
        elitisticListPopulation24.setChromosomes(chromosomeList90);
        elitisticListPopulation2.setChromosomes(chromosomeList90);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator35);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertNotNull(chromosomeList50);
        org.junit.Assert.assertNotNull(chromosomeSpliterator51);
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertArrayEquals(chromosomeArray56, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(chromosomeArray66);
        org.junit.Assert.assertArrayEquals(chromosomeArray66, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "[]" + "'", str82, "[]");
        org.junit.Assert.assertNotNull(chromosomeList83);
        org.junit.Assert.assertNotNull(chromosomeList86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(chromosomeList90);
        org.junit.Assert.assertNotNull(chromosomeSpliterator91);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        elitisticListPopulation18.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        elitisticListPopulation18.setChromosomes(chromosomeList30);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation12.setChromosomes(chromosomeList33);
        int int35 = elitisticListPopulation12.getPopulationLimit();
        int int36 = elitisticListPopulation12.getPopulationLimit();
        elitisticListPopulation12.setElitismRate(1.0d);
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) (byte) 0);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        int int17 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.lang.String str15 = elitisticListPopulation2.toString();
        int int16 = elitisticListPopulation2.getPopulationLimit();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, 1, (double) '4');
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, 1, (double) '4');
        elitisticListPopulation36.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation41.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str47 = elitisticListPopulation46.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation41.setChromosomes(chromosomeList48);
        elitisticListPopulation36.setChromosomes(chromosomeList48);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation30.setChromosomes(chromosomeList51);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList53);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[null]" + "'", str15, "[null]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertArrayEquals(chromosomeArray31, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertNotNull(chromosomeList53);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate(0.0d);
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome20 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList15);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int int10 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation5.getChromosomes();
        int int21 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation5.iterator();
        int int23 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation5.addChromosome(chromosome24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation28.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation28.setChromosomes(chromosomeList35);
        int int37 = elitisticListPopulation28.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation28.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList38, (int) (byte) 10, 52.0d);
        elitisticListPopulation5.setChromosomes(chromosomeList38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList38, (int) '#', (double) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList38, 10, 97.0d);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chromosomeList38);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        elitisticListPopulation18.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        elitisticListPopulation18.setChromosomes(chromosomeList30);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation12.setChromosomes(chromosomeList33);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation12.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation41.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation46.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str52 = elitisticListPopulation51.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation46.setChromosomes(chromosomeList53);
        elitisticListPopulation41.setChromosomes(chromosomeList53);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, 1, (double) '4');
        elitisticListPopulation41.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation65.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str71 = elitisticListPopulation70.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList72 = elitisticListPopulation70.getChromosomes();
        elitisticListPopulation65.setChromosomes(chromosomeList72);
        elitisticListPopulation41.setChromosomes(chromosomeList72);
        elitisticListPopulation12.setChromosomes(chromosomeList72);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation78 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList72, 10, (double) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation81 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList72, 35, (double) (short) 10);
        elitisticListPopulation81.setPopulationLimit(10);
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertArrayEquals(chromosomeArray56, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertNotNull(chromosomeList72);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.Population population48 = elitisticListPopulation5.nextGeneration();
        int int49 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        int int15 = elitisticListPopulation12.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation12.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator17 = chromosomeList16.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList16);
        elitisticListPopulation5.setPopulationLimit((int) '#');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        int int32 = elitisticListPopulation23.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor33 = elitisticListPopulation23.iterator();
        int int34 = elitisticListPopulation23.getPopulationLimit();
        double double35 = elitisticListPopulation23.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor38 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit(1);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator17);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeItor38);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        int int48 = elitisticListPopulation5.getPopulationLimit();
        int int49 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) (byte) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation16.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation16.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation16.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 1, (double) 0L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList23);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = chromosomeList23.spliterator();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0L);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation11.setPopulationLimit((int) (short) 0);
        int int14 = elitisticListPopulation11.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation20.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray22 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList23, chromosomeArray22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList23, 1, (double) '4');
        elitisticListPopulation27.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation32.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str38 = elitisticListPopulation37.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation37.getChromosomes();
        elitisticListPopulation32.setChromosomes(chromosomeList39);
        elitisticListPopulation27.setChromosomes(chromosomeList39);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, 1, (double) '4');
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator50 = chromosomeList43.spliterator();
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeArray22);
        org.junit.Assert.assertArrayEquals(chromosomeArray22, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator50);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, 1, (double) '4');
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) 'a', (double) 'a');
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        double double24 = elitisticListPopulation2.getElitismRate();
        java.lang.String str25 = elitisticListPopulation2.toString();
        int int26 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population27 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation2.addChromosome(chromosome28);
        org.apache.commons.math3.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation2.addChromosome(chromosome30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(population27);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(0);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray24 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, chromosomeArray24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, 1, (double) '4');
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, (int) 'a', (double) 'a');
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, 1, (double) '4');
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        double double42 = elitisticListPopulation20.getElitismRate();
        elitisticListPopulation20.setElitismRate(1.0d);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray45 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, chromosomeArray45);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor51 = elitisticListPopulation50.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = elitisticListPopulation50.getChromosomes();
        int int53 = elitisticListPopulation50.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor54 = elitisticListPopulation50.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor55 = elitisticListPopulation50.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList56 = elitisticListPopulation50.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList56, (int) (byte) 100, (double) (byte) 100);
        elitisticListPopulation20.setChromosomes(chromosomeList56);
        elitisticListPopulation2.setChromosomes(chromosomeList56);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList56, (int) (short) 100, (double) (short) -1);
        double double65 = elitisticListPopulation64.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeArray24);
        org.junit.Assert.assertArrayEquals(chromosomeArray24, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeArray45);
        org.junit.Assert.assertArrayEquals(chromosomeArray45, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chromosomeItor51);
        org.junit.Assert.assertNotNull(chromosomeList52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor54);
        org.junit.Assert.assertNotNull(chromosomeItor55);
        org.junit.Assert.assertNotNull(chromosomeList56);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation5.spliterator();
        elitisticListPopulation5.setPopulationLimit((int) '4');
        java.lang.Class<?> wildcardClass11 = elitisticListPopulation5.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (short) 100);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int int5 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.lang.Class<?> wildcardClass14 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        java.lang.String str35 = elitisticListPopulation26.toString();
        java.lang.String str36 = elitisticListPopulation26.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation26.addChromosome(chromosome37);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator40 = elitisticListPopulation26.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray44 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45, chromosomeArray44);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation49 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor50 = elitisticListPopulation49.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray51 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, chromosomeArray51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, 1, (double) '4');
        elitisticListPopulation56.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation61.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation66 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str67 = elitisticListPopulation66.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList68 = elitisticListPopulation66.getChromosomes();
        elitisticListPopulation61.setChromosomes(chromosomeList68);
        elitisticListPopulation56.setChromosomes(chromosomeList68);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray71 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList72 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72, chromosomeArray71);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72, 1, (double) '4');
        elitisticListPopulation56.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72);
        elitisticListPopulation49.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72);
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation82 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72, (int) 'a', (double) (byte) -1);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator84 = chromosomeList72.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList72);
        elitisticListPopulation2.setPopulationLimit(32);
        java.lang.String str88 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertNotNull(chromosomeSpliterator40);
        org.junit.Assert.assertNotNull(chromosomeArray44);
        org.junit.Assert.assertArrayEquals(chromosomeArray44, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chromosomeItor50);
        org.junit.Assert.assertNotNull(chromosomeArray51);
        org.junit.Assert.assertArrayEquals(chromosomeArray51, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertNotNull(chromosomeList68);
        org.junit.Assert.assertNotNull(chromosomeArray71);
        org.junit.Assert.assertArrayEquals(chromosomeArray71, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator84);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "[]" + "'", str88, "[]");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        int int17 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        int int10 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation5.spliterator();
        java.lang.String str12 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (short) 100);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        double double5 = elitisticListPopulation2.getElitismRate();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.lang.String str39 = elitisticListPopulation5.toString();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        org.apache.commons.math3.genetics.Population population43 = elitisticListPopulation5.nextGeneration();
        double double44 = elitisticListPopulation5.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation5.getChromosomes();
        int int46 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation16.setPopulationLimit((int) (short) 0);
        int int19 = elitisticListPopulation16.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation24.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str30 = elitisticListPopulation29.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation24.setChromosomes(chromosomeList31);
        java.lang.String str33 = elitisticListPopulation24.toString();
        java.lang.String str34 = elitisticListPopulation24.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation24.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor36 = elitisticListPopulation24.iterator();
        int int37 = elitisticListPopulation24.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray41 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, chromosomeArray41);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, 1, (double) '4');
        elitisticListPopulation40.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray51 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, chromosomeArray51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, 1, (double) '4');
        elitisticListPopulation56.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation61.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation66 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str67 = elitisticListPopulation66.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList68 = elitisticListPopulation66.getChromosomes();
        elitisticListPopulation61.setChromosomes(chromosomeList68);
        elitisticListPopulation56.setChromosomes(chromosomeList68);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList71 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation50.setChromosomes(chromosomeList71);
        elitisticListPopulation24.setChromosomes(chromosomeList71);
        elitisticListPopulation2.setChromosomes(chromosomeList71);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList75 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome76 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(chromosomeItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray41);
        org.junit.Assert.assertArrayEquals(chromosomeArray41, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chromosomeArray51);
        org.junit.Assert.assertArrayEquals(chromosomeArray51, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertNotNull(chromosomeList68);
        org.junit.Assert.assertNotNull(chromosomeList71);
        org.junit.Assert.assertNotNull(chromosomeList75);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int31 = elitisticListPopulation5.getPopulationSize();
        int int32 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor34 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Population population36 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator37 = population36.spliterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(chromosomeItor34);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertNotNull(chromosomeSpliterator37);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        double double48 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator49 = elitisticListPopulation5.spliterator();
        java.lang.String str50 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator53 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator53);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        int int11 = elitisticListPopulation2.getPopulationSize();
        double double12 = elitisticListPopulation2.getElitismRate();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome17 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor14);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, 1, (double) '4');
        elitisticListPopulation12.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation17.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList24);
        elitisticListPopulation12.setChromosomes(chromosomeList24);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator35 = chromosomeList28.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, (int) (short) 100, (double) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation38.getChromosomes();
        int int40 = elitisticListPopulation38.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray41 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, chromosomeArray41);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList42, 1, (double) '4');
        elitisticListPopulation46.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation51.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str57 = elitisticListPopulation56.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation51.setChromosomes(chromosomeList58);
        elitisticListPopulation46.setChromosomes(chromosomeList58);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray61 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62, chromosomeArray61);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation66 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62, 1, (double) '4');
        elitisticListPopulation46.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList68 = elitisticListPopulation46.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation71 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList68, (int) '4', (double) 32);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator72 = chromosomeList68.spliterator();
        elitisticListPopulation38.setChromosomes(chromosomeList68);
        java.lang.String str74 = elitisticListPopulation38.toString();
        org.apache.commons.math3.genetics.Population population75 = elitisticListPopulation38.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor76 = elitisticListPopulation38.iterator();
        elitisticListPopulation38.setPopulationLimit(100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator79 = elitisticListPopulation38.spliterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertArrayEquals(chromosomeArray7, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator35);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray41);
        org.junit.Assert.assertArrayEquals(chromosomeArray41, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertNotNull(chromosomeList58);
        org.junit.Assert.assertNotNull(chromosomeArray61);
        org.junit.Assert.assertArrayEquals(chromosomeArray61, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(chromosomeList68);
        org.junit.Assert.assertNotNull(chromosomeSpliterator72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[]" + "'", str74, "[]");
        org.junit.Assert.assertNotNull(population75);
        org.junit.Assert.assertNotNull(chromosomeItor76);
        org.junit.Assert.assertNotNull(chromosomeSpliterator79);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        int int16 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        java.lang.String str18 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass21 = chromosomeItor20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[null]" + "'", str18, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        double double20 = elitisticListPopulation5.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation5.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList22, (int) (byte) 1, (double) '4');
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeList22);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        int int15 = elitisticListPopulation2.getPopulationLimit();
        int int16 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        elitisticListPopulation19.setPopulationLimit(0);
        java.lang.String str30 = elitisticListPopulation19.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation19.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList31, 10, (double) (-1L));
        elitisticListPopulation2.setChromosomes(chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList31, (int) ' ', (double) (short) 0);
        java.lang.String str39 = elitisticListPopulation38.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 0L);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, 1, (double) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, (int) ' ', (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        int int14 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        int int19 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation2.nextGeneration();
        int int21 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertArrayEquals(chromosomeArray4, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) 'a');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (byte) 0);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation8.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList15);
        elitisticListPopulation8.setPopulationLimit(0);
        java.lang.String str19 = elitisticListPopulation8.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation8.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList20, 32, 10.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList20, (int) '#', 100.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor28 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(chromosomeItor28);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(0);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(0);
        double double18 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, 100.0d);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation8.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, 1, (double) '4');
        elitisticListPopulation15.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList27);
        elitisticListPopulation15.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, 1, (double) '4');
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, (int) (byte) 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, (int) (short) 100, (double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray47 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, chromosomeArray47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, 1, (double) '4');
        elitisticListPopulation46.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, (int) 'a', (double) 'a');
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.Population population58 = elitisticListPopulation43.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator59 = elitisticListPopulation43.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList60);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList60, (int) (short) 10, (double) 0.0f);
        java.lang.String str65 = elitisticListPopulation64.toString();
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertArrayEquals(chromosomeArray10, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chromosomeArray47);
        org.junit.Assert.assertArrayEquals(chromosomeArray47, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(population58);
        org.junit.Assert.assertNotNull(chromosomeSpliterator59);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation5.getChromosomes();
        java.lang.String str10 = elitisticListPopulation5.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation5.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setPopulationLimit((-1));
        java.lang.String str15 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(0);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray24 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, chromosomeArray24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, 1, (double) '4');
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, (int) 'a', (double) 'a');
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, 1, (double) '4');
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        double double42 = elitisticListPopulation20.getElitismRate();
        elitisticListPopulation20.setElitismRate(1.0d);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray45 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, chromosomeArray45);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList46, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor51 = elitisticListPopulation50.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = elitisticListPopulation50.getChromosomes();
        int int53 = elitisticListPopulation50.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor54 = elitisticListPopulation50.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor55 = elitisticListPopulation50.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList56 = elitisticListPopulation50.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList56, (int) (byte) 100, (double) (byte) 100);
        elitisticListPopulation20.setChromosomes(chromosomeList56);
        elitisticListPopulation2.setChromosomes(chromosomeList56);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator62 = chromosomeList56.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList56, (int) (byte) 100, (double) 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeArray24);
        org.junit.Assert.assertArrayEquals(chromosomeArray24, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeArray45);
        org.junit.Assert.assertArrayEquals(chromosomeArray45, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chromosomeItor51);
        org.junit.Assert.assertNotNull(chromosomeList52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor54);
        org.junit.Assert.assertNotNull(chromosomeItor55);
        org.junit.Assert.assertNotNull(chromosomeList56);
        org.junit.Assert.assertNotNull(chromosomeSpliterator62);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (byte) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        java.lang.String str14 = elitisticListPopulation5.toString();
        java.lang.String str15 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor29 = elitisticListPopulation28.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, 1, (double) '4');
        elitisticListPopulation35.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation40.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str46 = elitisticListPopulation45.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = elitisticListPopulation45.getChromosomes();
        elitisticListPopulation40.setChromosomes(chromosomeList47);
        elitisticListPopulation35.setChromosomes(chromosomeList47);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray50 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, chromosomeArray50);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, 1, (double) '4');
        elitisticListPopulation35.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        elitisticListPopulation28.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        elitisticListPopulation22.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, (int) 'a', (double) (byte) -1);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation65.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str71 = elitisticListPopulation70.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList72 = elitisticListPopulation70.getChromosomes();
        elitisticListPopulation65.setChromosomes(chromosomeList72);
        java.lang.String str74 = elitisticListPopulation65.toString();
        java.lang.String str75 = elitisticListPopulation65.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation65.addChromosome(chromosome76);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList78 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList78);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation82 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList78, (int) (short) 100, 0.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList78);
        org.apache.commons.math3.genetics.Chromosome chromosome84 = null;
        elitisticListPopulation2.addChromosome(chromosome84);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor86 = elitisticListPopulation2.iterator();
        java.lang.String str87 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chromosomeItor29);
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertNotNull(chromosomeList47);
        org.junit.Assert.assertNotNull(chromosomeArray50);
        org.junit.Assert.assertArrayEquals(chromosomeArray50, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertNotNull(chromosomeList72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[]" + "'", str74, "[]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[]" + "'", str75, "[]");
        org.junit.Assert.assertNotNull(chromosomeList78);
        org.junit.Assert.assertNotNull(chromosomeItor86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[null, null]" + "'", str87, "[null, null]");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, 100.0d);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation8.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, 1, (double) '4');
        elitisticListPopulation15.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList27);
        elitisticListPopulation15.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, 1, (double) '4');
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, (int) (byte) 1, (double) 10.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, (int) (short) 100, (double) 0L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray47 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, chromosomeArray47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, 1, (double) '4');
        elitisticListPopulation46.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, (int) 'a', (double) 'a');
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.Population population58 = elitisticListPopulation43.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator59 = elitisticListPopulation43.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList60);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator62 = elitisticListPopulation2.spliterator();
        int int63 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertArrayEquals(chromosomeArray10, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chromosomeArray47);
        org.junit.Assert.assertArrayEquals(chromosomeArray47, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(population58);
        org.junit.Assert.assertNotNull(chromosomeSpliterator59);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeSpliterator62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (-1));
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation6.setPopulationLimit((int) (short) 0);
        int int9 = elitisticListPopulation6.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor16 = elitisticListPopulation15.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, 1, (double) '4');
        elitisticListPopulation22.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation27.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str33 = elitisticListPopulation32.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList34);
        elitisticListPopulation22.setChromosomes(chromosomeList34);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, 1, (double) '4');
        elitisticListPopulation22.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator45 = chromosomeList38.spliterator();
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator47 = chromosomeList38.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, (int) (byte) 10, (double) (byte) 1);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation2.setPopulationLimit(35);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        elitisticListPopulation2.setElitismRate((double) 1);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertArrayEquals(chromosomeArray10, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chromosomeItor16);
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertArrayEquals(chromosomeArray17, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertArrayEquals(chromosomeArray37, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator45);
        org.junit.Assert.assertNotNull(chromosomeSpliterator47);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        int int10 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) 10);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        double double14 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation45.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str51 = elitisticListPopulation50.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation45.setChromosomes(chromosomeList52);
        elitisticListPopulation21.setChromosomes(chromosomeList52);
        java.lang.String str55 = elitisticListPopulation21.toString();
        int int56 = elitisticListPopulation21.getPopulationLimit();
        elitisticListPopulation21.setPopulationLimit((int) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray59 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList60, chromosomeArray59);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList60, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor65 = elitisticListPopulation64.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation64.getChromosomes();
        int int67 = elitisticListPopulation64.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor68 = elitisticListPopulation64.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor69 = elitisticListPopulation64.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList70 = elitisticListPopulation64.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList71 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList71);
        elitisticListPopulation2.setChromosomes(chromosomeList71);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertNotNull(chromosomeList52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray59);
        org.junit.Assert.assertArrayEquals(chromosomeArray59, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(chromosomeItor65);
        org.junit.Assert.assertNotNull(chromosomeList66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor68);
        org.junit.Assert.assertNotNull(chromosomeItor69);
        org.junit.Assert.assertNotNull(chromosomeList70);
        org.junit.Assert.assertNotNull(chromosomeList71);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (short) 100);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int int5 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray22 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList23, chromosomeArray22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList23, 1, (double) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList23, (int) ' ', (double) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList23, (int) 'a', (double) 10L);
        double double34 = elitisticListPopulation33.getElitismRate();
        int int35 = elitisticListPopulation33.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList36, (int) '#', (double) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chromosomeArray22);
        org.junit.Assert.assertArrayEquals(chromosomeArray22, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeList36);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        elitisticListPopulation5.setChromosomes(chromosomeList48);
        int int51 = elitisticListPopulation5.getPopulationSize();
        int int52 = elitisticListPopulation5.getPopulationLimit();
        int int53 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit(35);
        java.lang.String str56 = elitisticListPopulation5.toString();
        java.lang.Class<?> wildcardClass57 = elitisticListPopulation5.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation12.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation12.setChromosomes(chromosomeList19);
        java.lang.String str21 = elitisticListPopulation12.toString();
        java.lang.String str22 = elitisticListPopulation12.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation12.addChromosome(chromosome23);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation12.getChromosomes();
        int int26 = elitisticListPopulation12.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation12.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        double double34 = elitisticListPopulation33.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation33.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation38.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation38.addChromosome(chromosome49);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray51 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, chromosomeArray51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, 1, (double) '4');
        elitisticListPopulation38.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52);
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52);
        double double59 = elitisticListPopulation33.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation33.addChromosome(chromosome60);
        elitisticListPopulation33.setPopulationLimit(32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList64 = elitisticListPopulation33.getChromosomes();
        int int65 = elitisticListPopulation33.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation12.setChromosomes(chromosomeList66);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList66, (int) (short) 1, (double) (-1));
        elitisticListPopulation2.setChromosomes(chromosomeList66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation74 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList66, 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeArray51);
        org.junit.Assert.assertArrayEquals(chromosomeArray51, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 52.0d + "'", double59 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 32 + "'", int65 == 32);
        org.junit.Assert.assertNotNull(chromosomeList66);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (-1));
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(10);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (-1));
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        double double15 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        int int8 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList11, (int) (byte) 100, (double) (byte) 100);
        java.lang.String str15 = elitisticListPopulation14.toString();
        java.lang.Class<?> wildcardClass16 = elitisticListPopulation14.getClass();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (-1.0f));
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeItor7);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        elitisticListPopulation14.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        elitisticListPopulation14.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (short) 1, (double) ' ');
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation2.addChromosome(chromosome33);
        int int35 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str36 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor37 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, 1, (double) '4');
        elitisticListPopulation43.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation48.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str54 = elitisticListPopulation53.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation48.setChromosomes(chromosomeList55);
        elitisticListPopulation43.setChromosomes(chromosomeList55);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray58 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList59, chromosomeArray58);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation63 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList59, 1, (double) '4');
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList59);
        org.apache.commons.math3.genetics.Chromosome chromosome65 = null;
        elitisticListPopulation43.addChromosome(chromosome65);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator67 = elitisticListPopulation43.spliterator();
        java.lang.String str68 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList69 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList69);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation73 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList69, 35, (double) 100);
        elitisticListPopulation73.setElitismRate((double) 0L);
        org.apache.commons.math3.genetics.Population population76 = elitisticListPopulation73.nextGeneration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[null]" + "'", str36, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor37);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(chromosomeList55);
        org.junit.Assert.assertNotNull(chromosomeArray58);
        org.junit.Assert.assertArrayEquals(chromosomeArray58, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[null]" + "'", str68, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList69);
        org.junit.Assert.assertNotNull(population76);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation16.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation16.spliterator();
        int int19 = elitisticListPopulation16.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation16.addChromosome(chromosome20);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList22);
        java.lang.String str24 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation2.addChromosome(chromosome25);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) 10);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[null]" + "'", str6, "[null]");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setElitismRate(0.0d);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation17.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation17.getChromosomes();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation17.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation26.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray48 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49, chromosomeArray48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49, 1, (double) '4');
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList49);
        double double57 = elitisticListPopulation17.getElitismRate();
        elitisticListPopulation17.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation17.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation63 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList60, (int) 'a', (double) 100.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation66 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList60, (int) (short) 100, (double) 0L);
        elitisticListPopulation5.setChromosomes(chromosomeList60);
        org.apache.commons.math3.genetics.Population population68 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeArray48);
        org.junit.Assert.assertArrayEquals(chromosomeArray48, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 52.0d + "'", double57 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(population68);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        elitisticListPopulation14.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        elitisticListPopulation14.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (short) 1, (double) ' ');
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        int int33 = elitisticListPopulation2.getPopulationLimit();
        int int34 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator35 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        java.lang.Class<?> wildcardClass38 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(chromosomeSpliterator35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        double double31 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation5.addChromosome(chromosome32);
        elitisticListPopulation5.setPopulationLimit(32);
        elitisticListPopulation5.setElitismRate(0.0d);
        elitisticListPopulation5.setPopulationLimit((int) '4');
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        int int10 = elitisticListPopulation5.getPopulationSize();
        int int11 = elitisticListPopulation5.getPopulationSize();
        double double12 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        int int14 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation17.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList24);
        java.lang.String str26 = elitisticListPopulation17.toString();
        java.lang.String str27 = elitisticListPopulation17.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation17.addChromosome(chromosome28);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation17.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation17.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation40.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, 1, (double) '4');
        elitisticListPopulation47.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation52.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation57 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str58 = elitisticListPopulation57.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation52.setChromosomes(chromosomeList59);
        elitisticListPopulation47.setChromosomes(chromosomeList59);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray62 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, chromosomeArray62);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation67 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, 1, (double) '4');
        elitisticListPopulation47.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        elitisticListPopulation40.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation73 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, (int) 'a', (double) (byte) -1);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList75 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList75);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation79 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList75, 2, 35.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertNotNull(chromosomeList59);
        org.junit.Assert.assertNotNull(chromosomeArray62);
        org.junit.Assert.assertArrayEquals(chromosomeArray62, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(chromosomeList75);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(35, (double) 0);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        int int7 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 10.0f);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList13);
        elitisticListPopulation5.setPopulationLimit((-1));
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(35, (double) (-1));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, (double) 100.0f);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        elitisticListPopulation14.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        elitisticListPopulation14.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (short) 1, (double) ' ');
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) '#', (double) 1.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (short) 1, 0.0d);
        elitisticListPopulation38.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Population population41 = elitisticListPopulation38.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation44.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation49 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str50 = elitisticListPopulation49.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation49.getChromosomes();
        elitisticListPopulation44.setChromosomes(chromosomeList51);
        java.lang.String str53 = elitisticListPopulation44.toString();
        java.lang.String str54 = elitisticListPopulation44.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation44.addChromosome(chromosome55);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList57);
        int int59 = elitisticListPopulation38.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(population41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(chromosomeList57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (-1.0f));
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation5.spliterator();
        elitisticListPopulation5.setPopulationLimit(100);
        elitisticListPopulation5.setPopulationLimit(100);
        java.lang.String str13 = elitisticListPopulation5.toString();
        java.lang.String str14 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation5.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome16 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (-1));
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) '4');
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeItor11);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray6 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, chromosomeArray6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        elitisticListPopulation18.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        elitisticListPopulation18.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, 1, (double) '4');
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator41 = chromosomeList34.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        double double43 = elitisticListPopulation2.getElitismRate();
        int int44 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator45 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray6);
        org.junit.Assert.assertArrayEquals(chromosomeArray6, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator45);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation8.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, 1, (double) '4');
        elitisticListPopulation15.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation20.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList27);
        elitisticListPopulation15.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray30 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, chromosomeArray30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, 1, (double) '4');
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList31, (int) 'a', (double) (byte) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation41.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor43 = elitisticListPopulation41.iterator();
        int int44 = elitisticListPopulation41.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertArrayEquals(chromosomeArray10, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeArray30);
        org.junit.Assert.assertArrayEquals(chromosomeArray30, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertNotNull(chromosomeItor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        java.lang.String str48 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, 0, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 10.0f);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        int int12 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        java.lang.String str10 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (short) -1);
        double double13 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, 1, (double) '4');
        elitisticListPopulation19.setPopulationLimit(0);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.String str23 = elitisticListPopulation19.toString();
        java.lang.String str24 = elitisticListPopulation19.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, (int) 'a', (double) 'a');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator38 = chromosomeList29.spliterator();
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.Population population44 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator38);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(population44);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation5.spliterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationSize();
        int int18 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass19 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) (byte) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, 1, 10.0d);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList3.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, 100, (double) (byte) 1);
        int int11 = elitisticListPopulation10.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation10.iterator();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(chromosomeItor12);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        int int39 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor40 = elitisticListPopulation5.iterator();
        java.lang.String str41 = elitisticListPopulation5.toString();
        double double42 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation5.addChromosome(chromosome43);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, 1, (double) '4');
        elitisticListPopulation21.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation26.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        elitisticListPopulation21.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        double double45 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        double double48 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit(1);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertArrayEquals(chromosomeArray16, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(52, 0.0d);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        double double9 = elitisticListPopulation2.getElitismRate();
        int int10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, 0.0d);
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 1.0f);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = chromosomeList24.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 100, (double) (short) 10);
        int int35 = elitisticListPopulation34.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        elitisticListPopulation5.setChromosomes(chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList48, (int) (short) 10, 52.0d);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator54 = elitisticListPopulation53.spliterator();
        int int55 = elitisticListPopulation53.getPopulationSize();
        int int56 = elitisticListPopulation53.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeSpliterator54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        int int10 = elitisticListPopulation5.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        java.lang.String str31 = elitisticListPopulation5.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, 1, (double) '4');
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        double double43 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Population population44 = elitisticListPopulation5.nextGeneration();
        int int45 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate(1.0d);
        org.apache.commons.math3.genetics.Population population48 = elitisticListPopulation5.nextGeneration();
        int int49 = elitisticListPopulation5.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation5.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        int int6 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, 35, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        java.lang.String str27 = elitisticListPopulation5.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation5.getChromosomes();
        double double29 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor30 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor30);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation5.getChromosomes();
        int int21 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation5.iterator();
        int int23 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation5.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Population population28 = elitisticListPopulation5.nextGeneration();
        int int29 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(population28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        elitisticListPopulation14.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        elitisticListPopulation14.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (short) 1, (double) ' ');
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) '#', (double) 1.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (short) 1, 0.0d);
        double double39 = elitisticListPopulation38.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation38.getChromosomes();
        double double41 = elitisticListPopulation38.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation5.iterator();
        int int16 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, 1, (double) '4');
        double double27 = elitisticListPopulation26.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor28 = elitisticListPopulation26.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation31.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator34 = chromosomeList33.spliterator();
        elitisticListPopulation26.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray39 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, chromosomeArray39);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, 1, (double) '4');
        elitisticListPopulation38.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray49 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList50 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList50, chromosomeArray49);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList50, 1, (double) '4');
        elitisticListPopulation54.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation59.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str65 = elitisticListPopulation64.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation59.setChromosomes(chromosomeList66);
        elitisticListPopulation54.setChromosomes(chromosomeList66);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList69 = elitisticListPopulation54.getChromosomes();
        elitisticListPopulation48.setChromosomes(chromosomeList69);
        elitisticListPopulation26.setChromosomes(chromosomeList69);
        org.apache.commons.math3.genetics.Population population72 = elitisticListPopulation26.nextGeneration();
        java.lang.String str73 = elitisticListPopulation26.toString();
        int int74 = elitisticListPopulation26.getPopulationSize();
        elitisticListPopulation26.setPopulationLimit((int) (short) -1);
        org.apache.commons.math3.genetics.Chromosome chromosome77 = null;
        elitisticListPopulation26.addChromosome(chromosome77);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList79 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList79);
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeSpliterator34);
        org.junit.Assert.assertNotNull(chromosomeArray39);
        org.junit.Assert.assertArrayEquals(chromosomeArray39, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chromosomeArray49);
        org.junit.Assert.assertArrayEquals(chromosomeArray49, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertNotNull(chromosomeList66);
        org.junit.Assert.assertNotNull(chromosomeList69);
        org.junit.Assert.assertNotNull(population72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(chromosomeList79);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) (byte) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, 1, 10.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = null;
        elitisticListPopulation6.setChromosomes(chromosomeList7);
        elitisticListPopulation6.setPopulationLimit(32);
        int int11 = elitisticListPopulation6.getPopulationLimit();
        double double12 = elitisticListPopulation6.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, 32.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 100L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation11.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str17 = elitisticListPopulation16.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList18);
        java.lang.String str20 = elitisticListPopulation11.toString();
        java.lang.String str21 = elitisticListPopulation11.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation25.setPopulationLimit((int) (short) 0);
        int int28 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList29);
        elitisticListPopulation5.setChromosomes(chromosomeList29);
        elitisticListPopulation2.setChromosomes(chromosomeList29);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chromosomeList29);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        java.lang.String str10 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (short) -1);
        double double13 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, 1, (double) '4');
        elitisticListPopulation19.setPopulationLimit(0);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.String str23 = elitisticListPopulation19.toString();
        java.lang.String str24 = elitisticListPopulation19.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, (int) 'a', (double) 'a');
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator38 = chromosomeList29.spliterator();
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator42 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation5.addChromosome(chromosome43);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertArrayEquals(chromosomeArray14, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator38);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(chromosomeSpliterator42);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (short) 100);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        double double9 = elitisticListPopulation8.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation8.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation13.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = chromosomeList15.spliterator();
        elitisticListPopulation8.setChromosomes(chromosomeList15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, 1, (double) '4');
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, 1, (double) '4');
        elitisticListPopulation36.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation41.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str47 = elitisticListPopulation46.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation41.setChromosomes(chromosomeList48);
        elitisticListPopulation36.setChromosomes(chromosomeList48);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation30.setChromosomes(chromosomeList51);
        elitisticListPopulation8.setChromosomes(chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList51, (int) (short) 10, 52.0d);
        elitisticListPopulation2.setChromosomes(chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList51, (int) (byte) 100, (double) (short) 1);
        org.apache.commons.math3.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation60.addChromosome(chromosome61);
        org.apache.commons.math3.genetics.Population population63 = elitisticListPopulation60.nextGeneration();
        int int64 = elitisticListPopulation60.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList65 = elitisticListPopulation60.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertArrayEquals(chromosomeArray21, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertArrayEquals(chromosomeArray31, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(chromosomeList65);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        double double17 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation23.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation28.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation28.setChromosomes(chromosomeList35);
        elitisticListPopulation23.setChromosomes(chromosomeList35);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation23.getChromosomes();
        int int39 = elitisticListPopulation23.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor40 = elitisticListPopulation23.iterator();
        elitisticListPopulation23.setPopulationLimit((int) (short) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList43);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList45, 100, (double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation48.getChromosomes();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor40);
        org.junit.Assert.assertNotNull(chromosomeList43);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList49);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        int int10 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation18.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str24 = elitisticListPopulation23.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation18.setChromosomes(chromosomeList25);
        java.lang.String str27 = elitisticListPopulation18.toString();
        java.lang.String str28 = elitisticListPopulation18.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation18.addChromosome(chromosome29);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation18.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator32 = elitisticListPopulation18.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor42 = elitisticListPopulation41.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray43 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, chromosomeArray43);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList44, 1, (double) '4');
        elitisticListPopulation48.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation53.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str59 = elitisticListPopulation58.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation53.setChromosomes(chromosomeList60);
        elitisticListPopulation48.setChromosomes(chromosomeList60);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray63 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList64 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, chromosomeArray63);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, 1, (double) '4');
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        elitisticListPopulation41.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        elitisticListPopulation35.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation74 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64, (int) 'a', (double) (byte) -1);
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList64);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList76 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList76);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertNotNull(chromosomeSpliterator32);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chromosomeItor42);
        org.junit.Assert.assertNotNull(chromosomeArray43);
        org.junit.Assert.assertArrayEquals(chromosomeArray43, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[]" + "'", str59, "[]");
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeArray63);
        org.junit.Assert.assertArrayEquals(chromosomeArray63, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(chromosomeList76);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 10, (double) 'a');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, (-1), 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, 1, (double) '4');
        elitisticListPopulation16.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation21.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str27 = elitisticListPopulation26.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList28);
        elitisticListPopulation16.setChromosomes(chromosomeList28);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, 1, (double) '4');
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, (int) 'a', (double) 100.0f);
        elitisticListPopulation41.setPopulationLimit(2);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation41.setElitismRate(32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertArrayEquals(chromosomeArray11, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertArrayEquals(chromosomeArray31, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(97, 1.0d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation5.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation5.iterator();
        int int18 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation5.addChromosome(chromosome22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome24 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, 1, (double) '4');
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation9.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation23.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation28.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str34 = elitisticListPopulation33.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation28.setChromosomes(chromosomeList35);
        elitisticListPopulation23.setChromosomes(chromosomeList35);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, 1, (double) '4');
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation47.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str53 = elitisticListPopulation52.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList54 = elitisticListPopulation52.getChromosomes();
        elitisticListPopulation47.setChromosomes(chromosomeList54);
        elitisticListPopulation23.setChromosomes(chromosomeList54);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray57 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList58 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58, chromosomeArray57);
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList58);
        int int63 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome64 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertArrayEquals(chromosomeArray10, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertArrayEquals(chromosomeArray38, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertNotNull(chromosomeList54);
        org.junit.Assert.assertNotNull(chromosomeArray57);
        org.junit.Assert.assertArrayEquals(chromosomeArray57, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, 1, (double) '4');
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, (int) 'a', (double) 'a');
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        double double24 = elitisticListPopulation2.getElitismRate();
        java.lang.String str25 = elitisticListPopulation2.toString();
        int int26 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population27 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor28 = elitisticListPopulation2.iterator();
        java.lang.String str29 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertArrayEquals(chromosomeArray12, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertNotNull(chromosomeItor28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray39 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, chromosomeArray39);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40);
        double double43 = elitisticListPopulation5.getElitismRate();
        java.lang.String str44 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeArray39);
        org.junit.Assert.assertArrayEquals(chromosomeArray39, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray3 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, chromosomeArray3);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4, 1, (double) '4');
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList4);
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        int int14 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation27.addChromosome(chromosome28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator30 = elitisticListPopulation27.spliterator();
        int int31 = elitisticListPopulation27.getPopulationSize();
        elitisticListPopulation27.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation27.addChromosome(chromosome34);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        elitisticListPopulation41.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation46.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str52 = elitisticListPopulation51.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation46.setChromosomes(chromosomeList53);
        elitisticListPopulation41.setChromosomes(chromosomeList53);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, 1, (double) '4');
        elitisticListPopulation41.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation65.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation70 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str71 = elitisticListPopulation70.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList72 = elitisticListPopulation70.getChromosomes();
        elitisticListPopulation65.setChromosomes(chromosomeList72);
        elitisticListPopulation41.setChromosomes(chromosomeList72);
        java.lang.String str75 = elitisticListPopulation41.toString();
        int int76 = elitisticListPopulation41.getPopulationLimit();
        double double77 = elitisticListPopulation41.getElitismRate();
        elitisticListPopulation41.setElitismRate((double) 1L);
        int int80 = elitisticListPopulation41.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList81 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList81);
        elitisticListPopulation2.setChromosomes(chromosomeList81);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation86 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList81, 32, (double) 1L);
        org.junit.Assert.assertNotNull(chromosomeArray3);
        org.junit.Assert.assertArrayEquals(chromosomeArray3, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertArrayEquals(chromosomeArray56, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[]" + "'", str71, "[]");
        org.junit.Assert.assertNotNull(chromosomeList72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[]" + "'", str75, "[]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 52.0d + "'", double77 == 52.0d);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(chromosomeList81);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        double double8 = elitisticListPopulation2.getElitismRate();
        double double9 = elitisticListPopulation2.getElitismRate();
        java.lang.String str10 = elitisticListPopulation2.toString();
        double double11 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit(100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (int) ' ', (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation8.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation8.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (byte) 1, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 0, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', 0.0d);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass4 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), 97.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation5.spliterator();
        int int8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation5.iterator();
        int int10 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        int int12 = elitisticListPopulation5.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        double double15 = elitisticListPopulation5.getElitismRate();
        int int16 = elitisticListPopulation5.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation5.setElitismRate((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray6 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, chromosomeArray6);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList7, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        elitisticListPopulation18.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation23.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str29 = elitisticListPopulation28.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList30);
        elitisticListPopulation18.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, 1, (double) '4');
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator41 = chromosomeList34.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34);
        double double43 = elitisticListPopulation2.getElitismRate();
        java.lang.String str44 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population45 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeArray6);
        org.junit.Assert.assertArrayEquals(chromosomeArray6, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.lang.String str39 = elitisticListPopulation5.toString();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        double double43 = elitisticListPopulation5.getElitismRate();
        double double44 = elitisticListPopulation5.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor46 = elitisticListPopulation5.iterator();
        int int47 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeItor46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList15);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation2.addChromosome(chromosome15);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(1);
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray24 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, chromosomeArray24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, 1, (double) '4');
        elitisticListPopulation23.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, 1, (double) 1);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        java.lang.String str38 = elitisticListPopulation2.toString();
        double double39 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
        org.junit.Assert.assertNotNull(chromosomeArray24);
        org.junit.Assert.assertArrayEquals(chromosomeArray24, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.lang.String str8 = elitisticListPopulation2.toString();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        double double12 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, 1, (double) '4');
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray28 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, chromosomeArray28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList29, 1, (double) '4');
        elitisticListPopulation33.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation38.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        elitisticListPopulation33.setChromosomes(chromosomeList45);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList50 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList50);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList50, (int) (short) 1, (double) 100);
        int int55 = elitisticListPopulation54.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertArrayEquals(chromosomeArray18, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeArray28);
        org.junit.Assert.assertArrayEquals(chromosomeArray28, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeList50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        double double31 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation5.addChromosome(chromosome32);
        elitisticListPopulation5.setPopulationLimit(32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation5.getChromosomes();
        int int37 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation5.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertNotNull(chromosomeList39);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str11 = elitisticListPopulation10.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation10.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        elitisticListPopulation5.setChromosomes(chromosomeList12);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation5.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation5.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation5.iterator();
        int int18 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation5.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation5.addChromosome(chromosome22);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator24 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation5.addChromosome(chromosome25);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertNotNull(chromosomeSpliterator24);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', 35.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.lang.String str39 = elitisticListPopulation5.toString();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) 'a');
        org.apache.commons.math3.genetics.Population population43 = elitisticListPopulation5.nextGeneration();
        double double44 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor45 = elitisticListPopulation5.iterator();
        double double46 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator47 = elitisticListPopulation5.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation5.addChromosome(chromosome48);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator47);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray39 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, chromosomeArray39);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList40);
        java.lang.String str46 = elitisticListPopulation5.toString();
        int int47 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str48 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeArray39);
        org.junit.Assert.assertArrayEquals(chromosomeArray39, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation20.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList22, 100, (double) ' ');
        elitisticListPopulation26.setPopulationLimit(35);
        int int29 = elitisticListPopulation26.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertArrayEquals(chromosomeArray15, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        double double13 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        int int15 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation25.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, 1, (double) '4');
        elitisticListPopulation32.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation37.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str43 = elitisticListPopulation42.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation37.setChromosomes(chromosomeList44);
        elitisticListPopulation32.setChromosomes(chromosomeList44);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray47 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, chromosomeArray47);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, 1, (double) '4');
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48, (int) 'a', (double) (byte) -1);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList48);
        int int60 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str61 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome62 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertArrayEquals(chromosomeArray27, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertNotNull(chromosomeArray47);
        org.junit.Assert.assertArrayEquals(chromosomeArray47, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) (short) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str8 = elitisticListPopulation7.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList9);
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        int int14 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation17.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList24);
        java.lang.String str26 = elitisticListPopulation17.toString();
        java.lang.String str27 = elitisticListPopulation17.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation17.addChromosome(chromosome28);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation17.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation17.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation40 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation40.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray42 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, chromosomeArray42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList43, 1, (double) '4');
        elitisticListPopulation47.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation52.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation57 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str58 = elitisticListPopulation57.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation52.setChromosomes(chromosomeList59);
        elitisticListPopulation47.setChromosomes(chromosomeList59);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray62 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, chromosomeArray62);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation67 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, 1, (double) '4');
        elitisticListPopulation47.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        elitisticListPopulation40.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation73 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63, (int) 'a', (double) (byte) -1);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList63);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList75 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList75);
        org.apache.commons.math3.genetics.Chromosome chromosome77 = null;
        elitisticListPopulation2.addChromosome(chromosome77);
        int int79 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertArrayEquals(chromosomeArray35, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(chromosomeArray42);
        org.junit.Assert.assertArrayEquals(chromosomeArray42, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertNotNull(chromosomeList59);
        org.junit.Assert.assertNotNull(chromosomeArray62);
        org.junit.Assert.assertArrayEquals(chromosomeArray62, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(chromosomeList75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation5.setChromosomes(chromosomeList17);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation29.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str35 = elitisticListPopulation34.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList36);
        elitisticListPopulation5.setChromosomes(chromosomeList36);
        java.lang.String str39 = elitisticListPopulation5.toString();
        int int40 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation5.iterator();
        java.lang.String str42 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (byte) -1);
        java.lang.String str45 = elitisticListPopulation5.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor46 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation5.addChromosome(chromosome47);
        int int49 = elitisticListPopulation5.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population50 = elitisticListPopulation5.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        elitisticListPopulation5.setPopulationLimit(0);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        int int10 = elitisticListPopulation5.getPopulationSize();
        int int11 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        elitisticListPopulation5.setPopulationLimit(100);
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        int int7 = elitisticListPopulation5.getPopulationSize();
        int int8 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation11.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str17 = elitisticListPopulation16.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList18);
        java.lang.String str20 = elitisticListPopulation11.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        double double29 = elitisticListPopulation28.getElitismRate();
        org.apache.commons.math3.genetics.Population population30 = elitisticListPopulation28.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor31 = elitisticListPopulation28.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList32);
        java.lang.String str34 = elitisticListPopulation5.toString();
        java.lang.String str35 = elitisticListPopulation5.toString();
        double double36 = elitisticListPopulation5.getElitismRate();
        java.lang.String str37 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertNotNull(population30);
        org.junit.Assert.assertNotNull(chromosomeItor31);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) 10);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation9.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation9.getChromosomes();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation9.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation18.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray20 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, chromosomeArray20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList21, 1, (double) '4');
        elitisticListPopulation25.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation30.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str36 = elitisticListPopulation35.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation30.setChromosomes(chromosomeList37);
        elitisticListPopulation25.setChromosomes(chromosomeList37);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray40 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, chromosomeArray40);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, 1, (double) '4');
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41, (int) (byte) 100, (double) 10.0f);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList41);
        int int53 = elitisticListPopulation2.getPopulationLimit();
        int int54 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertArrayEquals(chromosomeArray4, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertArrayEquals(chromosomeArray13, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertNotNull(chromosomeArray20);
        org.junit.Assert.assertArrayEquals(chromosomeArray20, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(chromosomeArray40);
        org.junit.Assert.assertArrayEquals(chromosomeArray40, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (short) 100);
        org.apache.commons.math3.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        double double5 = elitisticListPopulation2.getElitismRate();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList7, (int) (byte) 10, 52.0d);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = chromosomeList7.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList7, (int) 'a', (-1.0d));
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation14.nextGeneration();
        elitisticListPopulation14.setPopulationLimit(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(population15);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) (byte) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray9 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, chromosomeArray9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList10, 1, (double) '4');
        elitisticListPopulation14.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        elitisticListPopulation14.setChromosomes(chromosomeList26);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation14.getChromosomes();
        int int30 = elitisticListPopulation14.getPopulationLimit();
        java.lang.String str31 = elitisticListPopulation14.toString();
        double double32 = elitisticListPopulation14.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray33 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, chromosomeArray33);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList34, 1, (double) '4');
        double double39 = elitisticListPopulation38.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor40 = elitisticListPopulation38.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str44 = elitisticListPopulation43.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation43.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = chromosomeList45.spliterator();
        elitisticListPopulation38.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray51 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList52 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, chromosomeArray51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, 1, (double) '4');
        elitisticListPopulation50.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList52, (int) 'a', (double) 'a');
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray61 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62, chromosomeArray61);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation66 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62, 1, (double) '4');
        elitisticListPopulation66.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation71 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation71.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation76 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str77 = elitisticListPopulation76.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList78 = elitisticListPopulation76.getChromosomes();
        elitisticListPopulation71.setChromosomes(chromosomeList78);
        elitisticListPopulation66.setChromosomes(chromosomeList78);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList81 = elitisticListPopulation66.getChromosomes();
        elitisticListPopulation60.setChromosomes(chromosomeList81);
        elitisticListPopulation38.setChromosomes(chromosomeList81);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation86 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList81, (int) (short) 10, 52.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation89 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList81, (int) (short) 100, (double) (short) 100);
        elitisticListPopulation14.setChromosomes(chromosomeList81);
        elitisticListPopulation2.setChromosomes(chromosomeList81);
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeArray9);
        org.junit.Assert.assertArrayEquals(chromosomeArray9, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 52.0d + "'", double32 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeArray33);
        org.junit.Assert.assertArrayEquals(chromosomeArray33, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 52.0d + "'", double39 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
        org.junit.Assert.assertNotNull(chromosomeArray51);
        org.junit.Assert.assertArrayEquals(chromosomeArray51, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(chromosomeArray61);
        org.junit.Assert.assertArrayEquals(chromosomeArray61, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[]" + "'", str77, "[]");
        org.junit.Assert.assertNotNull(chromosomeList78);
        org.junit.Assert.assertNotNull(chromosomeList81);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        double double6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation10.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str16 = elitisticListPopulation15.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList17);
        elitisticListPopulation10.setPopulationLimit(0);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation10.addChromosome(chromosome21);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, 1, (double) '4');
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int31 = elitisticListPopulation5.getPopulationSize();
        int int32 = elitisticListPopulation5.getPopulationSize();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation5.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor34 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, 1, (double) '4');
        double double42 = elitisticListPopulation41.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor43 = elitisticListPopulation41.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str47 = elitisticListPopulation46.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation46.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator49 = chromosomeList48.spliterator();
        elitisticListPopulation41.setChromosomes(chromosomeList48);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor51 = elitisticListPopulation41.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator52 = elitisticListPopulation41.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor53 = elitisticListPopulation41.iterator();
        int int54 = elitisticListPopulation41.getPopulationSize();
        int int55 = elitisticListPopulation41.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor56 = elitisticListPopulation41.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList57);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator59 = chromosomeList57.spliterator();
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertArrayEquals(chromosomeArray23, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(chromosomeItor34);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertArrayEquals(chromosomeArray36, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertNotNull(chromosomeItor43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertNotNull(chromosomeSpliterator49);
        org.junit.Assert.assertNotNull(chromosomeItor51);
        org.junit.Assert.assertNotNull(chromosomeSpliterator52);
        org.junit.Assert.assertNotNull(chromosomeItor53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor56);
        org.junit.Assert.assertNotNull(chromosomeList57);
        org.junit.Assert.assertNotNull(chromosomeSpliterator59);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation5.spliterator();
        elitisticListPopulation5.setPopulationLimit(100);
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        int int15 = elitisticListPopulation5.getPopulationLimit();
        double double16 = elitisticListPopulation5.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation19.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str25 = elitisticListPopulation24.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation19.setChromosomes(chromosomeList26);
        java.lang.String str28 = elitisticListPopulation19.toString();
        java.lang.String str29 = elitisticListPopulation19.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation19.addChromosome(chromosome30);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation19.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = elitisticListPopulation19.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, 1, (double) '4');
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor43 = elitisticListPopulation42.iterator();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray44 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45, chromosomeArray44);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation49 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45, 1, (double) '4');
        elitisticListPopulation49.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        elitisticListPopulation54.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation59 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) 10L);
        java.lang.String str60 = elitisticListPopulation59.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList61 = elitisticListPopulation59.getChromosomes();
        elitisticListPopulation54.setChromosomes(chromosomeList61);
        elitisticListPopulation49.setChromosomes(chromosomeList61);
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray64 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList65 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65, chromosomeArray64);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation69 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65, 1, (double) '4');
        elitisticListPopulation49.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65);
        elitisticListPopulation42.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65);
        elitisticListPopulation36.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation75 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65, (int) 'a', (double) (byte) -1);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList65);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList77 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation5.setChromosomes(chromosomeList77);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation81 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList77, 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertArrayEquals(chromosomeArray0, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertArrayEquals(chromosomeArray37, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chromosomeItor43);
        org.junit.Assert.assertNotNull(chromosomeArray44);
        org.junit.Assert.assertArrayEquals(chromosomeArray44, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertNotNull(chromosomeList61);
        org.junit.Assert.assertNotNull(chromosomeArray64);
        org.junit.Assert.assertArrayEquals(chromosomeArray64, new org.apache.commons.math3.genetics.Chromosome[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(chromosomeList77);
    }
}

