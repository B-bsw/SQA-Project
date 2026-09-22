package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

public class DisambiguatePropertiesTest {

    private DisambiguateProperties<JSType> disambiguator;
    private AbstractCompiler compiler;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        registry = new JSTypeRegistry();
        disambiguator = new DisambiguateProperties<JSType>(compiler, new TestTypeSystem());
    }

    @After
    public void tearDown() {
        disambiguator = null;
        compiler = null;
        registry = null;
    }

    @Test
    public void testProcessWithNullExterns() {
        Node root = new Node(Node.SCRIPT);
        disambiguator.process(null, root);
    }

    @Test
    public void testProcessWithNonNullRoot() {
        Node root = new Node(Node.SCRIPT);
        disambiguator.process(new Node(Node.EMPTY), root);
    }

    @Test
    public void testTypeSystemRestrictByNotNullOrUndefined() {
        ConcreteTypeSystem typeSystem = new ConcreteTypeSystem(null, null);
        ConcreteType type = new ConcreteType(ConcreteType.UNKNOWN_TYPE);
        assertNull(typeSystem.restrictByNotNullOrUndefined(type));
    }

    @Test
    public void testTypeSystemGetTypeAlternatives() {
        ConcreteTypeSystem typeSystem = new ConcreteTypeSystem(null, null);
        ConcreteType type = new ConcreteType(ConcreteType.UNKNOWN_TYPE);
        assertNull(typeSystem.getTypeAlternatives(type));
    }

    @Test
    public void testRecordInterfacesWithNull() {
        ConcreteTypeSystem typeSystem = new ConcreteTypeSystem(null, null);
        typeSystem.recordInterfaces(null, null, null);
    }

    @Test
    public void testIsInvalidatingType() {
        ConcreteTypeSystem typeSystem = new ConcreteTypeSystem(null, null);
        assertFalse(typeSystem.isInvalidatingType(null));
        assertFalse(typeSystem.isInvalidatingType(new ConcreteType(ConcreteType.UNKNOWN_TYPE)));
    }

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public void process(Node n) {
        }

        @Override
        public Node getRoot() {
            return null;
        }

        @Override
        public Node getLastChange() {
            return null;
        }

        @Override
        public void setLastChange(Node n) {
        }
    }

    private static class TestTypeSystem implements DisambiguateProperties.TypeSystem<JSType> {
        @Override
        public void addInvalidatingType(JSType type) {
        }

        @Override
        public StaticScope<JSType> getRootScope() {
            return null;
        }

        @Override
        public StaticScope<JSType> getFunctionScope(Node node) {
            return null;
        }

        @Override
        public JSType getType(Node node) {
            return null;
        }

        @Override
        public boolean isInvalidatingType(JSType type) {
            return false;
        }

        @Override
        public boolean isTypeToSkip(JSType type) {
            return false;
        }

        @Override
        public ImmutableSet<JSType> getTypesToSkipForType(JSType type) {
            return ImmutableSet.of();
        }

        @Override
        public JSType restrictByNotNullOrUndefined(JSType type) {
            return null;
        }

        @Override
        public Iterable<JSType> getTypeAlternatives(JSType type) {
            return null;
        }

        @Override
        public ObjectType getTypeWithProperty(String field, JSType type) {
            return null;
        }

        @Override
        public JSType getInstanceFromPrototype(JSType type) {
            return null;
        }

        @Override
        public void recordInterfaces(JSType type, JSType relatedType, Object property) {
        }
    }
}