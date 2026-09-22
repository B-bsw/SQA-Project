package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IteratorUtilsTest {

    private List<String> list;
    private Iterator<String> iterator;

    @Before
    public void setUp() {
        list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        iterator = list.iterator();
    }

    @After
    public void tearDown() {
        list = null;
        iterator = null;
    }

    @Test
    public void testEmptyIterator() {
        assertNotNull(IteratorUtils.emptyIterator());
        assertFalse(IteratorUtils.emptyIterator().hasNext());
    }

    @Test
    public void testEmptyListIterator() {
        assertNotNull(IteratorUtils.emptyListIterator());
        assertFalse(IteratorUtils.emptyListIterator().hasNext());
    }

    @Test
    public void testEmptyOrderedIterator() {
        assertNotNull(IteratorUtils.emptyOrderedIterator());
        assertFalse(IteratorUtils.emptyOrderedIterator().hasNext());
    }

    @Test
    public void testEmptyMapIterator() {
        assertNotNull(IteratorUtils.emptyMapIterator());
        assertFalse(IteratorUtils.emptyMapIterator().hasNext());
    }

    @Test
    public void testEmptyOrderedMapIterator() {
        assertNotNull(IteratorUtils.emptyOrderedMapIterator());
        assertFalse(IteratorUtils.emptyOrderedMapIterator().hasNext());
    }

    @Test
    public void testSingletonIterator() {
        Iterator<String> it = IteratorUtils.singletonIterator("x");
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testSingletonListIterator() {
        ListIterator<String> it = IteratorUtils.singletonListIterator("x");
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorVarargs() {
        ResettableIterator<String> it = IteratorUtils.arrayIterator("a", "b", "c");
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorObjectArray() {
        ResettableIterator<String> it = IteratorUtils.arrayIterator(new String[]{"a", "b"});
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        it.reset();
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testArrayIteratorNull() {
        Object array = null;
        IteratorUtils.arrayIterator(array);
    }

    @Test
    public void testArrayIteratorWithStart() {
        ResettableIterator<String> it = IteratorUtils.arrayIterator(new String[]{"a", "b", "c"}, 1);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorWithStartEnd() {
        ResettableIterator<String> it = IteratorUtils.arrayIterator(new String[]{"a", "b", "c", "d"}, 1, 3);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayListIteratorVarargs() {
        ResettableListIterator<String> it = IteratorUtils.arrayListIterator("a", "b");
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testBoundedIterator() {
        Iterator<String> it = IteratorUtils.boundedIterator(iterator, 1, 1);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testBoundedIteratorZeroMax() {
        Iterator<String> it = IteratorUtils.boundedIterator(iterator, 0, 0);
        assertFalse(it.hasNext());
    }

    @Test
    public void testUnmodifiableIterator() {
        Iterator<String> it = IteratorUtils.unmodifiableIterator(iterator);
        assertNotNull(it);
        assertEquals("a", it.next());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testUnmodifiableListIterator() {
        ListIterator<String> it = IteratorUtils.unmodifiableListIterator(list.listIterator());
        assertNotNull(it);
        assertEquals("a", it.next());
        try {
            it.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testUnmodifiableMapIterator() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        MapIterator<String, String> it = IteratorUtils.unmodifiableMapIterator(
            new org.apache.commons.collections4.iterators.AbstractMapIteratorTest.MapIteratorImpl(map));
        assertNotNull(it);
        assertTrue(it.hasNext());
        it.next();
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testChainedIteratorTwoIterators() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("c", "d");
        Iterator<String> it = IteratorUtils.chainedIterator(list1.iterator(), list2.iterator());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testChainedIteratorCollection() {
        Collection<Iterator<String>> iterators = new ArrayList<Iterator<String>>();
        iterators.add(Arrays.asList("a").iterator());
        iterators.add(Arrays.asList("b").iterator());
        Iterator<String> it = IteratorUtils.chainedIterator(iterators);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testCollatedIteratorTwo() {
        Comparator<String> comp = Comparator.naturalOrder();
        List<String> list1 = Arrays.asList("a", "c");
        List<String> list2 = Arrays.asList("b", "d");
        Iterator<String> it = IteratorUtils.collatedIterator(comp, list1.iterator(), list2.iterator());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("d", it.next());
    }

    @Test
    public void testObjectGraphIterator() {
        Object root = "test";
        Iterator<Object> it = IteratorUtils.objectGraphIterator(root, new Transformer<Object, Iterator<?>>() {
            @Override
            public Iterator<?> transform(Object input) {
                return null;
            }
        });
        assertNotNull(it);
    }

    @Test
    public void testTransformedIterator() {
        Iterator<String> it = IteratorUtils.transformedIterator(iterator, new Transformer<String, String>() {
            @Override
            public String transform(String input) {
                return input.toUpperCase();
            }
        });
        assertEquals("A", it.next());
        assertEquals("B", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIteratorNullIterator() {
        IteratorUtils.transformedIterator(null, new Transformer<String, String>() {
            @Override
            public String transform(String input) {
                return input;
            }
        });
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIteratorNullTransform() {
        IteratorUtils.transformedIterator(iterator, null);
    }

    @Test
    public void testFilteredIterator() {
        Iterator<String> it = IteratorUtils.filteredIterator(iterator, new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return !object.equals("b");
            }
        });
        assertEquals("a", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredIteratorNullPredicate() {
        IteratorUtils.filteredIterator(iterator, null);
    }

    @Test
    public void testFilteredListIterator() {
        ListIterator<String> listIterator = list.listIterator();
        ListIterator<String> it = IteratorUtils.filteredListIterator(listIterator, new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return !object.equals("a");
            }
        });
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testLoopingIterator() {
        Iterator<String> it = IteratorUtils.loopingIterator(list);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingIteratorNull() {
        IteratorUtils.loopingIterator((Collection<String>) null);
    }

    @Test
    public void testLoopingListIterator() {
        ListIterator<String> it = IteratorUtils.loopingListIterator(list);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingListIteratorNull() {
        IteratorUtils.loopingListIterator((List<String>) null);
    }

    @Test
    public void testNodeListIterator() {
        NodeList nodeList = new NodeList() {
            @Override
            public Node item(int index) {
                return null;
            }

            @Override
            public int getLength() {
                return 0;
            }
        };
        assertNotNull(IteratorUtils.nodeListIterator(nodeList));
    }

    @Test
    public void testNodeListIteratorNode() {
        Node node = new Node() {
            @Override
            public Node getParentNode() { return null; }
            @Override
            public NodeList getChildNodes() { return null; }
            @Override
            public Node getFirstChild() { return null; }
            @Override
            public Node getLastChild() { return null; }
            @Override
            public Node getPreviousSibling() { return null; }
            @Override
            public Node getNextSibling() { return null; }
            @Override
            public String getNodeName() { return null; }
            @Override
            public String getNodeValue() { return null; }
            @Override
            public void setNodeValue(String nodeValue) {}
            @Override
            public short getNodeType() { return 0; }
            @Override
            public org.w3c.dom.Document getOwnerDocument() { return null; }
            @Override
            public org.w3c.dom.NamedNodeMap getAttributes() { return null; }
            @Override
            public org.w3c.dom.Node insertBefore(Node newChild, Node refChild) { return null; }
            @Override
            public org.w3c.dom.Node replaceChild(Node newChild, Node oldChild) { return null; }
            @Override
            public org.w3c.dom.Node removeChild(Node oldChild) { return null; }
            @Override
            public org.w3c.dom.Node appendChild(Node newChild) { return null; }
            @Override
            public boolean hasChildNodes() { return false; }
            @Override
            public org.w3c.dom.Node cloneNode(boolean deep) { return null; }
            @Override
            public void normalize() {}
            @Override
            public boolean isSupported(String feature, String version) { return false; }
            @Override
            public String getNamespaceURI() { return null; }
            @Override
            public String getPrefix() { return null; }
            @Override
            public void setPrefix(String prefix) {}
            @Override
            public String getLocalName() { return null; }
            @Override
            public boolean hasAttributes() { return false; }
            @Override
            public String getBaseURI() { return null; }
            @Override
            public short compareDocumentPosition(Node other) { return 0; }
            @Override
            public String getTextContent() { return null; }
            @Override
            public void setTextContent(String textContent) {}
            @Override
            public boolean isSameNode(Node node) { return false; }
            @Override
            public String lookupPrefix(String namespaceURI) { return null; }
            @Override
            public boolean isDefaultNamespace(String namespaceURI) { return false; }
            @Override
            public String lookupNamespaceURI(String prefix) { return null; }
            @Override
            public boolean isEqualNode(Node node) { return false; }
            @Override
            public Object getFeature(String feature, String version) { return null; }
            @Override
            public Object setUserData(String key, Object data, short handler) { return null; }
            @Override
            public Object getUserData(String key) { return null; }
        };
        assertNotNull(IteratorUtils.nodeListIterator(node));
    }

    @Test(expected = NullPointerException.class)
    public void testNodeListIteratorNullNode() {
        IteratorUtils.nodeListIterator((Node) null);
    }

    @Test
    public void testPeekingIterator() {
        Iterator<String> it = IteratorUtils.peekingIterator(iterator);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
    }

    @Test
    public void testPushbackIterator() {
        Iterator<String> it = IteratorUtils.pushbackIterator(iterator);
        assertEquals("a", it.next());
    }

    @Test
    public void testSkippingIterator() {
        Iterator<String> it = IteratorUtils.skippingIterator(iterator, 2);
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testZippingIteratorTwo() {
        List<String> list1 = Arrays.asList("a", "c");
        List<String> list2 = Arrays.asList("b", "d");
        Iterator<String> it = IteratorUtils.zippingIterator(list1.iterator(), list2.iterator());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertEquals("d", it.next());
    }

    @Test
    public void testZippingIteratorThree() {
        List<String> list1 = Arrays.asList("a");
        List<String> list2 = Arrays.asList("b");
        List<String> list3 = Arrays.asList("c");
        Iterator<String> it = IteratorUtils.zippingIterator(list1.iterator(), list2.iterator(), list3.iterator());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
    }

    @Test
    public void testAsIterator() {
        Vector<String> vector = new Vector<String>();
        vector.add("a");
        vector.add("b");
        Enumeration<String> enumeration = vector.elements();
        Iterator<String> it = IteratorUtils.asIterator(enumeration);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
    }

    @Test
    public void testAsIteratorWithRemove() {
        Vector<String> vector = new Vector<String>();
        vector.add("a");
        vector.add("b");
        Collection<String> removeColl = new ArrayList<String>();
        Enumeration<String> enumeration = vector.elements();
        Iterator<String> it = IteratorUtils.asIterator(enumeration, removeColl);
        assertEquals("a", it.next());
        it.remove();
        assertEquals(1, vector.size());
    }

    @Test
    public void testAsEnumeration() {
        Enumeration<String> e = IteratorUtils.asEnumeration(iterator);
        assertTrue(e.hasMoreElements());
        assertEquals("a", e.nextElement());
    }

    @Test
    public void testAsIterable() {
        Iterable<String> iterable = IteratorUtils.asIterable(iterator);
        assertNotNull(iterable);
        assertNotNull(iterable.iterator());
    }

    @Test
    public void testAsMultipleUseIterable() {
        Iterable<String> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        assertNotNull(iterable);
        assertNotNull(iterable.iterator());
    }

    @Test
    public void testToListIterator() {
        ListIterator<String> listIterator = IteratorUtils.toListIterator(iterator);
        assertTrue(listIterator.hasNext());
        assertEquals("a", listIterator.next());
    }

    @Test
    public void testToArray() {
        Object[] array = IteratorUtils.toArray(iterator);
        assertEquals(3, array.length);
        assertEquals("a", array[0]);
    }

    @Test
    public void testToArrayClass() {
        String[] array = IteratorUtils.toArray(iterator, String.class);
        assertEquals(3, array.length);
        assertEquals("a", array[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayNullClass() {
        IteratorUtils.toArray(iterator, null);
    }

    @Test
    public void testToList() {
        List<String> result = IteratorUtils.toList(iterator);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    public void testToListEstimatedSize() {
        List<String> result = IteratorUtils.toList(iterator, 2);
        assertEquals(3, result.size());
    }

    @Test
    public void testGetIterator() {
        assertTrue(IteratorUtils.getIterator(null) instanceof ResettableIterator);
        Iterator<?> it = IteratorUtils.getIterator(iterator);
        assertSame(iterator, it);
        Iterable<String> iterable = new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return list.iterator();
            }
        };
        assertNotNull(IteratorUtils.getIterator(iterable));
        Object[] array = new Object[]{"a"};
        assertNotNull(IteratorUtils.getIterator(array));
        Hashtable<String, String> table = new Hashtable<String, String>();
        table.put("k", "v");
        assertNotNull(IteratorUtils.getIterator(table));
        assertNotNull(IteratorUtils.getIterator(table.elements()));
        assertNotNull(IteratorUtils.getIterator(table.keys()));
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        assertNotNull(IteratorUtils.getIterator(map));
        assertNotNull(IteratorUtils.getIterator(new int[]{1,2}));
    }

    @Test
    public void testApply() {
        final List<String> result = new ArrayList<String>();
        IteratorUtils.apply(iterator, new Closure<String>() {
            @Override
            public void execute(String input) {
                result.add(input.toUpperCase());
            }
        });
        assertEquals(3, result.size());
        assertEquals("A", result.get(0));
    }

    @Test
    public void testApplyNullIterator() {
        IteratorUtils.apply(null, new Closure<String>() {
            @Override
            public void execute(String input) {
                fail("Should not execute");
            }
        });
    }

    @Test
    public void testFind() {
        assertEquals("b", IteratorUtils.find(iterator, new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return object.equals("b");
            }
        }));
    }

    @Test
    public void testFindNotFound() {
        assertNull(IteratorUtils.find(iterator, TruePredicate.<String>truePredicate()));
    }

    @Test
    public void testMatchesAny() {
        assertTrue(IteratorUtils.matchesAny(iterator, new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return object.equals("a");
            }
        }));
    }

    @Test
    public void testMatchesAll() {
        assertTrue(IteratorUtils.matchesAll(iterator, new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return !object.isEmpty();
            }
        }));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(IteratorUtils.isEmpty(iterator));
        assertTrue(IteratorUtils.isEmpty(null));
        assertTrue(IteratorUtils.isEmpty(new ArrayList<String>().iterator()));
    }

    @Test
    public void testContains() {
        assertTrue(IteratorUtils.contains(iterator, "a"));
        assertFalse(IteratorUtils.contains(list.iterator(), "z"));
    }

    @Test
    public void testGet() {
        assertEquals("b", IteratorUtils.get(iterator, 1));
        try {
            IteratorUtils.get(iterator, -1);
            IteratorUtils.get(list.iterator(), 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSize() {
        assertEquals(3, IteratorUtils.size(iterator));
        assertEquals(0, IteratorUtils.size(null));
    }

    @Test
    public void testToString() {
        assertNotNull(IteratorUtils.toString(iterator));
        assertEquals("a,b,c", IteratorUtils.toString(list.iterator()).replaceAll("\\s+", ""));
    }

    @Test
    public void testToStringWithTransformer() {
        String result = IteratorUtils.toString(iterator, new Transformer<String, String>() {
            @Override
            public String transform(String input) {
                return input.toUpperCase();
            }
        }, "-", "[", "]");
        assertEquals("[A-B-C]", result);
    }

    @Test
    public void testToStringNullDelimiter() {
        String result = IteratorUtils.toString(list.iterator(), new Transformer<String, String>() {
            @Override
            public String transform(String input) {
                return input;
            }
        }, null, "[", "]");
        assertEquals("[a,b,c]", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIteratorInvalidType() {
        IteratorUtils.getIterator((Object) "not-iterator");
    }
}