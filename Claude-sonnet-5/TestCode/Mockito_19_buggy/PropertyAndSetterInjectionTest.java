package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection injection;

    @Before
    public void setUp() {
        injection = new PropertyAndSetterInjection();
    }

    // ---------- Fixtures ----------

    static class ServiceA { }

    static class ServiceB { }

    static class CompoundTestedObject {
        private ServiceA serviceA;
        private ServiceB serviceB;
        private boolean setterCalled = false;

        public void setServiceA(ServiceA a) {
            this.serviceA = a;
            this.setterCalled = true;
        }

        public ServiceA getServiceA() {
            return serviceA;
        }

        public ServiceB getServiceB() {
            return serviceB;
        }

        public boolean isSetterCalled() {
            return setterCalled;
        }
    }

    static class OwnerCompound {
        private CompoundTestedObject testedObject;
    }

    static class BaseTested {
        private ServiceA baseService;

        public ServiceA getBaseService() {
            return baseService;
        }
    }

    static class DerivedTested extends BaseTested {
        private ServiceB derivedService;

        public ServiceB getDerivedService() {
            return derivedService;
        }
    }

    static class OwnerHierarchy {
        private DerivedTested derivedTested;
    }

    static class WithFinalStatic {
        private static ServiceA staticService;
        private final ServiceA finalService = new ServiceA();
        private ServiceA normalService;

        public ServiceA getNormalService() {
            return normalService;
        }

        public ServiceA getFinalService() {
            return finalService;
        }

        public static ServiceA getStaticService() {
            return staticService;
        }
    }

    static class OwnerFinalStatic {
        private WithFinalStatic tested;
    }

    abstract static class AbstractService { }

    static class OwnerAbstract {
        private AbstractService abstractService;
    }

    static class TwoServiceAFields {
        private ServiceA serviceA1;
        private ServiceA serviceA2;

        public ServiceA getServiceA1() {
            return serviceA1;
        }

        public ServiceA getServiceA2() {
            return serviceA2;
        }
    }

    static class OwnerTwoFields {
        private TwoServiceAFields tested;
    }

    static class EmptyOwner {
        private CompoundTestedObject tested;
    }

    // ---------- Helper ----------

    private Field field(Class<?> clazz, String name) throws NoSuchFieldException {
        Field f = clazz.getDeclaredField(name);
        f.setAccessible(true);
        return f;
    }

    // ---------- Tests ----------

    @Test
    public void shouldInjectMocksViaSetterAndField() throws Exception {
        OwnerCompound owner = new OwnerCompound();
        Field f = field(OwnerCompound.class, "testedObject");

        ServiceA mockA = new ServiceA();
        ServiceB mockB = new ServiceB();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList((Object) mockA, mockB));

        boolean result = injection.processInjection(f, owner, mocks);

        assertTrue(result);
        CompoundTestedObject tested = (CompoundTestedObject) f.get(owner);
        assertNotNull(tested);
        assertSame(mockA, tested.getServiceA());
        assertSame(mockB, tested.getServiceB());
        assertTrue(tested.isSetterCalled());
    }

    @Test
    public void shouldReuseAlreadyInitializedFieldInstance() throws Exception {
        OwnerCompound owner = new OwnerCompound();
        CompoundTestedObject preset = new CompoundTestedObject();
        Field f = field(OwnerCompound.class, "testedObject");
        f.set(owner, preset);

        ServiceA mockA = new ServiceA();
        ServiceB mockB = new ServiceB();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList((Object) mockA, mockB));

        boolean result = injection.processInjection(f, owner, mocks);

        assertTrue(result);
        CompoundTestedObject tested = (CompoundTestedObject) f.get(owner);
        assertSame(preset, tested);
        assertSame(mockA, tested.getServiceA());
        assertSame(mockB, tested.getServiceB());
    }

    @Test
    public void shouldInjectAcrossClassHierarchy() throws Exception {
        OwnerHierarchy owner = new OwnerHierarchy();
        Field f = field(OwnerHierarchy.class, "derivedTested");

        ServiceA mockA = new ServiceA();
        ServiceB mockB = new ServiceB();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList((Object) mockA, mockB));

        boolean result = injection.processInjection(f, owner, mocks);

        assertTrue(result);
        DerivedTested tested = (DerivedTested) f.get(owner);
        assertNotNull(tested);
        assertSame(mockA, tested.getBaseService());
        assertSame(mockB, tested.getDerivedService());
    }

    @Test
    public void shouldNotInjectWhenNoMockCandidatesProvided() throws Exception {
        EmptyOwner owner = new EmptyOwner();
        Field f = field(EmptyOwner.class, "tested");

        Set<Object> mocks = new HashSet<Object>();

        boolean result = injection.processInjection(f, owner, mocks);

        assertFalse(result);
        CompoundTestedObject tested = (CompoundTestedObject) f.get(owner);
        assertNotNull(tested);
        assertNull(tested.getServiceA());
        assertNull(tested.getServiceB());
    }

    @Test
    public void shouldSkipFinalAndStaticFields() throws Exception {
        OwnerFinalStatic owner = new OwnerFinalStatic();
        Field f = field(OwnerFinalStatic.class, "tested");

        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList((Object) mockA));

        boolean result = injection.processInjection(f, owner, mocks);

        assertTrue(result);
        WithFinalStatic tested = (WithFinalStatic) f.get(owner);
        assertNotNull(tested);
        // normal field must be injected
        assertSame(mockA, tested.getNormalService());
        // final field must remain untouched (its own initial instance, not the mock)
        assertNotSame(mockA, tested.getFinalService());
        assertNotNull(tested.getFinalService());
        // static field must remain untouched (null, never assigned)
        assertNull(WithFinalStatic.getStaticService());
    }

    @Test
    public void shouldResolveAmbiguousCandidatesByFieldNameUsingMockName() throws Exception {
        OwnerTwoFields owner = new OwnerTwoFields();
        Field f = field(OwnerTwoFields.class, "tested");

        ServiceA mock1 = Mockito.mock(ServiceA.class, "serviceA1");
        ServiceA mock2 = Mockito.mock(ServiceA.class, "serviceA2");
        Set<Object> mocks = new HashSet<Object>(Arrays.asList((Object) mock1, mock2));

        boolean result = injection.processInjection(f, owner, mocks);

        assertTrue(result);
        TwoServiceAFields tested = (TwoServiceAFields) f.get(owner);
        assertNotNull(tested);
        assertSame(mock1, tested.getServiceA1());
        assertSame(mock2, tested.getServiceA2());
    }

    @Test
    public void shouldNotInjectWhenAmbiguousCandidatesCannotBeResolvedByName() throws Exception {
        OwnerTwoFields owner = new OwnerTwoFields();
        Field f = field(OwnerTwoFields.class, "tested");

        ServiceA mock1 = Mockito.mock(ServiceA.class, "unrelatedNameOne");
        ServiceA mock2 = Mockito.mock(ServiceA.class, "unrelatedNameTwo");
        Set<Object> mocks = new HashSet<Object>(Arrays.asList((Object) mock1, mock2));

        boolean result = injection.processInjection(f, owner, mocks);

        assertFalse(result);
        TwoServiceAFields tested = (TwoServiceAFields) f.get(owner);
        assertNotNull(tested);
        assertNull(tested.getServiceA1());
        assertNull(tested.getServiceA2());
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenFieldCannotBeInitialized() throws Exception {
        OwnerAbstract owner = new OwnerAbstract();
        Field f = field(OwnerAbstract.class, "abstractService");

        Set<Object> mocks = new HashSet<Object>();

        injection.processInjection(f, owner, mocks);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenFieldIsNull() throws Exception {
        OwnerCompound owner = new OwnerCompound();
        Set<Object> mocks = new HashSet<Object>();

        injection.processInjection(null, owner, mocks);
    }
}