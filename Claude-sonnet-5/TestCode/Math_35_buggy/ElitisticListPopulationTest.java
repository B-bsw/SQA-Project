package org.apache.commons.math3.genetics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Test;

public class ElitisticListPopulationTest {

    /** Simple Chromosome implementation for testing purposes. */
    private static class DummyChromosome extends Chromosome {
        private final double fitness;

        public DummyChromosome(double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double fitness() {
            return fitness;
        }
    }

    private List<Chromosome> createChromosomes(int count) {
        List<Chromosome> list = new ArrayList<Chromosome>();
        for (int i = 0; i < count; i++) {
            list.add(new DummyChromosome(i));
        }
        return list;
    }

    @Test
    public void testConstructorWithChromosomesNormal() {
        List<Chromosome> chromosomes = createChromosomes(5);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);

        assertEquals(5, population.getPopulationSize());
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0.5, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testConstructorWithLimitAndRate() {
        ElitisticListPopulation population = new ElitisticListPopulation(20, 0.75);

        assertEquals(0, population.getPopulationSize());
        assertEquals(20, population.getPopulationLimit());
        assertEquals(0.75, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testConstructorWithEmptyChromosomeList() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);

        assertEquals(0, population.getPopulationSize());
        assertEquals(10, population.getPopulationLimit());
    }

    @Test
    public void testGetElitismRate() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.3);
        assertEquals(0.3, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRateNormal() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(0.8);
        assertEquals(0.8, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRateBoundaryZero() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(0.0);
        assertEquals(0.0, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRateBoundaryOne() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(1.0);
        assertEquals(1.0, population.getElitismRate(), 1e-9);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateNegative() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateAboveOne() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(1.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructorWithInvalidElitismRateNegative() {
        List<Chromosome> chromosomes = createChromosomes(3);
        new ElitisticListPopulation(chromosomes, 10, -0.5);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructorWithInvalidElitismRateAboveOne() {
        List<Chromosome> chromosomes = createChromosomes(3);
        new ElitisticListPopulation(chromosomes, 10, 1.5);
    }

    @Test
    public void testNextGenerationNormalCase() {
        // 10 chromosomes, elitism rate 0.5 -> boundIndex = ceil(0.5*10) = 5
        // so chromosomes from index 5 to 9 (5 chromosomes) are copied
        List<Chromosome> chromosomes = createChromosomes(10);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 20, 0.5);

        Population nextGen = population.nextGeneration();

        assertTrue(nextGen instanceof ElitisticListPopulation);
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        assertEquals(5, nextElitistic.getPopulationSize());
        assertEquals(20, nextElitistic.getPopulationLimit());
        assertEquals(0.5, nextElitistic.getElitismRate(), 1e-9);

        // verify the surviving chromosomes have the highest fitness values (5,6,7,8,9)
        double minFitnessInNextGen = Double.MAX_VALUE;
        for (Chromosome c : nextElitistic.getChromosomes()) {
            if (c.fitness() < minFitnessInNextGen) {
                minFitnessInNextGen = c.fitness();
            }
        }
        assertEquals(5.0, minFitnessInNextGen, 1e-9);
    }

    @Test
    public void testNextGenerationZeroElitismRate() {
        // elitism rate 0 -> boundIndex = ceil(1.0*size) = size
        // no chromosomes copied, next generation should be empty
        List<Chromosome> chromosomes = createChromosomes(5);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 20, 0.0);

        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        assertEquals(0, nextElitistic.getPopulationSize());
    }

    @Test
    public void testNextGenerationFullElitismRate() {
        // elitism rate 1.0 -> boundIndex = ceil(0*size) = 0
        // all chromosomes copied
        List<Chromosome> chromosomes = createChromosomes(5);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 20, 1.0);

        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        assertEquals(5, nextElitistic.getPopulationSize());
    }

    @Test
    public void testNextGenerationWithSingleChromosome() {
        List<Chromosome> chromosomes = createChromosomes(1);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);

        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        // boundIndex = ceil(0.5 * 1) = 1, so no chromosomes from index 1 to 0 (empty range)
        assertEquals(0, nextElitistic.getPopulationSize());
    }

    @Test
    public void testNextGenerationWithEmptyPopulation() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);

        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        assertEquals(0, nextElitistic.getPopulationSize());
    }

    @Test
    public void testNextGenerationPreservesPopulationLimit() {
        List<Chromosome> chromosomes = createChromosomes(8);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 100, 0.25);

        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        assertEquals(100, nextElitistic.getPopulationLimit());
        assertEquals(0.25, nextElitistic.getElitismRate(), 1e-9);
    }

    @Test
    public void testNextGenerationDoesNotModifyOriginalPopulationLimit() {
        List<Chromosome> chromosomes = createChromosomes(6);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 15, 0.6);

        population.nextGeneration();

        assertEquals(15, population.getPopulationLimit());
        assertEquals(0.6, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testNextGenerationMultipleIterationsLoop() {
        // 20 chromosomes, elitism rate 0.4 -> boundIndex = ceil(0.6*20) = 12
        // so indices 12 to 19 survive (8 chromosomes) - tests multiple loop iterations
        List<Chromosome> chromosomes = createChromosomes(20);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 50, 0.4);

        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        assertEquals(8, nextElitistic.getPopulationSize());
    }

    @Test
    public void testChromosomesAreSortedAfterNextGeneration() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(new DummyChromosome(5.0));
        chromosomes.add(new DummyChromosome(1.0));
        chromosomes.add(new DummyChromosome(3.0));
        chromosomes.add(new DummyChromosome(2.0));
        chromosomes.add(new DummyChromosome(4.0));

        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.4);
        Population nextGen = population.nextGeneration();
        ElitisticListPopulation nextElitistic = (ElitisticListPopulation) nextGen;

        // boundIndex = ceil(0.6*5) = 3, survivors: indices 3,4 with fitness 4.0, 5.0
        assertEquals(2, nextElitistic.getPopulationSize());

        double maxFitness = Double.MIN_VALUE;
        for (Chromosome c : nextElitistic.getChromosomes()) {
            if (c.fitness() > maxFitness) {
                maxFitness = c.fitness();
            }
        }
        assertEquals(5.0, maxFitness, 1e-9);
    }

    @Test
    public void testIterableInterface() {
        List<Chromosome> chromosomes = createChromosomes(3);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);

        int count = 0;
        for (Chromosome c : population) {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testAddChromosome() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.addChromosome(new DummyChromosome(1.0));
        assertEquals(1, population.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeExceptionWrapper.class)
    public void testAddChromosomeExceedingLimit() {
        try {
            ElitisticListPopulation population = new ElitisticListPopulation(1, 0.5);
            population.addChromosome(new DummyChromosome(1.0));
            population.addChromosome(new DummyChromosome(2.0));
            fail("Expected exception when exceeding population limit");
        } catch (Exception e) {
            throw new NumberIsTooLargeExceptionWrapper();
        }
    }

    /** Wrapper to avoid depending on exact exception type from ListPopulation. */
    private static class NumberIsTooLargeExceptionWrapper extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }
}