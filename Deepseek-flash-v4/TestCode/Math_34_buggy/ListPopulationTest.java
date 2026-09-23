package org.apache.commons.math3.genetics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

public class ListPopulationTest {

    private static class TestChromosome extends Chromosome {
        private final double fitness;

        public TestChromosome(double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double getFitness() {
            return fitness;
        }

        @Override
        protected boolean isSame(Chromosome another) {
            return another instanceof TestChromosome && 
                   this.fitness == ((TestChromosome)another).fitness;
        }
    }

    private TestChromosome makeChromosome(double fitness) {
        return new TestChromosome(fitness);
    }

    @Test
    public void testConstructorWithEmptyListAndValidLimit() {
        ListPopulation pop = new ListPopulation(10) {};
        assertEquals(0, pop.getPopulationSize());
        assertEquals(10, pop.getPopulationLimit());
        assertNotNull(pop.getChromosomes());
        assertEquals(0, pop.getChromosomes().size());
    }

    @Test
    public void testConstructorWithNullChromosomeList() {
        try {
            @SuppressWarnings("unused")
            ListPopulation pop = new ListPopulation((List<Chromosome>) null, 10) {};
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithZeroPopulationLimit() {
        try {
            @SuppressWarnings("unused")
            ListPopulation pop = new ListPopulation(0) {};
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNegativePopulationLimit() {
        try {
            @SuppressWarnings("unused")
            ListPopulation pop = new ListPopulation(-1) {};
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithChromosomesExceedingLimit() {
        List<Chromosome> chromosomes = Arrays.asList(
            makeChromosome(1.0), makeChromosome(2.0), makeChromosome(3.0)
        );
        try {
            @SuppressWarnings("unused")
            ListPopulation pop = new ListPopulation(chromosomes, 2) {};
            fail("Expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithChromosomesEqualsLimit() {
        List<Chromosome> chromosomes = Arrays.asList(
            makeChromosome(1.0), makeChromosome(2.0)
        );
        ListPopulation pop = new ListPopulation(chromosomes, 2) {};
        assertEquals(2, pop.getPopulationSize());
        assertEquals(2, pop.getPopulationLimit());
    }

    @Test
    public void testSetChromosomesValid() {
        ListPopulation pop = new ListPopulation(5) {};
        List<Chromosome> newChromosomes = Arrays.asList(
            makeChromosome(5.0), makeChromosome(6.0)
        );
        pop.setChromosomes(newChromosomes);
        assertEquals(2, pop.getPopulationSize());
        assertSame(newChromosomes.get(0), pop.getChromosomes().get(0));
        assertSame(newChromosomes.get(1), pop.getChromosomes().get(1));
    }

    @Test
    public void testSetChromosomesNull() {
        ListPopulation pop = new ListPopulation(5) {};
        try {
            pop.setChromosomes(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetChromosomesTooMany() {
        ListPopulation pop = new ListPopulation(2) {};
        List<Chromosome> newChromosomes = Arrays.asList(
            makeChromosome(1.0), makeChromosome(2.0), makeChromosome(3.0)
        );
        try {
            pop.setChromosomes(newChromosomes);
            fail("Expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException e) {
            // expected
        }
    }

    @Test
    public void testAddChromosomesValid() {
        ListPopulation pop = new ListPopulation(5) {};
        pop.addChromosomes(Arrays.asList(makeChromosome(1.0), makeChromosome(2.0)));
        assertEquals(2, pop.getPopulationSize());
    }

    @Test
    public void testAddChromosomesTooMany() {
        ListPopulation pop = new ListPopulation(2) {};
        pop.addChromosomes(Collections.singletonList(makeChromosome(1.0)));
        try {
            pop.addChromosomes(Arrays.asList(makeChromosome(2.0), makeChromosome(3.0)));
            fail("Expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException e) {
            // expected
        }
    }

    @Test
    public void testAddChromosomeValid() {
        ListPopulation pop = new ListPopulation(3) {};
        pop.addChromosome(makeChromosome(1.0));
        pop.addChromosome(makeChromosome(2.0));
        assertEquals(2, pop.getPopulationSize());
    }

    @Test
    public void testAddChromosomeExceedsLimit() {
        ListPopulation pop = new ListPopulation(2) {};
        pop.addChromosome(makeChromosome(1.0));
        pop.addChromosome(makeChromosome(2.0));
        try {
            pop.addChromosome(makeChromosome(3.0));
            fail("Expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException e) {
            // expected
        }
    }

    @Test
    public void testGetFittestChromosomeSingleChromosome() {
        TestChromosome only = makeChromosome(5.0);
        ListPopulation pop = new ListPopulation(Collections.<Chromosome>singletonList(only), 1) {};
        assertSame(only, pop.getFittestChromosome());
    }

    @Test
    public void testGetFittestChromosomeMultiple() {
        TestChromosome fitter = makeChromosome(10.0);
        List<Chromosome> chromosomes = Arrays.asList(
            makeChromosome(3.0), fitter, makeChromosome(7.0)
        );
        ListPopulation pop = new ListPopulation(chromosomes, 5) {};
        assertSame(fitter, pop.getFittestChromosome());
    }

    @Test
    public void testGetPopulationLimitInitial() {
        ListPopulation pop = new ListPopulation(10) {};
        assertEquals(10, pop.getPopulationLimit());
    }

    @Test
    public void testSetPopulationLimitValid() {
        ListPopulation pop = new ListPopulation(5) {};
        pop.setPopulationLimit(10);
        assertEquals(10, pop.getPopulationLimit());
    }

    @Test
    public void testSetPopulationLimitZero() {
        ListPopulation pop = new ListPopulation(5) {};
        try {
            pop.setPopulationLimit(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testSetPopulationLimitNegative() {
        ListPopulation pop = new ListPopulation(5) {};
        try {
            pop.setPopulationLimit(-3);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testSetPopulationLimitLessThanCurrentSize() {
        ListPopulation pop = new ListPopulation(5) {};
        pop.addChromosomes(Arrays.asList(makeChromosome(1.0), makeChromosome(2.0)));
        try {
            pop.setPopulationLimit(1);
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            // expected
        }
    }

    @Test
    public void testGetPopulationSizeEmpty() {
        ListPopulation pop = new ListPopulation(5) {};
        assertEquals(0, pop.getPopulationSize());
    }

    @Test
    public void testGetPopulationSizeNonEmpty() {
        ListPopulation pop = new ListPopulation(5) {};
        pop.addChromosomes(Arrays.asList(makeChromosome(1.0), makeChromosome(2.0), makeChromosome(3.0)));
        assertEquals(3, pop.getPopulationSize());
    }

    @Test
    public void testToStringEmpty() {
        ListPopulation pop = new ListPopulation(3) {};
        assertEquals("[]", pop.toString());
    }

    @Test
    public void testToStringNonEmpty() {
        ListPopulation pop = new ListPopulation(3) {};
        pop.addChromosome(makeChromosome(1.0));
        String s = pop.toString();
        assertTrue(s.contains("1.0"));
    }

    @Test
    public void testIteratorEmpty() {
        ListPopulation pop = new ListPopulation(3) {};
        Iterator<Chromosome> iterator = pop.iterator();
        assertNotNull(iterator);
        assertTrue(!iterator.hasNext());
        try {
            iterator.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIteratorNonEmptyAndRemoveUnsupported() {
        ListPopulation pop = new ListPopulation(3) {};
        pop.addChromosome(makeChromosome(1.0));
        pop.addChromosome(makeChromosome(2.0));
        Iterator<Chromosome> iterator = pop.iterator();
        assertTrue(iterator.hasNext());
        iterator.next();
        try {
            iterator.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(!iterator.hasNext());
    }

    @Test
    public void testGetChromosomesReturnsUnmodifiableList() {
        ListPopulation pop = new ListPopulation(3) {};
        pop.addChromosome(makeChromosome(1.0));
        List<Chromosome> chromosomes = pop.getChromosomes();
        assertEquals(1, chromosomes.size());
        try {
            chromosomes.add(makeChromosome(2.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAddChromosomesNullCollection() {
        ListPopulation pop = new ListPopulation(3) {};
        try {
            pop.addChromosomes((Collection<Chromosome>) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testSetPopulationLimitEqualToCurrentSize() {
        ListPopulation pop = new ListPopulation(2) {};
        pop.addChromosomes(Arrays.asList(makeChromosome(1.0), makeChromosome(2.0)));
        pop.setPopulationLimit(2);
        assertEquals(2, pop.getPopulationLimit());
        assertEquals(2, pop.getPopulationSize());
    }

    @Test
    public void testGetFittestChromosomeWithEqualFitness() {
        TestChromosome first = makeChromosome(5.0);
        TestChromosome second = makeChromosome(5.0);
        ListPopulation pop = new ListPopulation(Arrays.asList(first, second), 2) {};
        // compareTo returns 0 for equal fitness, so first one should remain best
        assertSame(first, pop.getFittestChromosome());
    }

    @Test
    public void testConstructorPopulationLimitOne() {
        ListPopulation pop = new ListPopulation(1) {};
        pop.addChromosome(makeChromosome(1.0));
        assertEquals(1, pop.getPopulationSize());
        try {
            pop.addChromosome(makeChromosome(2.0));
            fail("Expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException e) {
            // expected
        }
    }
}