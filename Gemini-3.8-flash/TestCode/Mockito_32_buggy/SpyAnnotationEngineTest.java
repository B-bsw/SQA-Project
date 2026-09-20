package org.mockito.internal.configuration;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

public class SpyAnnotationEngineTest {

    private SpyAnnotationEngine engine;

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
    }

    static class NoSpyFieldClass {
        public String nonAnnotated = "testValue";
    }

    static class SpyWithNullFieldClass {
        @Spy
        public List<String> nullList;
    }

    static class ValidSpyFieldClass {
        @Spy
        public List<String> list = new ArrayList<String>();
    }

    static class PrivateSpyFieldClass {
        @Spy
        private List<String> privateList = new ArrayList<String>();

        public List<String> getPrivateList() {
            return privateList;
        }
    }

    static class SpyAndMockFieldClass {
        @Spy
        @Mock
        public List<String> list = new ArrayList<String>();
    }

    static class SpyAndDeprecatedMockFieldClass {
        @Spy
        @MockitoAnnotations.Mock
        public List<String> list = new ArrayList<String>();
    }

    static class SpyAndCaptorFieldClass {
        @Spy
        @Captor
        public List<String> list = new ArrayList<String>();
    }

    @Test
    public void createMockFor_givenAnyArguments_shouldReturnNull() {
        // Arrange & Act
        Object result = engine.createMockFor(null, null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void process_givenFieldWithoutSpyAnnotation_shouldNotModifyField() {
        // Arrange
        NoSpyFieldClass target = new NoSpyFieldClass();

        // Act
        engine.process(NoSpyFieldClass.class, target);

        // Assert
        Assert.assertEquals("testValue", target.nonAnnotated);
        MockUtil mockUtil = new MockUtil();
        Assert.assertFalse(mockUtil.isMock(target.nonAnnotated));
    }

    @Test
    public void process_givenFieldWithSpyAnnotationAndNullInstance_shouldThrowMockitoException() {
        // Arrange
        SpyWithNullFieldClass target = new SpyWithNullFieldClass();

        // Act & Assert
        try {
            engine.process(SpyWithNullFieldClass.class, target);
            Assert.fail("Expected MockitoException to be thrown when spied instance is null");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot create a @Spy for 'nullList' field"));
        }
    }

    @Test
    public void process_givenFieldWithValidSpyInstance_shouldWrapFieldWithSpy() {
        // Arrange
        ValidSpyFieldClass target = new ValidSpyFieldClass();
        List<String> originalInstance = target.list;

        // Act
        engine.process(ValidSpyFieldClass.class, target);

        // Assert
        MockUtil mockUtil = new MockUtil();
        Assert.assertNotNull(target.list);
        Assert.assertTrue(mockUtil.isMock(target.list));
        Assert.assertTrue(mockUtil.isSpy(target.list));
        target.list.add("item");
        Assert.assertEquals(1, originalInstance.size());
    }

    @Test
    public void process_givenPrivateSpyField_shouldWrapAndPreserveAccessibility() throws Exception {
        // Arrange
        PrivateSpyFieldClass target = new PrivateSpyFieldClass();
        Field privateField = PrivateSpyFieldClass.class.getDeclaredField("privateList");
        Assert.assertFalse(privateField.isAccessible());

        // Act
        engine.process(PrivateSpyFieldClass.class, target);

        // Assert
        Assert.assertFalse(privateField.isAccessible());
        MockUtil mockUtil = new MockUtil();
        Assert.assertTrue(mockUtil.isMock(target.getPrivateList()));
    }

    @Test
    public void process_givenFieldWithSpyAndMockAnnotations_shouldThrowMockitoException() {
        // Arrange
        SpyAndMockFieldClass target = new SpyAndMockFieldClass();

        // Act & Assert
        try {
            engine.process(SpyAndMockFieldClass.class, target);
            Assert.fail("Expected MockitoException for combining @Spy and @Mock");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("unsupported combination of annotations"));
        }
    }

    @Test
    public void process_givenFieldWithSpyAndDeprecatedMockAnnotations_shouldThrowMockitoException() {
        // Arrange
        SpyAndDeprecatedMockFieldClass target = new SpyAndDeprecatedMockFieldClass();

        // Act & Assert
        try {
            engine.process(SpyAndDeprecatedMockFieldClass.class, target);
            Assert.fail("Expected MockitoException for combining @Spy and deprecated @Mock");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("unsupported combination of annotations"));
        }
    }

    @Test
    public void process_givenFieldWithSpyAndCaptorAnnotations_shouldThrowMockitoException() {
        // Arrange
        SpyAndCaptorFieldClass target = new SpyAndCaptorFieldClass();

        // Act & Assert
        try {
            engine.process(SpyAndCaptorFieldClass.class, target);
            Assert.fail("Expected MockitoException for combining @Spy and @Captor");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("unsupported combination of annotations"));
        }
    }

    @Test
    public void process_givenFieldWithAlreadySpiedInstance_shouldResetMock() {
        // Arrange
        ValidSpyFieldClass target = new ValidSpyFieldClass();
        target.list = Mockito.spy(new ArrayList<String>());
        MockUtil mockUtil = new MockUtil();
        Assert.assertTrue(mockUtil.isMock(target.list));

        // Act
        engine.process(ValidSpyFieldClass.class, target);

        // Assert
        Assert.assertTrue(mockUtil.isMock(target.list));
    }

    @Test
    public void assertNoAnnotations_givenUndesiredAnnotationPresent_shouldThrowMockitoException() throws Exception {
        // Arrange
        Field field = SpyAndMockFieldClass.class.getDeclaredField("list");

        // Act & Assert
        try {
            engine.assertNoAnnotations(Spy.class, field, new Class[]{Mock.class});
            Assert.fail("Expected MockitoException when undesired annotation is present");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("unsupported combination of annotations"));
        }
    }

    @Test
    public void assertNoAnnotations_givenNoUndesiredAnnotationPresent_shouldPassWithoutException() throws Exception {
        // Arrange
        Field field = ValidSpyFieldClass.class.getDeclaredField("list");

        // Act & Assert
        engine.assertNoAnnotations(Spy.class, field, new Class[]{Mock.class, Captor.class});
    }
}