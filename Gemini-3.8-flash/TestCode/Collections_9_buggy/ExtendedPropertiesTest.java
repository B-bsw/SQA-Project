package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Vector;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;

    @Before
    public void setUp() {
        this.props = new ExtendedProperties();
    }

    @Test
    public void defaultConstructor_shouldInitializeEmptyProperties() {
        // Arrange & Act
        ExtendedProperties p = new ExtendedProperties();

        // Assert
        Assert.assertNotNull(p);
        Assert.assertTrue(p.isEmpty());
        Assert.assertEquals(0, p.size());
    }

    @Test
    public void addPropertyAndGetString_givenBasicProperty_shouldRetrieveValue() {
        // Arrange & Act
        this.props.addProperty("app.name", "MyApp");

        // Assert
        Assert.assertEquals("MyApp", this.props.getString("app.name"));
        Assert.assertEquals("MyApp", this.props.getProperty("app.name"));
    }

    @Test
    public void addProperty_givenMultipleValuesForSameKey_shouldStoreAsVectorOrList() {
        // Arrange
        this.props.addProperty("items", "item1");
        this.props.addProperty("items", "item2");

        // Act
        Vector v = this.props.getVector("items");

        // Assert
        Assert.assertNotNull(v);
        Assert.assertEquals(2, v.size());
        Assert.assertEquals("item1", v.get(0));
        Assert.assertEquals("item2", v.get(1));
    }

    @Test
    public void getInt_givenValidIntegerProperty_shouldReturnIntValue() {
        // Arrange
        this.props.setProperty("server.port", "8080");

        // Act
        int port = this.props.getInt("server.port");

        // Assert
        Assert.assertEquals(8080, port);
    }

    @Test
    public void getInt_givenDefaultValue_shouldReturnDefaultWhenMissing() {
        // Arrange & Act
        int missingPort = this.props.getInt("missing.port", 9090);

        // Assert
        Assert.assertEquals(9090, missingPort);
    }

    @Test
    public void getBoolean_givenValidBooleanProperty_shouldReturnBooleanValue() {
        // Arrange
        this.props.setProperty("feature.enabled", "true");
        this.props.setProperty("feature.disabled", "false");

        // Act & Assert
        Assert.assertTrue(this.props.getBoolean("feature.enabled"));
        Assert.assertFalse(this.props.getBoolean("feature.disabled"));
        Assert.assertTrue(this.props.getBoolean("missing.feature", true));
    }

    @Test
    public void containsKey_givenKey_shouldReturnTrueIfExists() {
        // Arrange
        this.props.setProperty("test.key", "val");

        // Act & Assert
        Assert.assertTrue(this.props.containsKey("test.key"));
        Assert.assertFalse(this.props.containsKey("unKnown"));
    }

    @Test
    public void clearProperty_givenExistingKey_shouldRemoveProperty() {
        // Arrange
        this.props.setProperty("removable", "temp");

        // Act
        this.props.clearProperty("removable");

        // Assert
        Assert.assertFalse(this.props.containsKey("removable"));
        Assert.assertNull(this.props.getProperty("removable"));
    }

    @Test
    public void loadAndSave_givenPropertyStream_shouldRoundTrip() throws Exception {
        // Arrange
        String propText = "key1 = value1\nkey2 = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(propText.getBytes("UTF-8"));

        // Act
        this.props.load(in);

        // Assert
        Assert.assertEquals("value1", this.props.getString("key1"));
        Assert.assertEquals("value2", this.props.getString("key2"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.props.save(out, "Header Comment");
        String savedText = new String(out.toByteArray(), "UTF-8");
        Assert.assertTrue(savedText.contains("key1"));
        Assert.assertTrue(savedText.contains("value1"));
    }

    @Test
    public void combine_givenAnotherExtendedProperties_shouldMerge() {
        // Arrange
        this.props.setProperty("k1", "v1");
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("k2", "v2");

        // Act
        this.props.combine(other);

        // Assert
        Assert.assertEquals("v1", this.props.getString("k1"));
        Assert.assertEquals("v2", this.props.getString("k2"));
    }

    @Test
    public void subset_givenPrefix_shouldReturnSubProperties() {
        // Arrange
        this.props.setProperty("db.host", "localhost");
        this.props.setProperty("db.port", "5432");
        this.props.setProperty("app.env", "prod");

        // Act
        ExtendedProperties dbProps = this.props.subset("db");

        // Assert
        Assert.assertNotNull(dbProps);
        Assert.assertEquals("localhost", dbProps.getString("host"));
        Assert.assertEquals("5432", dbProps.getString("port"));
        Assert.assertFalse(dbProps.containsKey("app.env"));
    }
}
