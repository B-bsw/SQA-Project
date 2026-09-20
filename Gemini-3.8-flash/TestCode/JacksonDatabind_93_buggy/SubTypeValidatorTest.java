package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    public static class AbstractPointcutAdvisor {}

    public static class AbstractApplicationContext {}

    public static class IntermediatePointcutAdvisor extends AbstractPointcutAdvisor {}

    private static class CustomSubTypeValidator extends SubTypeValidator {
        public CustomSubTypeValidator(Set<String> customIllegalClassNames) {
            super();
            this._cfgIllegalClassNames = customIllegalClassNames;
        }
    }

    private SubTypeValidator validator;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        typeFactory = TypeFactory.defaultInstance();
    }

    private static Class<?> defineDynamicClass(final String className, final String superClassName) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(0xCAFEBABE);
        dos.writeShort(0);
        dos.writeShort(49);
        dos.writeShort(5);

        dos.writeByte(7);
        dos.writeShort(2);

        dos.writeByte(1);
        dos.writeUTF(className.replace('.', '/'));

        dos.writeByte(7);
        dos.writeShort(4);

        dos.writeByte(1);
        dos.writeUTF(superClassName.replace('.', '/'));

        dos.writeShort(0x0001);
        dos.writeShort(1);
        dos.writeShort(3);
        dos.writeShort(0);
        dos.writeShort(0);
        dos.writeShort(0);
        dos.writeShort(0);
        dos.flush();

        final byte[] bytes = baos.toByteArray();
        ClassLoader cl = new ClassLoader(SubTypeValidatorTest.class.getClassLoader()) {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                if (name.equals(className)) {
                    return defineClass(name, bytes, 0, bytes.length);
                }
                return super.findClass(name);
            }
        };
        return cl.loadClass(className);
    }

    @Test
    public void instance_givenSubsequentCalls_shouldReturnSameSingletonInstance() {
        SubTypeValidator first = SubTypeValidator.instance();
        SubTypeValidator second = SubTypeValidator.instance();

        Assert.assertNotNull(first);
        Assert.assertSame(first, second);
    }

    @Test
    public void constructor_givenProtectedInvocation_shouldInstantiateSuccessfully() {
        SubTypeValidator subValidator = new SubTypeValidator();
        Assert.assertNotNull(subValidator);
        Assert.assertNotNull(subValidator._cfgIllegalClassNames);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void defaultNoDeserClassNames_givenAttemptToModify_shouldThrowUnsupportedOperationException() {
        SubTypeValidator.DEFAULT_NO_DESER_CLASS_NAMES.add("com.example.MaliciousClass");
    }

    @Test
    public void defaultNoDeserClassNames_givenConstant_shouldContainAllExpectedSecurityClasses() {
        String[] expectedClasses = new String[] {
            "org.apache.commons.collections.functors.InvokerTransformer",
            "org.apache.commons.collections.functors.InstantiateTransformer",
            "org.apache.commons.collections4.functors.InvokerTransformer",
            "org.apache.commons.collections4.functors.InstantiateTransformer",
            "org.codehaus.groovy.runtime.ConvertedClosure",
            "org.codehaus.groovy.runtime.MethodClosure",
            "org.springframework.beans.factory.ObjectFactory",
            "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl",
            "org.apache.xalan.xsltc.trax.TemplatesImpl",
            "com.sun.rowset.JdbcRowSetImpl",
            "java.util.logging.FileHandler",
            "java.rmi.server.UnicastRemoteObject",
            "org.springframework.beans.factory.config.PropertyPathFactoryBean",
            "com.mchange.v2.c3p0.JndiRefForwardingDataSource",
            "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
            "org.apache.tomcat.dbcp.dbcp2.BasicDataSource",
            "com.sun.org.apache.bcel.internal.util.ClassLoader"
        };

        Assert.assertEquals(expectedClasses.length, SubTypeValidator.DEFAULT_NO_DESER_CLASS_NAMES.size());
        for (int i = 0; i < expectedClasses.length; i++) {
            Assert.assertTrue("Expected class missing: " + expectedClasses[i],
                    SubTypeValidator.DEFAULT_NO_DESER_CLASS_NAMES.contains(expectedClasses[i]));
        }
    }

    @Test
    public void validateSubType_givenSafeStandardClass_shouldPassWithoutException() {
        JavaType safeType = typeFactory.constructType(String.class);
        try {
            validator.validateSubType((DeserializationContext) null, safeType);
        } catch (JsonMappingException e) {
            Assert.fail("Safe class validation should not have thrown JsonMappingException: " + e.getMessage());
        }
    }

    @Test
    public void validateSubType_givenSafeCustomClass_shouldPassWithoutException() {
        JavaType safeType = typeFactory.constructType(SubTypeValidatorTest.class);
        try {
            validator.validateSubType((DeserializationContext) null, safeType);
        } catch (JsonMappingException e) {
            Assert.fail("Safe custom class should not have thrown JsonMappingException: " + e.getMessage());
        }
    }

    @Test
    public void validateSubType_givenIllegalJdkClassFileHandler_shouldThrowJsonMappingException() {
        JavaType illegalType = typeFactory.constructType(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException for illegal class: java.util.logging.FileHandler");
        } catch (JsonMappingException e) {
            String expectedSnippet = "Illegal type (java.util.logging.FileHandler) to deserialize: prevented for security reasons";
            Assert.assertTrue("Exception message should contain expected text. Got: " + e.getMessage(),
                    e.getMessage().indexOf(expectedSnippet) >= 0);
        }
    }

    @Test
    public void validateSubType_givenIllegalJdkClassUnicastRemoteObject_shouldThrowJsonMappingException() {
        JavaType illegalType = typeFactory.constructType(java.rmi.server.UnicastRemoteObject.class);
        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException for illegal class: java.rmi.server.UnicastRemoteObject");
        } catch (JsonMappingException e) {
            String expectedSnippet = "Illegal type (java.rmi.server.UnicastRemoteObject) to deserialize: prevented for security reasons";
            Assert.assertTrue("Exception message should contain expected text. Got: " + e.getMessage(),
                    e.getMessage().indexOf(expectedSnippet) >= 0);
        }
    }

    @Test
    public void validateSubType_givenSpringClassExtendingAbstractPointcutAdvisor_shouldThrowJsonMappingException() throws Exception {
        Class<?> dynamicSpringClass = defineDynamicClass(
                "org.springframework.test.SamplePointcutAdvisor",
                AbstractPointcutAdvisor.class.getName());
        JavaType illegalType = typeFactory.constructType(dynamicSpringClass);

        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException for Spring class extending AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            String expectedSnippet = "Illegal type (org.springframework.test.SamplePointcutAdvisor) to deserialize: prevented for security reasons";
            Assert.assertTrue("Exception message should contain expected text. Got: " + e.getMessage(),
                    e.getMessage().indexOf(expectedSnippet) >= 0);
        }
    }

    @Test
    public void validateSubType_givenSpringClassExtendingAbstractApplicationContext_shouldThrowJsonMappingException() throws Exception {
        Class<?> dynamicSpringClass = defineDynamicClass(
                "org.springframework.test.SampleApplicationContext",
                AbstractApplicationContext.class.getName());
        JavaType illegalType = typeFactory.constructType(dynamicSpringClass);

        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException for Spring class extending AbstractApplicationContext");
        } catch (JsonMappingException e) {
            String expectedSnippet = "Illegal type (org.springframework.test.SampleApplicationContext) to deserialize: prevented for security reasons";
            Assert.assertTrue("Exception message should contain expected text. Got: " + e.getMessage(),
                    e.getMessage().indexOf(expectedSnippet) >= 0);
        }
    }

    @Test
    public void validateSubType_givenSpringClassWithDeepHierarchyMatchingAdvisor_shouldThrowJsonMappingException() throws Exception {
        Class<?> dynamicSpringClass = defineDynamicClass(
                "org.springframework.test.DeepAdvisorChild",
                IntermediatePointcutAdvisor.class.getName());
        JavaType illegalType = typeFactory.constructType(dynamicSpringClass);

        try {
            validator.validateSubType((DeserializationContext) null, illegalType);
            Assert.fail("Expected JsonMappingException for deep hierarchy Spring Advisor class");
        } catch (JsonMappingException e) {
            String expectedSnippet = "Illegal type (org.springframework.test.DeepAdvisorChild) to deserialize: prevented for security reasons";
            Assert.assertTrue("Exception message should contain expected text. Got: " + e.getMessage(),
                    e.getMessage().indexOf(expectedSnippet) >= 0);
        }
    }

    @Test
    public void validateSubType_givenSpringClassNotExtendingDangerousTypes_shouldPassWithoutException() throws Exception {
        Class<?> safeSpringClass = defineDynamicClass(
                "org.springframework.test.SafeSpringComponent",
                Object.class.getName());
        JavaType safeType = typeFactory.constructType(safeSpringClass);

        try {
            validator.validateSubType((DeserializationContext) null, safeType);
        } catch (JsonMappingException e) {
            Assert.fail("Safe Spring class should not have thrown JsonMappingException: " + e.getMessage());
        }
    }

    @Test
    public void validateSubType_givenCustomIllegalSet_shouldBlockConfiguredCustomClass() {
        Set<String> customIllegal = new HashSet<String>();
        customIllegal.add(String.class.getName());
        SubTypeValidator customValidator = new CustomSubTypeValidator(customIllegal);

        JavaType type = typeFactory.constructType(String.class);
        try {
            customValidator.validateSubType((DeserializationContext) null, type);
            Assert.fail("Expected JsonMappingException for class added to custom illegal set");
        } catch (JsonMappingException e) {
            String expectedSnippet = "Illegal type (java.lang.String) to deserialize: prevented for security reasons";
            Assert.assertTrue("Exception message should contain custom blocked type. Got: " + e.getMessage(),
                    e.getMessage().indexOf(expectedSnippet) >= 0);
        }
    }

    @Test
    public void validateSubType_givenCustomEmptyIllegalSet_shouldAllowDefaultIllegalClass() {
        Set<String> emptyIllegal = Collections.emptySet();
        SubTypeValidator customValidator = new CustomSubTypeValidator(emptyIllegal);

        JavaType type = typeFactory.constructType(java.util.logging.FileHandler.class);
        try {
            customValidator.validateSubType((DeserializationContext) null, type);
        } catch (JsonMappingException e) {
            Assert.fail("Class should be allowed when custom illegal set is empty: " + e.getMessage());
        }
    }
}