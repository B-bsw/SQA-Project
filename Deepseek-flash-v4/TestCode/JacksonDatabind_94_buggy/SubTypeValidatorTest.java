package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    @Test
    public void testSingletonInstance() {
        SubTypeValidator first = SubTypeValidator.instance();
        SubTypeValidator second = SubTypeValidator.instance();
        assertNotNull(first);
        assertSame(first, second);
    }

    @Test
    public void testAllowsPlainClass() throws Exception {
        SubTypeValidator validator = new SubTypeValidator();
        validator.validateSubType(null,
                TypeFactory.defaultInstance().constructType(String.class));
    }

    @Test
    public void testAllowsInterface() throws Exception {
        SubTypeValidator validator = new SubTypeValidator();
        validator.validateSubType(null,
                TypeFactory.defaultInstance().constructType(List.class));
    }

    @Test
    public void testRejectsDefaultIllegalType() throws Exception {
        SubTypeValidator validator = new SubTypeValidator();
        JavaType type = TypeFactory.defaultInstance()
                .constructType(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType(null, type);
            fail("Expected JsonMappingException for default illegal type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    @Test
    public void testRejectsSpringApplicationContextIfPresent() throws Exception {
        Class<?> springClass;
        try {
            springClass = Class.forName(
                    "org.springframework.context.support.FileSystemXmlApplicationContext");
        } catch (ClassNotFoundException e) {
            return;
        }
        SubTypeValidator validator = new SubTypeValidator();
        JavaType type = TypeFactory.defaultInstance().constructType(springClass);
        try {
            validator.validateSubType(null, type);
            fail("Expected JsonMappingException for Spring ApplicationContext");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("prevented for security reasons"));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testNullTypeThrowsNullPointerException() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }
}