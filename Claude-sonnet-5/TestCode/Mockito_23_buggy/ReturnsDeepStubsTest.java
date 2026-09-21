package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsDeepStubsTest {

    interface Baz {
        String getName();
    }

    interface Bar {
        Baz getBaz();
    }

    interface Foo {
        Bar getBar();
        Foo getSelf();
        String getString();
        int getInt();
        double getDouble();
        List<String> getList();
    }

    interface GenericsNest<K extends Comparable<K>> extends Map<K, Set<Number>> {}

    interface Bounded<K extends Number & Comparable<K>> {
        K getKey();
    }

    @Test
    public void shouldReturnMockForInterfaceReturnType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar bar = foo.getBar();
        assertNotNull(bar);
        assertTrue(new MockUtil().isMock(bar));
    }

    @Test
    public void shouldReturnSameDeepStubMockOnRepeatedCalls() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar bar1 = foo.getBar();
        Bar bar2 = foo.getBar();
        assertSame(bar1, bar2);
    }

    @Test
    public void shouldReturnNullForFinalNonMockableStringType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        assertNull(foo.getString());
    }

    @Test
    public void shouldReturnZeroForPrimitiveIntType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        assertEquals(0, foo.getInt());
    }

    @Test
    public void shouldReturnZeroForPrimitiveDoubleType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        assertEquals(0.0d, foo.getDouble(), 0.0001);
    }

    @Test
    public void shouldReturnMockForMockableCollectionReturnType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        List<String> list = foo.getList();
        assertNotNull(list);
        assertTrue(new MockUtil().isMock(list));
    }

    @Test
    public void shouldReturnStubbedValueWhenInvocationExplicitlyStubbed() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar specificBar = mock(Bar.class);
        when(foo.getBar()).thenReturn(specificBar);
        assertSame(specificBar, foo.getBar());
    }

    @Test
    public void shouldCreateSeparateDeepMockForSelfReferencingType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Foo self = foo.getSelf();
        assertNotNull(self);
        assertNotSame(foo, self);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void shouldResolveNestedGenericReturnTypes() {
        GenericsNest<?> mock = mock(GenericsNest.class, new ReturnsDeepStubs());
        Number number = mock.entrySet().iterator().next().getValue().iterator().next();
        assertNotNull(number);
        assertTrue(new MockUtil().isMock(number));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void shouldHandleBoundedGenericWithExtraInterfaces() {
        Bounded<?> mock = mock(Bounded.class, new ReturnsDeepStubs());
        Object key = mock.getKey();
        assertNotNull(key);
        assertTrue(key instanceof Number);
        assertTrue(key instanceof Comparable);
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowNotAMockExceptionWhenMockIsNotARealMock() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMock()).thenReturn(new Object());
        new ReturnsDeepStubs().answer(invocation);
    }

    @Test
    public void shouldReturnDeepStubConsistentlyAcrossMultipleCallsWithMultipleStubbings() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar bar1 = foo.getBar();
        Foo self1 = foo.getSelf();
        Bar bar2 = foo.getBar();
        Foo self2 = foo.getSelf();
        assertSame(bar1, bar2);
        assertSame(self1, self2);
        assertNotSame(bar1, self1);
    }

    @Test
    public void shouldReturnNonNullDeepStubForNestedChainedCalls() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Baz baz = foo.getBar().getBaz();
        assertNotNull(baz);
        assertTrue(new MockUtil().isMock(baz));
        assertNull(baz.getName());
    }
}