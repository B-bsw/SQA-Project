package org.apache.commons.jxpath.ri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class NamespaceResolverTest {

    @Test
    public void constructor_givenNoParent_shouldInitializeWithNullParentAndUnsealed() {
        // Arrange & Act
        NamespaceResolver resolver = new NamespaceResolver();

        // Assert
        Assert.assertNull(resolver.parent);
        Assert.assertFalse(resolver.isSealed());
        Assert.assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void constructor_givenParent_shouldRetainParentReference() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();

        // Act
        NamespaceResolver child = new NamespaceResolver(parent);

        // Assert
        Assert.assertSame(parent, child.parent);
        Assert.assertFalse(child.isSealed());
    }

    @Test
    public void registerNamespace_givenUnsealedResolver_shouldRegisterAndResetReverseMap() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();
        TestNodePointer pointer = new TestNodePointer();
        resolver.setNamespaceContextPointer(pointer);
        resolver.getPrefix("http://initial.org");
        Assert.assertNotNull(resolver.reverseMap);

        // Act
        resolver.registerNamespace("ns", "http://example.org");

        // Assert
        Assert.assertNull(resolver.reverseMap);
        Assert.assertEquals("http://example.org", resolver.getNamespaceURI("ns"));
    }

    @Test(expected = IllegalStateException.class)
    public void registerNamespace_givenSealedResolver_shouldThrowIllegalStateException() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();

        // Act
        resolver.registerNamespace("ns", "http://example.org");
    }

    @Test
    public void setNamespaceContextPointer_givenPointer_shouldSetPointerProperly() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();
        TestNodePointer pointer = new TestNodePointer();

        // Act
        resolver.setNamespaceContextPointer(pointer);

        // Assert
        Assert.assertSame(pointer, resolver.getNamespaceContextPointer());
    }

    @Test
    public void getNamespaceContextPointer_givenPointerNullAndParentNull_shouldReturnNull() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();

        // Act
        Pointer result = resolver.getNamespaceContextPointer();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void getNamespaceContextPointer_givenPointerNullAndParentHasPointer_shouldDelegateToParent() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        TestNodePointer parentPointer = new TestNodePointer();
        parent.setNamespaceContextPointer(parentPointer);

        NamespaceResolver child = new NamespaceResolver(parent);

        // Act
        Pointer result = child.getNamespaceContextPointer();

        // Assert
        Assert.assertSame(parentPointer, result);
    }

    @Test
    public void getNamespaceContextPointer_givenChildAndParentBothHavePointers_shouldReturnChildPointer() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        TestNodePointer parentPointer = new TestNodePointer();
        parent.setNamespaceContextPointer(parentPointer);

        NamespaceResolver child = new NamespaceResolver(parent);
        TestNodePointer childPointer = new TestNodePointer();
        child.setNamespaceContextPointer(childPointer);

        // Act
        Pointer result = child.getNamespaceContextPointer();

        // Assert
        Assert.assertSame(childPointer, result);
    }

    @Test
    public void getNamespaceURI_givenPrefixInNamespaceMap_shouldReturnRegisteredURI() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("xml", "http://www.w3.org/XML/1998/namespace");

        // Act
        String uri = resolver.getNamespaceURI("xml");

        // Assert
        Assert.assertEquals("http://www.w3.org/XML/1998/namespace", uri);
    }

    @Test
    public void getNamespaceURI_givenPrefixNotInMapButInPointer_shouldReturnPointerURI() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();
        TestNodePointer pointer = new TestNodePointer();
        pointer.putNamespaceURI("pfx", "http://pointer.org");
        resolver.setNamespaceContextPointer(pointer);

        // Act
        String uri = resolver.getNamespaceURI("pfx");

        // Assert
        Assert.assertEquals("http://pointer.org", uri);
    }

    @Test
    public void getNamespaceURI_givenPrefixNotInMapNorPointerButInParent_shouldReturnParentURI() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPfx", "http://parent.org");

        NamespaceResolver child = new NamespaceResolver(parent);
        TestNodePointer childPointer = new TestNodePointer();
        child.setNamespaceContextPointer(childPointer);

        // Act
        String uri = child.getNamespaceURI("parentPfx");

        // Assert
        Assert.assertEquals("http://parent.org", uri);
    }

    @Test
    public void getNamespaceURI_givenPrefixNotInMapAndPointerNullAndParentHasIt_shouldReturnParentURI() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPfx", "http://parent.org");

        NamespaceResolver child = new NamespaceResolver(parent);

        // Act
        String uri = child.getNamespaceURI("parentPfx");

        // Assert
        Assert.assertEquals("http://parent.org", uri);
    }

    @Test
    public void getNamespaceURI_givenPrefixNotFoundAnywhere_shouldReturnNull() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        TestNodePointer pointer = new TestNodePointer();
        child.setNamespaceContextPointer(pointer);

        // Act
        String uri = child.getNamespaceURI("unknown");

        // Assert
        Assert.assertNull(uri);
    }

    @Test(expected = NullPointerException.class)
    public void getPrefix_givenPointerIsNullAndReverseMapIsNull_shouldThrowNullPointerException() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();

        // Act
        resolver.getPrefix("http://example.org");
    }

    @Test
    public void getPrefix_givenPointerWithNullNamespaceIterator_shouldResolveFromNamespaceMap() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();
        TestNodePointer pointer = new TestNodePointer();
        pointer.setNamespaceIterator(null);
        resolver.setNamespaceContextPointer(pointer);
        resolver.registerNamespace("myPrefix", "http://my.org");

        // Act
        String prefix = resolver.getPrefix("http://my.org");

        // Assert
        Assert.assertEquals("myPrefix", prefix);
    }

    @Test
    public void getPrefix_givenPointerWithNamespaceIterator_shouldExtractNamespacesAndIgnoreEmptyPrefix() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();

        List nodes = new ArrayList();
        TestNodePointer nsPointer1 = new TestNodePointer(new QName("validPrefix"), "http://valid.org");
        TestNodePointer nsPointer2 = new TestNodePointer(new QName(""), "http://empty.org");
        nodes.add(nsPointer1);
        nodes.add(nsPointer2);

        TestNodeIterator iterator = new TestNodeIterator(nodes);
        TestNodePointer contextPointer = new TestNodePointer();
        contextPointer.setNamespaceIterator(iterator);
        resolver.setNamespaceContextPointer(contextPointer);

        // Act
        String validPrefix = resolver.getPrefix("http://valid.org");
        String emptyPrefix = resolver.getPrefix("http://empty.org");

        // Assert
        Assert.assertEquals("validPrefix", validPrefix);
        Assert.assertNull(emptyPrefix);
    }

    @Test
    public void getPrefix_givenNamespaceMapOverridesPointerIteratorPrefix_shouldPreferNamespaceMap() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();

        List nodes = new ArrayList();
        TestNodePointer nsPointer = new TestNodePointer(new QName("nodePrefix"), "http://shared.org");
        nodes.add(nsPointer);

        TestNodeIterator iterator = new TestNodeIterator(nodes);
        TestNodePointer contextPointer = new TestNodePointer();
        contextPointer.setNamespaceIterator(iterator);
        resolver.setNamespaceContextPointer(contextPointer);

        resolver.registerNamespace("mapPrefix", "http://shared.org");

        // Act
        String prefix = resolver.getPrefix("http://shared.org");

        // Assert
        Assert.assertEquals("mapPrefix", prefix);
    }

    @Test
    public void getPrefix_givenReverseMapCached_shouldReturnCachedResultWithoutRequeryingIterator() {
        // Arrange
        NamespaceResolver resolver = new NamespaceResolver();

        List nodes = new ArrayList();
        TestNodePointer nsPointer = new TestNodePointer(new QName("cachedPrefix"), "http://cached.org");
        nodes.add(nsPointer);

        TestNodeIterator iterator = new TestNodeIterator(nodes);
        TestNodePointer contextPointer = new TestNodePointer();
        contextPointer.setNamespaceIterator(iterator);
        resolver.setNamespaceContextPointer(contextPointer);

        // Act
        String firstCall = resolver.getPrefix("http://cached.org");
        // Clear nodes to verify that subsequent lookup does not use iterator
        nodes.clear();
        String secondCall = resolver.getPrefix("http://cached.org");

        // Assert
        Assert.assertEquals("cachedPrefix", firstCall);
        Assert.assertEquals("cachedPrefix", secondCall);
    }

    @Test
    public void getPrefix_givenUriNotInCurrentResolverButInParent_shouldDelegateToParent() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        TestNodePointer parentPointer = new TestNodePointer();
        parent.setNamespaceContextPointer(parentPointer);
        parent.registerNamespace("parentNs", "http://parent.org");

        NamespaceResolver child = new NamespaceResolver(parent);
        TestNodePointer childPointer = new TestNodePointer();
        child.setNamespaceContextPointer(childPointer);

        // Act
        String prefix = child.getPrefix("http://parent.org");

        // Assert
        Assert.assertEquals("parentNs", prefix);
    }

    @Test
    public void getPrefix_givenUriNotFoundAnywhere_shouldReturnNull() {
        // Arrange
        NamespaceResolver parent = new NamespaceResolver();
        TestNodePointer parentPointer = new TestNodePointer();
        parent.setNamespaceContextPointer(parentPointer);

        NamespaceResolver child = new NamespaceResolver(parent);
        TestNodePointer childPointer = new TestNodePointer();
        child.setNamespaceContextPointer(childPointer);

        // Act
        String prefix = child.getPrefix("http://nonexistent.org");

        // Assert
        Assert.assertNull(prefix);
    }

    @Test
    public void seal_givenHierarchy_shouldSealAllResolversInHierarchy() {
        // Arrange
        NamespaceResolver root = new NamespaceResolver();
        NamespaceResolver mid = new NamespaceResolver(root);
        NamespaceResolver leaf = new NamespaceResolver(mid);

        Assert.assertFalse(root.isSealed());
        Assert.assertFalse(mid.isSealed());
        Assert.assertFalse(leaf.isSealed());

        // Act
        leaf.seal();

        // Assert
        Assert.assertTrue(leaf.isSealed());
        Assert.assertTrue(mid.isSealed());
        Assert.assertTrue(root.isSealed());
    }

    @Test
    public void clone_givenSealedResolver_shouldProduceUnsealedCloneWithSameConfiguration() {
        // Arrange
        NamespaceResolver original = new NamespaceResolver();
        original.registerNamespace("pfx", "http://test.org");
        TestNodePointer pointer = new TestNodePointer();
        original.setNamespaceContextPointer(pointer);
        original.seal();

        Assert.assertTrue(original.isSealed());

        // Act
        Object clonedObj = original.clone();

        // Assert
        Assert.assertNotNull(clonedObj);
        Assert.assertTrue(clonedObj instanceof NamespaceResolver);
        NamespaceResolver cloned = (NamespaceResolver) clonedObj;

        Assert.assertNotSame(original, cloned);
        Assert.assertFalse(cloned.isSealed());
        Assert.assertEquals("http://test.org", cloned.getNamespaceURI("pfx"));
        Assert.assertSame(pointer, cloned.getNamespaceContextPointer());

        // Cloned instance can register namespaces because sealed == false
        cloned.registerNamespace("newPfx", "http://new.org");
        Assert.assertEquals("http://new.org", cloned.getNamespaceURI("newPfx"));
    }

    // ==========================================
    // Test Doubles (Java 1.4 / 7 Compatible)
    // ==========================================

    private static class TestNodePointer extends NodePointer {
        private QName name;
        private String uri;
        private NodeIterator namespaceIterator;
        private Map prefixToUriMap = new HashMap();

        public TestNodePointer() {
            super(null);
        }

        public TestNodePointer(QName name, String uri) {
            super(null);
            this.name = name;
            this.uri = uri;
        }

        public void putNamespaceURI(String prefix, String namespaceURI) {
            this.prefixToUriMap.put(prefix, namespaceURI);
        }

        public void setNamespaceIterator(NodeIterator iterator) {
            this.namespaceIterator = iterator;
        }

        public String getNamespaceURI(String prefix) {
            return (String) prefixToUriMap.get(prefix);
        }

        public NodeIterator namespaceIterator() {
            return this.namespaceIterator;
        }

        public String getNamespaceURI() {
            return this.uri;
        }

        public QName getName() {
            return this.name;
        }

        public boolean isLeaf() {
            return false;
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public Object getBaseValue() {
            return null;
        }

        public Object getImmediateNode() {
            return null;
        }

        public void setValue(Object value) {
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        public String asPath() {
            return "";
        }
    }

    private static class TestNodeIterator implements NodeIterator {
        private List list;
        private int position = 0;

        public TestNodeIterator(List list) {
            this.list = list;
        }

        public int getPosition() {
            return this.position;
        }

        public boolean setPosition(int position) {
            this.position = position;
            return position >= 1 && position <= list.size();
        }

        public NodePointer getNodePointer() {
            if (this.position >= 1 && this.position <= list.size()) {
                return (NodePointer) list.get(this.position - 1);
            }
            return null;
        }
    }
}