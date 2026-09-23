package org.apache.commons.jxpath.ri.model;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodePointerTest {

    private NodePointer pointer;
    private NodePointer childPointer;
    private NodePointer parentPointer;

    private static class TestNodePointer extends NodePointer {
        private final Object value;
        private final QName name;
        private boolean container;
        private boolean collection;
        private int length = 1;

        TestNodePointer(Object value, QName name, NodePointer parent) {
            super(parent);
            this.value = value;
            this.name = name;
        }

        TestNodePointer(Object value, QName name, NodePointer parent, Locale locale) {
            super(parent, locale);
            this.value = value;
            this.name = name;
        }

        @Override
        public boolean isLeaf() {
            return false;
        }

        @Override
        public boolean isCollection() {
            return collection;
        }

        @Override
        public int getLength() {
            return length;
        }

        public void setCollection(boolean collection) {
            this.collection = collection;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setContainer(boolean container) {
            this.container = container;
        }

        @Override
        public QName getName() {
            return name;
        }

        @Override
        public Object getBaseValue() {
            return value;
        }

        @Override
        public Object getImmediateNode() {
            return value;
        }

        @Override
        public void setValue(Object value) {
            // no-op
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        @Override
        public boolean isContainer() {
            return container;
        }
    }

    @Before
    public void setUp() {
        QName name = new QName("test", "name");
        parentPointer = new TestNodePointer("parent", name, null);
        pointer = new TestNodePointer("value", name, parentPointer);
        childPointer = new TestNodePointer("child", name, pointer);
    }

    @Test
    public void testNewNodePointerNullBean() {
        QName name = new QName("test", "name");
        NodePointer result = NodePointer.newNodePointer(name, null, Locale.ENGLISH);
        assertNotNull(result);
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void testNewNodePointerNonNullBean() {
        QName name = new QName("test", "name");
        NodePointer result = NodePointer.newNodePointer(name, new Object(), Locale.ENGLISH);
        assertNotNull(result);
    }

    @Test
    public void testGetNamespaceResolverWhenNull() {
        NodePointer p = new TestNodePointer("value", new QName("test", "name"), null);
        assertNull(p.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolverWhenParent() {
        parentPointer.setNamespaceResolver(null);
        NodePointer p = new TestNodePointer("value", new QName("test", "name"), parentPointer);
        assertNull(p.getNamespaceResolver());
    }

    @Test
    public void testSetNamespaceResolver() {
        NamespaceResolver resolver = new NamespaceResolver();
        pointer.setNamespaceResolver(resolver);
        assertSame(resolver, pointer.getNamespaceResolver());
    }

    @Test
    public void testGetParentWhenContainer() {
        TestNodePointer container = new TestNodePointer("container", new QName("test", "name"), null);
        container.setContainer(true);
        TestNodePointer child = new TestNodePointer("child", new QName("test", "name"), container);
        assertEquals(container, child.getParent());
    }

    @Test
    public void testIsAttribute() {
        assertFalse(pointer.isAttribute());
        pointer.setAttribute(true);
        assertTrue(pointer.isAttribute());
    }

    @Test
    public void testIsRoot() {
        assertTrue(new TestNodePointer("root", new QName("test", "name"), null).isRoot());
        assertFalse(pointer.isRoot());
    }

    @Test
    public void testIsNode() {
        assertTrue(pointer.isNode());
        assertTrue(pointer.isContainer());
    }

    @Test
    public void testIsContainer() {
        assertFalse(pointer.isContainer());
        TestNodePointer container = new TestNodePointer("container", new QName("test", "name"), null);
        container.setContainer(true);
        assertTrue(container.isContainer());
    }

    @Test
    public void testGetIndex() {
        assertEquals(Integer.MIN_VALUE, pointer.getIndex());
        pointer.setIndex(5);
        assertEquals(5, pointer.getIndex());
    }

    @Test
    public void testIsActual() {
        assertTrue(pointer.isActual());
        pointer.setIndex(1);
        TestNodePointer collection = new TestNodePointer(new Object[1], new QName("test", "name"), null);
        collection.setCollection(true);
        collection.setLength(2);
        collection.setIndex(0);
        assertTrue(collection.isActual());
        collection.setIndex(2);
        assertFalse(collection.isActual());
    }

    @Test
    public void testGetValuePointer() {
        assertSame(pointer, pointer.getValuePointer());
    }

    @Test
    public void testTestNodeNull() {
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testTestNodeNameTest() {
        QName name = new QName("test", "name");
        NodeNameTest test = new NodeNameTest(name);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeTypeTest() {
        NodeTypeTest test = new NodeTypeTest(1);
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testCreatePath() {
        JXPathContext context = null;
        try {
            pointer.createPath(context, new Object());
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            // expected
        }
    }

    @Test
    public void testCompareToSamePointer() {
        assertEquals(0, pointer.compareTo(pointer));
    }

    @Test
    public void testCompareToDifferentType() {
        assertEquals(0, pointer.compareTo(new Object()));
    }

    @Test
    public void testGetRootNode() {
        assertNotNull(pointer.getRootNode());
    }

    @Test
    public void testAsPath() {
        assertNotNull(pointer.asPath());
    }

    @Test
    public void testClone() {
        try {
            Object clone = pointer.clone();
            assertNotNull(clone);
        } catch (CloneNotSupportedException e) {
            fail("Should not throw");
        }
    }

    @Test
    public void testToString() {
        assertEquals(pointer.asPath(), pointer.toString());
    }

    @Test
    public void testIsLanguage() {
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testGetNode() {
        TestNodePointer testPtr = (TestNodePointer) pointer;
        assertEquals("value", testPtr.getImmediateNode());
    }

    @Test
    public void testNamespacePointer() {
        assertNull(pointer.namespacePointer("prefix"));
    }

    @Test
    public void testGetNamespaceURI() {
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURINullPrefix() {
        assertNull(pointer.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURIPrefix() {
        assertEquals("", pointer.getNamespaceURI("prefix"));
    }

    @Test
    public void testGetNamespaceURINullNS() {
        assertNull(pointer.getNamespaceURI("prefix", ""));
    }

    @Test
    public void testGetNamespaceURINamespace() {
        assertEquals("namespace", pointer.getNamespaceURI("prefix", "namespace"));
    }

    @Test
    public void testIsNamespacePrefixKnown() {
        assertFalse(pointer.isNamespacePrefixKnown("prefix"));
    }

    @Test
    public void testGetPointerByID() {
        JXPathContext context = null;
        assertNull(pointer.getPointerByID(context, "id"));
    }

    @Test
    public void testGetPointerByKey() {
        JXPathContext context = null;
        assertNull(pointer.getPointerByKey(context, "key", "value"));
    }
}