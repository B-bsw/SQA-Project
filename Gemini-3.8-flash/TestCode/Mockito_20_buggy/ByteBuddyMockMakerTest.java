package org.mockito.internal.creation.bytebuddy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.InternalMockHandler;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.SerializableMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ByteBuddyMockMakerTest {

    private ByteBuddyMockMaker mockMaker;

    public static class SampleClass {
        public String execute() {
            return "real";
        }
    }

    public interface SampleInterface {
        void invoke();
    }

    public interface ExtraInterface {
        void extraMethod();
    }

    @Before
    public void setUp() {
        mockMaker = new ByteBuddyMockMaker();
    }

    @Test
    public void constructor_whenDefault_shouldInitializeSuccessfully() {
        // Arrange & Act
        ByteBuddyMockMaker maker = new ByteBuddyMockMaker();

        // Assert
        Assert.assertNotNull(maker);
    }

    @Test
    public void createMock_givenValidClassAndHandler_shouldReturnMockInstance() {
        // Arrange
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );
        InternalMockHandler handler = createInternalMockHandler();

        // Act
        SampleClass mockInstance = mockMaker.createMock(settings, handler);

        // Assert
        Assert.assertNotNull(mockInstance);
        Assert.assertTrue(mockInstance instanceof SampleClass);
        Assert.assertTrue(mockInstance instanceof MockMethodInterceptor.MockAccess);
    }

    @Test
    public void createMock_givenValidInterfaceAndHandler_shouldReturnMockInstance() {
        // Arrange
        MockCreationSettings<SampleInterface> settings = createMockSettings(
                SampleInterface.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );
        InternalMockHandler handler = createInternalMockHandler();

        // Act
        SampleInterface mockInstance = mockMaker.createMock(settings, handler);

        // Assert
        Assert.assertNotNull(mockInstance);
        Assert.assertTrue(mockInstance instanceof SampleInterface);
        Assert.assertTrue(mockInstance instanceof MockMethodInterceptor.MockAccess);
    }

    @Test
    public void createMock_givenExtraInterfaces_shouldImplementExtraInterface() {
        // Arrange
        Set<Class> extraInterfaces = new HashSet<Class>();
        extraInterfaces.add(ExtraInterface.class);

        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                extraInterfaces,
                SerializableMode.NONE
        );
        InternalMockHandler handler = createInternalMockHandler();

        // Act
        SampleClass mockInstance = mockMaker.createMock(settings, handler);

        // Assert
        Assert.assertNotNull(mockInstance);
        Assert.assertTrue(mockInstance instanceof ExtraInterface);
    }

    @Test
    public void createMock_givenAcrossClassLoadersSerializableMode_shouldThrowMockitoException() {
        // Arrange
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.ACROSS_CLASSLOADERS
        );
        InternalMockHandler handler = createInternalMockHandler();

        // Act & Assert
        try {
            mockMaker.createMock(settings, handler);
            Assert.fail("Expected MockitoException for ACROSS_CLASSLOADERS serialization mode");
        } catch (MockitoException ex) {
            Assert.assertTrue(
                    ex.getMessage().contains("Serialization across classloaders not yet supported with ByteBuddyMockMaker")
            );
        }
    }

    @Test
    public void createMock_givenNonInternalMockHandler_shouldThrowMockitoException() {
        // Arrange
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );
        MockHandler nonInternalHandler = createNonInternalMockHandler();

        // Act & Assert
        try {
            mockMaker.createMock(settings, nonInternalHandler);
            Assert.fail("Expected MockitoException when using non-InternalMockHandler");
        } catch (MockitoException ex) {
            Assert.assertTrue(
                    ex.getMessage().contains("At the moment you cannot provide own implementations of MockHandler.")
            );
        }
    }

    @Test
    public void createMock_givenTypeToMockMismatchedOnCast_shouldThrowMockitoException() {
        // Arrange
        final int[] callCount = new int[] { 0 };
        @SuppressWarnings("unchecked")
        MockCreationSettings<SampleClass> settings = (MockCreationSettings<SampleClass>) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[] { MockCreationSettings.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getTypeToMock".equals(name)) {
                            callCount[0]++;
                            if (callCount[0] == 1) {
                                return SampleClass.class;
                            }
                            return String.class;
                        } else if ("getExtraInterfaces".equals(name)) {
                            return Collections.EMPTY_SET;
                        } else if ("getSerializableMode".equals(name)) {
                            return SerializableMode.NONE;
                        }
                        return null;
                    }
                }
        );
        InternalMockHandler handler = createInternalMockHandler();

        // Act & Assert
        try {
            mockMaker.createMock(settings, handler);
            Assert.fail("Expected MockitoException wrapping ClassCastException");
        } catch (MockitoException ex) {
            Assert.assertTrue(
                    ex.getMessage().contains("ClassCastException occurred while creating the mockito mock")
            );
        }
    }

    @Test
    public void getHandler_givenNullMock_shouldReturnNull() {
        // Arrange, Act & Assert
        Assert.assertNull(mockMaker.getHandler(null));
    }

    @Test
    public void getHandler_givenNonMockObject_shouldReturnNull() {
        // Arrange
        Object nonMock = new Object();

        // Act
        MockHandler handler = mockMaker.getHandler(nonMock);

        // Assert
        Assert.assertNull(handler);
    }

    @Test
    public void getHandler_givenValidMock_shouldReturnAssociatedMockHandler() {
        // Arrange
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );
        InternalMockHandler handler = createInternalMockHandler();
        SampleClass mockInstance = mockMaker.createMock(settings, handler);

        // Act
        MockHandler retrievedHandler = mockMaker.getHandler(mockInstance);

        // Assert
        Assert.assertNotNull(retrievedHandler);
        Assert.assertSame(handler, retrievedHandler);
    }

    @Test
    public void resetMock_givenValidMockAndNewHandler_shouldUpdateHandler() {
        // Arrange
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );
        InternalMockHandler initialHandler = createInternalMockHandler();
        SampleClass mockInstance = mockMaker.createMock(settings, initialHandler);

        InternalMockHandler newHandler = createInternalMockHandler();

        // Act
        mockMaker.resetMock(mockInstance, newHandler, settings);

        // Assert
        MockHandler currentHandler = mockMaker.getHandler(mockInstance);
        Assert.assertSame(newHandler, currentHandler);
        Assert.assertNotSame(initialHandler, currentHandler);
    }

    @Test
    public void resetMock_givenNonInternalMockHandler_shouldThrowMockitoException() {
        // Arrange
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );
        InternalMockHandler initialHandler = createInternalMockHandler();
        SampleClass mockInstance = mockMaker.createMock(settings, initialHandler);
        MockHandler nonInternalHandler = createNonInternalMockHandler();

        // Act & Assert
        try {
            mockMaker.resetMock(mockInstance, nonInternalHandler, settings);
            Assert.fail("Expected MockitoException when resetting with non-InternalMockHandler");
        } catch (MockitoException ex) {
            Assert.assertTrue(
                    ex.getMessage().contains("At the moment you cannot provide own implementations of MockHandler.")
            );
        }
    }

    @Test(expected = ClassCastException.class)
    public void resetMock_givenNonMockObject_shouldThrowClassCastException() {
        // Arrange
        Object nonMock = "NotAMockObject";
        InternalMockHandler handler = createInternalMockHandler();
        MockCreationSettings<SampleClass> settings = createMockSettings(
                SampleClass.class,
                Collections.<Class>emptySet(),
                SerializableMode.NONE
        );

        // Act
        mockMaker.resetMock(nonMock, handler, settings);
    }

    @SuppressWarnings("unchecked")
    private <T> MockCreationSettings<T> createMockSettings(
            final Class<T> typeToMock,
            final Set<Class> extraInterfaces,
            final SerializableMode serializableMode) {
        return (MockCreationSettings<T>) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[] { MockCreationSettings.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getTypeToMock".equals(name)) {
                            return typeToMock;
                        } else if ("getExtraInterfaces".equals(name)) {
                            return extraInterfaces != null ? extraInterfaces : Collections.EMPTY_SET;
                        } else if ("getSerializableMode".equals(name)) {
                            return serializableMode != null ? serializableMode : SerializableMode.NONE;
                        } else if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        } else if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }

    private InternalMockHandler createInternalMockHandler() {
        return (InternalMockHandler) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[] { InternalMockHandler.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        } else if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }

    private MockHandler createNonInternalMockHandler() {
        return (MockHandler) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[] { MockHandler.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        } else if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }
}