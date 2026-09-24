package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class CollectionLikeTypeTest {

    private TypeFactory tf;

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
    }

    @After
    public void tearDown() {
        tf = null;
    }

    private CollectionLikeType createType(Class<?> raw, JavaType elem) {
        return CollectionLikeType.construct(raw, TypeBindings.emptyBindings(), null, null, elem);
    }

    @Test
    public void testConstructAndBasicProperties() {
        JavaType elem = tf.constructType(String.class);
        CollectionLikeType type = createType(List.class, elem);
        assertNotNull(type);
        assertEquals(elem, type.getContentType());
        assertTrue(type.isContainerType());
        assertTrue(type.isCollectionLikeType());
        assertTrue(type.isTrueCollectionType());
        assertFalse(type.isMapLikeType());
        assertFalse(type.hasHandlers());
        assertTrue(type.toString().contains("collection-like type"));
    }

    @Test
    public void testConstructDeprecated() {
        JavaType elem = tf.constructType(Integer.class);
        CollectionLikeType type = CollectionLikeType.construct(String.class, elem);
        assertNotNull(type);
        assertEquals(elem, type.getContentType());
        assertFalse(type.isTrueCollectionType());
    }

    @Test
    public void testUpgradeFrom() {
        JavaType base = tf.constructType(List.class);
        JavaType elem = tf.constructType(String.class);
        CollectionLikeType type = CollectionLikeType.upgradeFrom(base, elem);
        assertNotNull(type);
        assertEquals(elem, type.getContentType());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructNullElemThrowsNPE() {
        CollectionLikeType.construct(List.class, TypeBindings.emptyBindings(), null, null, null);
    }

    @Test
    public void testWithContentType() {
        JavaType elem1 = tf.constructType(String.class);
        JavaType elem2 = tf.constructType(Integer.class);
        CollectionLikeType base = createType(List.class, elem1);
        assertSame(base, base.withContentType(elem1));
        CollectionLikeType changed = base.withContentType(elem2);
        assertNotSame(base, changed);
        assertEquals(elem2, changed.getContentType());
    }

    @Test
    public void testWithHandlers() {
        CollectionLikeType base = createType(List.class, tf.constructType(String.class));
        assertFalse(base.hasHandlers());

        CollectionLikeType t1 = base.withTypeHandler(new Object());
        assertNotSame(base, t1);
        assertTrue(t1.hasHandlers());

        CollectionLikeType t2 = base.withContentTypeHandler(new Object());
        assertNotSame(base, t2);
        assertNotNull(t2.getContentTypeHandler());

        CollectionLikeType t3 = base.withValueHandler(new Object());
        assertNotSame(base, t3);
        assertNotNull(t3.getValueHandler());

        CollectionLikeType t4 = base.withContentValueHandler(new Object());
        assertNotSame(base, t4);
        assertNotNull(t4.getContentValueHandler());
    }

    @Test
    public void testWithStaticTyping() {
        CollectionLikeType base = createType(List.class, tf.constructType(String.class));
        CollectionLikeType staticTyped = base.withStaticTyping();
        assertNotSame(base, staticTyped);
        assertSame(staticTyped, staticTyped.withStaticTyping());
    }

    @Test
    public void testRefine() {
        CollectionLikeType base = createType(List.class, tf.constructType(String.class));
        CollectionLikeType refined = base.refine(List.class, TypeBindings.emptyBindings(), null, null);
        assertNotNull(refined);
        assertEquals(base.getContentType(), refined.getContentType());
    }

    @Test
    public void testSignatures() {
        CollectionLikeType type = createType(List.class, tf.constructType(String.class));
        String erased = type.getErasedSignature(new StringBuilder()).toString();
        assertTrue(erased.startsWith("L"));
        assertTrue(erased.endsWith(";"));

        String generic = type.getGenericSignature(new StringBuilder()).toString();
        assertTrue(generic.contains("<"));
        assertTrue(generic.endsWith(">;"));
    }

    @Test
    public void testEquals() {
        JavaType elem1 = tf.constructType(String.class);
        JavaType elem2 = tf.constructType(Integer.class);
        CollectionLikeType type1 = createType(List.class, elem1);
        CollectionLikeType type2 = createType(List.class, elem1);
        CollectionLikeType type3 = createType(ArrayList.class, elem1);
        CollectionLikeType type4 = createType(List.class, elem2);

        assertEquals(type1, type2);
        assertFalse(type1.equals(null));
        assertFalse(type1.equals(new Object()));
        assertNotEquals(type1, type3);
        assertNotEquals(type1, type4);
    }
}