package org.apache.commons.math3.geometry.euclidean.threed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.junit.Test;

public class SubLineTest {

    private static final double EPS = 1.0e-10;

    @Test
    public void testConstructorFromPointsNormal() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(2, 0, 0);
        SubLine sub = new SubLine(start, end);
        List<Segment> segments = sub.getSegments();
        assertEquals(1, segments.size());
        Segment s