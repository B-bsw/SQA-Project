package com.google.gson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class DefaultDateTypeAdapterTest {

  private DefaultDateTypeAdapter adapter;
  private DefaultDateTypeAdapter adapterTimestamp;
  private DefaultDateTypeAdapter adapterSqlDate;
  private DefaultDateTypeAdapter adapterPattern;
  private DefaultDateTypeAdapter adapterStyle;
  private DefaultDateTypeAdapter adapterDateTimeStyle;
  private DefaultDateTypeAdapter adapterTypeStyle;

  @Before
  public void setUp() {
    adapter = new DefaultDateTypeAdapter(Date.class);
    adapterTimestamp = new DefaultDateTypeAdapter(Timestamp.class);
    adapterSqlDate = new DefaultDateTypeAdapter(java.sql.Date.class);
    adapterPattern = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    adapterStyle = new DefaultDateTypeAdapter(Date.class, DateFormat.SHORT);
    adapterDateTimeStyle = new DefaultDateTypeAdapter(DateFormat.SHORT, DateFormat.MEDIUM);
    adapterTypeStyle = new DefaultDateTypeAdapter(Timestamp.class, DateFormat.LONG, DateFormat.LONG);
  }

  @Test
  public void testConstructorValidTypes() {
    new DefaultDateTypeAdapter(Date.class);
    new DefaultDateTypeAdapter(Timestamp.class);
    new DefaultDateTypeAdapter(java.sql.Date.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorInvalidType() {
    new DefaultDateTypeAdapter(java.util.Calendar.class);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorNullType() {
    new DefaultDateTypeAdapter(null);
  }

  @Test
  public void testWriteNullValue() throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    adapter.write(jsonWriter, null);
    jsonWriter.flush();
    assertEquals("null", writer.toString());
  }

  @Test
  public void testWriteDate() throws IOException {
    Date date = new Date(0L);
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    adapter.write(jsonWriter, date);
    jsonWriter.flush();
    assertNotNull(writer.toString());
    assertTrue(writer.toString().length() > 0);
  }

  @Test
  public void testReadNullToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("null"));
    reader.nextNull();
    try {
      adapter.read(reader);
      fail("Expected JsonParseException");
    } catch (JsonParseException e) {
      assertEquals("The date should be a string value", e.getMessage());
    }
  }

  @Test
  public void testReadNumberToken() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("123"));
    try {
      adapter.read(reader);
      fail("Expected JsonParseException");
    } catch (JsonParseException e) {
      assertEquals("The date should be a string value", e.getMessage());
    }
  }

  @Test
  public void testReadLocalFormatDate() throws IOException {
    Date date = new Date(946684800000L); // 2000-01-01
    DateFormat format = new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US);
    String dateString = format.format(date);
    JsonReader reader = new JsonReader(new StringReader("\"" + dateString + "\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadEnUsFormatDate() throws IOException {
    DateFormat format = new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US);
    Date date = new Date(946684800000L);
    JsonReader reader = new JsonReader(new StringReader("\"" + format.format(date) + "\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadISODate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
    assertEquals(1262304000000L, result.getTime());
  }

  @Test
  public void testReadInvalidDateThrows() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"invalid-date\""));
    try {
      adapter.read(reader);
      fail("Expected JsonSyntaxException");
    } catch (JsonSyntaxException e) {
      assertNotNull(e.getCause());
    }
  }

  @Test
  public void testReadTimestamp() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000Z\""));
    Date result = adapterTimestamp.read(reader);
    assertTrue(result instanceof Timestamp);
    assertEquals(1262304000000L, result.getTime());
  }

  @Test
  public void testReadSqlDate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000Z\""));
    Date result = adapterSqlDate.read(reader);
    assertTrue(result instanceof java.sql.Date);
    assertEquals(1262304000000L, result.getTime());
  }

  @Test
  public void testReadBeforeEpoch() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"1960-01-01T00:00:00.000Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
    assertTrue(result.getTime() < 0);
  }

  @Test
  public void testWriteAndReadRoundTrip() throws IOException {
    Date date = new Date(1262304000000L);
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    adapter.write(jsonWriter, date);
    jsonWriter.flush();
    String json = writer.toString();
    JsonReader reader = new JsonReader(new StringReader(json));
    Date result = adapter.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadDateExactlyAtBoundary() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"1970-01-01T00:00:00.000Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
    assertEquals(0L, result.getTime());
  }

  @Test
  public void testReadLeapYearDate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2012-02-29T00:00:00.000Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadNonLeapYearInvalidDate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2011-02-29T00:00:00.000Z\""));
    try {
      adapter.read(reader);
      fail("Expected JsonSyntaxException");
    } catch (JsonSyntaxException e) {
      assertNotNull(e.getCause());
    }
  }

  @Test
  public void testToString() {
    String result = adapter.toString();
    assertTrue(result.contains("DefaultDateTypeAdapter"));
    assertTrue(result.contains("SimpleDateFormat"));
  }

  @Test
  public void testReadEmptyString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"\""));
    try {
      adapter.read(reader);
      fail("Expected JsonSyntaxException");
    } catch (JsonSyntaxException e) {
      assertNotNull(e.getCause());
    }
  }

  @Test
  public void testReadMinusEpochTimestamp() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"1969-12-31T23:59:59.999Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
    assertTrue(result.getTime() < 0);
  }

  @Test
  public void testReadMaxDate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"+294247-01-10T04:00:54.775Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadMinDate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"-292278994-08-17T07:12:55.807Z\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadTimezoneOffsetDate() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000+02:00\""));
    Date result = adapter.read(reader);
    assertNotNull(result);
    assertEquals(1262296800000L, result.getTime());
  }

  @Test
  public void testReadLocalTimeZoneDate() throws IOException {
    TimeZone defaultTimeZone = TimeZone.getDefault();
    try {
      TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
      JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000-05:00\""));
      Date result = adapter.read(reader);
      assertNotNull(result);
      assertEquals(1262311200000L, result.getTime());
    } finally {
      TimeZone.setDefault(defaultTimeZone);
    }
  }

  @Test
  public void testReadWithPatternAdapter() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01\""));
    Date result = adapterPattern.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadWithStyleAdapter() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"1/1/10\""));
    Date result = adapterStyle.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadWithDateTimeStyleAdapter() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"1/1/10 12:00:00 AM\""));
    Date result = adapterDateTimeStyle.read(reader);
    assertNotNull(result);
  }

  @Test
  public void testReadWithTypeStyleAdapter() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"January 1, 2010 12:00:00 AM UTC\""));
    Date result = adapterTypeStyle.read(reader);
    assertTrue(result instanceof Timestamp);
    assertNotNull(result);
  }

  @Test
  public void testWriteSqlDate() throws IOException {
    java.sql.Date date = java.sql.Date.valueOf("2010-01-01");
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    adapterSqlDate.write(jsonWriter, date);
    jsonWriter.flush();
    assertNotNull(writer.toString());
  }

  @Test
  public void testWriteTimestamp() throws IOException {
    Timestamp timestamp = new Timestamp(1262304000000L);
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    adapterTimestamp.write(jsonWriter, timestamp);
    jsonWriter.flush();
    assertNotNull(writer.toString());
  }

  @Test
  public void testAllAdaptersReadValidISO() throws IOException {
    DefaultDateTypeAdapter[] adapters = {adapter, adapterTimestamp, adapterSqlDate};
    for (DefaultDateTypeAdapter a : adapters) {
      JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000Z\""));
      Date result = a.read(reader);
      assertNotNull(result);
    }
  }

  @Test
  public void testAllAdaptersWriteNull() throws IOException {
    DefaultDateTypeAdapter[] adapters = {adapter, adapterTimestamp, adapterSqlDate};
    for (DefaultDateTypeAdapter a : adapters) {
      StringWriter writer = new StringWriter();
      JsonWriter jsonWriter = new JsonWriter(writer);
      a.write(jsonWriter, null);
      jsonWriter.flush();
      assertEquals("null", writer.toString());
    }
  }

  @Test
  public void testReadTimestampWithNonMillisecondPrecision() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00Z\""));
    Date result = adapterTimestamp.read(reader);
    assertNotNull(result);
    assertEquals(1262304000000L, result.getTime());
  }

  @Test
  public void testReadSqlDateWithTime() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"2010-01-01T00:00:00.000Z\""));
    Date result = adapterSqlDate.read(reader);
    assertNotNull(result);
    assertEquals("2010-01-01", result.toString());
  }
}