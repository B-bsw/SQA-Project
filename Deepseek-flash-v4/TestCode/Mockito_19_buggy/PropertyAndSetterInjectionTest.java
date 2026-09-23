package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.configuration.injection.filter.MockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter;
import org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter;
import org.mockito.internal.util.collections.ListUtil;
import org.mockito.internal.util.reflection.FieldInitializationReport;
import org.mockito.internal.util.reflection.FieldInitializer;
import org.mockito.internal.util.reflection.SuperTypesLastSorter;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection injection;

    @Before
    public void setUp() {
        injection = new PropertyAndSetterInjection();
    }

    @Test
    public void testInjectionWithNoMocks() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field");
        assertFalse(injection.processInjection(f, instance, Collections.emptySet()));
        assertNull(instance.field);
    }

    @Test
    public void testInjectionWithUninitializedField() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field");
        String mockValue = "mock";
        Set<Object> mocks = Collections.singleton(mockValue);
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.field);
    }

    @Test
    public void testInjectionWithMatchingFieldType() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        instance.field = "initial";
        Field f = TestClass.class.getDeclaredField("field");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks)); // no injection because field already set
        assertEquals("initial", instance.field);
    }

    @Test
    public void testInjectionWithNullFieldAndMocks() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.field); // field type String is not injectable by mock
    }

    @Test
    public void testInjectionWithCustomType() throws Exception {
        class TestClass {
            private Foo foo;
        }
        class Foo {}
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("foo");
        Foo mockFoo = mock(Foo.class);
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockFoo));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.foo); // no injection because field is null and type is injectable but no setter
    }

    @Test
    public void testInjectionWithFinalField() throws Exception {
        class TestClass {
            private final String field = "init";
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertEquals("init", instance.field);
    }

    @Test
    public void testInjectionWithStaticField() throws Exception {
        class TestClass {
            private static String field;
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(TestClass.field);
    }

    @Test
    public void testInjectionWithFieldInSuperclass() throws Exception {
        class SuperClass {
            protected String superField;
        }
        class SubClass extends SuperClass {
            private String subField;
        }
        SubClass instance = new SubClass();
        Field f = SubClass.class.getDeclaredField("subField");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.superField);
    }

    @Test(expected = MockitoException.class)
    public void testInjectionWithInitializationError() throws Exception {
        class TestClass {
            private List<String> myList = new ArrayList<>();
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("myList");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        // Will throw because field is already initialized and type not injectable
        injection.processInjection(f, instance, mocks);
    }

    @Test
    public void testInjectionWithNullOwner() throws Exception {
        try {
            Field f = PropertyAndSetterInjection.class.getDeclaredField("notFinalOrStatic");
            assertFalse(injection.processInjection(f, null, Collections.emptySet()));
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInjectionWithNullField() throws Exception {
        assertFalse(injection.processInjection(null, new Object(), Collections.emptySet()));
    }

    @Test
    public void testInjectionWithCustomTypeAndSetter() throws Exception {
        class TestClass {
            private Foo foo;
            public void setFoo(Foo foo) { this.foo = foo; }
        }
        class Foo {}
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("foo");
        Foo mockFoo = mock(Foo.class);
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockFoo));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.foo); // no setter found in injection strategy
    }

    @Test
    public void testInjectionWithMultipleMocksMatchingType() throws Exception {
        class TestClass {
            private Foo foo;
        }
        class Foo {}
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("foo");
        Foo mockFoo1 = mock(Foo.class);
        Foo mockFoo2 = mock(Foo.class);
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockFoo1, mockFoo2));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.foo);
    }

    @Test
    public void testInjectionWithNullMocks() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field");
        assertFalse(injection.processInjection(f, instance, null));
    }

    @Test
    public void testInjectionWithFieldInSubClass() throws Exception {
        class SuperClass {
            private String superField;
        }
        class SubClass extends SuperClass {
            private String subField;
        }
        SubClass instance = new SubClass();
        Field f = SuperClass.class.getDeclaredField("superField");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.subField);
    }

    @Test
    public void testInjectionWithLoop() throws Exception {
        class TestClass {
            private String field1;
            private String field2;
        }
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("field1");
        String mockValue = "mock";
        Set<Object> mocks = new HashSet<>(Arrays.asList(mockValue));
        assertFalse(injection.processInjection(f, instance, mocks));
        assertNull(instance.field1);
        assertNull(instance.field2);
    }

    @Test
    public void testInjectionWithEmptyClassHierarchy() throws Exception {
        class TestClass {}
        TestClass instance = new TestClass();
        Field f = TestClass.class.getDeclaredField("nonexistent");
        assertFalse(injection.processInjection(f, instance, Collections.emptySet()));
    }
}