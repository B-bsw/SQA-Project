package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class CombiningEvaluatorTest {
    private Element root = Mockito.mock(Element.class);
    private Element node = Mockito.mock(Element.class);
    private Evaluator passingEvaluator = Mockito.mock(Evaluator.class);
    private Evaluator failingEvaluator = Mockito.mock(Evaluator.class);

    @Test
    public void testAndMatchesAllTrue() {
        when(passingEvaluator.matches(root, node)).thenReturn(true);
        CombiningEvaluator.And and = new CombiningEvaluator.And(passingEvaluator);
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndMatchesOneFalse() {
        when(passingEvaluator.matches(root, node)).thenReturn(true);
        when(failingEvaluator.matches(root, node)).thenReturn(false);
        CombiningEvaluator.And and = new CombiningEvaluator.And(
                Arrays.asList(passingEvaluator, failingEvaluator));
        assertFalse(and.matches(root, node));
    }

    @Test
    public void testAndEmptyEvaluators() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(Collections.emptyList());
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndToString() {
        when(passingEvaluator.toString()).thenReturn("first");
        when(failingEvaluator.toString()).thenReturn("second");
        CombiningEvaluator.And and = new CombiningEvaluator.And(
                Arrays.asList(passingEvaluator, failingEvaluator));
        assertEquals("first second", and.toString());
    }

    @Test
    public void testOrMatchesAnyTrue() {
        when(passingEvaluator.matches(root, node)).thenReturn(false);
        when(failingEvaluator.matches(root, node)).thenReturn(true);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
                Arrays.asList(passingEvaluator, failingEvaluator));
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOrAllFalse() {
        when(passingEvaluator.matches(root, node)).thenReturn(false);
        when(failingEvaluator.matches(root, node)).thenReturn(false);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
                Arrays.asList(passingEvaluator, failingEvaluator));
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOrSingleEvaluator() {
        when(passingEvaluator.matches(root, node)).thenReturn(true);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
                Collections.singletonList(passingEvaluator));
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOrEmptyEvaluators() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(Collections.emptyList());
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOrAddEvaluator() {
        when(passingEvaluator.matches(root, node)).thenReturn(false);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(Collections.emptyList());
        or.add(passingEvaluator);
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOrToString() {
        when(passingEvaluator.toString()).thenReturn("first");
        when(failingEvaluator.toString()).thenReturn("second");
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
                Arrays.asList(passingEvaluator, failingEvaluator));
        assertEquals(":or[first, second]", or.toString());
    }

    @Test
    public void testVarargsConstructor() {
        when(passingEvaluator.matches(root, node)).thenReturn(true);
        CombiningEvaluator.And and = new CombiningEvaluator.And(passingEvaluator);
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testNullElementInList() {
        when(passingEvaluator.matches(root, node)).thenReturn(true);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
                Arrays.asList(passingEvaluator, null));
        assertTrue(or.matches(root, node));
    }
}