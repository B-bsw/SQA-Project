package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FinalMockCandidateFilterTest {

    static class WithSetter {
        private String value;
        public void setValue(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    static class WithoutSetter {
        private String value;
    }

    static class TypeMismatch {
        private Integer value;
    }

    private final FinalMockCandidateFilter filter = new FinalMockCandidateFilter();

    @Test
    public void shouldInjectViaSetterWhenSingleMockAndSetterAvailable() throws Exception {
        WithSetter instance = new WithSetter();
        Field field = WithSetter.class.getDeclaredField("value");
        String mock = "mockValue";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        Object result = injecter.thenInject();

        assertEquals(mock, result);
        assertEquals(mock, instance.getValue());
    }

    @Test
    public void shouldInjectViaFieldWhenSingleMockAndNoSetterAvailable() throws Exception {
        WithoutSetter instance = new WithoutSetter();
        Field field = WithoutSetter.class.getDeclaredField("value");
        String mock = "directFieldValue";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        Object result = injecter.thenInject();

        assertEquals(mock, result);

        field.setAccessible(true);
        Object fieldValue = field.get(instance);
        assertEquals(mock, fieldValue);
    }

    @Test
    public void shouldReturnNullInjecterWhenNoMocksProvided() throws Exception {
        WithSetter instance = new WithSetter();
        Field field = WithSetter.class.getDeclaredField("value");
        Collection<Object> mocks = Collections.emptyList();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        Object result = injecter.thenInject();

        assertNull(result);
        assertNull(instance.getValue());
    }

    @Test
    public void shouldReturnNullInjecterWhenMultipleMocksProvided() throws Exception {
        WithSetter instance = new WithSetter();
        Field field = WithSetter.class.getDeclaredField("value");
        Collection<Object> mocks = Arrays.asList(new Object(), new Object());

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, instance);
        Object result = injecter.thenInject();

        assertNull(result);
        assertNull(instance.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenInjectionFailsDueToTypeMismatch() throws Exception {
        TypeMismatch instance = new TypeMismatch();
        Field field = TypeMismatch.class.getDeclaredField("value");
        String incompatibleMock = "notAnInteger";
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(incompatibleMock);

        OngoingInjecter injecter = fil