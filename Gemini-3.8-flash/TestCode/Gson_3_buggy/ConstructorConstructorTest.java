package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class ConstructorConstructorTest {

  private enum SampleEnum {
    FIRST,
    SECOND
  }

  public static class ClassWithPublicNoArg {
    public ClassWithPublicNoArg() {
    }
  }

  public static class ClassWithPrivateNoArg {
    private ClassWithPrivateNoArg() {
    }
  }

  public abstract static class AbstractClassWithNoArg {
    public AbstractClassWithNoArg() {
    }
  }

  public static class ClassWithFailingConstructor {
    public ClassWithFailingConstructor() {
      throw new IllegalStateException("Constructor failure simulated");
    }
  }

  public static class ClassWithoutNoArgConstructor {
    private final int value;

    public ClassWithoutNoArgConstructor(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  @Test
  public void get_givenExactTypeInstanceCreator_shouldUseTypeCreator() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    final String expectedValue = "customInstance";
    TypeToken<String> token = TypeToken.get(String.class);

    creators.put(token.getType(), new InstanceCreator<String>() {
      public String createInstance(Type type) {
        return expectedValue;
      }
    });

    ConstructorConstructor constructorConstructor = new ConstructorConstructor(creators);
    ObjectConstructor<String> constructor = constructorConstructor.get(token);

    Assert.assertNotNull(constructor);
    String actual = constructor.construct();
    Assert.assertEquals(expectedValue, actual);
  }

  @Test
  public void get_givenRawTypeInstanceCreator_shouldUseRawTypeCreator() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    final List<String> expectedList = new LinkedList<String>();
    TypeToken<List<String>> token = new TypeToken<List<String>>() {};

    creators.put(List.class, new InstanceCreator<List<String>>() {
      public List<String> createInstance(Type type) {
        return expectedList;
      }
    });

    ConstructorConstructor constructorConstructor = new ConstructorConstructor(creators);
    ObjectConstructor<List<String>> constructor = constructorConstructor.get(token);

    Assert.assertNotNull(constructor);
    List<String> actual = constructor.construct();
    Assert.assertSame(expectedList, actual);
  }

  @Test
  public void get_givenPublicNoArgConstructor_shouldConstructInstance() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<ClassWithPublicNoArg> token = TypeToken.get(ClassWithPublicNoArg.class);

    ObjectConstructor<ClassWithPublicNoArg> constructor = constructorConstructor.get(token);

    Assert.assertNotNull(constructor);
    ClassWithPublicNoArg instance = constructor.construct();
    Assert.assertNotNull(instance);
  }

  @Test
  public void get_givenPrivateNoArgConstructor_shouldMakeAccessibleAndConstruct() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<ClassWithPrivateNoArg> token = TypeToken.get(ClassWithPrivateNoArg.class);

    ObjectConstructor<ClassWithPrivateNoArg> constructor = constructorConstructor.get(token);

    Assert.assertNotNull(constructor);
    ClassWithPrivateNoArg instance = constructor.construct();
    Assert.assertNotNull(instance);
  }

  @Test
  public void get_givenAbstractClassWithConstructor_shouldThrowRuntimeExceptionOnConstruct() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<AbstractClassWithNoArg> token = TypeToken.get(AbstractClassWithNoArg.class);

    ObjectConstructor<AbstractClassWithNoArg> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    try {
      constructor.construct();
      Assert.fail("Expected RuntimeException when instantiating abstract class");
    } catch (RuntimeException e) {
      Assert.assertTrue(e.getMessage().contains("Failed to invoke"));
      Assert.assertTrue(e.getCause() instanceof InstantiationException);
    }
  }

  @Test
  public void get_givenConstructorThrowingException_shouldThrowRuntimeExceptionWithTargetException() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<ClassWithFailingConstructor> token = TypeToken.get(ClassWithFailingConstructor.class);

    ObjectConstructor<ClassWithFailingConstructor> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    try {
      constructor.construct();
      Assert.fail("Expected RuntimeException when constructor throws exception");
    } catch (RuntimeException e) {
      Assert.assertTrue(e.getMessage().contains("Failed to invoke"));
      Assert.assertTrue(e.getCause() instanceof IllegalStateException);
      Assert.assertEquals("Constructor failure simulated", e.getCause().getMessage());
    }
  }

  @Test
  public void get_givenSortedSet_shouldConstructTreeSet() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<SortedSet<String>> token = new TypeToken<SortedSet<String>>() {};

    ObjectConstructor<SortedSet<String>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    SortedSet<String> set = constructor.construct();
    Assert.assertTrue(set instanceof TreeSet);
  }

  @Test
  public void get_givenParameterizedEnumSet_shouldConstructEnumSet() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<EnumSet<SampleEnum>> token = new TypeToken<EnumSet<SampleEnum>>() {};

    ObjectConstructor<EnumSet<SampleEnum>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    EnumSet<SampleEnum> enumSet = constructor.construct();
    Assert.assertNotNull(enumSet);
    Assert.assertTrue(enumSet.isEmpty());
  }

  @Test
  public void get_givenRawEnumSet_shouldThrowJsonIOException() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<EnumSet> token = TypeToken.get(EnumSet.class);

    ObjectConstructor<EnumSet> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    try {
      constructor.construct();
      Assert.fail("Expected JsonIOException for raw EnumSet type");
    } catch (JsonIOException e) {
      Assert.assertTrue(e.getMessage().contains("Invalid EnumSet type"));
    }
  }

  @Test
  public void get_givenParameterizedEnumSetWithNonClassType_shouldThrowJsonIOException() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());

    ParameterizedType fakeType = new ParameterizedType() {
      public Type[] getActualTypeArguments() {
        return new Type[] {
          new Type() {
            public String toString() {
              return "NonClassType";
            }
          }
        };
      }

      public Type getRawType() {
        return EnumSet.class;
      }

      public Type getOwnerType() {
        return null;
      }
    };

    @SuppressWarnings("unchecked")
    TypeToken<EnumSet<?>> token = (TypeToken<EnumSet<?>>) TypeToken.get(fakeType);

    ObjectConstructor<EnumSet<?>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    try {
      constructor.construct();
      Assert.fail("Expected JsonIOException when EnumSet generic argument is not a Class");
    } catch (JsonIOException e) {
      Assert.assertTrue(e.getMessage().contains("Invalid EnumSet type"));
    }
  }

  @Test
  public void get_givenSetInterface_shouldConstructLinkedHashSet() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Set<String>> token = new TypeToken<Set<String>>() {};

    ObjectConstructor<Set<String>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    Set<String> set = constructor.construct();
    Assert.assertTrue(set instanceof LinkedHashSet);
  }

  @Test
  public void get_givenQueueInterface_shouldConstructLinkedList() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Queue<String>> token = new TypeToken<Queue<String>>() {};

    ObjectConstructor<Queue<String>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    Queue<String> queue = constructor.construct();
    Assert.assertTrue(queue instanceof LinkedList);
  }

  @Test
  public void get_givenCollectionInterface_shouldConstructArrayList() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Collection<String>> token = new TypeToken<Collection<String>>() {};

    ObjectConstructor<Collection<String>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    Collection<String> collection = constructor.construct();
    Assert.assertTrue(collection instanceof java.util.ArrayList);
  }

  @Test
  public void get_givenSortedMapInterface_shouldConstructTreeMap() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<SortedMap<String, Object>> token = new TypeToken<SortedMap<String, Object>>() {};

    ObjectConstructor<SortedMap<String, Object>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    SortedMap<String, Object> map = constructor.construct();
    Assert.assertTrue(map instanceof TreeMap);
  }

  @Test
  public void get_givenMapWithNonStringKey_shouldConstructLinkedHashMap() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Map<Integer, String>> token = new TypeToken<Map<Integer, String>>() {};

    ObjectConstructor<Map<Integer, String>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    Map<Integer, String> map = constructor.construct();
    Assert.assertTrue(map instanceof LinkedHashMap);
  }

  @Test
  public void get_givenMapWithStringKey_shouldConstructLinkedTreeMap() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Map<String, Object>> token = new TypeToken<Map<String, Object>>() {};

    ObjectConstructor<Map<String, Object>> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    Map<String, Object> map = constructor.construct();
    Assert.assertTrue(map instanceof LinkedTreeMap);
  }

  @Test
  public void get_givenRawMapInterface_shouldConstructLinkedTreeMap() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Map> token = TypeToken.get(Map.class);

    ObjectConstructor<Map> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    Map map = constructor.construct();
    Assert.assertTrue(map instanceof LinkedTreeMap);
  }

  @Test
  public void get_givenClassWithoutNoArgConstructor_shouldUseUnsafeAllocator() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<ClassWithoutNoArgConstructor> token = TypeToken.get(ClassWithoutNoArgConstructor.class);

    ObjectConstructor<ClassWithoutNoArgConstructor> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    ClassWithoutNoArgConstructor instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertEquals(0, instance.getValue());
  }

  @Test
  public void get_givenInterfaceWithoutImplementation_shouldThrowRuntimeExceptionOnConstruct() {
    ConstructorConstructor constructorConstructor =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    TypeToken<Runnable> token = TypeToken.get(Runnable.class);

    ObjectConstructor<Runnable> constructor = constructorConstructor.get(token);
    Assert.assertNotNull(constructor);

    try {
      constructor.construct();
      Assert.fail("Expected RuntimeException when unsafe allocation fails on an interface");
    } catch (RuntimeException e) {
      Assert.assertTrue(e.getMessage().contains("Unable to invoke no-args constructor"));
    }
  }

  @Test
  public void toString_givenInstanceCreators_shouldReturnMapStringRepresentation() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    ConstructorConstructor constructorConstructor = new ConstructorConstructor(creators);

    Assert.assertEquals(creators.toString(), constructorConstructor.toString());
  }
}