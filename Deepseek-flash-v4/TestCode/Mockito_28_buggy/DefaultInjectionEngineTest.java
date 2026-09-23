package org.mockito.internal.configuration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.configuration.injection.MockCandidateFilter;
import org.mockito.internal.util.reflection.FieldInitializer;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine engine;
    private Reporter reporter;
    private Set<Field> injectMocksFields;
    private Set<Object> mocks;

    @Before
    public void setUp() {
        engine = new DefaultInjectionEngine();
        reporter = mock(Reporter.class);
        injectMocksFields = new HashSet<Field>();
        mocks = new HashSet<Object>();
    }

    @Test
    public void testInjectMocksOnFields_NoFields() throws Exception {
        engine.injectMocksOnFields(Collections.<Field>emptySet(), mocks, new Object());
        verifyNoInteractions(reporter);
    }

    @Test
    public void testInjectMocksOnFields_WithFieldInjection() throws Exception {
        class TestClass {
            private String injectedField;
            private StringBuilder builder;
        }
        TestClass instance = new TestClass();
        String mockValue = "mockString";
        mocks.add(mockValue);
        mocks.add(new StringBuilder("mockBuilder"));
        injectMocksFields.add(TestClass.class.getDeclaredField("injectedField"));
        injectMocksFields.add(TestClass.class.getDeclaredField("builder"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance);

        assertNotNull(instance.injectedField);
        assertNull(instance.builder);
        verify(reporter, never()).cannotInitializeForInjectMocksAnnotation(anyString(), any(MockitoException.class));
    }

    @Test
    public void testInjectMocksOnFields_FieldInitializationFailure() throws Exception {
        class ParentClass {
            private String parentField;
        }
        class ChildClass extends ParentClass {
            private String childField;
        }
        ChildClass instance = new ChildClass();
        String mockValue = "mockValue";
        mocks.add(mockValue);
        injectMocksFields.add(ChildClass.class.getDeclaredField("childField"));
        injectMocksFields.add(ParentClass.class.getDeclaredField("parentField"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance);

        assertEquals("mockValue", instance.childField);
        assertEquals("mockValue", instance.parentField);
        verify(reporter, never()).cannotInitializeForInjectMocksAnnotation(anyString(), any(MockitoException.class));
    }

    @Test
    public void testInjectMocksOnFields_MultipleFieldsWithTypeMatch() throws Exception {
        class TestClass {
            private String stringField1;
            private String stringField2;
            private Integer intField;
        }
        TestClass instance = new TestClass();
        String mockString1 = "string1";
        String mockString2 = "string2";
        Integer mockInt = 123;
        mocks.add(mockString1);
        mocks.add(mockString2);
        mocks.add(mockInt);
        injectMocksFields.add(TestClass.class.getDeclaredField("stringField1"));
        injectMocksFields.add(TestClass.class.getDeclaredField("stringField2"));
        injectMocksFields.add(TestClass.class.getDeclaredField("intField"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance);

        assertNotNull(instance.stringField1);
        assertNotNull(instance.stringField2);
        assertEquals(Integer.valueOf(123), instance.intField);
        assertNotEquals(instance.stringField1, instance.stringField2);
    }

    @Test
    public void testInjectMocksOnFields_SuperclassFieldInjection() throws Exception {
        class Parent {
            private String parentField;
        }
        class Child extends Parent {
            private String childField;
        }
        Child instance = new Child();
        String mockParent = "parentMock";
        String mockChild = "childMock";
        mocks.add(mockParent);
        mocks.add(mockChild);
        injectMocksFields.add(Child.class.getDeclaredField("childField"));
        injectMocksFields.add(Parent.class.getDeclaredField("parentField"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance);

        assertEquals(mockParent, instance.parentField);
        assertEquals(mockChild, instance.childField);
    }

    @Test
    public void testInjectMocksOnFields_NoMocksRemaining() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        mocks.add("mock1");
        mocks.add("mock2");
        injectMocksFields.add(TestClass.class.getDeclaredField("field"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance);

        assertNotNull(instance.field);
        assertEquals(0, mocks.size());
    }

    @Test
    public void testInjectMocksOnFields_MockCandidateFilterCalled() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        mocks.add("mock");
        injectMocksFields.add(TestClass.class.getDeclaredField("field"));

        MockCandidateFilter mockFilter = mock(MockCandidateFilter.class);
        DefaultInjectionEngine spyEngine = spy(engine);
        doReturn(mockFilter).when(spyEngine).getMockCandidateFilter();
        when(mockFilter.filterCandidate(anySet(), any(Field.class), any())).thenReturn(new MockCandidateFilter.MockAwareFilter() {
            @Override
            public void thenInject() {
                // no-op
            }
        });

        spyEngine.injectMocksOnFields(injectMocksFields, mocks, instance);
    }

    @Test(expected = NullPointerException.class)
    public void testInjectMocksOnFields_NullInjectMocks() {
        engine.injectMocksOnFields(null, new HashSet<Object>(), new Object());
    }

    @Test
    public void testInjectMocksOnFields_NullTestInstance() {
        try {
            engine.injectMocksOnFields(new HashSet<Field>(), mocks, null);
            fail("Should throw exception");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInjectMocksOnFields_MultipleCalls() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance1 = new TestClass();
        TestClass instance2 = new TestClass();
        mocks.add("sharedMock");
        injectMocksFields.add(TestClass.class.getDeclaredField("field"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance1);
        engine.injectMocksOnFields(injectMocksFields, mocks, instance2);

        assertNotNull(instance1.field);
        assertNotNull(instance2.field);
        assertEquals("sharedMock", instance1.field);
        assertEquals("sharedMock", instance2.field);
    }

    @Test
    public void testInjectMocksOnFields_SameMockInjectedToMultipleInjectFields() throws Exception {
        class TestClass {
            private String field1;
            private String field2;
        }
        TestClass instance = new TestClass();
        mocks.add("sameMock");
        injectMocksFields.add(TestClass.class.getDeclaredField("field1"));
        injectMocksFields.add(TestClass.class.getDeclaredField("field2"));

        engine.injectMocksOnFields(injectMocksFields, mocks, instance);

        assertNotNull(instance.field1);
        assertNotNull(instance.field2);
        assertEquals("sameMock", instance.field1);
        assertEquals("sameMock", instance.field2);
    }

    @Test
    public void testInjectMocksOnFields_EmptyFieldSet() throws Exception {
        engine.injectMocksOnFields(Collections.<Field>emptySet(), mocks, new Object());
        assertTrue(true);
    }

    @Test
    public void testInjectMocksOnFields_NoInjectionCandidates() throws Exception {
        class TestClass {
        }
        TestClass instance = new TestClass();
        mocks.add("mock");
        injectMocksFields.add(TestClass.class.getDeclaredField("fieldDoesNotExist"));
        engine.injectMocksOnFields(injectMocksFields, mocks, instance);
    }

    @Test
    public void testInjectMocksOnFields_WithNullInMocks() throws Exception {
        class TestClass {
            private String field;
        }
        TestClass instance = new TestClass();
        mocks.add(null);
        injectMocksFields.add(TestClass.class.getDeclaredField("field"));

        try {
            engine.injectMocksOnFields(injectMocksFields, mocks, instance);
            fail("Expected exception");
        } catch (MockitoException e) {
            verify(reporter).cannotInitializeForInjectMocksAnnotation("field", e);
        }
    }
}