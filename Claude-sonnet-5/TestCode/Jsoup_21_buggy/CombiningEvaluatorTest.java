package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CombiningEvaluatorTest {

    private Element root;
    private Element node;

    // Simple mock evaluator with fixed match result and custom toString
    static class MockEvaluator extends Evaluator {
        private final boolean result;
        private final String name;

        MockEvaluator(boolean result, String name) {
            this.result = result;
            this.name = name;
        }

        @Override
        public boolean matches(Element root, Element node) {
            return result;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @Before
    public void setUp() {
        Element parsed = Jsoup.parse("<div><span></span></div>").body().child(0);
        root = parsed;
        node = parsed;
    }

    // -------------------- And tests --------------------

    @Test
    public void testAndMatchesAllTrue() {
        Evaluator e1 = new MockEvaluator(true, "e1");
        Evaluator e2 = new MockEvaluator(true, "e2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(Arrays.asList(e1, e2));
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndMatchesOneFalse() {
        Evaluator e1 = new MockEvaluator(true, "e1");
        Evaluator e2 = new MockEvaluator(false, "e2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(Arrays.asList(e1, e2));
        assertFalse(and.matches(root, node));
    }

    @Test
    public void testAndMatchesFirstFalseShortCircuit() {
        Evaluator e1 = new MockEvaluator(false, "e1");
        Evaluator e2 = new MockEvaluator(true, "e2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(Arrays.asList(e1, e2));
        assertFalse(and.matches(root, node));
    }

    @Test
    public void testAndEmptyEvaluatorsReturnsTrue() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(new ArrayList<Evaluator>());
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndVarargsConstructor() {
        Evaluator e1