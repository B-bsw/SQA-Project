package org.apache.commons.math3.genetics;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

public class ElitisticListPopulationTest {

    private static class DummyChromosome extends Chromosome {
        private final double fitness;

        public DummyChromosome(double fitness) {
            this.fitness = fitness;
        }

        public double getFitness() {
            return this.fitness;
        }

        protected boolean isSame(Chromosome another) {
            return this == another;
        }
    }

    @Test
    public void constructor_givenLimitAndRate_shouldInitializeProperly() {
        // Arrange & Act
        int limit = 10;
        double rate = 0.25;
        ElitisticListPopulation population = new ElitisticListPopulation(limit, rate);

        // Assert
        Assert.assertEquals(limit, population.getPopulationLimit());
        Assert.assertEquals(rate, population.getElitismRate(), 1e-6);
        Assert.assertEquals(0, population.getPopulationSize());
    }

    @Test
    public void constructor_givenListLimitAndRate_shouldInitializeProperly() {
        // Arrange
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));
        int limit = 10;
        double rate = 0.5;

        // Act
        ElitisticListPopulation population = new ElitisticListPopulation(list, limit, rate);

        // Assert
        Assert.assertEquals(limit, population.getPopulationLimit());
        Assert.assertEquals(rate, population.getElitismRate(), 1e-6);
        Assert.assertEquals(2, population.getPopulationSize());
    }

    @Test
    public void setElitismRate_givenValidRate_shouldUpdateRate() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        // Act
        population.setElitismRate(0.75);

        // Assert
        Assert.assertEquals(0.75, population.getElitismRate(), 1e-6);
    }

    @Test
    public void setElitismRate_givenBoundaryZero_shouldSucceed() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        // Act
        population.setElitismRate(0.0);

        // Assert
        Assert.assertEquals(0.0, population.getElitismRate(), 1e-6);
    }

    @Test
    public void setElitismRate_givenBoundaryOne_shouldSucceed() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        // Act
        population.setElitismRate(1.0);

        // Assert
        Assert.assertEquals(1.0, population.getElitismRate(), 1e-6);
    }

    @Test(expected = OutOfRangeException.class)
    public void setElitismRate_givenNegativeRate_shouldThrowOutOfRangeException() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        // Act
        population.setElitismRate(-0.0001);
    }

    @Test(expected = OutOfRangeException.class)
    public void setElitismRate_givenRateGreaterThanOne_shouldThrowOutOfRangeException() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        // Act
        population.setElitismRate(1.0001);
    }

    @Test
    public void nextGeneration_givenPartialElitismRate_shouldCopyBestChromosomes() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.3);
        Chromosome c1 = new DummyChromosome(10.0);
        Chromosome c2 = new DummyChromosome(30.0);
        Chromosome c3 = new DummyChromosome(20.0);
        Chromosome c4 = new DummyChromosome(50.0);
        Chromosome c5 = new DummyChromosome(40.0);

        population.addChromosome(c1);
        population.addChromosome(c2);
        population.addChromosome(c3);
        population.addChromosome(c4);
        population.addChromosome(c5);

        // Act: elitismRate 0.3 of 5 items -> (1 - 0.3) * 5 = 3.5 -> ceil is 4 -> 1 chromosome (c4)
        Population nextGen = population.nextGeneration();

        // Assert
        Assert.assertTrue(nextGen instanceof ElitisticListPopulation);
        ElitisticListPopulation nextElitisticGen = (ElitisticListPopulation) nextGen;
        Assert.assertEquals(population.getPopulationLimit(), nextElitisticGen.getPopulationLimit());
        Assert.assertEquals(population.getElitismRate(), nextElitisticGen.getElitismRate(), 1e-6);
        Assert.assertEquals(1, nextElitisticGen.getPopulationSize());

        List<Chromosome> nextChromosomes = nextElitisticGen.getChromosomes();
        Assert.assertEquals(50.0, nextChromosomes.get(0).getFitness(), 1e-6);
    }

    @Test
    public void nextGeneration_givenZeroElitismRate_shouldReturnEmptyPopulation() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.0);
        population.addChromosome(new DummyChromosome(1.0));
        population.addChromosome(new DummyChromosome(2.0));
        population.addChromosome(new DummyChromosome(3.0));

        // Act: (1.0 - 0.0) * 3 = 3.0 -> ceil is 3 -> boundIndex = 3 -> 0 chromosomes added
        Population nextGen = population.nextGeneration();

        // Assert
        Assert.assertEquals(0, ((ElitisticListPopulation) nextGen).getPopulationSize());
    }

    @Test
    public void nextGeneration_givenFullElitismRate_shouldReturnAllChromosomes() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 1.0);
        population.addChromosome(new DummyChromosome(3.0));
        population.addChromosome(new DummyChromosome(1.0));
        population.addChromosome(new DummyChromosome(2.0));

        // Act: (1.0 - 1.0) * 3 = 0.0 -> ceil is 0 -> boundIndex = 0 -> all 3 chromosomes added
        Population nextGen = population.nextGeneration();

        // Assert
        ElitisticListPopulation nextElitisticGen = (ElitisticListPopulation) nextGen;
        Assert.assertEquals(3, nextElitisticGen.getPopulationSize());
        List<Chromosome> nextChromosomes = nextElitisticGen.getChromosomes();
        Assert.assertEquals(1.0, nextChromosomes.get(0).getFitness(), 1e-6);
        Assert.assertEquals(2.0, nextChromosomes.get(1).getFitness(), 1e-6);
        Assert.assertEquals(3.0, nextChromosomes.get(2).getFitness(), 1e-6);
    }

    @Test
    public void nextGeneration_givenEmptyPopulation_shouldReturnEmptyGeneration() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        // Act
        Population nextGen = population.nextGeneration();

        // Assert
        Assert.assertEquals(0, ((ElitisticListPopulation) nextGen).getPopulationSize());
    }

    @Test
    public void nextGeneration_givenExactIntegerCeilBoundary_shouldCopyExactPercentage() {
        // Arrange
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.25);
        for (int i = 1; i <= 4; i++) {
            population.addChromosome(new DummyChromosome((double) i));
        }

        // Act: (1.0 - 0.25) * 4 = 3.0 -> boundIndex = 3 -> index 3 added (1 chromosome)
        Population nextGen = population.nextGeneration();

        // Assert
        ElitisticListPopulation nextElitisticGen = (ElitisticListPopulation) nextGen;
        Assert.assertEquals(1, nextElitisticGen.getPopulationSize());
        Assert.assertEquals(4.0, nextElitisticGen.getChromosomes().get(0).getFitness(), 1e-6);
    }
}