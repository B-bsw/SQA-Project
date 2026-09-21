package org.apache.commons.jxpath.ri.axes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

public class UnionContextTest {

    // ---------------------------------------------------------------
    // Simple JavaBean used for real (integration-style) evaluation of
    // union expressions through the public JXPathContext API. This
    // guarantees that the EvalContext objects fed into UnionContext
    // internally behave exactly as the production code expects,
    // without relying on guesses about internal implementation
    // details of other EvalContext subclasses.
    // ---------------------------------------------------------------
    public static class TwoPropBean {
        private String name;
        private String value;

        public TwoPropBean(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

    public static class ThreePropBean {
        private String a = "1";
        private String b = "2";
        private String c = "3";

        public String getA() {
            return a;
        }

        public String getB() {
            return b;
        }

        public String getC() {
            return c;
        }
    }

    private List collect(Iterator it) {
        List result = new ArrayList();
        while (it.hasNext()) {
            result.add(it.next());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Constructor / initial state
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_InitialStateIsEmptyNodeSet() {
        EvalContext[] contexts = new EvalContext[0];
        UnionContext uc = new UnionContext(null, contexts);

        assertNotNull(uc.getNodeSet());
        assertTrue(uc.getNodeSet() instanceof BasicNodeSet);
        assertEquals(0, ((BasicNodeSet) uc.getNodeSet()).getPointers().size());
    }

    // ---------------------------------------------------------------
    // getDocumentOrder() - these tests only rely on contexts.length,
    // so the array elements do not need to be functional EvalContext
    // instances (null is safe since getDocumentOrder never touches
    // the elements themselves).
    // ---------------------------------------------------------------

    @Test
    public void testGetDocumentOrder_MultipleContextsReturnsOne() {
        EvalContext[] contexts = new EvalContext[] {null, null};
        UnionContext uc = new UnionContext(null, contexts);
        assertEquals(1, uc.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_ManyContextsReturnsOne() {
        EvalContext[] contexts = new EvalContext[] {null, null, null, null, null};
        UnionContext uc = new UnionContext(null, contexts);
        assertEquals(1, uc.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_SingleContextDelegatesToSuper() {
        EvalContext[] contexts = new EvalContext[] {null};
        UnionContext uc = new UnionContext(null, contexts);

        NodeSetContext plain = new NodeSetContext(null, new BasicNodeSet());
        assertEquals(plain.getDocumentOrder(), uc.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_ZeroContextsDelegatesToSuper() {
        EvalContext[] contexts = new EvalContext[0];
        UnionContext uc = new UnionContext(null, contexts);

        NodeSetContext plain = new NodeSetContext(null, new BasicNodeSet());
        assertEquals(plain.getDocumentOrder(), uc.getDocumentOrder());
    }

    @Test(expected = NullPointerException.class)
    public void testGetDocumentOrder_NullContextsArrayThrowsNPE() {
        UnionContext uc = new UnionContext(null, null);
        uc.getDocumentOrder();
    }

    // ---------------------------------------------------------------
    // setPosition() - boundary / empty / exception path tests that do
    // not require real EvalContext elements (0 iterations of the loop).
    // ---------------------------------------------------------------

    @Test
    public void testSetPosition_EmptyContextsReturnsFalse() {
        UnionContext uc = new UnionContext(null, new EvalContext[0]);

        boolean result = uc.setPosition(1);

        assertFalse(result);
        assertEquals(0, ((BasicNodeSet) uc.getNodeSet()).getPointers().size());
    }

    @Test
    public void testSetPosition_EmptyContextsIsIdempotent() {
        UnionContext uc = new UnionContext(null, new EvalContext[0]);

        boolean first = uc.setPosition(1);
        boolean second = uc.setPosition(1);

        assertFalse(first);
        assertFalse(second);
        assertEquals(0, ((BasicNodeSet) uc.getNodeSet()).getPointers().size());
    }

    @Test
    public void testSetPosition_EmptyContextsBoundaryValues() {
        UnionContext uc = new UnionContext(null, new EvalContext[0]);

        assertFalse(uc.setPosition(0));
    }

    @Test(expected = NullPointerException.class)
    public void testSetPosition_NullContextsArrayThrowsNPE() {
        UnionContext uc = new UnionContext(null, null);
        uc.setPosition(1);
    }

    // ---------------------------------------------------------------
    // setPosition() - real, functional integration tests using the
    // public JXPathContext API to build genuinely correct EvalContext
    // objects. These exercise the loop with 1 round (single branch
    // contributing) and many rounds (multiple branches contributing),
    // as well as the duplicate-elimination logic.
    // ---------------------------------------------------------------

    @Test
    public void testUnion_TwoDistinctBranches() {
        TwoPropBean bean = new TwoPropBean("foo", "bar");
        JXPathContext context = JXPathContext.newContext(bean);

        Iterator it = context.iterate("name | value");
        List results = collect(it);

        assertEquals(2, results.size());
        assertTrue(results.contains("foo"));
        assertTrue(results.contains("bar"));
    }

    @Test
    public void testUnion_DuplicateBranchesAreEliminated() {
        TwoPropBean bean = new TwoPropBean("foo", "bar");
        JXPathContext context = JXPathContext.newContext(bean);

        Iterator it = context.iterate("name | name");
        List results = collect(it);

        assertEquals(1, results.size());
        assertEquals("foo", results.get(0));
    }

    @Test
    public void testUnion_ManyDistinctBranches() {
        ThreePropBean bean = new ThreePropBean();
        JXPathContext context = JXPathContext.newContext(bean);

        Iterator it = context.iterate("a | b | c");
        List results = collect(it);

        assertEquals(3, results.size());
        assertTrue(results.contains("1"));
        assertTrue(results.contains("2"));
        assertTrue(results.contains("3"));
    }

    @Test
    public void testUnion_ManyBranchesWithSomeDuplicates() {
        ThreePropBean bean = new ThreePropBean();
        JXPathContext context = JXPathContext.newContext(bean);

        // "a" is repeated, "b" and "c" are unique -> expect 3 distinct results
        Iterator it = context.iterate("a | a | b | c");
        List results = collect(it);

        assertEquals(3, results.size());
        assertTrue(results.contains("1"));
        assertTrue(results.contains("2"));
        assertTrue(results.contains("3"));
    }

    @Test
    public void testUnion_SingleValueBranchOnly() {
        TwoPropBean bean = new TwoPropBean("foo", "bar");
        JXPathContext context = JXPathContext.newContext(bean);

        // Not a union expression at the parser level, but exercises the
        // same underlying property navigation used within union branches.
        Iterator it = context.iterate("name");
        List results = collect(it);

        assertEquals(1, results.size());
        assertEquals("foo", results.get(0));
    }

    @Test
    public void testUnion_EmptyValuesAreStillCombined() {
        TwoPropBean bean = new TwoPropBean("", "");
        JXPathContext context = JXPathContext.newContext(bean);

        Iterator it = context.iterate("name | value");
        List results = collect(it);

        // Two distinct property pointers, even though their values are
        // equal empty strings, must NOT be treated as duplicates because
        // duplicate elimination in UnionContext is based on pointer
        // identity/equality, not on the underlying value.
        assertEquals(2, results.size());
        assertEquals("", results.get(0));
        assertEquals("", results.get(1));
    }
}