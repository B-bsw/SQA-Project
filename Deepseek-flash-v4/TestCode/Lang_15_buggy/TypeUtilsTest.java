package org.apache.commons.lang3.reflect;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;

public class TypeUtilsTest {

    private List<String> stringList;
    private Map<String, Integer> stringIntegerMap;

    @Before
    public void setUp() {
        stringList = new ArrayList<String>();
        stringIntegerMap = new HashMap<String, Integer>();
    }

    @After
    public void tearDown() {
        stringList = null;
        stringIntegerMap = null;
    }

    @Test
    public void testIsAssignableClassWithNullType() {
        assertTrue(TypeUtils.isAssignable(null, Object.class));
        assertTrue(TypeUtils.isAssignable(null, null));
        assertFalse(TypeUtils.isAssignable(null, int.class));
    }

    @Test
    public void testIsAssignablePrimitiveAndWrapper() {
        assertTrue(TypeUtils.isAssignable(int.class, Integer.class));
        assertTrue(TypeUtils.isAssignable(Integer.class, int.class));
        assertTrue(TypeUtils.isAssignable(double.class, Double.class));
        assertTrue(TypeUtils.isAssignable(double.class, double.class));
        assertTrue(TypeUtils.isAssignable(int.class, long.class));
        assertFalse(TypeUtils.isAssignable(int.class, boolean.class));
    }

    @Test
    public void testIsAssignableClassHierarchy() {
        assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        assertTrue(TypeUtils.isAssignable(ArrayList.class, List.class));
        assertTrue(TypeUtils.isAssignable(ArrayList.class, Collection.class));
        assertFalse(TypeUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void testIsAssignableParameterizedType() {
        ParameterizedType listType = (ParameterizedType) stringList.getClass().getGenericSuperclass();
        ParameterizedType mapType = (ParameterizedType) stringIntegerMap.getClass().getGenericSuperclass();
        
        assertTrue(TypeUtils.isAssignable(listType, listType));
        assertFalse(TypeUtils.isAssignable(mapType, listType));
    }

    @Test
    public void testIsAssignableGenericArrayType() {
        Type stringArrayType = new GenericArrayType() {
            @Override
            public Type getGenericComponentType() {
                return String.class;
            }
        };
        assertTrue(TypeUtils.isAssignable(stringArrayType, String[].class));
        assertFalse(TypeUtils.isAssignable(stringArrayType, Integer[].class));
    }

    @Test
    public void testIsAssignableWildcardType() {
        WildcardType wildcard = new WildcardType() {
            @Override
            public Type[] getUpperBounds() {
                return new Type[] { Number.class };
            }

            @Override
            public Type[] getLowerBounds() {
                return new Type[0];
            }
        };
        assertTrue(TypeUtils.isAssignable(Integer.class, wildcard));
        assertFalse(TypeUtils.isAssignable(String.class, wildcard));
    }

    @Test
    public void testIsAssignableTypeVariable() {
        TypeVariable<?> typeVar = new TypeVariable<Class<?>>() {
            @Override
            public String getName() {
                return "T";
            }

            @Override
            public Type[] getBounds() {
                return new Type[] { Comparable.class };
            }

            @Override
            public Class<?> getGenericDeclaration() {
                return String.class;
            }
        };
        assertTrue(TypeUtils.isAssignable(String.class, typeVar));
        assertFalse(TypeUtils.isAssignable(Integer.class, typeVar));
    }

    @Test(expected = IllegalStateException.class)
    public void testIsAssignableUnhandledType() {
        Type unknownType = new Type() {};
        TypeUtils.isAssignable(unknownType, unknownType);
    }

    @Test
    public void testGetTypeArgumentsEmpty() {
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(String.class, Object.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetTypeArgumentsWithParameterizedType() {
        Type genericSuperclass = new ArrayList<String>().getClass().getGenericSuperclass();
        assertTrue(genericSuperclass instanceof ParameterizedType);
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(genericSuperclass, List.class);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testIsArrayType() {
        assertTrue(TypeUtils.isArrayType(String[].class));
        assertTrue(TypeUtils.isArrayType(new GenericArrayType() {
            @Override
            public Type getGenericComponentType() {
                return String.class;
            }
        }));
        assertFalse(TypeUtils.isArrayType(String.class));
        assertFalse(TypeUtils.isArrayType(null));
    }

    @Test
    public void testGetArrayComponentType() {
        assertEquals(String.class, TypeUtils.getArrayComponentType(String[].class));
        GenericArrayType genericArray = new GenericArrayType() {
            @Override
            public Type getGenericComponentType() {
                return Integer.class;
            }
        };
        assertEquals(Integer.class, TypeUtils.getArrayComponentType(genericArray));
    }

    @Test
    public void testIsInstance() {
        assertTrue(TypeUtils.isInstance("test", String.class));
        assertTrue(TypeUtils.isInstance(123, Object.class));
        assertFalse(TypeUtils.isInstance(null, int.class));
        assertTrue(TypeUtils.isInstance(null, String.class));
        assertTrue(TypeUtils.isInstance(42, Integer.class));
        assertFalse(TypeUtils.isInstance(42, String.class));
    }

    @Test
    public void testNormalizeUpperBoundsLengthLessThanTwo() {
        Type[] single = new Type[] { Number.class };
        assertArrayEquals(single, TypeUtils.normalizeUpperBounds(single));
    }

    @Test
    public void testNormalizeUpperBoundsWithMultipleBounds() {
        Type[] bounds = new Type[] { Number.class, Integer.class };
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertNotNull(normalized);
    }

    @Test
    public void testGetImplicitBounds() {
        TypeVariable<?> typeVar = new TypeVariable<Class<?>>() {
            @Override
            public String getName() { return "T"; }
            @Override
            public Type[] getBounds() { return new Type[0]; }
            @Override
            public Class<?> getGenericDeclaration() { return Object.class; }
        };
        Type[] bounds = TypeUtils.getImplicitBounds(typeVar);
        assertEquals(1, bounds.length);
        assertEquals(Object.class, bounds[0]);
    }

    @Test
    public void testTypesSatisfyVariablesNullMap() {
        TypeVariable<?> typeVar = new TypeVariable<Class<?>>() {
            @Override
            public String getName() { return "T"; }
            @Override
            public Type[] getBounds() { return new Type[] { Serializable.class }; }
            @Override
            public Class<?> getGenericDeclaration() { return Object.class; }
        };
        Map<TypeVariable<?>, Type> assignments = new HashMap<TypeVariable<?>, Type>();
        assignments.put(typeVar, String.class);
        assertTrue(TypeUtils.typesSatisfyVariables(assignments));
    }

    @Test
    public void testGetRawType() {
        ParameterizedType paramType = new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() { return new Type[] { String.class }; }
            @Override
            public Type getRawType() { return List.class; }
            @Override
            public Type getOwnerType() { return null; }
        };
        assertEquals(List.class, TypeUtils.getRawType(paramType, null));
        assertEquals(String.class, TypeUtils.getRawType(String.class, null));
    }

    @Test
    public void testDetermineTypeArgumentsWithNullSuperType() {
        assertNull(TypeUtils.determineTypeArguments(String.class, null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubstituteTypeVariablesMissingAssignment() {
        TypeVariable<?> typeVar = new TypeVariable<Class<?>>() {
            @Override
            public String getName() { return "T"; }
            @Override
            public Type[] getBounds() { return new Type[0]; }
            @Override
            public Class<?> getGenericDeclaration() { return Object.class; }
        };
        TypeUtils.substituteTypeVariables(typeVar, new HashMap<TypeVariable<?>, Type>());
    }
}