package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResolvedRecursiveTypeTest {

    private ResolvedRecursiveType unresolved;
    private JavaType stringType;
    private JavaType intType;

    @Before
    public void setUp() {
        unresolved = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        stringType = SimpleType.constructUnsafe(String.class);
        intType = SimpleType.constructUnsafe(Integer.class);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testInitialState() {
        assertNull(unresolved.getSelfReferencedType());
        assertFalse(unresolved.isContainerType());
        assertEquals("[recursive type; UNRESOLVED", unresolved.toString());
        assertTrue(unresolved.equals(unresolved));
        assertFalse(unresolved.equals(null));

        ResolvedRecursiveType other = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        assertFalse(unresolved.equals(other));
    }

    @Test
    public void testSetReferenceAndDelegatedSignatures() {
        unresolved.setReference(stringType);

        assertSame(stringType, unresolved.getSelfReferencedType());
        assertEquals("[recursive type; java.lang.String", unresolved.toString());
        assertEquals("Ljava/lang/String;", unresolved.getGenericSignature(new StringBuilder()).toString());
        assertEquals("Ljava/lang/String;", unresolved.getErasedSignature(new StringBuilder()).toString());
    }

    @Test
    public void testSetReferenceNullAllowed() {
        unresolved.setReference(null);

        assertNull(unresolved.getSelfReferencedType());
        assertEquals("[recursive type; UNRESOLVED", unresolved.toString());
    }

    @Test
    public void testSetReferenceTwiceThrows() {
        unresolved.setReference(stringType);

        try {
            unresolved.setReference(intType);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException ex) {
            assertTrue(ex.getMessage().contains("Trying to re-set self reference"));
            assertSame(stringType, unresolved.getSelfReferencedType());
        }
    }

    @Test
    public void testWithMethodsReturnSameInstance() {
        assertSame(unresolved, unresolved.withContentType(stringType));
        assertSame(unresolved, unresolved.withTypeHandler(new Object()));
        assertSame(unresolved, unresolved.withContentTypeHandler(new Object()));
        assertSame(unresolved, unresolved.withValueHandler(new Object()));
        assertSame(unresolved, unresolved.withContentValueHandler(new Object()));
        assertSame(unresolved, unresolved.withStaticTyping());
    }

    @Test
    public void testRefineReturnsNull() {
        assertNull(unresolved.refine(String.class, TypeBindings.emptyBindings(), stringType,
                new JavaType[] { intType }));
    }

    @Test
    public void testEqualsForResolvedTypes() {
        ResolvedRecursiveType first = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType same = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType different = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());

        first.setReference(stringType);
        same.setReference(stringType);
        different.setReference(intType);

        assertTrue(first.equals(same));
        assertFalse(first.equals(different));
        assertFalse(first.equals(new Object()));
    }
}