package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Comprehensive Unit Tests for {@link GeneratorBase}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class GeneratorBaseTest {

    @Test
    public void featureManagement_givenFeatures_shouldEnableAndDisable() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act & Assert
        assertTrue(gen instanceof GeneratorBase);
        GeneratorBase baseGen = (GeneratorBase) gen;

        assertTrue(baseGen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        baseGen.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertFalse(baseGen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));

        baseGen.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertTrue(baseGen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));

        baseGen.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        assertFalse(baseGen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));

        baseGen.close();
        assertTrue(baseGen.isClosed());
    }

    @Test
    public void contextManagement_shouldTrackDepth() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act
        assertTrue(gen.getOutputContext().inRoot());
        gen.writeStartObject();
        assertTrue(gen.getOutputContext().inObject());
        gen.writeFieldName("items");
        gen.writeStartArray();
        assertTrue(gen.getOutputContext().inArray());
        gen.writeNumber(1);
        gen.writeEndArray();
        assertTrue(gen.getOutputContext().inObject());
        gen.writeEndObject();
        assertTrue(gen.getOutputContext().inRoot());

        gen.close();
    }
}
