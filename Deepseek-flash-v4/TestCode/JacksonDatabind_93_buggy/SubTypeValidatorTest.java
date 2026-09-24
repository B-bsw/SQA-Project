package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.FileHandler;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext ctxt;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        validator = SubTypeValidator.instance();
    }

    @Test
    public void testSingletonReturnsSameInstance() {
        assertNotNull(SubTypeValidator.instance());
        assertSame(validator, SubTypeValidator.instance());
    }

    @Test
    public void testAllowsNonBlacklistedClass() throws Exception {
        validator.validateSubType(ctxt, mapper.getTypeFactory().constructType(String.class));
        validator.validateSubType(ctxt, mapper.getTypeFactory().constructType(ArrayList.class));
    }

    @Test
    public void testRejectsBlacklistedJdkClass() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(FileHandler.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("Expected JsonMappingException for blacklisted type");
        } catch (JsonMappingException e) {
            String msg = e.getMessage();
            assertTrue("Unexpected message: " + msg, msg.contains("Illegal type ("));
            assertTrue("Missing security reason: " + msg, msg.contains("prevented for security reasons"));
            assertTrue("Missing class name: " + msg, msg.contains(FileHandler.class.getName()));
        }
    }

    @Test
    public void testAllowsBlacklistedClassIfNamesCleared() throws Exception {
        SubTypeValidator permissive = new SubTypeValidator();
        permissive._cfgIllegalClassNames = Collections.emptySet();

        permissive.validateSubType(ctxt, mapper.getTypeFactory().constructType(FileHandler.class));
    }

    @Test
    public void testNullTypeThrowsNullPointerException() {
        try {
            validator.validateSubType(ctxt, null);
            fail("Expected NullPointerException for null type");
        } catch (NullPointerException expected) {
            // expected
        }
    }
}