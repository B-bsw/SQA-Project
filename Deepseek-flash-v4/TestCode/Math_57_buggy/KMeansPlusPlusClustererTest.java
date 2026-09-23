package org.apache.commons.math.stat.clustering;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KMeansPlusPlusClustererTest {
    private KMeansPlusPlusClusterer<Clusterable<Point>> clusterer;
    private static final double EPSILON = 1e-6;

    @Before
    public void setUp() {
        clusterer = new KMeansPlusPlusClusterer<>(new Random(0));
    }

    private static class Point implements Clusterable<Point> {
        private final double x;
        private final double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public double distanceFrom(Point p) {
            double dx = x - p.x;
            double dy = y - p.y;
            return Math.sqrt(dx*dx + dy*dy);
        }

        @Override
        public Point centroidOf(List<Point> points) {
            double sx = 0, sy = 0;
            for (Point p : points) {
                sx += p.x;
                sy += p.y;
            }
            return new Point(sx / points.size(), sy / points.size());
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Point)) return false;
            Point p = (Point) o;
            return Math.abs(x - p.x) < EPSILON && Math.abs(y - p.y) < EPSILON;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(x) * 31 + Double.hashCode(y);
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    private static class TestClusterer extends KMeansPlusPlusClusterer<Point> {
        TestClusterer(Random random, EmptyClusterStrategy strategy) {
            super(random, strategy);
        }

        @Override
        public List<Cluster<Point>> cluster(List<Point> points, int k, int maxIterations) {
            return super.cluster(points, k, maxIterations);
        }
    }

    @Test
    public void testClusterBasic() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(10, 10));
        points.add(new Point(11, 10));
        points.add(new Point(1, 1));
        points.add(new Point(10, 9));
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 2, 10);
        
        assertEquals(2, clusters.size());
        for (Cluster<Point> cluster : clusters) {
            assertNotNull(cluster.getCenter());
            assertFalse(cluster.getPoints().isEmpty());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClusterWithNullPoints() {
        clusterer.cluster(null, 2, 10);
    }

    @Test
    public void testClusterWithSinglePoint() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 1, 10);
        
        assertEquals(1, clusters.size());
        assertEquals(1, clusters.get(0).getPoints().size());
    }

    @Test
    public void testClusterWithKGreaterThanPoints() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        
        try {
            clusterer.cluster(points, 3, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testClusterWithZeroIterations() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 2, 0);
        
        assertEquals(2, clusters.size());
        assertNotNull(clusters.get(0).getCenter());
    }

    @Test
    public void testClusterWithManyIterations() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            points.add(new Point(i, i));
        }
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 3, 100);
        
        assertEquals(3, clusters.size());
        for (Cluster<Point> cluster : clusters) {
            assertFalse(cluster.getPoints().isEmpty());
        }
    }

    @Test
    public void testClusterWithAllSamePoints() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            points.add(new Point(1, 1));
        }
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 2, 10);
        
        assertEquals(2, clusters.size());
        for (Cluster<Point> cluster : clusters) {
            assertNotNull(cluster.getCenter());
        }
    }

    @Test
    public void testClusterWithBoundaryIterations() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        
        // Test negative maxIterations
        List<Cluster<Point>> clusters = clusterer.cluster(points, 2, -1);
        assertEquals(2, clusters.size());
    }

    @Test
    public void testClusterWithLargeNumberOfPointsAndClusters() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 2; j++) {
                points.add(new Point(i + j*0.1, i - j*0.1));
            }
        }
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 5, 20);
        
        assertEquals(5, clusters.size());
    }

    @Test
    public void testClusterWithEmptyStrategyLargestVariance() {
        KMeansPlusPlusClusterer<Point> customClusterer = 
            new KMeansPlusPlusClusterer<>(new Random(1), 
                KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE);
        
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(10, 0));
        
        List<Cluster<Point>> clusters = customClusterer.cluster(points, 3, 10);
        assertEquals(3, clusters.size());
    }

    @Test
    public void testClusterWithEmptyStrategyLargestNumber() {
        KMeansPlusPlusClusterer<Point> customClusterer = 
            new KMeansPlusPlusClusterer<>(new Random(2), 
                KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER);
        
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(10, 0));
        points.add(new Point(20, 0));
        
        List<Cluster<Point>> clusters = customClusterer.cluster(points, 3, 10);
        assertEquals(3, clusters.size());
    }

    @Test
    public void testClusterWithEmptyStrategyFarthestPoint() {
        KMeansPlusPlusClusterer<Point> customClusterer = 
            new KMeansPlusPlusClusterer<>(new Random(3), 
                KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT);
        
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(10, 0));
        points.add(new Point(20, 0));
        
        List<Cluster<Point>> clusters = customClusterer.cluster(points, 3, 10);
        assertEquals(3, clusters.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClusterWithEmptyPoints() {
        List<Point> points = new ArrayList<>();
        clusterer.cluster(points, 2, 10);
    }

    @Test
    public void testConstructorWithDefaultStrategy() {
        KMeansPlusPlusClusterer<Point> defaultClusterer = new KMeansPlusPlusClusterer<>(new Random(4));
        assertNotNull(defaultClusterer);
    }

    @Test
    public void testConstructorWithCustomStrategy() {
        KMeansPlusPlusClusterer<Point> customClusterer = 
            new KMeansPlusPlusClusterer<>(new Random(5), 
                KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR);
        assertNotNull(customClusterer);
    }

    @Test
    public void testClusterWithDeterministicResults() {
        List<Point> points1 = new ArrayList<>();
        List<Point> points2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            points1.add(new Point(i, i*2));
            points2.add(new Point(i, i*2));
        }
        
        KMeansPlusPlusClusterer<Point> clusterer1 = new KMeansPlusPlusClusterer<>(new Random(42));
        KMeansPlusPlusClusterer<Point> clusterer2 = new KMeansPlusPlusClusterer<>(new Random(42));
        
        List<Cluster<Point>> clusters1 = clusterer1.cluster(points1, 3, 50);
        List<Cluster<Point>> clusters2 = clusterer2.cluster(points2, 3, 50);
        
        assertEquals(clusters1.size(), clusters2.size());
        for (int i = 0; i < clusters1.size(); i++) {
            assertEquals(clusters1.get(i).getCenter(), clusters2.get(i).getCenter());
        }
    }

    @Test
    public void testClusterWithGapInPoints() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(100, 100));
        points.add(new Point(50, 50));
        points.add(new Point(-50, -50));
        points.add(new Point(150, 150));
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 3, 20);
        assertEquals(3, clusters.size());
        for (Cluster<Point> cluster : clusters) {
            assertEquals(1, cluster.getPoints().size());
        }
    }

    @Test
    public void testClusterWithInequality() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0.5, 0.5));
        points.add(new Point(0.1, 0.1));
        points.add(new Point(9.9, 9.9));
        points.add(new Point(10.5, 10.5));
        points.add(new Point(4, 4));
        points.add(new Point(-1, -1));
        
        List<Cluster<Point>> clusters = clusterer.cluster(points, 2, 30);
        assertEquals(2, clusters.size());
        
        double totalPoints = 0;
        for (Cluster<Point> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(6, totalPoints, 0);
    }
}