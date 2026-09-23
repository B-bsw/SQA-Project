package org.apache.commons.jxpath.ri;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NamespaceResolverTest {
    private NamespaceResolver resolver;

    @Before
    public void setUp() {
        resolver = new NamespaceResolver();
    }

    @Test
    public void testRegisterNamespaceAndGetURI() {
        resolver.registerNamespace("prefix", "uri:test");
        assertEquals("uri:test", resolver.getNamespaceURI("prefix"));
    }

    @Test
    public void testGetNamespaceURIForUnknownPrefixReturnsNull() {
        assertNull(resolver.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIDelegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPrefix", "uri:parent");
        NamespaceResolver child = new NamespaceResolver(parent);
        assertEquals("uri:parent", child.getNamespaceURI("parentPrefix"));
    }

    @Test
    public void testGetNamespaceURIWithPointer() {
        NodePointer pointer = new TestNodePointer();
        resolver.setNamespaceContextPointer(pointer);
        assertEquals("uri:pointer", resolver.getNamespaceURI("pointerPrefix"));
    }

    @Test
    public void testRegisterNamespaceInvalidatesReverseMap() {
        resolver.registerNamespace("a", "uri:a");
        resolver.registerNamespace("b", "uri:b");
        assertEquals("a", resolver.getPrefix("uri:a"));
        resolver.registerNamespace("a2", "uri:a");
        assertEquals("a2", resolver.getPrefix("uri:a"));
    }

    @Test
    public void testGetPrefixFromReverseMapping() {
        resolver.registerNamespace("prefix1", "uri:test");
        assertEquals("prefix1", resolver.getPrefix("uri:test"));
    }

    @Test
    public void testGetPrefixFromPointer() {
        NodePointer pointer = new TestNodePointer();
        resolver.setNamespaceContextPointer(pointer);
        assertEquals("pointerPrefix", resolver.getPrefix("uri:pointer"));
    }

    @Test
    public void testGetPrefixNotFoundReturnsNull() {
        assertNull(resolver.getPrefix("nonexistent"));
    }

    @Test
    public void testGetPrefixDelegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPrefix", "uri:parent");
        NamespaceResolver child = new NamespaceResolver(parent);
        assertEquals("parentPrefix", child.getPrefix("uri:parent"));
    }

    @Test
    public void testSealPreventsRegistration() {
        resolver.seal();
        try {
            resolver.registerNamespace("x", "uri:x");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSealOnChildSealsParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        child.seal();
        assertTrue(parent.isSealed());
        assertTrue(child.isSealed());
    }

    @Test
    public void testIsSealedInitiallyFalse() {
        assertFalse(resolver.isSealed());
    }

    @Test
    public void testCloneIsNotSealed() {
        resolver.seal();
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertFalse(clone.isSealed());
    }

    @Test
    public void testCloneCopiesNamespaceMap() {
        resolver.registerNamespace("key", "value");
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertEquals("value", clone.getNamespaceURI("key"));
    }

    @Test
    public void testGetNamespaceContextPointerFromParent() {
        NodePointer pointer = new TestNodePointer();
        NamespaceResolver parent = new NamespaceResolver();
        parent.setNamespaceContextPointer(pointer);
        NamespaceResolver child = new NamespaceResolver(parent);
        assertSame(pointer, child.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointerDirect() {
        NodePointer pointer = new TestNodePointer();
        resolver.setNamespaceContextPointer(pointer);
        assertSame(pointer, resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointerNullWhenNoParent() {
        assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetPrefixWithEmptyPrefixInPointer() {
        // Ensure reverse mapping only includes non-empty prefixes from pointer
        resolver.setNamespaceContextPointer(new EmptyPointer());
        resolver.registerNamespace("realPrefix", "uri:real");
        assertNull(resolver.getPrefix("uri:pointer"));
        assertEquals("realPrefix", resolver.getPrefix("uri:real"));
    }

    private static class TestNodePointer extends NodePointer {
        private static final long serialVersionUID = 1L;

        @Override
        public Object getValue() { return null; }
        
        @Override
        public Object getNode() { return null; }
        
        @Override
        public Object getBaseValue() { return null; }
        
        @Override
        public boolean isLeaf() { return true; }
        
        @Override
        public boolean isContainer() { return false; }
        
        @Override
        public String getNamespaceURI(String prefix) {
            if ("pointerPrefix".equals(prefix)) {
                return "uri:pointer";
            }
            return null;
        }

        @Override
        public NodeIterator namespaceIterator() {
            return new NodeIterator() {
                private int position = 0;
                
                @Override
                public boolean setPosition(int position) {
                    this.position = position;
                    return position >= 1 && position <= 1;
                }

                @Override
                public NodePointer getNodePointer() {
                    if (position == 1) {
                        return new NodePointer() {
                            private static final long serialVersionUID = 1L;
                            
                            @Override
                            public Object getValue() { return null; }
                            
                            @Override
                            public Object getNode() { return null; }
                            
                            @Override
                            public Object getBaseValue() { return null; }
                            
                            @Override
                            public boolean isLeaf() { return true; }
                            
                            @Override
                            public boolean isContainer() { return false; }
                            
                            @Override
                            public String getNamespaceURI() { return "uri:pointer"; }
                            
                            @Override
                            public Object getName() { return new org.apache.commons.jxpath.ri.QName("pointerPrefix"); }
                        };
                    }
                    return null;
                }

                @Override
                public int getPosition() { return position; }
            };
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
    }

    private static class EmptyPointer extends NodePointer {
        private static final long serialVersionUID = 1L;

        @Override
        public Object getValue() { return null; }
        
        @Override
        public Object getNode() { return null; }
        
        @Override
        public Object getBaseValue() { return null; }
        
        @Override
        public boolean isLeaf() { return true; }
        
        @Override
        public boolean isContainer() { return false; }

        @Override
        public NodeIterator namespaceIterator() {
            return null;
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { return 0; }
    }
}