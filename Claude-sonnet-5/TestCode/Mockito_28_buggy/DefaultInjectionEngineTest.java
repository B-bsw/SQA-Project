package org.mockito.internal.configuration;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine engine;

    @Before
    public void setUp() {
        engine = new DefaultInjectionEngine();
    }

    // ---------------- Fixture classes ----------------

    static class Dependency {}

    static class OtherDependency {}

    static class ServiceWithFieldOnly {
        Dependency dependency;
    }

    static class ServiceWithSetter {
        private Dependency dependency;

        public void setDependency(Dependency dependency) {
            this.dependency = dependency;
        }

        public Dependency getDependency() {
            return dependency;
        }
    }

    static class BaseService {
        Dependency baseDependency;
    }

    static class SubService extends BaseService {
        Dependency subDependency;
    }

    static class ServiceWithTwoFields {
        Dependency dependencyOne;
        Dependency dependencyTwo;
    }

    static abstract class AbstractService {}

    static class ContainerWithFieldOnly {
        ServiceWithFieldOnly service;
    }

    static class ContainerWithSetter {
        ServiceWithSetter service;
    }

    static class ContainerWithSub {
        SubService service;
    }

    static class ContainerWithTwoFields {
        ServiceWithTwoFields service;
    }

    static class ContainerWithAbstract {
        AbstractService service;
    }

    static class ContainerWithNoDependencyMatch {
        ServiceWithFieldOnly service;
    }

    static class MultiContainer {
        ServiceWithFieldOnly serviceA;
        ServiceWithSetter serviceB;
    }

    // ---------------- Tests ----------------

    @Test
    public void shouldDoNothingWhenInjectMocksFieldsIsEmpty() throws Exception {
        Set<Field> fields = new HashSet<Field>();
        Set<Object> mocks = new HashSet<Object>();
        ContainerWithFieldOnly testInstance = new ContainerWithFieldOnly();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNull(testInstance.service);
    }

    @Test
    public void shouldInjectMockByFieldWhenSingleCandidateAvailable() throws Exception {
        Field field = ContainerWithFieldOnly.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        Dependency dependencyMock = Mockito.mock(Dependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(dependencyMock);

        ContainerWithFieldOnly testInstance = new ContainerWithFieldOnly();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.service);
        assertSame(dependencyMock, testInstance.service.dependency);
    }

    @Test
    public void shouldInjectMockBySetterWhenSetterAvailable() throws Exception {
        Field field = ContainerWithSetter.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        Dependency dependencyMock = Mockito.mock(Dependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(dependencyMock);

        ContainerWithSetter testInstance = new ContainerWithSetter();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.service);
        assertSame(dependencyMock, testInstance.service.getDependency());
    }

    @Test
    public void shouldNotInjectWhenNoMockAvailable() throws Exception {
        Field field = ContainerWithNoDependencyMatch.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        Set<Object> mocks = new HashSet<Object>(); // empty mocks

        ContainerWithNoDependencyMatch testInstance = new ContainerWithNoDependencyMatch();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.service); // field itself still instantiated
        assertNull(testInstance.service.dependency); // but nothing injected into it
    }

    @Test
    public void shouldNotInjectWhenMockTypeDoesNotMatchAnyField() throws Exception {
        Field field = ContainerWithNoDependencyMatch.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        OtherDependency otherMock = Mockito.mock(OtherDependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(otherMock);

        ContainerWithNoDependencyMatch testInstance = new ContainerWithNoDependencyMatch();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.service);
        assertNull(testInstance.service.dependency);
    }

    @Test
    public void shouldInjectOnlyOnceGivenSingleMockAcrossClassHierarchy() throws Exception {
        Field field = ContainerWithSub.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        Dependency dependencyMock = Mockito.mock(Dependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(dependencyMock);

        ContainerWithSub testInstance = new ContainerWithSub();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.service);
        // Sub-type fields are processed before super-type fields; the single
        // available mock is consumed there, leaving the base field untouched.
        assertSame(dependencyMock, testInstance.service.subDependency);
        assertNull(testInstance.service.baseDependency);
    }

    @Test
    public void shouldNotFailWhenAmbiguousCandidatesFoundByTypeAndName() throws Exception {
        Field field = ContainerWithTwoFields.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        Dependency mockOne = Mockito.mock(Dependency.class);
        Dependency mockTwo = Mockito.mock(Dependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockOne);
        mocks.add(mockTwo);

        ContainerWithTwoFields testInstance = new ContainerWithTwoFields();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.service);
        // Ambiguous by type, and mock names won't match field names, so no
        // injection should occur, and no exception should be thrown either.
        assertNull(testInstance.service.dependencyOne);
        assertNull(testInstance.service.dependencyTwo);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowMockitoExceptionWhenFieldCannotBeInitialized() throws Exception {
        Field field = ContainerWithAbstract.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        Set<Object> mocks = new HashSet<Object>();

        ContainerWithAbstract testInstance = new ContainerWithAbstract();

        engine.injectMocksOnFields(fields, mocks, testInstance);
    }

    @Test
    public void shouldReuseAlreadyInitializedFieldInstance() throws Exception {
        Field field = ContainerWithFieldOnly.class.getDeclaredField("service");
        Set<Field> fields = new HashSet<Field>();
        fields.add(field);

        ContainerWithFieldOnly testInstance = new ContainerWithFieldOnly();
        ServiceWithFieldOnly existing = new ServiceWithFieldOnly();
        testInstance.service = existing;

        Dependency mock = Mockito.mock(Dependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mock);

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertSame(existing, testInstance.service);
        assertSame(mock, testInstance.service.dependency);
    }

    @Test
    public void shouldInjectMultipleInjectMocksFieldsIndependently() throws Exception {
        Field fieldA = MultiContainer.class.getDeclaredField("serviceA");
        Field fieldB = MultiContainer.class.getDeclaredField("serviceB");
        Set<Field> fields = new HashSet<Field>();
        fields.add(fieldA);
        fields.add(fieldB);

        Dependency mock = Mockito.mock(Dependency.class);
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mock);

        MultiContainer testInstance = new MultiContainer();

        engine.injectMocksOnFields(fields, mocks, testInstance);

        assertNotNull(testInstance.serviceA);
        assertNotNull(testInstance.serviceB);
        // Each @InjectMocks target gets its own copy of the mocks set, so the
        // single mock is available (and injected) independently for both.
        assertSame(mock, testInstance.serviceA.dependency);
        assertSame(mock, testInstance.serviceB.getDependency());
    }
}