package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

public class $Gson$TypesTest {

  private static class NonStaticInner<T> {
  }

  private static class StaticNested<T> {
  }

  private interface InterfaceA<T> {
  }

  private interface InterfaceB<T> extends InterfaceA<T> {
  }

  private static class ClassBase<T> {
    T baseField;
  }

  private static class ClassSub<T> extends ClassBase<List<T>> implements InterfaceB<T> {
    T subField;
  }

  private static class ClassSubRaw extends ClassBase {
  }

  private static class MethodGenericHolder {
    public <M> void genericMethod(M param) {
    }
  }

  private static final class CustomType implements Type {
  }

  @Test
  public void constructor_whenInvokedViaReflection_shouldThrowUnsupportedOperationException() throws Exception {
    Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor(new Class<?>[0]);
    constructor.setAccessible(true);
    try {
      constructor.newInstance(new Object[0]);
      Assert.fail("Expected UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      Assert.assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  @Test
  public void newParameterizedTypeWithOwner_givenValidTypes_shouldCreateCorrectInstance() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    Assert.assertNull(pt.getOwnerType());
    Assert.assertEquals(List.class, pt.getRawType());
    Assert.assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
  }

  @Test(expected = IllegalArgumentException.class)
  public void newParameterizedTypeWithOwner_givenNonStaticInnerWithoutOwner_shouldThrowIllegalArgumentException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticInner.class, new Type[] { String.class });
  }

  @Test
  public void newParameterizedTypeWithOwner_givenNonStaticInnerWithOwner_shouldSucceed() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner($Gson$TypesTest.class, NonStaticInner.class, new Type[] { String.class });
    Assert.assertEquals($Gson$TypesTest.class, pt.getOwnerType());
    Assert.assertEquals(NonStaticInner.class, pt.getRawType());
  }

  @Test(expected = NullPointerException.class)
  public void newParameterizedTypeWithOwner_givenNullTypeArgument_shouldThrowNullPointerException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { null });
  }

  @Test(expected = IllegalArgumentException.class)
  public void newParameterizedTypeWithOwner_givenPrimitiveTypeArgument_shouldThrowIllegalArgumentException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { int.class });
  }

  @Test
  public void parameterizedTypeImpl_equalsAndHashCodeAndToString() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, new Type[] { String.class, Integer.class });
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, new Type[] { String.class, Integer.class });
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    ParameterizedType ptNoArgs = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[0]);

    Assert.assertTrue(pt1.equals(pt1));
    Assert.assertTrue(pt1.equals(pt2));
    Assert.assertFalse(pt1.equals(pt3));
    Assert.assertFalse(pt1.equals(null));
    Assert.assertFalse(pt1.equals("string"));
    Assert.assertEquals(pt1.hashCode(), pt2.hashCode());

    Assert.assertEquals("java.util.Map<java.lang.String, java.lang.Integer>", pt1.toString());
    Assert.assertEquals("java.util.List", ptNoArgs.toString());
  }

  @Test
  public void arrayOf_givenType_shouldCreateGenericArrayType() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    Assert.assertEquals(String.class, arrayType.getGenericComponentType());
    Assert.assertEquals("java.lang.String[]", arrayType.toString());
  }

  @Test
  public void genericArrayTypeImpl_equalsAndHashCode() {
    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);

    Assert.assertTrue(gat1.equals(gat1));
    Assert.assertTrue(gat1.equals(gat2));
    Assert.assertFalse(gat1.equals(gat3));
    Assert.assertFalse(gat1.equals(null));
    Assert.assertFalse(gat1.equals("test"));
    Assert.assertEquals(gat1.hashCode(), gat2.hashCode());
  }

  @Test
  public void subtypeOf_givenValidBound_shouldCreateWildcardType() {
    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    Assert.assertArrayEquals(new Type[] { Number.class }, wt.getUpperBounds());
    Assert.assertArrayEquals(new Type[0], wt.getLowerBounds());
    Assert.assertEquals("? extends java.lang.Number", wt.toString());
  }

  @Test
  public void subtypeOf_givenObjectClass_shouldReturnSimpleWildcardString() {
    WildcardType wt = $Gson$Types.subtypeOf(Object.class);
    Assert.assertArrayEquals(new Type[] { Object.class }, wt.getUpperBounds());
    Assert.assertArrayEquals(new Type[0], wt.getLowerBounds());
    Assert.assertEquals("?", wt.toString());
  }

  @Test
  public void supertypeOf_givenValidBound_shouldCreateWildcardType() {
    WildcardType wt = $Gson$Types.supertypeOf(Number.class);
    Assert.assertArrayEquals(new Type[] { Object.class }, wt.getUpperBounds());
    Assert.assertArrayEquals(new Type[] { Number.class }, wt.getLowerBounds());
    Assert.assertEquals("? super java.lang.Number", wt.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void wildcardTypeImpl_givenMultipleUpperBounds_shouldThrowIllegalArgumentException() {
    $Gson$Types.subtypeOf(Number.class);
    new $Gson$TypesTest();
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    Type[] upper = new Type[] { Number.class, String.class };
    Type[] lower = new Type[0];
    try {
      Constructor<?>[] constructors = Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl").getDeclaredConstructors();
      constructors[0].setAccessible(true);
      constructors[0].newInstance(new Object[] { upper, lower });
    } catch (InvocationTargetException e) {
      if (e.getCause() instanceof IllegalArgumentException) {
        throw (IllegalArgumentException) e.getCause();
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Test(expected = IllegalArgumentException.class)
  public void wildcardTypeImpl_givenPrimitiveUpperBound_shouldThrowIllegalArgumentException() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void wildcardTypeImpl_givenPrimitiveLowerBound_shouldThrowIllegalArgumentException() {
    $Gson$Types.supertypeOf(int.class);
  }

  @Test
  public void wildcardTypeImpl_equalsAndHashCode() {
    WildcardType wt1 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt3 = $Gson$Types.supertypeOf(Number.class);
    WildcardType wt4 = $Gson$Types.supertypeOf(Number.class);

    Assert.assertTrue(wt1.equals(wt1));
    Assert.assertTrue(wt1.equals(wt2));
    Assert.assertFalse(wt1.equals(wt3));
    Assert.assertFalse(wt1.equals(null));
    Assert.assertFalse(wt1.equals("test"));
    Assert.assertTrue(wt3.equals(wt4));
    Assert.assertEquals(wt1.hashCode(), wt2.hashCode());
    Assert.assertEquals(wt3.hashCode(), wt4.hashCode());
  }

  @Test
  public void canonicalize_givenDifferentTypes_shouldCanonicalizeCorrectly() {
    Type classArray = int[].class;
    Type canonicalClassArray = $Gson$Types.canonicalize(classArray);
    Assert.assertTrue(canonicalClassArray instanceof GenericArrayType);

    Type regularClass = String.class;
    Assert.assertSame(regularClass, $Gson$Types.canonicalize(regularClass));

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    Type canonicalPt = $Gson$Types.canonicalize(pt);
    Assert.assertTrue(canonicalPt instanceof ParameterizedType);
    Assert.assertEquals(pt, canonicalPt);

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Type canonicalGat = $Gson$Types.canonicalize(gat);
    Assert.assertTrue(canonicalGat instanceof GenericArrayType);
    Assert.assertEquals(gat, canonicalGat);

    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    Type canonicalWt = $Gson$Types.canonicalize(wt);
    Assert.assertTrue(canonicalWt instanceof WildcardType);
    Assert.assertEquals(wt, canonicalWt);

    CustomType customType = new CustomType();
    Assert.assertSame(customType, $Gson$Types.canonicalize(customType));
  }

  @Test
  public void getRawType_givenClass_shouldReturnClass() {
    Assert.assertEquals(String.class, $Gson$Types.getRawType(String.class));
  }

  @Test
  public void getRawType_givenParameterizedType_shouldReturnRawClass() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    Assert.assertEquals(List.class, $Gson$Types.getRawType(pt));
  }

  @Test(expected = IllegalArgumentException.class)
  public void getRawType_givenParameterizedTypeWithNonClassRawType_shouldThrowIllegalArgumentException() {
    CustomType customRaw = new CustomType();
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, customRaw, new Type[] { String.class });
    $Gson$Types.getRawType(pt);
  }

  @Test
  public void getRawType_givenGenericArrayType_shouldReturnArrayClass() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Assert.assertEquals(String[].class, $Gson$Types.getRawType(gat));
  }

  @Test
  public void getRawType_givenTypeVariable_shouldReturnObjectClass() throws Exception {
    TypeVariable<?> tv = ClassBase.class.getTypeParameters()[0];
    Assert.assertEquals(Object.class, $Gson$Types.getRawType(tv));
  }

  @Test
  public void getRawType_givenWildcardType_shouldReturnRawTypeOfUpperBound() {
    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    Assert.assertEquals(Number.class, $Gson$Types.getRawType(wt));
  }

  @Test(expected = IllegalArgumentException.class)
  public void getRawType_givenNull_shouldThrowIllegalArgumentException() {
    $Gson$Types.getRawType(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getRawType_givenUnsupportedType_shouldThrowIllegalArgumentException() {
    $Gson$Types.getRawType(new CustomType());
  }

  @Test
  public void equal_givenObjects_shouldHandleNullsAndEquality() {
    Assert.assertTrue($Gson$Types.equal(null, null));
    Assert.assertFalse($Gson$Types.equal("a", null));
    Assert.assertFalse($Gson$Types.equal(null, "b"));
    Assert.assertTrue($Gson$Types.equal("a", "a"));
    Assert.assertFalse($Gson$Types.equal("a", "b"));
  }

  @Test
  public void equals_comparingVariousTypes() throws Exception {
    Assert.assertTrue($Gson$Types.equals(null, null));
    Assert.assertFalse($Gson$Types.equals(String.class, null));
    Assert.assertFalse($Gson$Types.equals(null, String.class));
    Assert.assertTrue($Gson$Types.equals(String.class, String.class));
    Assert.assertFalse($Gson$Types.equals(String.class, Integer.class));

    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { Integer.class });
    ParameterizedType ptWithOwner1 = $Gson$Types.newParameterizedTypeWithOwner($Gson$TypesTest.class, StaticNested.class, new Type[] { String.class });
    ParameterizedType ptWithOwner2 = $Gson$Types.newParameterizedTypeWithOwner(Object.class, StaticNested.class, new Type[] { String.class });

    Assert.assertTrue($Gson$Types.equals(pt1, pt2));
    Assert.assertFalse($Gson$Types.equals(pt1, pt3));
    Assert.assertFalse($Gson$Types.equals(pt1, List.class));
    Assert.assertFalse($Gson$Types.equals(ptWithOwner1, ptWithOwner2));

    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);
    Assert.assertTrue($Gson$Types.equals(gat1, gat2));
    Assert.assertFalse($Gson$Types.equals(gat1, gat3));
    Assert.assertFalse($Gson$Types.equals(gat1, String.class));

    WildcardType wt1 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt3 = $Gson$Types.supertypeOf(Number.class);
    Assert.assertTrue($Gson$Types.equals(wt1, wt2));
    Assert.assertFalse($Gson$Types.equals(wt1, wt3));
    Assert.assertFalse($Gson$Types.equals(wt1, Number.class));

    TypeVariable<?> tv1 = ClassBase.class.getTypeParameters()[0];
    TypeVariable<?> tv2 = ClassBase.class.getTypeParameters()[0];
    TypeVariable<?> tv3 = ClassSub.class.getTypeParameters()[0];
    Assert.assertTrue($Gson$Types.equals(tv1, tv2));
    Assert.assertFalse($Gson$Types.equals(tv1, tv3));
    Assert.assertFalse($Gson$Types.equals(tv1, String.class));

    CustomType custom1 = new CustomType();
    CustomType custom2 = new CustomType();
    Assert.assertFalse($Gson$Types.equals(custom1, custom2));
  }

  @Test
  public void hashCodeOrZero_givenNullAndNonNull() {
    Assert.assertEquals(0, $Gson$Types.hashCodeOrZero(null));
    Assert.assertEquals("abc".hashCode(), $Gson$Types.hashCodeOrZero("abc"));
  }

  @Test
  public void typeToString_givenClassAndOtherTypes() {
    Assert.assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Assert.assertEquals("java.lang.String[]", $Gson$Types.typeToString(gat));
  }

  @Test
  public void getGenericSupertype_whenToResolveMatchesRawType_shouldReturnContext() {
    Type result = $Gson$Types.getGenericSupertype(String.class, String.class, String.class);
    Assert.assertEquals(String.class, result);
  }

  @Test
  public void getGenericSupertype_whenToResolveIsInterfaceDirectOrIndirect() {
    Type resultDirect = $Gson$Types.getGenericSupertype(ClassSub.class, ClassSub.class, InterfaceB.class);
    Assert.assertTrue(resultDirect instanceof ParameterizedType);
    Assert.assertEquals(InterfaceB.class, ((ParameterizedType) resultDirect).getRawType());

    Type resultIndirect = $Gson$Types.getGenericSupertype(ClassSub.class, ClassSub.class, InterfaceA.class);
    Assert.assertTrue(resultIndirect instanceof ParameterizedType);
    Assert.assertEquals(InterfaceA.class, ((ParameterizedType) resultIndirect).getRawType());
  }

  @Test
  public void getGenericSupertype_whenToResolveIsSuperclass() {
    Type result = $Gson$Types.getGenericSupertype(ClassSub.class, ClassSub.class, ClassBase.class);
    Assert.assertTrue(result instanceof ParameterizedType);
    Assert.assertEquals(ClassBase.class, ((ParameterizedType) result).getRawType());
  }

  @Test
  public void getGenericSupertype_whenNotFound_shouldReturnToResolve() {
    Type result = $Gson$Types.getGenericSupertype(String.class, String.class, List.class);
    Assert.assertEquals(List.class, result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getSupertype_whenNotAssignable_shouldThrowIllegalArgumentException() {
    $Gson$Types.getSupertype(String.class, String.class, List.class);
  }

  @Test
  public void getArrayComponentType_givenArrayClassAndGenericArray() {
    Assert.assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    GenericArrayType gat = $Gson$Types.arrayOf(Integer.class);
    Assert.assertEquals(Integer.class, $Gson$Types.getArrayComponentType(gat));
  }

  @Test
  public void getCollectionElementType_givenVariousCollectionTypes() {
    ParameterizedType listOfStringType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    Assert.assertEquals(String.class, $Gson$Types.getCollectionElementType(listOfStringType, List.class));

    WildcardType wildcardList = $Gson$Types.subtypeOf(listOfStringType);
    Assert.assertEquals(String.class, $Gson$Types.getCollectionElementType(wildcardList, List.class));

    Assert.assertEquals(Object.class, $Gson$Types.getCollectionElementType(Collection.class, Collection.class));
  }

  @Test
  public void getMapKeyAndValueTypes_givenPropertiesAndMapTypes() {
    Type[] propTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    Assert.assertEquals(String.class, propTypes[0]);
    Assert.assertEquals(String.class, propTypes[1]);

    ParameterizedType mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, new Type[] { String.class, Integer.class });
    Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
    Assert.assertEquals(String.class, mapTypes[0]);
    Assert.assertEquals(Integer.class, mapTypes[1]);

    Type[] rawMapTypes = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
    Assert.assertEquals(Object.class, rawMapTypes[0]);
    Assert.assertEquals(Object.class, rawMapTypes[1]);
  }

  @Test
  public void resolve_givenTypeVariable_shouldResolveOrReturnSame() throws Exception {
    Type fieldType = ClassBase.class.getDeclaredField("baseField").getGenericType();
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, ClassBase.class, new Type[] { String.class });
    Type resolved = $Gson$Types.resolve(context, ClassBase.class, fieldType);
    Assert.assertEquals(String.class, resolved);

    Method method = MethodGenericHolder.class.getDeclaredMethod("genericMethod", new Class<?>[] { Object.class });
    TypeVariable<?> methodTv = method.getTypeParameters()[0];
    Type resolvedMethodTv = $Gson$Types.resolve(MethodGenericHolder.class, MethodGenericHolder.class, methodTv);
    Assert.assertSame(methodTv, resolvedMethodTv);
  }

  @Test
  public void resolve_givenClassArrayAndGenericArrayType() throws Exception {
    Type fieldType = ClassBase.class.getDeclaredField("baseField").getGenericType();
    GenericArrayType gat = $Gson$Types.arrayOf(fieldType);
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, ClassBase.class, new Type[] { String.class });

    Type resolvedGat = $Gson$Types.resolve(context, ClassBase.class, gat);
    Assert.assertEquals($Gson$Types.arrayOf(String.class), resolvedGat);

    Type unchangedGat = $Gson$Types.resolve(String.class, String.class, $Gson$Types.arrayOf(String.class));
    Assert.assertEquals($Gson$Types.arrayOf(String.class), unchangedGat);

    Type unchangedArrayClass = $Gson$Types.resolve(String.class, String.class, String[].class);
    Assert.assertEquals(String[].class, unchangedArrayClass);
  }

  @Test
  public void resolve_givenParameterizedType() throws Exception {
    Type fieldType = ClassBase.class.getDeclaredField("baseField").getGenericType();
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { fieldType });
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, ClassBase.class, new Type[] { String.class });

    Type resolvedPt = $Gson$Types.resolve(context, ClassBase.class, pt);
    ParameterizedType expected = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    Assert.assertEquals(expected, resolvedPt);

    Type unchangedPt = $Gson$Types.resolve(String.class, String.class, expected);
    Assert.assertSame(expected, unchangedPt);
  }

  @Test
  public void resolve_givenWildcardType() throws Exception {
    Type fieldType = ClassBase.class.getDeclaredField("baseField").getGenericType();
    WildcardType wtSub = $Gson$Types.subtypeOf(fieldType);
    WildcardType wtSuper = $Gson$Types.supertypeOf(fieldType);
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, ClassBase.class, new Type[] { Number.class });

    Type resolvedSub = $Gson$Types.resolve(context, ClassBase.class, wtSub);
    Assert.assertEquals($Gson$Types.subtypeOf(Number.class), resolvedSub);

    Type resolvedSuper = $Gson$Types.resolve(context, ClassBase.class, wtSuper);
    Assert.assertEquals($Gson$Types.supertypeOf(Number.class), resolvedSuper);

    WildcardType unchangedSub = $Gson$Types.subtypeOf(Number.class);
    Assert.assertSame(unchangedSub, $Gson$Types.resolve(String.class, String.class, unchangedSub));

    WildcardType unchangedSuper = $Gson$Types.supertypeOf(Number.class);
    Assert.assertSame(unchangedSuper, $Gson$Types.resolve(String.class, String.class, unchangedSuper));
  }

  @Test
  public void resolve_givenNonGenericType_shouldReturnSame() {
    CustomType custom = new CustomType();
    Assert.assertSame(custom, $Gson$Types.resolve(String.class, String.class, custom));
  }

  @Test
  public void resolve_whenContextRawDoesNotMatchDeclaredBy_shouldFallback() throws Exception {
    TypeVariable<?> tv = ClassBase.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(Object.class, Object.class, tv);
    Assert.assertSame(tv, resolved);
  }

  @Test
  public void resolveTypeVariable_whenDeclaredByRawNotParameterized_shouldReturnUnknown() throws Exception {
    TypeVariable<?> tv = ClassBase.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(ClassSubRaw.class, ClassSubRaw.class, tv);
    Assert.assertSame(tv, resolved);
  }

  @Test
  public void checkNotPrimitive_givenPrimitivesAndNonPrimitives() {
    $Gson$Types.checkNotPrimitive(String.class);
    $Gson$Types.checkNotPrimitive(List.class);
    try {
      $Gson$Types.checkNotPrimitive(int.class);
      Assert.fail("Expected IllegalArgumentException for primitive");
    } catch (IllegalArgumentException expected) {
    }
  }

  @Test
  public void serialization_forImplementedTypes_shouldSerializeAndDeserialize() throws Exception {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { String.class });
    GenericArrayType gat = $Gson$Types.arrayOf(pt);
    WildcardType wt = $Gson$Types.subtypeOf(gat);

    Type[] typesToTest = new Type[] { pt, gat, wt };
    for (int i = 0; i < typesToTest.length; i++) {
      Type original = typesToTest[i];
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(baos);
      oos.writeObject(original);
      oos.close();

      ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bais);
      Object deserialized = ois.readObject();
      ois.close();

      Assert.assertEquals(original, deserialized);
      Assert.assertEquals(original.hashCode(), deserialized.hashCode());
    }
  }
}