package com.google.gson.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class ConstructorConstructorTest {

  private ConstructorConstructor constructorConstructor;

  @Before
  public void setUp() {
    constructorConstructor = new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>());
  }

  @Test
  public void testGet_withInstanceCreatorForExactType() {
    final String type = "test";
    ConstructorConstructor cc = new ConstructorConstructor(
        new LinkedHashMap<Type, InstanceCreator<?>>() {{
          put(String.class, new InstanceCreator<String>() {
            @Override public String createInstance(Type type) {
              return type.toString();
            }
          });
        }});
    ObjectConstructor<String> constructor = cc.get(TypeToken.get(String.class));
    assertEquals("class java.lang.String", constructor.construct());
  }

  @Test
  public void testGet_withInstanceCreatorForRawType() {
    final String type = "test";
    ConstructorConstructor cc = new ConstructorConstructor(
        new LinkedHashMap<Type, InstanceCreator<?>>() {{
          put(CharSequence.class, new InstanceCreator<CharSequence>() {
            @Override public CharSequence createInstance(Type type) {
              return type.toString() + "raw";
            }
          });
        }});
    ObjectConstructor<String> constructor = cc.get(TypeToken.get(String.class));
    assertEquals("class java.lang.Stringraw", constructor.construct());
  }

  @Test
  public void testGet_defaultConstructorWithPublicClass() {
    ObjectConstructor<PublicClass> constructor = constructorConstructor.get(TypeToken.get(PublicClass.class));
    assertNotNull(constructor.construct());
    assertTrue(constructor.construct() instanceof PublicClass);
  }

  @Test
  public void testGet_defaultConstructorWithPrivateConstructor() {
    try {
      constructorConstructor.get(TypeToken.get(PrivateConstructorClass.class)).construct();
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
      // expected
    }
  }

  @Test
  public void testGet_collectionTypes() {
    assertEquals(TreeSet.class, constructorConstructor.get(TypeToken.get(TreeSet.class)).construct().getClass());
    assertEquals(LinkedHashSet.class, constructorConstructor.get(TypeToken.get(LinkedHashSet.class)).construct().getClass());
    assertEquals(LinkedList.class, constructorConstructor.get(TypeToken.get(LinkedList.class)).construct().getClass());
    assertEquals(ArrayList.class, constructorConstructor.get(TypeToken.get(ArrayList.class)).construct().getClass());
  }

  @Test
  public void testGet_enumSet() {
    assertEquals(EnumSet.noneOf(TestEnum.class).getClass(),
        constructorConstructor.get(TypeToken.get(TestEnumSet.class)).construct().getClass());
  }

  @Test
  public void testGet_enumSetWithNonClassType() {
    Type type = new TypeToken<EnumSet<TestEnum>>() {}.getType();
    try {
      constructorConstructor.get(TypeToken.get(type)).construct();
      fail("Expected JsonIOException");
    } catch (JsonIOException e) {
      // expected
    }
  }

  @Test
  public void testGet_enumSetWithNonParameterizedType() {
    try {
      constructorConstructor.get(TypeToken.get(TestEnum.class)).construct();
      fail("Expected JsonIOException");
    } catch (JsonIOException e) {
      // expected
    }
  }

  @Test
  public void testGet_sortedMap() {
    assertEquals(TreeMap.class, constructorConstructor.get(TypeToken.get(SortedMap.class)).construct().getClass());
  }

  @Test
  public void testGet_mapWithStringKey() {
    assertEquals(LinkedTreeMap.class, constructorConstructor.get(TypeToken.get(Map.class)).construct().getClass());
  }

  @Test
  public void testGet_mapWithNonStringKey() {
    Type type = new TypeToken<Map<Integer, String>>() {}.getType();
    assertEquals(LinkedHashMap.class, constructorConstructor.get(TypeToken.get(type)).construct().getClass());
  }

  @Test
  public void testGet_noDefaultConstructorFallsBackToUnsafe() {
    ObjectConstructor<NoDefaultConstructorClass> constructor = constructorConstructor.get(TypeToken.get(NoDefaultConstructorClass.class));
    assertNotNull(constructor.construct());
  }

  @Test
  public void testGet_unsafeAllocatorFails() {
    try {
      constructorConstructor.get(TypeToken.get(UnsafeFailClass.class)).construct();
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
      // expected
    }
  }

  @Test
  public void testToString() {
    ConstructorConstructor cc = new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>());
    assertEquals("{}", cc.toString());
  }

  // Helper classes
  public static class PublicClass {
    public PublicClass() {}
  }

  public static class PrivateConstructorClass {
    private PrivateConstructorClass() {}
  }

  public enum TestEnum { VALUE1, VALUE2 }

  public static class TestEnumSet {
    public TestEnumSet() {}
  }

  public static class NoDefaultConstructorClass {
    public NoDefaultConstructorClass(String arg) {}
  }

  public static class UnsafeFailClass {
    public UnsafeFailClass() {
      throw new RuntimeException("Cannot instantiate");
    }
  }
}