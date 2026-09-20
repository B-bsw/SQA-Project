package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyFilter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

public class AnyGetterWriterTest
{
    private AnnotatedMember _mockAccessor;
    private MapSerializer _mockMapSerializer;
    private BeanProperty _mockProperty;
    private JsonGenerator _mockGenerator;
    private SerializerProvider _mockProvider;
    private PropertyFilter _mockFilter;

    private Object _bean;

    @Before
    public void setUp()
    {
        _mockAccessor = mock(AnnotatedMember.class);
        _mockMapSerializer = mock(MapSerializer.class);
        _mockProperty = mock(BeanProperty.class);
        _mockGenerator = mock(JsonGenerator.class);
        _mockProvider = mock(SerializerProvider.class);
        _mockFilter = mock(PropertyFilter.class);

        _bean = new Object();
    }

    // ------------------------------------------------------------
    // getAndSerialize() tests
    // ------------------------------------------------------------

    @Test
    public void testGetAndSerialize_nullValue_noSerializationCalled() throws Exception
    {
        when(_mockAccessor.getValue(_bean)).thenReturn(null);

        AnyGetterWriter writer = new AnyGetterWriter(_mockProperty, _mockAccessor, _mockMapSerializer);
        writer.getAndSerialize(_bean, _mockGenerator, _mockProvider);

        verify(_mockMapSerializer, never())
                .serializeFields(any(Map.class), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndSerialize_notMapValue_throwsException() throws Exception
    {
        when(_mockAccessor.getValue(_bean)).thenReturn("not a map");
        when(_mockAccessor.getName()).thenReturn("anyGetter");

        AnyGetterWriter writer = new AnyGetterWriter(_mockProperty, _mockAccessor, _mockMapSerializer);
        writer.getAndSerialize(_bean, _mockGenerator, _mockProvider);
    }

    @Test
    public void testGetAndSerialize_mapValue_withMapSerializer_callsSerializeFields() throws Exception
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", "value");