package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnsDeepStubsTest {

    public interface Bar {
        String getName();
    }

    public interface Foo {
        Bar getBar();
    }

    public interface SampleMock {
        Foo getFoo();
        String getString();
        int getInt();
        boolean getBoolean();
        List<String> getList();
    }

    private SampleMock mock;

    @Before
    public void setUp() {
        mock = Mockito.mock(SampleMock.class, new ReturnsDeepStubs());
    }

    @Test
    public void testAnswerReturnsDeepMockForInterfaceReturnType() throws Throwable {
        Foo foo = mock.getFoo();
        assertNotNull(foo);

        Bar bar = foo.getBar();
        assertNotNull(bar);
    }

    @Test
    public void testAnswerReturnsEmptyStringForFinalClassReturnType() throws Throwable {
        String s = mock.getString();
        assertEquals("", s);
    }

    @Test
    public void testAnswerReturnsZeroForPrimitiveIntReturnType() throws Throwable {
        int i = mock.getInt();
        assertEquals(0, i);
    }

    @Test
    public void testAnswerReturnsFalseForPrimitiveBooleanReturnType() throws Throwable {
        boolean b = mock.getBoolean();
        assertFalse(b);
    }

    @Test
    public void testAnswerReturnsMockForGenericInterfaceReturnType() throws Throwable {
        List<String> list = mock.getList();
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testDeepStubCachingReturnsSameInstanceOnRepeatedCalls() throws Throwable {
        Foo foo1 = mock.getFoo();
        Foo foo2 = mock.getFoo();
        assertSame(foo1, foo2);
    }

    @Test
    public void testStubbingOverridesDeepStubBehavior() throws Throwable {
        Foo customFoo = mock(Foo.class);
        when(mock.getFoo()).thenReturn(customFoo);

        Foo result = mock.getFoo();
        assertSame(customFoo, result);
    }

    @Test
    public void testMultipleStubbedInvocationsAreMatchedCorrectly() throws Throwable {
        Foo customFoo1 = mock(Foo.class);
        when(mock.getFoo()).thenReturn(customFoo1);

        Foo result1 = mock.getFoo();
        assertSame(customFoo1, result1);

        Foo result2 = mock.getFoo();
        assertSame(customFoo1, result2);
    }

    @Test
    public void testActualParameterizedTypeReturnsCorrectRawType() {
        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = deepStubs.actualParameterizedType(mock);
        assertNotNull(metadata);
        assertEquals(SampleMock.class, metadata.rawType());
    }

    @Test
    public void testAnswerThrowsExceptionWhenMockIsNull() {
        InvocationOnMock invocationOnMock = mock(InvocationOnMock.class);
        when(invocationOnMock.getMock()).thenReturn(null);

        ReturnsDeepStubs deepStubs = new ReturnsDeepStubs();
        Exception thrown = null;
        try {
            deepStubs.answer(invocationOnMock);
            fail("Expected an exception to be thrown for null mock");
        } catch (Throwable e) {
            thrown = (Exception) e;
        }
        assertNotNull(thrown);
    }

    @Test
    public void testDeepStubForNestedChainReturnsNonNullAtEachLevel() throws Throwable {
        Foo foo = mock.getFoo();
        assertNotNull(foo);
        Bar bar = foo.getBar();
        assertNotNull(bar);
        String name = bar.getName();
        assertEquals("", name);
    }

    @Test
    public void testDeepStubDifferentMocksProduceIndependentStubs() throws Throwable {
        SampleMock anotherMock = Mockito.mock(SampleMock.class, new ReturnsDeepStubs());

        Foo foo1 = mock.getFoo();
        Foo foo2 = anotherMock.getFoo();

        assertNotNull(foo1);
        assertNotNull(foo2);
        assertNotSame(foo1, foo2);
    }
}