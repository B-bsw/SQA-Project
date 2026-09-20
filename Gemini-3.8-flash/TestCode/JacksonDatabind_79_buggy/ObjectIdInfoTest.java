package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import org.junit.Assert;
import org.junit.Test;

public class ObjectIdInfoTest {

    private static class DummyGenerator extends ObjectIdGenerator<Object> {
        private static final long serialVersionUID = 1L;

        public Class<?> getScope() {
            return Object.class;
        }

        public boolean canUseFor(ObjectIdGenerator<?> gen) {
            return false;
        }

        public ObjectIdGenerator<Object> forScope(Class<?> scope) {
            return this;
        }

        public ObjectIdGenerator<Object> newForSerialization(Object context) {
            return this;
        }

        public IdKey key(Object key) {
            return null;
        }

        public Object generateId(Object forPojo) {
            return null;
        }
    }

    private static class CustomResolver implements ObjectIdResolver {
        public void bindItem(ObjectIdGenerator.IdKey id, Object pojo) {
        }

        public Object resolveId(ObjectIdGenerator.IdKey id) {
            return null;
        }

        public ObjectIdResolver newForDeserialization(Object context) {
            return this;
        }

        public boolean canUseFor(ObjectIdResolver resolverType) {
            return false;
        }
    }

    @Test
    public void constructor_givenPropertyNameScopeGeneratorAndResolver_shouldInitializeProperly() {
        // Arrange
        PropertyName propName = new PropertyName("id");
        Class<?> scope = String.class;
        Class<DummyGenerator> gen = DummyGenerator.class;
        Class<CustomResolver> resolver = CustomResolver.class;

        // Act
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, resolver);

        // Assert
        Assert.assertEquals(propName, info.getPropertyName());
        Assert.assertEquals(scope, info.getScope());
        Assert.assertEquals(gen, info.getGeneratorType());
        Assert.assertEquals(resolver, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void constructor_givenNullResolverInFourArgConstructor_shouldDefaultToSimpleObjectIdResolver() {
        // Arrange
        PropertyName propName = new PropertyName("testId");
        Class<?> scope = Integer.class;
        Class<DummyGenerator> gen = DummyGenerator.class;

        // Act
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, null);

        // Assert
        Assert.assertEquals(propName, info.getPropertyName());
        Assert.assertEquals(scope, info.getScope());
        Assert.assertEquals(gen, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void constructor_givenPropertyNameScopeAndGenerator_shouldInitializeWithDefaultResolverAndAlwaysAsIdFalse() {
        // Arrange
        PropertyName propName = new PropertyName("itemId");
        Class<?> scope = Long.class;
        Class<DummyGenerator> gen = DummyGenerator.class;

        // Act
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen);

        // Assert
        Assert.assertEquals(propName, info.getPropertyName());
        Assert.assertEquals(scope, info.getScope());
        Assert.assertEquals(gen, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void constructor_givenStringNameScopeAndGenerator_shouldInitializeWithPropertyNameAndDefaultResolver() {
        // Arrange
        String nameString = "entityId";
        Class<?> scope = Object.class;
        Class<DummyGenerator> gen = DummyGenerator.class;

        // Act
        ObjectIdInfo info = new ObjectIdInfo(nameString, scope, gen);

        // Assert
        Assert.assertNotNull(info.getPropertyName());
        Assert.assertEquals("entityId", info.getPropertyName().getSimpleName());
        Assert.assertEquals(scope, info.getScope());
        Assert.assertEquals(gen, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void constructor_givenProtectedFourArgConstructor_shouldSetAlwaysAsIdTrue() {
        // Arrange
        PropertyName propName = new PropertyName("customProp");
        Class<?> scope = Double.class;
        Class<DummyGenerator> gen = DummyGenerator.class;

        // Act
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, true);

        // Assert
        Assert.assertEquals(propName, info.getPropertyName());
        Assert.assertEquals(scope, info.getScope());
        Assert.assertEquals(gen, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertTrue(info.getAlwaysAsId());
    }

    @Test
    public void constructor_givenProtectedFiveArgConstructorWithNullResolver_shouldDefaultToSimpleObjectIdResolver() {
        // Arrange
        PropertyName propName = new PropertyName("customProp");
        Class<?> scope = Double.class;
        Class<DummyGenerator> gen = DummyGenerator.class;

        // Act
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, true, null);

        // Assert
        Assert.assertEquals(propName, info.getPropertyName());
        Assert.assertEquals(scope, info.getScope());
        Assert.assertEquals(gen, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertTrue(info.getAlwaysAsId());
    }

    @Test
    public void constructor_givenAllNullValues_shouldPermitNullFieldsExceptResolver() {
        // Arrange & Act
        ObjectIdInfo info = new ObjectIdInfo((PropertyName) null, null, null, null);

        // Assert
        Assert.assertNull(info.getPropertyName());
        Assert.assertNull(info.getScope());
        Assert.assertNull(info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void withAlwaysAsId_givenSameStateFalse_shouldReturnSameInstance() {
        // Arrange
        PropertyName propName = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(propName, Object.class, DummyGenerator.class, false);

        // Act
        ObjectIdInfo result = info.withAlwaysAsId(false);

        // Assert
        Assert.assertSame(info, result);
    }

    @Test
    public void withAlwaysAsId_givenSameStateTrue_shouldReturnSameInstance() {
        // Arrange
        PropertyName propName = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(propName, Object.class, DummyGenerator.class, true);

        // Act
        ObjectIdInfo result = info.withAlwaysAsId(true);

        // Assert
        Assert.assertSame(info, result);
    }

    @Test
    public void withAlwaysAsId_givenDifferentStateFalseToTrue_shouldReturnNewInstanceWithUpdatedState() {
        // Arrange
        PropertyName propName = new PropertyName("id");
        Class<?> scope = String.class;
        Class<DummyGenerator> gen = DummyGenerator.class;
        Class<CustomResolver> resolver = CustomResolver.class;
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, resolver);

        // Act
        ObjectIdInfo result = info.withAlwaysAsId(true);

        // Assert
        Assert.assertNotSame(info, result);
        Assert.assertTrue(result.getAlwaysAsId());
        Assert.assertEquals(propName, result.getPropertyName());
        Assert.assertEquals(scope, result.getScope());
        Assert.assertEquals(gen, result.getGeneratorType());
        Assert.assertEquals(resolver, result.getResolverType());
    }

    @Test
    public void withAlwaysAsId_givenDifferentStateTrueToFalse_shouldReturnNewInstanceWithUpdatedState() {
        // Arrange
        PropertyName propName = new PropertyName("id");
        Class<?> scope = String.class;
        Class<DummyGenerator> gen = DummyGenerator.class;
        Class<CustomResolver> resolver = CustomResolver.class;
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, true, resolver);

        // Act
        ObjectIdInfo result = info.withAlwaysAsId(false);

        // Assert
        Assert.assertNotSame(info, result);
        Assert.assertFalse(result.getAlwaysAsId());
        Assert.assertEquals(propName, result.getPropertyName());
        Assert.assertEquals(scope, result.getScope());
        Assert.assertEquals(gen, result.getGeneratorType());
        Assert.assertEquals(resolver, result.getResolverType());
    }

    @Test
    public void toString_givenNonNullScopeAndNonNullGenerator_shouldFormatProperly() {
        // Arrange
        PropertyName propName = new PropertyName("testField");
        Class<?> scope = String.class;
        Class<DummyGenerator> gen = DummyGenerator.class;
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, gen, true);

        // Act
        String result = info.toString();

        // Assert
        String expected = "ObjectIdInfo: propName=" + propName
                + ", scope=" + scope.getName()
                + ", generatorType=" + gen.getName()
                + ", alwaysAsId=true";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void toString_givenNullScopeAndNullGenerator_shouldFormatWithNullLiterals() {
        // Arrange
        ObjectIdInfo info = new ObjectIdInfo((PropertyName) null, null, null, false);

        // Act
        String result = info.toString();

        // Assert
        String expected = "ObjectIdInfo: propName=null, scope=null, generatorType=null, alwaysAsId=false";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void toString_givenNullScopeAndNonNullGenerator_shouldFormatScopeAsNull() {
        // Arrange
        PropertyName propName = new PropertyName("idOnly");
        Class<DummyGenerator> gen = DummyGenerator.class;
        ObjectIdInfo info = new ObjectIdInfo(propName, null, gen, false);

        // Act
        String result = info.toString();

        // Assert
        String expected = "ObjectIdInfo: propName=" + propName
                + ", scope=null"
                + ", generatorType=" + gen.getName()
                + ", alwaysAsId=false";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void toString_givenNonNullScopeAndNullGenerator_shouldFormatGeneratorAsNull() {
        // Arrange
        PropertyName propName = new PropertyName("idOnly");
        Class<?> scope = Long.class;
        ObjectIdInfo info = new ObjectIdInfo(propName, scope, null, false);

        // Act
        String result = info.toString();

        // Assert
        String expected = "ObjectIdInfo: propName=" + propName
                + ", scope=" + scope.getName()
                + ", generatorType=null"
                + ", alwaysAsId=false";
        Assert.assertEquals(expected, result);
    }
}