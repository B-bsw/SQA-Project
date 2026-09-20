package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DynamicClassLoader dynamicClassLoader;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        dynamicClassLoader = new DynamicClassLoader(getClass().getClassLoader());
    }

    private JavaType toType(Class<?> clazz) {
        return TypeFactory.defaultInstance().constructType(clazz);
    }

    @Test
    public void instance_whenInvoked_shouldReturnNonNullSingleton() {
        // Arrange & Act
        SubTypeValidator first = SubTypeValidator.instance();
        SubTypeValidator second = SubTypeValidator.instance();

        // Assert
        Assert.assertNotNull(first);
        Assert.assertSame(first, second);
    }

    @Test
    public void constructor_whenInstantiated_shouldHaveDefaultIllegalClassNames() {
        // Arrange & Act
        SubTypeValidator customValidator = new SubTypeValidator();

        // Assert
        Assert.assertNotNull(customValidator._cfgIllegalClassNames);
        Assert.assertEquals(SubTypeValidator.DEFAULT_NO_DESER_CLASS_NAMES, customValidator._cfgIllegalClassNames);
    }

    @Test
    public void validateSubType_givenStandardSafeClass_shouldPass() throws Exception {
        // Arrange
        JavaType safeType = toType(String.class);

        // Act
        validator.validateSubType((DeserializationContext) null, safeType);

        // Assert - completed without exception
    }

    @Test
    public void validateSubType_givenStandardInterface_shouldPass() throws Exception {
        // Arrange
        JavaType interfaceType = toType(Runnable.class);

        // Act
        validator.validateSubType((DeserializationContext) null, interfaceType);

        // Assert - completed without exception
    }

    @Test
    public void validateSubType_givenSpringInterface_shouldPass() throws Exception {
        // Arrange: raw.isInterface() == true, full starts with PREFIX_SPRING
        Class<?> springInterface = dynamicClassLoader.defineDynamicClass(
                "org.springframework.test.SampleInterface",
                "java.lang.Object",
                true
        );
        JavaType type = toType(springInterface);

        // Act
        validator.validateSubType((DeserializationContext) null, type);

        // Assert - completed without exception
    }

    @Test
    public void validateSubType_givenSpringSafeClass_shouldPass() throws Exception {
        // Arrange: regular class starting with org.springframework. that does not inherit harmful base
        Class<?> springSafeClass = dynamicClassLoader.defineDynamicClass(
                "org.springframework.test.SafeSpringService",
                "java.lang.Object",
                false
        );
        JavaType type = toType(springSafeClass);

        // Act
        validator.validateSubType((DeserializationContext) null, type);

        // Assert - completed without exception
    }

    @Test
    public void validateSubType_givenNonSpringClassWithHarmfulSimpleName_shouldPass() throws Exception {
        // Arrange: simple name matches "AbstractPointcutAdvisor" but package is not Spring
        Class<?> nonSpringClass = dynamicClassLoader.defineDynamicClass(
                "com.example.security.AbstractPointcutAdvisor",
                "java.lang.Object",
                false
        );
        JavaType type = toType(nonSpringClass);

        // Act
        validator.validateSubType((DeserializationContext) null, type);

        // Assert - completed without exception
    }

    @Test
    public void validateSubType_givenDefaultIllegalClassFileHandler_shouldThrowJsonMappingException() {
        // Arrange
        JavaType illegalType = toType(java.util.logging.FileHandler.class);
        String expectedMessage = "Illegal type (java.util.logging.FileHandler) to deserialize: prevented for security reasons";

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException to be thrown for FileHandler");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains(expectedMessage));
        }
    }

    @Test
    public void validateSubType_givenDefaultIllegalClassUnicastRemoteObject_shouldThrowJsonMappingException() {
        // Arrange
        JavaType illegalType = toType(java.rmi.server.UnicastRemoteObject.class);

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException to be thrown for UnicastRemoteObject");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (java.rmi.server.UnicastRemoteObject) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenSpringDirectAbstractPointcutAdvisor_shouldThrowJsonMappingException() {
        // Arrange
        Class<?> advisorClass = dynamicClassLoader.defineDynamicClass(
                "org.springframework.aop.AbstractPointcutAdvisor",
                "java.lang.Object",
                false
        );
        JavaType type = toType(advisorClass);

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, type);
            Assert.fail("Expected JsonMappingException for org.springframework.aop.AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.aop.AbstractPointcutAdvisor) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenSpringDirectAbstractApplicationContext_shouldThrowJsonMappingException() {
        // Arrange
        Class<?> contextClass = dynamicClassLoader.defineDynamicClass(
                "org.springframework.context.AbstractApplicationContext",
                "java.lang.Object",
                false
        );
        JavaType type = toType(contextClass);

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, type);
            Assert.fail("Expected JsonMappingException for org.springframework.context.AbstractApplicationContext");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.context.AbstractApplicationContext) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenSpringSubclassOfAbstractPointcutAdvisor_shouldThrowJsonMappingException() {
        // Arrange
        dynamicClassLoader.defineDynamicClass(
                "org.springframework.aop.support.AbstractPointcutAdvisor",
                "java.lang.Object",
                false
        );
        Class<?> subAdvisorClass = dynamicClassLoader.defineDynamicClass(
                "org.springframework.aop.support.MyCustomPointcutAdvisor",
                "org.springframework.aop.support.AbstractPointcutAdvisor",
                false
        );
        JavaType type = toType(subAdvisorClass);

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, type);
            Assert.fail("Expected JsonMappingException for subclass of AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.aop.support.MyCustomPointcutAdvisor) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenSpringSubclassOfAbstractApplicationContext_shouldThrowJsonMappingException() {
        // Arrange
        dynamicClassLoader.defineDynamicClass(
                "org.springframework.context.support.AbstractApplicationContext",
                "java.lang.Object",
                false
        );
        Class<?> subContextClass = dynamicClassLoader.defineDynamicClass(
                "org.springframework.context.support.MyApplicationContext",
                "org.springframework.context.support.AbstractApplicationContext",
                false
        );
        JavaType type = toType(subContextClass);

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, type);
            Assert.fail("Expected JsonMappingException for subclass of AbstractApplicationContext");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.context.support.MyApplicationContext) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenSpringDeepHierarchyAdvisor_shouldThrowJsonMappingException() {
        // Arrange: Level3 -> Level2 -> AbstractPointcutAdvisor -> Object
        dynamicClassLoader.defineDynamicClass(
                "org.springframework.aop.base.AbstractPointcutAdvisor",
                "java.lang.Object",
                false
        );
        dynamicClassLoader.defineDynamicClass(
                "org.springframework.aop.base.MiddleAdvisor",
                "org.springframework.aop.base.AbstractPointcutAdvisor",
                false
        );
        Class<?> leafAdvisorClass = dynamicClassLoader.defineDynamicClass(
                "org.springframework.aop.base.LeafAdvisor",
                "org.springframework.aop.base.MiddleAdvisor",
                false
        );
        JavaType type = toType(leafAdvisorClass);

        // Act & Assert
        try {
            validator.validateSubType((DeserializationContext) null, type);
            Assert.fail("Expected JsonMappingException for deep hierarchy advisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.aop.base.LeafAdvisor) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenCustomIllegalSet_shouldBlockConfiguredClass() {
        // Arrange: Custom SubTypeValidator with Integer.class blocked
        SubTypeValidator customValidator = new SubTypeValidator();
        Set<String> customSet = new HashSet<String>();
        customSet.add("java.lang.Integer");
        customValidator._cfgIllegalClassNames = customSet;

        JavaType integerType = toType(Integer.class);

        // Act & Assert
        try {
            customValidator.validateSubType((DeserializationContext) null, integerType);
            Assert.fail("Expected JsonMappingException for custom blocked class Integer");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (java.lang.Integer) to deserialize"));
        }
    }

    @Test
    public void validateSubType_givenCustomIllegalSet_shouldAllowDefaultBlockedClassIfNotInCustomSet() throws Exception {
        // Arrange: Custom SubTypeValidator that only blocks a specific custom class
        SubTypeValidator customValidator = new SubTypeValidator();
        Set<String> customSet = new HashSet<String>();
        customSet.add("com.example.BlockedClass");
        customValidator._cfgIllegalClassNames = customSet;

        JavaType fileHandlerType = toType(java.util.logging.FileHandler.class);

        // Act
        customValidator.validateSubType((DeserializationContext) null, fileHandlerType);

        // Assert - passed because FileHandler is not present in customSet
    }

    private static class DynamicClassLoader extends ClassLoader {
        private final Map<String, Class<?>> definitions;

        public DynamicClassLoader(ClassLoader parent) {
            super(parent);
            this.definitions = new HashMap<String, Class<?>>();
        }

        public Class<?> defineDynamicClass(String name, String superName, boolean isInterface) {
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(baos);

                dos.writeInt(0xCAFEBABE);
                dos.writeShort(0);
                dos.writeShort(49);
                dos.writeShort(5);

                dos.writeByte(7);
                dos.writeShort(2);

                dos.writeByte(1);
                dos.writeUTF(name.replace('.', '/'));

                dos.writeByte(7);
                dos.writeShort(4);

                dos.writeByte(1);
                dos.writeUTF(superName.replace('.', '/'));

                dos.writeShort(isInterface ? 0x0601 : 0x0021);
                dos.writeShort(1);
                dos.writeShort(3);
                dos.writeShort(0);
                dos.writeShort(0);
                dos.writeShort(0);
                dos.writeShort(0);

                byte[] bytes = baos.toByteArray();
                Class<?> clazz = defineClass(name, bytes, 0, bytes.length);
                definitions.put(name, clazz);
                return clazz;
            } catch (Exception e) {
                throw new RuntimeException("Failed to define dynamic class: " + name, e);
            }
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            Class<?> clazz = definitions.get(name);
            if (clazz != null) {
                return clazz;
            }
            return super.findClass(name);
        }
    }
}