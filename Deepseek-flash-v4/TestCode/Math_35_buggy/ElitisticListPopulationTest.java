package org.apache.commons.math3.genetics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Test;

public class ElitisticListPopulationTest {

    private ElitisticListPopulation createPopulation(int size, double elitismRate) {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 0; i < size; i++) {
            chromosomes.add(new Chromosome() {
                // Dummy chromosome implementation
                public double getFitness() {
                    return 0;
                }
            });
        }
        return new ElitisticListPopulation(chromosomes, size, elitismRate);
    }

    @Test
    public void testConstructorWithChromosomes() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 10, 0.9);
        assertNotNull(pop);
        assertEquals(0.9, pop.getElitismRate(), 0.0);
        assertEquals(0, pop.getPopulationSize());
    }

    @Test
    public void testConstructorWithLimit() {
        ElitisticListPopulation pop = new ElitisticListPopulation(100, 0.5);
        assertNotNull(pop);
        assertEquals(0.5, pop.getElitismRate(), 0.0);
        assertEquals(0, pop.getPopulationSize());
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateBelowZero() {
        ElitisticListPopulation pop = createPopulation(1, 0.1);
        pop.setElitismRate(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateAboveOne() {
        ElitisticListPopulation pop = createPopulation(1, 0.1);
        pop.setElitismRate(1.1);
    }

    @Test
    public void testSetElitismRateBoundaryZero() {
        ElitisticListPopulation pop = createPopulation(1, 0.1);
        pop.setElitismRate(0.0);
        assertEquals(0.0, pop.getElitismRate(), 0.0);
    }

    @Test
    public void testSetElitismRateBoundaryOne() {
        ElitisticListPopulation pop = createPopulation(1, 0.1);
        pop.setElitismRate(1.0);
        assertEquals(1.0, pop.getElitismRate(), 0.0);
    }

    @Test
    public void testGetElitismRateInitial() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.9);
        assertEquals(0.9, pop.getElitismRate(), 0.0);
    }

    @Test
    public void testNextGenerationWithZeroElitism() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(new Chromosome() { public double getFitness() { return 1.0; } });
        chromosomes.add(new Chromosome() { public double getFitness() { return 2.0; } });
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 2, 0.0);
        Population nextGen = pop.nextGeneration();
        assertNotNull(nextGen);
        assertEquals(2, nextGen.getPopulationSize());
    }

    @Test
    public void testNextGenerationWithFullElitism() {
        List<Chromosome> original = new ArrayList<Chromosome>();
        Chromosome c1 = new Chromosome() { public double getFitness() { return 1.0; } };
        Chromosome c2 = new Chromosome() { public double getFitness() { return 2.0; } };
        original.add(c1);
        original.add(c2);
        ElitisticListPopulation pop = new ElitisticListPopulation(original, 2, 1.0);
        Population nextGen = pop.nextGeneration();
        assertEquals(2, nextGen.getPopulationSize());
        // With elitism rate 1.0, all chromosomes should be copied
        assertEquals(2, ((ElitisticListPopulation) nextGen).getChromosomes().size());
    }

    @Test
    public void testNextGenerationTypical() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        final double[] fitnessValues = {1.0, 3.0, 2.0, 4.0, 5.0};
        for (double val : fitnessValues) {
            final double f = val;
            list.add(new Chromosome() { public double getFitness() { return f; } });
        }
        ElitisticListPopulation pop = new ElitisticListPopulation(list, 5, 0.8);
        Population nextGen = pop.nextGeneration();
        assertNotNull(nextGen);
        // With 5 chromosomes and rate 0.8, boundIndex = ceil((1-0.8)*5)=ceil(1.0)=1
        // So top 4 (indices 1..4 sorted ascending should be copied all but lowest)
        assertEquals(4, nextGen.getPopulationSize());
    }

    @Test
    public void testNextGenerationWithEmptyPopulation() {
        ElitisticListPopulation pop = new ElitisticListPopulation(0, 0.5);
        Population nextGen = pop.nextGeneration();
        assertNotNull(nextGen);
        assertEquals(0, nextGen.getPopulationSize());
    }

    @Test
    public void testNextGenerationPreservesChromosomes() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new Chromosome() { public double getFitness() { return 10.0; } });
        list.add(new Chromosome() { public double getFitness() { return 20.0; } });
        list.add(new Chromosome() { public double getFitness() { return 30.0; } });
        ElitisticListPopulation pop = new ElitisticListPopulation(list, 3, 0.5);
        Population nextGen = pop.nextGeneration();
        // rate 0.5 => boundIndex = ceil(0.5*3)=ceil(1.5)=2 => copy from index 2 to end => 1 chromosome
        assertEquals(1, nextGen.getPopulationSize());
    }
}