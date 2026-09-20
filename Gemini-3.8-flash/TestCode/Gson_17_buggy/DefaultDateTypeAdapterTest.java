package com.google.gson;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Test;

public class DefaultDateTypeAdapterTest {

  private static class CustomDateSubclass extends Date {
    private static final long serialVersionUID = 1L;
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenInvalidDateSubclass_shouldThrowIllegalArgumentException() {
    new DefaultDateTypeAdapter(CustomDateSubclass.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenInvalidDateSubclassWithFormat_shouldThrowIllegalArgumentException() {
    new DefaultDateTypeAdapter(CustomDateSubclass.class, DateFormat.getDateInstance(), DateFormat.getDateInstance());
  }

  @Test
  public void constructor_givenDateClass_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void constructor_givenTimestampClass_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void constructor_givenSqlDateClass_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void constructor_givenDatePattern_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    Assert.assertNotNull(adapter);
  }

  @Test
  public void constructor_givenDateStyle_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, DateFormat.SHORT);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void constructor_givenDateAndSqlDateStyle_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(DateFormat.SHORT, DateFormat.SHORT);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void constructor_givenExplicitClassAndStyles_shouldInitializeSuccessfully() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, DateFormat.MEDIUM, DateFormat.SHORT);
    Assert.assertNotNull(adapter);
  }

  @Test
  public void write_givenNullDate_shouldWriteJsonNull() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    adapter.write(jsonWriter, null);

    Assert.assertEquals("null", stringWriter.toString());
  }

  @Test
  public void write_givenValidDate_shouldWriteFormattedString() throws IOException {
    DateFormat enUsFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    DateFormat localFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUsFormat, localFormat);

    Date targetDate = new Date(1577836800000L); // 2020-01-01 00:00:00 GMT
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    adapter.write(jsonWriter, targetDate);

    String expected = "\"" + enUsFormat.format(targetDate) + "\"";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test(expected = JsonParseException.class)
  public void read_givenNonStringJsonToken_shouldThrowJsonParseException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    JsonReader reader = new JsonReader(new StringReader("123456789"));

    adapter.read(reader);
  }

  @Test(expected = JsonParseException.class)
  public void read_givenBooleanJsonToken_shouldThrowJsonParseException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    JsonReader reader = new JsonReader(new StringReader("true"));

    adapter.read(reader);
  }

  @Test
  public void read_givenDateClassString_shouldReturnDateInstance() throws IOException {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, format, format);
    Date expectedDate = new Date(1000000000L);
    String dateString = "\"" + format.format(expectedDate) + "\"";

    JsonReader reader = new JsonReader(new StringReader(dateString));
    Date actualDate = adapter.read(reader);

    Assert.assertEquals(Date.class, actualDate.getClass());
    Assert.assertEquals(format.format(expectedDate), format.format(actualDate));
  }

  @Test
  public void read_givenTimestampClassString_shouldReturnTimestampInstance() throws IOException {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, format, format);
    Date expectedDate = new Date(1000000000L);
    String dateString = "\"" + format.format(expectedDate) + "\"";

    JsonReader reader = new JsonReader(new StringReader(dateString));
    Date actualDate = adapter.read(reader);

    Assert.assertEquals(Timestamp.class, actualDate.getClass());
    Assert.assertEquals(expectedDate.getTime(), actualDate.getTime());
  }

  @Test
  public void read_givenSqlDateClassString_shouldReturnSqlDateInstance() throws IOException {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, format, format);
    java.sql.Date expectedDate = new java.sql.Date(1000000000L);
    String dateString = "\"" + format.format(expectedDate) + "\"";

    JsonReader reader = new JsonReader(new StringReader(dateString));
    Date actualDate = adapter.read(reader);

    Assert.assertEquals(java.sql.Date.class, actualDate.getClass());
  }

  @Test
  public void read_givenStringMatchingEnUsFormatFallback_shouldParseSuccessfully() throws IOException {
    DateFormat enUsFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.US);
    DateFormat localFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.GERMANY);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUsFormat, localFormat);

    Date expectedDate = new Date(1577836800000L);
    String dateString = "\"" + enUsFormat.format(expectedDate) + "\"";

    JsonReader reader = new JsonReader(new StringReader(dateString));
    Date actualDate = adapter.read(reader);

    Assert.assertEquals(enUsFormat.format(expectedDate), enUsFormat.format(actualDate));
  }

  @Test
  public void read_givenIso8601FormattedStringFallback_shouldParseSuccessfully() throws IOException {
    DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, format, format);

    String iso8601String = "\"1970-01-01T00:00:00Z\"";
    JsonReader reader = new JsonReader(new StringReader(iso8601String));
    Date actualDate = adapter.read(reader);

    Assert.assertNotNull(actualDate);
    Assert.assertEquals(0L, actualDate.getTime());
  }

  @Test(expected = JsonSyntaxException.class)
  public void read_givenInvalidDateString_shouldThrowJsonSyntaxException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    JsonReader reader = new JsonReader(new StringReader("\"invalid-date-string\""));

    adapter.read(reader);
  }

  @Test
  public void toString_givenAdapterInstance_shouldReturnExpectedFormatString() {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, format, format);

    String result = adapter.toString();

    Assert.assertEquals("DefaultDateTypeAdapter(SimpleDateFormat)", result);
  }
}