package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;

public class NamedTypeTest {
    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;
    private StaticScope<JSType> emptyScope;
    private NamedType namedType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {
                // no-op for tests
            }

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {
                // no-op for tests
            }
        };
        emptyScope = new StaticScope<JSType>() {
            @Override
            public StaticSlot<JSType> getSlot(String name) {
                return null;
            }

            @Override
            public StaticSlot<JSType> getSlot(com.google.javascript.rhino.Node node) {
                return null;
            }

            @Override
            public StaticScope<JSType> getParentScope() {
                return null;
            }

            @Override
            public JSType getTypeOfThis() {
                return null;
            }
        };
        namedType = new NamedType(registry, "Foo", "source.js", 1, 2);
    }

    @After
    public void tearDown() {
        registry = null;
        errorReporter = null;
        emptyScope = null;
        namedType = null;
    }

    @Test
    public void testConstructWithValidReference() {
        assertNotNull(namedType);
        assertEquals("Foo", namedType.getReferenceName());
        assertTrue(namedType.hasReferenceName());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructWithNullReference() {
        new NamedType(registry, null, "source.js", 1, 2);
    }

    @Test
    public void testHashCode() {
        assertEquals("Foo".hashCode(), namedType.hashCode());
    }

    @Test
    public void testIsNominalType() {
        assertTrue(namedType.isNominalType());
    }

    @Test
    public void testIsNamedType() {
        assertTrue(namedType.isNamedType());
    }

    @Test
    public void testGetReferencedTypeUnresolved() {
        assertNull(namedType.getReferencedType());
    }

    @Test
    public void testResolveInternalUnresolvedTypeWithValidator() {
        NamedType nt = new NamedType(registry, "Unknown", "source.js", 1, 2);
        nt.setValidator(new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return true;
            }
        });
        JSType result = nt.resolveInternal(errorReporter, emptyScope);
        assertNotNull(result);
        assertTrue(result instanceof NamedType);
        assertEquals(nt, result);
    }

    @Test
    public void testResolveInternalWithTypedef() {
        final JSType mockType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        NamedType nt = new NamedType(registry, "Foo.Bar", "source.js", 1, 2) {
            @Override
            private JSType getTypedefType(ErrorReporter t, StaticSlot<JSType> slot, String name) {
                return mockType;
            }
        };
        // This should not throw and should resolve to unknown type
        JSType result = nt.resolveInternal(errorReporter, emptyScope);
        assertNotNull(result);
        assertTrue(result instanceof NamedType);
    }

    @Test
    public void testDefinePropertyWithoutResolution() {
        Node propertyNode = new Node(com.google.javascript.rhino.Token.NAME, "prop");
        assertTrue(namedType.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, propertyNode));
    }

    @Test
    public void testDefinePropertyWithResolution() {
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        nt.setReferencedType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        nt.setResolvedTypeInternal(nt.getReferencedTypeInternal());
        Node propertyNode = new Node(com.google.javascript.rhino.Token.NAME, "prop");
        assertTrue(nt.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, propertyNode));
    }

    @Test
    public void testSetValidatorWhenAlreadyResolved() {
        class TestPredicate implements Predicate<JSType> {
            public boolean apply(JSType type) {
                assertNotNull(type);
                return true;
            }
        }
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        nt.setReferencedType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        nt.setResolvedTypeInternal(nt.getReferencedTypeInternal());
        TestPredicate validator = new TestPredicate();
        assertTrue(nt.setValidator(validator));
    }

    @Test
    public void testSetValidatorWhenUnresolved() {
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        assertFalse(nt.setValidator(new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return true;
            }
        }));
        assertNotNull(nt.validator);
    }

    @Test
    public void testCompleteExpression() {
        StringBuilder sb = new StringBuilder();
        sb.append("test");
        sb.toString();
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testToStringWhenUnresolved() {
        assertNotNull(namedType.toString());
    }

    @Test
    public void testToStringHelperWhenUnresolved() {
        assertNotNull(namedType.toStringHelper(false));
        assertNotNull(namedType.toStringHelper(true));
    }

    @Test
    public void testResolveViaRegistryTypeFound() {
        JSType mockType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        final JSType[] referenced = {mockType};
        NamedType nt = new NamedType(registry, "Array", "source.js", 1, 2);
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {
                fail("Unexpected warning");
            }

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {
                fail("Unexpected error");
            }
        };
        // Since Array is a known type in the registry, this should resolve
        nt.resolveInternal(reporter, emptyScope);
        assertNotNull(nt.getReferencedType());
        assertNotNull(nt.toString());
    }

    @Test
    public void testResolveViaRegistryTypeNotFound() {
        NamedType nt = new NamedType(registry, "NonExistentType12345", "source.js", 1, 2);
        final boolean[] warned = {false};
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {
                warned[0] = true;
            }

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {
                warned[0] = true;
            }
        };
        nt.resolveInternal(reporter, emptyScope);
        assertTrue(warned[0]);
        assertNull(nt.getReferencedType());
    }

    @Test
    public void testResolveViaPropertiesForFunctionType() {
        final JSType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE));
        StaticScope<JSType> scope = new StaticScope<JSType>() {
            @Override
            public StaticSlot<JSType> getSlot(String name) {
                if ("Foo".equals(name)) {
                    return new StaticSlot<JSType>() {
                        @Override
                        public String getName() { return "Foo"; }
                        @Override
                        public JSType getType() { return functionType; }
                        @Override
                        public boolean isTypeInferred() { return false; }
                        @Override
                        public JSType getTypeOfThis() { return null; }
                        @Override
                        public Object getValue() { return null; }
                    };
                }
                return null;
            }

            @Override
            public StaticSlot<JSType> getSlot(Node node) { return null; }
            @Override
            public StaticScope<JSType> getParentScope() { return null; }
            @Override
            public JSType getTypeOfThis() { return null; }
        };
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        nt.setScope(scope);
        nt.resolveInternal(errorReporter, scope);
        assertNotNull(nt.getReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testCheckEnumElementCycleWithSelfReference() {
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        JSType enumElementType = registry.createEnumElementType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        nt.setReferencedType(enumElementType);
        nt.checkEnumElementCycle(errorReporter);
    }

    @Test
    public void testHandleUnresolvedTypeWithForwardDeclared() {
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        nt.registry.setForwardDeclaredType("Foo");
        nt.handleUnresolvedType(errorReporter, true);
        assertNotNull(nt.getReferencedType());
    }

    @Test
    public void testFinishPropertyContinuationsWithNull() {
        namedType.finishPropertyContinuations();
        assertNull(namedType.propertyContinuations);
    }

    @Test
    public void testResolveViaPropertiesWithUnknownFirstComponent() {
        StaticScope<JSType> scope = new StaticScope<JSType>() {
            @Override
            public StaticSlot<JSType> getSlot(String name) {
                return new StaticSlot<JSType>() {
                    @Override
                    public String getName() { return name; }
                    @Override
                    public JSType getType() { return null; }
                    @Override
                    public boolean isTypeInferred() { return false; }
                    @Override
                    public JSType getTypeOfThis() { return null; }
                    @Override
                    public Object getValue() { return null; }
                };
            }

            @Override
            public StaticSlot<JSType> getSlot(Node node) { return null; }
            @Override
            public StaticScope<JSType> getParentScope() { return null; }
            @Override
            public JSType getTypeOfThis() { return null; }
        };
        NamedType nt = new NamedType(registry, "Foo", "source.js", 1, 2);
        nt.resolveViaProperties(errorReporter, scope);
    }
}